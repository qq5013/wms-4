package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.MonthPlanMvoStateEvent.*;

public interface MonthPlanMvoState
{
    Long VERSION_ZERO = 0L;

    Long VERSION_NULL = VERSION_ZERO - 1;

    MonthPlanId getMonthPlanId();

    void setMonthPlanId(MonthPlanId monthPlanId);

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

    String getYearPlanDescription();

    void setYearPlanDescription(String yearPlanDescription);

    Long getYearPlanVersion();

    void setYearPlanVersion(Long yearPlanVersion);

    String getYearPlanCreatedBy();

    void setYearPlanCreatedBy(String yearPlanCreatedBy);

    Date getYearPlanCreatedAt();

    void setYearPlanCreatedAt(Date yearPlanCreatedAt);

    String getYearPlanUpdatedBy();

    void setYearPlanUpdatedBy(String yearPlanUpdatedBy);

    Date getYearPlanUpdatedAt();

    void setYearPlanUpdatedAt(Date yearPlanUpdatedAt);

    Boolean getYearPlanActive();

    void setYearPlanActive(Boolean yearPlanActive);

    Boolean getYearPlanDeleted();

    void setYearPlanDeleted(Boolean yearPlanDeleted);

    Date getPersonBirthDate();

    void setPersonBirthDate(Date personBirthDate);

    PersonalName getPersonLoves();

    void setPersonLoves(PersonalName personLoves);

    Long getPersonVersion();

    void setPersonVersion(Long personVersion);

    String getPersonCreatedBy();

    void setPersonCreatedBy(String personCreatedBy);

    Date getPersonCreatedAt();

    void setPersonCreatedAt(Date personCreatedAt);

    String getPersonUpdatedBy();

    void setPersonUpdatedBy(String personUpdatedBy);

    Date getPersonUpdatedAt();

    void setPersonUpdatedAt(Date personUpdatedAt);

    Boolean getPersonActive();

    void setPersonActive(Boolean personActive);

    Boolean getPersonDeleted();

    void setPersonDeleted(Boolean personDeleted);


    boolean isStateUnsaved();


    void mutate(Event e);

    void when(MonthPlanMvoStateCreated e);

    void when(MonthPlanMvoStateMergePatched e);

    void when(MonthPlanMvoStateDeleted e);
    
}

