package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.Command;

public interface UserCommand extends Command
{
    String getUserId();

    void setUserId(String userId);

    Long getVersion();

    void setVersion(Long version);


    interface CreateOrMergePatchUser extends UserCommand
    {
        String getUserName();

        void setUserName(String userName);

        Integer getAccessFailedCount();

        void setAccessFailedCount(Integer accessFailedCount);

        String getEmail();

        void setEmail(String email);

        Boolean getEmailConfirmed();

        void setEmailConfirmed(Boolean emailConfirmed);

        Boolean getLockoutEnabled();

        void setLockoutEnabled(Boolean lockoutEnabled);

        Date getLockoutEndDateUtc();

        void setLockoutEndDateUtc(Date lockoutEndDateUtc);

        String getPasswordHash();

        void setPasswordHash(String passwordHash);

        String getPhoneNumber();

        void setPhoneNumber(String phoneNumber);

        Boolean getPhoneNumberConfirmed();

        void setPhoneNumberConfirmed(Boolean phoneNumberConfirmed);

        Boolean getTwoFactorEnabled();

        void setTwoFactorEnabled(Boolean twoFactorEnabled);

        String getSecurityStamp();

        void setSecurityStamp(String securityStamp);

        Boolean getActive();

        void setActive(Boolean active);

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

        void setIsPropertyUserNameRemoved(Boolean removed);

        Boolean getIsPropertyAccessFailedCountRemoved();

        void setIsPropertyAccessFailedCountRemoved(Boolean removed);

        Boolean getIsPropertyEmailRemoved();

        void setIsPropertyEmailRemoved(Boolean removed);

        Boolean getIsPropertyEmailConfirmedRemoved();

        void setIsPropertyEmailConfirmedRemoved(Boolean removed);

        Boolean getIsPropertyLockoutEnabledRemoved();

        void setIsPropertyLockoutEnabledRemoved(Boolean removed);

        Boolean getIsPropertyLockoutEndDateUtcRemoved();

        void setIsPropertyLockoutEndDateUtcRemoved(Boolean removed);

        Boolean getIsPropertyPasswordHashRemoved();

        void setIsPropertyPasswordHashRemoved(Boolean removed);

        Boolean getIsPropertyPhoneNumberRemoved();

        void setIsPropertyPhoneNumberRemoved(Boolean removed);

        Boolean getIsPropertyPhoneNumberConfirmedRemoved();

        void setIsPropertyPhoneNumberConfirmedRemoved(Boolean removed);

        Boolean getIsPropertyTwoFactorEnabledRemoved();

        void setIsPropertyTwoFactorEnabledRemoved(Boolean removed);

        Boolean getIsPropertySecurityStampRemoved();

        void setIsPropertySecurityStampRemoved(Boolean removed);

        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);

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

