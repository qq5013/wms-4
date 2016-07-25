package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.domain.AbstractCommand;

public abstract class AbstractUserCommand extends AbstractCommand implements UserCommand
{
    private String userId;

    public String getUserId()
    {
        return this.userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    private Long version;

    public Long getVersion()
    {
        return this.version;
    }

    public void setVersion(Long version)
    {
        this.version = version;
    }


    public static abstract class AbstractCreateOrMergePatchUser extends AbstractUserCommand implements CreateOrMergePatchUser
    {
        private String userName;

        public String getUserName()
        {
            return this.userName;
        }

        public void setUserName(String userName)
        {
            this.userName = userName;
        }

        private Integer accessFailedCount;

        public Integer getAccessFailedCount()
        {
            return this.accessFailedCount;
        }

        public void setAccessFailedCount(Integer accessFailedCount)
        {
            this.accessFailedCount = accessFailedCount;
        }

        private String email;

        public String getEmail()
        {
            return this.email;
        }

        public void setEmail(String email)
        {
            this.email = email;
        }

        private Boolean emailConfirmed;

        public Boolean getEmailConfirmed()
        {
            return this.emailConfirmed;
        }

        public void setEmailConfirmed(Boolean emailConfirmed)
        {
            this.emailConfirmed = emailConfirmed;
        }

        private Boolean lockoutEnabled;

        public Boolean getLockoutEnabled()
        {
            return this.lockoutEnabled;
        }

        public void setLockoutEnabled(Boolean lockoutEnabled)
        {
            this.lockoutEnabled = lockoutEnabled;
        }

        private Date lockoutEndDateUtc;

        public Date getLockoutEndDateUtc()
        {
            return this.lockoutEndDateUtc;
        }

        public void setLockoutEndDateUtc(Date lockoutEndDateUtc)
        {
            this.lockoutEndDateUtc = lockoutEndDateUtc;
        }

        private String passwordHash;

        public String getPasswordHash()
        {
            return this.passwordHash;
        }

        public void setPasswordHash(String passwordHash)
        {
            this.passwordHash = passwordHash;
        }

        private String phoneNumber;

        public String getPhoneNumber()
        {
            return this.phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber)
        {
            this.phoneNumber = phoneNumber;
        }

        private Boolean phoneNumberConfirmed;

        public Boolean getPhoneNumberConfirmed()
        {
            return this.phoneNumberConfirmed;
        }

        public void setPhoneNumberConfirmed(Boolean phoneNumberConfirmed)
        {
            this.phoneNumberConfirmed = phoneNumberConfirmed;
        }

        private Boolean twoFactorEnabled;

        public Boolean getTwoFactorEnabled()
        {
            return this.twoFactorEnabled;
        }

        public void setTwoFactorEnabled(Boolean twoFactorEnabled)
        {
            this.twoFactorEnabled = twoFactorEnabled;
        }

        private String securityStamp;

        public String getSecurityStamp()
        {
            return this.securityStamp;
        }

        public void setSecurityStamp(String securityStamp)
        {
            this.securityStamp = securityStamp;
        }

        private Boolean active;

        public Boolean getActive()
        {
            return this.active;
        }

        public void setActive(Boolean active)
        {
            this.active = active;
        }

        public UserRoleCommand.CreateUserRole newCreateUserRole()
        {
            AbstractUserRoleCommand.SimpleCreateUserRole c = new AbstractUserRoleCommand.SimpleCreateUserRole();
            c.setUserId(this.getUserId());

            return c;
        }

        public UserRoleCommand.MergePatchUserRole newMergePatchUserRole()
        {
            AbstractUserRoleCommand.SimpleMergePatchUserRole c = new AbstractUserRoleCommand.SimpleMergePatchUserRole();
            c.setUserId(this.getUserId());

            return c;
        }

        public UserRoleCommand.RemoveUserRole newRemoveUserRole()
        {
            AbstractUserRoleCommand.SimpleRemoveUserRole c = new AbstractUserRoleCommand.SimpleRemoveUserRole();
            c.setUserId(this.getUserId());

            return c;
        }

        public UserClaimCommand.CreateUserClaim newCreateUserClaim()
        {
            AbstractUserClaimCommand.SimpleCreateUserClaim c = new AbstractUserClaimCommand.SimpleCreateUserClaim();
            c.setUserId(this.getUserId());

            return c;
        }

        public UserClaimCommand.MergePatchUserClaim newMergePatchUserClaim()
        {
            AbstractUserClaimCommand.SimpleMergePatchUserClaim c = new AbstractUserClaimCommand.SimpleMergePatchUserClaim();
            c.setUserId(this.getUserId());

            return c;
        }

        public UserClaimCommand.RemoveUserClaim newRemoveUserClaim()
        {
            AbstractUserClaimCommand.SimpleRemoveUserClaim c = new AbstractUserClaimCommand.SimpleRemoveUserClaim();
            c.setUserId(this.getUserId());

            return c;
        }

        public UserPermissionCommand.CreateUserPermission newCreateUserPermission()
        {
            AbstractUserPermissionCommand.SimpleCreateUserPermission c = new AbstractUserPermissionCommand.SimpleCreateUserPermission();
            c.setUserId(this.getUserId());

            return c;
        }

        public UserPermissionCommand.MergePatchUserPermission newMergePatchUserPermission()
        {
            AbstractUserPermissionCommand.SimpleMergePatchUserPermission c = new AbstractUserPermissionCommand.SimpleMergePatchUserPermission();
            c.setUserId(this.getUserId());

            return c;
        }

        public UserPermissionCommand.RemoveUserPermission newRemoveUserPermission()
        {
            AbstractUserPermissionCommand.SimpleRemoveUserPermission c = new AbstractUserPermissionCommand.SimpleRemoveUserPermission();
            c.setUserId(this.getUserId());

            return c;
        }

        public UserLoginCommand.CreateUserLogin newCreateUserLogin()
        {
            AbstractUserLoginCommand.SimpleCreateUserLogin c = new AbstractUserLoginCommand.SimpleCreateUserLogin();
            c.setUserId(this.getUserId());

            return c;
        }

        public UserLoginCommand.MergePatchUserLogin newMergePatchUserLogin()
        {
            AbstractUserLoginCommand.SimpleMergePatchUserLogin c = new AbstractUserLoginCommand.SimpleMergePatchUserLogin();
            c.setUserId(this.getUserId());

            return c;
        }

        public UserLoginCommand.RemoveUserLogin newRemoveUserLogin()
        {
            AbstractUserLoginCommand.SimpleRemoveUserLogin c = new AbstractUserLoginCommand.SimpleRemoveUserLogin();
            c.setUserId(this.getUserId());

            return c;
        }

    }

    public static abstract class AbstractCreateUser extends AbstractCreateOrMergePatchUser implements CreateUser
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_CREATE;
        }

        private CreateUserRoleCommands userRoles = new SimpleCreateUserRoleCommands();

        public CreateUserRoleCommands getUserRoles()
        {
            return this.userRoles;
        }

        private CreateUserClaimCommands userClaims = new SimpleCreateUserClaimCommands();

        public CreateUserClaimCommands getUserClaims()
        {
            return this.userClaims;
        }

        private CreateUserPermissionCommands userPermissions = new SimpleCreateUserPermissionCommands();

        public CreateUserPermissionCommands getUserPermissions()
        {
            return this.userPermissions;
        }

        private CreateUserLoginCommands userLogins = new SimpleCreateUserLoginCommands();

        public CreateUserLoginCommands getUserLogins()
        {
            return this.userLogins;
        }

    }

    public static abstract class AbstractMergePatchUser extends AbstractCreateOrMergePatchUser implements MergePatchUser
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_MERGE_PATCH;
        }

        private Boolean isPropertyUserNameRemoved;

        public Boolean getIsPropertyUserNameRemoved()
        {
            return this.isPropertyUserNameRemoved;
        }

        public void setIsPropertyUserNameRemoved(Boolean removed)
        {
            this.isPropertyUserNameRemoved = removed;
        }

        private Boolean isPropertyAccessFailedCountRemoved;

        public Boolean getIsPropertyAccessFailedCountRemoved()
        {
            return this.isPropertyAccessFailedCountRemoved;
        }

        public void setIsPropertyAccessFailedCountRemoved(Boolean removed)
        {
            this.isPropertyAccessFailedCountRemoved = removed;
        }

        private Boolean isPropertyEmailRemoved;

        public Boolean getIsPropertyEmailRemoved()
        {
            return this.isPropertyEmailRemoved;
        }

        public void setIsPropertyEmailRemoved(Boolean removed)
        {
            this.isPropertyEmailRemoved = removed;
        }

        private Boolean isPropertyEmailConfirmedRemoved;

        public Boolean getIsPropertyEmailConfirmedRemoved()
        {
            return this.isPropertyEmailConfirmedRemoved;
        }

        public void setIsPropertyEmailConfirmedRemoved(Boolean removed)
        {
            this.isPropertyEmailConfirmedRemoved = removed;
        }

        private Boolean isPropertyLockoutEnabledRemoved;

        public Boolean getIsPropertyLockoutEnabledRemoved()
        {
            return this.isPropertyLockoutEnabledRemoved;
        }

        public void setIsPropertyLockoutEnabledRemoved(Boolean removed)
        {
            this.isPropertyLockoutEnabledRemoved = removed;
        }

        private Boolean isPropertyLockoutEndDateUtcRemoved;

        public Boolean getIsPropertyLockoutEndDateUtcRemoved()
        {
            return this.isPropertyLockoutEndDateUtcRemoved;
        }

        public void setIsPropertyLockoutEndDateUtcRemoved(Boolean removed)
        {
            this.isPropertyLockoutEndDateUtcRemoved = removed;
        }

        private Boolean isPropertyPasswordHashRemoved;

        public Boolean getIsPropertyPasswordHashRemoved()
        {
            return this.isPropertyPasswordHashRemoved;
        }

        public void setIsPropertyPasswordHashRemoved(Boolean removed)
        {
            this.isPropertyPasswordHashRemoved = removed;
        }

        private Boolean isPropertyPhoneNumberRemoved;

        public Boolean getIsPropertyPhoneNumberRemoved()
        {
            return this.isPropertyPhoneNumberRemoved;
        }

        public void setIsPropertyPhoneNumberRemoved(Boolean removed)
        {
            this.isPropertyPhoneNumberRemoved = removed;
        }

        private Boolean isPropertyPhoneNumberConfirmedRemoved;

        public Boolean getIsPropertyPhoneNumberConfirmedRemoved()
        {
            return this.isPropertyPhoneNumberConfirmedRemoved;
        }

        public void setIsPropertyPhoneNumberConfirmedRemoved(Boolean removed)
        {
            this.isPropertyPhoneNumberConfirmedRemoved = removed;
        }

        private Boolean isPropertyTwoFactorEnabledRemoved;

        public Boolean getIsPropertyTwoFactorEnabledRemoved()
        {
            return this.isPropertyTwoFactorEnabledRemoved;
        }

        public void setIsPropertyTwoFactorEnabledRemoved(Boolean removed)
        {
            this.isPropertyTwoFactorEnabledRemoved = removed;
        }

        private Boolean isPropertySecurityStampRemoved;

        public Boolean getIsPropertySecurityStampRemoved()
        {
            return this.isPropertySecurityStampRemoved;
        }

        public void setIsPropertySecurityStampRemoved(Boolean removed)
        {
            this.isPropertySecurityStampRemoved = removed;
        }

        private Boolean isPropertyActiveRemoved;

        public Boolean getIsPropertyActiveRemoved()
        {
            return this.isPropertyActiveRemoved;
        }

        public void setIsPropertyActiveRemoved(Boolean removed)
        {
            this.isPropertyActiveRemoved = removed;
        }

        private UserRoleCommands userRoleCommands = new SimpleUserRoleCommands();

        public UserRoleCommands getUserRoleCommands()
        {
            return this.userRoleCommands;
        }

        private UserClaimCommands userClaimCommands = new SimpleUserClaimCommands();

        public UserClaimCommands getUserClaimCommands()
        {
            return this.userClaimCommands;
        }

        private UserPermissionCommands userPermissionCommands = new SimpleUserPermissionCommands();

        public UserPermissionCommands getUserPermissionCommands()
        {
            return this.userPermissionCommands;
        }

        private UserLoginCommands userLoginCommands = new SimpleUserLoginCommands();

        public UserLoginCommands getUserLoginCommands()
        {
            return this.userLoginCommands;
        }

    }

    public static class SimpleCreateUser extends AbstractCreateUser
    {
    }

    public static class SimpleMergePatchUser extends AbstractMergePatchUser
    {
    }

	public static class SimpleDeleteUser extends AbstractUserCommand implements DeleteUser
	{
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_DELETE;
        }
	}

    public static class SimpleCreateUserRoleCommands implements CreateUserRoleCommands
    {
        private List<UserRoleCommand.CreateUserRole> innerCommands = new ArrayList<UserRoleCommand.CreateUserRole>();

        public void add(UserRoleCommand.CreateUserRole c)
        {
            innerCommands.add(c);
        }

        public void remove(UserRoleCommand.CreateUserRole c)
        {
            innerCommands.remove(c);
        }

        public void clear()
        {
            innerCommands.clear();
        }

        @Override
        public Iterator<UserRoleCommand.CreateUserRole> iterator()
        {
            return innerCommands.iterator();
        }
    }

    public static class SimpleUserRoleCommands implements UserRoleCommands
    {
        private List<UserRoleCommand> innerCommands = new ArrayList<UserRoleCommand>();

        public void add(UserRoleCommand c)
        {
            innerCommands.add(c);
        }

        public void remove(UserRoleCommand c)
        {
            innerCommands.remove(c);
        }

        public void clear()
        {
            innerCommands.clear();
        }

        @Override
        public Iterator<UserRoleCommand> iterator()
        {
            return innerCommands.iterator();
        }
    }

    public static class SimpleCreateUserClaimCommands implements CreateUserClaimCommands
    {
        private List<UserClaimCommand.CreateUserClaim> innerCommands = new ArrayList<UserClaimCommand.CreateUserClaim>();

        public void add(UserClaimCommand.CreateUserClaim c)
        {
            innerCommands.add(c);
        }

        public void remove(UserClaimCommand.CreateUserClaim c)
        {
            innerCommands.remove(c);
        }

        public void clear()
        {
            innerCommands.clear();
        }

        @Override
        public Iterator<UserClaimCommand.CreateUserClaim> iterator()
        {
            return innerCommands.iterator();
        }
    }

    public static class SimpleUserClaimCommands implements UserClaimCommands
    {
        private List<UserClaimCommand> innerCommands = new ArrayList<UserClaimCommand>();

        public void add(UserClaimCommand c)
        {
            innerCommands.add(c);
        }

        public void remove(UserClaimCommand c)
        {
            innerCommands.remove(c);
        }

        public void clear()
        {
            innerCommands.clear();
        }

        @Override
        public Iterator<UserClaimCommand> iterator()
        {
            return innerCommands.iterator();
        }
    }

    public static class SimpleCreateUserPermissionCommands implements CreateUserPermissionCommands
    {
        private List<UserPermissionCommand.CreateUserPermission> innerCommands = new ArrayList<UserPermissionCommand.CreateUserPermission>();

        public void add(UserPermissionCommand.CreateUserPermission c)
        {
            innerCommands.add(c);
        }

        public void remove(UserPermissionCommand.CreateUserPermission c)
        {
            innerCommands.remove(c);
        }

        public void clear()
        {
            innerCommands.clear();
        }

        @Override
        public Iterator<UserPermissionCommand.CreateUserPermission> iterator()
        {
            return innerCommands.iterator();
        }
    }

    public static class SimpleUserPermissionCommands implements UserPermissionCommands
    {
        private List<UserPermissionCommand> innerCommands = new ArrayList<UserPermissionCommand>();

        public void add(UserPermissionCommand c)
        {
            innerCommands.add(c);
        }

        public void remove(UserPermissionCommand c)
        {
            innerCommands.remove(c);
        }

        public void clear()
        {
            innerCommands.clear();
        }

        @Override
        public Iterator<UserPermissionCommand> iterator()
        {
            return innerCommands.iterator();
        }
    }

    public static class SimpleCreateUserLoginCommands implements CreateUserLoginCommands
    {
        private List<UserLoginCommand.CreateUserLogin> innerCommands = new ArrayList<UserLoginCommand.CreateUserLogin>();

        public void add(UserLoginCommand.CreateUserLogin c)
        {
            innerCommands.add(c);
        }

        public void remove(UserLoginCommand.CreateUserLogin c)
        {
            innerCommands.remove(c);
        }

        public void clear()
        {
            innerCommands.clear();
        }

        @Override
        public Iterator<UserLoginCommand.CreateUserLogin> iterator()
        {
            return innerCommands.iterator();
        }
    }

    public static class SimpleUserLoginCommands implements UserLoginCommands
    {
        private List<UserLoginCommand> innerCommands = new ArrayList<UserLoginCommand>();

        public void add(UserLoginCommand c)
        {
            innerCommands.add(c);
        }

        public void remove(UserLoginCommand c)
        {
            innerCommands.remove(c);
        }

        public void clear()
        {
            innerCommands.clear();
        }

        @Override
        public Iterator<UserLoginCommand> iterator()
        {
            return innerCommands.iterator();
        }
    }


}

