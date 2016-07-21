package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.AttributeSetInstanceExtensionFieldStateEvent.*;

public interface AttributeSetInstanceExtensionFieldState
{
    Long VERSION_ZERO = 0L;

    AttributeSetInstanceExtensionFieldId getAttributeSetInstanceExtensionFieldId();

    void setAttributeSetInstanceExtensionFieldId(AttributeSetInstanceExtensionFieldId attributeSetInstanceExtensionFieldId);

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

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    Date getCreatedAt();

    void setCreatedAt(Date createdAt);

    String getUpdatedBy();

    void setUpdatedBy(String updatedBy);

    Date getUpdatedAt();

    void setUpdatedAt(Date updatedAt);

    Boolean getActive();

    void setActive(Boolean active);

    Boolean getDeleted();

    void setDeleted(Boolean deleted);

    String getGroupId();

    void setGroupId(String groupId);


    boolean isStateUnsaved();


    void mutate(Event e);

    void when(AttributeSetInstanceExtensionFieldStateCreated e);

    void when(AttributeSetInstanceExtensionFieldStateMergePatched e);

    void when(AttributeSetInstanceExtensionFieldStateRemoved e);
    
}

