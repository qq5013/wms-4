package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.PermissionStateEvent.*;

public interface PermissionState
{
    String getPermissionId();

    void setPermissionId(String permissionId);

    String getName();

    void setName(String name);

    String getParentPermissionId();

    void setParentPermissionId(String parentPermissionId);

    String getDescription();

    void setDescription(String description);

    Long getVersion();

    void setVersion(Long version);

    Boolean getActive();

    void setActive(Boolean active);


    boolean isStateUnsaved();


    void when(PermissionStateCreated e);

    void when(PermissionStateMergePatched e);

    void when(PermissionStateDeleted e);

    void mutate(Event e);

    
}

