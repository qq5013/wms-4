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

    public abstract RolePermissionState getState();

    public abstract List<Event> getChanges();

    public abstract void create(RolePermissionCommand.CreateRolePermission c);

    public abstract void mergePatch(RolePermissionCommand.MergePatchRolePermission c);

    public abstract void delete(RolePermissionCommand.DeleteRolePermission c);

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getVersion() == null || this.state.getVersion().equals(RolePermissionState.VERSION_ZERO))
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
        this.state.mutate(e);
        this.changes.add(e);
    }


    private static boolean isCommandCreate(RolePermissionCommand c)
    {
        return c.getVersion() == null || c.getVersion().equals(RolePermissionState.VERSION_ZERO);
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


}

