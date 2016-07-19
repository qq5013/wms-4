package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.UserRoleStateEvent.*;

public interface UserRoleState
{
    String getRoleId();

    void setRoleId(String roleId);

    Long getVersion();

    void setVersion(Long version);

    Boolean getActive();

    void setActive(Boolean active);

    String getUserId();

    void setUserId(String userId);


    boolean isStateUnsaved();


    void when(UserRoleStateCreated e);

    void when(UserRoleStateMergePatched e);

    void when(UserRoleStateRemoved e);

    void mutate(Event e);

    
}

