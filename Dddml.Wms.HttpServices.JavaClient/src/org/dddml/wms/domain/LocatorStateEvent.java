package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.specialization.Event;

public interface LocatorStateEvent extends Event
{

    LocatorStateEventId getStateEventId();

    boolean getStateEventReadOnly();

    void setStateEventReadOnly(boolean readOnly);

    String getWarehouseId();

    void setWarehouseId(String warehouseId);

    String getParentLocatorId();

    void setParentLocatorId(String parentLocatorId);

    String getLocatorType();

    void setLocatorType(String locatorType);

    String getPriorityNumber();

    void setPriorityNumber(String priorityNumber);

    Boolean getIsDefault();

    void setIsDefault(Boolean isDefault);

    String getX();

    void setX(String x);

    String getY();

    void setY(String y);

    String getZ();

    void setZ(String z);

    Boolean getActive();

    void setActive(Boolean active);

    

    interface LocatorStateCreated extends LocatorStateEvent
    {
    
    }


    interface LocatorStateMergePatched extends LocatorStateEvent
    {
        Boolean isPropertyWarehouseIdRemoved();

        void setPropertyWarehouseIdRemoved(Boolean removed);

        Boolean isPropertyParentLocatorIdRemoved();

        void setPropertyParentLocatorIdRemoved(Boolean removed);

        Boolean isPropertyLocatorTypeRemoved();

        void setPropertyLocatorTypeRemoved(Boolean removed);

        Boolean isPropertyPriorityNumberRemoved();

        void setPropertyPriorityNumberRemoved(Boolean removed);

        Boolean isPropertyIsDefaultRemoved();

        void setPropertyIsDefaultRemoved(Boolean removed);

        Boolean isPropertyXRemoved();

        void setPropertyXRemoved(Boolean removed);

        Boolean isPropertyYRemoved();

        void setPropertyYRemoved(Boolean removed);

        Boolean isPropertyZRemoved();

        void setPropertyZRemoved(Boolean removed);

        Boolean isPropertyActiveRemoved();

        void setPropertyActiveRemoved(Boolean removed);


    }

    interface LocatorStateDeleted extends LocatorStateEvent
    {
    }


}

