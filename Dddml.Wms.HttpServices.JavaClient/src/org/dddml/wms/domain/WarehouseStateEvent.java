package org.dddml.wms.domain;

import java.util.Iterator;
import java.util.Date;
import org.dddml.wms.specialization.Event;

public interface WarehouseStateEvent extends Event
{

    WarehouseStateEventId getStateEventId();

    boolean getStateEventReadOnly();

    void setStateEventReadOnly(boolean readOnly);

    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    Boolean getIsInTransit();

    void setIsInTransit(Boolean isInTransit);

    Boolean getActive();

    void setActive(Boolean active);

    

    interface WarehouseStateCreated extends WarehouseStateEvent
    {
    
    }


    interface WarehouseStateMergePatched extends WarehouseStateEvent
    {
        Boolean isPropertyNameRemoved();

        void setPropertyNameRemoved(Boolean removed);

        Boolean isPropertyDescriptionRemoved();

        void setPropertyDescriptionRemoved(Boolean removed);

        Boolean isPropertyIsInTransitRemoved();

        void setPropertyIsInTransitRemoved(Boolean removed);

        Boolean isPropertyActiveRemoved();

        void setPropertyActiveRemoved(Boolean removed);


    }


    interface WarehouseStateDeleted extends WarehouseStateEvent
    {
    }


}

