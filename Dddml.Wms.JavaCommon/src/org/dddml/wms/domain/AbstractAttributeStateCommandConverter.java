package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;

public abstract class AbstractAttributeStateCommandConverter<TCreateAttribute extends AttributeCommand.CreateAttribute, TMergePatchAttribute extends AttributeCommand.MergePatchAttribute, TDeleteAttribute extends AttributeCommand.DeleteAttribute, TCreateAttributeValue extends AttributeValueCommand.CreateAttributeValue, TMergePatchAttributeValue extends AttributeValueCommand.MergePatchAttributeValue, TRemoveAttributeValue extends AttributeValueCommand.RemoveAttributeValue>
{
	public AttributeCommand toCreateOrMergePatchAttribute(AttributeState state)
	{
		//where TCreateAttribute : ICreateAttribute, new()
		//where TMergePatchAttribute : IMergePatchAttribute, new()
		boolean bUnsaved = state.isStateUnsaved();
		if (bUnsaved)
		{
			return toCreateAttribute(state);
		}
		else 
		{
			return toMergePatchAttribute(state);
		}
	}

	public TDeleteAttribute toDeleteAttribute(AttributeState state) //where TDeleteAttribute : IDeleteAttribute, new()
	{
		TDeleteAttribute cmd = newDeleteAttribute();
		cmd.setAttributeId(state.getAttributeId());
		cmd.setVersion(state.getVersion());

		return cmd;
	}

	public TMergePatchAttribute toMergePatchAttribute(AttributeState state) //where TMergePatchAttribute : IMergePatchAttribute, new()
	{
		TMergePatchAttribute cmd = newMergePatchAttribute();

		cmd.setVersion(state.getVersion());

		cmd.setAttributeId(state.getAttributeId());
		cmd.setName(state.getName());
		cmd.setOrganizationId(state.getOrganizationId());
		cmd.setDescription(state.getDescription());
		cmd.setIsMandatory(state.getIsMandatory());
		cmd.setIsInstanceAttribute(state.getIsInstanceAttribute());
		cmd.setAttributeValueType(state.getAttributeValueType());
		cmd.setAttributeValueLength(state.getAttributeValueLength());
		cmd.setIsList(state.getIsList());
		cmd.setFieldName(state.getFieldName());
		cmd.setReferenceId(state.getReferenceId());
		cmd.setActive(state.getActive());
			
		if (state.getName() == null) { cmd.setIsPropertyNameRemoved(true); }
		if (state.getOrganizationId() == null) { cmd.setIsPropertyOrganizationIdRemoved(true); }
		if (state.getDescription() == null) { cmd.setIsPropertyDescriptionRemoved(true); }
		if (state.getIsMandatory() == null) { cmd.setIsPropertyIsMandatoryRemoved(true); }
		if (state.getIsInstanceAttribute() == null) { cmd.setIsPropertyIsInstanceAttributeRemoved(true); }
		if (state.getAttributeValueType() == null) { cmd.setIsPropertyAttributeValueTypeRemoved(true); }
		if (state.getAttributeValueLength() == null) { cmd.setIsPropertyAttributeValueLengthRemoved(true); }
		if (state.getIsList() == null) { cmd.setIsPropertyIsListRemoved(true); }
		if (state.getFieldName() == null) { cmd.setIsPropertyFieldNameRemoved(true); }
		if (state.getReferenceId() == null) { cmd.setIsPropertyReferenceIdRemoved(true); }
		if (state.getActive() == null) { cmd.setIsPropertyActiveRemoved(true); }
		for (AttributeValueState d : state.getAttributeValues())
		{
			//TODO ...
			AttributeValueCommand c = null;//d.ToCreateOrMergePatchAttributeValue<TCreateAttributeValue, TMergePatchAttributeValue>();
			cmd.getAttributeValueCommands().add(c);
		}
		return cmd;
	}

	public TCreateAttribute toCreateAttribute(AttributeState state) //where TCreateAttribute : ICreateAttribute, new()
	{
		TCreateAttribute cmd = newCreateAttribute();

		cmd.setVersion(state.getVersion());
		cmd.setAttributeId(state.getAttributeId());
		cmd.setName(state.getName());
		cmd.setOrganizationId(state.getOrganizationId());
		cmd.setDescription(state.getDescription());
		cmd.setIsMandatory(state.getIsMandatory());
		cmd.setIsInstanceAttribute(state.getIsInstanceAttribute());
		cmd.setAttributeValueType(state.getAttributeValueType());
		cmd.setAttributeValueLength(state.getAttributeValueLength());
		cmd.setIsList(state.getIsList());
		cmd.setFieldName(state.getFieldName());
		cmd.setReferenceId(state.getReferenceId());
		cmd.setActive(state.getActive());
		for (AttributeValueState d : state.getAttributeValues())
		{
			//TODO ...
			AttributeValueCommand.CreateAttributeValue c = null;//d.ToCreateAttributeValue<TCreateAttributeValue>();
			cmd.getAttributeValues().add(c);
		}
		return cmd;
	}

	protected abstract TCreateAttribute newCreateAttribute();

	protected abstract TMergePatchAttribute newMergePatchAttribute(); 

	protected abstract TDeleteAttribute newDeleteAttribute();

		
}

