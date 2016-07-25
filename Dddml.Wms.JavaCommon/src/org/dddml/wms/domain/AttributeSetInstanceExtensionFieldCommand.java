package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.Command;

public interface AttributeSetInstanceExtensionFieldCommand extends Command
{
    String getIndex();

    String getGroupId();


    interface CreateOrMergePatchAttributeSetInstanceExtensionField extends AttributeSetInstanceExtensionFieldCommand
    {
        String getName();

        String getType();

        Integer getLength();

        String getAlias();

        String getDescription();

        Boolean getActive();

    }

    interface CreateAttributeSetInstanceExtensionField extends CreateOrMergePatchAttributeSetInstanceExtensionField
    {
    }

    interface MergePatchAttributeSetInstanceExtensionField extends CreateOrMergePatchAttributeSetInstanceExtensionField
    {
        Boolean getIsPropertyNameRemoved();

        Boolean getIsPropertyTypeRemoved();

        Boolean getIsPropertyLengthRemoved();

        Boolean getIsPropertyAliasRemoved();

        Boolean getIsPropertyDescriptionRemoved();

        Boolean getIsPropertyActiveRemoved();

    }

	interface RemoveAttributeSetInstanceExtensionField extends AttributeSetInstanceExtensionFieldCommand
	{
	}

}

