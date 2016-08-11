package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.Event;

public interface UserClaimStateEvent extends Event
{
    UserClaimStateEventId getStateEventId();

    boolean getStateEventReadOnly();

    void setStateEventReadOnly(boolean readOnly);

    Long getVersion();

    void setVersion(Long version);

    String getClaimType();

    void setClaimType(String claimType);

    String getClaimValue();

    void setClaimValue(String claimValue);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    Date getCreatedAt();

    void setCreatedAt(Date createdAt);

    Boolean getActive();

    void setActive(Boolean active);

    String getUserId();

    void setUserId(String userId);


    interface UserClaimStateCreated extends UserClaimStateEvent
    {
    
    }


    interface UserClaimStateMergePatched extends UserClaimStateEvent
    {
        Boolean getIsPropertyClaimTypeRemoved();

        void setIsPropertyClaimTypeRemoved(Boolean removed);

        Boolean getIsPropertyClaimValueRemoved();

        void setIsPropertyClaimValueRemoved(Boolean removed);

        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);


    }

    interface UserClaimStateRemoved extends UserClaimStateEvent
    {
    }


}

