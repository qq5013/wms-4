package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;

public abstract class AbstractRoleStateCommandConverter<TCreateRole extends RoleCommand.CreateRole, TMergePatchRole extends RoleCommand.MergePatchRole, TDeleteRole extends RoleCommand.DeleteRole>
{
	public RoleCommand toCreateOrMergePatchRole(RoleState state)
	{
		//where TCreateRole : ICreateRole, new()
		//where TMergePatchRole : IMergePatchRole, new()
		boolean bUnsaved = state.isStateUnsaved();
		if (bUnsaved)
		{
			return toCreateRole(state);
		}
		else 
		{
			return toMergePatchRole(state);
		}
	}

	public TDeleteRole toDeleteRole(RoleState state) //where TDeleteRole : IDeleteRole, new()
	{
		TDeleteRole cmd = newDeleteRole();
		cmd.setRoleId(state.getRoleId());
		cmd.setVersion(state.getVersion());

		return cmd;
	}

	public TMergePatchRole toMergePatchRole(RoleState state) //where TMergePatchRole : IMergePatchRole, new()
	{
		TMergePatchRole cmd = newMergePatchRole();

		cmd.setVersion(state.getVersion());

		cmd.setRoleId(state.getRoleId());
		cmd.setName(state.getName());
		cmd.setDescription(state.getDescription());
		cmd.setActive(state.getActive());
			
		if (state.getName() == null) { cmd.setIsPropertyNameRemoved(true); }
		if (state.getDescription() == null) { cmd.setIsPropertyDescriptionRemoved(true); }
		if (state.getActive() == null) { cmd.setIsPropertyActiveRemoved(true); }
		return cmd;
	}

	public TCreateRole toCreateRole(RoleState state) //where TCreateRole : ICreateRole, new()
	{
		TCreateRole cmd = newCreateRole();

		cmd.setVersion(state.getVersion());
		cmd.setRoleId(state.getRoleId());
		cmd.setName(state.getName());
		cmd.setDescription(state.getDescription());
		cmd.setActive(state.getActive());
		return cmd;
	}

	protected abstract TCreateRole newCreateRole();

	protected abstract TMergePatchRole newMergePatchRole(); 

	protected abstract TDeleteRole newDeleteRole();

		
}

