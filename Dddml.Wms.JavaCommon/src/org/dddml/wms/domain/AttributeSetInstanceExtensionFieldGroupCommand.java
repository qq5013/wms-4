package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.Command;

public interface AttributeSetInstanceExtensionFieldGroupCommand extends Command
{
    String getId();

    Long getVersion();


    interface CreateOrMergePatchAttributeSetInstanceExtensionFieldGroup extends AttributeSetInstanceExtensionFieldGroupCommand
    {
        String getFieldType();

        Integer getFieldLength();

        Integer getFieldCount();

        String getNameFormat();

        String getDescription();

        Boolean getActive();

    }

    interface CreateAttributeSetInstanceExtensionFieldGroup extends CreateOrMergePatchAttributeSetInstanceExtensionFieldGroup
    {
        CreateAttributeSetInstanceExtensionFieldCommands getFields();

        AttributeSetInstanceExtensionFieldCommand.CreateAttributeSetInstanceExtensionField newCreateAttributeSetInstanceExtensionField();

    }

    interface MergePatchAttributeSetInstanceExtensionFieldGroup extends CreateOrMergePatchAttributeSetInstanceExtensionFieldGroup
    {
        Boolean getIsPropertyFieldTypeRemoved();

        Boolean getIsPropertyFieldLengthRemoved();

        Boolean getIsPropertyFieldCountRemoved();

        Boolean getIsPropertyNameFormatRemoved();

        Boolean getIsPropertyDescriptionRemoved();

        Boolean getIsPropertyActiveRemoved();

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

