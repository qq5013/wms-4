package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.specialization.DomainError;
import org.dddml.wms.domain.AttributeStateEvent.*;

public abstract class AbstractAttributeState implements AttributeState
{

    private String attributeId;

    public String getAttributeId()
    {
        return this.attributeId;
    }

    public void setAttributeId(String attributeId)
    {
        this.attributeId = attributeId;
    }

    private String name;

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    private String organizationId;

    public String getOrganizationId()
    {
        return this.organizationId;
    }

    public void setOrganizationId(String organizationId)
    {
        this.organizationId = organizationId;
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

    private Boolean isMandatory;

    public Boolean getIsMandatory()
    {
        return this.isMandatory;
    }

    public void setIsMandatory(Boolean isMandatory)
    {
        this.isMandatory = isMandatory;
    }

    private Boolean isInstanceAttribute;

    public Boolean getIsInstanceAttribute()
    {
        return this.isInstanceAttribute;
    }

    public void setIsInstanceAttribute(Boolean isInstanceAttribute)
    {
        this.isInstanceAttribute = isInstanceAttribute;
    }

    private String attributeValueType;

    public String getAttributeValueType()
    {
        return this.attributeValueType;
    }

    public void setAttributeValueType(String attributeValueType)
    {
        this.attributeValueType = attributeValueType;
    }

    private Integer attributeValueLength;

    public Integer getAttributeValueLength()
    {
        return this.attributeValueLength;
    }

    public void setAttributeValueLength(Integer attributeValueLength)
    {
        this.attributeValueLength = attributeValueLength;
    }

    private Boolean isList;

    public Boolean getIsList()
    {
        return this.isList;
    }

    public void setIsList(Boolean isList)
    {
        this.isList = isList;
    }

    private String fieldName;

    public String getFieldName()
    {
        return this.fieldName;
    }

    public void setFieldName(String fieldName)
    {
        this.fieldName = fieldName;
    }

    private String referenceId;

    public String getReferenceId()
    {
        return this.referenceId;
    }

    public void setReferenceId(String referenceId)
    {
        this.referenceId = referenceId;
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
        return this.getVersion() == null;
    }

    private AttributeValueStates attributeValues;

    public AttributeValueStates getAttributeValues()
    {
        return this.attributeValues;
    }

    public void setAttributeValues(AttributeValueStates attributeValues)
    {
        this.attributeValues = attributeValues;
    }


    public AbstractAttributeState()
    {
        attributeValues = new SimpleAttributeValueStates(this);

        initializeProperties();
    }
    
    protected void initializeProperties() {
    }


    public void mutate(Event e) {
        if (e instanceof AttributeStateCreated) {
            when((AttributeStateCreated) e);
        } else if (e instanceof AttributeStateMergePatched) {
            when((AttributeStateMergePatched) e);
        } else if (e instanceof AttributeStateDeleted) {
            when((AttributeStateDeleted) e);
        }
    }

    public void when(AttributeStateCreated e)
    {
        throwOnWrongEvent(e);
        this.setName(e.getName());
        this.setOrganizationId(e.getOrganizationId());
        this.setDescription(e.getDescription());
        this.setIsMandatory(e.getIsMandatory());
        this.setIsInstanceAttribute(e.getIsInstanceAttribute());
        this.setAttributeValueType(e.getAttributeValueType());
        this.setAttributeValueLength(e.getAttributeValueLength());
        this.setIsList(e.getIsList());
        this.setFieldName(e.getFieldName());
        this.setReferenceId(e.getReferenceId());
        this.setActive(e.getActive());

        this.setDeleted(false);

        this.setCreatedBy(e.getCreatedBy());
        this.setCreatedAt(e.getCreatedAt());

        for (AttributeValueStateEvent.AttributeValueStateCreated innerEvent : e.getAttributeValueEvents()) {
            AttributeValueState innerState = this.getAttributeValues().get(innerEvent.getStateEventId().getValue());
            innerState.mutate(innerEvent);
        }
    }

    public void when(AttributeStateMergePatched e)
    {
        throwOnWrongEvent(e);

        if (e.getName() == null)
        {
            if (e.getIsPropertyNameRemoved() != null && e.getIsPropertyNameRemoved())
            {
                this.setName(null);
            }
        }
        else
        {
            this.setName(e.getName());
        }
        if (e.getOrganizationId() == null)
        {
            if (e.getIsPropertyOrganizationIdRemoved() != null && e.getIsPropertyOrganizationIdRemoved())
            {
                this.setOrganizationId(null);
            }
        }
        else
        {
            this.setOrganizationId(e.getOrganizationId());
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
        if (e.getIsMandatory() == null)
        {
            if (e.getIsPropertyIsMandatoryRemoved() != null && e.getIsPropertyIsMandatoryRemoved())
            {
                this.setIsMandatory(null);
            }
        }
        else
        {
            this.setIsMandatory(e.getIsMandatory());
        }
        if (e.getIsInstanceAttribute() == null)
        {
            if (e.getIsPropertyIsInstanceAttributeRemoved() != null && e.getIsPropertyIsInstanceAttributeRemoved())
            {
                this.setIsInstanceAttribute(null);
            }
        }
        else
        {
            this.setIsInstanceAttribute(e.getIsInstanceAttribute());
        }
        if (e.getAttributeValueType() == null)
        {
            if (e.getIsPropertyAttributeValueTypeRemoved() != null && e.getIsPropertyAttributeValueTypeRemoved())
            {
                this.setAttributeValueType(null);
            }
        }
        else
        {
            this.setAttributeValueType(e.getAttributeValueType());
        }
        if (e.getAttributeValueLength() == null)
        {
            if (e.getIsPropertyAttributeValueLengthRemoved() != null && e.getIsPropertyAttributeValueLengthRemoved())
            {
                this.setAttributeValueLength(null);
            }
        }
        else
        {
            this.setAttributeValueLength(e.getAttributeValueLength());
        }
        if (e.getIsList() == null)
        {
            if (e.getIsPropertyIsListRemoved() != null && e.getIsPropertyIsListRemoved())
            {
                this.setIsList(null);
            }
        }
        else
        {
            this.setIsList(e.getIsList());
        }
        if (e.getFieldName() == null)
        {
            if (e.getIsPropertyFieldNameRemoved() != null && e.getIsPropertyFieldNameRemoved())
            {
                this.setFieldName(null);
            }
        }
        else
        {
            this.setFieldName(e.getFieldName());
        }
        if (e.getReferenceId() == null)
        {
            if (e.getIsPropertyReferenceIdRemoved() != null && e.getIsPropertyReferenceIdRemoved())
            {
                this.setReferenceId(null);
            }
        }
        else
        {
            this.setReferenceId(e.getReferenceId());
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

        for (AttributeValueStateEvent innerEvent : e.getAttributeValueEvents()) {
            AttributeValueState innerState = this.getAttributeValues().get(innerEvent.getStateEventId().getValue());
            innerState.mutate(innerEvent);
            if (innerEvent instanceof AttributeValueStateEvent.AttributeValueStateRemoved)
            {
                //AttributeValueStateEvent.AttributeValueStateRemoved removed = (AttributeValueStateEvent.AttributeValueStateRemoved)innerEvent;
                this.getAttributeValues().remove(innerState);
            }
        }
    }

    public void when(AttributeStateDeleted e)
    {
        throwOnWrongEvent(e);

        this.setDeleted(true);
        this.setUpdatedBy(e.getCreatedBy());
        this.setUpdatedAt(e.getCreatedAt());

        for (AttributeValueState innerState : this.getAttributeValues())
        {
            this.getAttributeValues().remove(innerState);
        
            AttributeValueStateEvent.AttributeValueStateRemoved innerE = e.newAttributeValueStateRemoved(innerState.getValue());
            innerE.setCreatedAt(e.getCreatedAt());
            innerE.setCreatedBy(e.getCreatedBy());
            innerState.when(innerE);
            //e.addAttributeValueEvent(innerE);
        }
    }

    protected void throwOnWrongEvent(AttributeStateEvent stateEvent)
    {
        String stateEntityId = this.getAttributeId(); // Aggregate Id
        String eventEntityId = stateEvent.getStateEventId().getAttributeId(); // EntityBase.Aggregate.GetStateEventIdPropertyIdName();
        if (!stateEntityId.equals(eventEntityId))
        {
            throw DomainError.named("mutateWrongEntity", "Entity Id %1$s in state but entity id %2$s in event", stateEntityId, eventEntityId);
        }

        Long stateVersion = this.getVersion();
        Long eventVersion = stateEvent.getStateEventId().getVersion();// Aggregate Version
        if (!(stateVersion == null && eventVersion == AttributeState.VERSION_NULL) && stateVersion != eventVersion)
        {
            throw DomainError.named("concurrencyConflict", "Conflict between state version (%1$s) and event version (%2$s + 1)", stateVersion, eventVersion);
        }

    }

    public static class SimpleAttributeState extends AbstractAttributeState
    {
    }

    static class SimpleAttributeValueStates extends AbstractAttributeValueStates
    {
        public SimpleAttributeValueStates(AttributeState outerState)
        {
            super(outerState);
        }
    }


}

