package org.dddml.wms.domain;

import java.util.*;
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

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    Date getCreatedAt();

    void setCreatedAt(Date createdAt);

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
        Boolean getIsPropertySequenceNumberRemoved();

        void setIsPropertySequenceNumberRemoved(Boolean removed);

        Boolean getIsPropertyVersionRemoved();

        void setIsPropertyVersionRemoved(Boolean removed);

        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);

        Boolean getIsPropertyAttributeSetNameRemoved();

        void setIsPropertyAttributeSetNameRemoved(Boolean removed);

        Boolean getIsPropertyAttributeSetOrganizationIdRemoved();

        void setIsPropertyAttributeSetOrganizationIdRemoved(Boolean removed);

        Boolean getIsPropertyAttributeSetDescriptionRemoved();

        void setIsPropertyAttributeSetDescriptionRemoved(Boolean removed);

        Boolean getIsPropertyAttributeSetSerialNumberAttributeIdRemoved();

        void setIsPropertyAttributeSetSerialNumberAttributeIdRemoved(Boolean removed);

        Boolean getIsPropertyAttributeSetLotAttributeIdRemoved();

        void setIsPropertyAttributeSetLotAttributeIdRemoved(Boolean removed);

        Boolean getIsPropertyAttributeSetReferenceIdRemoved();

        void setIsPropertyAttributeSetReferenceIdRemoved(Boolean removed);

        Boolean getIsPropertyAttributeSetCreatedByRemoved();

        void setIsPropertyAttributeSetCreatedByRemoved(Boolean removed);

        Boolean getIsPropertyAttributeSetCreatedAtRemoved();

        void setIsPropertyAttributeSetCreatedAtRemoved(Boolean removed);

        Boolean getIsPropertyAttributeSetUpdatedByRemoved();

        void setIsPropertyAttributeSetUpdatedByRemoved(Boolean removed);

        Boolean getIsPropertyAttributeSetUpdatedAtRemoved();

        void setIsPropertyAttributeSetUpdatedAtRemoved(Boolean removed);

        Boolean getIsPropertyAttributeSetActiveRemoved();

        void setIsPropertyAttributeSetActiveRemoved(Boolean removed);

        Boolean getIsPropertyAttributeSetDeletedRemoved();

        void setIsPropertyAttributeSetDeletedRemoved(Boolean removed);


    }

    interface AttributeUseMvoStateDeleted extends AttributeUseMvoStateEvent
    {
    }


}

