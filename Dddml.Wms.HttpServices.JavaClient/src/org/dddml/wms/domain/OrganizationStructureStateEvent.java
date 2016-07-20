package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.specialization.Event;

public interface OrganizationStructureStateEvent extends Event
{
    OrganizationStructureStateEventId getStateEventId();

    boolean getStateEventReadOnly();

    void setStateEventReadOnly(boolean readOnly);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    Date getCreatedAt();

    void setCreatedAt(Date createdAt);

    Boolean getActive();

    void setActive(Boolean active);

    

    interface OrganizationStructureStateCreated extends OrganizationStructureStateEvent
    {
    
    }


    interface OrganizationStructureStateMergePatched extends OrganizationStructureStateEvent
    {
        Boolean isPropertyActiveRemoved();

        void setPropertyActiveRemoved(Boolean removed);


    }

    interface OrganizationStructureStateDeleted extends OrganizationStructureStateEvent
    {
    }


}

