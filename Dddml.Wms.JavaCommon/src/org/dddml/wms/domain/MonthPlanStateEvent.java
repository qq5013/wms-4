package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.Event;

public interface MonthPlanStateEvent extends Event
{
    MonthPlanStateEventId getStateEventId();

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


    interface MonthPlanStateCreated extends MonthPlanStateEvent
    {
        Iterable<DayPlanStateEvent.DayPlanStateCreated> getDayPlanEvents();
        
        void addDayPlanEvent(DayPlanStateEvent.DayPlanStateCreated e);

        DayPlanStateEvent.DayPlanStateCreated newDayPlanStateCreated(Integer day);

    
    }


    interface MonthPlanStateMergePatched extends MonthPlanStateEvent
    {
        Boolean getIsPropertyDescriptionRemoved();

        void setIsPropertyDescriptionRemoved(Boolean removed);

        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);

        Iterable<DayPlanStateEvent> getDayPlanEvents();
        
        void addDayPlanEvent(DayPlanStateEvent e);

        DayPlanStateEvent.DayPlanStateCreated newDayPlanStateCreated(Integer day);

        DayPlanStateEvent.DayPlanStateMergePatched newDayPlanStateMergePatched(Integer day);

        DayPlanStateEvent.DayPlanStateRemoved newDayPlanStateRemoved(Integer day);


    }

    interface MonthPlanStateRemoved extends MonthPlanStateEvent
    {
        Iterable<DayPlanStateEvent.DayPlanStateRemoved> getDayPlanEvents();
        
        void addDayPlanEvent(DayPlanStateEvent.DayPlanStateRemoved e);
        
        DayPlanStateEvent.DayPlanStateRemoved newDayPlanStateRemoved(Integer day);

    }


}

