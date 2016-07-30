package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;

public abstract class AbstractUserPermissionStateCommandConverter<TCreateUserPermission extends UserPermissionCommand.CreateUserPermission, TMergePatchUserPermission extends UserPermissionCommand.MergePatchUserPermission, TRemoveUserPermission extends UserPermissionCommand.RemoveUserPermission>
{
	public UserPermissionCommand toCreateOrMergePatchUserPermission(UserPermissionState state)
	{
		//where TCreateUserPermission : ICreateUserPermission, new()
		//where TMergePatchUserPermission : IMergePatchUserPermission, new()
		boolean bUnsaved = state.isStateUnsaved();
		if (bUnsaved)
		{
			return toCreateUserPermission(state);
		}
		else 
		{
			return toMergePatchUserPermission(state);
		}
	}

	public TRemoveUserPermission toRemoveUserPermission(UserPermissionState state) //where TRemoveUserPermission : IRemoveUserPermission, new()
	{
		TRemoveUserPermission cmd = newRemoveUserPermission();
		cmd.setPermissionId(state.getPermissionId());
		return cmd;
	}

	public TMergePatchUserPermission toMergePatchUserPermission(UserPermissionState state) //where TMergePatchUserPermission : IMergePatchUserPermission, new()
	{
		TMergePatchUserPermission cmd = newMergePatchUserPermission();

		cmd.setPermissionId(state.getPermissionId());
		cmd.setActive(state.getActive());
		cmd.setUserId(state.getUserId());
			
		if (state.getActive() == null) { cmd.setIsPropertyActiveRemoved(true); }
		return cmd;
	}

	public TCreateUserPermission toCreateUserPermission(UserPermissionState state) //where TCreateUserPermission : ICreateUserPermission, new()
	{
		TCreateUserPermission cmd = newCreateUserPermission();

		cmd.setPermissionId(state.getPermissionId());
		cmd.setActive(state.getActive());
		cmd.setUserId(state.getUserId());
		return cmd;
	}

	protected abstract TCreateUserPermission newCreateUserPermission();

	protected abstract TMergePatchUserPermission newMergePatchUserPermission(); 

	protected abstract TRemoveUserPermission newRemoveUserPermission();

		
}

