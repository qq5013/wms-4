package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractUserLoginMvoAggregate extends AbstractAggregate implements UserLoginMvoAggregate
{
    private UserLoginMvoState state;

    private List<Event> changes = new ArrayList<Event>();

    public AbstractUserLoginMvoAggregate(UserLoginMvoState state)
    {
        this.state = state;
    }

    public abstract UserLoginMvoState getState();

    public abstract List<Event> getChanges();

    public abstract void create(UserLoginMvoCommand.CreateUserLoginMvo c);

    public abstract void mergePatch(UserLoginMvoCommand.MergePatchUserLoginMvo c);

    public abstract void delete(UserLoginMvoCommand.DeleteUserLoginMvo c);

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getUserVersion() == null || this.state.getUserVersion().equals(UserLoginMvoState.VERSION_ZERO))
        {
            if (isCommandCreate((UserLoginMvoCommand)c))
            {
                return;
            }
            throw DomainError.named("premature", "Can't do anything to unexistent aggregate");
        }
        if (this.state.getDeleted())
        {
            throw DomainError.named("zombie", "Can't do anything to deleted aggregate.");
        }
        if (isCommandCreate((UserLoginMvoCommand)c))
            throw DomainError.named("rebirth", "Can't create aggregate that already exists");
    }

    protected void apply(Event e)
    {
        onApplying(e);
        this.state.mutate(e);
        this.changes.add(e);
    }


    private static boolean isCommandCreate(UserLoginMvoCommand c)
    {
        return c.getUserVersion() == null || c.getUserVersion().equals(UserLoginMvoState.VERSION_ZERO);
    }


    ////////////////////////

    protected UserLoginMvoStateEvent.UserLoginMvoStateCreated newUserLoginMvoStateCreated(String commandId, String requesterId) {
        UserLoginMvoStateEventId stateEventId = new UserLoginMvoStateEventId(this.state.getUserLoginId(), this.state.getUserVersion());
        UserLoginMvoStateEvent.UserLoginMvoStateCreated e = newUserLoginMvoStateCreated(stateEventId);
        ((AbstractUserLoginMvoStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected UserLoginMvoStateEvent.UserLoginMvoStateMergePatched newUserLoginMvoStateMergePatched(String commandId, String requesterId) {
        UserLoginMvoStateEventId stateEventId = new UserLoginMvoStateEventId(this.state.getUserLoginId(), this.state.getUserVersion());
        UserLoginMvoStateEvent.UserLoginMvoStateMergePatched e = newUserLoginMvoStateMergePatched(stateEventId);
        ((AbstractUserLoginMvoStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected UserLoginMvoStateEvent.UserLoginMvoStateDeleted newUserLoginMvoStateDeleted(String commandId, String requesterId) {
        UserLoginMvoStateEventId stateEventId = new UserLoginMvoStateEventId(this.state.getUserLoginId(), this.state.getUserVersion());
        UserLoginMvoStateEvent.UserLoginMvoStateDeleted e = newUserLoginMvoStateDeleted(stateEventId);
        ((AbstractUserLoginMvoStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected UserLoginMvoStateEvent.UserLoginMvoStateCreated newUserLoginMvoStateCreated(UserLoginMvoStateEventId stateEventId) {
        return new AbstractUserLoginMvoStateEvent.SimpleUserLoginMvoStateCreated(stateEventId);
    }

    protected UserLoginMvoStateEvent.UserLoginMvoStateMergePatched newUserLoginMvoStateMergePatched(UserLoginMvoStateEventId stateEventId) {
        return new AbstractUserLoginMvoStateEvent.SimpleUserLoginMvoStateMergePatched(stateEventId);
    }

    protected UserLoginMvoStateEvent.UserLoginMvoStateDeleted newUserLoginMvoStateDeleted(UserLoginMvoStateEventId stateEventId)
    {
        return new AbstractUserLoginMvoStateEvent.SimpleUserLoginMvoStateDeleted(stateEventId);
    }


}

