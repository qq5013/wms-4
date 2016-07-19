package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.OrganizationStateEvent.*;

public interface OrganizationState
{
    String getOrganizationId();

    void setOrganizationId(String organizationId);

    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    String getType();

    void setType(String type);

    Boolean getIsSummary();

    void setIsSummary(Boolean isSummary);

    Long getVersion();

    void setVersion(Long version);

    Boolean getActive();

    void setActive(Boolean active);


    boolean isStateUnsaved();


    void when(OrganizationStateCreated e);

    void when(OrganizationStateMergePatched e);

    void when(OrganizationStateDeleted e);

    void mutate(Event e);

    
}

