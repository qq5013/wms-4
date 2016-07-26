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

    public abstract WarehouseState getState();

    public abstract List<Event> getChanges();

    public abstract void create(WarehouseCommand.CreateWarehouse c);

    public abstract void mergePatch(WarehouseCommand.MergePatchWarehouse c);

    public abstract void delete(WarehouseCommand.DeleteWarehouse c);

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getVersion() == null || this.state.getVersion().equals(WarehouseState.VERSION_ZERO))
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
        this.state.mutate(e);
        this.changes.add(e);
    }


    private static boolean isCommandCreate(WarehouseCommand c)
    {
        return c.getVersion() == null || c.getVersion().equals(WarehouseState.VERSION_ZERO);
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


}

