package org.dddml.wms.domain;

import java.util.Set;
import java.math.BigDecimal;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.InOutLineStateEvent.*;

public abstract class AbstractInOutLineState implements InOutLineState
{

    private InOutLineId inOutLineId = new InOutLineId();

    public InOutLineId getInOutLineId() {
        return this.inOutLineId;
    }

    public void setInOutLineId(InOutLineId inOutLineId) {
        this.inOutLineId = inOutLineId;
    }

    public String getInOutDocumentNumber() {
        return this.getInOutLineId().getInOutDocumentNumber();
    }
        
    public void setInOutDocumentNumber(String inOutDocumentNumber) {
        this.getInOutLineId().setInOutDocumentNumber(inOutDocumentNumber);
    }

    public SkuId getSkuId() {
        return this.getInOutLineId().getSkuId();
    }
        
    public void setSkuId(SkuId skuId) {
        this.getInOutLineId().setSkuId(skuId);
    }

    private Long lineNumber;

    public Long getLineNumber()
    {
        return this.lineNumber;
    }

    public void setLineNumber(Long lineNumber)
    {
        this.lineNumber = lineNumber;
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

    private String locatorId;

    public String getLocatorId()
    {
        return this.locatorId;
    }

    public void setLocatorId(String locatorId)
    {
        this.locatorId = locatorId;
    }

    private String product;

    public String getProduct()
    {
        return this.product;
    }

    public void setProduct(String product)
    {
        this.product = product;
    }

    private String uomId;

    public String getUomId()
    {
        return this.uomId;
    }

    public void setUomId(String uomId)
    {
        this.uomId = uomId;
    }

    private BigDecimal movementQuantity;

    public BigDecimal getMovementQuantity()
    {
        return this.movementQuantity;
    }

    public void setMovementQuantity(BigDecimal movementQuantity)
    {
        this.movementQuantity = movementQuantity;
    }

    private BigDecimal confirmedQuantity;

    public BigDecimal getConfirmedQuantity()
    {
        return this.confirmedQuantity;
    }

    public void setConfirmedQuantity(BigDecimal confirmedQuantity)
    {
        this.confirmedQuantity = confirmedQuantity;
    }

    private BigDecimal scrappedQuantity;

    public BigDecimal getScrappedQuantity()
    {
        return this.scrappedQuantity;
    }

    public void setScrappedQuantity(BigDecimal scrappedQuantity)
    {
        this.scrappedQuantity = scrappedQuantity;
    }

    private BigDecimal targetQuantity;

    public BigDecimal getTargetQuantity()
    {
        return this.targetQuantity;
    }

    public void setTargetQuantity(BigDecimal targetQuantity)
    {
        this.targetQuantity = targetQuantity;
    }

    private BigDecimal pickedQuantity;

    public BigDecimal getPickedQuantity()
    {
        return this.pickedQuantity;
    }

    public void setPickedQuantity(BigDecimal pickedQuantity)
    {
        this.pickedQuantity = pickedQuantity;
    }

    private Boolean isInvoiced;

    public Boolean getIsInvoiced()
    {
        return this.isInvoiced;
    }

    public void setIsInvoiced(Boolean isInvoiced)
    {
        this.isInvoiced = isInvoiced;
    }

    private String attributeSetInstanceId;

    public String getAttributeSetInstanceId()
    {
        return this.attributeSetInstanceId;
    }

    public void setAttributeSetInstanceId(String attributeSetInstanceId)
    {
        this.attributeSetInstanceId = attributeSetInstanceId;
    }

    private Boolean isDescription;

    public Boolean getIsDescription()
    {
        return this.isDescription;
    }

    public void setIsDescription(Boolean isDescription)
    {
        this.isDescription = isDescription;
    }

    private Boolean processed;

    public Boolean getProcessed()
    {
        return this.processed;
    }

    public void setProcessed(Boolean processed)
    {
        this.processed = processed;
    }

    private BigDecimal quantityEntered;

    public BigDecimal getQuantityEntered()
    {
        return this.quantityEntered;
    }

    public void setQuantityEntered(BigDecimal quantityEntered)
    {
        this.quantityEntered = quantityEntered;
    }

    private Long rmaLineNumber;

    public Long getRmaLineNumber()
    {
        return this.rmaLineNumber;
    }

    public void setRmaLineNumber(Long rmaLineNumber)
    {
        this.rmaLineNumber = rmaLineNumber;
    }

    private Long reversalLineNumber;

    public Long getReversalLineNumber()
    {
        return this.reversalLineNumber;
    }

    public void setReversalLineNumber(Long reversalLineNumber)
    {
        this.reversalLineNumber = reversalLineNumber;
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


    public AbstractInOutLineState()
    {
        initializeProperties();
    }
    
    protected void initializeProperties() {
    }


    public void mutate(Event e) {
        if (e instanceof InOutLineStateCreated) {
            when((InOutLineStateCreated) e);
        } else if (e instanceof InOutLineStateMergePatched) {
            when((InOutLineStateMergePatched) e);
        } else if (e instanceof InOutLineStateRemoved) {
            when((InOutLineStateRemoved) e);
        }
    }

    public void when(InOutLineStateCreated e)
    {
        throwOnWrongEvent(e);
        this.setLineNumber(e.getLineNumber());
        this.setDescription(e.getDescription());
        this.setLocatorId(e.getLocatorId());
        this.setProduct(e.getProduct());
        this.setUomId(e.getUomId());
        this.setMovementQuantity(e.getMovementQuantity());
        this.setConfirmedQuantity(e.getConfirmedQuantity());
        this.setScrappedQuantity(e.getScrappedQuantity());
        this.setTargetQuantity(e.getTargetQuantity());
        this.setPickedQuantity(e.getPickedQuantity());
        this.setIsInvoiced(e.getIsInvoiced());
        this.setAttributeSetInstanceId(e.getAttributeSetInstanceId());
        this.setIsDescription(e.getIsDescription());
        this.setProcessed(e.getProcessed());
        this.setQuantityEntered(e.getQuantityEntered());
        this.setRmaLineNumber(e.getRmaLineNumber());
        this.setReversalLineNumber(e.getReversalLineNumber());
        this.setActive(e.getActive());

        this.setDeleted(false);

        this.setCreatedBy(e.getCreatedBy());
        this.setCreatedAt(e.getCreatedAt());

    }

    public void when(InOutLineStateMergePatched e)
    {
        throwOnWrongEvent(e);

        if (e.getLineNumber() == null)
        {
            if (e.getIsPropertyLineNumberRemoved() != null && e.getIsPropertyLineNumberRemoved())
            {
                this.setLineNumber(null);
            }
        }
        else
        {
            this.setLineNumber(e.getLineNumber());
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
        if (e.getLocatorId() == null)
        {
            if (e.getIsPropertyLocatorIdRemoved() != null && e.getIsPropertyLocatorIdRemoved())
            {
                this.setLocatorId(null);
            }
        }
        else
        {
            this.setLocatorId(e.getLocatorId());
        }
        if (e.getProduct() == null)
        {
            if (e.getIsPropertyProductRemoved() != null && e.getIsPropertyProductRemoved())
            {
                this.setProduct(null);
            }
        }
        else
        {
            this.setProduct(e.getProduct());
        }
        if (e.getUomId() == null)
        {
            if (e.getIsPropertyUomIdRemoved() != null && e.getIsPropertyUomIdRemoved())
            {
                this.setUomId(null);
            }
        }
        else
        {
            this.setUomId(e.getUomId());
        }
        if (e.getMovementQuantity() == null)
        {
            if (e.getIsPropertyMovementQuantityRemoved() != null && e.getIsPropertyMovementQuantityRemoved())
            {
                this.setMovementQuantity(null);
            }
        }
        else
        {
            this.setMovementQuantity(e.getMovementQuantity());
        }
        if (e.getConfirmedQuantity() == null)
        {
            if (e.getIsPropertyConfirmedQuantityRemoved() != null && e.getIsPropertyConfirmedQuantityRemoved())
            {
                this.setConfirmedQuantity(null);
            }
        }
        else
        {
            this.setConfirmedQuantity(e.getConfirmedQuantity());
        }
        if (e.getScrappedQuantity() == null)
        {
            if (e.getIsPropertyScrappedQuantityRemoved() != null && e.getIsPropertyScrappedQuantityRemoved())
            {
                this.setScrappedQuantity(null);
            }
        }
        else
        {
            this.setScrappedQuantity(e.getScrappedQuantity());
        }
        if (e.getTargetQuantity() == null)
        {
            if (e.getIsPropertyTargetQuantityRemoved() != null && e.getIsPropertyTargetQuantityRemoved())
            {
                this.setTargetQuantity(null);
            }
        }
        else
        {
            this.setTargetQuantity(e.getTargetQuantity());
        }
        if (e.getPickedQuantity() == null)
        {
            if (e.getIsPropertyPickedQuantityRemoved() != null && e.getIsPropertyPickedQuantityRemoved())
            {
                this.setPickedQuantity(null);
            }
        }
        else
        {
            this.setPickedQuantity(e.getPickedQuantity());
        }
        if (e.getIsInvoiced() == null)
        {
            if (e.getIsPropertyIsInvoicedRemoved() != null && e.getIsPropertyIsInvoicedRemoved())
            {
                this.setIsInvoiced(null);
            }
        }
        else
        {
            this.setIsInvoiced(e.getIsInvoiced());
        }
        if (e.getAttributeSetInstanceId() == null)
        {
            if (e.getIsPropertyAttributeSetInstanceIdRemoved() != null && e.getIsPropertyAttributeSetInstanceIdRemoved())
            {
                this.setAttributeSetInstanceId(null);
            }
        }
        else
        {
            this.setAttributeSetInstanceId(e.getAttributeSetInstanceId());
        }
        if (e.getIsDescription() == null)
        {
            if (e.getIsPropertyIsDescriptionRemoved() != null && e.getIsPropertyIsDescriptionRemoved())
            {
                this.setIsDescription(null);
            }
        }
        else
        {
            this.setIsDescription(e.getIsDescription());
        }
        if (e.getProcessed() == null)
        {
            if (e.getIsPropertyProcessedRemoved() != null && e.getIsPropertyProcessedRemoved())
            {
                this.setProcessed(null);
            }
        }
        else
        {
            this.setProcessed(e.getProcessed());
        }
        if (e.getQuantityEntered() == null)
        {
            if (e.getIsPropertyQuantityEnteredRemoved() != null && e.getIsPropertyQuantityEnteredRemoved())
            {
                this.setQuantityEntered(null);
            }
        }
        else
        {
            this.setQuantityEntered(e.getQuantityEntered());
        }
        if (e.getRmaLineNumber() == null)
        {
            if (e.getIsPropertyRmaLineNumberRemoved() != null && e.getIsPropertyRmaLineNumberRemoved())
            {
                this.setRmaLineNumber(null);
            }
        }
        else
        {
            this.setRmaLineNumber(e.getRmaLineNumber());
        }
        if (e.getReversalLineNumber() == null)
        {
            if (e.getIsPropertyReversalLineNumberRemoved() != null && e.getIsPropertyReversalLineNumberRemoved())
            {
                this.setReversalLineNumber(null);
            }
        }
        else
        {
            this.setReversalLineNumber(e.getReversalLineNumber());
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

    }

    public void when(InOutLineStateRemoved e)
    {
        throwOnWrongEvent(e);

        this.setDeleted(true);
        this.setUpdatedBy(e.getCreatedBy());
        this.setUpdatedAt(e.getCreatedAt());

    }

    public void save()
    {
    }

    protected void throwOnWrongEvent(InOutLineStateEvent stateEvent)
    {
        String stateEntityIdInOutDocumentNumber = this.getInOutLineId().getInOutDocumentNumber();
        String eventEntityIdInOutDocumentNumber = stateEvent.getStateEventId().getInOutDocumentNumber();
        if (stateEntityIdInOutDocumentNumber != eventEntityIdInOutDocumentNumber)
        {
            throw DomainError.named("mutateWrongEntity", "Entity Id InOutDocumentNumber %1$s in state but entity id InOutDocumentNumber %2$s in event", stateEntityIdInOutDocumentNumber, eventEntityIdInOutDocumentNumber);
        }

        SkuId stateEntityIdSkuId = this.getInOutLineId().getSkuId();
        SkuId eventEntityIdSkuId = stateEvent.getStateEventId().getSkuId();
        if (stateEntityIdSkuId != eventEntityIdSkuId)
        {
            throw DomainError.named("mutateWrongEntity", "Entity Id SkuId %1$s in state but entity id SkuId %2$s in event", stateEntityIdSkuId, eventEntityIdSkuId);
        }

        Long stateVersion = this.getVersion();
        Long eventVersion = stateEvent.getVersion();
        if (eventVersion == null) {
            eventVersion = stateVersion == null ? InOutLineState.VERSION_NULL : stateVersion;
            stateEvent.setVersion(eventVersion);
        }
        if (!(stateVersion == null && eventVersion.equals(InOutLineState.VERSION_NULL)) && !eventVersion.equals(stateVersion))
        {
            throw DomainError.named("concurrencyConflict", "Conflict between state version (%1$s) and event version (%2$s)", stateVersion, eventVersion);
        }

    }

    public static class SimpleInOutLineState extends AbstractInOutLineState
    {
    }


}

