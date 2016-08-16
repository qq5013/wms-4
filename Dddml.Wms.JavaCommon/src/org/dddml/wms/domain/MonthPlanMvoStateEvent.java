package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.Event;

public interface MonthPlanMvoStateEvent extends Event
{
    MonthPlanMvoStateEventId getStateEventId();

    boolean getStateEventReadOnly();

    void setStateEventReadOnly(boolean readOnly);

    String getDescription();

    void setDescription(String description);

    Long getVersion();

    void setVersion(Long version);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    Date getCreatedAt();

    void setCreatedAt(Date createdAt);

    Boolean getActive();

    void setActive(Boolean active);

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


    interface MonthPlanMvoStateCreated extends MonthPlanMvoStateEvent
    {
    
    }


    interface MonthPlanMvoStateMergePatched extends MonthPlanMvoStateEvent
    {
        Boolean getIsPropertyDescriptionRemoved();

        void setIsPropertyDescriptionRemoved(Boolean removed);

        Boolean getIsPropertyVersionRemoved();

        void setIsPropertyVersionRemoved(Boolean removed);

        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);

        Boolean getIsPropertyYearPlanDescriptionRemoved();

        void setIsPropertyYearPlanDescriptionRemoved(Boolean removed);

        Boolean getIsPropertyYearPlanVersionRemoved();

        void setIsPropertyYearPlanVersionRemoved(Boolean removed);

        Boolean getIsPropertyYearPlanCreatedByRemoved();

        void setIsPropertyYearPlanCreatedByRemoved(Boolean removed);

        Boolean getIsPropertyYearPlanCreatedAtRemoved();

        void setIsPropertyYearPlanCreatedAtRemoved(Boolean removed);

        Boolean getIsPropertyYearPlanUpdatedByRemoved();

        void setIsPropertyYearPlanUpdatedByRemoved(Boolean removed);

        Boolean getIsPropertyYearPlanUpdatedAtRemoved();

        void setIsPropertyYearPlanUpdatedAtRemoved(Boolean removed);

        Boolean getIsPropertyYearPlanActiveRemoved();

        void setIsPropertyYearPlanActiveRemoved(Boolean removed);

        Boolean getIsPropertyYearPlanDeletedRemoved();

        void setIsPropertyYearPlanDeletedRemoved(Boolean removed);

        Boolean getIsPropertyPersonBirthDateRemoved();

        void setIsPropertyPersonBirthDateRemoved(Boolean removed);

        Boolean getIsPropertyPersonLovesRemoved();

        void setIsPropertyPersonLovesRemoved(Boolean removed);

        Boolean getIsPropertyPersonCreatedByRemoved();

        void setIsPropertyPersonCreatedByRemoved(Boolean removed);

        Boolean getIsPropertyPersonCreatedAtRemoved();

        void setIsPropertyPersonCreatedAtRemoved(Boolean removed);

        Boolean getIsPropertyPersonUpdatedByRemoved();

        void setIsPropertyPersonUpdatedByRemoved(Boolean removed);

        Boolean getIsPropertyPersonUpdatedAtRemoved();

        void setIsPropertyPersonUpdatedAtRemoved(Boolean removed);

        Boolean getIsPropertyPersonActiveRemoved();

        void setIsPropertyPersonActiveRemoved(Boolean removed);

        Boolean getIsPropertyPersonDeletedRemoved();

        void setIsPropertyPersonDeletedRemoved(Boolean removed);


    }

    interface MonthPlanMvoStateDeleted extends MonthPlanMvoStateEvent
    {
    }


}

