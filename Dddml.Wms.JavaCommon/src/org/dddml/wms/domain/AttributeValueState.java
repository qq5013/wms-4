package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.AttributeValueStateEvent.*;

public interface AttributeValueState
{
    Long VERSION_ZERO = 0L;

    Long VERSION_NULL = VERSION_ZERO - 1;

    AttributeValueId getAttributeValueId();

    void setAttributeValueId(AttributeValueId attributeValueId);

    String getValue();

    void setValue(String value);

    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    String getReferenceId();

    void setReferenceId(String referenceId);

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

    String getAttributeId();

    void setAttributeId(String attributeId);


    boolean isStateUnsaved();


    void mutate(Event e);

    void when(AttributeValueStateCreated e);

    void when(AttributeValueStateMergePatched e);

    void when(AttributeValueStateRemoved e);
    
}

