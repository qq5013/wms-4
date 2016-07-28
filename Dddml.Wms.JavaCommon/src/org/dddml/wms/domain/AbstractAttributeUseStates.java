package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.ApplicationContext;

public abstract class AbstractAttributeUseStates implements AttributeUseStates
{
    protected AttributeUseStateDao getAttributeUseStateDao()
    {
        return (AttributeUseStateDao)ApplicationContext.current.get("AttributeUseStateDao");
    }

    private AttributeSetState attributeSetState;

    private Map<AttributeSetAttributeUseId, AttributeUseState> loadedAttributeUseStates = new HashMap<AttributeSetAttributeUseId, AttributeUseState>();

    private List<AttributeUseState> removedAttributeUseStates = new ArrayList<AttributeUseState>();

    protected Iterable<AttributeUseState> getLoadedAttributeUseStates() {
        return this.loadedAttributeUseStates.values();
    }

    private Iterable<AttributeUseState> innerIterable;

    protected Iterable<AttributeUseState> getInnerIterable()
    {
        if (innerIterable == null)
        {
            innerIterable = getAttributeUseStateDao().findByAttributeSetId(attributeSetState.getAttributeSetId());
        }
        return innerIterable;
    }

    public AbstractAttributeUseStates(AttributeSetState outerState)
    {
        this.attributeSetState = outerState;
    }

    @Override
    public Iterator<AttributeUseState> iterator() {
        return getInnerIterable().iterator();
    }

    public AttributeUseState get(String attributeId)
    {
        AttributeSetAttributeUseId globalId = new AttributeSetAttributeUseId(attributeSetState.getAttributeSetId(), attributeId);
        if (loadedAttributeUseStates.containsKey(globalId)) {
            return loadedAttributeUseStates.get(globalId);
        }
        AttributeUseState state = getAttributeUseStateDao().get(globalId);
        loadedAttributeUseStates.put(globalId, state);
        return state;
    }

    public void remove(AttributeUseState state)
    {
        this.removedAttributeUseStates.add(state);
    }

    public void addToSave(AttributeUseState state)
    {
        this.loadedAttributeUseStates.put(state.getAttributeSetAttributeUseId(), state);
    }

    //region Saveable Implements

    public void save ()
    {
        for (AttributeUseState s : this.getLoadedAttributeUseStates()) {
            getAttributeUseStateDao().save(s);
        }
        for (AttributeUseState s : this.removedAttributeUseStates) {
            getAttributeUseStateDao().delete(s);
        }
    }

    //endregion

}


