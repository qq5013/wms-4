package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.specialization.Event;

public interface AttributeStateEvent extends Event
{
    AttributeStateEventId getStateEventId();

    boolean getStateEventReadOnly();

    void setStateEventReadOnly(boolean readOnly);

    String getName();

    void setName(String name);

    String getOrganizationId();

    void setOrganizationId(String organizationId);

    String getDescription();

    void setDescription(String description);

    Boolean getIsMandatory();

    void setIsMandatory(Boolean isMandatory);

    Boolean getIsInstanceAttribute();

    void setIsInstanceAttribute(Boolean isInstanceAttribute);

    String getAttributeValueType();

    void setAttributeValueType(String attributeValueType);

    Integer getAttributeValueLength();

    void setAttributeValueLength(Integer attributeValueLength);

    Boolean getIsList();

    void setIsList(Boolean isList);

    String getFieldName();

    void setFieldName(String fieldName);

    String getReferenceId();

    void setReferenceId(String referenceId);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    Date getCreatedAt();

    void setCreatedAt(Date createdAt);

    Boolean getActive();

    void setActive(Boolean active);

    

    interface AttributeStateCreated extends AttributeStateEvent
    {
        Iterable<AttributeValueStateEvent.AttributeValueStateCreated> getAttributeValueEvents();
        
        void addAttributeValueEvent(AttributeValueStateEvent.AttributeValueStateCreated e);

        AttributeValueStateEvent.AttributeValueStateCreated newAttributeValueStateCreated(String value);

    
    }


    interface AttributeStateMergePatched extends AttributeStateEvent
    {
        Boolean isPropertyNameRemoved();

        void setPropertyNameRemoved(Boolean removed);

        Boolean isPropertyOrganizationIdRemoved();

        void setPropertyOrganizationIdRemoved(Boolean removed);

        Boolean isPropertyDescriptionRemoved();

        void setPropertyDescriptionRemoved(Boolean removed);

        Boolean isPropertyIsMandatoryRemoved();

        void setPropertyIsMandatoryRemoved(Boolean removed);

        Boolean isPropertyIsInstanceAttributeRemoved();

        void setPropertyIsInstanceAttributeRemoved(Boolean removed);

        Boolean isPropertyAttributeValueTypeRemoved();

        void setPropertyAttributeValueTypeRemoved(Boolean removed);

        Boolean isPropertyAttributeValueLengthRemoved();

        void setPropertyAttributeValueLengthRemoved(Boolean removed);

        Boolean isPropertyIsListRemoved();

        void setPropertyIsListRemoved(Boolean removed);

        Boolean isPropertyFieldNameRemoved();

        void setPropertyFieldNameRemoved(Boolean removed);

        Boolean isPropertyReferenceIdRemoved();

        void setPropertyReferenceIdRemoved(Boolean removed);

        Boolean isPropertyActiveRemoved();

        void setPropertyActiveRemoved(Boolean removed);

        Iterable<AttributeValueStateEvent> getAttributeValueEvents();
        
        void addAttributeValueEvent(AttributeValueStateEvent e);

        AttributeValueStateEvent.AttributeValueStateCreated newAttributeValueStateCreated(String value);

        AttributeValueStateEvent.AttributeValueStateMergePatched newAttributeValueStateMergePatched(String value);

        AttributeValueStateEvent.AttributeValueStateRemoved newAttributeValueStateRemoved(String value);


    }

    interface AttributeStateDeleted extends AttributeStateEvent
    {
        Iterable<AttributeValueStateEvent.AttributeValueStateRemoved> getAttributeValueEvents();
        
        void addAttributeValueEvent(AttributeValueStateEvent.AttributeValueStateRemoved e);
        
        AttributeValueStateEvent.AttributeValueStateRemoved newAttributeValueStateRemoved(String value);

    }


}

