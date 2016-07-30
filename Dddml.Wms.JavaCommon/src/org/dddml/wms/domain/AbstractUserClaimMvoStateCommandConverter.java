package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;

public abstract class AbstractUserClaimMvoStateCommandConverter<TCreateUserClaimMvo extends UserClaimMvoCommand.CreateUserClaimMvo, TMergePatchUserClaimMvo extends UserClaimMvoCommand.MergePatchUserClaimMvo, TDeleteUserClaimMvo extends UserClaimMvoCommand.DeleteUserClaimMvo>
{
	public UserClaimMvoCommand toCreateOrMergePatchUserClaimMvo(UserClaimMvoState state)
	{
		//where TCreateUserClaimMvo : ICreateUserClaimMvo, new()
		//where TMergePatchUserClaimMvo : IMergePatchUserClaimMvo, new()
		boolean bUnsaved = state.isStateUnsaved();
		if (bUnsaved)
		{
			return toCreateUserClaimMvo(state);
		}
		else 
		{
			return toMergePatchUserClaimMvo(state);
		}
	}

	public TDeleteUserClaimMvo toDeleteUserClaimMvo(UserClaimMvoState state) //where TDeleteUserClaimMvo : IDeleteUserClaimMvo, new()
	{
		TDeleteUserClaimMvo cmd = newDeleteUserClaimMvo();
		cmd.setUserClaimId(state.getUserClaimId());
		cmd.setUserVersion(state.getUserVersion());

		return cmd;
	}

	public TMergePatchUserClaimMvo toMergePatchUserClaimMvo(UserClaimMvoState state) //where TMergePatchUserClaimMvo : IMergePatchUserClaimMvo, new()
	{
		TMergePatchUserClaimMvo cmd = newMergePatchUserClaimMvo();

		cmd.setUserVersion(state.getUserVersion());

		cmd.setUserClaimId(state.getUserClaimId());
		cmd.setClaimType(state.getClaimType());
		cmd.setClaimValue(state.getClaimValue());
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
			
		if (state.getClaimType() == null) { cmd.setIsPropertyClaimTypeRemoved(true); }
		if (state.getClaimValue() == null) { cmd.setIsPropertyClaimValueRemoved(true); }
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

	public TCreateUserClaimMvo toCreateUserClaimMvo(UserClaimMvoState state) //where TCreateUserClaimMvo : ICreateUserClaimMvo, new()
	{
		TCreateUserClaimMvo cmd = newCreateUserClaimMvo();

		cmd.setUserVersion(state.getUserVersion());
		cmd.setUserClaimId(state.getUserClaimId());
		cmd.setClaimType(state.getClaimType());
		cmd.setClaimValue(state.getClaimValue());
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

	protected abstract TCreateUserClaimMvo newCreateUserClaimMvo();

	protected abstract TMergePatchUserClaimMvo newMergePatchUserClaimMvo(); 

	protected abstract TDeleteUserClaimMvo newDeleteUserClaimMvo();

		
}

