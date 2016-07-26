package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractUserRoleMvoAggregate extends AbstractAggregate implements UserRoleMvoAggregate
{
    private UserRoleMvoState state;

    private List<Event> changes = new ArrayList<Event>();

    public AbstractUserRoleMvoAggregate(UserRoleMvoState state)
    {
        this.state = state;
    }

    public abstract UserRoleMvoState getState();

    public abstract List<Event> getChanges();

    public abstract void create(UserRoleMvoCommand.CreateUserRoleMvo c);

    public abstract void mergePatch(UserRoleMvoCommand.MergePatchUserRoleMvo c);

    public abstract void delete(UserRoleMvoCommand.DeleteUserRoleMvo c);

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getUserVersion() == null || this.state.getUserVersion().equals(UserRoleMvoState.VERSION_ZERO))
        {
            if (isCommandCreate((UserRoleMvoCommand)c))
            {
                return;
            }
            throw DomainError.named("premature", "Can't do anything to unexistent aggregate");
        }
        if (this.state.getDeleted())
        {
            throw DomainError.named("zombie", "Can't do anything to deleted aggregate.");
        }
        if (isCommandCreate((UserRoleMvoCommand)c))
            throw DomainError.named("rebirth", "Can't create aggregate that already exists");
    }

    protected void apply(Event e)
    {
        onApplying(e);
        this.state.mutate(e);
        this.changes.add(e);
    }


    private static boolean isCommandCreate(UserRoleMvoCommand c)
    {
        return c.getUserVersion() == null || c.getUserVersion().equals(UserRoleMvoState.VERSION_ZERO);
    }


    ////////////////////////

    protected UserRoleMvoStateEvent.UserRoleMvoStateCreated newUserRoleMvoStateCreated(String commandId, String requesterId) {
        UserRoleMvoStateEventId stateEventId = new UserRoleMvoStateEventId(this.state.getUserRoleId(), this.state.getUserVersion());
        UserRoleMvoStateEvent.UserRoleMvoStateCreated e = newUserRoleMvoStateCreated(stateEventId);
        ((AbstractUserRoleMvoStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected UserRoleMvoStateEvent.UserRoleMvoStateMergePatched newUserRoleMvoStateMergePatched(String commandId, String requesterId) {
        UserRoleMvoStateEventId stateEventId = new UserRoleMvoStateEventId(this.state.getUserRoleId(), this.state.getUserVersion());
        UserRoleMvoStateEvent.UserRoleMvoStateMergePatched e = newUserRoleMvoStateMergePatched(stateEventId);
        ((AbstractUserRoleMvoStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected UserRoleMvoStateEvent.UserRoleMvoStateDeleted newUserRoleMvoStateDeleted(String commandId, String requesterId) {
        UserRoleMvoStateEventId stateEventId = new UserRoleMvoStateEventId(this.state.getUserRoleId(), this.state.getUserVersion());
        UserRoleMvoStateEvent.UserRoleMvoStateDeleted e = newUserRoleMvoStateDeleted(stateEventId);
        ((AbstractUserRoleMvoStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected UserRoleMvoStateEvent.UserRoleMvoStateCreated newUserRoleMvoStateCreated(UserRoleMvoStateEventId stateEventId) {
        return new AbstractUserRoleMvoStateEvent.SimpleUserRoleMvoStateCreated(stateEventId);
    }

    protected UserRoleMvoStateEvent.UserRoleMvoStateMergePatched newUserRoleMvoStateMergePatched(UserRoleMvoStateEventId stateEventId) {
        return new AbstractUserRoleMvoStateEvent.SimpleUserRoleMvoStateMergePatched(stateEventId);
    }

    protected UserRoleMvoStateEvent.UserRoleMvoStateDeleted newUserRoleMvoStateDeleted(UserRoleMvoStateEventId stateEventId)
    {
        return new AbstractUserRoleMvoStateEvent.SimpleUserRoleMvoStateDeleted(stateEventId);
    }


}

