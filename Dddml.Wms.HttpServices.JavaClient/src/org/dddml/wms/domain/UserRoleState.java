package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.UserRoleStateEvent.*;

public interface UserRoleState
{

    UserRoleId getUserRoleId();

    void setUserRoleId(UserRoleId userRoleId);

    String getRoleId();

    void setRoleId(String roleId);

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


    void when(UserRoleStateCreated e);

    void when(UserRoleStateMergePatched e);

    void when(UserRoleStateRemoved e);

    void mutate(Event e);

    
}

