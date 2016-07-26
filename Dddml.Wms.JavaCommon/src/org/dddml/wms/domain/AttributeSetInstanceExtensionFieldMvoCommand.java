package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.Command;

public interface AttributeSetInstanceExtensionFieldMvoCommand extends Command
{
    AttributeSetInstanceExtensionFieldId getAttributeSetInstanceExtensionFieldId();

    Long getAttrSetInstEFGroupVersion();


    interface CreateOrMergePatchAttributeSetInstanceExtensionFieldMvo extends AttributeSetInstanceExtensionFieldMvoCommand
    {
        String getName();

        String getType();

        Integer getLength();

        String getAlias();

        String getDescription();

        Long getVersion();

        Boolean getActive();

        String getAttrSetInstEFGroupFieldType();

        Integer getAttrSetInstEFGroupFieldLength();

        Integer getAttrSetInstEFGroupFieldCount();

        String getAttrSetInstEFGroupNameFormat();

        String getAttrSetInstEFGroupDescription();

        String getAttrSetInstEFGroupCreatedBy();

        Date getAttrSetInstEFGroupCreatedAt();

        String getAttrSetInstEFGroupUpdatedBy();

        Date getAttrSetInstEFGroupUpdatedAt();

        Boolean getAttrSetInstEFGroupActive();

        Boolean getAttrSetInstEFGroupDeleted();

    }

    interface CreateAttributeSetInstanceExtensionFieldMvo extends CreateOrMergePatchAttributeSetInstanceExtensionFieldMvo
    {
    }

    interface MergePatchAttributeSetInstanceExtensionFieldMvo extends CreateOrMergePatchAttributeSetInstanceExtensionFieldMvo
    {
        Boolean getIsPropertyNameRemoved();

        Boolean getIsPropertyTypeRemoved();

        Boolean getIsPropertyLengthRemoved();

        Boolean getIsPropertyAliasRemoved();

        Boolean getIsPropertyDescriptionRemoved();

        Boolean getIsPropertyVersionRemoved();

        Boolean getIsPropertyActiveRemoved();

        Boolean getIsPropertyAttrSetInstEFGroupFieldTypeRemoved();

        Boolean getIsPropertyAttrSetInstEFGroupFieldLengthRemoved();

        Boolean getIsPropertyAttrSetInstEFGroupFieldCountRemoved();

        Boolean getIsPropertyAttrSetInstEFGroupNameFormatRemoved();

        Boolean getIsPropertyAttrSetInstEFGroupDescriptionRemoved();

        Boolean getIsPropertyAttrSetInstEFGroupCreatedByRemoved();

        Boolean getIsPropertyAttrSetInstEFGroupCreatedAtRemoved();

        Boolean getIsPropertyAttrSetInstEFGroupUpdatedByRemoved();

        Boolean getIsPropertyAttrSetInstEFGroupUpdatedAtRemoved();

        Boolean getIsPropertyAttrSetInstEFGroupActiveRemoved();

        Boolean getIsPropertyAttrSetInstEFGroupDeletedRemoved();

    }

	interface DeleteAttributeSetInstanceExtensionFieldMvo extends AttributeSetInstanceExtensionFieldMvoCommand
	{
	}

}

