package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.DayPlanStateEvent.*;

public interface DayPlanState
{
    Long VERSION_ZERO = 0L;

    Long VERSION_NULL = VERSION_ZERO - 1;

    DayPlanId getDayPlanId();

    void setDayPlanId(DayPlanId dayPlanId);

    Integer getDay();

    void setDay(Integer day);

    String getDescription();

    void setDescription(String description);

    Long getVersion();

    void setVersion(Long version);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    Date getCreatedAt();

    void setCreatedAt(Date createdAt);

    String getUpdatedBy();

    void setUpdatedBy(String updatedBy);

    Date getUpdatedAt();

    void setUpdatedAt(Date updatedAt);

    Boolean getActive();

    void setActive(Boolean active);

    Boolean getDeleted();

    void setDeleted(Boolean deleted);

    PersonalName getPersonalName();

    void setPersonalName(PersonalName personalName);

    Integer getYear();

    void setYear(Integer year);

    Integer getMonth();

    void setMonth(Integer month);


    boolean isStateUnsaved();


    void mutate(Event e);

    void when(DayPlanStateCreated e);

    void when(DayPlanStateMergePatched e);

    void when(DayPlanStateRemoved e);
    
}

