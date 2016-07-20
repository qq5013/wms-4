package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.specialization.Event;

public interface OrganizationStateEvent extends Event
{

    OrganizationStateEventId getStateEventId();

    boolean getStateEventReadOnly();

    void setStateEventReadOnly(boolean readOnly);

    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    String getType();

    void setType(String type);

    Boolean getIsSummary();

    void setIsSummary(Boolean isSummary);

    Boolean getActive();

    void setActive(Boolean active);

    

    interface OrganizationStateCreated extends OrganizationStateEvent
    {
    
    }


    interface OrganizationStateMergePatched extends OrganizationStateEvent
    {
        Boolean isPropertyNameRemoved();

        void setPropertyNameRemoved(Boolean removed);

        Boolean isPropertyDescriptionRemoved();

        void setPropertyDescriptionRemoved(Boolean removed);

        Boolean isPropertyTypeRemoved();

        void setPropertyTypeRemoved(Boolean removed);

        Boolean isPropertyIsSummaryRemoved();

        void setPropertyIsSummaryRemoved(Boolean removed);

        Boolean isPropertyActiveRemoved();

        void setPropertyActiveRemoved(Boolean removed);


    }

    interface OrganizationStateDeleted extends OrganizationStateEvent
    {
    }


}

