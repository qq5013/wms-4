package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractLocatorAggregate extends AbstractAggregate implements LocatorAggregate
{
    private LocatorState state;

    private List<Event> changes = new ArrayList<Event>();

    public AbstractLocatorAggregate(LocatorState state)
    {
        this.state = state;
    }

    public LocatorState getState() {
        return this.state;
    }

    public List<Event> getChanges() {
        return this.changes;
    }

    public void create(LocatorCommand.CreateLocator c)
    {
        LocatorStateEvent.LocatorStateCreated e = map(c);
        apply(e);
    }

    public void mergePatch(LocatorCommand.MergePatchLocator c)
    {
        LocatorStateEvent.LocatorStateMergePatched e = map(c);
        apply(e);
    }

    public void delete(LocatorCommand.DeleteLocator c)
    {
        LocatorStateEvent.LocatorStateDeleted e = map(c);
        apply(e);
    }

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getVersion() == null || this.state.getVersion().equals(LocatorState.VERSION_ZERO))
        {
            if (isCommandCreate((LocatorCommand)c))
            {
                return;
            }
            throw DomainError.named("premature", "Can't do anything to unexistent aggregate");
        }
        if (this.state.getDeleted())
        {
            throw DomainError.named("zombie", "Can't do anything to deleted aggregate.");
        }
        if (isCommandCreate((LocatorCommand)c))
            throw DomainError.named("rebirth", "Can't create aggregate that already exists");
    }

    protected void apply(Event e)
    {
        onApplying(e);
        this.state.mutate(e);
        this.changes.add(e);
    }

    protected LocatorStateEvent.LocatorStateCreated map(LocatorCommand.CreateLocator c)
    {
        LocatorStateEventId stateEventId = new LocatorStateEventId(c.getLocatorId(), c.getVersion());
        LocatorStateEvent.LocatorStateCreated e = newLocatorStateCreated(stateEventId);
        e.setWarehouseId(c.getWarehouseId());
        e.setParentLocatorId(c.getParentLocatorId());
        e.setLocatorType(c.getLocatorType());
        e.setPriorityNumber(c.getPriorityNumber());
        e.setIsDefault(c.getIsDefault());
        e.setX(c.getX());
        e.setY(c.getY());
        e.setZ(c.getZ());
        e.setActive(c.getActive());
        ((AbstractLocatorStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long version = c.getVersion();
        return e;
    }

    protected LocatorStateEvent.LocatorStateMergePatched map(LocatorCommand.MergePatchLocator c)
    {
        LocatorStateEventId stateEventId = new LocatorStateEventId(c.getLocatorId(), c.getVersion());
        LocatorStateEvent.LocatorStateMergePatched e = newLocatorStateMergePatched(stateEventId);
        e.setWarehouseId(c.getWarehouseId());
        e.setParentLocatorId(c.getParentLocatorId());
        e.setLocatorType(c.getLocatorType());
        e.setPriorityNumber(c.getPriorityNumber());
        e.setIsDefault(c.getIsDefault());
        e.setX(c.getX());
        e.setY(c.getY());
        e.setZ(c.getZ());
        e.setActive(c.getActive());
        e.setIsPropertyWarehouseIdRemoved(c.getIsPropertyWarehouseIdRemoved());
        e.setIsPropertyParentLocatorIdRemoved(c.getIsPropertyParentLocatorIdRemoved());
        e.setIsPropertyLocatorTypeRemoved(c.getIsPropertyLocatorTypeRemoved());
        e.setIsPropertyPriorityNumberRemoved(c.getIsPropertyPriorityNumberRemoved());
        e.setIsPropertyIsDefaultRemoved(c.getIsPropertyIsDefaultRemoved());
        e.setIsPropertyXRemoved(c.getIsPropertyXRemoved());
        e.setIsPropertyYRemoved(c.getIsPropertyYRemoved());
        e.setIsPropertyZRemoved(c.getIsPropertyZRemoved());
        e.setIsPropertyActiveRemoved(c.getIsPropertyActiveRemoved());
        ((AbstractLocatorStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long version = c.getVersion();
        return e;
    }

    protected LocatorStateEvent.LocatorStateDeleted map(LocatorCommand.DeleteLocator c)
    {
        LocatorStateEventId stateEventId = new LocatorStateEventId(c.getLocatorId(), c.getVersion());
        LocatorStateEvent.LocatorStateDeleted e = newLocatorStateDeleted(stateEventId);
        ((AbstractLocatorStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;
    }


    private static boolean isCommandCreate(LocatorCommand c)
    {
        return c.getVersion() == null || c.getVersion().equals(LocatorState.VERSION_ZERO);
    }


    ////////////////////////

    protected LocatorStateEvent.LocatorStateCreated newLocatorStateCreated(String commandId, String requesterId) {
        LocatorStateEventId stateEventId = new LocatorStateEventId(this.state.getLocatorId(), this.state.getVersion());
        LocatorStateEvent.LocatorStateCreated e = newLocatorStateCreated(stateEventId);
        ((AbstractLocatorStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected LocatorStateEvent.LocatorStateMergePatched newLocatorStateMergePatched(String commandId, String requesterId) {
        LocatorStateEventId stateEventId = new LocatorStateEventId(this.state.getLocatorId(), this.state.getVersion());
        LocatorStateEvent.LocatorStateMergePatched e = newLocatorStateMergePatched(stateEventId);
        ((AbstractLocatorStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected LocatorStateEvent.LocatorStateDeleted newLocatorStateDeleted(String commandId, String requesterId) {
        LocatorStateEventId stateEventId = new LocatorStateEventId(this.state.getLocatorId(), this.state.getVersion());
        LocatorStateEvent.LocatorStateDeleted e = newLocatorStateDeleted(stateEventId);
        ((AbstractLocatorStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected LocatorStateEvent.LocatorStateCreated newLocatorStateCreated(LocatorStateEventId stateEventId) {
        return new AbstractLocatorStateEvent.SimpleLocatorStateCreated(stateEventId);
    }

    protected LocatorStateEvent.LocatorStateMergePatched newLocatorStateMergePatched(LocatorStateEventId stateEventId) {
        return new AbstractLocatorStateEvent.SimpleLocatorStateMergePatched(stateEventId);
    }

    protected LocatorStateEvent.LocatorStateDeleted newLocatorStateDeleted(LocatorStateEventId stateEventId)
    {
        return new AbstractLocatorStateEvent.SimpleLocatorStateDeleted(stateEventId);
    }


    public static class SimpleLocatorAggregate extends AbstractLocatorAggregate
    {
        public SimpleLocatorAggregate(LocatorState state) {
            super(state);
        }
    }

}

