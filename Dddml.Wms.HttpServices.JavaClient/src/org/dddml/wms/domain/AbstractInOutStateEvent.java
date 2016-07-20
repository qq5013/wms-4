package org.dddml.wms.domain;

import java.util.*;
import nodamoney.Money;
import java.math.BigDecimal;
import java.util.Date;
import org.dddml.wms.specialization.*;

public abstract class AbstractInOutStateEvent implements InOutStateEvent
{
    private InOutStateEventId stateEventId;

    public InOutStateEventId getStateEventId() {
        return this.stateEventId;
    }

    public void setStateEventId(InOutStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }
    
    private boolean stateEventReadOnly;

    public boolean getStateEventReadOnly() { return this.stateEventReadOnly; }

    public void setStateEventReadOnly(boolean readOnly) { this.stateEventReadOnly = readOnly; }

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

    private Boolean active;

    public Boolean getActive()
    {
        return this.active;
    }

    public void setActive(Boolean active)
    {
        this.active = active;
    }

    protected AbstractInOutStateEvent() {
    }

    protected AbstractInOutStateEvent(InOutStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }

    protected InOutLineStateEventDao getInOutLineStateEventDao() {
        return (InOutLineStateEventDao)ApplicationContext.current.get("InOutLineStateEventDao");
    }

    protected InOutLineStateEventId newInOutLineStateEventId(SkuId skuId)
    {
        InOutLineStateEventId stateEventId = new InOutLineStateEventId(this.getStateEventId().getDocumentNumber(), 
            skuId, 
            this.getStateEventId().getVersion());
        return stateEventId;
    }

    protected void throwOnInconsistentEventIds(InOutLineStateEvent e)
    {
        throwOnInconsistentEventIds(this, e);
    }

    public static void throwOnInconsistentEventIds(InOutStateEvent oe, InOutLineStateEvent e)
    {
        if (!oe.getStateEventId().getDocumentNumber().equals(e.getStateEventId().getInOutDocumentNumber()))
        { 
            throw DomainError.named("inconsistentEventIds", "Outer Id DocumentNumber %1$s but inner id InOutDocumentNumber %2$s", 
                oe.getStateEventId().getDocumentNumber(), e.getStateEventId().getInOutDocumentNumber());
        }
    }


    public abstract String getStateEventType();


    public static abstract class AbstractInOutStateCreated extends AbstractInOutStateEvent implements InOutStateCreated, Saveable
    {
        public AbstractInOutStateCreated() {
        }

        public AbstractInOutStateCreated(InOutStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.CREATED;
        }

        private Map<InOutLineStateEventId, InOutLineStateEvent.InOutLineStateCreated> inOutLineEvents = new HashMap<InOutLineStateEventId, InOutLineStateEvent.InOutLineStateCreated>();
        
        private Iterable<InOutLineStateEvent.InOutLineStateCreated> readOnlyInOutLineEvents;

        public Iterable<InOutLineStateEvent.InOutLineStateCreated> getInOutLineEvents()
        {
            if (!getStateEventReadOnly())
            {
                return this.inOutLineEvents.values();
            }
            else
            {
                if (readOnlyInOutLineEvents != null) { return readOnlyInOutLineEvents; }
                InOutLineStateEventDao eventDao = getInOutLineStateEventDao();
                List<InOutLineStateEvent.InOutLineStateCreated> eL = new ArrayList<InOutLineStateEvent.InOutLineStateCreated>();
                for (InOutLineStateEvent e : eventDao.findByInOutStateEventId(this.getStateEventId()))
                {
                    e.setStateEventReadOnly(true);
                    eL.add((InOutLineStateEvent.InOutLineStateCreated)e);
                }
                return (readOnlyInOutLineEvents = eL);
            }
        }

        public void setInOutLineEvents(Iterable<InOutLineStateEvent.InOutLineStateCreated> es)
        {
            if (es != null)
            {
                for (InOutLineStateEvent.InOutLineStateCreated e : es)
                {
                    addInOutLineEvent(e);
                }
            }
            else { this.inOutLineEvents.clear(); }
        }
        
        public void addInOutLineEvent(InOutLineStateEvent.InOutLineStateCreated e)
        {
            throwOnInconsistentEventIds(e);
            this.inOutLineEvents.put(e.getStateEventId(), e);
        }

        public abstract InOutLineStateEvent.InOutLineStateCreated newInOutLineStateCreated(SkuId skuId);
//        {
//            return new InOutLineStateEvent.InOutLineStateCreated(newInOutLineStateEventId(skuId));
//        }

        public void save()
        {
            for (InOutLineStateEvent.InOutLineStateCreated e : this.getInOutLineEvents()) {
                getInOutLineStateEventDao().save(e);
            }
        }
    }


/*
    public static abstract class AbstractInOutStateMergePatched extends AbstractInOutStateEvent implements InOutStateMergePatched, Saveable
    {
        Boolean isPropertyIsSOTransactionRemoved();

        void setPropertyIsSOTransactionRemoved(Boolean removed);

        Boolean isPropertyDocumentStatusRemoved();

        void setPropertyDocumentStatusRemoved(Boolean removed);

        Boolean isPropertyPostedRemoved();

        void setPropertyPostedRemoved(Boolean removed);

        Boolean isPropertyProcessingRemoved();

        void setPropertyProcessingRemoved(Boolean removed);

        Boolean isPropertyProcessedRemoved();

        void setPropertyProcessedRemoved(Boolean removed);

        Boolean isPropertyDocumentTypeRemoved();

        void setPropertyDocumentTypeRemoved(Boolean removed);

        Boolean isPropertyDescriptionRemoved();

        void setPropertyDescriptionRemoved(Boolean removed);

        Boolean isPropertyOrderNumberRemoved();

        void setPropertyOrderNumberRemoved(Boolean removed);

        Boolean isPropertyDateOrderedRemoved();

        void setPropertyDateOrderedRemoved(Boolean removed);

        Boolean isPropertyIsPrintedRemoved();

        void setPropertyIsPrintedRemoved(Boolean removed);

        Boolean isPropertyMovementTypeRemoved();

        void setPropertyMovementTypeRemoved(Boolean removed);

        Boolean isPropertyMovementDateRemoved();

        void setPropertyMovementDateRemoved(Boolean removed);

        Boolean isPropertyBusinessPartnerIdRemoved();

        void setPropertyBusinessPartnerIdRemoved(Boolean removed);

        Boolean isPropertyWarehouseIdRemoved();

        void setPropertyWarehouseIdRemoved(Boolean removed);

        Boolean isPropertyPOReferenceRemoved();

        void setPropertyPOReferenceRemoved(Boolean removed);

        Boolean isPropertyFreightAmountRemoved();

        void setPropertyFreightAmountRemoved(Boolean removed);

        Boolean isPropertyShipperIdRemoved();

        void setPropertyShipperIdRemoved(Boolean removed);

        Boolean isPropertyChargeAmountRemoved();

        void setPropertyChargeAmountRemoved(Boolean removed);

        Boolean isPropertyDatePrintedRemoved();

        void setPropertyDatePrintedRemoved(Boolean removed);

        Boolean isPropertySalesRepresentativeRemoved();

        void setPropertySalesRepresentativeRemoved(Boolean removed);

        Boolean isPropertyNumberOfPackagesRemoved();

        void setPropertyNumberOfPackagesRemoved(Boolean removed);

        Boolean isPropertyPickDateRemoved();

        void setPropertyPickDateRemoved(Boolean removed);

        Boolean isPropertyShipDateRemoved();

        void setPropertyShipDateRemoved(Boolean removed);

        Boolean isPropertyTrackingNumberRemoved();

        void setPropertyTrackingNumberRemoved(Boolean removed);

        Boolean isPropertyDateReceivedRemoved();

        void setPropertyDateReceivedRemoved(Boolean removed);

        Boolean isPropertyIsInTransitRemoved();

        void setPropertyIsInTransitRemoved(Boolean removed);

        Boolean isPropertyIsApprovedRemoved();

        void setPropertyIsApprovedRemoved(Boolean removed);

        Boolean isPropertyIsInDisputeRemoved();

        void setPropertyIsInDisputeRemoved(Boolean removed);

        Boolean isPropertyVolumeRemoved();

        void setPropertyVolumeRemoved(Boolean removed);

        Boolean isPropertyWeightRemoved();

        void setPropertyWeightRemoved(Boolean removed);

        Boolean isPropertyRmaNumberRemoved();

        void setPropertyRmaNumberRemoved(Boolean removed);

        Boolean isPropertyReversalNumberRemoved();

        void setPropertyReversalNumberRemoved(Boolean removed);

        Boolean isPropertyIsDropShipRemoved();

        void setPropertyIsDropShipRemoved(Boolean removed);

        Boolean isPropertyDropShipBusinessPartnerIdRemoved();

        void setPropertyDropShipBusinessPartnerIdRemoved(Boolean removed);

        Boolean isPropertyActiveRemoved();

        void setPropertyActiveRemoved(Boolean removed);

        Iterable<InOutLineStateEvent> getInOutLineEvents();
        
        void addInOutLineEvent(InOutLineStateEvent e);

        InOutLineStateEvent.InOutLineStateCreated newInOutLineStateCreated(SkuId skuId);

        InOutLineStateEvent.InOutLineStateMergePatched newInOutLineStateMergePatched(SkuId skuId);

        InOutLineStateEvent.InOutLineStateRemoved newInOutLineStateRemoved(SkuId skuId);


    }
*/

    public static abstract class AbstractInOutStateDeleted extends AbstractInOutStateEvent implements InOutStateDeleted, Saveable
    {
        public AbstractInOutStateDeleted() {
        }

        public AbstractInOutStateDeleted(InOutStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.DELETED;
        }

		
        private Map<InOutLineStateEventId, InOutLineStateEvent.InOutLineStateRemoved> inOutLineEvents = new HashMap<InOutLineStateEventId, InOutLineStateEvent.InOutLineStateRemoved>();
        
        private Iterable<InOutLineStateEvent.InOutLineStateRemoved> readOnlyInOutLineEvents;

        public Iterable<InOutLineStateEvent.InOutLineStateRemoved> getInOutLineEvents()
        {
            if (!getStateEventReadOnly())
            {
                return this.inOutLineEvents.values();
            }
            else
            {
                if (readOnlyInOutLineEvents != null) { return readOnlyInOutLineEvents; }
                InOutLineStateEventDao eventDao = getInOutLineStateEventDao();
                List<InOutLineStateEvent.InOutLineStateRemoved> eL = new ArrayList<InOutLineStateEvent.InOutLineStateRemoved>();
                for (InOutLineStateEvent e : eventDao.findByInOutStateEventId(this.getStateEventId()))
                {
                    e.setStateEventReadOnly(true);
                    eL.add((InOutLineStateEvent.InOutLineStateRemoved)e);
                }
                return (readOnlyInOutLineEvents = eL);
            }
        }

        public void setInOutLineEvents(Iterable<InOutLineStateEvent.InOutLineStateRemoved> es)
        {
            if (es != null)
            {
                for (InOutLineStateEvent.InOutLineStateRemoved e : es)
                {
                    addInOutLineEvent(e);
                }
            }
            else { this.inOutLineEvents.clear(); }
        }
        
        public void addInOutLineEvent(InOutLineStateEvent.InOutLineStateRemoved e)
        {
            throwOnInconsistentEventIds(e);
            this.inOutLineEvents.put(e.getStateEventId(), e);
        }

        public abstract InOutLineStateEvent.InOutLineStateRemoved newInOutLineStateRemoved(SkuId skuId);
//        {
//            return new InOutLineStateEvent.InOutLineStateRemoved(newInOutLineStateEventId(skuId));
//        }

        public void save()
        {
            for (InOutLineStateEvent.InOutLineStateRemoved e : this.getInOutLineEvents()) {
                getInOutLineStateEventDao().save(e);
            }
        }
    }

}

