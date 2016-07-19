package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.specialization.Event;

public interface AudienceStateEvent extends Event
{

    AudienceStateEventId getStateEventId();

    boolean getStateEventReadOnly();

    void setStateEventReadOnly(boolean readOnly);

    String getName();

    void setName(String name);

    String getBase64Secret();

    void setBase64Secret(String base64Secret);

    Boolean getActive();

    void setActive(Boolean active);

    

    interface AudienceStateCreated extends AudienceStateEvent
    {
    
    }


    interface AudienceStateMergePatched extends AudienceStateEvent
    {
        Boolean isPropertyNameRemoved();

        void setPropertyNameRemoved(Boolean removed);

        Boolean isPropertyBase64SecretRemoved();

        void setPropertyBase64SecretRemoved(Boolean removed);

        Boolean isPropertyActiveRemoved();

        void setPropertyActiveRemoved(Boolean removed);


    }


    interface AudienceStateDeleted extends AudienceStateEvent
    {
    }


}

