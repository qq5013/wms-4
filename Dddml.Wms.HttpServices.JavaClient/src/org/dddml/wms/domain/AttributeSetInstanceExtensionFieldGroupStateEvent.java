package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.specialization.Event;

public interface AttributeSetInstanceExtensionFieldGroupStateEvent extends Event
{

    AttributeSetInstanceExtensionFieldGroupStateEventId getStateEventId();

    boolean getStateEventReadOnly();

    void setStateEventReadOnly(boolean readOnly);

    String getFieldType();

    void setFieldType(String fieldType);

    Integer getFieldLength();

    void setFieldLength(Integer fieldLength);

    Integer getFieldCount();

    void setFieldCount(Integer fieldCount);

    String getNameFormat();

    void setNameFormat(String nameFormat);

    String getDescription();

    void setDescription(String description);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    Date getCreatedAt();

    void setCreatedAt(Date createdAt);

    Boolean getActive();

    void setActive(Boolean active);

    

    interface AttributeSetInstanceExtensionFieldGroupStateCreated extends AttributeSetInstanceExtensionFieldGroupStateEvent
    {
        Iterable<AttributeSetInstanceExtensionFieldStateEvent.AttributeSetInstanceExtensionFieldStateCreated> getAttributeSetInstanceExtensionFieldEvents();
        
        void addAttributeSetInstanceExtensionFieldEvent(AttributeSetInstanceExtensionFieldStateEvent.AttributeSetInstanceExtensionFieldStateCreated e);

        AttributeSetInstanceExtensionFieldStateEvent.AttributeSetInstanceExtensionFieldStateCreated newAttributeSetInstanceExtensionFieldStateCreated(String index);

    
    }


    interface AttributeSetInstanceExtensionFieldGroupStateMergePatched extends AttributeSetInstanceExtensionFieldGroupStateEvent
    {
        Boolean isPropertyFieldTypeRemoved();

        void setPropertyFieldTypeRemoved(Boolean removed);

        Boolean isPropertyFieldLengthRemoved();

        void setPropertyFieldLengthRemoved(Boolean removed);

        Boolean isPropertyFieldCountRemoved();

        void setPropertyFieldCountRemoved(Boolean removed);

        Boolean isPropertyNameFormatRemoved();

        void setPropertyNameFormatRemoved(Boolean removed);

        Boolean isPropertyDescriptionRemoved();

        void setPropertyDescriptionRemoved(Boolean removed);

        Boolean isPropertyActiveRemoved();

        void setPropertyActiveRemoved(Boolean removed);

        Iterable<AttributeSetInstanceExtensionFieldStateEvent> getAttributeSetInstanceExtensionFieldEvents();
        
        void addAttributeSetInstanceExtensionFieldEvent(AttributeSetInstanceExtensionFieldStateEvent e);

        AttributeSetInstanceExtensionFieldStateEvent.AttributeSetInstanceExtensionFieldStateCreated newAttributeSetInstanceExtensionFieldStateCreated(String index);

        AttributeSetInstanceExtensionFieldStateEvent.AttributeSetInstanceExtensionFieldStateMergePatched newAttributeSetInstanceExtensionFieldStateMergePatched(String index);

        AttributeSetInstanceExtensionFieldStateEvent.AttributeSetInstanceExtensionFieldStateRemoved newAttributeSetInstanceExtensionFieldStateRemoved(String index);


    }

    interface AttributeSetInstanceExtensionFieldGroupStateDeleted extends AttributeSetInstanceExtensionFieldGroupStateEvent
    {
        Iterable<AttributeSetInstanceExtensionFieldStateEvent.AttributeSetInstanceExtensionFieldStateRemoved> getAttributeSetInstanceExtensionFieldEvents();
        
        void addAttributeSetInstanceExtensionFieldEvent(AttributeSetInstanceExtensionFieldStateEvent.AttributeSetInstanceExtensionFieldStateRemoved e);
        
        AttributeSetInstanceExtensionFieldStateEvent.AttributeSetInstanceExtensionFieldStateRemoved newAttributeSetInstanceExtensionFieldStateRemoved(String index);

    }


}

