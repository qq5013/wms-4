package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.AttributeUseStateEvent.*;

public interface AttributeUseState
{
    String getAttributeId();

    void setAttributeId(String attributeId);

    Integer getSequenceNumber();

    void setSequenceNumber(Integer sequenceNumber);

    Long getVersion();

    void setVersion(Long version);

    Boolean getActive();

    void setActive(Boolean active);

    String getAttributeSetId();

    void setAttributeSetId(String attributeSetId);


    boolean isStateUnsaved();


    void when(AttributeUseStateCreated e);

    void when(AttributeUseStateMergePatched e);

    void when(AttributeUseStateRemoved e);

    void mutate(Event e);

    
}

