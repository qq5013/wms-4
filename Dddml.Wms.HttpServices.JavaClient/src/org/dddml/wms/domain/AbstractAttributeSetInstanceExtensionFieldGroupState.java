package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.specialization.DomainError;
import org.dddml.wms.domain.AttributeSetInstanceExtensionFieldGroupStateEvent.*;

public abstract class AbstractAttributeSetInstanceExtensionFieldGroupState implements AttributeSetInstanceExtensionFieldGroupState
{

    private String id;

    public String getId()
    {
        return this.id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    private String fieldType;

    public String getFieldType()
    {
        return this.fieldType;
    }

    public void setFieldType(String fieldType)
    {
        this.fieldType = fieldType;
    }

    private Integer fieldLength;

    public Integer getFieldLength()
    {
        return this.fieldLength;
    }

    public void setFieldLength(Integer fieldLength)
    {
        this.fieldLength = fieldLength;
    }

    private Integer fieldCount;

    public Integer getFieldCount()
    {
        return this.fieldCount;
    }

    public void setFieldCount(Integer fieldCount)
    {
        this.fieldCount = fieldCount;
    }

    private String nameFormat;

    public String getNameFormat()
    {
        return this.nameFormat;
    }

    public void setNameFormat(String nameFormat)
    {
        this.nameFormat = nameFormat;
    }

    private String description;

    public String getDescription()
    {
        return this.description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    private Long version;

    public Long getVersion()
    {
        return this.version;
    }

    public void setVersion(Long version)
    {
        this.version = version;
    }

    private String createdBy;

    public String getCreatedBy()
    {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
    }

    private Date createdAt;

    public Date getCreatedAt()
    {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt)
    {
        this.createdAt = createdAt;
    }

    private String updatedBy;

    public String getUpdatedBy()
    {
        return this.updatedBy;
    }

    public void setUpdatedBy(String updatedBy)
    {
        this.updatedBy = updatedBy;
    }

    private Date updatedAt;

    public Date getUpdatedAt()
    {
        return this.updatedAt;
    }

    public void setUpdatedAt(Date updatedAt)
    {
        this.updatedAt = updatedAt;
    }

    private Boolean active;

    public Boolean getActive()
    {
        return this.active;
    }

    public void setActive(Boolean active)
    {
        this.active = active;
    }

    private Boolean deleted;

    public Boolean getDeleted()
    {
        return this.deleted;
    }

    public void setDeleted(Boolean deleted)
    {
        this.deleted = deleted;
    }

    public boolean isStateUnsaved() 
    {
        return VERSION_ZERO.equals(this.getVersion());
    }

    private AttributeSetInstanceExtensionFieldStates fields;

    public AttributeSetInstanceExtensionFieldStates getFields()
    {
        return this.fields;
    }

    public void setFields(AttributeSetInstanceExtensionFieldStates fields)
    {
        this.fields = fields;
    }


    public AbstractAttributeSetInstanceExtensionFieldGroupState()
    {
        fields = new SimpleAttributeSetInstanceExtensionFieldStates(this);

        initializeProperties();
    }
    
    protected void initializeProperties() {
    }


    public void mutate(Event e) {
        if (e instanceof AttributeSetInstanceExtensionFieldGroupStateCreated) {
            when((AttributeSetInstanceExtensionFieldGroupStateCreated) e);
        } else if (e instanceof AttributeSetInstanceExtensionFieldGroupStateMergePatched) {
            when((AttributeSetInstanceExtensionFieldGroupStateMergePatched) e);
        } else if (e instanceof AttributeSetInstanceExtensionFieldGroupStateDeleted) {
            when((AttributeSetInstanceExtensionFieldGroupStateDeleted) e);
        }
    }

    public void when(AttributeSetInstanceExtensionFieldGroupStateCreated e)
    {
        throwOnWrongEvent(e);
        this.setFieldType(e.getFieldType());
        this.setFieldLength(e.getFieldLength());
        this.setFieldCount(e.getFieldCount());
        this.setNameFormat(e.getNameFormat());
        this.setDescription(e.getDescription());
        this.setActive(e.getActive());

        this.setDeleted(false);

        this.setCreatedBy(e.getCreatedBy());
        this.setCreatedAt(e.getCreatedAt());

        for (AttributeSetInstanceExtensionFieldStateEvent.AttributeSetInstanceExtensionFieldStateCreated innerEvent : e.getAttributeSetInstanceExtensionFieldEvents()) {
            AttributeSetInstanceExtensionFieldState innerState = this.getFields().get(innerEvent.getStateEventId().getIndex());
            innerState.mutate(innerEvent);
        }
    }

    public void when(AttributeSetInstanceExtensionFieldGroupStateMergePatched e)
    {
        throwOnWrongEvent(e);

        if (e.getFieldType() == null)
        {
            if (e.getIsPropertyFieldTypeRemoved() != null && e.getIsPropertyFieldTypeRemoved())
            {
                this.setFieldType(null);
            }
        }
        else
        {
            this.setFieldType(e.getFieldType());
        }
        if (e.getFieldLength() == null)
        {
            if (e.getIsPropertyFieldLengthRemoved() != null && e.getIsPropertyFieldLengthRemoved())
            {
                this.setFieldLength(null);
            }
        }
        else
        {
            this.setFieldLength(e.getFieldLength());
        }
        if (e.getFieldCount() == null)
        {
            if (e.getIsPropertyFieldCountRemoved() != null && e.getIsPropertyFieldCountRemoved())
            {
                this.setFieldCount(null);
            }
        }
        else
        {
            this.setFieldCount(e.getFieldCount());
        }
        if (e.getNameFormat() == null)
        {
            if (e.getIsPropertyNameFormatRemoved() != null && e.getIsPropertyNameFormatRemoved())
            {
                this.setNameFormat(null);
            }
        }
        else
        {
            this.setNameFormat(e.getNameFormat());
        }
        if (e.getDescription() == null)
        {
            if (e.getIsPropertyDescriptionRemoved() != null && e.getIsPropertyDescriptionRemoved())
            {
                this.setDescription(null);
            }
        }
        else
        {
            this.setDescription(e.getDescription());
        }
        if (e.getActive() == null)
        {
            if (e.getIsPropertyActiveRemoved() != null && e.getIsPropertyActiveRemoved())
            {
                this.setActive(null);
            }
        }
        else
        {
            this.setActive(e.getActive());
        }

        this.setUpdatedBy(e.getCreatedBy());
        this.setUpdatedAt(e.getCreatedAt());

        for (AttributeSetInstanceExtensionFieldStateEvent innerEvent : e.getAttributeSetInstanceExtensionFieldEvents()) {
            AttributeSetInstanceExtensionFieldState innerState = this.getFields().get(innerEvent.getStateEventId().getIndex());
            innerState.mutate(innerEvent);
            if (innerEvent instanceof AttributeSetInstanceExtensionFieldStateEvent.AttributeSetInstanceExtensionFieldStateRemoved)
            {
                //AttributeSetInstanceExtensionFieldStateEvent.AttributeSetInstanceExtensionFieldStateRemoved removed = (AttributeSetInstanceExtensionFieldStateEvent.AttributeSetInstanceExtensionFieldStateRemoved)innerEvent;
                this.getFields().remove(innerState);
            }
        }
    }

    public void when(AttributeSetInstanceExtensionFieldGroupStateDeleted e)
    {
        throwOnWrongEvent(e);

        this.setDeleted(true);
        this.setUpdatedBy(e.getCreatedBy());
        this.setUpdatedAt(e.getCreatedAt());

        for (AttributeSetInstanceExtensionFieldState innerState : this.getFields())
        {
            this.getFields().remove(innerState);
        
            AttributeSetInstanceExtensionFieldStateEvent.AttributeSetInstanceExtensionFieldStateRemoved innerE = e.newAttributeSetInstanceExtensionFieldStateRemoved(innerState.getIndex());
            innerE.setCreatedAt(e.getCreatedAt());
            innerE.setCreatedBy(e.getCreatedBy());
            innerState.when(innerE);
            //e.addAttributeSetInstanceExtensionFieldEvent(innerE);
        }
    }

    protected void throwOnWrongEvent(AttributeSetInstanceExtensionFieldGroupStateEvent stateEvent)
    {
        String stateEntityId = this.getId(); // Aggregate Id
        String eventEntityId = stateEvent.getStateEventId().getId(); // EntityBase.Aggregate.GetStateEventIdPropertyIdName();
        if (!stateEntityId.equals(eventEntityId))
        {
            throw DomainError.named("mutateWrongEntity", "Entity Id %1$s in state but entity id %2$s in event", stateEntityId, eventEntityId);
        }

        Long stateVersion = this.getVersion();
        Long eventVersion = stateEvent.getStateEventId().getVersion();
        if (!stateVersion.equals(eventVersion))
        {
            throw DomainError.named("concurrencyConflict", "Conflict between state version %1$s and event version %2$s", stateVersion, eventVersion);
        }

    }

    public static class SimpleAttributeSetInstanceExtensionFieldStates extends AbstractAttributeSetInstanceExtensionFieldStates
    {
        public SimpleAttributeSetInstanceExtensionFieldStates(AttributeSetInstanceExtensionFieldGroupState outerState)
        {
            super(outerState);
        }
    }


}

