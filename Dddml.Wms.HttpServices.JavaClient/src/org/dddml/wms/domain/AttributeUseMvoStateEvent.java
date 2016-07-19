package org.dddml.wms.domain;

import java.util.Iterator;
import java.util.Date;
import org.dddml.wms.specialization.Event;

public interface AttributeUseMvoStateEvent extends Event
{

    AttributeUseMvoStateEventId getStateEventId();

    boolean getStateEventReadOnly();

    void setStateEventReadOnly(boolean readOnly);

    Integer getSequenceNumber();

    void setSequenceNumber(Integer sequenceNumber);

    Long getVersion();

    void setVersion(Long version);

    Boolean getActive();

    void setActive(Boolean active);

    String getAttributeSetName();

    void setAttributeSetName(String attributeSetName);

    String getAttributeSetOrganizationId();

    void setAttributeSetOrganizationId(String attributeSetOrganizationId);

    String getAttributeSetDescription();

    void setAttributeSetDescription(String attributeSetDescription);

    String getAttributeSetSerialNumberAttributeId();

    void setAttributeSetSerialNumberAttributeId(String attributeSetSerialNumberAttributeId);

    String getAttributeSetLotAttributeId();

    void setAttributeSetLotAttributeId(String attributeSetLotAttributeId);

    String getAttributeSetReferenceId();

    void setAttributeSetReferenceId(String attributeSetReferenceId);

    String getAttributeSetCreatedBy();

    void setAttributeSetCreatedBy(String attributeSetCreatedBy);

    Date getAttributeSetCreatedAt();

    void setAttributeSetCreatedAt(Date attributeSetCreatedAt);

    String getAttributeSetUpdatedBy();

    void setAttributeSetUpdatedBy(String attributeSetUpdatedBy);

    Date getAttributeSetUpdatedAt();

    void setAttributeSetUpdatedAt(Date attributeSetUpdatedAt);

    Boolean getAttributeSetActive();

    void setAttributeSetActive(Boolean attributeSetActive);

    Boolean getAttributeSetDeleted();

    void setAttributeSetDeleted(Boolean attributeSetDeleted);

    

    interface AttributeUseMvoStateCreated extends AttributeUseMvoStateEvent
    {
    
    }


    interface AttributeUseMvoStateMergePatched extends AttributeUseMvoStateEvent
    {
        Boolean isPropertySequenceNumberRemoved();

        void setPropertySequenceNumberRemoved(Boolean removed);

        Boolean isPropertyVersionRemoved();

        void setPropertyVersionRemoved(Boolean removed);

        Boolean isPropertyActiveRemoved();

        void setPropertyActiveRemoved(Boolean removed);

        Boolean isPropertyAttributeSetNameRemoved();

        void setPropertyAttributeSetNameRemoved(Boolean removed);

        Boolean isPropertyAttributeSetOrganizationIdRemoved();

        void setPropertyAttributeSetOrganizationIdRemoved(Boolean removed);

        Boolean isPropertyAttributeSetDescriptionRemoved();

        void setPropertyAttributeSetDescriptionRemoved(Boolean removed);

        Boolean isPropertyAttributeSetSerialNumberAttributeIdRemoved();

        void setPropertyAttributeSetSerialNumberAttributeIdRemoved(Boolean removed);

        Boolean isPropertyAttributeSetLotAttributeIdRemoved();

        void setPropertyAttributeSetLotAttributeIdRemoved(Boolean removed);

        Boolean isPropertyAttributeSetReferenceIdRemoved();

        void setPropertyAttributeSetReferenceIdRemoved(Boolean removed);

        Boolean isPropertyAttributeSetCreatedByRemoved();

        void setPropertyAttributeSetCreatedByRemoved(Boolean removed);

        Boolean isPropertyAttributeSetCreatedAtRemoved();

        void setPropertyAttributeSetCreatedAtRemoved(Boolean removed);

        Boolean isPropertyAttributeSetUpdatedByRemoved();

        void setPropertyAttributeSetUpdatedByRemoved(Boolean removed);

        Boolean isPropertyAttributeSetUpdatedAtRemoved();

        void setPropertyAttributeSetUpdatedAtRemoved(Boolean removed);

        Boolean isPropertyAttributeSetActiveRemoved();

        void setPropertyAttributeSetActiveRemoved(Boolean removed);

        Boolean isPropertyAttributeSetDeletedRemoved();

        void setPropertyAttributeSetDeletedRemoved(Boolean removed);


    }


    interface AttributeUseMvoStateDeleted extends AttributeUseMvoStateEvent
    {
    }


}

