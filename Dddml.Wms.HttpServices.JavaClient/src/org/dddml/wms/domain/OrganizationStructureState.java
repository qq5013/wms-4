package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.OrganizationStructureStateEvent.*;

public interface OrganizationStructureState
{
    OrganizationStructureId getId();

    void setId(OrganizationStructureId id);

    Long getVersion();

    void setVersion(Long version);

    Boolean getActive();

    void setActive(Boolean active);


    boolean isStateUnsaved();


    void when(OrganizationStructureStateCreated e);

    void when(OrganizationStructureStateMergePatched e);

    void when(OrganizationStructureStateDeleted e);

    void mutate(Event e);

    
}

