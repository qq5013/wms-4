package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.Command;

public interface AttributeUseCommand extends Command
{
    String getAttributeId();

    String getAttributeSetId();


    interface CreateOrMergePatchAttributeUse extends AttributeUseCommand
    {
        Integer getSequenceNumber();

        Boolean getActive();

    }

    interface CreateAttributeUse extends CreateOrMergePatchAttributeUse
    {
    }

    interface MergePatchAttributeUse extends CreateOrMergePatchAttributeUse
    {
        Boolean getIsPropertySequenceNumberRemoved();

        Boolean getIsPropertyActiveRemoved();

    }

	interface RemoveAttributeUse extends AttributeUseCommand
	{
	}

}

