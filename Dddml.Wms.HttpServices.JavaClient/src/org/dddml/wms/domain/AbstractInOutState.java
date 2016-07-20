package org.dddml.wms.domain;

import java.util.Set;
import nodamoney.Money;
import java.math.BigDecimal;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.specialization.DomainError;
import org.dddml.wms.domain.InOutStateEvent.*;

public abstract class AbstractInOutState implements InOutState
{

    private String documentNumber;

    public String getDocumentNumber()
    {
        return this.documentNumber;
    }

    public void setDocumentNumber(String documentNumber)
    {
        this.documentNumber = documentNumber;
    }

    private Boolean isSOTransaction;

    public Boolean getIsSOTransaction()
    {
        return this.isSOTransaction;
    }

    public void setIsSOTransaction(Boolean isSOTransaction)
    {
        this.isSOTransaction = isSOTransaction;
    }

    private String documentStatus;

    public String getDocumentStatus()
    {
        return this.documentStatus;
    }

    public void setDocumentStatus(String documentStatus)
    {
        this.documentStatus = documentStatus;
    }

    private Boolean posted;

    public Boolean getPosted()
    {
        return this.posted;
    }

    public void setPosted(Boolean posted)
    {
        this.posted = posted;
    }

    private Boolean processing;

    public Boolean getProcessing()
    {
        return this.processing;
    }

    public void setProcessing(Boolean processing)
    {
        this.processing = processing;
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

    private Integer documentType;

    public Integer getDocumentType()
    {
        return this.documentType;
    }

    public void setDocumentType(Integer documentType)
    {
        this.documentType = documentType;
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

    private String orderNumber;

    public String getOrderNumber()
    {
        return this.orderNumber;
    }

    public void setOrderNumber(String orderNumber)
    {
        this.orderNumber = orderNumber;
    }

    private Date dateOrdered;

    public Date getDateOrdered()
    {
        return this.dateOrdered;
    }

    public void setDateOrdered(Date dateOrdered)
    {
        this.dateOrdered = dateOrdered;
    }

    private Boolean isPrinted;

    public Boolean getIsPrinted()
    {
        return this.isPrinted;
    }

    public void setIsPrinted(Boolean isPrinted)
    {
        this.isPrinted = isPrinted;
    }

    private String movementType;

    public String getMovementType()
    {
        return this.movementType;
    }

    public void setMovementType(String movementType)
    {
        this.movementType = movementType;
    }

    private Date movementDate;

    public Date getMovementDate()
    {
        return this.movementDate;
    }

    public void setMovementDate(Date movementDate)
    {
        this.movementDate = movementDate;
    }

    private String businessPartnerId;

    public String getBusinessPartnerId()
    {
        return this.businessPartnerId;
    }

    public void setBusinessPartnerId(String businessPartnerId)
    {
        this.businessPartnerId = businessPartnerId;
    }

    private String warehouseId;

    public String getWarehouseId()
    {
        return this.warehouseId;
    }

    public void setWarehouseId(String warehouseId)
    {
        this.warehouseId = warehouseId;
    }

    private String pOReference;

    public String getPOReference()
    {
        return this.pOReference;
    }

    public void setPOReference(String pOReference)
    {
        this.pOReference = pOReference;
    }

    private Money freightAmount;

    public Money getFreightAmount()
    {
        return this.freightAmount;
    }

    public void setFreightAmount(Money freightAmount)
    {
        this.freightAmount = freightAmount;
    }

    private String shipperId;

    public String getShipperId()
    {
        return this.shipperId;
    }

    public void setShipperId(String shipperId)
    {
        this.shipperId = shipperId;
    }

    private Money chargeAmount;

    public Money getChargeAmount()
    {
        return this.chargeAmount;
    }

    public void setChargeAmount(Money chargeAmount)
    {
        this.chargeAmount = chargeAmount;
    }

    private Date datePrinted;

    public Date getDatePrinted()
    {
        return this.datePrinted;
    }

    public void setDatePrinted(Date datePrinted)
    {
        this.datePrinted = datePrinted;
    }

    private String salesRepresentative;

    public String getSalesRepresentative()
    {
        return this.salesRepresentative;
    }

    public void setSalesRepresentative(String salesRepresentative)
    {
        this.salesRepresentative = salesRepresentative;
    }

    private Integer numberOfPackages;

    public Integer getNumberOfPackages()
    {
        return this.numberOfPackages;
    }

    public void setNumberOfPackages(Integer numberOfPackages)
    {
        this.numberOfPackages = numberOfPackages;
    }

    private Date pickDate;

    public Date getPickDate()
    {
        return this.pickDate;
    }

    public void setPickDate(Date pickDate)
    {
        this.pickDate = pickDate;
    }

    private Date shipDate;

    public Date getShipDate()
    {
        return this.shipDate;
    }

    public void setShipDate(Date shipDate)
    {
        this.shipDate = shipDate;
    }

    private String trackingNumber;

    public String getTrackingNumber()
    {
        return this.trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber)
    {
        this.trackingNumber = trackingNumber;
    }

    private Date dateReceived;

    public Date getDateReceived()
    {
        return this.dateReceived;
    }

    public void setDateReceived(Date dateReceived)
    {
        this.dateReceived = dateReceived;
    }

    private Boolean isInTransit;

    public Boolean getIsInTransit()
    {
        return this.isInTransit;
    }

    public void setIsInTransit(Boolean isInTransit)
    {
        this.isInTransit = isInTransit;
    }

    private Boolean isApproved;

    public Boolean getIsApproved()
    {
        return this.isApproved;
    }

    public void setIsApproved(Boolean isApproved)
    {
        this.isApproved = isApproved;
    }

    private Boolean isInDispute;

    public Boolean getIsInDispute()
    {
        return this.isInDispute;
    }

    public void setIsInDispute(Boolean isInDispute)
    {
        this.isInDispute = isInDispute;
    }

    private BigDecimal volume;

    public BigDecimal getVolume()
    {
        return this.volume;
    }

    public void setVolume(BigDecimal volume)
    {
        this.volume = volume;
    }

    private BigDecimal weight;

    public BigDecimal getWeight()
    {
        return this.weight;
    }

    public void setWeight(BigDecimal weight)
    {
        this.weight = weight;
    }

    private String rmaNumber;

    public String getRmaNumber()
    {
        return this.rmaNumber;
    }

    public void setRmaNumber(String rmaNumber)
    {
        this.rmaNumber = rmaNumber;
    }

    private String reversalNumber;

    public String getReversalNumber()
    {
        return this.reversalNumber;
    }

    public void setReversalNumber(String reversalNumber)
    {
        this.reversalNumber = reversalNumber;
    }

    private Boolean isDropShip;

    public Boolean getIsDropShip()
    {
        return this.isDropShip;
    }

    public void setIsDropShip(Boolean isDropShip)
    {
        this.isDropShip = isDropShip;
    }

    private String dropShipBusinessPartnerId;

    public String getDropShipBusinessPartnerId()
    {
        return this.dropShipBusinessPartnerId;
    }

    public void setDropShipBusinessPartnerId(String dropShipBusinessPartnerId)
    {
        this.dropShipBusinessPartnerId = dropShipBusinessPartnerId;
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

    private InOutLineStates inOutLines;

    public InOutLineStates getInOutLines()
    {
        return this.inOutLines;
    }

    public void setInOutLines(InOutLineStates inOutLines)
    {
        this.inOutLines = inOutLines;
    }


    public AbstractInOutState()
    {
        inOutLines = new SimpleInOutLineStates(this);

        initializeProperties();
    }
    
    protected void initializeProperties() {
    }


    public void mutate(Event e) {
        if (e instanceof InOutStateCreated) {
            when((InOutStateCreated) e);
        } else if (e instanceof InOutStateMergePatched) {
            when((InOutStateMergePatched) e);
        } else if (e instanceof InOutStateDeleted) {
            when((InOutStateDeleted) e);
        }
    }

    public void when(InOutStateCreated e)
    {
        throwOnWrongEvent(e);
        this.setIsSOTransaction(e.getIsSOTransaction());
        this.setDocumentStatus(e.getDocumentStatus());
        this.setPosted(e.getPosted());
        this.setProcessing(e.getProcessing());
        this.setProcessed(e.getProcessed());
        this.setDocumentType(e.getDocumentType());
        this.setDescription(e.getDescription());
        this.setOrderNumber(e.getOrderNumber());
        this.setDateOrdered(e.getDateOrdered());
        this.setIsPrinted(e.getIsPrinted());
        this.setMovementType(e.getMovementType());
        this.setMovementDate(e.getMovementDate());
        this.setBusinessPartnerId(e.getBusinessPartnerId());
        this.setWarehouseId(e.getWarehouseId());
        this.setPOReference(e.getPOReference());
        this.setFreightAmount(e.getFreightAmount());
        this.setShipperId(e.getShipperId());
        this.setChargeAmount(e.getChargeAmount());
        this.setDatePrinted(e.getDatePrinted());
        this.setSalesRepresentative(e.getSalesRepresentative());
        this.setNumberOfPackages(e.getNumberOfPackages());
        this.setPickDate(e.getPickDate());
        this.setShipDate(e.getShipDate());
        this.setTrackingNumber(e.getTrackingNumber());
        this.setDateReceived(e.getDateReceived());
        this.setIsInTransit(e.getIsInTransit());
        this.setIsApproved(e.getIsApproved());
        this.setIsInDispute(e.getIsInDispute());
        this.setVolume(e.getVolume());
        this.setWeight(e.getWeight());
        this.setRmaNumber(e.getRmaNumber());
        this.setReversalNumber(e.getReversalNumber());
        this.setIsDropShip(e.getIsDropShip());
        this.setDropShipBusinessPartnerId(e.getDropShipBusinessPartnerId());
        this.setActive(e.getActive());

        this.setDeleted(false);

        this.setCreatedBy(e.getCreatedBy());
        this.setCreatedAt(e.getCreatedAt());

        for (InOutLineStateEvent.InOutLineStateCreated innerEvent : e.getInOutLineEvents()) {
            InOutLineState innerState = this.getInOutLines().get(innerEvent.getStateEventId().getSkuId());
            innerState.mutate(innerEvent);
        }
    }

    public void when(InOutStateMergePatched e)
    {
        throwOnWrongEvent(e);

        if (e.getIsSOTransaction() == null)
        {
            if (e.isPropertyIsSOTransactionRemoved() != null && e.isPropertyIsSOTransactionRemoved())
            {
                this.setIsSOTransaction(null);
            }
        }
        else
        {
            this.setIsSOTransaction(e.getIsSOTransaction());
        }
        if (e.getDocumentStatus() == null)
        {
            if (e.isPropertyDocumentStatusRemoved() != null && e.isPropertyDocumentStatusRemoved())
            {
                this.setDocumentStatus(null);
            }
        }
        else
        {
            this.setDocumentStatus(e.getDocumentStatus());
        }
        if (e.getPosted() == null)
        {
            if (e.isPropertyPostedRemoved() != null && e.isPropertyPostedRemoved())
            {
                this.setPosted(null);
            }
        }
        else
        {
            this.setPosted(e.getPosted());
        }
        if (e.getProcessing() == null)
        {
            if (e.isPropertyProcessingRemoved() != null && e.isPropertyProcessingRemoved())
            {
                this.setProcessing(null);
            }
        }
        else
        {
            this.setProcessing(e.getProcessing());
        }
        if (e.getProcessed() == null)
        {
            if (e.isPropertyProcessedRemoved() != null && e.isPropertyProcessedRemoved())
            {
                this.setProcessed(null);
            }
        }
        else
        {
            this.setProcessed(e.getProcessed());
        }
        if (e.getDocumentType() == null)
        {
            if (e.isPropertyDocumentTypeRemoved() != null && e.isPropertyDocumentTypeRemoved())
            {
                this.setDocumentType(null);
            }
        }
        else
        {
            this.setDocumentType(e.getDocumentType());
        }
        if (e.getDescription() == null)
        {
            if (e.isPropertyDescriptionRemoved() != null && e.isPropertyDescriptionRemoved())
            {
                this.setDescription(null);
            }
        }
        else
        {
            this.setDescription(e.getDescription());
        }
        if (e.getOrderNumber() == null)
        {
            if (e.isPropertyOrderNumberRemoved() != null && e.isPropertyOrderNumberRemoved())
            {
                this.setOrderNumber(null);
            }
        }
        else
        {
            this.setOrderNumber(e.getOrderNumber());
        }
        if (e.getDateOrdered() == null)
        {
            if (e.isPropertyDateOrderedRemoved() != null && e.isPropertyDateOrderedRemoved())
            {
                this.setDateOrdered(null);
            }
        }
        else
        {
            this.setDateOrdered(e.getDateOrdered());
        }
        if (e.getIsPrinted() == null)
        {
            if (e.isPropertyIsPrintedRemoved() != null && e.isPropertyIsPrintedRemoved())
            {
                this.setIsPrinted(null);
            }
        }
        else
        {
            this.setIsPrinted(e.getIsPrinted());
        }
        if (e.getMovementType() == null)
        {
            if (e.isPropertyMovementTypeRemoved() != null && e.isPropertyMovementTypeRemoved())
            {
                this.setMovementType(null);
            }
        }
        else
        {
            this.setMovementType(e.getMovementType());
        }
        if (e.getMovementDate() == null)
        {
            if (e.isPropertyMovementDateRemoved() != null && e.isPropertyMovementDateRemoved())
            {
                this.setMovementDate(null);
            }
        }
        else
        {
            this.setMovementDate(e.getMovementDate());
        }
        if (e.getBusinessPartnerId() == null)
        {
            if (e.isPropertyBusinessPartnerIdRemoved() != null && e.isPropertyBusinessPartnerIdRemoved())
            {
                this.setBusinessPartnerId(null);
            }
        }
        else
        {
            this.setBusinessPartnerId(e.getBusinessPartnerId());
        }
        if (e.getWarehouseId() == null)
        {
            if (e.isPropertyWarehouseIdRemoved() != null && e.isPropertyWarehouseIdRemoved())
            {
                this.setWarehouseId(null);
            }
        }
        else
        {
            this.setWarehouseId(e.getWarehouseId());
        }
        if (e.getPOReference() == null)
        {
            if (e.isPropertyPOReferenceRemoved() != null && e.isPropertyPOReferenceRemoved())
            {
                this.setPOReference(null);
            }
        }
        else
        {
            this.setPOReference(e.getPOReference());
        }
        if (e.getFreightAmount() == null)
        {
            if (e.isPropertyFreightAmountRemoved() != null && e.isPropertyFreightAmountRemoved())
            {
                this.setFreightAmount(null);
            }
        }
        else
        {
            this.setFreightAmount(e.getFreightAmount());
        }
        if (e.getShipperId() == null)
        {
            if (e.isPropertyShipperIdRemoved() != null && e.isPropertyShipperIdRemoved())
            {
                this.setShipperId(null);
            }
        }
        else
        {
            this.setShipperId(e.getShipperId());
        }
        if (e.getChargeAmount() == null)
        {
            if (e.isPropertyChargeAmountRemoved() != null && e.isPropertyChargeAmountRemoved())
            {
                this.setChargeAmount(null);
            }
        }
        else
        {
            this.setChargeAmount(e.getChargeAmount());
        }
        if (e.getDatePrinted() == null)
        {
            if (e.isPropertyDatePrintedRemoved() != null && e.isPropertyDatePrintedRemoved())
            {
                this.setDatePrinted(null);
            }
        }
        else
        {
            this.setDatePrinted(e.getDatePrinted());
        }
        if (e.getSalesRepresentative() == null)
        {
            if (e.isPropertySalesRepresentativeRemoved() != null && e.isPropertySalesRepresentativeRemoved())
            {
                this.setSalesRepresentative(null);
            }
        }
        else
        {
            this.setSalesRepresentative(e.getSalesRepresentative());
        }
        if (e.getNumberOfPackages() == null)
        {
            if (e.isPropertyNumberOfPackagesRemoved() != null && e.isPropertyNumberOfPackagesRemoved())
            {
                this.setNumberOfPackages(null);
            }
        }
        else
        {
            this.setNumberOfPackages(e.getNumberOfPackages());
        }
        if (e.getPickDate() == null)
        {
            if (e.isPropertyPickDateRemoved() != null && e.isPropertyPickDateRemoved())
            {
                this.setPickDate(null);
            }
        }
        else
        {
            this.setPickDate(e.getPickDate());
        }
        if (e.getShipDate() == null)
        {
            if (e.isPropertyShipDateRemoved() != null && e.isPropertyShipDateRemoved())
            {
                this.setShipDate(null);
            }
        }
        else
        {
            this.setShipDate(e.getShipDate());
        }
        if (e.getTrackingNumber() == null)
        {
            if (e.isPropertyTrackingNumberRemoved() != null && e.isPropertyTrackingNumberRemoved())
            {
                this.setTrackingNumber(null);
            }
        }
        else
        {
            this.setTrackingNumber(e.getTrackingNumber());
        }
        if (e.getDateReceived() == null)
        {
            if (e.isPropertyDateReceivedRemoved() != null && e.isPropertyDateReceivedRemoved())
            {
                this.setDateReceived(null);
            }
        }
        else
        {
            this.setDateReceived(e.getDateReceived());
        }
        if (e.getIsInTransit() == null)
        {
            if (e.isPropertyIsInTransitRemoved() != null && e.isPropertyIsInTransitRemoved())
            {
                this.setIsInTransit(null);
            }
        }
        else
        {
            this.setIsInTransit(e.getIsInTransit());
        }
        if (e.getIsApproved() == null)
        {
            if (e.isPropertyIsApprovedRemoved() != null && e.isPropertyIsApprovedRemoved())
            {
                this.setIsApproved(null);
            }
        }
        else
        {
            this.setIsApproved(e.getIsApproved());
        }
        if (e.getIsInDispute() == null)
        {
            if (e.isPropertyIsInDisputeRemoved() != null && e.isPropertyIsInDisputeRemoved())
            {
                this.setIsInDispute(null);
            }
        }
        else
        {
            this.setIsInDispute(e.getIsInDispute());
        }
        if (e.getVolume() == null)
        {
            if (e.isPropertyVolumeRemoved() != null && e.isPropertyVolumeRemoved())
            {
                this.setVolume(null);
            }
        }
        else
        {
            this.setVolume(e.getVolume());
        }
        if (e.getWeight() == null)
        {
            if (e.isPropertyWeightRemoved() != null && e.isPropertyWeightRemoved())
            {
                this.setWeight(null);
            }
        }
        else
        {
            this.setWeight(e.getWeight());
        }
        if (e.getRmaNumber() == null)
        {
            if (e.isPropertyRmaNumberRemoved() != null && e.isPropertyRmaNumberRemoved())
            {
                this.setRmaNumber(null);
            }
        }
        else
        {
            this.setRmaNumber(e.getRmaNumber());
        }
        if (e.getReversalNumber() == null)
        {
            if (e.isPropertyReversalNumberRemoved() != null && e.isPropertyReversalNumberRemoved())
            {
                this.setReversalNumber(null);
            }
        }
        else
        {
            this.setReversalNumber(e.getReversalNumber());
        }
        if (e.getIsDropShip() == null)
        {
            if (e.isPropertyIsDropShipRemoved() != null && e.isPropertyIsDropShipRemoved())
            {
                this.setIsDropShip(null);
            }
        }
        else
        {
            this.setIsDropShip(e.getIsDropShip());
        }
        if (e.getDropShipBusinessPartnerId() == null)
        {
            if (e.isPropertyDropShipBusinessPartnerIdRemoved() != null && e.isPropertyDropShipBusinessPartnerIdRemoved())
            {
                this.setDropShipBusinessPartnerId(null);
            }
        }
        else
        {
            this.setDropShipBusinessPartnerId(e.getDropShipBusinessPartnerId());
        }
        if (e.getActive() == null)
        {
            if (e.isPropertyActiveRemoved() != null && e.isPropertyActiveRemoved())
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

        for (InOutLineStateEvent innerEvent : e.getInOutLineEvents()) {
            InOutLineState innerState = this.getInOutLines().get(innerEvent.getStateEventId().getSkuId());
            innerState.mutate(innerEvent);
            if (innerEvent instanceof InOutLineStateEvent.InOutLineStateRemoved)
            {
                //InOutLineStateEvent.InOutLineStateRemoved removed = (InOutLineStateEvent.InOutLineStateRemoved)innerEvent;
                this.getInOutLines().remove(innerState);
            }
        }
    }

    public void when(InOutStateDeleted e)
    {
        throwOnWrongEvent(e);

        this.setDeleted(true);
        this.setUpdatedBy(e.getCreatedBy());
        this.setUpdatedAt(e.getCreatedAt());

        for (InOutLineState innerState : this.getInOutLines())
        {
            this.getInOutLines().remove(innerState);
        
            InOutLineStateEvent.InOutLineStateRemoved innerE = e.newInOutLineStateRemoved(innerState.getSkuId());
            innerE.setCreatedAt(e.getCreatedAt());
            innerE.setCreatedBy(e.getCreatedBy());
            innerState.when(innerE);
            //e.addInOutLineEvent(innerE);
        }
    }

    protected void throwOnWrongEvent(InOutStateEvent stateEvent)
    {
        String stateEntityId = this.getDocumentNumber(); // Aggregate Id
        String eventEntityId = stateEvent.getStateEventId().getDocumentNumber(); // EntityBase.Aggregate.GetStateEventIdPropertyIdName();
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

    public static class SimpleInOutLineStates extends AbstractInOutLineStates
    {
        public SimpleInOutLineStates(InOutState outerState)
        {
            super(outerState);
        }
    }


}

