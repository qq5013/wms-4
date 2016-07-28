package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.AttributeSetStateEvent.*;

public interface AttributeSetState
{
    Long VERSION_ZERO = 0L;

    Long VERSION_NULL = VERSION_ZERO - 1;

    String getAttributeSetId();

    void setAttributeSetId(String attributeSetId);

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


    boolean isStateUnsaved();

    AttributeUseStates getAttributeUses();


    void mutate(Event e);

    void when(AttributeSetStateCreated e);

    void when(AttributeSetStateMergePatched e);

    void when(AttributeSetStateDeleted e);
    
}

