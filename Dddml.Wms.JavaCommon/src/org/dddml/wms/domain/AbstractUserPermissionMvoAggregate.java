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

    public UserPermissionMvoState getState() {
        return this.state;
    }

    public List<Event> getChanges() {
        return this.changes;
    }

    public void create(UserPermissionMvoCommand.CreateUserPermissionMvo c)
    {
        if (c.getUserVersion() == null) { c.setUserVersion(UserPermissionMvoState.VERSION_NULL); }
        UserPermissionMvoStateEvent.UserPermissionMvoStateCreated e = map(c);
        apply(e);
    }

    public void mergePatch(UserPermissionMvoCommand.MergePatchUserPermissionMvo c)
    {
        UserPermissionMvoStateEvent.UserPermissionMvoStateMergePatched e = map(c);
        apply(e);
    }

    public void delete(UserPermissionMvoCommand.DeleteUserPermissionMvo c)
    {
        UserPermissionMvoStateEvent.UserPermissionMvoStateDeleted e = map(c);
        apply(e);
    }

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getUserVersion() == null)
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
        state.mutate(e);
        changes.add(e);
    }

    protected UserPermissionMvoStateEvent.UserPermissionMvoStateCreated map(UserPermissionMvoCommand.CreateUserPermissionMvo c)
    {
        UserPermissionMvoStateEventId stateEventId = new UserPermissionMvoStateEventId(c.getUserPermissionId(), c.getUserVersion());
        UserPermissionMvoStateEvent.UserPermissionMvoStateCreated e = newUserPermissionMvoStateCreated(stateEventId);
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
        ((AbstractUserPermissionMvoStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long userVersion = c.getUserVersion();
        return e;
    }

    protected UserPermissionMvoStateEvent.UserPermissionMvoStateMergePatched map(UserPermissionMvoCommand.MergePatchUserPermissionMvo c)
    {
        UserPermissionMvoStateEventId stateEventId = new UserPermissionMvoStateEventId(c.getUserPermissionId(), c.getUserVersion());
        UserPermissionMvoStateEvent.UserPermissionMvoStateMergePatched e = newUserPermissionMvoStateMergePatched(stateEventId);
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
        ((AbstractUserPermissionMvoStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long userVersion = c.getUserVersion();
        return e;
    }

    protected UserPermissionMvoStateEvent.UserPermissionMvoStateDeleted map(UserPermissionMvoCommand.DeleteUserPermissionMvo c)
    {
        UserPermissionMvoStateEventId stateEventId = new UserPermissionMvoStateEventId(c.getUserPermissionId(), c.getUserVersion());
        UserPermissionMvoStateEvent.UserPermissionMvoStateDeleted e = newUserPermissionMvoStateDeleted(stateEventId);
        ((AbstractUserPermissionMvoStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;
    }


    private static boolean isCommandCreate(UserPermissionMvoCommand c)
    {
        return ((c instanceof UserPermissionMvoCommand.CreateUserPermissionMvo) 
            && c.getUserVersion().equals(UserPermissionMvoState.VERSION_NULL));
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


    public static class SimpleUserPermissionMvoAggregate extends AbstractUserPermissionMvoAggregate
    {
        public SimpleUserPermissionMvoAggregate(UserPermissionMvoState state) {
            super(state);
        }
    }

}

