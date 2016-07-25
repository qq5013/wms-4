package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.Command;

public interface AttributeCommand extends Command
{
    String getAttributeId();

    Long getVersion();


    interface CreateOrMergePatchAttribute extends AttributeCommand
    {
        String getName();

        String getOrganizationId();

        String getDescription();

        Boolean getIsMandatory();

        Boolean getIsInstanceAttribute();

        String getAttributeValueType();

        Integer getAttributeValueLength();

        Boolean getIsList();

        String getFieldName();

        String getReferenceId();

        Boolean getActive();

    }

    interface CreateAttribute extends CreateOrMergePatchAttribute
    {
        CreateAttributeValueCommands getAttributeValues();

        AttributeValueCommand.CreateAttributeValue newCreateAttributeValue();

    }

    interface MergePatchAttribute extends CreateOrMergePatchAttribute
    {
        Boolean getIsPropertyNameRemoved();

        Boolean getIsPropertyOrganizationIdRemoved();

        Boolean getIsPropertyDescriptionRemoved();

        Boolean getIsPropertyIsMandatoryRemoved();

        Boolean getIsPropertyIsInstanceAttributeRemoved();

        Boolean getIsPropertyAttributeValueTypeRemoved();

        Boolean getIsPropertyAttributeValueLengthRemoved();

        Boolean getIsPropertyIsListRemoved();

        Boolean getIsPropertyFieldNameRemoved();

        Boolean getIsPropertyReferenceIdRemoved();

        Boolean getIsPropertyActiveRemoved();

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

