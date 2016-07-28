package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.AttributeUseMvoStateEvent.*;

public interface AttributeUseMvoState
{
    Long VERSION_ZERO = 0L;

    Long VERSION_NULL = VERSION_ZERO - 1;

    AttributeSetAttributeUseId getAttributeSetAttributeUseId();

    void setAttributeSetAttributeUseId(AttributeSetAttributeUseId attributeSetAttributeUseId);

    Integer getSequenceNumber();

    void setSequenceNumber(Integer sequenceNumber);

    Long getVersion();

    void setVersion(Long version);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    Date getCreatedAt();

    void setCreatedAt(Date createdAt);

    String getUpdatedBy();

    void setUpdatedBy(String updatedBy);

    Date getUpdatedAt();

    void setUpdatedAt(Date updatedAt);

    Boolean getActive();

    void setActive(Boolean active);

    Boolean getDeleted();

    void setDeleted(Boolean deleted);

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

    Long getAttributeSetVersion();

    void setAttributeSetVersion(Long attributeSetVersion);

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


    boolean isStateUnsaved();


    void mutate(Event e);

    void when(AttributeUseMvoStateCreated e);

    void when(AttributeUseMvoStateMergePatched e);

    void when(AttributeUseMvoStateDeleted e);
    
}

