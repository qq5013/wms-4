package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.AttributeSetInstanceExtensionFieldStateEvent.*;

public interface AttributeSetInstanceExtensionFieldState
{
    String getIndex();

    void setIndex(String index);

    String getName();

    void setName(String name);

    String getType();

    void setType(String type);

    Integer getLength();

    void setLength(Integer length);

    String getAlias();

    void setAlias(String alias);

    String getDescription();

    void setDescription(String description);

    Long getVersion();

    void setVersion(Long version);

    Boolean getActive();

    void setActive(Boolean active);

    String getGroupId();

    void setGroupId(String groupId);


    boolean isStateUnsaved();


    void when(AttributeSetInstanceExtensionFieldStateCreated e);

    void when(AttributeSetInstanceExtensionFieldStateMergePatched e);

    void when(AttributeSetInstanceExtensionFieldStateRemoved e);

    void mutate(Event e);

    
}

