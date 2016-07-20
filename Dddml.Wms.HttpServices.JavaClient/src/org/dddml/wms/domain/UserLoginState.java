package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.UserLoginStateEvent.*;

public interface UserLoginState
{
    Long VERSION_ZERO = 0L;

    UserLoginId getUserLoginId();

    void setUserLoginId(UserLoginId userLoginId);

    LoginKey getLoginKey();

    void setLoginKey(LoginKey loginKey);

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


    void mutate(Event e);

    void when(UserLoginStateCreated e);

    void when(UserLoginStateMergePatched e);

    void when(UserLoginStateRemoved e);
    
}

