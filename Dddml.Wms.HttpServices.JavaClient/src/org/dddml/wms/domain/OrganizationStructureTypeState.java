package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.OrganizationStructureTypeStateEvent.*;

public interface OrganizationStructureTypeState
{
    String getId();

    void setId(String id);

    Long getVersion();

    void setVersion(Long version);

    Boolean getActive();

    void setActive(Boolean active);


    boolean isStateUnsaved();


    void when(OrganizationStructureTypeStateCreated e);

    void when(OrganizationStructureTypeStateMergePatched e);

    void when(OrganizationStructureTypeStateDeleted e);

    void mutate(Event e);

    
}

