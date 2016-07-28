package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractRolePermissionAggregate extends AbstractAggregate implements RolePermissionAggregate
{
    private RolePermissionState state;

    private List<Event> changes = new ArrayList<Event>();

    public AbstractRolePermissionAggregate(RolePermissionState state)
    {
        this.state = state;
    }

    public RolePermissionState getState() {
        return this.state;
    }

    public List<Event> getChanges() {
        return this.changes;
    }

    public void create(RolePermissionCommand.CreateRolePermission c)
    {
        if (c.getVersion() == null) { c.setVersion(RolePermissionState.VERSION_NULL); }
        RolePermissionStateEvent.RolePermissionStateCreated e = map(c);
        apply(e);
    }

    public void mergePatch(RolePermissionCommand.MergePatchRolePermission c)
    {
        RolePermissionStateEvent.RolePermissionStateMergePatched e = map(c);
        apply(e);
    }

    public void delete(RolePermissionCommand.DeleteRolePermission c)
    {
        RolePermissionStateEvent.RolePermissionStateDeleted e = map(c);
        apply(e);
    }

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getVersion() == null)
        {
            if (isCommandCreate((RolePermissionCommand)c))
            {
                return;
            }
            throw DomainError.named("premature", "Can't do anything to unexistent aggregate");
        }
        if (this.state.getDeleted())
        {
            throw DomainError.named("zombie", "Can't do anything to deleted aggregate.");
        }
        if (isCommandCreate((RolePermissionCommand)c))
            throw DomainError.named("rebirth", "Can't create aggregate that already exists");
    }

    protected void apply(Event e)
    {
        onApplying(e);
        state.mutate(e);
        changes.add(e);
    }

    protected RolePermissionStateEvent.RolePermissionStateCreated map(RolePermissionCommand.CreateRolePermission c)
    {
        RolePermissionStateEventId stateEventId = new RolePermissionStateEventId(c.getId(), c.getVersion());
        RolePermissionStateEvent.RolePermissionStateCreated e = newRolePermissionStateCreated(stateEventId);
        e.setActive(c.getActive());
        ((AbstractRolePermissionStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long version = c.getVersion();
        return e;
    }

    protected RolePermissionStateEvent.RolePermissionStateMergePatched map(RolePermissionCommand.MergePatchRolePermission c)
    {
        RolePermissionStateEventId stateEventId = new RolePermissionStateEventId(c.getId(), c.getVersion());
        RolePermissionStateEvent.RolePermissionStateMergePatched e = newRolePermissionStateMergePatched(stateEventId);
        e.setActive(c.getActive());
        e.setIsPropertyActiveRemoved(c.getIsPropertyActiveRemoved());
        ((AbstractRolePermissionStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long version = c.getVersion();
        return e;
    }

    protected RolePermissionStateEvent.RolePermissionStateDeleted map(RolePermissionCommand.DeleteRolePermission c)
    {
        RolePermissionStateEventId stateEventId = new RolePermissionStateEventId(c.getId(), c.getVersion());
        RolePermissionStateEvent.RolePermissionStateDeleted e = newRolePermissionStateDeleted(stateEventId);
        ((AbstractRolePermissionStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;
    }


    private static boolean isCommandCreate(RolePermissionCommand c)
    {
        return ((c instanceof RolePermissionCommand.CreateRolePermission) 
            && c.getVersion().equals(RolePermissionState.VERSION_NULL));
    }


    ////////////////////////

    protected RolePermissionStateEvent.RolePermissionStateCreated newRolePermissionStateCreated(String commandId, String requesterId) {
        RolePermissionStateEventId stateEventId = new RolePermissionStateEventId(this.state.getId(), this.state.getVersion());
        RolePermissionStateEvent.RolePermissionStateCreated e = newRolePermissionStateCreated(stateEventId);
        ((AbstractRolePermissionStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected RolePermissionStateEvent.RolePermissionStateMergePatched newRolePermissionStateMergePatched(String commandId, String requesterId) {
        RolePermissionStateEventId stateEventId = new RolePermissionStateEventId(this.state.getId(), this.state.getVersion());
        RolePermissionStateEvent.RolePermissionStateMergePatched e = newRolePermissionStateMergePatched(stateEventId);
        ((AbstractRolePermissionStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected RolePermissionStateEvent.RolePermissionStateDeleted newRolePermissionStateDeleted(String commandId, String requesterId) {
        RolePermissionStateEventId stateEventId = new RolePermissionStateEventId(this.state.getId(), this.state.getVersion());
        RolePermissionStateEvent.RolePermissionStateDeleted e = newRolePermissionStateDeleted(stateEventId);
        ((AbstractRolePermissionStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected RolePermissionStateEvent.RolePermissionStateCreated newRolePermissionStateCreated(RolePermissionStateEventId stateEventId) {
        return new AbstractRolePermissionStateEvent.SimpleRolePermissionStateCreated(stateEventId);
    }

    protected RolePermissionStateEvent.RolePermissionStateMergePatched newRolePermissionStateMergePatched(RolePermissionStateEventId stateEventId) {
        return new AbstractRolePermissionStateEvent.SimpleRolePermissionStateMergePatched(stateEventId);
    }

    protected RolePermissionStateEvent.RolePermissionStateDeleted newRolePermissionStateDeleted(RolePermissionStateEventId stateEventId)
    {
        return new AbstractRolePermissionStateEvent.SimpleRolePermissionStateDeleted(stateEventId);
    }


    public static class SimpleRolePermissionAggregate extends AbstractRolePermissionAggregate
    {
        public SimpleRolePermissionAggregate(RolePermissionState state) {
            super(state);
        }
    }

}

