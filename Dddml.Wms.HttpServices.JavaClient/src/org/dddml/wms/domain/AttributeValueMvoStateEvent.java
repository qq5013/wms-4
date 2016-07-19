package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.specialization.Event;

public interface AttributeValueMvoStateEvent extends Event
{

    AttributeValueMvoStateEventId getStateEventId();

    boolean getStateEventReadOnly();

    void setStateEventReadOnly(boolean readOnly);

    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    String getReferenceId();

    void setReferenceId(String referenceId);

    Long getVersion();

    void setVersion(Long version);

    Boolean getActive();

    void setActive(Boolean active);

    String getAttributeName();

    void setAttributeName(String attributeName);

    String getAttributeOrganizationId();

    void setAttributeOrganizationId(String attributeOrganizationId);

    String getAttributeDescription();

    void setAttributeDescription(String attributeDescription);

    Boolean getAttributeIsMandatory();

    void setAttributeIsMandatory(Boolean attributeIsMandatory);

    Boolean getAttributeIsInstanceAttribute();

    void setAttributeIsInstanceAttribute(Boolean attributeIsInstanceAttribute);

    String getAttributeAttributeValueType();

    void setAttributeAttributeValueType(String attributeAttributeValueType);

    Integer getAttributeAttributeValueLength();

    void setAttributeAttributeValueLength(Integer attributeAttributeValueLength);

    Boolean getAttributeIsList();

    void setAttributeIsList(Boolean attributeIsList);

    String getAttributeFieldName();

    void setAttributeFieldName(String attributeFieldName);

    String getAttributeReferenceId();

    void setAttributeReferenceId(String attributeReferenceId);

    String getAttributeCreatedBy();

    void setAttributeCreatedBy(String attributeCreatedBy);

    Date getAttributeCreatedAt();

    void setAttributeCreatedAt(Date attributeCreatedAt);

    String getAttributeUpdatedBy();

    void setAttributeUpdatedBy(String attributeUpdatedBy);

    Date getAttributeUpdatedAt();

    void setAttributeUpdatedAt(Date attributeUpdatedAt);

    Boolean getAttributeActive();

    void setAttributeActive(Boolean attributeActive);

    Boolean getAttributeDeleted();

    void setAttributeDeleted(Boolean attributeDeleted);

    

    interface AttributeValueMvoStateCreated extends AttributeValueMvoStateEvent
    {
    
    }


    interface AttributeValueMvoStateMergePatched extends AttributeValueMvoStateEvent
    {
        Boolean isPropertyNameRemoved();

        void setPropertyNameRemoved(Boolean removed);

        Boolean isPropertyDescriptionRemoved();

        void setPropertyDescriptionRemoved(Boolean removed);

        Boolean isPropertyReferenceIdRemoved();

        void setPropertyReferenceIdRemoved(Boolean removed);

        Boolean isPropertyVersionRemoved();

        void setPropertyVersionRemoved(Boolean removed);

        Boolean isPropertyActiveRemoved();

        void setPropertyActiveRemoved(Boolean removed);

        Boolean isPropertyAttributeNameRemoved();

        void setPropertyAttributeNameRemoved(Boolean removed);

        Boolean isPropertyAttributeOrganizationIdRemoved();

        void setPropertyAttributeOrganizationIdRemoved(Boolean removed);

        Boolean isPropertyAttributeDescriptionRemoved();

        void setPropertyAttributeDescriptionRemoved(Boolean removed);

        Boolean isPropertyAttributeIsMandatoryRemoved();

        void setPropertyAttributeIsMandatoryRemoved(Boolean removed);

        Boolean isPropertyAttributeIsInstanceAttributeRemoved();

        void setPropertyAttributeIsInstanceAttributeRemoved(Boolean removed);

        Boolean isPropertyAttributeAttributeValueTypeRemoved();

        void setPropertyAttributeAttributeValueTypeRemoved(Boolean removed);

        Boolean isPropertyAttributeAttributeValueLengthRemoved();

        void setPropertyAttributeAttributeValueLengthRemoved(Boolean removed);

        Boolean isPropertyAttributeIsListRemoved();

        void setPropertyAttributeIsListRemoved(Boolean removed);

        Boolean isPropertyAttributeFieldNameRemoved();

        void setPropertyAttributeFieldNameRemoved(Boolean removed);

        Boolean isPropertyAttributeReferenceIdRemoved();

        void setPropertyAttributeReferenceIdRemoved(Boolean removed);

        Boolean isPropertyAttributeCreatedByRemoved();

        void setPropertyAttributeCreatedByRemoved(Boolean removed);

        Boolean isPropertyAttributeCreatedAtRemoved();

        void setPropertyAttributeCreatedAtRemoved(Boolean removed);

        Boolean isPropertyAttributeUpdatedByRemoved();

        void setPropertyAttributeUpdatedByRemoved(Boolean removed);

        Boolean isPropertyAttributeUpdatedAtRemoved();

        void setPropertyAttributeUpdatedAtRemoved(Boolean removed);

        Boolean isPropertyAttributeActiveRemoved();

        void setPropertyAttributeActiveRemoved(Boolean removed);

        Boolean isPropertyAttributeDeletedRemoved();

        void setPropertyAttributeDeletedRemoved(Boolean removed);


    }


    interface AttributeValueMvoStateDeleted extends AttributeValueMvoStateEvent
    {
    }


}

