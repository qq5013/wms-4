package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.Command;

public interface AttributeUseCommand extends Command
{
    String getAttributeId();

    void setAttributeId(String attributeId);

    String getAttributeSetId();

    void setAttributeSetId(String attributeSetId);


    interface CreateOrMergePatchAttributeUse extends AttributeUseCommand
    {
        Integer getSequenceNumber();

        void setSequenceNumber(Integer sequenceNumber);

        Boolean getActive();

        void setActive(Boolean active);

    }

    interface CreateAttributeUse extends CreateOrMergePatchAttributeUse
    {
    }

    interface MergePatchAttributeUse extends CreateOrMergePatchAttributeUse
    {
        Boolean getIsPropertySequenceNumberRemoved();

        void setIsPropertySequenceNumberRemoved(Boolean removed);

        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);

    }

	interface RemoveAttributeUse extends AttributeUseCommand
	{
	}

}

