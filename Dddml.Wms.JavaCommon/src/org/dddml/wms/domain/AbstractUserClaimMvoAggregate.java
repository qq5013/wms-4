package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractUserClaimMvoAggregate extends AbstractAggregate implements UserClaimMvoAggregate
{
    private UserClaimMvoState state;

    private List<Event> changes = new ArrayList<Event>();

    public AbstractUserClaimMvoAggregate(UserClaimMvoState state)
    {
        this.state = state;
    }

    public abstract UserClaimMvoState getState();

    public abstract List<Event> getChanges();

    public abstract void create(UserClaimMvoCommand.CreateUserClaimMvo c);

    public abstract void mergePatch(UserClaimMvoCommand.MergePatchUserClaimMvo c);

    public abstract void delete(UserClaimMvoCommand.DeleteUserClaimMvo c);

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getUserVersion() == null || this.state.getUserVersion().equals(UserClaimMvoState.VERSION_ZERO))
        {
            if (isCommandCreate((UserClaimMvoCommand)c))
            {
                return;
            }
            throw DomainError.named("premature", "Can't do anything to unexistent aggregate");
        }
        if (this.state.getDeleted())
        {
            throw DomainError.named("zombie", "Can't do anything to deleted aggregate.");
        }
        if (isCommandCreate((UserClaimMvoCommand)c))
            throw DomainError.named("rebirth", "Can't create aggregate that already exists");
    }

    protected void apply(Event e)
    {
        onApplying(e);
        this.state.mutate(e);
        this.changes.add(e);
    }


    private static boolean isCommandCreate(UserClaimMvoCommand c)
    {
        return c.getUserVersion() == null || c.getUserVersion().equals(UserClaimMvoState.VERSION_ZERO);
    }


    ////////////////////////

    protected UserClaimMvoStateEvent.UserClaimMvoStateCreated newUserClaimMvoStateCreated(String commandId, String requesterId) {
        UserClaimMvoStateEventId stateEventId = new UserClaimMvoStateEventId(this.state.getUserClaimId(), this.state.getUserVersion());
        UserClaimMvoStateEvent.UserClaimMvoStateCreated e = newUserClaimMvoStateCreated(stateEventId);
        ((AbstractUserClaimMvoStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected UserClaimMvoStateEvent.UserClaimMvoStateMergePatched newUserClaimMvoStateMergePatched(String commandId, String requesterId) {
        UserClaimMvoStateEventId stateEventId = new UserClaimMvoStateEventId(this.state.getUserClaimId(), this.state.getUserVersion());
        UserClaimMvoStateEvent.UserClaimMvoStateMergePatched e = newUserClaimMvoStateMergePatched(stateEventId);
        ((AbstractUserClaimMvoStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected UserClaimMvoStateEvent.UserClaimMvoStateDeleted newUserClaimMvoStateDeleted(String commandId, String requesterId) {
        UserClaimMvoStateEventId stateEventId = new UserClaimMvoStateEventId(this.state.getUserClaimId(), this.state.getUserVersion());
        UserClaimMvoStateEvent.UserClaimMvoStateDeleted e = newUserClaimMvoStateDeleted(stateEventId);
        ((AbstractUserClaimMvoStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected UserClaimMvoStateEvent.UserClaimMvoStateCreated newUserClaimMvoStateCreated(UserClaimMvoStateEventId stateEventId) {
        return new AbstractUserClaimMvoStateEvent.SimpleUserClaimMvoStateCreated(stateEventId);
    }

    protected UserClaimMvoStateEvent.UserClaimMvoStateMergePatched newUserClaimMvoStateMergePatched(UserClaimMvoStateEventId stateEventId) {
        return new AbstractUserClaimMvoStateEvent.SimpleUserClaimMvoStateMergePatched(stateEventId);
    }

    protected UserClaimMvoStateEvent.UserClaimMvoStateDeleted newUserClaimMvoStateDeleted(UserClaimMvoStateEventId stateEventId)
    {
        return new AbstractUserClaimMvoStateEvent.SimpleUserClaimMvoStateDeleted(stateEventId);
    }


}

