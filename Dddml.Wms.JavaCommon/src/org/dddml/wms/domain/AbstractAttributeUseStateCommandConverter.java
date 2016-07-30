package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;

public abstract class AbstractAttributeUseStateCommandConverter<TCreateAttributeUse extends AttributeUseCommand.CreateAttributeUse, TMergePatchAttributeUse extends AttributeUseCommand.MergePatchAttributeUse, TRemoveAttributeUse extends AttributeUseCommand.RemoveAttributeUse>
{
	public AttributeUseCommand toCreateOrMergePatchAttributeUse(AttributeUseState state)
	{
		//where TCreateAttributeUse : ICreateAttributeUse, new()
		//where TMergePatchAttributeUse : IMergePatchAttributeUse, new()
		boolean bUnsaved = state.isStateUnsaved();
		if (bUnsaved)
		{
			return toCreateAttributeUse(state);
		}
		else 
		{
			return toMergePatchAttributeUse(state);
		}
	}

	public TRemoveAttributeUse toRemoveAttributeUse(AttributeUseState state) //where TRemoveAttributeUse : IRemoveAttributeUse, new()
	{
		TRemoveAttributeUse cmd = newRemoveAttributeUse();
		cmd.setAttributeId(state.getAttributeId());
		return cmd;
	}

	public TMergePatchAttributeUse toMergePatchAttributeUse(AttributeUseState state) //where TMergePatchAttributeUse : IMergePatchAttributeUse, new()
	{
		TMergePatchAttributeUse cmd = newMergePatchAttributeUse();

		cmd.setAttributeId(state.getAttributeId());
		cmd.setSequenceNumber(state.getSequenceNumber());
		cmd.setActive(state.getActive());
		cmd.setAttributeSetId(state.getAttributeSetId());
			
		if (state.getSequenceNumber() == null) { cmd.setIsPropertySequenceNumberRemoved(true); }
		if (state.getActive() == null) { cmd.setIsPropertyActiveRemoved(true); }
		return cmd;
	}

	public TCreateAttributeUse toCreateAttributeUse(AttributeUseState state) //where TCreateAttributeUse : ICreateAttributeUse, new()
	{
		TCreateAttributeUse cmd = newCreateAttributeUse();

		cmd.setAttributeId(state.getAttributeId());
		cmd.setSequenceNumber(state.getSequenceNumber());
		cmd.setActive(state.getActive());
		cmd.setAttributeSetId(state.getAttributeSetId());
		return cmd;
	}

	protected abstract TCreateAttributeUse newCreateAttributeUse();

	protected abstract TMergePatchAttributeUse newMergePatchAttributeUse(); 

	protected abstract TRemoveAttributeUse newRemoveAttributeUse();

		
}

