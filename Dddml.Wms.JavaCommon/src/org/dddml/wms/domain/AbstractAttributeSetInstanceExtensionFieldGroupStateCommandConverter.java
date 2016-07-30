package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;

public abstract class AbstractAttributeSetInstanceExtensionFieldGroupStateCommandConverter<TCreateAttributeSetInstanceExtensionFieldGroup extends AttributeSetInstanceExtensionFieldGroupCommand.CreateAttributeSetInstanceExtensionFieldGroup, TMergePatchAttributeSetInstanceExtensionFieldGroup extends AttributeSetInstanceExtensionFieldGroupCommand.MergePatchAttributeSetInstanceExtensionFieldGroup, TDeleteAttributeSetInstanceExtensionFieldGroup extends AttributeSetInstanceExtensionFieldGroupCommand.DeleteAttributeSetInstanceExtensionFieldGroup, TCreateAttributeSetInstanceExtensionField extends AttributeSetInstanceExtensionFieldCommand.CreateAttributeSetInstanceExtensionField, TMergePatchAttributeSetInstanceExtensionField extends AttributeSetInstanceExtensionFieldCommand.MergePatchAttributeSetInstanceExtensionField, TRemoveAttributeSetInstanceExtensionField extends AttributeSetInstanceExtensionFieldCommand.RemoveAttributeSetInstanceExtensionField>
{
	public AttributeSetInstanceExtensionFieldGroupCommand toCreateOrMergePatchAttributeSetInstanceExtensionFieldGroup(AttributeSetInstanceExtensionFieldGroupState state)
	{
		//where TCreateAttributeSetInstanceExtensionFieldGroup : ICreateAttributeSetInstanceExtensionFieldGroup, new()
		//where TMergePatchAttributeSetInstanceExtensionFieldGroup : IMergePatchAttributeSetInstanceExtensionFieldGroup, new()
		boolean bUnsaved = state.isStateUnsaved();
		if (bUnsaved)
		{
			return toCreateAttributeSetInstanceExtensionFieldGroup(state);
		}
		else 
		{
			return toMergePatchAttributeSetInstanceExtensionFieldGroup(state);
		}
	}

	public TDeleteAttributeSetInstanceExtensionFieldGroup toDeleteAttributeSetInstanceExtensionFieldGroup(AttributeSetInstanceExtensionFieldGroupState state) //where TDeleteAttributeSetInstanceExtensionFieldGroup : IDeleteAttributeSetInstanceExtensionFieldGroup, new()
	{
		TDeleteAttributeSetInstanceExtensionFieldGroup cmd = newDeleteAttributeSetInstanceExtensionFieldGroup();
		cmd.setId(state.getId());
		cmd.setVersion(state.getVersion());

		return cmd;
	}

	public TMergePatchAttributeSetInstanceExtensionFieldGroup toMergePatchAttributeSetInstanceExtensionFieldGroup(AttributeSetInstanceExtensionFieldGroupState state) //where TMergePatchAttributeSetInstanceExtensionFieldGroup : IMergePatchAttributeSetInstanceExtensionFieldGroup, new()
	{
		TMergePatchAttributeSetInstanceExtensionFieldGroup cmd = newMergePatchAttributeSetInstanceExtensionFieldGroup();

		cmd.setVersion(state.getVersion());

		cmd.setId(state.getId());
		cmd.setFieldType(state.getFieldType());
		cmd.setFieldLength(state.getFieldLength());
		cmd.setFieldCount(state.getFieldCount());
		cmd.setNameFormat(state.getNameFormat());
		cmd.setDescription(state.getDescription());
		cmd.setActive(state.getActive());
			
		if (state.getFieldType() == null) { cmd.setIsPropertyFieldTypeRemoved(true); }
		if (state.getFieldLength() == null) { cmd.setIsPropertyFieldLengthRemoved(true); }
		if (state.getFieldCount() == null) { cmd.setIsPropertyFieldCountRemoved(true); }
		if (state.getNameFormat() == null) { cmd.setIsPropertyNameFormatRemoved(true); }
		if (state.getDescription() == null) { cmd.setIsPropertyDescriptionRemoved(true); }
		if (state.getActive() == null) { cmd.setIsPropertyActiveRemoved(true); }
		for (AttributeSetInstanceExtensionFieldState d : state.getFields())
		{
			//TODO ...
			AttributeSetInstanceExtensionFieldCommand c = null;//d.ToCreateOrMergePatchAttributeSetInstanceExtensionField<TCreateAttributeSetInstanceExtensionField, TMergePatchAttributeSetInstanceExtensionField>();
			cmd.getAttributeSetInstanceExtensionFieldCommands().add(c);
		}
		return cmd;
	}

	public TCreateAttributeSetInstanceExtensionFieldGroup toCreateAttributeSetInstanceExtensionFieldGroup(AttributeSetInstanceExtensionFieldGroupState state) //where TCreateAttributeSetInstanceExtensionFieldGroup : ICreateAttributeSetInstanceExtensionFieldGroup, new()
	{
		TCreateAttributeSetInstanceExtensionFieldGroup cmd = newCreateAttributeSetInstanceExtensionFieldGroup();

		cmd.setVersion(state.getVersion());
		cmd.setId(state.getId());
		cmd.setFieldType(state.getFieldType());
		cmd.setFieldLength(state.getFieldLength());
		cmd.setFieldCount(state.getFieldCount());
		cmd.setNameFormat(state.getNameFormat());
		cmd.setDescription(state.getDescription());
		cmd.setActive(state.getActive());
		for (AttributeSetInstanceExtensionFieldState d : state.getFields())
		{
			//TODO ...
			AttributeSetInstanceExtensionFieldCommand.CreateAttributeSetInstanceExtensionField c = null;//d.ToCreateAttributeSetInstanceExtensionField<TCreateAttributeSetInstanceExtensionField>();
			cmd.getFields().add(c);
		}
		return cmd;
	}

	protected abstract TCreateAttributeSetInstanceExtensionFieldGroup newCreateAttributeSetInstanceExtensionFieldGroup();

	protected abstract TMergePatchAttributeSetInstanceExtensionFieldGroup newMergePatchAttributeSetInstanceExtensionFieldGroup(); 

	protected abstract TDeleteAttributeSetInstanceExtensionFieldGroup newDeleteAttributeSetInstanceExtensionFieldGroup();

		
}

