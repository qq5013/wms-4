package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;

public abstract class AbstractUserClaimStateCommandConverter<TCreateUserClaim extends UserClaimCommand.CreateUserClaim, TMergePatchUserClaim extends UserClaimCommand.MergePatchUserClaim, TRemoveUserClaim extends UserClaimCommand.RemoveUserClaim>
{
	public UserClaimCommand toCreateOrMergePatchUserClaim(UserClaimState state)
	{
		//where TCreateUserClaim : ICreateUserClaim, new()
		//where TMergePatchUserClaim : IMergePatchUserClaim, new()
		boolean bUnsaved = state.isStateUnsaved();
		if (bUnsaved)
		{
			return toCreateUserClaim(state);
		}
		else 
		{
			return toMergePatchUserClaim(state);
		}
	}

	public TRemoveUserClaim toRemoveUserClaim(UserClaimState state) //where TRemoveUserClaim : IRemoveUserClaim, new()
	{
		TRemoveUserClaim cmd = newRemoveUserClaim();
		cmd.setClaimId(state.getClaimId());
		return cmd;
	}

	public TMergePatchUserClaim toMergePatchUserClaim(UserClaimState state) //where TMergePatchUserClaim : IMergePatchUserClaim, new()
	{
		TMergePatchUserClaim cmd = newMergePatchUserClaim();

		cmd.setClaimId(state.getClaimId());
		cmd.setClaimType(state.getClaimType());
		cmd.setClaimValue(state.getClaimValue());
		cmd.setActive(state.getActive());
		cmd.setUserId(state.getUserId());
			
		if (state.getClaimType() == null) { cmd.setIsPropertyClaimTypeRemoved(true); }
		if (state.getClaimValue() == null) { cmd.setIsPropertyClaimValueRemoved(true); }
		if (state.getActive() == null) { cmd.setIsPropertyActiveRemoved(true); }
		return cmd;
	}

	public TCreateUserClaim toCreateUserClaim(UserClaimState state) //where TCreateUserClaim : ICreateUserClaim, new()
	{
		TCreateUserClaim cmd = newCreateUserClaim();

		cmd.setClaimId(state.getClaimId());
		cmd.setClaimType(state.getClaimType());
		cmd.setClaimValue(state.getClaimValue());
		cmd.setActive(state.getActive());
		cmd.setUserId(state.getUserId());
		return cmd;
	}

	protected abstract TCreateUserClaim newCreateUserClaim();

	protected abstract TMergePatchUserClaim newMergePatchUserClaim(); 

	protected abstract TRemoveUserClaim newRemoveUserClaim();

		
}

