package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;

public abstract class AbstractRolePermissionStateCommandConverter<TCreateRolePermission extends RolePermissionCommand.CreateRolePermission, TMergePatchRolePermission extends RolePermissionCommand.MergePatchRolePermission, TDeleteRolePermission extends RolePermissionCommand.DeleteRolePermission>
{
	public RolePermissionCommand toCreateOrMergePatchRolePermission(RolePermissionState state)
	{
		//where TCreateRolePermission : ICreateRolePermission, new()
		//where TMergePatchRolePermission : IMergePatchRolePermission, new()
		boolean bUnsaved = state.isStateUnsaved();
		if (bUnsaved)
		{
			return toCreateRolePermission(state);
		}
		else 
		{
			return toMergePatchRolePermission(state);
		}
	}

	public TDeleteRolePermission toDeleteRolePermission(RolePermissionState state) //where TDeleteRolePermission : IDeleteRolePermission, new()
	{
		TDeleteRolePermission cmd = newDeleteRolePermission();
		cmd.setId(state.getId());
		cmd.setVersion(state.getVersion());

		return cmd;
	}

	public TMergePatchRolePermission toMergePatchRolePermission(RolePermissionState state) //where TMergePatchRolePermission : IMergePatchRolePermission, new()
	{
		TMergePatchRolePermission cmd = newMergePatchRolePermission();

		cmd.setVersion(state.getVersion());

		cmd.setId(state.getId());
		cmd.setActive(state.getActive());
			
		if (state.getActive() == null) { cmd.setIsPropertyActiveRemoved(true); }
		return cmd;
	}

	public TCreateRolePermission toCreateRolePermission(RolePermissionState state) //where TCreateRolePermission : ICreateRolePermission, new()
	{
		TCreateRolePermission cmd = newCreateRolePermission();

		cmd.setVersion(state.getVersion());
		cmd.setId(state.getId());
		cmd.setActive(state.getActive());
		return cmd;
	}

	protected abstract TCreateRolePermission newCreateRolePermission();

	protected abstract TMergePatchRolePermission newMergePatchRolePermission(); 

	protected abstract TDeleteRolePermission newDeleteRolePermission();

		
}

