package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.Event;

public interface YearPlanMvoStateEvent extends Event
{
    YearPlanMvoStateEventId getStateEventId();

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


    interface YearPlanMvoStateCreated extends YearPlanMvoStateEvent
    {
    
    }


    interface YearPlanMvoStateMergePatched extends YearPlanMvoStateEvent
    {
        Boolean getIsPropertyDescriptionRemoved();

        void setIsPropertyDescriptionRemoved(Boolean removed);

        Boolean getIsPropertyVersionRemoved();

        void setIsPropertyVersionRemoved(Boolean removed);

        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);

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

    interface YearPlanMvoStateDeleted extends YearPlanMvoStateEvent
    {
    }


}

