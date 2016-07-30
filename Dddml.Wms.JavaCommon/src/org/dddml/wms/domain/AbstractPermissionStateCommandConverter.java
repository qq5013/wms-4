package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;

public abstract class AbstractPermissionStateCommandConverter<TCreatePermission extends PermissionCommand.CreatePermission, TMergePatchPermission extends PermissionCommand.MergePatchPermission, TDeletePermission extends PermissionCommand.DeletePermission>
{
	public PermissionCommand toCreateOrMergePatchPermission(PermissionState state)
	{
		//where TCreatePermission : ICreatePermission, new()
		//where TMergePatchPermission : IMergePatchPermission, new()
		boolean bUnsaved = state.isStateUnsaved();
		if (bUnsaved)
		{
			return toCreatePermission(state);
		}
		else 
		{
			return toMergePatchPermission(state);
		}
	}

	public TDeletePermission toDeletePermission(PermissionState state) //where TDeletePermission : IDeletePermission, new()
	{
		TDeletePermission cmd = newDeletePermission();
		cmd.setPermissionId(state.getPermissionId());
		cmd.setVersion(state.getVersion());

		return cmd;
	}

	public TMergePatchPermission toMergePatchPermission(PermissionState state) //where TMergePatchPermission : IMergePatchPermission, new()
	{
		TMergePatchPermission cmd = newMergePatchPermission();

		cmd.setVersion(state.getVersion());

		cmd.setPermissionId(state.getPermissionId());
		cmd.setName(state.getName());
		cmd.setParentPermissionId(state.getParentPermissionId());
		cmd.setDescription(state.getDescription());
		cmd.setActive(state.getActive());
			
		if (state.getName() == null) { cmd.setIsPropertyNameRemoved(true); }
		if (state.getParentPermissionId() == null) { cmd.setIsPropertyParentPermissionIdRemoved(true); }
		if (state.getDescription() == null) { cmd.setIsPropertyDescriptionRemoved(true); }
		if (state.getActive() == null) { cmd.setIsPropertyActiveRemoved(true); }
		return cmd;
	}

	public TCreatePermission toCreatePermission(PermissionState state) //where TCreatePermission : ICreatePermission, new()
	{
		TCreatePermission cmd = newCreatePermission();

		cmd.setVersion(state.getVersion());
		cmd.setPermissionId(state.getPermissionId());
		cmd.setName(state.getName());
		cmd.setParentPermissionId(state.getParentPermissionId());
		cmd.setDescription(state.getDescription());
		cmd.setActive(state.getActive());
		return cmd;
	}

	protected abstract TCreatePermission newCreatePermission();

	protected abstract TMergePatchPermission newMergePatchPermission(); 

	protected abstract TDeletePermission newDeletePermission();

		
}

