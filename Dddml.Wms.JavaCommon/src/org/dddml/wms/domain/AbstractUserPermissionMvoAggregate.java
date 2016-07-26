package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractUserPermissionMvoAggregate extends AbstractAggregate implements UserPermissionMvoAggregate
{
    private UserPermissionMvoState state;

    private List<Event> changes = new ArrayList<Event>();

    public AbstractUserPermissionMvoAggregate(UserPermissionMvoState state)
    {
        this.state = state;
    }

    public abstract UserPermissionMvoState getState();

    public abstract List<Event> getChanges();

    public abstract void create(UserPermissionMvoCommand.CreateUserPermissionMvo c);

    public abstract void mergePatch(UserPermissionMvoCommand.MergePatchUserPermissionMvo c);

    public abstract void delete(UserPermissionMvoCommand.DeleteUserPermissionMvo c);

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getUserVersion() == null || this.state.getUserVersion().equals(UserPermissionMvoState.VERSION_ZERO))
        {
            if (isCommandCreate((UserPermissionMvoCommand)c))
            {
                return;
            }
            throw DomainError.named("premature", "Can't do anything to unexistent aggregate");
        }
        if (this.state.getDeleted())
        {
            throw DomainError.named("zombie", "Can't do anything to deleted aggregate.");
        }
        if (isCommandCreate((UserPermissionMvoCommand)c))
            throw DomainError.named("rebirth", "Can't create aggregate that already exists");
    }

    protected void apply(Event e)
    {
        onApplying(e);
        this.state.mutate(e);
        this.changes.add(e);
    }


    private static boolean isCommandCreate(UserPermissionMvoCommand c)
    {
        return c.getUserVersion() == null || c.getUserVersion().equals(UserPermissionMvoState.VERSION_ZERO);
    }


    ////////////////////////

    protected UserPermissionMvoStateEvent.UserPermissionMvoStateCreated newUserPermissionMvoStateCreated(String commandId, String requesterId) {
        UserPermissionMvoStateEventId stateEventId = new UserPermissionMvoStateEventId(this.state.getUserPermissionId(), this.state.getUserVersion());
        UserPermissionMvoStateEvent.UserPermissionMvoStateCreated e = newUserPermissionMvoStateCreated(stateEventId);
        ((AbstractUserPermissionMvoStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected UserPermissionMvoStateEvent.UserPermissionMvoStateMergePatched newUserPermissionMvoStateMergePatched(String commandId, String requesterId) {
        UserPermissionMvoStateEventId stateEventId = new UserPermissionMvoStateEventId(this.state.getUserPermissionId(), this.state.getUserVersion());
        UserPermissionMvoStateEvent.UserPermissionMvoStateMergePatched e = newUserPermissionMvoStateMergePatched(stateEventId);
        ((AbstractUserPermissionMvoStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected UserPermissionMvoStateEvent.UserPermissionMvoStateDeleted newUserPermissionMvoStateDeleted(String commandId, String requesterId) {
        UserPermissionMvoStateEventId stateEventId = new UserPermissionMvoStateEventId(this.state.getUserPermissionId(), this.state.getUserVersion());
        UserPermissionMvoStateEvent.UserPermissionMvoStateDeleted e = newUserPermissionMvoStateDeleted(stateEventId);
        ((AbstractUserPermissionMvoStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected UserPermissionMvoStateEvent.UserPermissionMvoStateCreated newUserPermissionMvoStateCreated(UserPermissionMvoStateEventId stateEventId) {
        return new AbstractUserPermissionMvoStateEvent.SimpleUserPermissionMvoStateCreated(stateEventId);
    }

    protected UserPermissionMvoStateEvent.UserPermissionMvoStateMergePatched newUserPermissionMvoStateMergePatched(UserPermissionMvoStateEventId stateEventId) {
        return new AbstractUserPermissionMvoStateEvent.SimpleUserPermissionMvoStateMergePatched(stateEventId);
    }

    protected UserPermissionMvoStateEvent.UserPermissionMvoStateDeleted newUserPermissionMvoStateDeleted(UserPermissionMvoStateEventId stateEventId)
    {
        return new AbstractUserPermissionMvoStateEvent.SimpleUserPermissionMvoStateDeleted(stateEventId);
    }


}

