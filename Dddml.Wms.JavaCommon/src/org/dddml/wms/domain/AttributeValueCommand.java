package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.domain.Command;

public interface AttributeValueCommand extends Command
{
    String getValue();

    void setValue(String value);

    String getAttributeId();

    void setAttributeId(String attributeId);


    interface CreateOrMergePatchAttributeValue extends AttributeValueCommand
    {
        String getName();

        void setName(String name);

        String getDescription();

        void setDescription(String description);

        String getReferenceId();

        void setReferenceId(String referenceId);

        Boolean getActive();

        void setActive(Boolean active);

    }

    interface CreateAttributeValue extends CreateOrMergePatchAttributeValue
    {
    }

    interface MergePatchAttributeValue extends CreateOrMergePatchAttributeValue
    {
        Boolean getIsPropertyNameRemoved();

        void setIsPropertyNameRemoved(Boolean removed);

        Boolean getIsPropertyDescriptionRemoved();

        void setIsPropertyDescriptionRemoved(Boolean removed);

        Boolean getIsPropertyReferenceIdRemoved();

        void setIsPropertyReferenceIdRemoved(Boolean removed);

        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);

    }

	interface RemoveAttributeValue extends AttributeValueCommand
	{
	}

}

