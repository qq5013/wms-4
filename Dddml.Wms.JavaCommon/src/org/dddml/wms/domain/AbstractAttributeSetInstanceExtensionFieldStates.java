package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.ApplicationContext;

public abstract class AbstractAttributeSetInstanceExtensionFieldStates implements AttributeSetInstanceExtensionFieldStates
{
    protected AttributeSetInstanceExtensionFieldStateDao getAttributeSetInstanceExtensionFieldStateDao()
    {
        return (AttributeSetInstanceExtensionFieldStateDao)ApplicationContext.current.get("AttributeSetInstanceExtensionFieldStateDao");
    }

    private AttributeSetInstanceExtensionFieldGroupState attributeSetInstanceExtensionFieldGroupState;

    private Map<AttributeSetInstanceExtensionFieldId, AttributeSetInstanceExtensionFieldState> loadedAttributeSetInstanceExtensionFieldStates = new HashMap<AttributeSetInstanceExtensionFieldId, AttributeSetInstanceExtensionFieldState>();

    private List<AttributeSetInstanceExtensionFieldState> removedAttributeSetInstanceExtensionFieldStates = new ArrayList<AttributeSetInstanceExtensionFieldState>();

    protected Iterable<AttributeSetInstanceExtensionFieldState> getLoadedAttributeSetInstanceExtensionFieldStates() {
        return this.loadedAttributeSetInstanceExtensionFieldStates.values();
    }

    private Iterable<AttributeSetInstanceExtensionFieldState> innerIterable;

    protected Iterable<AttributeSetInstanceExtensionFieldState> getInnerIterable()
    {
        if (innerIterable == null)
        {
            innerIterable = getAttributeSetInstanceExtensionFieldStateDao().findByGroupId(attributeSetInstanceExtensionFieldGroupState.getId());
        }
        return innerIterable;
    }

    public AbstractAttributeSetInstanceExtensionFieldStates(AttributeSetInstanceExtensionFieldGroupState outerState)
    {
        this.attributeSetInstanceExtensionFieldGroupState = outerState;
    }

    @Override
    public Iterator<AttributeSetInstanceExtensionFieldState> iterator() {
        return innerIterable.iterator();
    }

    public AttributeSetInstanceExtensionFieldState get(String index)
    {
        AttributeSetInstanceExtensionFieldId globalId = new AttributeSetInstanceExtensionFieldId(attributeSetInstanceExtensionFieldGroupState.getId(), index);
        if (loadedAttributeSetInstanceExtensionFieldStates.containsKey(globalId)) {
            return loadedAttributeSetInstanceExtensionFieldStates.get(globalId);
        }
        AttributeSetInstanceExtensionFieldState state = getAttributeSetInstanceExtensionFieldStateDao().get(globalId);
        loadedAttributeSetInstanceExtensionFieldStates.put(globalId, state);
        return state;
    }

    public void remove(AttributeSetInstanceExtensionFieldState state)
    {
        this.removedAttributeSetInstanceExtensionFieldStates.add(state);
    }

    public void addToSave(AttributeSetInstanceExtensionFieldState state)
    {
        this.loadedAttributeSetInstanceExtensionFieldStates.put(state.getAttributeSetInstanceExtensionFieldId(), state);
    }

    //region Saveable Implements

    public void save ()
    {
        for (AttributeSetInstanceExtensionFieldState s : this.getLoadedAttributeSetInstanceExtensionFieldStates()) {
            getAttributeSetInstanceExtensionFieldStateDao().save(s);
        }
        for (AttributeSetInstanceExtensionFieldState s : this.removedAttributeSetInstanceExtensionFieldStates) {
            getAttributeSetInstanceExtensionFieldStateDao().delete(s);
        }
    }

    //endregion

}


