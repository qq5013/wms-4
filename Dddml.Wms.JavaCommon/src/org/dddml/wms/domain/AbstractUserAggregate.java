package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractUserAggregate extends AbstractAggregate implements UserAggregate
{
    private UserState state;

    private List<Event> changes = new ArrayList<Event>();

    public AbstractUserAggregate(UserState state)
    {
        this.state = state;
    }

    public UserState getState() {
        return this.state;
    }

    public List<Event> getChanges() {
        return this.changes;
    }

    public void create(UserCommand.CreateUser c)
    {
        UserStateEvent.UserStateCreated e = map(c);
        apply(e);
    }

    public void mergePatch(UserCommand.MergePatchUser c)
    {
        UserStateEvent.UserStateMergePatched e = map(c);
        apply(e);
    }

    public void delete(UserCommand.DeleteUser c)
    {
        UserStateEvent.UserStateDeleted e = map(c);
        apply(e);
    }

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getVersion() == null || this.state.getVersion().equals(UserState.VERSION_ZERO))
        {
            if (isCommandCreate((UserCommand)c))
            {
                return;
            }
            throw DomainError.named("premature", "Can't do anything to unexistent aggregate");
        }
        if (this.state.getDeleted())
        {
            throw DomainError.named("zombie", "Can't do anything to deleted aggregate.");
        }
        if (isCommandCreate((UserCommand)c))
            throw DomainError.named("rebirth", "Can't create aggregate that already exists");
    }

    protected void apply(Event e)
    {
        onApplying(e);
        this.state.mutate(e);
        this.changes.add(e);
    }

    protected UserStateEvent.UserStateCreated map(UserCommand.CreateUser c)
    {
        UserStateEventId stateEventId = new UserStateEventId(c.getUserId(), c.getVersion());
        UserStateEvent.UserStateCreated e = newUserStateCreated(stateEventId);
        e.setUserName(c.getUserName());
        e.setAccessFailedCount(c.getAccessFailedCount());
        e.setEmail(c.getEmail());
        e.setEmailConfirmed(c.getEmailConfirmed());
        e.setLockoutEnabled(c.getLockoutEnabled());
        e.setLockoutEndDateUtc(c.getLockoutEndDateUtc());
        e.setPasswordHash(c.getPasswordHash());
        e.setPhoneNumber(c.getPhoneNumber());
        e.setPhoneNumberConfirmed(c.getPhoneNumberConfirmed());
        e.setTwoFactorEnabled(c.getTwoFactorEnabled());
        e.setSecurityStamp(c.getSecurityStamp());
        e.setActive(c.getActive());
        ((AbstractUserStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long version = c.getVersion();
        for (UserRoleCommand.CreateUserRole innerCommand : c.getUserRoles())
        {
            throwOnInconsistentCommands(c, innerCommand);
            UserRoleStateEvent.UserRoleStateCreated innerEvent = mapCreate(innerCommand, c, version, this.state);
            e.addUserRoleEvent(innerEvent);
        }

        for (UserClaimCommand.CreateUserClaim innerCommand : c.getUserClaims())
        {
            throwOnInconsistentCommands(c, innerCommand);
            UserClaimStateEvent.UserClaimStateCreated innerEvent = mapCreate(innerCommand, c, version, this.state);
            e.addUserClaimEvent(innerEvent);
        }

        for (UserPermissionCommand.CreateUserPermission innerCommand : c.getUserPermissions())
        {
            throwOnInconsistentCommands(c, innerCommand);
            UserPermissionStateEvent.UserPermissionStateCreated innerEvent = mapCreate(innerCommand, c, version, this.state);
            e.addUserPermissionEvent(innerEvent);
        }

        for (UserLoginCommand.CreateUserLogin innerCommand : c.getUserLogins())
        {
            throwOnInconsistentCommands(c, innerCommand);
            UserLoginStateEvent.UserLoginStateCreated innerEvent = mapCreate(innerCommand, c, version, this.state);
            e.addUserLoginEvent(innerEvent);
        }

        return e;
    }

    protected UserStateEvent.UserStateMergePatched map(UserCommand.MergePatchUser c)
    {
        UserStateEventId stateEventId = new UserStateEventId(c.getUserId(), c.getVersion());
        UserStateEvent.UserStateMergePatched e = newUserStateMergePatched(stateEventId);
        e.setUserName(c.getUserName());
        e.setAccessFailedCount(c.getAccessFailedCount());
        e.setEmail(c.getEmail());
        e.setEmailConfirmed(c.getEmailConfirmed());
        e.setLockoutEnabled(c.getLockoutEnabled());
        e.setLockoutEndDateUtc(c.getLockoutEndDateUtc());
        e.setPasswordHash(c.getPasswordHash());
        e.setPhoneNumber(c.getPhoneNumber());
        e.setPhoneNumberConfirmed(c.getPhoneNumberConfirmed());
        e.setTwoFactorEnabled(c.getTwoFactorEnabled());
        e.setSecurityStamp(c.getSecurityStamp());
        e.setActive(c.getActive());
        e.setIsPropertyUserNameRemoved(c.getIsPropertyUserNameRemoved());
        e.setIsPropertyAccessFailedCountRemoved(c.getIsPropertyAccessFailedCountRemoved());
        e.setIsPropertyEmailRemoved(c.getIsPropertyEmailRemoved());
        e.setIsPropertyEmailConfirmedRemoved(c.getIsPropertyEmailConfirmedRemoved());
        e.setIsPropertyLockoutEnabledRemoved(c.getIsPropertyLockoutEnabledRemoved());
        e.setIsPropertyLockoutEndDateUtcRemoved(c.getIsPropertyLockoutEndDateUtcRemoved());
        e.setIsPropertyPasswordHashRemoved(c.getIsPropertyPasswordHashRemoved());
        e.setIsPropertyPhoneNumberRemoved(c.getIsPropertyPhoneNumberRemoved());
        e.setIsPropertyPhoneNumberConfirmedRemoved(c.getIsPropertyPhoneNumberConfirmedRemoved());
        e.setIsPropertyTwoFactorEnabledRemoved(c.getIsPropertyTwoFactorEnabledRemoved());
        e.setIsPropertySecurityStampRemoved(c.getIsPropertySecurityStampRemoved());
        e.setIsPropertyActiveRemoved(c.getIsPropertyActiveRemoved());
        ((AbstractUserStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long version = c.getVersion();
        for (UserRoleCommand innerCommand : c.getUserRoleCommands())
        {
            throwOnInconsistentCommands(c, innerCommand);
            UserRoleStateEvent innerEvent = map(innerCommand, c, version, this.state);
            e.addUserRoleEvent(innerEvent);
        }

        for (UserClaimCommand innerCommand : c.getUserClaimCommands())
        {
            throwOnInconsistentCommands(c, innerCommand);
            UserClaimStateEvent innerEvent = map(innerCommand, c, version, this.state);
            e.addUserClaimEvent(innerEvent);
        }

        for (UserPermissionCommand innerCommand : c.getUserPermissionCommands())
        {
            throwOnInconsistentCommands(c, innerCommand);
            UserPermissionStateEvent innerEvent = map(innerCommand, c, version, this.state);
            e.addUserPermissionEvent(innerEvent);
        }

        for (UserLoginCommand innerCommand : c.getUserLoginCommands())
        {
            throwOnInconsistentCommands(c, innerCommand);
            UserLoginStateEvent innerEvent = map(innerCommand, c, version, this.state);
            e.addUserLoginEvent(innerEvent);
        }

        return e;
    }

    protected UserStateEvent.UserStateDeleted map(UserCommand.DeleteUser c)
    {
        UserStateEventId stateEventId = new UserStateEventId(c.getUserId(), c.getVersion());
        UserStateEvent.UserStateDeleted e = newUserStateDeleted(stateEventId);
        ((AbstractUserStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;
    }


    protected UserRoleStateEvent map(UserRoleCommand c, UserCommand outerCommand, long version, UserState outerState)
    {
        UserRoleCommand.CreateUserRole create = (c.getCommandType().equals(CommandType.CREATE)) ? ((UserRoleCommand.CreateUserRole)c) : null;
        if(create != null)
        {
            return mapCreate(create, outerCommand, version, outerState);
        }

        UserRoleCommand.MergePatchUserRole merge = (c.getCommandType().equals(CommandType.MERGE_PATCH)) ? ((UserRoleCommand.MergePatchUserRole)c) : null;
        if(merge != null)
        {
            return mapMergePatch(merge, outerCommand, version, outerState);
        }

        UserRoleCommand.RemoveUserRole remove = (c.getCommandType().equals(CommandType.REMOVE)) ? ((UserRoleCommand.RemoveUserRole)c) : null;
        if (remove != null)
        {
            return mapRemove(remove, outerCommand, version);
        }
        throw new UnsupportedOperationException();
    }

    protected UserRoleStateEvent.UserRoleStateCreated mapCreate(UserRoleCommand.CreateUserRole c, UserCommand outerCommand, Long version, UserState outerState)
    {
        ((AbstractCommand)c).setRequesterId(outerCommand.getRequesterId());
        UserRoleStateEventId stateEventId = new UserRoleStateEventId(c.getUserId(), c.getRoleId(), version);
        UserRoleStateEvent.UserRoleStateCreated e = newUserRoleStateCreated(stateEventId);
        UserRoleState s = outerState.getUserRoles().get(c.getRoleId());

        e.setActive(c.getActive());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;

    }// END map(ICreate... ////////////////////////////

    protected UserRoleStateEvent.UserRoleStateMergePatched mapMergePatch(UserRoleCommand.MergePatchUserRole c, UserCommand outerCommand, Long version, UserState outerState)
    {
        ((AbstractCommand)c).setRequesterId(outerCommand.getRequesterId());
        UserRoleStateEventId stateEventId = new UserRoleStateEventId(c.getUserId(), c.getRoleId(), version);
        UserRoleStateEvent.UserRoleStateMergePatched e = newUserRoleStateMergePatched(stateEventId);
        UserRoleState s = outerState.getUserRoles().get(c.getRoleId());

        e.setActive(c.getActive());
        e.setIsPropertyActiveRemoved(c.getIsPropertyActiveRemoved());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;

    }// END map(IMergePatch... ////////////////////////////

    protected UserRoleStateEvent.UserRoleStateRemoved mapRemove(UserRoleCommand.RemoveUserRole c, UserCommand outerCommand, Long version)
    {
        ((AbstractCommand)c).setRequesterId(outerCommand.getRequesterId());
        UserRoleStateEventId stateEventId = new UserRoleStateEventId(c.getUserId(), c.getRoleId(), version);
        UserRoleStateEvent.UserRoleStateRemoved e = newUserRoleStateRemoved(stateEventId);

        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());

        return e;

    }// END map(IRemove... ////////////////////////////


    protected UserClaimStateEvent map(UserClaimCommand c, UserCommand outerCommand, long version, UserState outerState)
    {
        UserClaimCommand.CreateUserClaim create = (c.getCommandType().equals(CommandType.CREATE)) ? ((UserClaimCommand.CreateUserClaim)c) : null;
        if(create != null)
        {
            return mapCreate(create, outerCommand, version, outerState);
        }

        UserClaimCommand.MergePatchUserClaim merge = (c.getCommandType().equals(CommandType.MERGE_PATCH)) ? ((UserClaimCommand.MergePatchUserClaim)c) : null;
        if(merge != null)
        {
            return mapMergePatch(merge, outerCommand, version, outerState);
        }

        UserClaimCommand.RemoveUserClaim remove = (c.getCommandType().equals(CommandType.REMOVE)) ? ((UserClaimCommand.RemoveUserClaim)c) : null;
        if (remove != null)
        {
            return mapRemove(remove, outerCommand, version);
        }
        throw new UnsupportedOperationException();
    }

    protected UserClaimStateEvent.UserClaimStateCreated mapCreate(UserClaimCommand.CreateUserClaim c, UserCommand outerCommand, Long version, UserState outerState)
    {
        ((AbstractCommand)c).setRequesterId(outerCommand.getRequesterId());
        UserClaimStateEventId stateEventId = new UserClaimStateEventId(c.getUserId(), c.getClaimId(), version);
        UserClaimStateEvent.UserClaimStateCreated e = newUserClaimStateCreated(stateEventId);
        UserClaimState s = outerState.getUserClaims().get(c.getClaimId());

        e.setClaimType(c.getClaimType());
        e.setClaimValue(c.getClaimValue());
        e.setActive(c.getActive());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;

    }// END map(ICreate... ////////////////////////////

    protected UserClaimStateEvent.UserClaimStateMergePatched mapMergePatch(UserClaimCommand.MergePatchUserClaim c, UserCommand outerCommand, Long version, UserState outerState)
    {
        ((AbstractCommand)c).setRequesterId(outerCommand.getRequesterId());
        UserClaimStateEventId stateEventId = new UserClaimStateEventId(c.getUserId(), c.getClaimId(), version);
        UserClaimStateEvent.UserClaimStateMergePatched e = newUserClaimStateMergePatched(stateEventId);
        UserClaimState s = outerState.getUserClaims().get(c.getClaimId());

        e.setClaimType(c.getClaimType());
        e.setClaimValue(c.getClaimValue());
        e.setActive(c.getActive());
        e.setIsPropertyClaimTypeRemoved(c.getIsPropertyClaimTypeRemoved());
        e.setIsPropertyClaimValueRemoved(c.getIsPropertyClaimValueRemoved());
        e.setIsPropertyActiveRemoved(c.getIsPropertyActiveRemoved());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;

    }// END map(IMergePatch... ////////////////////////////

    protected UserClaimStateEvent.UserClaimStateRemoved mapRemove(UserClaimCommand.RemoveUserClaim c, UserCommand outerCommand, Long version)
    {
        ((AbstractCommand)c).setRequesterId(outerCommand.getRequesterId());
        UserClaimStateEventId stateEventId = new UserClaimStateEventId(c.getUserId(), c.getClaimId(), version);
        UserClaimStateEvent.UserClaimStateRemoved e = newUserClaimStateRemoved(stateEventId);

        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());

        return e;

    }// END map(IRemove... ////////////////////////////


    protected UserPermissionStateEvent map(UserPermissionCommand c, UserCommand outerCommand, long version, UserState outerState)
    {
        UserPermissionCommand.CreateUserPermission create = (c.getCommandType().equals(CommandType.CREATE)) ? ((UserPermissionCommand.CreateUserPermission)c) : null;
        if(create != null)
        {
            return mapCreate(create, outerCommand, version, outerState);
        }

        UserPermissionCommand.MergePatchUserPermission merge = (c.getCommandType().equals(CommandType.MERGE_PATCH)) ? ((UserPermissionCommand.MergePatchUserPermission)c) : null;
        if(merge != null)
        {
            return mapMergePatch(merge, outerCommand, version, outerState);
        }

        UserPermissionCommand.RemoveUserPermission remove = (c.getCommandType().equals(CommandType.REMOVE)) ? ((UserPermissionCommand.RemoveUserPermission)c) : null;
        if (remove != null)
        {
            return mapRemove(remove, outerCommand, version);
        }
        throw new UnsupportedOperationException();
    }

    protected UserPermissionStateEvent.UserPermissionStateCreated mapCreate(UserPermissionCommand.CreateUserPermission c, UserCommand outerCommand, Long version, UserState outerState)
    {
        ((AbstractCommand)c).setRequesterId(outerCommand.getRequesterId());
        UserPermissionStateEventId stateEventId = new UserPermissionStateEventId(c.getUserId(), c.getPermissionId(), version);
        UserPermissionStateEvent.UserPermissionStateCreated e = newUserPermissionStateCreated(stateEventId);
        UserPermissionState s = outerState.getUserPermissions().get(c.getPermissionId());

        e.setActive(c.getActive());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;

    }// END map(ICreate... ////////////////////////////

    protected UserPermissionStateEvent.UserPermissionStateMergePatched mapMergePatch(UserPermissionCommand.MergePatchUserPermission c, UserCommand outerCommand, Long version, UserState outerState)
    {
        ((AbstractCommand)c).setRequesterId(outerCommand.getRequesterId());
        UserPermissionStateEventId stateEventId = new UserPermissionStateEventId(c.getUserId(), c.getPermissionId(), version);
        UserPermissionStateEvent.UserPermissionStateMergePatched e = newUserPermissionStateMergePatched(stateEventId);
        UserPermissionState s = outerState.getUserPermissions().get(c.getPermissionId());

        e.setActive(c.getActive());
        e.setIsPropertyActiveRemoved(c.getIsPropertyActiveRemoved());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;

    }// END map(IMergePatch... ////////////////////////////

    protected UserPermissionStateEvent.UserPermissionStateRemoved mapRemove(UserPermissionCommand.RemoveUserPermission c, UserCommand outerCommand, Long version)
    {
        ((AbstractCommand)c).setRequesterId(outerCommand.getRequesterId());
        UserPermissionStateEventId stateEventId = new UserPermissionStateEventId(c.getUserId(), c.getPermissionId(), version);
        UserPermissionStateEvent.UserPermissionStateRemoved e = newUserPermissionStateRemoved(stateEventId);

        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());

        return e;

    }// END map(IRemove... ////////////////////////////


    protected UserLoginStateEvent map(UserLoginCommand c, UserCommand outerCommand, long version, UserState outerState)
    {
        UserLoginCommand.CreateUserLogin create = (c.getCommandType().equals(CommandType.CREATE)) ? ((UserLoginCommand.CreateUserLogin)c) : null;
        if(create != null)
        {
            return mapCreate(create, outerCommand, version, outerState);
        }

        UserLoginCommand.MergePatchUserLogin merge = (c.getCommandType().equals(CommandType.MERGE_PATCH)) ? ((UserLoginCommand.MergePatchUserLogin)c) : null;
        if(merge != null)
        {
            return mapMergePatch(merge, outerCommand, version, outerState);
        }

        UserLoginCommand.RemoveUserLogin remove = (c.getCommandType().equals(CommandType.REMOVE)) ? ((UserLoginCommand.RemoveUserLogin)c) : null;
        if (remove != null)
        {
            return mapRemove(remove, outerCommand, version);
        }
        throw new UnsupportedOperationException();
    }

    protected UserLoginStateEvent.UserLoginStateCreated mapCreate(UserLoginCommand.CreateUserLogin c, UserCommand outerCommand, Long version, UserState outerState)
    {
        ((AbstractCommand)c).setRequesterId(outerCommand.getRequesterId());
        UserLoginStateEventId stateEventId = new UserLoginStateEventId(c.getUserId(), c.getLoginKey(), version);
        UserLoginStateEvent.UserLoginStateCreated e = newUserLoginStateCreated(stateEventId);
        UserLoginState s = outerState.getUserLogins().get(c.getLoginKey());

        e.setActive(c.getActive());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;

    }// END map(ICreate... ////////////////////////////

    protected UserLoginStateEvent.UserLoginStateMergePatched mapMergePatch(UserLoginCommand.MergePatchUserLogin c, UserCommand outerCommand, Long version, UserState outerState)
    {
        ((AbstractCommand)c).setRequesterId(outerCommand.getRequesterId());
        UserLoginStateEventId stateEventId = new UserLoginStateEventId(c.getUserId(), c.getLoginKey(), version);
        UserLoginStateEvent.UserLoginStateMergePatched e = newUserLoginStateMergePatched(stateEventId);
        UserLoginState s = outerState.getUserLogins().get(c.getLoginKey());

        e.setActive(c.getActive());
        e.setIsPropertyActiveRemoved(c.getIsPropertyActiveRemoved());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;

    }// END map(IMergePatch... ////////////////////////////

    protected UserLoginStateEvent.UserLoginStateRemoved mapRemove(UserLoginCommand.RemoveUserLogin c, UserCommand outerCommand, Long version)
    {
        ((AbstractCommand)c).setRequesterId(outerCommand.getRequesterId());
        UserLoginStateEventId stateEventId = new UserLoginStateEventId(c.getUserId(), c.getLoginKey(), version);
        UserLoginStateEvent.UserLoginStateRemoved e = newUserLoginStateRemoved(stateEventId);

        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());

        return e;

    }// END map(IRemove... ////////////////////////////

    protected void throwOnInconsistentCommands(UserCommand command, UserRoleCommand innerCommand)
    {
        AbstractUserCommand properties = command instanceof AbstractUserCommand ? (AbstractUserCommand) command : null;
        AbstractUserRoleCommand innerProperties = innerCommand instanceof AbstractUserRoleCommand ? (AbstractUserRoleCommand) innerCommand : null;
        if (properties == null || innerProperties == null) { return; }
        String outerUserIdName = "UserId";
        String outerUserIdValue = properties.getUserId();
        String innerUserIdName = "UserId";
        String innerUserIdValue = innerProperties.getUserId();
        if (innerUserIdValue == null) {
            innerProperties.setUserId(outerUserIdValue);
        }
        else if (innerUserIdValue != outerUserIdValue && innerUserIdValue != null && !innerUserIdValue.equals(outerUserIdValue)) {
            throw DomainError.named("inconsistentId", "Outer %1$s %2$s NOT equals inner %3$s %4$s", outerUserIdName, outerUserIdValue, innerUserIdName, innerUserIdValue);
        }
    }// END throwOnInconsistentCommands /////////////////////

    protected void throwOnInconsistentCommands(UserCommand command, UserClaimCommand innerCommand)
    {
        AbstractUserCommand properties = command instanceof AbstractUserCommand ? (AbstractUserCommand) command : null;
        AbstractUserClaimCommand innerProperties = innerCommand instanceof AbstractUserClaimCommand ? (AbstractUserClaimCommand) innerCommand : null;
        if (properties == null || innerProperties == null) { return; }
        String outerUserIdName = "UserId";
        String outerUserIdValue = properties.getUserId();
        String innerUserIdName = "UserId";
        String innerUserIdValue = innerProperties.getUserId();
        if (innerUserIdValue == null) {
            innerProperties.setUserId(outerUserIdValue);
        }
        else if (innerUserIdValue != outerUserIdValue && innerUserIdValue != null && !innerUserIdValue.equals(outerUserIdValue)) {
            throw DomainError.named("inconsistentId", "Outer %1$s %2$s NOT equals inner %3$s %4$s", outerUserIdName, outerUserIdValue, innerUserIdName, innerUserIdValue);
        }
    }// END throwOnInconsistentCommands /////////////////////

    protected void throwOnInconsistentCommands(UserCommand command, UserPermissionCommand innerCommand)
    {
        AbstractUserCommand properties = command instanceof AbstractUserCommand ? (AbstractUserCommand) command : null;
        AbstractUserPermissionCommand innerProperties = innerCommand instanceof AbstractUserPermissionCommand ? (AbstractUserPermissionCommand) innerCommand : null;
        if (properties == null || innerProperties == null) { return; }
        String outerUserIdName = "UserId";
        String outerUserIdValue = properties.getUserId();
        String innerUserIdName = "UserId";
        String innerUserIdValue = innerProperties.getUserId();
        if (innerUserIdValue == null) {
            innerProperties.setUserId(outerUserIdValue);
        }
        else if (innerUserIdValue != outerUserIdValue && innerUserIdValue != null && !innerUserIdValue.equals(outerUserIdValue)) {
            throw DomainError.named("inconsistentId", "Outer %1$s %2$s NOT equals inner %3$s %4$s", outerUserIdName, outerUserIdValue, innerUserIdName, innerUserIdValue);
        }
    }// END throwOnInconsistentCommands /////////////////////

    protected void throwOnInconsistentCommands(UserCommand command, UserLoginCommand innerCommand)
    {
        AbstractUserCommand properties = command instanceof AbstractUserCommand ? (AbstractUserCommand) command : null;
        AbstractUserLoginCommand innerProperties = innerCommand instanceof AbstractUserLoginCommand ? (AbstractUserLoginCommand) innerCommand : null;
        if (properties == null || innerProperties == null) { return; }
        String outerUserIdName = "UserId";
        String outerUserIdValue = properties.getUserId();
        String innerUserIdName = "UserId";
        String innerUserIdValue = innerProperties.getUserId();
        if (innerUserIdValue == null) {
            innerProperties.setUserId(outerUserIdValue);
        }
        else if (innerUserIdValue != outerUserIdValue && innerUserIdValue != null && !innerUserIdValue.equals(outerUserIdValue)) {
            throw DomainError.named("inconsistentId", "Outer %1$s %2$s NOT equals inner %3$s %4$s", outerUserIdName, outerUserIdValue, innerUserIdName, innerUserIdValue);
        }
    }// END throwOnInconsistentCommands /////////////////////


    private static boolean isCommandCreate(UserCommand c)
    {
        return c.getVersion() == null || c.getVersion().equals(UserState.VERSION_ZERO);
    }


    ////////////////////////

    protected UserStateEvent.UserStateCreated newUserStateCreated(String commandId, String requesterId) {
        UserStateEventId stateEventId = new UserStateEventId(this.state.getUserId(), this.state.getVersion());
        UserStateEvent.UserStateCreated e = newUserStateCreated(stateEventId);
        ((AbstractUserStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected UserStateEvent.UserStateMergePatched newUserStateMergePatched(String commandId, String requesterId) {
        UserStateEventId stateEventId = new UserStateEventId(this.state.getUserId(), this.state.getVersion());
        UserStateEvent.UserStateMergePatched e = newUserStateMergePatched(stateEventId);
        ((AbstractUserStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected UserStateEvent.UserStateDeleted newUserStateDeleted(String commandId, String requesterId) {
        UserStateEventId stateEventId = new UserStateEventId(this.state.getUserId(), this.state.getVersion());
        UserStateEvent.UserStateDeleted e = newUserStateDeleted(stateEventId);
        ((AbstractUserStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected UserStateEvent.UserStateCreated newUserStateCreated(UserStateEventId stateEventId) {
        return new AbstractUserStateEvent.SimpleUserStateCreated(stateEventId);
    }

    protected UserStateEvent.UserStateMergePatched newUserStateMergePatched(UserStateEventId stateEventId) {
        return new AbstractUserStateEvent.SimpleUserStateMergePatched(stateEventId);
    }

    protected UserStateEvent.UserStateDeleted newUserStateDeleted(UserStateEventId stateEventId)
    {
        return new AbstractUserStateEvent.SimpleUserStateDeleted(stateEventId);
    }

    protected UserRoleStateEvent.UserRoleStateCreated newUserRoleStateCreated(UserRoleStateEventId stateEventId) {
        return new AbstractUserRoleStateEvent.SimpleUserRoleStateCreated(stateEventId);
    }

    protected UserRoleStateEvent.UserRoleStateMergePatched newUserRoleStateMergePatched(UserRoleStateEventId stateEventId) {
        return new AbstractUserRoleStateEvent.SimpleUserRoleStateMergePatched(stateEventId);
    }

    protected UserRoleStateEvent.UserRoleStateRemoved newUserRoleStateRemoved(UserRoleStateEventId stateEventId)
    {
        return new AbstractUserRoleStateEvent.SimpleUserRoleStateRemoved(stateEventId);
    }

    protected UserClaimStateEvent.UserClaimStateCreated newUserClaimStateCreated(UserClaimStateEventId stateEventId) {
        return new AbstractUserClaimStateEvent.SimpleUserClaimStateCreated(stateEventId);
    }

    protected UserClaimStateEvent.UserClaimStateMergePatched newUserClaimStateMergePatched(UserClaimStateEventId stateEventId) {
        return new AbstractUserClaimStateEvent.SimpleUserClaimStateMergePatched(stateEventId);
    }

    protected UserClaimStateEvent.UserClaimStateRemoved newUserClaimStateRemoved(UserClaimStateEventId stateEventId)
    {
        return new AbstractUserClaimStateEvent.SimpleUserClaimStateRemoved(stateEventId);
    }

    protected UserPermissionStateEvent.UserPermissionStateCreated newUserPermissionStateCreated(UserPermissionStateEventId stateEventId) {
        return new AbstractUserPermissionStateEvent.SimpleUserPermissionStateCreated(stateEventId);
    }

    protected UserPermissionStateEvent.UserPermissionStateMergePatched newUserPermissionStateMergePatched(UserPermissionStateEventId stateEventId) {
        return new AbstractUserPermissionStateEvent.SimpleUserPermissionStateMergePatched(stateEventId);
    }

    protected UserPermissionStateEvent.UserPermissionStateRemoved newUserPermissionStateRemoved(UserPermissionStateEventId stateEventId)
    {
        return new AbstractUserPermissionStateEvent.SimpleUserPermissionStateRemoved(stateEventId);
    }

    protected UserLoginStateEvent.UserLoginStateCreated newUserLoginStateCreated(UserLoginStateEventId stateEventId) {
        return new AbstractUserLoginStateEvent.SimpleUserLoginStateCreated(stateEventId);
    }

    protected UserLoginStateEvent.UserLoginStateMergePatched newUserLoginStateMergePatched(UserLoginStateEventId stateEventId) {
        return new AbstractUserLoginStateEvent.SimpleUserLoginStateMergePatched(stateEventId);
    }

    protected UserLoginStateEvent.UserLoginStateRemoved newUserLoginStateRemoved(UserLoginStateEventId stateEventId)
    {
        return new AbstractUserLoginStateEvent.SimpleUserLoginStateRemoved(stateEventId);
    }


    public static class SimpleUserAggregate extends AbstractUserAggregate
    {
        public SimpleUserAggregate(UserState state) {
            super(state);
        }
    }

}

