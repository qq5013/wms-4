package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.RolePermissionStateEvent.*;

public interface RolePermissionState
{
    RolePermissionId getId();

    void setId(RolePermissionId id);

    Long getVersion();

    void setVersion(Long version);

    Boolean getActive();

    void setActive(Boolean active);


    boolean isStateUnsaved();


    void when(RolePermissionStateCreated e);

    void when(RolePermissionStateMergePatched e);

    void when(RolePermissionStateDeleted e);

    void mutate(Event e);

    
}

