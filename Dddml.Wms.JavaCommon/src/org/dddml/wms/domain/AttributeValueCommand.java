package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.Command;

public interface AttributeValueCommand extends Command
{
    String getValue();

    String getAttributeId();


    interface CreateOrMergePatchAttributeValue extends AttributeValueCommand
    {
        String getName();

        String getDescription();

        String getReferenceId();

        Boolean getActive();

    }

    interface CreateAttributeValue extends CreateOrMergePatchAttributeValue
    {
    }

    interface MergePatchAttributeValue extends CreateOrMergePatchAttributeValue
    {
        Boolean getIsPropertyNameRemoved();

        Boolean getIsPropertyDescriptionRemoved();

        Boolean getIsPropertyReferenceIdRemoved();

        Boolean getIsPropertyActiveRemoved();

    }

	interface RemoveAttributeValue extends AttributeValueCommand
	{
	}

}

