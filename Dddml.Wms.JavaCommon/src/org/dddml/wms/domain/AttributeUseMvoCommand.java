package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.Command;

public interface AttributeUseMvoCommand extends Command
{
    AttributeSetAttributeUseId getAttributeSetAttributeUseId();

    Long getAttributeSetVersion();


    interface CreateOrMergePatchAttributeUseMvo extends AttributeUseMvoCommand
    {
        Integer getSequenceNumber();

        Long getVersion();

        Boolean getActive();

        String getAttributeSetName();

        String getAttributeSetOrganizationId();

        String getAttributeSetDescription();

        String getAttributeSetSerialNumberAttributeId();

        String getAttributeSetLotAttributeId();

        String getAttributeSetReferenceId();

        String getAttributeSetCreatedBy();

        Date getAttributeSetCreatedAt();

        String getAttributeSetUpdatedBy();

        Date getAttributeSetUpdatedAt();

        Boolean getAttributeSetActive();

        Boolean getAttributeSetDeleted();

    }

    interface CreateAttributeUseMvo extends CreateOrMergePatchAttributeUseMvo
    {
    }

    interface MergePatchAttributeUseMvo extends CreateOrMergePatchAttributeUseMvo
    {
        Boolean getIsPropertySequenceNumberRemoved();

        Boolean getIsPropertyVersionRemoved();

        Boolean getIsPropertyActiveRemoved();

        Boolean getIsPropertyAttributeSetNameRemoved();

        Boolean getIsPropertyAttributeSetOrganizationIdRemoved();

        Boolean getIsPropertyAttributeSetDescriptionRemoved();

        Boolean getIsPropertyAttributeSetSerialNumberAttributeIdRemoved();

        Boolean getIsPropertyAttributeSetLotAttributeIdRemoved();

        Boolean getIsPropertyAttributeSetReferenceIdRemoved();

        Boolean getIsPropertyAttributeSetCreatedByRemoved();

        Boolean getIsPropertyAttributeSetCreatedAtRemoved();

        Boolean getIsPropertyAttributeSetUpdatedByRemoved();

        Boolean getIsPropertyAttributeSetUpdatedAtRemoved();

        Boolean getIsPropertyAttributeSetActiveRemoved();

        Boolean getIsPropertyAttributeSetDeletedRemoved();

    }

	interface DeleteAttributeUseMvo extends AttributeUseMvoCommand
	{
	}

}

