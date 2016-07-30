package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;

public abstract class AbstractAttributeSetInstanceExtensionFieldMvoStateCommandConverter<TCreateAttributeSetInstanceExtensionFieldMvo extends AttributeSetInstanceExtensionFieldMvoCommand.CreateAttributeSetInstanceExtensionFieldMvo, TMergePatchAttributeSetInstanceExtensionFieldMvo extends AttributeSetInstanceExtensionFieldMvoCommand.MergePatchAttributeSetInstanceExtensionFieldMvo, TDeleteAttributeSetInstanceExtensionFieldMvo extends AttributeSetInstanceExtensionFieldMvoCommand.DeleteAttributeSetInstanceExtensionFieldMvo>
{
	public AttributeSetInstanceExtensionFieldMvoCommand toCreateOrMergePatchAttributeSetInstanceExtensionFieldMvo(AttributeSetInstanceExtensionFieldMvoState state)
	{
		//where TCreateAttributeSetInstanceExtensionFieldMvo : ICreateAttributeSetInstanceExtensionFieldMvo, new()
		//where TMergePatchAttributeSetInstanceExtensionFieldMvo : IMergePatchAttributeSetInstanceExtensionFieldMvo, new()
		boolean bUnsaved = state.isStateUnsaved();
		if (bUnsaved)
		{
			return toCreateAttributeSetInstanceExtensionFieldMvo(state);
		}
		else 
		{
			return toMergePatchAttributeSetInstanceExtensionFieldMvo(state);
		}
	}

	public TDeleteAttributeSetInstanceExtensionFieldMvo toDeleteAttributeSetInstanceExtensionFieldMvo(AttributeSetInstanceExtensionFieldMvoState state) //where TDeleteAttributeSetInstanceExtensionFieldMvo : IDeleteAttributeSetInstanceExtensionFieldMvo, new()
	{
		TDeleteAttributeSetInstanceExtensionFieldMvo cmd = newDeleteAttributeSetInstanceExtensionFieldMvo();
		cmd.setAttributeSetInstanceExtensionFieldId(state.getAttributeSetInstanceExtensionFieldId());
		cmd.setAttrSetInstEFGroupVersion(state.getAttrSetInstEFGroupVersion());

		return cmd;
	}

	public TMergePatchAttributeSetInstanceExtensionFieldMvo toMergePatchAttributeSetInstanceExtensionFieldMvo(AttributeSetInstanceExtensionFieldMvoState state) //where TMergePatchAttributeSetInstanceExtensionFieldMvo : IMergePatchAttributeSetInstanceExtensionFieldMvo, new()
	{
		TMergePatchAttributeSetInstanceExtensionFieldMvo cmd = newMergePatchAttributeSetInstanceExtensionFieldMvo();

		cmd.setAttrSetInstEFGroupVersion(state.getAttrSetInstEFGroupVersion());

		cmd.setAttributeSetInstanceExtensionFieldId(state.getAttributeSetInstanceExtensionFieldId());
		cmd.setName(state.getName());
		cmd.setType(state.getType());
		cmd.setLength(state.getLength());
		cmd.setAlias(state.getAlias());
		cmd.setDescription(state.getDescription());
		cmd.setVersion(state.getVersion());
		cmd.setActive(state.getActive());
		cmd.setAttrSetInstEFGroupFieldType(state.getAttrSetInstEFGroupFieldType());
		cmd.setAttrSetInstEFGroupFieldLength(state.getAttrSetInstEFGroupFieldLength());
		cmd.setAttrSetInstEFGroupFieldCount(state.getAttrSetInstEFGroupFieldCount());
		cmd.setAttrSetInstEFGroupNameFormat(state.getAttrSetInstEFGroupNameFormat());
		cmd.setAttrSetInstEFGroupDescription(state.getAttrSetInstEFGroupDescription());
		cmd.setAttrSetInstEFGroupCreatedBy(state.getAttrSetInstEFGroupCreatedBy());
		cmd.setAttrSetInstEFGroupCreatedAt(state.getAttrSetInstEFGroupCreatedAt());
		cmd.setAttrSetInstEFGroupUpdatedBy(state.getAttrSetInstEFGroupUpdatedBy());
		cmd.setAttrSetInstEFGroupUpdatedAt(state.getAttrSetInstEFGroupUpdatedAt());
		cmd.setAttrSetInstEFGroupActive(state.getAttrSetInstEFGroupActive());
		cmd.setAttrSetInstEFGroupDeleted(state.getAttrSetInstEFGroupDeleted());
			
		if (state.getName() == null) { cmd.setIsPropertyNameRemoved(true); }
		if (state.getType() == null) { cmd.setIsPropertyTypeRemoved(true); }
		if (state.getLength() == null) { cmd.setIsPropertyLengthRemoved(true); }
		if (state.getAlias() == null) { cmd.setIsPropertyAliasRemoved(true); }
		if (state.getDescription() == null) { cmd.setIsPropertyDescriptionRemoved(true); }
		if (state.getVersion() == null) { cmd.setIsPropertyVersionRemoved(true); }
		if (state.getActive() == null) { cmd.setIsPropertyActiveRemoved(true); }
		if (state.getAttrSetInstEFGroupFieldType() == null) { cmd.setIsPropertyAttrSetInstEFGroupFieldTypeRemoved(true); }
		if (state.getAttrSetInstEFGroupFieldLength() == null) { cmd.setIsPropertyAttrSetInstEFGroupFieldLengthRemoved(true); }
		if (state.getAttrSetInstEFGroupFieldCount() == null) { cmd.setIsPropertyAttrSetInstEFGroupFieldCountRemoved(true); }
		if (state.getAttrSetInstEFGroupNameFormat() == null) { cmd.setIsPropertyAttrSetInstEFGroupNameFormatRemoved(true); }
		if (state.getAttrSetInstEFGroupDescription() == null) { cmd.setIsPropertyAttrSetInstEFGroupDescriptionRemoved(true); }
		if (state.getAttrSetInstEFGroupCreatedBy() == null) { cmd.setIsPropertyAttrSetInstEFGroupCreatedByRemoved(true); }
		if (state.getAttrSetInstEFGroupCreatedAt() == null) { cmd.setIsPropertyAttrSetInstEFGroupCreatedAtRemoved(true); }
		if (state.getAttrSetInstEFGroupUpdatedBy() == null) { cmd.setIsPropertyAttrSetInstEFGroupUpdatedByRemoved(true); }
		if (state.getAttrSetInstEFGroupUpdatedAt() == null) { cmd.setIsPropertyAttrSetInstEFGroupUpdatedAtRemoved(true); }
		if (state.getAttrSetInstEFGroupActive() == null) { cmd.setIsPropertyAttrSetInstEFGroupActiveRemoved(true); }
		if (state.getAttrSetInstEFGroupDeleted() == null) { cmd.setIsPropertyAttrSetInstEFGroupDeletedRemoved(true); }
		return cmd;
	}

	public TCreateAttributeSetInstanceExtensionFieldMvo toCreateAttributeSetInstanceExtensionFieldMvo(AttributeSetInstanceExtensionFieldMvoState state) //where TCreateAttributeSetInstanceExtensionFieldMvo : ICreateAttributeSetInstanceExtensionFieldMvo, new()
	{
		TCreateAttributeSetInstanceExtensionFieldMvo cmd = newCreateAttributeSetInstanceExtensionFieldMvo();

		cmd.setAttrSetInstEFGroupVersion(state.getAttrSetInstEFGroupVersion());
		cmd.setAttributeSetInstanceExtensionFieldId(state.getAttributeSetInstanceExtensionFieldId());
		cmd.setName(state.getName());
		cmd.setType(state.getType());
		cmd.setLength(state.getLength());
		cmd.setAlias(state.getAlias());
		cmd.setDescription(state.getDescription());
		cmd.setVersion(state.getVersion());
		cmd.setActive(state.getActive());
		cmd.setAttrSetInstEFGroupFieldType(state.getAttrSetInstEFGroupFieldType());
		cmd.setAttrSetInstEFGroupFieldLength(state.getAttrSetInstEFGroupFieldLength());
		cmd.setAttrSetInstEFGroupFieldCount(state.getAttrSetInstEFGroupFieldCount());
		cmd.setAttrSetInstEFGroupNameFormat(state.getAttrSetInstEFGroupNameFormat());
		cmd.setAttrSetInstEFGroupDescription(state.getAttrSetInstEFGroupDescription());
		cmd.setAttrSetInstEFGroupCreatedBy(state.getAttrSetInstEFGroupCreatedBy());
		cmd.setAttrSetInstEFGroupCreatedAt(state.getAttrSetInstEFGroupCreatedAt());
		cmd.setAttrSetInstEFGroupUpdatedBy(state.getAttrSetInstEFGroupUpdatedBy());
		cmd.setAttrSetInstEFGroupUpdatedAt(state.getAttrSetInstEFGroupUpdatedAt());
		cmd.setAttrSetInstEFGroupActive(state.getAttrSetInstEFGroupActive());
		cmd.setAttrSetInstEFGroupDeleted(state.getAttrSetInstEFGroupDeleted());
		return cmd;
	}

	protected abstract TCreateAttributeSetInstanceExtensionFieldMvo newCreateAttributeSetInstanceExtensionFieldMvo();

	protected abstract TMergePatchAttributeSetInstanceExtensionFieldMvo newMergePatchAttributeSetInstanceExtensionFieldMvo(); 

	protected abstract TDeleteAttributeSetInstanceExtensionFieldMvo newDeleteAttributeSetInstanceExtensionFieldMvo();

		
}

