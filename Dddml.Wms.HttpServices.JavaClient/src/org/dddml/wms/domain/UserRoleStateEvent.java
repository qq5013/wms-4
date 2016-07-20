package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.specialization.Event;

public interface UserRoleStateEvent extends Event
{

    UserRoleStateEventId getStateEventId();

    boolean getStateEventReadOnly();

    void setStateEventReadOnly(boolean readOnly);

    Long getVersion();

    void setVersion(Long version);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    Date getCreatedAt();

    void setCreatedAt(Date createdAt);

    Boolean getActive();

    void setActive(Boolean active);

    String getUserId();

    void setUserId(String userId);

    

    interface UserRoleStateCreated extends UserRoleStateEvent
    {
    
    }


    interface UserRoleStateMergePatched extends UserRoleStateEvent
    {
        Boolean isPropertyActiveRemoved();

        void setPropertyActiveRemoved(Boolean removed);


    }

    interface UserRoleStateRemoved extends UserRoleStateEvent
    {
    }


}

