package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.Command;

public interface AttributeValueMvoCommand extends Command
{
    AttributeValueId getAttributeValueId();

    Long getAttributeVersion();


    interface CreateOrMergePatchAttributeValueMvo extends AttributeValueMvoCommand
    {
        String getName();

        String getDescription();

        String getReferenceId();

        Long getVersion();

        Boolean getActive();

        String getAttributeName();

        String getAttributeOrganizationId();

        String getAttributeDescription();

        Boolean getAttributeIsMandatory();

        Boolean getAttributeIsInstanceAttribute();

        String getAttributeAttributeValueType();

        Integer getAttributeAttributeValueLength();

        Boolean getAttributeIsList();

        String getAttributeFieldName();

        String getAttributeReferenceId();

        String getAttributeCreatedBy();

        Date getAttributeCreatedAt();

        String getAttributeUpdatedBy();

        Date getAttributeUpdatedAt();

        Boolean getAttributeActive();

        Boolean getAttributeDeleted();

    }

    interface CreateAttributeValueMvo extends CreateOrMergePatchAttributeValueMvo
    {
    }

    interface MergePatchAttributeValueMvo extends CreateOrMergePatchAttributeValueMvo
    {
        Boolean getIsPropertyNameRemoved();

        Boolean getIsPropertyDescriptionRemoved();

        Boolean getIsPropertyReferenceIdRemoved();

        Boolean getIsPropertyVersionRemoved();

        Boolean getIsPropertyActiveRemoved();

        Boolean getIsPropertyAttributeNameRemoved();

        Boolean getIsPropertyAttributeOrganizationIdRemoved();

        Boolean getIsPropertyAttributeDescriptionRemoved();

        Boolean getIsPropertyAttributeIsMandatoryRemoved();

        Boolean getIsPropertyAttributeIsInstanceAttributeRemoved();

        Boolean getIsPropertyAttributeAttributeValueTypeRemoved();

        Boolean getIsPropertyAttributeAttributeValueLengthRemoved();

        Boolean getIsPropertyAttributeIsListRemoved();

        Boolean getIsPropertyAttributeFieldNameRemoved();

        Boolean getIsPropertyAttributeReferenceIdRemoved();

        Boolean getIsPropertyAttributeCreatedByRemoved();

        Boolean getIsPropertyAttributeCreatedAtRemoved();

        Boolean getIsPropertyAttributeUpdatedByRemoved();

        Boolean getIsPropertyAttributeUpdatedAtRemoved();

        Boolean getIsPropertyAttributeActiveRemoved();

        Boolean getIsPropertyAttributeDeletedRemoved();

    }

	interface DeleteAttributeValueMvo extends AttributeValueMvoCommand
	{
	}

}

