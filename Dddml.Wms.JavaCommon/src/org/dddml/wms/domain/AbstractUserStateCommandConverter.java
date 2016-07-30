package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;

public abstract class AbstractUserStateCommandConverter<TCreateUser extends UserCommand.CreateUser, TMergePatchUser extends UserCommand.MergePatchUser, TDeleteUser extends UserCommand.DeleteUser, TCreateUserRole extends UserRoleCommand.CreateUserRole, TMergePatchUserRole extends UserRoleCommand.MergePatchUserRole, TRemoveUserRole extends UserRoleCommand.RemoveUserRole, TCreateUserClaim extends UserClaimCommand.CreateUserClaim, TMergePatchUserClaim extends UserClaimCommand.MergePatchUserClaim, TRemoveUserClaim extends UserClaimCommand.RemoveUserClaim, TCreateUserPermission extends UserPermissionCommand.CreateUserPermission, TMergePatchUserPermission extends UserPermissionCommand.MergePatchUserPermission, TRemoveUserPermission extends UserPermissionCommand.RemoveUserPermission, TCreateUserLogin extends UserLoginCommand.CreateUserLogin, TMergePatchUserLogin extends UserLoginCommand.MergePatchUserLogin, TRemoveUserLogin extends UserLoginCommand.RemoveUserLogin>
{
	public UserCommand toCreateOrMergePatchUser(UserState state)
	{
		//where TCreateUser : ICreateUser, new()
		//where TMergePatchUser : IMergePatchUser, new()
		boolean bUnsaved = state.isStateUnsaved();
		if (bUnsaved)
		{
			return toCreateUser(state);
		}
		else 
		{
			return toMergePatchUser(state);
		}
	}

	public TDeleteUser toDeleteUser(UserState state) //where TDeleteUser : IDeleteUser, new()
	{
		TDeleteUser cmd = newDeleteUser();
		cmd.setUserId(state.getUserId());
		cmd.setVersion(state.getVersion());

		return cmd;
	}

	public TMergePatchUser toMergePatchUser(UserState state) //where TMergePatchUser : IMergePatchUser, new()
	{
		TMergePatchUser cmd = newMergePatchUser();

		cmd.setVersion(state.getVersion());

		cmd.setUserId(state.getUserId());
		cmd.setUserName(state.getUserName());
		cmd.setAccessFailedCount(state.getAccessFailedCount());
		cmd.setEmail(state.getEmail());
		cmd.setEmailConfirmed(state.getEmailConfirmed());
		cmd.setLockoutEnabled(state.getLockoutEnabled());
		cmd.setLockoutEndDateUtc(state.getLockoutEndDateUtc());
		cmd.setPasswordHash(state.getPasswordHash());
		cmd.setPhoneNumber(state.getPhoneNumber());
		cmd.setPhoneNumberConfirmed(state.getPhoneNumberConfirmed());
		cmd.setTwoFactorEnabled(state.getTwoFactorEnabled());
		cmd.setSecurityStamp(state.getSecurityStamp());
		cmd.setActive(state.getActive());
			
		if (state.getUserName() == null) { cmd.setIsPropertyUserNameRemoved(true); }
		if (state.getAccessFailedCount() == null) { cmd.setIsPropertyAccessFailedCountRemoved(true); }
		if (state.getEmail() == null) { cmd.setIsPropertyEmailRemoved(true); }
		if (state.getEmailConfirmed() == null) { cmd.setIsPropertyEmailConfirmedRemoved(true); }
		if (state.getLockoutEnabled() == null) { cmd.setIsPropertyLockoutEnabledRemoved(true); }
		if (state.getLockoutEndDateUtc() == null) { cmd.setIsPropertyLockoutEndDateUtcRemoved(true); }
		if (state.getPasswordHash() == null) { cmd.setIsPropertyPasswordHashRemoved(true); }
		if (state.getPhoneNumber() == null) { cmd.setIsPropertyPhoneNumberRemoved(true); }
		if (state.getPhoneNumberConfirmed() == null) { cmd.setIsPropertyPhoneNumberConfirmedRemoved(true); }
		if (state.getTwoFactorEnabled() == null) { cmd.setIsPropertyTwoFactorEnabledRemoved(true); }
		if (state.getSecurityStamp() == null) { cmd.setIsPropertySecurityStampRemoved(true); }
		if (state.getActive() == null) { cmd.setIsPropertyActiveRemoved(true); }
		for (UserRoleState d : state.getUserRoles())
		{
			//TODO ...
			UserRoleCommand c = null;//d.ToCreateOrMergePatchUserRole<TCreateUserRole, TMergePatchUserRole>();
			cmd.getUserRoleCommands().add(c);
		}
		for (UserClaimState d : state.getUserClaims())
		{
			//TODO ...
			UserClaimCommand c = null;//d.ToCreateOrMergePatchUserClaim<TCreateUserClaim, TMergePatchUserClaim>();
			cmd.getUserClaimCommands().add(c);
		}
		for (UserPermissionState d : state.getUserPermissions())
		{
			//TODO ...
			UserPermissionCommand c = null;//d.ToCreateOrMergePatchUserPermission<TCreateUserPermission, TMergePatchUserPermission>();
			cmd.getUserPermissionCommands().add(c);
		}
		for (UserLoginState d : state.getUserLogins())
		{
			//TODO ...
			UserLoginCommand c = null;//d.ToCreateOrMergePatchUserLogin<TCreateUserLogin, TMergePatchUserLogin>();
			cmd.getUserLoginCommands().add(c);
		}
		return cmd;
	}

	public TCreateUser toCreateUser(UserState state) //where TCreateUser : ICreateUser, new()
	{
		TCreateUser cmd = newCreateUser();

		cmd.setVersion(state.getVersion());
		cmd.setUserId(state.getUserId());
		cmd.setUserName(state.getUserName());
		cmd.setAccessFailedCount(state.getAccessFailedCount());
		cmd.setEmail(state.getEmail());
		cmd.setEmailConfirmed(state.getEmailConfirmed());
		cmd.setLockoutEnabled(state.getLockoutEnabled());
		cmd.setLockoutEndDateUtc(state.getLockoutEndDateUtc());
		cmd.setPasswordHash(state.getPasswordHash());
		cmd.setPhoneNumber(state.getPhoneNumber());
		cmd.setPhoneNumberConfirmed(state.getPhoneNumberConfirmed());
		cmd.setTwoFactorEnabled(state.getTwoFactorEnabled());
		cmd.setSecurityStamp(state.getSecurityStamp());
		cmd.setActive(state.getActive());
		for (UserRoleState d : state.getUserRoles())
		{
			//TODO ...
			UserRoleCommand.CreateUserRole c = null;//d.ToCreateUserRole<TCreateUserRole>();
			cmd.getUserRoles().add(c);
		}
		for (UserClaimState d : state.getUserClaims())
		{
			//TODO ...
			UserClaimCommand.CreateUserClaim c = null;//d.ToCreateUserClaim<TCreateUserClaim>();
			cmd.getUserClaims().add(c);
		}
		for (UserPermissionState d : state.getUserPermissions())
		{
			//TODO ...
			UserPermissionCommand.CreateUserPermission c = null;//d.ToCreateUserPermission<TCreateUserPermission>();
			cmd.getUserPermissions().add(c);
		}
		for (UserLoginState d : state.getUserLogins())
		{
			//TODO ...
			UserLoginCommand.CreateUserLogin c = null;//d.ToCreateUserLogin<TCreateUserLogin>();
			cmd.getUserLogins().add(c);
		}
		return cmd;
	}

	protected abstract TCreateUser newCreateUser();

	protected abstract TMergePatchUser newMergePatchUser(); 

	protected abstract TDeleteUser newDeleteUser();

		
}

