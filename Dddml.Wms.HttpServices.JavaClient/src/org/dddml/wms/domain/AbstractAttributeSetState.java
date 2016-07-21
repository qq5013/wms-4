package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.specialization.DomainError;
import org.dddml.wms.domain.AttributeSetStateEvent.*;

public abstract class AbstractAttributeSetState implements AttributeSetState
{

    private String attributeSetId;

    public String getAttributeSetId()
    {
        return this.attributeSetId;
    }

    public void setAttributeSetId(String attributeSetId)
    {
        this.attributeSetId = attributeSetId;
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

    private String serialNumberAttributeId;

    public String getSerialNumberAttributeId()
    {
        return this.serialNumberAttributeId;
    }

    public void setSerialNumberAttributeId(String serialNumberAttributeId)
    {
        this.serialNumberAttributeId = serialNumberAttributeId;
    }

    private String lotAttributeId;

    public String getLotAttributeId()
    {
        return this.lotAttributeId;
    }

    public void setLotAttributeId(String lotAttributeId)
    {
        this.lotAttributeId = lotAttributeId;
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
        return VERSION_ZERO.equals(this.getVersion());
    }

    private AttributeUseStates attributeUses;

    public AttributeUseStates getAttributeUses()
    {
        return this.attributeUses;
    }

    public void setAttributeUses(AttributeUseStates attributeUses)
    {
        this.attributeUses = attributeUses;
    }


    public AbstractAttributeSetState()
    {
        attributeUses = new SimpleAttributeUseStates(this);

        initializeProperties();
    }
    
    protected void initializeProperties() {
    }


    public void mutate(Event e) {
        if (e instanceof AttributeSetStateCreated) {
            when((AttributeSetStateCreated) e);
        } else if (e instanceof AttributeSetStateMergePatched) {
            when((AttributeSetStateMergePatched) e);
        } else if (e instanceof AttributeSetStateDeleted) {
            when((AttributeSetStateDeleted) e);
        }
    }

    public void when(AttributeSetStateCreated e)
    {
        throwOnWrongEvent(e);
        this.setName(e.getName());
        this.setOrganizationId(e.getOrganizationId());
        this.setDescription(e.getDescription());
        this.setSerialNumberAttributeId(e.getSerialNumberAttributeId());
        this.setLotAttributeId(e.getLotAttributeId());
        this.setReferenceId(e.getReferenceId());
        this.setActive(e.getActive());

        this.setDeleted(false);

        this.setCreatedBy(e.getCreatedBy());
        this.setCreatedAt(e.getCreatedAt());

        for (AttributeUseStateEvent.AttributeUseStateCreated innerEvent : e.getAttributeUseEvents()) {
            AttributeUseState innerState = this.getAttributeUses().get(innerEvent.getStateEventId().getAttributeId());
            innerState.mutate(innerEvent);
        }
    }

    public void when(AttributeSetStateMergePatched e)
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
        if (e.getSerialNumberAttributeId() == null)
        {
            if (e.getIsPropertySerialNumberAttributeIdRemoved() != null && e.getIsPropertySerialNumberAttributeIdRemoved())
            {
                this.setSerialNumberAttributeId(null);
            }
        }
        else
        {
            this.setSerialNumberAttributeId(e.getSerialNumberAttributeId());
        }
        if (e.getLotAttributeId() == null)
        {
            if (e.getIsPropertyLotAttributeIdRemoved() != null && e.getIsPropertyLotAttributeIdRemoved())
            {
                this.setLotAttributeId(null);
            }
        }
        else
        {
            this.setLotAttributeId(e.getLotAttributeId());
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

        for (AttributeUseStateEvent innerEvent : e.getAttributeUseEvents()) {
            AttributeUseState innerState = this.getAttributeUses().get(innerEvent.getStateEventId().getAttributeId());
            innerState.mutate(innerEvent);
            if (innerEvent instanceof AttributeUseStateEvent.AttributeUseStateRemoved)
            {
                //AttributeUseStateEvent.AttributeUseStateRemoved removed = (AttributeUseStateEvent.AttributeUseStateRemoved)innerEvent;
                this.getAttributeUses().remove(innerState);
            }
        }
    }

    public void when(AttributeSetStateDeleted e)
    {
        throwOnWrongEvent(e);

        this.setDeleted(true);
        this.setUpdatedBy(e.getCreatedBy());
        this.setUpdatedAt(e.getCreatedAt());

        for (AttributeUseState innerState : this.getAttributeUses())
        {
            this.getAttributeUses().remove(innerState);
        
            AttributeUseStateEvent.AttributeUseStateRemoved innerE = e.newAttributeUseStateRemoved(innerState.getAttributeId());
            innerE.setCreatedAt(e.getCreatedAt());
            innerE.setCreatedBy(e.getCreatedBy());
            innerState.when(innerE);
            //e.addAttributeUseEvent(innerE);
        }
    }

    protected void throwOnWrongEvent(AttributeSetStateEvent stateEvent)
    {
        String stateEntityId = this.getAttributeSetId(); // Aggregate Id
        String eventEntityId = stateEvent.getStateEventId().getAttributeSetId(); // EntityBase.Aggregate.GetStateEventIdPropertyIdName();
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

    public static class SimpleAttributeSetState extends AbstractAttributeSetState
    {
    }

    static class SimpleAttributeUseStates extends AbstractAttributeUseStates
    {
        public SimpleAttributeUseStates(AttributeSetState outerState)
        {
            super(outerState);
        }
    }


}

