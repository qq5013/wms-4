package org.dddml.wms.domain;

import java.util.Iterator;
import java.util.Date;
import org.dddml.wms.specialization.Event;

public interface OrganizationStructureTypeStateEvent extends Event
{

    OrganizationStructureTypeStateEventId getStateEventId();

    boolean getStateEventReadOnly();

    void setStateEventReadOnly(boolean readOnly);

    Boolean getActive();

    void setActive(Boolean active);

    

    interface OrganizationStructureTypeStateCreated extends OrganizationStructureTypeStateEvent
    {
    
    }


    interface OrganizationStructureTypeStateMergePatched extends OrganizationStructureTypeStateEvent
    {
        Boolean isPropertyActiveRemoved();

        void setPropertyActiveRemoved(Boolean removed);


    }


    interface OrganizationStructureTypeStateDeleted extends OrganizationStructureTypeStateEvent
    {
    }


}

