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
        Boolean getIsPropertyFieldTypeRemoved();

        void setIsPropertyFieldTypeRemoved(Boolean removed);

        Boolean getIsPropertyFieldLengthRemoved();

        void setIsPropertyFieldLengthRemoved(Boolean removed);

        Boolean getIsPropertyFieldCountRemoved();

        void setIsPropertyFieldCountRemoved(Boolean removed);

        Boolean getIsPropertyNameFormatRemoved();

        void setIsPropertyNameFormatRemoved(Boolean removed);

        Boolean getIsPropertyDescriptionRemoved();

        void setIsPropertyDescriptionRemoved(Boolean removed);

        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);

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

