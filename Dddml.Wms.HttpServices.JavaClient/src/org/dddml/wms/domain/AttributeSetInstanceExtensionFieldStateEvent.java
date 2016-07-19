package org.dddml.wms.domain;

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

    Boolean getActive();

    void setActive(Boolean active);

    String getGroupId();

    void setGroupId(String groupId);

    

    interface AttributeSetInstanceExtensionFieldStateCreated extends AttributeSetInstanceExtensionFieldStateEvent
    {
    
    }


    interface AttributeSetInstanceExtensionFieldStateMergePatched extends AttributeSetInstanceExtensionFieldStateEvent
    {
        Boolean isPropertyNameRemoved();

        void setPropertyNameRemoved(Boolean removed);

        Boolean isPropertyTypeRemoved();

        void setPropertyTypeRemoved(Boolean removed);

        Boolean isPropertyLengthRemoved();

        void setPropertyLengthRemoved(Boolean removed);

        Boolean isPropertyAliasRemoved();

        void setPropertyAliasRemoved(Boolean removed);

        Boolean isPropertyDescriptionRemoved();

        void setPropertyDescriptionRemoved(Boolean removed);

        Boolean isPropertyActiveRemoved();

        void setPropertyActiveRemoved(Boolean removed);


    }

    interface AttributeSetInstanceExtensionFieldStateRemoved extends AttributeSetInstanceExtensionFieldStateEvent
    {
    }


}

