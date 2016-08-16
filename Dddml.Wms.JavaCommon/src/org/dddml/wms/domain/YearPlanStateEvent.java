package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.Event;

public interface YearPlanStateEvent extends Event
{
    YearPlanStateEventId getStateEventId();

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


    interface YearPlanStateCreated extends YearPlanStateEvent
    {
        Iterable<MonthPlanStateEvent.MonthPlanStateCreated> getMonthPlanEvents();
        
        void addMonthPlanEvent(MonthPlanStateEvent.MonthPlanStateCreated e);

        MonthPlanStateEvent.MonthPlanStateCreated newMonthPlanStateCreated(Integer month);

    
    }


    interface YearPlanStateMergePatched extends YearPlanStateEvent
    {
        Boolean getIsPropertyDescriptionRemoved();

        void setIsPropertyDescriptionRemoved(Boolean removed);

        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);

        Iterable<MonthPlanStateEvent> getMonthPlanEvents();
        
        void addMonthPlanEvent(MonthPlanStateEvent e);

        MonthPlanStateEvent.MonthPlanStateCreated newMonthPlanStateCreated(Integer month);

        MonthPlanStateEvent.MonthPlanStateMergePatched newMonthPlanStateMergePatched(Integer month);

        MonthPlanStateEvent.MonthPlanStateRemoved newMonthPlanStateRemoved(Integer month);


    }

    interface YearPlanStateRemoved extends YearPlanStateEvent
    {
        Iterable<MonthPlanStateEvent.MonthPlanStateRemoved> getMonthPlanEvents();
        
        void addMonthPlanEvent(MonthPlanStateEvent.MonthPlanStateRemoved e);
        
        MonthPlanStateEvent.MonthPlanStateRemoved newMonthPlanStateRemoved(Integer month);

    }


}

