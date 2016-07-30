package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;

public abstract class AbstractLocatorStateCommandConverter<TCreateLocator extends LocatorCommand.CreateLocator, TMergePatchLocator extends LocatorCommand.MergePatchLocator, TDeleteLocator extends LocatorCommand.DeleteLocator>
{
	public LocatorCommand toCreateOrMergePatchLocator(LocatorState state)
	{
		//where TCreateLocator : ICreateLocator, new()
		//where TMergePatchLocator : IMergePatchLocator, new()
		boolean bUnsaved = state.isStateUnsaved();
		if (bUnsaved)
		{
			return toCreateLocator(state);
		}
		else 
		{
			return toMergePatchLocator(state);
		}
	}

	public TDeleteLocator toDeleteLocator(LocatorState state) //where TDeleteLocator : IDeleteLocator, new()
	{
		TDeleteLocator cmd = newDeleteLocator();
		cmd.setLocatorId(state.getLocatorId());
		cmd.setVersion(state.getVersion());

		return cmd;
	}

	public TMergePatchLocator toMergePatchLocator(LocatorState state) //where TMergePatchLocator : IMergePatchLocator, new()
	{
		TMergePatchLocator cmd = newMergePatchLocator();

		cmd.setVersion(state.getVersion());

		cmd.setLocatorId(state.getLocatorId());
		cmd.setWarehouseId(state.getWarehouseId());
		cmd.setParentLocatorId(state.getParentLocatorId());
		cmd.setLocatorType(state.getLocatorType());
		cmd.setPriorityNumber(state.getPriorityNumber());
		cmd.setIsDefault(state.getIsDefault());
		cmd.setX(state.getX());
		cmd.setY(state.getY());
		cmd.setZ(state.getZ());
		cmd.setActive(state.getActive());
			
		if (state.getWarehouseId() == null) { cmd.setIsPropertyWarehouseIdRemoved(true); }
		if (state.getParentLocatorId() == null) { cmd.setIsPropertyParentLocatorIdRemoved(true); }
		if (state.getLocatorType() == null) { cmd.setIsPropertyLocatorTypeRemoved(true); }
		if (state.getPriorityNumber() == null) { cmd.setIsPropertyPriorityNumberRemoved(true); }
		if (state.getIsDefault() == null) { cmd.setIsPropertyIsDefaultRemoved(true); }
		if (state.getX() == null) { cmd.setIsPropertyXRemoved(true); }
		if (state.getY() == null) { cmd.setIsPropertyYRemoved(true); }
		if (state.getZ() == null) { cmd.setIsPropertyZRemoved(true); }
		if (state.getActive() == null) { cmd.setIsPropertyActiveRemoved(true); }
		return cmd;
	}

	public TCreateLocator toCreateLocator(LocatorState state) //where TCreateLocator : ICreateLocator, new()
	{
		TCreateLocator cmd = newCreateLocator();

		cmd.setVersion(state.getVersion());
		cmd.setLocatorId(state.getLocatorId());
		cmd.setWarehouseId(state.getWarehouseId());
		cmd.setParentLocatorId(state.getParentLocatorId());
		cmd.setLocatorType(state.getLocatorType());
		cmd.setPriorityNumber(state.getPriorityNumber());
		cmd.setIsDefault(state.getIsDefault());
		cmd.setX(state.getX());
		cmd.setY(state.getY());
		cmd.setZ(state.getZ());
		cmd.setActive(state.getActive());
		return cmd;
	}

	protected abstract TCreateLocator newCreateLocator();

	protected abstract TMergePatchLocator newMergePatchLocator(); 

	protected abstract TDeleteLocator newDeleteLocator();

		
}

