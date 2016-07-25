package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.Command;

public interface UserCommand extends Command
{
    String getUserId();

    Long getVersion();


    interface CreateOrMergePatchUser extends UserCommand
    {
        String getUserName();

        Integer getAccessFailedCount();

        String getEmail();

        Boolean getEmailConfirmed();

        Boolean getLockoutEnabled();

        Date getLockoutEndDateUtc();

        String getPasswordHash();

        String getPhoneNumber();

        Boolean getPhoneNumberConfirmed();

        Boolean getTwoFactorEnabled();

        String getSecurityStamp();

        Boolean getActive();

    }

    interface CreateUser extends CreateOrMergePatchUser
    {
        CreateUserRoleCommands getUserRoles();

        UserRoleCommand.CreateUserRole newCreateUserRole();

        CreateUserClaimCommands getUserClaims();

        UserClaimCommand.CreateUserClaim newCreateUserClaim();

        CreateUserPermissionCommands getUserPermissions();

        UserPermissionCommand.CreateUserPermission newCreateUserPermission();

        CreateUserLoginCommands getUserLogins();

        UserLoginCommand.CreateUserLogin newCreateUserLogin();

    }

    interface MergePatchUser extends CreateOrMergePatchUser
    {
        Boolean getIsPropertyUserNameRemoved();

        Boolean getIsPropertyAccessFailedCountRemoved();

        Boolean getIsPropertyEmailRemoved();

        Boolean getIsPropertyEmailConfirmedRemoved();

        Boolean getIsPropertyLockoutEnabledRemoved();

        Boolean getIsPropertyLockoutEndDateUtcRemoved();

        Boolean getIsPropertyPasswordHashRemoved();

        Boolean getIsPropertyPhoneNumberRemoved();

        Boolean getIsPropertyPhoneNumberConfirmedRemoved();

        Boolean getIsPropertyTwoFactorEnabledRemoved();

        Boolean getIsPropertySecurityStampRemoved();

        Boolean getIsPropertyActiveRemoved();

        UserRoleCommands getUserRoleCommands();

        UserRoleCommand.CreateUserRole newCreateUserRole();

        UserRoleCommand.MergePatchUserRole newMergePatchUserRole();

        UserRoleCommand.RemoveUserRole newRemoveUserRole();

        UserClaimCommands getUserClaimCommands();

        UserClaimCommand.CreateUserClaim newCreateUserClaim();

        UserClaimCommand.MergePatchUserClaim newMergePatchUserClaim();

        UserClaimCommand.RemoveUserClaim newRemoveUserClaim();

        UserPermissionCommands getUserPermissionCommands();

        UserPermissionCommand.CreateUserPermission newCreateUserPermission();

        UserPermissionCommand.MergePatchUserPermission newMergePatchUserPermission();

        UserPermissionCommand.RemoveUserPermission newRemoveUserPermission();

        UserLoginCommands getUserLoginCommands();

        UserLoginCommand.CreateUserLogin newCreateUserLogin();

        UserLoginCommand.MergePatchUserLogin newMergePatchUserLogin();

        UserLoginCommand.RemoveUserLogin newRemoveUserLogin();

    }

	interface DeleteUser extends UserCommand
	{
	}

    interface CreateUserRoleCommands extends Iterable<UserRoleCommand.CreateUserRole>
    {
        void add(UserRoleCommand.CreateUserRole c);

        void remove(UserRoleCommand.CreateUserRole c);

        void clear();
    }

    interface UserRoleCommands extends Iterable<UserRoleCommand>
    {
        void add(UserRoleCommand c);

        void remove(UserRoleCommand c);

        void clear();
    }

    interface CreateUserClaimCommands extends Iterable<UserClaimCommand.CreateUserClaim>
    {
        void add(UserClaimCommand.CreateUserClaim c);

        void remove(UserClaimCommand.CreateUserClaim c);

        void clear();
    }

    interface UserClaimCommands extends Iterable<UserClaimCommand>
    {
        void add(UserClaimCommand c);

        void remove(UserClaimCommand c);

        void clear();
    }

    interface CreateUserPermissionCommands extends Iterable<UserPermissionCommand.CreateUserPermission>
    {
        void add(UserPermissionCommand.CreateUserPermission c);

        void remove(UserPermissionCommand.CreateUserPermission c);

        void clear();
    }

    interface UserPermissionCommands extends Iterable<UserPermissionCommand>
    {
        void add(UserPermissionCommand c);

        void remove(UserPermissionCommand c);

        void clear();
    }

    interface CreateUserLoginCommands extends Iterable<UserLoginCommand.CreateUserLogin>
    {
        void add(UserLoginCommand.CreateUserLogin c);

        void remove(UserLoginCommand.CreateUserLogin c);

        void clear();
    }

    interface UserLoginCommands extends Iterable<UserLoginCommand>
    {
        void add(UserLoginCommand c);

        void remove(UserLoginCommand c);

        void clear();
    }

}

