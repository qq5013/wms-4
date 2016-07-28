package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.Command;

public interface AttributeCommand extends Command
{
    String getAttributeId();

    void setAttributeId(String attributeId);

    Long getVersion();

    void setVersion(Long version);


    interface CreateOrMergePatchAttribute extends AttributeCommand
    {
        String getName();

        void setName(String name);

        String getOrganizationId();

        void setOrganizationId(String organizationId);

        String getDescription();

        void setDescription(String description);

        Boolean getIsMandatory();

        void setIsMandatory(Boolean isMandatory);

        Boolean getIsInstanceAttribute();

        void setIsInstanceAttribute(Boolean isInstanceAttribute);

        String getAttributeValueType();

        void setAttributeValueType(String attributeValueType);

        Integer getAttributeValueLength();

        void setAttributeValueLength(Integer attributeValueLength);

        Boolean getIsList();

        void setIsList(Boolean isList);

        String getFieldName();

        void setFieldName(String fieldName);

        String getReferenceId();

        void setReferenceId(String referenceId);

        Boolean getActive();

        void setActive(Boolean active);

    }

    interface CreateAttribute extends CreateOrMergePatchAttribute
    {
        CreateAttributeValueCommands getAttributeValues();

        AttributeValueCommand.CreateAttributeValue newCreateAttributeValue();

    }

    interface MergePatchAttribute extends CreateOrMergePatchAttribute
    {
        Boolean getIsPropertyNameRemoved();

        void setIsPropertyNameRemoved(Boolean removed);

        Boolean getIsPropertyOrganizationIdRemoved();

        void setIsPropertyOrganizationIdRemoved(Boolean removed);

        Boolean getIsPropertyDescriptionRemoved();

        void setIsPropertyDescriptionRemoved(Boolean removed);

        Boolean getIsPropertyIsMandatoryRemoved();

        void setIsPropertyIsMandatoryRemoved(Boolean removed);

        Boolean getIsPropertyIsInstanceAttributeRemoved();

        void setIsPropertyIsInstanceAttributeRemoved(Boolean removed);

        Boolean getIsPropertyAttributeValueTypeRemoved();

        void setIsPropertyAttributeValueTypeRemoved(Boolean removed);

        Boolean getIsPropertyAttributeValueLengthRemoved();

        void setIsPropertyAttributeValueLengthRemoved(Boolean removed);

        Boolean getIsPropertyIsListRemoved();

        void setIsPropertyIsListRemoved(Boolean removed);

        Boolean getIsPropertyFieldNameRemoved();

        void setIsPropertyFieldNameRemoved(Boolean removed);

        Boolean getIsPropertyReferenceIdRemoved();

        void setIsPropertyReferenceIdRemoved(Boolean removed);

        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);

        AttributeValueCommands getAttributeValueCommands();

        AttributeValueCommand.CreateAttributeValue newCreateAttributeValue();

        AttributeValueCommand.MergePatchAttributeValue newMergePatchAttributeValue();

        AttributeValueCommand.RemoveAttributeValue newRemoveAttributeValue();

    }

	interface DeleteAttribute extends AttributeCommand
	{
	}

    interface CreateAttributeValueCommands extends Iterable<AttributeValueCommand.CreateAttributeValue>
    {
        void add(AttributeValueCommand.CreateAttributeValue c);

        void remove(AttributeValueCommand.CreateAttributeValue c);

        void clear();
    }

    interface AttributeValueCommands extends Iterable<AttributeValueCommand>
    {
        void add(AttributeValueCommand c);

        void remove(AttributeValueCommand c);

        void clear();
    }

}

