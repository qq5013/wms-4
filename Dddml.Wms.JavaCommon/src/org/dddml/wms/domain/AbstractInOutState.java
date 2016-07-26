package org.dddml.wms.domain;

import java.util.Set;
import org.joda.money.Money;
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

    private String POReference;

    public String getPOReference()
    {
        return this.POReference;
    }

    public void setPOReference(String poReference)
    {
        this.POReference = poReference;
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
            if (e.getIsPropertyIsSOTransactionRemoved() != null && e.getIsPropertyIsSOTransactionRemoved())
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
            if (e.getIsPropertyDocumentStatusRemoved() != null && e.getIsPropertyDocumentStatusRemoved())
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
            if (e.getIsPropertyPostedRemoved() != null && e.getIsPropertyPostedRemoved())
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
            if (e.getIsPropertyProcessingRemoved() != null && e.getIsPropertyProcessingRemoved())
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
            if (e.getIsPropertyProcessedRemoved() != null && e.getIsPropertyProcessedRemoved())
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
            if (e.getIsPropertyDocumentTypeRemoved() != null && e.getIsPropertyDocumentTypeRemoved())
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
            if (e.getIsPropertyDescriptionRemoved() != null && e.getIsPropertyDescriptionRemoved())
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
            if (e.getIsPropertyOrderNumberRemoved() != null && e.getIsPropertyOrderNumberRemoved())
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
            if (e.getIsPropertyDateOrderedRemoved() != null && e.getIsPropertyDateOrderedRemoved())
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
            if (e.getIsPropertyIsPrintedRemoved() != null && e.getIsPropertyIsPrintedRemoved())
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
            if (e.getIsPropertyMovementTypeRemoved() != null && e.getIsPropertyMovementTypeRemoved())
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
            if (e.getIsPropertyMovementDateRemoved() != null && e.getIsPropertyMovementDateRemoved())
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
            if (e.getIsPropertyBusinessPartnerIdRemoved() != null && e.getIsPropertyBusinessPartnerIdRemoved())
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
            if (e.getIsPropertyWarehouseIdRemoved() != null && e.getIsPropertyWarehouseIdRemoved())
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
            if (e.getIsPropertyPOReferenceRemoved() != null && e.getIsPropertyPOReferenceRemoved())
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
            if (e.getIsPropertyFreightAmountRemoved() != null && e.getIsPropertyFreightAmountRemoved())
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
            if (e.getIsPropertyShipperIdRemoved() != null && e.getIsPropertyShipperIdRemoved())
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
            if (e.getIsPropertyChargeAmountRemoved() != null && e.getIsPropertyChargeAmountRemoved())
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
            if (e.getIsPropertyDatePrintedRemoved() != null && e.getIsPropertyDatePrintedRemoved())
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
            if (e.getIsPropertySalesRepresentativeRemoved() != null && e.getIsPropertySalesRepresentativeRemoved())
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
            if (e.getIsPropertyNumberOfPackagesRemoved() != null && e.getIsPropertyNumberOfPackagesRemoved())
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
            if (e.getIsPropertyPickDateRemoved() != null && e.getIsPropertyPickDateRemoved())
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
            if (e.getIsPropertyShipDateRemoved() != null && e.getIsPropertyShipDateRemoved())
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
            if (e.getIsPropertyTrackingNumberRemoved() != null && e.getIsPropertyTrackingNumberRemoved())
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
            if (e.getIsPropertyDateReceivedRemoved() != null && e.getIsPropertyDateReceivedRemoved())
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
            if (e.getIsPropertyIsInTransitRemoved() != null && e.getIsPropertyIsInTransitRemoved())
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
            if (e.getIsPropertyIsApprovedRemoved() != null && e.getIsPropertyIsApprovedRemoved())
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
            if (e.getIsPropertyIsInDisputeRemoved() != null && e.getIsPropertyIsInDisputeRemoved())
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
            if (e.getIsPropertyVolumeRemoved() != null && e.getIsPropertyVolumeRemoved())
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
            if (e.getIsPropertyWeightRemoved() != null && e.getIsPropertyWeightRemoved())
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
            if (e.getIsPropertyRmaNumberRemoved() != null && e.getIsPropertyRmaNumberRemoved())
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
            if (e.getIsPropertyReversalNumberRemoved() != null && e.getIsPropertyReversalNumberRemoved())
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
            if (e.getIsPropertyIsDropShipRemoved() != null && e.getIsPropertyIsDropShipRemoved())
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
            if (e.getIsPropertyDropShipBusinessPartnerIdRemoved() != null && e.getIsPropertyDropShipBusinessPartnerIdRemoved())
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
        if(stateVersion == null) {
            stateVersion = InOutState.VERSION_ZERO;
        }
        Long eventVersion = stateEvent.getStateEventId().getVersion();// Aggregate Version
        if(eventVersion == null) {
            eventVersion = InOutState.VERSION_ZERO;
            stateEvent.getStateEventId().setVersion(eventVersion);
        }
        if (!stateVersion.equals(eventVersion))
        {
            throw DomainError.named("concurrencyConflict", "Conflict between state version %1$s and event version %2$s", stateVersion, eventVersion);
        }

    }

    public static class SimpleInOutState extends AbstractInOutState
    {
    }

    static class SimpleInOutLineStates extends AbstractInOutLineStates
    {
        public SimpleInOutLineStates(InOutState outerState)
        {
            super(outerState);
        }
    }


}

