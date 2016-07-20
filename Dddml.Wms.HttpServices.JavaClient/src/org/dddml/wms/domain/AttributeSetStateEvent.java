package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.specialization.Event;

public interface AttributeSetStateEvent extends Event
{

    AttributeSetStateEventId getStateEventId();

    boolean getStateEventReadOnly();

    void setStateEventReadOnly(boolean readOnly);

    String getName();

    void setName(String name);

    String getOrganizationId();

    void setOrganizationId(String organizationId);

    String getDescription();

    void setDescription(String description);

    String getSerialNumberAttributeId();

    void setSerialNumberAttributeId(String serialNumberAttributeId);

    String getLotAttributeId();

    void setLotAttributeId(String lotAttributeId);

    String getReferenceId();

    void setReferenceId(String referenceId);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    Date getCreatedAt();

    void setCreatedAt(Date createdAt);

    Boolean getActive();

    void setActive(Boolean active);

    

    interface AttributeSetStateCreated extends AttributeSetStateEvent
    {
        Iterable<AttributeUseStateEvent.AttributeUseStateCreated> getAttributeUseEvents();
        
        void addAttributeUseEvent(AttributeUseStateEvent.AttributeUseStateCreated e);

        AttributeUseStateEvent.AttributeUseStateCreated newAttributeUseStateCreated(String attributeId);

    
    }


    interface AttributeSetStateMergePatched extends AttributeSetStateEvent
    {
        Boolean isPropertyNameRemoved();

        void setPropertyNameRemoved(Boolean removed);

        Boolean isPropertyOrganizationIdRemoved();

        void setPropertyOrganizationIdRemoved(Boolean removed);

        Boolean isPropertyDescriptionRemoved();

        void setPropertyDescriptionRemoved(Boolean removed);

        Boolean isPropertySerialNumberAttributeIdRemoved();

        void setPropertySerialNumberAttributeIdRemoved(Boolean removed);

        Boolean isPropertyLotAttributeIdRemoved();

        void setPropertyLotAttributeIdRemoved(Boolean removed);

        Boolean isPropertyReferenceIdRemoved();

        void setPropertyReferenceIdRemoved(Boolean removed);

        Boolean isPropertyActiveRemoved();

        void setPropertyActiveRemoved(Boolean removed);

        Iterable<AttributeUseStateEvent> getAttributeUseEvents();
        
        void addAttributeUseEvent(AttributeUseStateEvent e);

        AttributeUseStateEvent.AttributeUseStateCreated newAttributeUseStateCreated(String attributeId);

        AttributeUseStateEvent.AttributeUseStateMergePatched newAttributeUseStateMergePatched(String attributeId);

        AttributeUseStateEvent.AttributeUseStateRemoved newAttributeUseStateRemoved(String attributeId);


    }

    interface AttributeSetStateDeleted extends AttributeSetStateEvent
    {
        Iterable<AttributeUseStateEvent.AttributeUseStateRemoved> getAttributeUseEvents();
        
        void addAttributeUseEvent(AttributeUseStateEvent.AttributeUseStateRemoved e);
        
        AttributeUseStateEvent.AttributeUseStateRemoved newAttributeUseStateRemoved(String attributeId);

    }


}

