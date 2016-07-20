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

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    Date getCreatedAt();

    void setCreatedAt(Date createdAt);

    Boolean getActive();

    void setActive(Boolean active);

    

    interface AudienceStateCreated extends AudienceStateEvent
    {
    
    }


    interface AudienceStateMergePatched extends AudienceStateEvent
    {
        Boolean getIsPropertyNameRemoved();

        void setIsPropertyNameRemoved(Boolean removed);

        Boolean getIsPropertyBase64SecretRemoved();

        void setIsPropertyBase64SecretRemoved(Boolean removed);

        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);


    }

    interface AudienceStateDeleted extends AudienceStateEvent
    {
    }


}

