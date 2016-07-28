package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractWarehouseAggregate extends AbstractAggregate implements WarehouseAggregate
{
    private WarehouseState state;

    private List<Event> changes = new ArrayList<Event>();

    public AbstractWarehouseAggregate(WarehouseState state)
    {
        this.state = state;
    }

    public WarehouseState getState() {
        return this.state;
    }

    public List<Event> getChanges() {
        return this.changes;
    }

    public void create(WarehouseCommand.CreateWarehouse c)
    {
        if (c.getVersion() == null) { c.setVersion(WarehouseState.VERSION_NULL); }
        WarehouseStateEvent.WarehouseStateCreated e = map(c);
        apply(e);
    }

    public void mergePatch(WarehouseCommand.MergePatchWarehouse c)
    {
        WarehouseStateEvent.WarehouseStateMergePatched e = map(c);
        apply(e);
    }

    public void delete(WarehouseCommand.DeleteWarehouse c)
    {
        WarehouseStateEvent.WarehouseStateDeleted e = map(c);
        apply(e);
    }

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getVersion() == null)
        {
            if (isCommandCreate((WarehouseCommand)c))
            {
                return;
            }
            throw DomainError.named("premature", "Can't do anything to unexistent aggregate");
        }
        if (this.state.getDeleted())
        {
            throw DomainError.named("zombie", "Can't do anything to deleted aggregate.");
        }
        if (isCommandCreate((WarehouseCommand)c))
            throw DomainError.named("rebirth", "Can't create aggregate that already exists");
    }

    protected void apply(Event e)
    {
        onApplying(e);
        state.mutate(e);
        changes.add(e);
    }

    protected WarehouseStateEvent.WarehouseStateCreated map(WarehouseCommand.CreateWarehouse c)
    {
        WarehouseStateEventId stateEventId = new WarehouseStateEventId(c.getWarehouseId(), c.getVersion());
        WarehouseStateEvent.WarehouseStateCreated e = newWarehouseStateCreated(stateEventId);
        e.setName(c.getName());
        e.setDescription(c.getDescription());
        e.setIsInTransit(c.getIsInTransit());
        e.setActive(c.getActive());
        ((AbstractWarehouseStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long version = c.getVersion();
        return e;
    }

    protected WarehouseStateEvent.WarehouseStateMergePatched map(WarehouseCommand.MergePatchWarehouse c)
    {
        WarehouseStateEventId stateEventId = new WarehouseStateEventId(c.getWarehouseId(), c.getVersion());
        WarehouseStateEvent.WarehouseStateMergePatched e = newWarehouseStateMergePatched(stateEventId);
        e.setName(c.getName());
        e.setDescription(c.getDescription());
        e.setIsInTransit(c.getIsInTransit());
        e.setActive(c.getActive());
        e.setIsPropertyNameRemoved(c.getIsPropertyNameRemoved());
        e.setIsPropertyDescriptionRemoved(c.getIsPropertyDescriptionRemoved());
        e.setIsPropertyIsInTransitRemoved(c.getIsPropertyIsInTransitRemoved());
        e.setIsPropertyActiveRemoved(c.getIsPropertyActiveRemoved());
        ((AbstractWarehouseStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long version = c.getVersion();
        return e;
    }

    protected WarehouseStateEvent.WarehouseStateDeleted map(WarehouseCommand.DeleteWarehouse c)
    {
        WarehouseStateEventId stateEventId = new WarehouseStateEventId(c.getWarehouseId(), c.getVersion());
        WarehouseStateEvent.WarehouseStateDeleted e = newWarehouseStateDeleted(stateEventId);
        ((AbstractWarehouseStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;
    }


    private static boolean isCommandCreate(WarehouseCommand c)
    {
        return ((c instanceof WarehouseCommand.CreateWarehouse) 
            && c.getVersion().equals(WarehouseState.VERSION_NULL));
    }


    ////////////////////////

    protected WarehouseStateEvent.WarehouseStateCreated newWarehouseStateCreated(String commandId, String requesterId) {
        WarehouseStateEventId stateEventId = new WarehouseStateEventId(this.state.getWarehouseId(), this.state.getVersion());
        WarehouseStateEvent.WarehouseStateCreated e = newWarehouseStateCreated(stateEventId);
        ((AbstractWarehouseStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected WarehouseStateEvent.WarehouseStateMergePatched newWarehouseStateMergePatched(String commandId, String requesterId) {
        WarehouseStateEventId stateEventId = new WarehouseStateEventId(this.state.getWarehouseId(), this.state.getVersion());
        WarehouseStateEvent.WarehouseStateMergePatched e = newWarehouseStateMergePatched(stateEventId);
        ((AbstractWarehouseStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected WarehouseStateEvent.WarehouseStateDeleted newWarehouseStateDeleted(String commandId, String requesterId) {
        WarehouseStateEventId stateEventId = new WarehouseStateEventId(this.state.getWarehouseId(), this.state.getVersion());
        WarehouseStateEvent.WarehouseStateDeleted e = newWarehouseStateDeleted(stateEventId);
        ((AbstractWarehouseStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected WarehouseStateEvent.WarehouseStateCreated newWarehouseStateCreated(WarehouseStateEventId stateEventId) {
        return new AbstractWarehouseStateEvent.SimpleWarehouseStateCreated(stateEventId);
    }

    protected WarehouseStateEvent.WarehouseStateMergePatched newWarehouseStateMergePatched(WarehouseStateEventId stateEventId) {
        return new AbstractWarehouseStateEvent.SimpleWarehouseStateMergePatched(stateEventId);
    }

    protected WarehouseStateEvent.WarehouseStateDeleted newWarehouseStateDeleted(WarehouseStateEventId stateEventId)
    {
        return new AbstractWarehouseStateEvent.SimpleWarehouseStateDeleted(stateEventId);
    }


    public static class SimpleWarehouseAggregate extends AbstractWarehouseAggregate
    {
        public SimpleWarehouseAggregate(WarehouseState state) {
            super(state);
        }
    }

}

