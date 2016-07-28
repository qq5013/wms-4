package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.ApplicationContext;

public abstract class AbstractAttributeValueStates implements AttributeValueStates
{
    protected AttributeValueStateDao getAttributeValueStateDao()
    {
        return (AttributeValueStateDao)ApplicationContext.current.get("AttributeValueStateDao");
    }

    private AttributeState attributeState;

    private Map<AttributeValueId, AttributeValueState> loadedAttributeValueStates = new HashMap<AttributeValueId, AttributeValueState>();

    private List<AttributeValueState> removedAttributeValueStates = new ArrayList<AttributeValueState>();

    protected Iterable<AttributeValueState> getLoadedAttributeValueStates() {
        return this.loadedAttributeValueStates.values();
    }

    private Iterable<AttributeValueState> innerIterable;

    protected Iterable<AttributeValueState> getInnerIterable()
    {
        if (innerIterable == null)
        {
            innerIterable = getAttributeValueStateDao().findByAttributeId(attributeState.getAttributeId());
        }
        return innerIterable;
    }

    public AbstractAttributeValueStates(AttributeState outerState)
    {
        this.attributeState = outerState;
    }

    @Override
    public Iterator<AttributeValueState> iterator() {
        return getInnerIterable().iterator();
    }

    public AttributeValueState get(String value)
    {
        AttributeValueId globalId = new AttributeValueId(attributeState.getAttributeId(), value);
        if (loadedAttributeValueStates.containsKey(globalId)) {
            return loadedAttributeValueStates.get(globalId);
        }
        AttributeValueState state = getAttributeValueStateDao().get(globalId);
        loadedAttributeValueStates.put(globalId, state);
        return state;
    }

    public void remove(AttributeValueState state)
    {
        this.removedAttributeValueStates.add(state);
    }

    public void addToSave(AttributeValueState state)
    {
        this.loadedAttributeValueStates.put(state.getAttributeValueId(), state);
    }

    //region Saveable Implements

    public void save ()
    {
        for (AttributeValueState s : this.getLoadedAttributeValueStates()) {
            getAttributeValueStateDao().save(s);
        }
        for (AttributeValueState s : this.removedAttributeValueStates) {
            getAttributeValueStateDao().delete(s);
        }
    }

    //endregion

}


