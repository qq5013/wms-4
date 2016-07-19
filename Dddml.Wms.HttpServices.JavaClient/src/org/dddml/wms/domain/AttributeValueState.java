package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.AttributeValueStateEvent.*;

public interface AttributeValueState
{
    String getValue();

    void setValue(String value);

    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    String getReferenceId();

    void setReferenceId(String referenceId);

    Long getVersion();

    void setVersion(Long version);

    Boolean getActive();

    void setActive(Boolean active);

    String getAttributeId();

    void setAttributeId(String attributeId);


    boolean isStateUnsaved();


    void when(AttributeValueStateCreated e);

    void when(AttributeValueStateMergePatched e);

    void when(AttributeValueStateRemoved e);

    void mutate(Event e);

    
}

