package org.dddml.wms.domain;

import java.util.Iterator;
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

    Boolean getActive();

    void setActive(Boolean active);

    String getUserId();

    void setUserId(String userId);

    

    interface UserClaimStateCreated extends UserClaimStateEvent
    {
    
    }


    interface UserClaimStateMergePatched extends UserClaimStateEvent
    {
        Boolean isPropertyClaimTypeRemoved();

        void setPropertyClaimTypeRemoved(Boolean removed);

        Boolean isPropertyClaimValueRemoved();

        void setPropertyClaimValueRemoved(Boolean removed);

        Boolean isPropertyActiveRemoved();

        void setPropertyActiveRemoved(Boolean removed);


    }

    interface UserClaimStateRemoved extends UserClaimStateEvent
    {
    }


}

