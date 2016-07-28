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

    public UserClaimMvoState getState() {
        return this.state;
    }

    public List<Event> getChanges() {
        return this.changes;
    }

    public void create(UserClaimMvoCommand.CreateUserClaimMvo c)
    {
        if (c.getUserVersion() == null) { c.setUserVersion(UserClaimMvoState.VERSION_NULL); }
        UserClaimMvoStateEvent.UserClaimMvoStateCreated e = map(c);
        apply(e);
    }

    public void mergePatch(UserClaimMvoCommand.MergePatchUserClaimMvo c)
    {
        UserClaimMvoStateEvent.UserClaimMvoStateMergePatched e = map(c);
        apply(e);
    }

    public void delete(UserClaimMvoCommand.DeleteUserClaimMvo c)
    {
        UserClaimMvoStateEvent.UserClaimMvoStateDeleted e = map(c);
        apply(e);
    }

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getUserVersion() == null)
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
        state.mutate(e);
        changes.add(e);
    }

    protected UserClaimMvoStateEvent.UserClaimMvoStateCreated map(UserClaimMvoCommand.CreateUserClaimMvo c)
    {
        UserClaimMvoStateEventId stateEventId = new UserClaimMvoStateEventId(c.getUserClaimId(), c.getUserVersion());
        UserClaimMvoStateEvent.UserClaimMvoStateCreated e = newUserClaimMvoStateCreated(stateEventId);
        e.setClaimType(c.getClaimType());
        e.setClaimValue(c.getClaimValue());
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
        ((AbstractUserClaimMvoStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long userVersion = c.getUserVersion();
        return e;
    }

    protected UserClaimMvoStateEvent.UserClaimMvoStateMergePatched map(UserClaimMvoCommand.MergePatchUserClaimMvo c)
    {
        UserClaimMvoStateEventId stateEventId = new UserClaimMvoStateEventId(c.getUserClaimId(), c.getUserVersion());
        UserClaimMvoStateEvent.UserClaimMvoStateMergePatched e = newUserClaimMvoStateMergePatched(stateEventId);
        e.setClaimType(c.getClaimType());
        e.setClaimValue(c.getClaimValue());
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
        e.setIsPropertyClaimTypeRemoved(c.getIsPropertyClaimTypeRemoved());
        e.setIsPropertyClaimValueRemoved(c.getIsPropertyClaimValueRemoved());
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
        ((AbstractUserClaimMvoStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long userVersion = c.getUserVersion();
        return e;
    }

    protected UserClaimMvoStateEvent.UserClaimMvoStateDeleted map(UserClaimMvoCommand.DeleteUserClaimMvo c)
    {
        UserClaimMvoStateEventId stateEventId = new UserClaimMvoStateEventId(c.getUserClaimId(), c.getUserVersion());
        UserClaimMvoStateEvent.UserClaimMvoStateDeleted e = newUserClaimMvoStateDeleted(stateEventId);
        ((AbstractUserClaimMvoStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;
    }


    private static boolean isCommandCreate(UserClaimMvoCommand c)
    {
        return ((c instanceof UserClaimMvoCommand.CreateUserClaimMvo) 
            && c.getUserVersion().equals(UserClaimMvoState.VERSION_NULL));
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


    public static class SimpleUserClaimMvoAggregate extends AbstractUserClaimMvoAggregate
    {
        public SimpleUserClaimMvoAggregate(UserClaimMvoState state) {
            super(state);
        }
    }

}

