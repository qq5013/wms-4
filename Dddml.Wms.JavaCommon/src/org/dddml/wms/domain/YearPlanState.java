package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.YearPlanStateEvent.*;

public interface YearPlanState
{
    Long VERSION_ZERO = 0L;

    Long VERSION_NULL = VERSION_ZERO - 1;

    YearPlanId getYearPlanId();

    void setYearPlanId(YearPlanId yearPlanId);

    Integer getYear();

    void setYear(Integer year);

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


    boolean isStateUnsaved();

    MonthPlanStates getMonthPlans();


    void mutate(Event e);

    void when(YearPlanStateCreated e);

    void when(YearPlanStateMergePatched e);

    void when(YearPlanStateRemoved e);
    
}

