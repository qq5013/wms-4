package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;

public abstract class AbstractUserRoleMvoStateCommandConverter<TCreateUserRoleMvo extends UserRoleMvoCommand.CreateUserRoleMvo, TMergePatchUserRoleMvo extends UserRoleMvoCommand.MergePatchUserRoleMvo, TDeleteUserRoleMvo extends UserRoleMvoCommand.DeleteUserRoleMvo>
{
	public UserRoleMvoCommand toCreateOrMergePatchUserRoleMvo(UserRoleMvoState state)
	{
		//where TCreateUserRoleMvo : ICreateUserRoleMvo, new()
		//where TMergePatchUserRoleMvo : IMergePatchUserRoleMvo, new()
		boolean bUnsaved = state.isStateUnsaved();
		if (bUnsaved)
		{
			return toCreateUserRoleMvo(state);
		}
		else 
		{
			return toMergePatchUserRoleMvo(state);
		}
	}

	public TDeleteUserRoleMvo toDeleteUserRoleMvo(UserRoleMvoState state) //where TDeleteUserRoleMvo : IDeleteUserRoleMvo, new()
	{
		TDeleteUserRoleMvo cmd = newDeleteUserRoleMvo();
		cmd.setUserRoleId(state.getUserRoleId());
		cmd.setUserVersion(state.getUserVersion());

		return cmd;
	}

	public TMergePatchUserRoleMvo toMergePatchUserRoleMvo(UserRoleMvoState state) //where TMergePatchUserRoleMvo : IMergePatchUserRoleMvo, new()
	{
		TMergePatchUserRoleMvo cmd = newMergePatchUserRoleMvo();

		cmd.setUserVersion(state.getUserVersion());

		cmd.setUserRoleId(state.getUserRoleId());
		cmd.setVersion(state.getVersion());
		cmd.setActive(state.getActive());
		cmd.setUserUserName(state.getUserUserName());
		cmd.setUserAccessFailedCount(state.getUserAccessFailedCount());
		cmd.setUserEmail(state.getUserEmail());
		cmd.setUserEmailConfirmed(state.getUserEmailConfirmed());
		cmd.setUserLockoutEnabled(state.getUserLockoutEnabled());
		cmd.setUserLockoutEndDateUtc(state.getUserLockoutEndDateUtc());
		cmd.setUserPasswordHash(state.getUserPasswordHash());
		cmd.setUserPhoneNumber(state.getUserPhoneNumber());
		cmd.setUserPhoneNumberConfirmed(state.getUserPhoneNumberConfirmed());
		cmd.setUserTwoFactorEnabled(state.getUserTwoFactorEnabled());
		cmd.setUserSecurityStamp(state.getUserSecurityStamp());
		cmd.setUserCreatedBy(state.getUserCreatedBy());
		cmd.setUserCreatedAt(state.getUserCreatedAt());
		cmd.setUserUpdatedBy(state.getUserUpdatedBy());
		cmd.setUserUpdatedAt(state.getUserUpdatedAt());
		cmd.setUserActive(state.getUserActive());
		cmd.setUserDeleted(state.getUserDeleted());
			
		if (state.getVersion() == null) { cmd.setIsPropertyVersionRemoved(true); }
		if (state.getActive() == null) { cmd.setIsPropertyActiveRemoved(true); }
		if (state.getUserUserName() == null) { cmd.setIsPropertyUserUserNameRemoved(true); }
		if (state.getUserAccessFailedCount() == null) { cmd.setIsPropertyUserAccessFailedCountRemoved(true); }
		if (state.getUserEmail() == null) { cmd.setIsPropertyUserEmailRemoved(true); }
		if (state.getUserEmailConfirmed() == null) { cmd.setIsPropertyUserEmailConfirmedRemoved(true); }
		if (state.getUserLockoutEnabled() == null) { cmd.setIsPropertyUserLockoutEnabledRemoved(true); }
		if (state.getUserLockoutEndDateUtc() == null) { cmd.setIsPropertyUserLockoutEndDateUtcRemoved(true); }
		if (state.getUserPasswordHash() == null) { cmd.setIsPropertyUserPasswordHashRemoved(true); }
		if (state.getUserPhoneNumber() == null) { cmd.setIsPropertyUserPhoneNumberRemoved(true); }
		if (state.getUserPhoneNumberConfirmed() == null) { cmd.setIsPropertyUserPhoneNumberConfirmedRemoved(true); }
		if (state.getUserTwoFactorEnabled() == null) { cmd.setIsPropertyUserTwoFactorEnabledRemoved(true); }
		if (state.getUserSecurityStamp() == null) { cmd.setIsPropertyUserSecurityStampRemoved(true); }
		if (state.getUserCreatedBy() == null) { cmd.setIsPropertyUserCreatedByRemoved(true); }
		if (state.getUserCreatedAt() == null) { cmd.setIsPropertyUserCreatedAtRemoved(true); }
		if (state.getUserUpdatedBy() == null) { cmd.setIsPropertyUserUpdatedByRemoved(true); }
		if (state.getUserUpdatedAt() == null) { cmd.setIsPropertyUserUpdatedAtRemoved(true); }
		if (state.getUserActive() == null) { cmd.setIsPropertyUserActiveRemoved(true); }
		if (state.getUserDeleted() == null) { cmd.setIsPropertyUserDeletedRemoved(true); }
		return cmd;
	}

	public TCreateUserRoleMvo toCreateUserRoleMvo(UserRoleMvoState state) //where TCreateUserRoleMvo : ICreateUserRoleMvo, new()
	{
		TCreateUserRoleMvo cmd = newCreateUserRoleMvo();

		cmd.setUserVersion(state.getUserVersion());
		cmd.setUserRoleId(state.getUserRoleId());
		cmd.setVersion(state.getVersion());
		cmd.setActive(state.getActive());
		cmd.setUserUserName(state.getUserUserName());
		cmd.setUserAccessFailedCount(state.getUserAccessFailedCount());
		cmd.setUserEmail(state.getUserEmail());
		cmd.setUserEmailConfirmed(state.getUserEmailConfirmed());
		cmd.setUserLockoutEnabled(state.getUserLockoutEnabled());
		cmd.setUserLockoutEndDateUtc(state.getUserLockoutEndDateUtc());
		cmd.setUserPasswordHash(state.getUserPasswordHash());
		cmd.setUserPhoneNumber(state.getUserPhoneNumber());
		cmd.setUserPhoneNumberConfirmed(state.getUserPhoneNumberConfirmed());
		cmd.setUserTwoFactorEnabled(state.getUserTwoFactorEnabled());
		cmd.setUserSecurityStamp(state.getUserSecurityStamp());
		cmd.setUserCreatedBy(state.getUserCreatedBy());
		cmd.setUserCreatedAt(state.getUserCreatedAt());
		cmd.setUserUpdatedBy(state.getUserUpdatedBy());
		cmd.setUserUpdatedAt(state.getUserUpdatedAt());
		cmd.setUserActive(state.getUserActive());
		cmd.setUserDeleted(state.getUserDeleted());
		return cmd;
	}

	protected abstract TCreateUserRoleMvo newCreateUserRoleMvo();

	protected abstract TMergePatchUserRoleMvo newMergePatchUserRoleMvo(); 

	protected abstract TDeleteUserRoleMvo newDeleteUserRoleMvo();

		
}

