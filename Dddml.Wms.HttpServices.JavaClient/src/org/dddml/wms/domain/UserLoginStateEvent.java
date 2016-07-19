package org.dddml.wms.domain;

import java.util.Iterator;
import java.util.Date;
import org.dddml.wms.specialization.Event;

public interface UserLoginStateEvent extends Event
{

    UserLoginStateEventId getStateEventId();

    boolean getStateEventReadOnly();

    void setStateEventReadOnly(boolean readOnly);

    Long getVersion();

    void setVersion(Long version);

    Boolean getActive();

    void setActive(Boolean active);

    String getUserId();

    void setUserId(String userId);

    

    interface UserLoginStateCreated extends UserLoginStateEvent
    {
    
    }


    interface UserLoginStateMergePatched extends UserLoginStateEvent
    {
        Boolean isPropertyActiveRemoved();

        void setPropertyActiveRemoved(Boolean removed);


    }

    interface UserLoginStateRemoved extends UserLoginStateEvent
    {
    }


}

