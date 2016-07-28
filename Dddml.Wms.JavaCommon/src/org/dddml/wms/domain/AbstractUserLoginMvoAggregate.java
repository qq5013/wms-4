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

    public UserLoginMvoState getState() {
        return this.state;
    }

    public List<Event> getChanges() {
        return this.changes;
    }

    public void create(UserLoginMvoCommand.CreateUserLoginMvo c)
    {
        if (c.getUserVersion() == null) { c.setUserVersion(UserLoginMvoState.VERSION_NULL); }
        UserLoginMvoStateEvent.UserLoginMvoStateCreated e = map(c);
        apply(e);
    }

    public void mergePatch(UserLoginMvoCommand.MergePatchUserLoginMvo c)
    {
        UserLoginMvoStateEvent.UserLoginMvoStateMergePatched e = map(c);
        apply(e);
    }

    public void delete(UserLoginMvoCommand.DeleteUserLoginMvo c)
    {
        UserLoginMvoStateEvent.UserLoginMvoStateDeleted e = map(c);
        apply(e);
    }

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getUserVersion() == null)
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
        state.mutate(e);
        changes.add(e);
    }

    protected UserLoginMvoStateEvent.UserLoginMvoStateCreated map(UserLoginMvoCommand.CreateUserLoginMvo c)
    {
        UserLoginMvoStateEventId stateEventId = new UserLoginMvoStateEventId(c.getUserLoginId(), c.getUserVersion());
        UserLoginMvoStateEvent.UserLoginMvoStateCreated e = newUserLoginMvoStateCreated(stateEventId);
        e.setVersion(c.getVersion());
        e.setActive(c.getActive());
        e.setUserUserName(c.getUserUserName());
        e.setUserAccessFailedCount(c.getUserAccessFailedCount());
        e.setUserEmail(c.getUserEmail());
        e.setUserEmailConfirmed(c.getUserEmailConfirmed());
        e.setUserLockoutEnabled(c.getUserLockoutEnabled());
        e.setUserLockoutEndDateUtc(c.getUserLockoutEndDateUtc());
        e.setUserPasswordHash(c.getUserPasswordHash());
        e.setUserPhoneNumber(c.getUserPhoneNumber());
        e.setUserPhoneNumberConfirmed(c.getUserPhoneNumberConfirmed());
        e.setUserTwoFactorEnabled(c.getUserTwoFactorEnabled());
        e.setUserSecurityStamp(c.getUserSecurityStamp());
        e.setUserCreatedBy(c.getUserCreatedBy());
        e.setUserCreatedAt(c.getUserCreatedAt());
        e.setUserUpdatedBy(c.getUserUpdatedBy());
        e.setUserUpdatedAt(c.getUserUpdatedAt());
        e.setUserActive(c.getUserActive());
        e.setUserDeleted(c.getUserDeleted());
        ((AbstractUserLoginMvoStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long userVersion = c.getUserVersion();
        return e;
    }

    protected UserLoginMvoStateEvent.UserLoginMvoStateMergePatched map(UserLoginMvoCommand.MergePatchUserLoginMvo c)
    {
        UserLoginMvoStateEventId stateEventId = new UserLoginMvoStateEventId(c.getUserLoginId(), c.getUserVersion());
        UserLoginMvoStateEvent.UserLoginMvoStateMergePatched e = newUserLoginMvoStateMergePatched(stateEventId);
        e.setVersion(c.getVersion());
        e.setActive(c.getActive());
        e.setUserUserName(c.getUserUserName());
        e.setUserAccessFailedCount(c.getUserAccessFailedCount());
        e.setUserEmail(c.getUserEmail());
        e.setUserEmailConfirmed(c.getUserEmailConfirmed());
        e.setUserLockoutEnabled(c.getUserLockoutEnabled());
        e.setUserLockoutEndDateUtc(c.getUserLockoutEndDateUtc());
        e.setUserPasswordHash(c.getUserPasswordHash());
        e.setUserPhoneNumber(c.getUserPhoneNumber());
        e.setUserPhoneNumberConfirmed(c.getUserPhoneNumberConfirmed());
        e.setUserTwoFactorEnabled(c.getUserTwoFactorEnabled());
        e.setUserSecurityStamp(c.getUserSecurityStamp());
        e.setUserCreatedBy(c.getUserCreatedBy());
        e.setUserCreatedAt(c.getUserCreatedAt());
        e.setUserUpdatedBy(c.getUserUpdatedBy());
        e.setUserUpdatedAt(c.getUserUpdatedAt());
        e.setUserActive(c.getUserActive());
        e.setUserDeleted(c.getUserDeleted());
        e.setIsPropertyVersionRemoved(c.getIsPropertyVersionRemoved());
        e.setIsPropertyActiveRemoved(c.getIsPropertyActiveRemoved());
        e.setIsPropertyUserUserNameRemoved(c.getIsPropertyUserUserNameRemoved());
        e.setIsPropertyUserAccessFailedCountRemoved(c.getIsPropertyUserAccessFailedCountRemoved());
        e.setIsPropertyUserEmailRemoved(c.getIsPropertyUserEmailRemoved());
        e.setIsPropertyUserEmailConfirmedRemoved(c.getIsPropertyUserEmailConfirmedRemoved());
        e.setIsPropertyUserLockoutEnabledRemoved(c.getIsPropertyUserLockoutEnabledRemoved());
        e.setIsPropertyUserLockoutEndDateUtcRemoved(c.getIsPropertyUserLockoutEndDateUtcRemoved());
        e.setIsPropertyUserPasswordHashRemoved(c.getIsPropertyUserPasswordHashRemoved());
        e.setIsPropertyUserPhoneNumberRemoved(c.getIsPropertyUserPhoneNumberRemoved());
        e.setIsPropertyUserPhoneNumberConfirmedRemoved(c.getIsPropertyUserPhoneNumberConfirmedRemoved());
        e.setIsPropertyUserTwoFactorEnabledRemoved(c.getIsPropertyUserTwoFactorEnabledRemoved());
        e.setIsPropertyUserSecurityStampRemoved(c.getIsPropertyUserSecurityStampRemoved());
        e.setIsPropertyUserCreatedByRemoved(c.getIsPropertyUserCreatedByRemoved());
        e.setIsPropertyUserCreatedAtRemoved(c.getIsPropertyUserCreatedAtRemoved());
        e.setIsPropertyUserUpdatedByRemoved(c.getIsPropertyUserUpdatedByRemoved());
        e.setIsPropertyUserUpdatedAtRemoved(c.getIsPropertyUserUpdatedAtRemoved());
        e.setIsPropertyUserActiveRemoved(c.getIsPropertyUserActiveRemoved());
        e.setIsPropertyUserDeletedRemoved(c.getIsPropertyUserDeletedRemoved());
        ((AbstractUserLoginMvoStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long userVersion = c.getUserVersion();
        return e;
    }

    protected UserLoginMvoStateEvent.UserLoginMvoStateDeleted map(UserLoginMvoCommand.DeleteUserLoginMvo c)
    {
        UserLoginMvoStateEventId stateEventId = new UserLoginMvoStateEventId(c.getUserLoginId(), c.getUserVersion());
        UserLoginMvoStateEvent.UserLoginMvoStateDeleted e = newUserLoginMvoStateDeleted(stateEventId);
        ((AbstractUserLoginMvoStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;
    }


    private static boolean isCommandCreate(UserLoginMvoCommand c)
    {
        return ((c instanceof UserLoginMvoCommand.CreateUserLoginMvo) 
            && c.getUserVersion().equals(UserLoginMvoState.VERSION_NULL));
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


    public static class SimpleUserLoginMvoAggregate extends AbstractUserLoginMvoAggregate
    {
        public SimpleUserLoginMvoAggregate(UserLoginMvoState state) {
            super(state);
        }
    }

}

