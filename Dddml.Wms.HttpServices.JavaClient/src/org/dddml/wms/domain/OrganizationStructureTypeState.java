package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.OrganizationStructureTypeStateEvent.*;

public interface OrganizationStructureTypeState
{
    Long VERSION_ZERO = 0L;

    String getId();

    void setId(String id);

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


    void mutate(Event e);

    void when(OrganizationStructureTypeStateCreated e);

    void when(OrganizationStructureTypeStateMergePatched e);

    void when(OrganizationStructureTypeStateDeleted e);
    
}

