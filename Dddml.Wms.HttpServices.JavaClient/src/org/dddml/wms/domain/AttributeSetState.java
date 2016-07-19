package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.AttributeSetStateEvent.*;

public interface AttributeSetState
{
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

    Boolean getActive();

    void setActive(Boolean active);


    boolean isStateUnsaved();

    AttributeUseStates getAttributeUses();


    void when(AttributeSetStateCreated e);

    void when(AttributeSetStateMergePatched e);

    void when(AttributeSetStateDeleted e);

    void mutate(Event e);

    
}

