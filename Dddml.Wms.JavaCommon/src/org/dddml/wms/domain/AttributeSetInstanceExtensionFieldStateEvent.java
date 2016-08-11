package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.Event;

public interface AttributeSetInstanceExtensionFieldStateEvent extends Event
{
    AttributeSetInstanceExtensionFieldStateEventId getStateEventId();

    boolean getStateEventReadOnly();

    void setStateEventReadOnly(boolean readOnly);

    Long getVersion();

    void setVersion(Long version);

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

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    Date getCreatedAt();

    void setCreatedAt(Date createdAt);

    Boolean getActive();

    void setActive(Boolean active);

    String getGroupId();

    void setGroupId(String groupId);


    interface AttributeSetInstanceExtensionFieldStateCreated extends AttributeSetInstanceExtensionFieldStateEvent
    {
    
    }


    interface AttributeSetInstanceExtensionFieldStateMergePatched extends AttributeSetInstanceExtensionFieldStateEvent
    {
        Boolean getIsPropertyNameRemoved();

        void setIsPropertyNameRemoved(Boolean removed);

        Boolean getIsPropertyTypeRemoved();

        void setIsPropertyTypeRemoved(Boolean removed);

        Boolean getIsPropertyLengthRemoved();

        void setIsPropertyLengthRemoved(Boolean removed);

        Boolean getIsPropertyAliasRemoved();

        void setIsPropertyAliasRemoved(Boolean removed);

        Boolean getIsPropertyDescriptionRemoved();

        void setIsPropertyDescriptionRemoved(Boolean removed);

        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);


    }

    interface AttributeSetInstanceExtensionFieldStateRemoved extends AttributeSetInstanceExtensionFieldStateEvent
    {
    }


}

