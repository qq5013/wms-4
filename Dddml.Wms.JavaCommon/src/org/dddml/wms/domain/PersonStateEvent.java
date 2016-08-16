package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.Event;

public interface PersonStateEvent extends Event
{
    PersonStateEventId getStateEventId();

    boolean getStateEventReadOnly();

    void setStateEventReadOnly(boolean readOnly);

    Date getBirthDate();

    void setBirthDate(Date birthDate);

    PersonalName getLoves();

    void setLoves(PersonalName loves);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    Date getCreatedAt();

    void setCreatedAt(Date createdAt);

    Boolean getActive();

    void setActive(Boolean active);


    interface PersonStateCreated extends PersonStateEvent
    {
        Iterable<YearPlanStateEvent.YearPlanStateCreated> getYearPlanEvents();
        
        void addYearPlanEvent(YearPlanStateEvent.YearPlanStateCreated e);

        YearPlanStateEvent.YearPlanStateCreated newYearPlanStateCreated(Integer year);

    
    }


    interface PersonStateMergePatched extends PersonStateEvent
    {
        Boolean getIsPropertyBirthDateRemoved();

        void setIsPropertyBirthDateRemoved(Boolean removed);

        Boolean getIsPropertyLovesRemoved();

        void setIsPropertyLovesRemoved(Boolean removed);

        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);

        Iterable<YearPlanStateEvent> getYearPlanEvents();
        
        void addYearPlanEvent(YearPlanStateEvent e);

        YearPlanStateEvent.YearPlanStateCreated newYearPlanStateCreated(Integer year);

        YearPlanStateEvent.YearPlanStateMergePatched newYearPlanStateMergePatched(Integer year);

        YearPlanStateEvent.YearPlanStateRemoved newYearPlanStateRemoved(Integer year);


    }

    interface PersonStateDeleted extends PersonStateEvent
    {
        Iterable<YearPlanStateEvent.YearPlanStateRemoved> getYearPlanEvents();
        
        void addYearPlanEvent(YearPlanStateEvent.YearPlanStateRemoved e);
        
        YearPlanStateEvent.YearPlanStateRemoved newYearPlanStateRemoved(Integer year);

    }


}

