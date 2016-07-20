package org.dddml.wms.domain;

import java.util.*;
import java.math.BigDecimal;
import java.util.Date;
import nodamoney.Money;
import org.dddml.wms.specialization.*;

public abstract class AbstractInOutLineMvoStateEvent implements InOutLineMvoStateEvent
{
    private InOutLineMvoStateEventId stateEventId;

    public InOutLineMvoStateEventId getStateEventId() {
        return this.stateEventId;
    }

    public void setStateEventId(InOutLineMvoStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }
    
    private boolean stateEventReadOnly;

    public boolean getStateEventReadOnly() { return this.stateEventReadOnly; }

    public void setStateEventReadOnly(boolean readOnly) { this.stateEventReadOnly = readOnly; }

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

    private Boolean active;

    public Boolean getActive()
    {
        return this.active;
    }

    public void setActive(Boolean active)
    {
        this.active = active;
    }

    private Boolean inOutIsSOTransaction;

    public Boolean getInOutIsSOTransaction()
    {
        return this.inOutIsSOTransaction;
    }

    public void setInOutIsSOTransaction(Boolean inOutIsSOTransaction)
    {
        this.inOutIsSOTransaction = inOutIsSOTransaction;
    }

    private String inOutDocumentStatus;

    public String getInOutDocumentStatus()
    {
        return this.inOutDocumentStatus;
    }

    public void setInOutDocumentStatus(String inOutDocumentStatus)
    {
        this.inOutDocumentStatus = inOutDocumentStatus;
    }

    private Boolean inOutPosted;

    public Boolean getInOutPosted()
    {
        return this.inOutPosted;
    }

    public void setInOutPosted(Boolean inOutPosted)
    {
        this.inOutPosted = inOutPosted;
    }

    private Boolean inOutProcessing;

    public Boolean getInOutProcessing()
    {
        return this.inOutProcessing;
    }

    public void setInOutProcessing(Boolean inOutProcessing)
    {
        this.inOutProcessing = inOutProcessing;
    }

    private Boolean inOutProcessed;

    public Boolean getInOutProcessed()
    {
        return this.inOutProcessed;
    }

    public void setInOutProcessed(Boolean inOutProcessed)
    {
        this.inOutProcessed = inOutProcessed;
    }

    private Integer inOutDocumentType;

    public Integer getInOutDocumentType()
    {
        return this.inOutDocumentType;
    }

    public void setInOutDocumentType(Integer inOutDocumentType)
    {
        this.inOutDocumentType = inOutDocumentType;
    }

    private String inOutDescription;

    public String getInOutDescription()
    {
        return this.inOutDescription;
    }

    public void setInOutDescription(String inOutDescription)
    {
        this.inOutDescription = inOutDescription;
    }

    private String inOutOrderNumber;

    public String getInOutOrderNumber()
    {
        return this.inOutOrderNumber;
    }

    public void setInOutOrderNumber(String inOutOrderNumber)
    {
        this.inOutOrderNumber = inOutOrderNumber;
    }

    private Date inOutDateOrdered;

    public Date getInOutDateOrdered()
    {
        return this.inOutDateOrdered;
    }

    public void setInOutDateOrdered(Date inOutDateOrdered)
    {
        this.inOutDateOrdered = inOutDateOrdered;
    }

    private Boolean inOutIsPrinted;

    public Boolean getInOutIsPrinted()
    {
        return this.inOutIsPrinted;
    }

    public void setInOutIsPrinted(Boolean inOutIsPrinted)
    {
        this.inOutIsPrinted = inOutIsPrinted;
    }

    private String inOutMovementType;

    public String getInOutMovementType()
    {
        return this.inOutMovementType;
    }

    public void setInOutMovementType(String inOutMovementType)
    {
        this.inOutMovementType = inOutMovementType;
    }

    private Date inOutMovementDate;

    public Date getInOutMovementDate()
    {
        return this.inOutMovementDate;
    }

    public void setInOutMovementDate(Date inOutMovementDate)
    {
        this.inOutMovementDate = inOutMovementDate;
    }

    private String inOutBusinessPartnerId;

    public String getInOutBusinessPartnerId()
    {
        return this.inOutBusinessPartnerId;
    }

    public void setInOutBusinessPartnerId(String inOutBusinessPartnerId)
    {
        this.inOutBusinessPartnerId = inOutBusinessPartnerId;
    }

    private String inOutWarehouseId;

    public String getInOutWarehouseId()
    {
        return this.inOutWarehouseId;
    }

    public void setInOutWarehouseId(String inOutWarehouseId)
    {
        this.inOutWarehouseId = inOutWarehouseId;
    }

    private String inOutPOReference;

    public String getInOutPOReference()
    {
        return this.inOutPOReference;
    }

    public void setInOutPOReference(String inOutPOReference)
    {
        this.inOutPOReference = inOutPOReference;
    }

    private Money inOutFreightAmount;

    public Money getInOutFreightAmount()
    {
        return this.inOutFreightAmount;
    }

    public void setInOutFreightAmount(Money inOutFreightAmount)
    {
        this.inOutFreightAmount = inOutFreightAmount;
    }

    private String inOutShipperId;

    public String getInOutShipperId()
    {
        return this.inOutShipperId;
    }

    public void setInOutShipperId(String inOutShipperId)
    {
        this.inOutShipperId = inOutShipperId;
    }

    private Money inOutChargeAmount;

    public Money getInOutChargeAmount()
    {
        return this.inOutChargeAmount;
    }

    public void setInOutChargeAmount(Money inOutChargeAmount)
    {
        this.inOutChargeAmount = inOutChargeAmount;
    }

    private Date inOutDatePrinted;

    public Date getInOutDatePrinted()
    {
        return this.inOutDatePrinted;
    }

    public void setInOutDatePrinted(Date inOutDatePrinted)
    {
        this.inOutDatePrinted = inOutDatePrinted;
    }

    private String inOutSalesRepresentative;

    public String getInOutSalesRepresentative()
    {
        return this.inOutSalesRepresentative;
    }

    public void setInOutSalesRepresentative(String inOutSalesRepresentative)
    {
        this.inOutSalesRepresentative = inOutSalesRepresentative;
    }

    private Integer inOutNumberOfPackages;

    public Integer getInOutNumberOfPackages()
    {
        return this.inOutNumberOfPackages;
    }

    public void setInOutNumberOfPackages(Integer inOutNumberOfPackages)
    {
        this.inOutNumberOfPackages = inOutNumberOfPackages;
    }

    private Date inOutPickDate;

    public Date getInOutPickDate()
    {
        return this.inOutPickDate;
    }

    public void setInOutPickDate(Date inOutPickDate)
    {
        this.inOutPickDate = inOutPickDate;
    }

    private Date inOutShipDate;

    public Date getInOutShipDate()
    {
        return this.inOutShipDate;
    }

    public void setInOutShipDate(Date inOutShipDate)
    {
        this.inOutShipDate = inOutShipDate;
    }

    private String inOutTrackingNumber;

    public String getInOutTrackingNumber()
    {
        return this.inOutTrackingNumber;
    }

    public void setInOutTrackingNumber(String inOutTrackingNumber)
    {
        this.inOutTrackingNumber = inOutTrackingNumber;
    }

    private Date inOutDateReceived;

    public Date getInOutDateReceived()
    {
        return this.inOutDateReceived;
    }

    public void setInOutDateReceived(Date inOutDateReceived)
    {
        this.inOutDateReceived = inOutDateReceived;
    }

    private Boolean inOutIsInTransit;

    public Boolean getInOutIsInTransit()
    {
        return this.inOutIsInTransit;
    }

    public void setInOutIsInTransit(Boolean inOutIsInTransit)
    {
        this.inOutIsInTransit = inOutIsInTransit;
    }

    private Boolean inOutIsApproved;

    public Boolean getInOutIsApproved()
    {
        return this.inOutIsApproved;
    }

    public void setInOutIsApproved(Boolean inOutIsApproved)
    {
        this.inOutIsApproved = inOutIsApproved;
    }

    private Boolean inOutIsInDispute;

    public Boolean getInOutIsInDispute()
    {
        return this.inOutIsInDispute;
    }

    public void setInOutIsInDispute(Boolean inOutIsInDispute)
    {
        this.inOutIsInDispute = inOutIsInDispute;
    }

    private BigDecimal inOutVolume;

    public BigDecimal getInOutVolume()
    {
        return this.inOutVolume;
    }

    public void setInOutVolume(BigDecimal inOutVolume)
    {
        this.inOutVolume = inOutVolume;
    }

    private BigDecimal inOutWeight;

    public BigDecimal getInOutWeight()
    {
        return this.inOutWeight;
    }

    public void setInOutWeight(BigDecimal inOutWeight)
    {
        this.inOutWeight = inOutWeight;
    }

    private String inOutRmaNumber;

    public String getInOutRmaNumber()
    {
        return this.inOutRmaNumber;
    }

    public void setInOutRmaNumber(String inOutRmaNumber)
    {
        this.inOutRmaNumber = inOutRmaNumber;
    }

    private String inOutReversalNumber;

    public String getInOutReversalNumber()
    {
        return this.inOutReversalNumber;
    }

    public void setInOutReversalNumber(String inOutReversalNumber)
    {
        this.inOutReversalNumber = inOutReversalNumber;
    }

    private Boolean inOutIsDropShip;

    public Boolean getInOutIsDropShip()
    {
        return this.inOutIsDropShip;
    }

    public void setInOutIsDropShip(Boolean inOutIsDropShip)
    {
        this.inOutIsDropShip = inOutIsDropShip;
    }

    private String inOutDropShipBusinessPartnerId;

    public String getInOutDropShipBusinessPartnerId()
    {
        return this.inOutDropShipBusinessPartnerId;
    }

    public void setInOutDropShipBusinessPartnerId(String inOutDropShipBusinessPartnerId)
    {
        this.inOutDropShipBusinessPartnerId = inOutDropShipBusinessPartnerId;
    }

    private String inOutCreatedBy;

    public String getInOutCreatedBy()
    {
        return this.inOutCreatedBy;
    }

    public void setInOutCreatedBy(String inOutCreatedBy)
    {
        this.inOutCreatedBy = inOutCreatedBy;
    }

    private Date inOutCreatedAt;

    public Date getInOutCreatedAt()
    {
        return this.inOutCreatedAt;
    }

    public void setInOutCreatedAt(Date inOutCreatedAt)
    {
        this.inOutCreatedAt = inOutCreatedAt;
    }

    private String inOutUpdatedBy;

    public String getInOutUpdatedBy()
    {
        return this.inOutUpdatedBy;
    }

    public void setInOutUpdatedBy(String inOutUpdatedBy)
    {
        this.inOutUpdatedBy = inOutUpdatedBy;
    }

    private Date inOutUpdatedAt;

    public Date getInOutUpdatedAt()
    {
        return this.inOutUpdatedAt;
    }

    public void setInOutUpdatedAt(Date inOutUpdatedAt)
    {
        this.inOutUpdatedAt = inOutUpdatedAt;
    }

    private Boolean inOutActive;

    public Boolean getInOutActive()
    {
        return this.inOutActive;
    }

    public void setInOutActive(Boolean inOutActive)
    {
        this.inOutActive = inOutActive;
    }

    private Boolean inOutDeleted;

    public Boolean getInOutDeleted()
    {
        return this.inOutDeleted;
    }

    public void setInOutDeleted(Boolean inOutDeleted)
    {
        this.inOutDeleted = inOutDeleted;
    }

    protected AbstractInOutLineMvoStateEvent() {
    }

    protected AbstractInOutLineMvoStateEvent(InOutLineMvoStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }


    public abstract String getStateEventType();


    public static abstract class AbstractInOutLineMvoStateCreated extends AbstractInOutLineMvoStateEvent implements InOutLineMvoStateCreated
    {
        public AbstractInOutLineMvoStateCreated() {
        }

        public AbstractInOutLineMvoStateCreated(InOutLineMvoStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.CREATED;
        }

    }


/*
    public static abstract class AbstractInOutLineMvoStateMergePatched extends AbstractInOutLineMvoStateEvent implements InOutLineMvoStateMergePatched
    {
        Boolean isPropertyLineNumberRemoved();

        void setPropertyLineNumberRemoved(Boolean removed);

        Boolean isPropertyDescriptionRemoved();

        void setPropertyDescriptionRemoved(Boolean removed);

        Boolean isPropertyLocatorIdRemoved();

        void setPropertyLocatorIdRemoved(Boolean removed);

        Boolean isPropertyProductRemoved();

        void setPropertyProductRemoved(Boolean removed);

        Boolean isPropertyUomIdRemoved();

        void setPropertyUomIdRemoved(Boolean removed);

        Boolean isPropertyMovementQuantityRemoved();

        void setPropertyMovementQuantityRemoved(Boolean removed);

        Boolean isPropertyConfirmedQuantityRemoved();

        void setPropertyConfirmedQuantityRemoved(Boolean removed);

        Boolean isPropertyScrappedQuantityRemoved();

        void setPropertyScrappedQuantityRemoved(Boolean removed);

        Boolean isPropertyTargetQuantityRemoved();

        void setPropertyTargetQuantityRemoved(Boolean removed);

        Boolean isPropertyPickedQuantityRemoved();

        void setPropertyPickedQuantityRemoved(Boolean removed);

        Boolean isPropertyIsInvoicedRemoved();

        void setPropertyIsInvoicedRemoved(Boolean removed);

        Boolean isPropertyAttributeSetInstanceIdRemoved();

        void setPropertyAttributeSetInstanceIdRemoved(Boolean removed);

        Boolean isPropertyIsDescriptionRemoved();

        void setPropertyIsDescriptionRemoved(Boolean removed);

        Boolean isPropertyProcessedRemoved();

        void setPropertyProcessedRemoved(Boolean removed);

        Boolean isPropertyQuantityEnteredRemoved();

        void setPropertyQuantityEnteredRemoved(Boolean removed);

        Boolean isPropertyRmaLineNumberRemoved();

        void setPropertyRmaLineNumberRemoved(Boolean removed);

        Boolean isPropertyReversalLineNumberRemoved();

        void setPropertyReversalLineNumberRemoved(Boolean removed);

        Boolean isPropertyVersionRemoved();

        void setPropertyVersionRemoved(Boolean removed);

        Boolean isPropertyActiveRemoved();

        void setPropertyActiveRemoved(Boolean removed);

        Boolean isPropertyInOutIsSOTransactionRemoved();

        void setPropertyInOutIsSOTransactionRemoved(Boolean removed);

        Boolean isPropertyInOutDocumentStatusRemoved();

        void setPropertyInOutDocumentStatusRemoved(Boolean removed);

        Boolean isPropertyInOutPostedRemoved();

        void setPropertyInOutPostedRemoved(Boolean removed);

        Boolean isPropertyInOutProcessingRemoved();

        void setPropertyInOutProcessingRemoved(Boolean removed);

        Boolean isPropertyInOutProcessedRemoved();

        void setPropertyInOutProcessedRemoved(Boolean removed);

        Boolean isPropertyInOutDocumentTypeRemoved();

        void setPropertyInOutDocumentTypeRemoved(Boolean removed);

        Boolean isPropertyInOutDescriptionRemoved();

        void setPropertyInOutDescriptionRemoved(Boolean removed);

        Boolean isPropertyInOutOrderNumberRemoved();

        void setPropertyInOutOrderNumberRemoved(Boolean removed);

        Boolean isPropertyInOutDateOrderedRemoved();

        void setPropertyInOutDateOrderedRemoved(Boolean removed);

        Boolean isPropertyInOutIsPrintedRemoved();

        void setPropertyInOutIsPrintedRemoved(Boolean removed);

        Boolean isPropertyInOutMovementTypeRemoved();

        void setPropertyInOutMovementTypeRemoved(Boolean removed);

        Boolean isPropertyInOutMovementDateRemoved();

        void setPropertyInOutMovementDateRemoved(Boolean removed);

        Boolean isPropertyInOutBusinessPartnerIdRemoved();

        void setPropertyInOutBusinessPartnerIdRemoved(Boolean removed);

        Boolean isPropertyInOutWarehouseIdRemoved();

        void setPropertyInOutWarehouseIdRemoved(Boolean removed);

        Boolean isPropertyInOutPOReferenceRemoved();

        void setPropertyInOutPOReferenceRemoved(Boolean removed);

        Boolean isPropertyInOutFreightAmountRemoved();

        void setPropertyInOutFreightAmountRemoved(Boolean removed);

        Boolean isPropertyInOutShipperIdRemoved();

        void setPropertyInOutShipperIdRemoved(Boolean removed);

        Boolean isPropertyInOutChargeAmountRemoved();

        void setPropertyInOutChargeAmountRemoved(Boolean removed);

        Boolean isPropertyInOutDatePrintedRemoved();

        void setPropertyInOutDatePrintedRemoved(Boolean removed);

        Boolean isPropertyInOutSalesRepresentativeRemoved();

        void setPropertyInOutSalesRepresentativeRemoved(Boolean removed);

        Boolean isPropertyInOutNumberOfPackagesRemoved();

        void setPropertyInOutNumberOfPackagesRemoved(Boolean removed);

        Boolean isPropertyInOutPickDateRemoved();

        void setPropertyInOutPickDateRemoved(Boolean removed);

        Boolean isPropertyInOutShipDateRemoved();

        void setPropertyInOutShipDateRemoved(Boolean removed);

        Boolean isPropertyInOutTrackingNumberRemoved();

        void setPropertyInOutTrackingNumberRemoved(Boolean removed);

        Boolean isPropertyInOutDateReceivedRemoved();

        void setPropertyInOutDateReceivedRemoved(Boolean removed);

        Boolean isPropertyInOutIsInTransitRemoved();

        void setPropertyInOutIsInTransitRemoved(Boolean removed);

        Boolean isPropertyInOutIsApprovedRemoved();

        void setPropertyInOutIsApprovedRemoved(Boolean removed);

        Boolean isPropertyInOutIsInDisputeRemoved();

        void setPropertyInOutIsInDisputeRemoved(Boolean removed);

        Boolean isPropertyInOutVolumeRemoved();

        void setPropertyInOutVolumeRemoved(Boolean removed);

        Boolean isPropertyInOutWeightRemoved();

        void setPropertyInOutWeightRemoved(Boolean removed);

        Boolean isPropertyInOutRmaNumberRemoved();

        void setPropertyInOutRmaNumberRemoved(Boolean removed);

        Boolean isPropertyInOutReversalNumberRemoved();

        void setPropertyInOutReversalNumberRemoved(Boolean removed);

        Boolean isPropertyInOutIsDropShipRemoved();

        void setPropertyInOutIsDropShipRemoved(Boolean removed);

        Boolean isPropertyInOutDropShipBusinessPartnerIdRemoved();

        void setPropertyInOutDropShipBusinessPartnerIdRemoved(Boolean removed);

        Boolean isPropertyInOutCreatedByRemoved();

        void setPropertyInOutCreatedByRemoved(Boolean removed);

        Boolean isPropertyInOutCreatedAtRemoved();

        void setPropertyInOutCreatedAtRemoved(Boolean removed);

        Boolean isPropertyInOutUpdatedByRemoved();

        void setPropertyInOutUpdatedByRemoved(Boolean removed);

        Boolean isPropertyInOutUpdatedAtRemoved();

        void setPropertyInOutUpdatedAtRemoved(Boolean removed);

        Boolean isPropertyInOutActiveRemoved();

        void setPropertyInOutActiveRemoved(Boolean removed);

        Boolean isPropertyInOutDeletedRemoved();

        void setPropertyInOutDeletedRemoved(Boolean removed);


    }
*/

    public static abstract class AbstractInOutLineMvoStateDeleted extends AbstractInOutLineMvoStateEvent implements InOutLineMvoStateDeleted
    {
        public AbstractInOutLineMvoStateDeleted() {
        }

        public AbstractInOutLineMvoStateDeleted(InOutLineMvoStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.DELETED;
        }

    }

}

