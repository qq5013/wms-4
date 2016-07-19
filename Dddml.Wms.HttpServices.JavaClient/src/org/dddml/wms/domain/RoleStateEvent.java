package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.specialization.Event;

public interface RoleStateEvent extends Event
{

    RoleStateEventId getStateEventId();

    boolean getStateEventReadOnly();

    void setStateEventReadOnly(boolean readOnly);

    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    Boolean getActive();

    void setActive(Boolean active);

    

    interface RoleStateCreated extends RoleStateEvent
    {
    
    }


    interface RoleStateMergePatched extends RoleStateEvent
    {
        Boolean isPropertyNameRemoved();

        void setPropertyNameRemoved(Boolean removed);

        Boolean isPropertyDescriptionRemoved();

        void setPropertyDescriptionRemoved(Boolean removed);

        Boolean isPropertyActiveRemoved();

        void setPropertyActiveRemoved(Boolean removed);


    }


    interface RoleStateDeleted extends RoleStateEvent
    {
    }


}

