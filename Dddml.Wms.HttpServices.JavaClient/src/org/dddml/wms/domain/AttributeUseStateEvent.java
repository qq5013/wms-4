package org.dddml.wms.domain;

import java.util.Iterator;
import java.util.Date;
import org.dddml.wms.specialization.Event;

public interface AttributeUseStateEvent extends Event
{

    AttributeUseStateEventId getStateEventId();

    boolean getStateEventReadOnly();

    void setStateEventReadOnly(boolean readOnly);

    Long getVersion();

    void setVersion(Long version);

    Integer getSequenceNumber();

    void setSequenceNumber(Integer sequenceNumber);

    Boolean getActive();

    void setActive(Boolean active);

    String getAttributeSetId();

    void setAttributeSetId(String attributeSetId);

    

    interface AttributeUseStateCreated extends AttributeUseStateEvent
    {
    
    }


    interface AttributeUseStateMergePatched extends AttributeUseStateEvent
    {
        Boolean isPropertySequenceNumberRemoved();

        void setPropertySequenceNumberRemoved(Boolean removed);

        Boolean isPropertyActiveRemoved();

        void setPropertyActiveRemoved(Boolean removed);


    }

    interface AttributeUseStateRemoved extends AttributeUseStateEvent
    {
    }


}

