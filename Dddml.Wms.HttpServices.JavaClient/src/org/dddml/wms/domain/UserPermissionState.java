package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.UserPermissionStateEvent.*;

public interface UserPermissionState
{
    String getPermissionId();

    void setPermissionId(String permissionId);

    Long getVersion();

    void setVersion(Long version);

    Boolean getActive();

    void setActive(Boolean active);

    String getUserId();

    void setUserId(String userId);


    boolean isStateUnsaved();


    void when(UserPermissionStateCreated e);

    void when(UserPermissionStateMergePatched e);

    void when(UserPermissionStateRemoved e);

    void mutate(Event e);

    
}

