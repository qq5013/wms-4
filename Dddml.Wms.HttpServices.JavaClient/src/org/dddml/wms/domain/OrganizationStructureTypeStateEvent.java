package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.specialization.Event;

public interface OrganizationStructureTypeStateEvent extends Event
{
    OrganizationStructureTypeStateEventId getStateEventId();

    boolean getStateEventReadOnly();

    void setStateEventReadOnly(boolean readOnly);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    Date getCreatedAt();

    void setCreatedAt(Date createdAt);

    Boolean getActive();

    void setActive(Boolean active);

    

    interface OrganizationStructureTypeStateCreated extends OrganizationStructureTypeStateEvent
    {
    
    }


    interface OrganizationStructureTypeStateMergePatched extends OrganizationStructureTypeStateEvent
    {
        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);


    }

    interface OrganizationStructureTypeStateDeleted extends OrganizationStructureTypeStateEvent
    {
    }


}

