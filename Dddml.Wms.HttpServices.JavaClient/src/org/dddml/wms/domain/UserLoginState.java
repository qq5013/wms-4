package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.UserLoginStateEvent.*;

public interface UserLoginState
{
    LoginKey getLoginKey();

    void setLoginKey(LoginKey loginKey);

    Long getVersion();

    void setVersion(Long version);

    Boolean getActive();

    void setActive(Boolean active);

    String getUserId();

    void setUserId(String userId);


    boolean isStateUnsaved();


    void when(UserLoginStateCreated e);

    void when(UserLoginStateMergePatched e);

    void when(UserLoginStateRemoved e);

    void mutate(Event e);

    
}

