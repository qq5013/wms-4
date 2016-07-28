package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.specialization.DomainError;
import org.dddml.wms.domain.AttributeUseMvoStateEvent.*;

public abstract class AbstractAttributeUseMvoState implements AttributeUseMvoState
{

    private AttributeSetAttributeUseId attributeSetAttributeUseId;

    public AttributeSetAttributeUseId getAttributeSetAttributeUseId()
    {
        return this.attributeSetAttributeUseId;
    }

    public void setAttributeSetAttributeUseId(AttributeSetAttributeUseId attributeSetAttributeUseId)
    {
        this.attributeSetAttributeUseId = attributeSetAttributeUseId;
    }

    private Integer sequenceNumber;

    public Integer getSequenceNumber()
    {
        return this.sequenceNumber;
    }

    public void setSequenceNumber(Integer sequenceNumber)
    {
        this.sequenceNumber = sequenceNumber;
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

    private String attributeSetName;

    public String getAttributeSetName()
    {
        return this.attributeSetName;
    }

    public void setAttributeSetName(String attributeSetName)
    {
        this.attributeSetName = attributeSetName;
    }

    private String attributeSetOrganizationId;

    public String getAttributeSetOrganizationId()
    {
        return this.attributeSetOrganizationId;
    }

    public void setAttributeSetOrganizationId(String attributeSetOrganizationId)
    {
        this.attributeSetOrganizationId = attributeSetOrganizationId;
    }

    private String attributeSetDescription;

    public String getAttributeSetDescription()
    {
        return this.attributeSetDescription;
    }

    public void setAttributeSetDescription(String attributeSetDescription)
    {
        this.attributeSetDescription = attributeSetDescription;
    }

    private String attributeSetSerialNumberAttributeId;

    public String getAttributeSetSerialNumberAttributeId()
    {
        return this.attributeSetSerialNumberAttributeId;
    }

    public void setAttributeSetSerialNumberAttributeId(String attributeSetSerialNumberAttributeId)
    {
        this.attributeSetSerialNumberAttributeId = attributeSetSerialNumberAttributeId;
    }

    private String attributeSetLotAttributeId;

    public String getAttributeSetLotAttributeId()
    {
        return this.attributeSetLotAttributeId;
    }

    public void setAttributeSetLotAttributeId(String attributeSetLotAttributeId)
    {
        this.attributeSetLotAttributeId = attributeSetLotAttributeId;
    }

    private String attributeSetReferenceId;

    public String getAttributeSetReferenceId()
    {
        return this.attributeSetReferenceId;
    }

    public void setAttributeSetReferenceId(String attributeSetReferenceId)
    {
        this.attributeSetReferenceId = attributeSetReferenceId;
    }

    private Long attributeSetVersion;

    public Long getAttributeSetVersion()
    {
        return this.attributeSetVersion;
    }

    public void setAttributeSetVersion(Long attributeSetVersion)
    {
        this.attributeSetVersion = attributeSetVersion;
    }

    private String attributeSetCreatedBy;

    public String getAttributeSetCreatedBy()
    {
        return this.attributeSetCreatedBy;
    }

    public void setAttributeSetCreatedBy(String attributeSetCreatedBy)
    {
        this.attributeSetCreatedBy = attributeSetCreatedBy;
    }

    private Date attributeSetCreatedAt;

    public Date getAttributeSetCreatedAt()
    {
        return this.attributeSetCreatedAt;
    }

    public void setAttributeSetCreatedAt(Date attributeSetCreatedAt)
    {
        this.attributeSetCreatedAt = attributeSetCreatedAt;
    }

    private String attributeSetUpdatedBy;

    public String getAttributeSetUpdatedBy()
    {
        return this.attributeSetUpdatedBy;
    }

    public void setAttributeSetUpdatedBy(String attributeSetUpdatedBy)
    {
        this.attributeSetUpdatedBy = attributeSetUpdatedBy;
    }

    private Date attributeSetUpdatedAt;

    public Date getAttributeSetUpdatedAt()
    {
        return this.attributeSetUpdatedAt;
    }

    public void setAttributeSetUpdatedAt(Date attributeSetUpdatedAt)
    {
        this.attributeSetUpdatedAt = attributeSetUpdatedAt;
    }

    private Boolean attributeSetActive;

    public Boolean getAttributeSetActive()
    {
        return this.attributeSetActive;
    }

    public void setAttributeSetActive(Boolean attributeSetActive)
    {
        this.attributeSetActive = attributeSetActive;
    }

    private Boolean attributeSetDeleted;

    public Boolean getAttributeSetDeleted()
    {
        return this.attributeSetDeleted;
    }

    public void setAttributeSetDeleted(Boolean attributeSetDeleted)
    {
        this.attributeSetDeleted = attributeSetDeleted;
    }

    public boolean isStateUnsaved() 
    {
        return this.getAttributeSetVersion() == null;
    }


    public AbstractAttributeUseMvoState()
    {
        initializeProperties();
    }
    
    protected void initializeProperties() {
    }


    public void mutate(Event e) {
        if (e instanceof AttributeUseMvoStateCreated) {
            when((AttributeUseMvoStateCreated) e);
        } else if (e instanceof AttributeUseMvoStateMergePatched) {
            when((AttributeUseMvoStateMergePatched) e);
        } else if (e instanceof AttributeUseMvoStateDeleted) {
            when((AttributeUseMvoStateDeleted) e);
        }
    }

    public void when(AttributeUseMvoStateCreated e)
    {
        throwOnWrongEvent(e);
        this.setSequenceNumber(e.getSequenceNumber());
        this.setVersion(e.getVersion());
        this.setActive(e.getActive());
        this.setAttributeSetName(e.getAttributeSetName());
        this.setAttributeSetOrganizationId(e.getAttributeSetOrganizationId());
        this.setAttributeSetDescription(e.getAttributeSetDescription());
        this.setAttributeSetSerialNumberAttributeId(e.getAttributeSetSerialNumberAttributeId());
        this.setAttributeSetLotAttributeId(e.getAttributeSetLotAttributeId());
        this.setAttributeSetReferenceId(e.getAttributeSetReferenceId());
        this.setAttributeSetCreatedBy(e.getAttributeSetCreatedBy());
        this.setAttributeSetCreatedAt(e.getAttributeSetCreatedAt());
        this.setAttributeSetUpdatedBy(e.getAttributeSetUpdatedBy());
        this.setAttributeSetUpdatedAt(e.getAttributeSetUpdatedAt());
        this.setAttributeSetActive(e.getAttributeSetActive());
        this.setAttributeSetDeleted(e.getAttributeSetDeleted());

        this.setDeleted(false);

        this.setCreatedBy(e.getCreatedBy());
        this.setCreatedAt(e.getCreatedAt());

    }

    public void when(AttributeUseMvoStateMergePatched e)
    {
        throwOnWrongEvent(e);

        if (e.getSequenceNumber() == null)
        {
            if (e.getIsPropertySequenceNumberRemoved() != null && e.getIsPropertySequenceNumberRemoved())
            {
                this.setSequenceNumber(null);
            }
        }
        else
        {
            this.setSequenceNumber(e.getSequenceNumber());
        }
        if (e.getVersion() == null)
        {
            if (e.getIsPropertyVersionRemoved() != null && e.getIsPropertyVersionRemoved())
            {
                this.setVersion(null);
            }
        }
        else
        {
            this.setVersion(e.getVersion());
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
        if (e.getAttributeSetName() == null)
        {
            if (e.getIsPropertyAttributeSetNameRemoved() != null && e.getIsPropertyAttributeSetNameRemoved())
            {
                this.setAttributeSetName(null);
            }
        }
        else
        {
            this.setAttributeSetName(e.getAttributeSetName());
        }
        if (e.getAttributeSetOrganizationId() == null)
        {
            if (e.getIsPropertyAttributeSetOrganizationIdRemoved() != null && e.getIsPropertyAttributeSetOrganizationIdRemoved())
            {
                this.setAttributeSetOrganizationId(null);
            }
        }
        else
        {
            this.setAttributeSetOrganizationId(e.getAttributeSetOrganizationId());
        }
        if (e.getAttributeSetDescription() == null)
        {
            if (e.getIsPropertyAttributeSetDescriptionRemoved() != null && e.getIsPropertyAttributeSetDescriptionRemoved())
            {
                this.setAttributeSetDescription(null);
            }
        }
        else
        {
            this.setAttributeSetDescription(e.getAttributeSetDescription());
        }
        if (e.getAttributeSetSerialNumberAttributeId() == null)
        {
            if (e.getIsPropertyAttributeSetSerialNumberAttributeIdRemoved() != null && e.getIsPropertyAttributeSetSerialNumberAttributeIdRemoved())
            {
                this.setAttributeSetSerialNumberAttributeId(null);
            }
        }
        else
        {
            this.setAttributeSetSerialNumberAttributeId(e.getAttributeSetSerialNumberAttributeId());
        }
        if (e.getAttributeSetLotAttributeId() == null)
        {
            if (e.getIsPropertyAttributeSetLotAttributeIdRemoved() != null && e.getIsPropertyAttributeSetLotAttributeIdRemoved())
            {
                this.setAttributeSetLotAttributeId(null);
            }
        }
        else
        {
            this.setAttributeSetLotAttributeId(e.getAttributeSetLotAttributeId());
        }
        if (e.getAttributeSetReferenceId() == null)
        {
            if (e.getIsPropertyAttributeSetReferenceIdRemoved() != null && e.getIsPropertyAttributeSetReferenceIdRemoved())
            {
                this.setAttributeSetReferenceId(null);
            }
        }
        else
        {
            this.setAttributeSetReferenceId(e.getAttributeSetReferenceId());
        }
        if (e.getAttributeSetCreatedBy() == null)
        {
            if (e.getIsPropertyAttributeSetCreatedByRemoved() != null && e.getIsPropertyAttributeSetCreatedByRemoved())
            {
                this.setAttributeSetCreatedBy(null);
            }
        }
        else
        {
            this.setAttributeSetCreatedBy(e.getAttributeSetCreatedBy());
        }
        if (e.getAttributeSetCreatedAt() == null)
        {
            if (e.getIsPropertyAttributeSetCreatedAtRemoved() != null && e.getIsPropertyAttributeSetCreatedAtRemoved())
            {
                this.setAttributeSetCreatedAt(null);
            }
        }
        else
        {
            this.setAttributeSetCreatedAt(e.getAttributeSetCreatedAt());
        }
        if (e.getAttributeSetUpdatedBy() == null)
        {
            if (e.getIsPropertyAttributeSetUpdatedByRemoved() != null && e.getIsPropertyAttributeSetUpdatedByRemoved())
            {
                this.setAttributeSetUpdatedBy(null);
            }
        }
        else
        {
            this.setAttributeSetUpdatedBy(e.getAttributeSetUpdatedBy());
        }
        if (e.getAttributeSetUpdatedAt() == null)
        {
            if (e.getIsPropertyAttributeSetUpdatedAtRemoved() != null && e.getIsPropertyAttributeSetUpdatedAtRemoved())
            {
                this.setAttributeSetUpdatedAt(null);
            }
        }
        else
        {
            this.setAttributeSetUpdatedAt(e.getAttributeSetUpdatedAt());
        }
        if (e.getAttributeSetActive() == null)
        {
            if (e.getIsPropertyAttributeSetActiveRemoved() != null && e.getIsPropertyAttributeSetActiveRemoved())
            {
                this.setAttributeSetActive(null);
            }
        }
        else
        {
            this.setAttributeSetActive(e.getAttributeSetActive());
        }
        if (e.getAttributeSetDeleted() == null)
        {
            if (e.getIsPropertyAttributeSetDeletedRemoved() != null && e.getIsPropertyAttributeSetDeletedRemoved())
            {
                this.setAttributeSetDeleted(null);
            }
        }
        else
        {
            this.setAttributeSetDeleted(e.getAttributeSetDeleted());
        }

        this.setUpdatedBy(e.getCreatedBy());
        this.setUpdatedAt(e.getCreatedAt());

    }

    public void when(AttributeUseMvoStateDeleted e)
    {
        throwOnWrongEvent(e);

        this.setDeleted(true);
        this.setUpdatedBy(e.getCreatedBy());
        this.setUpdatedAt(e.getCreatedAt());

    }

    protected void throwOnWrongEvent(AttributeUseMvoStateEvent stateEvent)
    {
        AttributeSetAttributeUseId stateEntityId = this.getAttributeSetAttributeUseId(); // Aggregate Id
        AttributeSetAttributeUseId eventEntityId = stateEvent.getStateEventId().getAttributeSetAttributeUseId(); // EntityBase.Aggregate.GetStateEventIdPropertyIdName();
        if (!stateEntityId.equals(eventEntityId))
        {
            throw DomainError.named("mutateWrongEntity", "Entity Id %1$s in state but entity id %2$s in event", stateEntityId, eventEntityId);
        }

        Long stateVersion = this.getAttributeSetVersion();
        Long eventVersion = stateEvent.getStateEventId().getAttributeSetVersion();// Aggregate Version
        if (!(stateVersion == null && eventVersion == AttributeUseMvoState.VERSION_NULL) && stateVersion != eventVersion)
        {
            throw DomainError.named("concurrencyConflict", "Conflict between state version (%1$s) and event version (%2$s + 1)", stateVersion, eventVersion);
        }

    }

    public static class SimpleAttributeUseMvoState extends AbstractAttributeUseMvoState
    {
    }


}

