package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.UserClaimStateEvent.*;

public interface UserClaimState
{
    Integer getClaimId();

    void setClaimId(Integer claimId);

    String getClaimType();

    void setClaimType(String claimType);

    String getClaimValue();

    void setClaimValue(String claimValue);

    Long getVersion();

    void setVersion(Long version);

    Boolean getActive();

    void setActive(Boolean active);

    String getUserId();

    void setUserId(String userId);


    boolean isStateUnsaved();


    void when(UserClaimStateCreated e);

    void when(UserClaimStateMergePatched e);

    void when(UserClaimStateRemoved e);

    void mutate(Event e);

    
}

