package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.UserClaimStateEvent.*;

public interface UserClaimState
{
    Long VERSION_ZERO = 0L;

    UserClaimId getUserClaimId();

    void setUserClaimId(UserClaimId userClaimId);

    Integer getClaimId();

    void setClaimId(Integer claimId);

    String getClaimType();

    void setClaimType(String claimType);

    String getClaimValue();

    void setClaimValue(String claimValue);

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

    void when(UserClaimStateCreated e);

    void when(UserClaimStateMergePatched e);

    void when(UserClaimStateRemoved e);
    
}

