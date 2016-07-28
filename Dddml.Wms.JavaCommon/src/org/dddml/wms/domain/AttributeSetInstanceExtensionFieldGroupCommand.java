package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.Command;

public interface AttributeSetInstanceExtensionFieldGroupCommand extends Command
{
    String getId();

    void setId(String id);

    Long getVersion();

    void setVersion(Long version);


    interface CreateOrMergePatchAttributeSetInstanceExtensionFieldGroup extends AttributeSetInstanceExtensionFieldGroupCommand
    {
        String getFieldType();

        void setFieldType(String fieldType);

        Integer getFieldLength();

        void setFieldLength(Integer fieldLength);

        Integer getFieldCount();

        void setFieldCount(Integer fieldCount);

        String getNameFormat();

        void setNameFormat(String nameFormat);

        String getDescription();

        void setDescription(String description);

        Boolean getActive();

        void setActive(Boolean active);

    }

    interface CreateAttributeSetInstanceExtensionFieldGroup extends CreateOrMergePatchAttributeSetInstanceExtensionFieldGroup
    {
        CreateAttributeSetInstanceExtensionFieldCommands getFields();

        AttributeSetInstanceExtensionFieldCommand.CreateAttributeSetInstanceExtensionField newCreateAttributeSetInstanceExtensionField();

    }

    interface MergePatchAttributeSetInstanceExtensionFieldGroup extends CreateOrMergePatchAttributeSetInstanceExtensionFieldGroup
    {
        Boolean getIsPropertyFieldTypeRemoved();

        void setIsPropertyFieldTypeRemoved(Boolean removed);

        Boolean getIsPropertyFieldLengthRemoved();

        void setIsPropertyFieldLengthRemoved(Boolean removed);

        Boolean getIsPropertyFieldCountRemoved();

        void setIsPropertyFieldCountRemoved(Boolean removed);

        Boolean getIsPropertyNameFormatRemoved();

        void setIsPropertyNameFormatRemoved(Boolean removed);

        Boolean getIsPropertyDescriptionRemoved();

        void setIsPropertyDescriptionRemoved(Boolean removed);

        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);

        AttributeSetInstanceExtensionFieldCommands getAttributeSetInstanceExtensionFieldCommands();

        AttributeSetInstanceExtensionFieldCommand.CreateAttributeSetInstanceExtensionField newCreateAttributeSetInstanceExtensionField();

        AttributeSetInstanceExtensionFieldCommand.MergePatchAttributeSetInstanceExtensionField newMergePatchAttributeSetInstanceExtensionField();

        AttributeSetInstanceExtensionFieldCommand.RemoveAttributeSetInstanceExtensionField newRemoveAttributeSetInstanceExtensionField();

    }

	interface DeleteAttributeSetInstanceExtensionFieldGroup extends AttributeSetInstanceExtensionFieldGroupCommand
	{
	}

    interface CreateAttributeSetInstanceExtensionFieldCommands extends Iterable<AttributeSetInstanceExtensionFieldCommand.CreateAttributeSetInstanceExtensionField>
    {
        void add(AttributeSetInstanceExtensionFieldCommand.CreateAttributeSetInstanceExtensionField c);

        void remove(AttributeSetInstanceExtensionFieldCommand.CreateAttributeSetInstanceExtensionField c);

        void clear();
    }

    interface AttributeSetInstanceExtensionFieldCommands extends Iterable<AttributeSetInstanceExtensionFieldCommand>
    {
        void add(AttributeSetInstanceExtensionFieldCommand c);

        void remove(AttributeSetInstanceExtensionFieldCommand c);

        void clear();
    }

}

