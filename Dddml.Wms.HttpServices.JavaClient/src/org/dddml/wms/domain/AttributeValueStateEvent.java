package org.dddml.wms.domain;

import java.util.Iterator;
import java.util.Date;
import org.dddml.wms.specialization.Event;

public interface AttributeValueStateEvent extends Event
{

    AttributeValueStateEventId getStateEventId();

    boolean getStateEventReadOnly();

    void setStateEventReadOnly(boolean readOnly);

    Long getVersion();

    void setVersion(Long version);

    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    String getReferenceId();

    void setReferenceId(String referenceId);

    Boolean getActive();

    void setActive(Boolean active);

    String getAttributeId();

    void setAttributeId(String attributeId);

    

    interface AttributeValueStateCreated extends AttributeValueStateEvent
    {
    
    }


    interface AttributeValueStateMergePatched extends AttributeValueStateEvent
    {
        Boolean isPropertyNameRemoved();

        void setPropertyNameRemoved(Boolean removed);

        Boolean isPropertyDescriptionRemoved();

        void setPropertyDescriptionRemoved(Boolean removed);

        Boolean isPropertyReferenceIdRemoved();

        void setPropertyReferenceIdRemoved(Boolean removed);

        Boolean isPropertyActiveRemoved();

        void setPropertyActiveRemoved(Boolean removed);


    }

    interface AttributeValueStateRemoved extends AttributeValueStateEvent
    {
    }


}

