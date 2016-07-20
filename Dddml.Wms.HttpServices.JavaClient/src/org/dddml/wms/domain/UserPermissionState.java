package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.UserPermissionStateEvent.*;

public interface UserPermissionState
{

    UserPermissionId getUserPermissionId();

    void setUserPermissionId(UserPermissionId userPermissionId);

    String getPermissionId();

    void setPermissionId(String permissionId);

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

    String getUserId();

    void setUserId(String userId);


    boolean isStateUnsaved();


    void when(UserPermissionStateCreated e);

    void when(UserPermissionStateMergePatched e);

    void when(UserPermissionStateRemoved e);

    void mutate(Event e);

    
}

