package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.Event;

public interface DayPlanStateEvent extends Event
{
    DayPlanStateEventId getStateEventId();

    boolean getStateEventReadOnly();

    void setStateEventReadOnly(boolean readOnly);

    Long getVersion();

    void setVersion(Long version);

    String getDescription();

    void setDescription(String description);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    Date getCreatedAt();

    void setCreatedAt(Date createdAt);

    Boolean getActive();

    void setActive(Boolean active);

    PersonalName getPersonalName();

    void setPersonalName(PersonalName personalName);

    Integer getYear();

    void setYear(Integer year);

    Integer getMonth();

    void setMonth(Integer month);


    interface DayPlanStateCreated extends DayPlanStateEvent
    {
    
    }


    interface DayPlanStateMergePatched extends DayPlanStateEvent
    {
        Boolean getIsPropertyDescriptionRemoved();

        void setIsPropertyDescriptionRemoved(Boolean removed);

        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);


    }

    interface DayPlanStateRemoved extends DayPlanStateEvent
    {
    }


}

