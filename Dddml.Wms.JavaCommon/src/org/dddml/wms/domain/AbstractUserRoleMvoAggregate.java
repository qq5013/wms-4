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

    public UserRoleMvoState getState() {
        return this.state;
    }

    public List<Event> getChanges() {
        return this.changes;
    }

    public void create(UserRoleMvoCommand.CreateUserRoleMvo c)
    {
        if (c.getUserVersion() == null) { c.setUserVersion(UserRoleMvoState.VERSION_NULL); }
        UserRoleMvoStateEvent.UserRoleMvoStateCreated e = map(c);
        apply(e);
    }

    public void mergePatch(UserRoleMvoCommand.MergePatchUserRoleMvo c)
    {
        UserRoleMvoStateEvent.UserRoleMvoStateMergePatched e = map(c);
        apply(e);
    }

    public void delete(UserRoleMvoCommand.DeleteUserRoleMvo c)
    {
        UserRoleMvoStateEvent.UserRoleMvoStateDeleted e = map(c);
        apply(e);
    }

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getUserVersion() == null)
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
        state.mutate(e);
        changes.add(e);
    }

    protected UserRoleMvoStateEvent.UserRoleMvoStateCreated map(UserRoleMvoCommand.CreateUserRoleMvo c)
    {
        UserRoleMvoStateEventId stateEventId = new UserRoleMvoStateEventId(c.getUserRoleId(), c.getUserVersion());
        UserRoleMvoStateEvent.UserRoleMvoStateCreated e = newUserRoleMvoStateCreated(stateEventId);
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
        ((AbstractUserRoleMvoStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long userVersion = c.getUserVersion();
        return e;
    }

    protected UserRoleMvoStateEvent.UserRoleMvoStateMergePatched map(UserRoleMvoCommand.MergePatchUserRoleMvo c)
    {
        UserRoleMvoStateEventId stateEventId = new UserRoleMvoStateEventId(c.getUserRoleId(), c.getUserVersion());
        UserRoleMvoStateEvent.UserRoleMvoStateMergePatched e = newUserRoleMvoStateMergePatched(stateEventId);
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
        ((AbstractUserRoleMvoStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long userVersion = c.getUserVersion();
        return e;
    }

    protected UserRoleMvoStateEvent.UserRoleMvoStateDeleted map(UserRoleMvoCommand.DeleteUserRoleMvo c)
    {
        UserRoleMvoStateEventId stateEventId = new UserRoleMvoStateEventId(c.getUserRoleId(), c.getUserVersion());
        UserRoleMvoStateEvent.UserRoleMvoStateDeleted e = newUserRoleMvoStateDeleted(stateEventId);
        ((AbstractUserRoleMvoStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;
    }


    private static boolean isCommandCreate(UserRoleMvoCommand c)
    {
        return ((c instanceof UserRoleMvoCommand.CreateUserRoleMvo) 
            && c.getUserVersion().equals(UserRoleMvoState.VERSION_NULL));
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


    public static class SimpleUserRoleMvoAggregate extends AbstractUserRoleMvoAggregate
    {
        public SimpleUserRoleMvoAggregate(UserRoleMvoState state) {
            super(state);
        }
    }

}

