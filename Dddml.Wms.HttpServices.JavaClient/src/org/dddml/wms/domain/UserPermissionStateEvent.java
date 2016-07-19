package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.specialization.Event;

public interface UserPermissionStateEvent extends Event
{

    UserPermissionStateEventId getStateEventId();

    boolean getStateEventReadOnly();

    void setStateEventReadOnly(boolean readOnly);

    Long getVersion();

    void setVersion(Long version);

    Boolean getActive();

    void setActive(Boolean active);

    String getUserId();

    void setUserId(String userId);

    

    interface UserPermissionStateCreated extends UserPermissionStateEvent
    {
    
    }


    interface UserPermissionStateMergePatched extends UserPermissionStateEvent
    {
        Boolean isPropertyActiveRemoved();

        void setPropertyActiveRemoved(Boolean removed);


    }

    interface UserPermissionStateRemoved extends UserPermissionStateEvent
    {
    }


}

