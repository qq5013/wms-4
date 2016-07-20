package org.dddml.wms.domain;

import java.util.Set;
import java.math.BigDecimal;
import java.util.Date;
import nodamoney.Money;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.specialization.DomainError;
import org.dddml.wms.domain.InOutLineMvoStateEvent.*;

public abstract class AbstractInOutLineMvoState implements InOutLineMvoState
{

    private InOutLineId inOutLineId;

    public InOutLineId getInOutLineId()
    {
        return this.inOutLineId;
    }

    public void setInOutLineId(InOutLineId inOutLineId)
    {
        this.inOutLineId = inOutLineId;
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

    private Long inOutVersion;

    public Long getInOutVersion()
    {
        return this.inOutVersion;
    }

    public void setInOutVersion(Long inOutVersion)
    {
        this.inOutVersion = inOutVersion;
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

    public boolean isStateUnsaved() 
    {
        return VERSION_ZERO.equals(this.getInOutVersion());
    }


    public AbstractInOutLineMvoState()
    {
        initializeProperties();
    }
    
    protected void initializeProperties() {
    }


    public void mutate(Event e) {
        if (e instanceof InOutLineMvoStateCreated) {
            when((InOutLineMvoStateCreated) e);
        } else if (e instanceof InOutLineMvoStateMergePatched) {
            when((InOutLineMvoStateMergePatched) e);
        } else if (e instanceof InOutLineMvoStateDeleted) {
            when((InOutLineMvoStateDeleted) e);
        }
    }

    public void when(InOutLineMvoStateCreated e)
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
        this.setVersion(e.getVersion());
        this.setActive(e.getActive());
        this.setInOutIsSOTransaction(e.getInOutIsSOTransaction());
        this.setInOutDocumentStatus(e.getInOutDocumentStatus());
        this.setInOutPosted(e.getInOutPosted());
        this.setInOutProcessing(e.getInOutProcessing());
        this.setInOutProcessed(e.getInOutProcessed());
        this.setInOutDocumentType(e.getInOutDocumentType());
        this.setInOutDescription(e.getInOutDescription());
        this.setInOutOrderNumber(e.getInOutOrderNumber());
        this.setInOutDateOrdered(e.getInOutDateOrdered());
        this.setInOutIsPrinted(e.getInOutIsPrinted());
        this.setInOutMovementType(e.getInOutMovementType());
        this.setInOutMovementDate(e.getInOutMovementDate());
        this.setInOutBusinessPartnerId(e.getInOutBusinessPartnerId());
        this.setInOutWarehouseId(e.getInOutWarehouseId());
        this.setInOutPOReference(e.getInOutPOReference());
        this.setInOutFreightAmount(e.getInOutFreightAmount());
        this.setInOutShipperId(e.getInOutShipperId());
        this.setInOutChargeAmount(e.getInOutChargeAmount());
        this.setInOutDatePrinted(e.getInOutDatePrinted());
        this.setInOutSalesRepresentative(e.getInOutSalesRepresentative());
        this.setInOutNumberOfPackages(e.getInOutNumberOfPackages());
        this.setInOutPickDate(e.getInOutPickDate());
        this.setInOutShipDate(e.getInOutShipDate());
        this.setInOutTrackingNumber(e.getInOutTrackingNumber());
        this.setInOutDateReceived(e.getInOutDateReceived());
        this.setInOutIsInTransit(e.getInOutIsInTransit());
        this.setInOutIsApproved(e.getInOutIsApproved());
        this.setInOutIsInDispute(e.getInOutIsInDispute());
        this.setInOutVolume(e.getInOutVolume());
        this.setInOutWeight(e.getInOutWeight());
        this.setInOutRmaNumber(e.getInOutRmaNumber());
        this.setInOutReversalNumber(e.getInOutReversalNumber());
        this.setInOutIsDropShip(e.getInOutIsDropShip());
        this.setInOutDropShipBusinessPartnerId(e.getInOutDropShipBusinessPartnerId());
        this.setInOutCreatedBy(e.getInOutCreatedBy());
        this.setInOutCreatedAt(e.getInOutCreatedAt());
        this.setInOutUpdatedBy(e.getInOutUpdatedBy());
        this.setInOutUpdatedAt(e.getInOutUpdatedAt());
        this.setInOutActive(e.getInOutActive());
        this.setInOutDeleted(e.getInOutDeleted());

        this.setDeleted(false);

        this.setCreatedBy(e.getCreatedBy());
        this.setCreatedAt(e.getCreatedAt());

    }

    public void when(InOutLineMvoStateMergePatched e)
    {
        throwOnWrongEvent(e);

        if (e.getLineNumber() == null)
        {
            if (e.isPropertyLineNumberRemoved() != null && e.isPropertyLineNumberRemoved())
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
            if (e.isPropertyDescriptionRemoved() != null && e.isPropertyDescriptionRemoved())
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
            if (e.isPropertyLocatorIdRemoved() != null && e.isPropertyLocatorIdRemoved())
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
            if (e.isPropertyProductRemoved() != null && e.isPropertyProductRemoved())
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
            if (e.isPropertyUomIdRemoved() != null && e.isPropertyUomIdRemoved())
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
            if (e.isPropertyMovementQuantityRemoved() != null && e.isPropertyMovementQuantityRemoved())
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
            if (e.isPropertyConfirmedQuantityRemoved() != null && e.isPropertyConfirmedQuantityRemoved())
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
            if (e.isPropertyScrappedQuantityRemoved() != null && e.isPropertyScrappedQuantityRemoved())
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
            if (e.isPropertyTargetQuantityRemoved() != null && e.isPropertyTargetQuantityRemoved())
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
            if (e.isPropertyPickedQuantityRemoved() != null && e.isPropertyPickedQuantityRemoved())
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
            if (e.isPropertyIsInvoicedRemoved() != null && e.isPropertyIsInvoicedRemoved())
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
            if (e.isPropertyAttributeSetInstanceIdRemoved() != null && e.isPropertyAttributeSetInstanceIdRemoved())
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
            if (e.isPropertyIsDescriptionRemoved() != null && e.isPropertyIsDescriptionRemoved())
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
            if (e.isPropertyProcessedRemoved() != null && e.isPropertyProcessedRemoved())
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
            if (e.isPropertyQuantityEnteredRemoved() != null && e.isPropertyQuantityEnteredRemoved())
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
            if (e.isPropertyRmaLineNumberRemoved() != null && e.isPropertyRmaLineNumberRemoved())
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
            if (e.isPropertyReversalLineNumberRemoved() != null && e.isPropertyReversalLineNumberRemoved())
            {
                this.setReversalLineNumber(null);
            }
        }
        else
        {
            this.setReversalLineNumber(e.getReversalLineNumber());
        }
        if (e.getVersion() == null)
        {
            if (e.isPropertyVersionRemoved() != null && e.isPropertyVersionRemoved())
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
            if (e.isPropertyActiveRemoved() != null && e.isPropertyActiveRemoved())
            {
                this.setActive(null);
            }
        }
        else
        {
            this.setActive(e.getActive());
        }
        if (e.getInOutIsSOTransaction() == null)
        {
            if (e.isPropertyInOutIsSOTransactionRemoved() != null && e.isPropertyInOutIsSOTransactionRemoved())
            {
                this.setInOutIsSOTransaction(null);
            }
        }
        else
        {
            this.setInOutIsSOTransaction(e.getInOutIsSOTransaction());
        }
        if (e.getInOutDocumentStatus() == null)
        {
            if (e.isPropertyInOutDocumentStatusRemoved() != null && e.isPropertyInOutDocumentStatusRemoved())
            {
                this.setInOutDocumentStatus(null);
            }
        }
        else
        {
            this.setInOutDocumentStatus(e.getInOutDocumentStatus());
        }
        if (e.getInOutPosted() == null)
        {
            if (e.isPropertyInOutPostedRemoved() != null && e.isPropertyInOutPostedRemoved())
            {
                this.setInOutPosted(null);
            }
        }
        else
        {
            this.setInOutPosted(e.getInOutPosted());
        }
        if (e.getInOutProcessing() == null)
        {
            if (e.isPropertyInOutProcessingRemoved() != null && e.isPropertyInOutProcessingRemoved())
            {
                this.setInOutProcessing(null);
            }
        }
        else
        {
            this.setInOutProcessing(e.getInOutProcessing());
        }
        if (e.getInOutProcessed() == null)
        {
            if (e.isPropertyInOutProcessedRemoved() != null && e.isPropertyInOutProcessedRemoved())
            {
                this.setInOutProcessed(null);
            }
        }
        else
        {
            this.setInOutProcessed(e.getInOutProcessed());
        }
        if (e.getInOutDocumentType() == null)
        {
            if (e.isPropertyInOutDocumentTypeRemoved() != null && e.isPropertyInOutDocumentTypeRemoved())
            {
                this.setInOutDocumentType(null);
            }
        }
        else
        {
            this.setInOutDocumentType(e.getInOutDocumentType());
        }
        if (e.getInOutDescription() == null)
        {
            if (e.isPropertyInOutDescriptionRemoved() != null && e.isPropertyInOutDescriptionRemoved())
            {
                this.setInOutDescription(null);
            }
        }
        else
        {
            this.setInOutDescription(e.getInOutDescription());
        }
        if (e.getInOutOrderNumber() == null)
        {
            if (e.isPropertyInOutOrderNumberRemoved() != null && e.isPropertyInOutOrderNumberRemoved())
            {
                this.setInOutOrderNumber(null);
            }
        }
        else
        {
            this.setInOutOrderNumber(e.getInOutOrderNumber());
        }
        if (e.getInOutDateOrdered() == null)
        {
            if (e.isPropertyInOutDateOrderedRemoved() != null && e.isPropertyInOutDateOrderedRemoved())
            {
                this.setInOutDateOrdered(null);
            }
        }
        else
        {
            this.setInOutDateOrdered(e.getInOutDateOrdered());
        }
        if (e.getInOutIsPrinted() == null)
        {
            if (e.isPropertyInOutIsPrintedRemoved() != null && e.isPropertyInOutIsPrintedRemoved())
            {
                this.setInOutIsPrinted(null);
            }
        }
        else
        {
            this.setInOutIsPrinted(e.getInOutIsPrinted());
        }
        if (e.getInOutMovementType() == null)
        {
            if (e.isPropertyInOutMovementTypeRemoved() != null && e.isPropertyInOutMovementTypeRemoved())
            {
                this.setInOutMovementType(null);
            }
        }
        else
        {
            this.setInOutMovementType(e.getInOutMovementType());
        }
        if (e.getInOutMovementDate() == null)
        {
            if (e.isPropertyInOutMovementDateRemoved() != null && e.isPropertyInOutMovementDateRemoved())
            {
                this.setInOutMovementDate(null);
            }
        }
        else
        {
            this.setInOutMovementDate(e.getInOutMovementDate());
        }
        if (e.getInOutBusinessPartnerId() == null)
        {
            if (e.isPropertyInOutBusinessPartnerIdRemoved() != null && e.isPropertyInOutBusinessPartnerIdRemoved())
            {
                this.setInOutBusinessPartnerId(null);
            }
        }
        else
        {
            this.setInOutBusinessPartnerId(e.getInOutBusinessPartnerId());
        }
        if (e.getInOutWarehouseId() == null)
        {
            if (e.isPropertyInOutWarehouseIdRemoved() != null && e.isPropertyInOutWarehouseIdRemoved())
            {
                this.setInOutWarehouseId(null);
            }
        }
        else
        {
            this.setInOutWarehouseId(e.getInOutWarehouseId());
        }
        if (e.getInOutPOReference() == null)
        {
            if (e.isPropertyInOutPOReferenceRemoved() != null && e.isPropertyInOutPOReferenceRemoved())
            {
                this.setInOutPOReference(null);
            }
        }
        else
        {
            this.setInOutPOReference(e.getInOutPOReference());
        }
        if (e.getInOutFreightAmount() == null)
        {
            if (e.isPropertyInOutFreightAmountRemoved() != null && e.isPropertyInOutFreightAmountRemoved())
            {
                this.setInOutFreightAmount(null);
            }
        }
        else
        {
            this.setInOutFreightAmount(e.getInOutFreightAmount());
        }
        if (e.getInOutShipperId() == null)
        {
            if (e.isPropertyInOutShipperIdRemoved() != null && e.isPropertyInOutShipperIdRemoved())
            {
                this.setInOutShipperId(null);
            }
        }
        else
        {
            this.setInOutShipperId(e.getInOutShipperId());
        }
        if (e.getInOutChargeAmount() == null)
        {
            if (e.isPropertyInOutChargeAmountRemoved() != null && e.isPropertyInOutChargeAmountRemoved())
            {
                this.setInOutChargeAmount(null);
            }
        }
        else
        {
            this.setInOutChargeAmount(e.getInOutChargeAmount());
        }
        if (e.getInOutDatePrinted() == null)
        {
            if (e.isPropertyInOutDatePrintedRemoved() != null && e.isPropertyInOutDatePrintedRemoved())
            {
                this.setInOutDatePrinted(null);
            }
        }
        else
        {
            this.setInOutDatePrinted(e.getInOutDatePrinted());
        }
        if (e.getInOutSalesRepresentative() == null)
        {
            if (e.isPropertyInOutSalesRepresentativeRemoved() != null && e.isPropertyInOutSalesRepresentativeRemoved())
            {
                this.setInOutSalesRepresentative(null);
            }
        }
        else
        {
            this.setInOutSalesRepresentative(e.getInOutSalesRepresentative());
        }
        if (e.getInOutNumberOfPackages() == null)
        {
            if (e.isPropertyInOutNumberOfPackagesRemoved() != null && e.isPropertyInOutNumberOfPackagesRemoved())
            {
                this.setInOutNumberOfPackages(null);
            }
        }
        else
        {
            this.setInOutNumberOfPackages(e.getInOutNumberOfPackages());
        }
        if (e.getInOutPickDate() == null)
        {
            if (e.isPropertyInOutPickDateRemoved() != null && e.isPropertyInOutPickDateRemoved())
            {
                this.setInOutPickDate(null);
            }
        }
        else
        {
            this.setInOutPickDate(e.getInOutPickDate());
        }
        if (e.getInOutShipDate() == null)
        {
            if (e.isPropertyInOutShipDateRemoved() != null && e.isPropertyInOutShipDateRemoved())
            {
                this.setInOutShipDate(null);
            }
        }
        else
        {
            this.setInOutShipDate(e.getInOutShipDate());
        }
        if (e.getInOutTrackingNumber() == null)
        {
            if (e.isPropertyInOutTrackingNumberRemoved() != null && e.isPropertyInOutTrackingNumberRemoved())
            {
                this.setInOutTrackingNumber(null);
            }
        }
        else
        {
            this.setInOutTrackingNumber(e.getInOutTrackingNumber());
        }
        if (e.getInOutDateReceived() == null)
        {
            if (e.isPropertyInOutDateReceivedRemoved() != null && e.isPropertyInOutDateReceivedRemoved())
            {
                this.setInOutDateReceived(null);
            }
        }
        else
        {
            this.setInOutDateReceived(e.getInOutDateReceived());
        }
        if (e.getInOutIsInTransit() == null)
        {
            if (e.isPropertyInOutIsInTransitRemoved() != null && e.isPropertyInOutIsInTransitRemoved())
            {
                this.setInOutIsInTransit(null);
            }
        }
        else
        {
            this.setInOutIsInTransit(e.getInOutIsInTransit());
        }
        if (e.getInOutIsApproved() == null)
        {
            if (e.isPropertyInOutIsApprovedRemoved() != null && e.isPropertyInOutIsApprovedRemoved())
            {
                this.setInOutIsApproved(null);
            }
        }
        else
        {
            this.setInOutIsApproved(e.getInOutIsApproved());
        }
        if (e.getInOutIsInDispute() == null)
        {
            if (e.isPropertyInOutIsInDisputeRemoved() != null && e.isPropertyInOutIsInDisputeRemoved())
            {
                this.setInOutIsInDispute(null);
            }
        }
        else
        {
            this.setInOutIsInDispute(e.getInOutIsInDispute());
        }
        if (e.getInOutVolume() == null)
        {
            if (e.isPropertyInOutVolumeRemoved() != null && e.isPropertyInOutVolumeRemoved())
            {
                this.setInOutVolume(null);
            }
        }
        else
        {
            this.setInOutVolume(e.getInOutVolume());
        }
        if (e.getInOutWeight() == null)
        {
            if (e.isPropertyInOutWeightRemoved() != null && e.isPropertyInOutWeightRemoved())
            {
                this.setInOutWeight(null);
            }
        }
        else
        {
            this.setInOutWeight(e.getInOutWeight());
        }
        if (e.getInOutRmaNumber() == null)
        {
            if (e.isPropertyInOutRmaNumberRemoved() != null && e.isPropertyInOutRmaNumberRemoved())
            {
                this.setInOutRmaNumber(null);
            }
        }
        else
        {
            this.setInOutRmaNumber(e.getInOutRmaNumber());
        }
        if (e.getInOutReversalNumber() == null)
        {
            if (e.isPropertyInOutReversalNumberRemoved() != null && e.isPropertyInOutReversalNumberRemoved())
            {
                this.setInOutReversalNumber(null);
            }
        }
        else
        {
            this.setInOutReversalNumber(e.getInOutReversalNumber());
        }
        if (e.getInOutIsDropShip() == null)
        {
            if (e.isPropertyInOutIsDropShipRemoved() != null && e.isPropertyInOutIsDropShipRemoved())
            {
                this.setInOutIsDropShip(null);
            }
        }
        else
        {
            this.setInOutIsDropShip(e.getInOutIsDropShip());
        }
        if (e.getInOutDropShipBusinessPartnerId() == null)
        {
            if (e.isPropertyInOutDropShipBusinessPartnerIdRemoved() != null && e.isPropertyInOutDropShipBusinessPartnerIdRemoved())
            {
                this.setInOutDropShipBusinessPartnerId(null);
            }
        }
        else
        {
            this.setInOutDropShipBusinessPartnerId(e.getInOutDropShipBusinessPartnerId());
        }
        if (e.getInOutCreatedBy() == null)
        {
            if (e.isPropertyInOutCreatedByRemoved() != null && e.isPropertyInOutCreatedByRemoved())
            {
                this.setInOutCreatedBy(null);
            }
        }
        else
        {
            this.setInOutCreatedBy(e.getInOutCreatedBy());
        }
        if (e.getInOutCreatedAt() == null)
        {
            if (e.isPropertyInOutCreatedAtRemoved() != null && e.isPropertyInOutCreatedAtRemoved())
            {
                this.setInOutCreatedAt(null);
            }
        }
        else
        {
            this.setInOutCreatedAt(e.getInOutCreatedAt());
        }
        if (e.getInOutUpdatedBy() == null)
        {
            if (e.isPropertyInOutUpdatedByRemoved() != null && e.isPropertyInOutUpdatedByRemoved())
            {
                this.setInOutUpdatedBy(null);
            }
        }
        else
        {
            this.setInOutUpdatedBy(e.getInOutUpdatedBy());
        }
        if (e.getInOutUpdatedAt() == null)
        {
            if (e.isPropertyInOutUpdatedAtRemoved() != null && e.isPropertyInOutUpdatedAtRemoved())
            {
                this.setInOutUpdatedAt(null);
            }
        }
        else
        {
            this.setInOutUpdatedAt(e.getInOutUpdatedAt());
        }
        if (e.getInOutActive() == null)
        {
            if (e.isPropertyInOutActiveRemoved() != null && e.isPropertyInOutActiveRemoved())
            {
                this.setInOutActive(null);
            }
        }
        else
        {
            this.setInOutActive(e.getInOutActive());
        }
        if (e.getInOutDeleted() == null)
        {
            if (e.isPropertyInOutDeletedRemoved() != null && e.isPropertyInOutDeletedRemoved())
            {
                this.setInOutDeleted(null);
            }
        }
        else
        {
            this.setInOutDeleted(e.getInOutDeleted());
        }

        this.setUpdatedBy(e.getCreatedBy());
        this.setUpdatedAt(e.getCreatedAt());

    }

    public void when(InOutLineMvoStateDeleted e)
    {
        throwOnWrongEvent(e);

        this.setDeleted(true);
        this.setUpdatedBy(e.getCreatedBy());
        this.setUpdatedAt(e.getCreatedAt());

    }

    protected void throwOnWrongEvent(InOutLineMvoStateEvent stateEvent)
    {
        InOutLineId stateEntityId = this.getInOutLineId(); // Aggregate Id
        InOutLineId eventEntityId = stateEvent.getStateEventId().getInOutLineId(); // EntityBase.Aggregate.GetStateEventIdPropertyIdName();
        if (!stateEntityId.equals(eventEntityId))
        {
            throw DomainError.named("mutateWrongEntity", "Entity Id %1$s in state but entity id %2$s in event", stateEntityId, eventEntityId);
        }

        Long stateVersion = this.getInOutVersion();
        Long eventVersion = stateEvent.getStateEventId().getInOutVersion();
        if (!stateVersion.equals(eventVersion))
        {
            throw DomainError.named("concurrencyConflict", "Conflict between state version %1$s and event version %2$s", stateVersion, eventVersion);
        }

    }


}

