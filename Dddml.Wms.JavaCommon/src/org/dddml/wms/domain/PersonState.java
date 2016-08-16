package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.PersonStateEvent.*;

public interface PersonState
{
    Long VERSION_ZERO = 0L;

    Long VERSION_NULL = VERSION_ZERO - 1;

    PersonalName getPersonalName();

    void setPersonalName(PersonalName personalName);

    Date getBirthDate();

    void setBirthDate(Date birthDate);

    PersonalName getLoves();

    void setLoves(PersonalName loves);

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


    boolean isStateUnsaved();

    YearPlanStates getYearPlans();


    void mutate(Event e);

    void when(PersonStateCreated e);

    void when(PersonStateMergePatched e);

    void when(PersonStateDeleted e);
    
}

