package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.AttributeUseStateEvent.*;

public interface AttributeUseState
{

    AttributeSetAttributeUseId getAttributeSetAttributeUseId();

    void setAttributeSetAttributeUseId(AttributeSetAttributeUseId attributeSetAttributeUseId);

    String getAttributeId();

    void setAttributeId(String attributeId);

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

    String getAttributeSetId();

    void setAttributeSetId(String attributeSetId);


    boolean isStateUnsaved();


    void when(AttributeUseStateCreated e);

    void when(AttributeUseStateMergePatched e);

    void when(AttributeUseStateRemoved e);

    void mutate(Event e);

    
}

