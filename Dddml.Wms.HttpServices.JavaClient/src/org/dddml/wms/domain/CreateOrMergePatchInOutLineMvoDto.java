package org.dddml.wms.domain;

import java.math.BigDecimal;
import java.util.Date;
import nodamoney.Money;

public class CreateOrMergePatchInOutLineMvoDto extends AbstractInOutLineMvoCommandDto
{
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

    private DocumentActionDto documentAction;

    public DocumentActionDto getDocumentAction()
    {
        return this.documentAction;
    }

    public void setDocumentAction(DocumentActionDto documentAction)
    {
        this.documentAction = documentAction;
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

    private Boolean isPropertyLineNumberRemoved;

    public Boolean getIsPropertyLineNumberRemoved()
    {
        return this.isPropertyLineNumberRemoved;
    }

    public void setIsPropertyLineNumberRemoved(Boolean isPropertyLineNumberRemoved)
    {
        this.isPropertyLineNumberRemoved = isPropertyLineNumberRemoved;
    }

    private Boolean isPropertyDescriptionRemoved;

    public Boolean getIsPropertyDescriptionRemoved()
    {
        return this.isPropertyDescriptionRemoved;
    }

    public void setIsPropertyDescriptionRemoved(Boolean isPropertyDescriptionRemoved)
    {
        this.isPropertyDescriptionRemoved = isPropertyDescriptionRemoved;
    }

    private Boolean isPropertyLocatorIdRemoved;

    public Boolean getIsPropertyLocatorIdRemoved()
    {
        return this.isPropertyLocatorIdRemoved;
    }

    public void setIsPropertyLocatorIdRemoved(Boolean isPropertyLocatorIdRemoved)
    {
        this.isPropertyLocatorIdRemoved = isPropertyLocatorIdRemoved;
    }

    private Boolean isPropertyProductRemoved;

    public Boolean getIsPropertyProductRemoved()
    {
        return this.isPropertyProductRemoved;
    }

    public void setIsPropertyProductRemoved(Boolean isPropertyProductRemoved)
    {
        this.isPropertyProductRemoved = isPropertyProductRemoved;
    }

    private Boolean isPropertyUomIdRemoved;

    public Boolean getIsPropertyUomIdRemoved()
    {
        return this.isPropertyUomIdRemoved;
    }

    public void setIsPropertyUomIdRemoved(Boolean isPropertyUomIdRemoved)
    {
        this.isPropertyUomIdRemoved = isPropertyUomIdRemoved;
    }

    private Boolean isPropertyMovementQuantityRemoved;

    public Boolean getIsPropertyMovementQuantityRemoved()
    {
        return this.isPropertyMovementQuantityRemoved;
    }

    public void setIsPropertyMovementQuantityRemoved(Boolean isPropertyMovementQuantityRemoved)
    {
        this.isPropertyMovementQuantityRemoved = isPropertyMovementQuantityRemoved;
    }

    private Boolean isPropertyConfirmedQuantityRemoved;

    public Boolean getIsPropertyConfirmedQuantityRemoved()
    {
        return this.isPropertyConfirmedQuantityRemoved;
    }

    public void setIsPropertyConfirmedQuantityRemoved(Boolean isPropertyConfirmedQuantityRemoved)
    {
        this.isPropertyConfirmedQuantityRemoved = isPropertyConfirmedQuantityRemoved;
    }

    private Boolean isPropertyScrappedQuantityRemoved;

    public Boolean getIsPropertyScrappedQuantityRemoved()
    {
        return this.isPropertyScrappedQuantityRemoved;
    }

    public void setIsPropertyScrappedQuantityRemoved(Boolean isPropertyScrappedQuantityRemoved)
    {
        this.isPropertyScrappedQuantityRemoved = isPropertyScrappedQuantityRemoved;
    }

    private Boolean isPropertyTargetQuantityRemoved;

    public Boolean getIsPropertyTargetQuantityRemoved()
    {
        return this.isPropertyTargetQuantityRemoved;
    }

    public void setIsPropertyTargetQuantityRemoved(Boolean isPropertyTargetQuantityRemoved)
    {
        this.isPropertyTargetQuantityRemoved = isPropertyTargetQuantityRemoved;
    }

    private Boolean isPropertyPickedQuantityRemoved;

    public Boolean getIsPropertyPickedQuantityRemoved()
    {
        return this.isPropertyPickedQuantityRemoved;
    }

    public void setIsPropertyPickedQuantityRemoved(Boolean isPropertyPickedQuantityRemoved)
    {
        this.isPropertyPickedQuantityRemoved = isPropertyPickedQuantityRemoved;
    }

    private Boolean isPropertyIsInvoicedRemoved;

    public Boolean getIsPropertyIsInvoicedRemoved()
    {
        return this.isPropertyIsInvoicedRemoved;
    }

    public void setIsPropertyIsInvoicedRemoved(Boolean isPropertyIsInvoicedRemoved)
    {
        this.isPropertyIsInvoicedRemoved = isPropertyIsInvoicedRemoved;
    }

    private Boolean isPropertyAttributeSetInstanceIdRemoved;

    public Boolean getIsPropertyAttributeSetInstanceIdRemoved()
    {
        return this.isPropertyAttributeSetInstanceIdRemoved;
    }

    public void setIsPropertyAttributeSetInstanceIdRemoved(Boolean isPropertyAttributeSetInstanceIdRemoved)
    {
        this.isPropertyAttributeSetInstanceIdRemoved = isPropertyAttributeSetInstanceIdRemoved;
    }

    private Boolean isPropertyIsDescriptionRemoved;

    public Boolean getIsPropertyIsDescriptionRemoved()
    {
        return this.isPropertyIsDescriptionRemoved;
    }

    public void setIsPropertyIsDescriptionRemoved(Boolean isPropertyIsDescriptionRemoved)
    {
        this.isPropertyIsDescriptionRemoved = isPropertyIsDescriptionRemoved;
    }

    private Boolean isPropertyProcessedRemoved;

    public Boolean getIsPropertyProcessedRemoved()
    {
        return this.isPropertyProcessedRemoved;
    }

    public void setIsPropertyProcessedRemoved(Boolean isPropertyProcessedRemoved)
    {
        this.isPropertyProcessedRemoved = isPropertyProcessedRemoved;
    }

    private Boolean isPropertyQuantityEnteredRemoved;

    public Boolean getIsPropertyQuantityEnteredRemoved()
    {
        return this.isPropertyQuantityEnteredRemoved;
    }

    public void setIsPropertyQuantityEnteredRemoved(Boolean isPropertyQuantityEnteredRemoved)
    {
        this.isPropertyQuantityEnteredRemoved = isPropertyQuantityEnteredRemoved;
    }

    private Boolean isPropertyRmaLineNumberRemoved;

    public Boolean getIsPropertyRmaLineNumberRemoved()
    {
        return this.isPropertyRmaLineNumberRemoved;
    }

    public void setIsPropertyRmaLineNumberRemoved(Boolean isPropertyRmaLineNumberRemoved)
    {
        this.isPropertyRmaLineNumberRemoved = isPropertyRmaLineNumberRemoved;
    }

    private Boolean isPropertyReversalLineNumberRemoved;

    public Boolean getIsPropertyReversalLineNumberRemoved()
    {
        return this.isPropertyReversalLineNumberRemoved;
    }

    public void setIsPropertyReversalLineNumberRemoved(Boolean isPropertyReversalLineNumberRemoved)
    {
        this.isPropertyReversalLineNumberRemoved = isPropertyReversalLineNumberRemoved;
    }

    private Boolean isPropertyVersionRemoved;

    public Boolean getIsPropertyVersionRemoved()
    {
        return this.isPropertyVersionRemoved;
    }

    public void setIsPropertyVersionRemoved(Boolean isPropertyVersionRemoved)
    {
        this.isPropertyVersionRemoved = isPropertyVersionRemoved;
    }

    private Boolean isPropertyActiveRemoved;

    public Boolean getIsPropertyActiveRemoved()
    {
        return this.isPropertyActiveRemoved;
    }

    public void setIsPropertyActiveRemoved(Boolean isPropertyActiveRemoved)
    {
        this.isPropertyActiveRemoved = isPropertyActiveRemoved;
    }

    private Boolean isPropertyInOutIsSOTransactionRemoved;

    public Boolean getIsPropertyInOutIsSOTransactionRemoved()
    {
        return this.isPropertyInOutIsSOTransactionRemoved;
    }

    public void setIsPropertyInOutIsSOTransactionRemoved(Boolean isPropertyInOutIsSOTransactionRemoved)
    {
        this.isPropertyInOutIsSOTransactionRemoved = isPropertyInOutIsSOTransactionRemoved;
    }

    private Boolean isPropertyInOutPostedRemoved;

    public Boolean getIsPropertyInOutPostedRemoved()
    {
        return this.isPropertyInOutPostedRemoved;
    }

    public void setIsPropertyInOutPostedRemoved(Boolean isPropertyInOutPostedRemoved)
    {
        this.isPropertyInOutPostedRemoved = isPropertyInOutPostedRemoved;
    }

    private Boolean isPropertyInOutProcessingRemoved;

    public Boolean getIsPropertyInOutProcessingRemoved()
    {
        return this.isPropertyInOutProcessingRemoved;
    }

    public void setIsPropertyInOutProcessingRemoved(Boolean isPropertyInOutProcessingRemoved)
    {
        this.isPropertyInOutProcessingRemoved = isPropertyInOutProcessingRemoved;
    }

    private Boolean isPropertyInOutProcessedRemoved;

    public Boolean getIsPropertyInOutProcessedRemoved()
    {
        return this.isPropertyInOutProcessedRemoved;
    }

    public void setIsPropertyInOutProcessedRemoved(Boolean isPropertyInOutProcessedRemoved)
    {
        this.isPropertyInOutProcessedRemoved = isPropertyInOutProcessedRemoved;
    }

    private Boolean isPropertyInOutDocumentTypeRemoved;

    public Boolean getIsPropertyInOutDocumentTypeRemoved()
    {
        return this.isPropertyInOutDocumentTypeRemoved;
    }

    public void setIsPropertyInOutDocumentTypeRemoved(Boolean isPropertyInOutDocumentTypeRemoved)
    {
        this.isPropertyInOutDocumentTypeRemoved = isPropertyInOutDocumentTypeRemoved;
    }

    private Boolean isPropertyInOutDescriptionRemoved;

    public Boolean getIsPropertyInOutDescriptionRemoved()
    {
        return this.isPropertyInOutDescriptionRemoved;
    }

    public void setIsPropertyInOutDescriptionRemoved(Boolean isPropertyInOutDescriptionRemoved)
    {
        this.isPropertyInOutDescriptionRemoved = isPropertyInOutDescriptionRemoved;
    }

    private Boolean isPropertyInOutOrderNumberRemoved;

    public Boolean getIsPropertyInOutOrderNumberRemoved()
    {
        return this.isPropertyInOutOrderNumberRemoved;
    }

    public void setIsPropertyInOutOrderNumberRemoved(Boolean isPropertyInOutOrderNumberRemoved)
    {
        this.isPropertyInOutOrderNumberRemoved = isPropertyInOutOrderNumberRemoved;
    }

    private Boolean isPropertyInOutDateOrderedRemoved;

    public Boolean getIsPropertyInOutDateOrderedRemoved()
    {
        return this.isPropertyInOutDateOrderedRemoved;
    }

    public void setIsPropertyInOutDateOrderedRemoved(Boolean isPropertyInOutDateOrderedRemoved)
    {
        this.isPropertyInOutDateOrderedRemoved = isPropertyInOutDateOrderedRemoved;
    }

    private Boolean isPropertyInOutIsPrintedRemoved;

    public Boolean getIsPropertyInOutIsPrintedRemoved()
    {
        return this.isPropertyInOutIsPrintedRemoved;
    }

    public void setIsPropertyInOutIsPrintedRemoved(Boolean isPropertyInOutIsPrintedRemoved)
    {
        this.isPropertyInOutIsPrintedRemoved = isPropertyInOutIsPrintedRemoved;
    }

    private Boolean isPropertyInOutMovementTypeRemoved;

    public Boolean getIsPropertyInOutMovementTypeRemoved()
    {
        return this.isPropertyInOutMovementTypeRemoved;
    }

    public void setIsPropertyInOutMovementTypeRemoved(Boolean isPropertyInOutMovementTypeRemoved)
    {
        this.isPropertyInOutMovementTypeRemoved = isPropertyInOutMovementTypeRemoved;
    }

    private Boolean isPropertyInOutMovementDateRemoved;

    public Boolean getIsPropertyInOutMovementDateRemoved()
    {
        return this.isPropertyInOutMovementDateRemoved;
    }

    public void setIsPropertyInOutMovementDateRemoved(Boolean isPropertyInOutMovementDateRemoved)
    {
        this.isPropertyInOutMovementDateRemoved = isPropertyInOutMovementDateRemoved;
    }

    private Boolean isPropertyInOutBusinessPartnerIdRemoved;

    public Boolean getIsPropertyInOutBusinessPartnerIdRemoved()
    {
        return this.isPropertyInOutBusinessPartnerIdRemoved;
    }

    public void setIsPropertyInOutBusinessPartnerIdRemoved(Boolean isPropertyInOutBusinessPartnerIdRemoved)
    {
        this.isPropertyInOutBusinessPartnerIdRemoved = isPropertyInOutBusinessPartnerIdRemoved;
    }

    private Boolean isPropertyInOutWarehouseIdRemoved;

    public Boolean getIsPropertyInOutWarehouseIdRemoved()
    {
        return this.isPropertyInOutWarehouseIdRemoved;
    }

    public void setIsPropertyInOutWarehouseIdRemoved(Boolean isPropertyInOutWarehouseIdRemoved)
    {
        this.isPropertyInOutWarehouseIdRemoved = isPropertyInOutWarehouseIdRemoved;
    }

    private Boolean isPropertyInOutPOReferenceRemoved;

    public Boolean getIsPropertyInOutPOReferenceRemoved()
    {
        return this.isPropertyInOutPOReferenceRemoved;
    }

    public void setIsPropertyInOutPOReferenceRemoved(Boolean isPropertyInOutPOReferenceRemoved)
    {
        this.isPropertyInOutPOReferenceRemoved = isPropertyInOutPOReferenceRemoved;
    }

    private Boolean isPropertyInOutFreightAmountRemoved;

    public Boolean getIsPropertyInOutFreightAmountRemoved()
    {
        return this.isPropertyInOutFreightAmountRemoved;
    }

    public void setIsPropertyInOutFreightAmountRemoved(Boolean isPropertyInOutFreightAmountRemoved)
    {
        this.isPropertyInOutFreightAmountRemoved = isPropertyInOutFreightAmountRemoved;
    }

    private Boolean isPropertyInOutShipperIdRemoved;

    public Boolean getIsPropertyInOutShipperIdRemoved()
    {
        return this.isPropertyInOutShipperIdRemoved;
    }

    public void setIsPropertyInOutShipperIdRemoved(Boolean isPropertyInOutShipperIdRemoved)
    {
        this.isPropertyInOutShipperIdRemoved = isPropertyInOutShipperIdRemoved;
    }

    private Boolean isPropertyInOutChargeAmountRemoved;

    public Boolean getIsPropertyInOutChargeAmountRemoved()
    {
        return this.isPropertyInOutChargeAmountRemoved;
    }

    public void setIsPropertyInOutChargeAmountRemoved(Boolean isPropertyInOutChargeAmountRemoved)
    {
        this.isPropertyInOutChargeAmountRemoved = isPropertyInOutChargeAmountRemoved;
    }

    private Boolean isPropertyInOutDatePrintedRemoved;

    public Boolean getIsPropertyInOutDatePrintedRemoved()
    {
        return this.isPropertyInOutDatePrintedRemoved;
    }

    public void setIsPropertyInOutDatePrintedRemoved(Boolean isPropertyInOutDatePrintedRemoved)
    {
        this.isPropertyInOutDatePrintedRemoved = isPropertyInOutDatePrintedRemoved;
    }

    private Boolean isPropertyInOutSalesRepresentativeRemoved;

    public Boolean getIsPropertyInOutSalesRepresentativeRemoved()
    {
        return this.isPropertyInOutSalesRepresentativeRemoved;
    }

    public void setIsPropertyInOutSalesRepresentativeRemoved(Boolean isPropertyInOutSalesRepresentativeRemoved)
    {
        this.isPropertyInOutSalesRepresentativeRemoved = isPropertyInOutSalesRepresentativeRemoved;
    }

    private Boolean isPropertyInOutNumberOfPackagesRemoved;

    public Boolean getIsPropertyInOutNumberOfPackagesRemoved()
    {
        return this.isPropertyInOutNumberOfPackagesRemoved;
    }

    public void setIsPropertyInOutNumberOfPackagesRemoved(Boolean isPropertyInOutNumberOfPackagesRemoved)
    {
        this.isPropertyInOutNumberOfPackagesRemoved = isPropertyInOutNumberOfPackagesRemoved;
    }

    private Boolean isPropertyInOutPickDateRemoved;

    public Boolean getIsPropertyInOutPickDateRemoved()
    {
        return this.isPropertyInOutPickDateRemoved;
    }

    public void setIsPropertyInOutPickDateRemoved(Boolean isPropertyInOutPickDateRemoved)
    {
        this.isPropertyInOutPickDateRemoved = isPropertyInOutPickDateRemoved;
    }

    private Boolean isPropertyInOutShipDateRemoved;

    public Boolean getIsPropertyInOutShipDateRemoved()
    {
        return this.isPropertyInOutShipDateRemoved;
    }

    public void setIsPropertyInOutShipDateRemoved(Boolean isPropertyInOutShipDateRemoved)
    {
        this.isPropertyInOutShipDateRemoved = isPropertyInOutShipDateRemoved;
    }

    private Boolean isPropertyInOutTrackingNumberRemoved;

    public Boolean getIsPropertyInOutTrackingNumberRemoved()
    {
        return this.isPropertyInOutTrackingNumberRemoved;
    }

    public void setIsPropertyInOutTrackingNumberRemoved(Boolean isPropertyInOutTrackingNumberRemoved)
    {
        this.isPropertyInOutTrackingNumberRemoved = isPropertyInOutTrackingNumberRemoved;
    }

    private Boolean isPropertyInOutDateReceivedRemoved;

    public Boolean getIsPropertyInOutDateReceivedRemoved()
    {
        return this.isPropertyInOutDateReceivedRemoved;
    }

    public void setIsPropertyInOutDateReceivedRemoved(Boolean isPropertyInOutDateReceivedRemoved)
    {
        this.isPropertyInOutDateReceivedRemoved = isPropertyInOutDateReceivedRemoved;
    }

    private Boolean isPropertyInOutIsInTransitRemoved;

    public Boolean getIsPropertyInOutIsInTransitRemoved()
    {
        return this.isPropertyInOutIsInTransitRemoved;
    }

    public void setIsPropertyInOutIsInTransitRemoved(Boolean isPropertyInOutIsInTransitRemoved)
    {
        this.isPropertyInOutIsInTransitRemoved = isPropertyInOutIsInTransitRemoved;
    }

    private Boolean isPropertyInOutIsApprovedRemoved;

    public Boolean getIsPropertyInOutIsApprovedRemoved()
    {
        return this.isPropertyInOutIsApprovedRemoved;
    }

    public void setIsPropertyInOutIsApprovedRemoved(Boolean isPropertyInOutIsApprovedRemoved)
    {
        this.isPropertyInOutIsApprovedRemoved = isPropertyInOutIsApprovedRemoved;
    }

    private Boolean isPropertyInOutIsInDisputeRemoved;

    public Boolean getIsPropertyInOutIsInDisputeRemoved()
    {
        return this.isPropertyInOutIsInDisputeRemoved;
    }

    public void setIsPropertyInOutIsInDisputeRemoved(Boolean isPropertyInOutIsInDisputeRemoved)
    {
        this.isPropertyInOutIsInDisputeRemoved = isPropertyInOutIsInDisputeRemoved;
    }

    private Boolean isPropertyInOutVolumeRemoved;

    public Boolean getIsPropertyInOutVolumeRemoved()
    {
        return this.isPropertyInOutVolumeRemoved;
    }

    public void setIsPropertyInOutVolumeRemoved(Boolean isPropertyInOutVolumeRemoved)
    {
        this.isPropertyInOutVolumeRemoved = isPropertyInOutVolumeRemoved;
    }

    private Boolean isPropertyInOutWeightRemoved;

    public Boolean getIsPropertyInOutWeightRemoved()
    {
        return this.isPropertyInOutWeightRemoved;
    }

    public void setIsPropertyInOutWeightRemoved(Boolean isPropertyInOutWeightRemoved)
    {
        this.isPropertyInOutWeightRemoved = isPropertyInOutWeightRemoved;
    }

    private Boolean isPropertyInOutRmaNumberRemoved;

    public Boolean getIsPropertyInOutRmaNumberRemoved()
    {
        return this.isPropertyInOutRmaNumberRemoved;
    }

    public void setIsPropertyInOutRmaNumberRemoved(Boolean isPropertyInOutRmaNumberRemoved)
    {
        this.isPropertyInOutRmaNumberRemoved = isPropertyInOutRmaNumberRemoved;
    }

    private Boolean isPropertyInOutReversalNumberRemoved;

    public Boolean getIsPropertyInOutReversalNumberRemoved()
    {
        return this.isPropertyInOutReversalNumberRemoved;
    }

    public void setIsPropertyInOutReversalNumberRemoved(Boolean isPropertyInOutReversalNumberRemoved)
    {
        this.isPropertyInOutReversalNumberRemoved = isPropertyInOutReversalNumberRemoved;
    }

    private Boolean isPropertyInOutIsDropShipRemoved;

    public Boolean getIsPropertyInOutIsDropShipRemoved()
    {
        return this.isPropertyInOutIsDropShipRemoved;
    }

    public void setIsPropertyInOutIsDropShipRemoved(Boolean isPropertyInOutIsDropShipRemoved)
    {
        this.isPropertyInOutIsDropShipRemoved = isPropertyInOutIsDropShipRemoved;
    }

    private Boolean isPropertyInOutDropShipBusinessPartnerIdRemoved;

    public Boolean getIsPropertyInOutDropShipBusinessPartnerIdRemoved()
    {
        return this.isPropertyInOutDropShipBusinessPartnerIdRemoved;
    }

    public void setIsPropertyInOutDropShipBusinessPartnerIdRemoved(Boolean isPropertyInOutDropShipBusinessPartnerIdRemoved)
    {
        this.isPropertyInOutDropShipBusinessPartnerIdRemoved = isPropertyInOutDropShipBusinessPartnerIdRemoved;
    }

    private Boolean isPropertyInOutCreatedByRemoved;

    public Boolean getIsPropertyInOutCreatedByRemoved()
    {
        return this.isPropertyInOutCreatedByRemoved;
    }

    public void setIsPropertyInOutCreatedByRemoved(Boolean isPropertyInOutCreatedByRemoved)
    {
        this.isPropertyInOutCreatedByRemoved = isPropertyInOutCreatedByRemoved;
    }

    private Boolean isPropertyInOutCreatedAtRemoved;

    public Boolean getIsPropertyInOutCreatedAtRemoved()
    {
        return this.isPropertyInOutCreatedAtRemoved;
    }

    public void setIsPropertyInOutCreatedAtRemoved(Boolean isPropertyInOutCreatedAtRemoved)
    {
        this.isPropertyInOutCreatedAtRemoved = isPropertyInOutCreatedAtRemoved;
    }

    private Boolean isPropertyInOutUpdatedByRemoved;

    public Boolean getIsPropertyInOutUpdatedByRemoved()
    {
        return this.isPropertyInOutUpdatedByRemoved;
    }

    public void setIsPropertyInOutUpdatedByRemoved(Boolean isPropertyInOutUpdatedByRemoved)
    {
        this.isPropertyInOutUpdatedByRemoved = isPropertyInOutUpdatedByRemoved;
    }

    private Boolean isPropertyInOutUpdatedAtRemoved;

    public Boolean getIsPropertyInOutUpdatedAtRemoved()
    {
        return this.isPropertyInOutUpdatedAtRemoved;
    }

    public void setIsPropertyInOutUpdatedAtRemoved(Boolean isPropertyInOutUpdatedAtRemoved)
    {
        this.isPropertyInOutUpdatedAtRemoved = isPropertyInOutUpdatedAtRemoved;
    }

    private Boolean isPropertyInOutActiveRemoved;

    public Boolean getIsPropertyInOutActiveRemoved()
    {
        return this.isPropertyInOutActiveRemoved;
    }

    public void setIsPropertyInOutActiveRemoved(Boolean isPropertyInOutActiveRemoved)
    {
        this.isPropertyInOutActiveRemoved = isPropertyInOutActiveRemoved;
    }

    private Boolean isPropertyInOutDeletedRemoved;

    public Boolean getIsPropertyInOutDeletedRemoved()
    {
        return this.isPropertyInOutDeletedRemoved;
    }

    public void setIsPropertyInOutDeletedRemoved(Boolean isPropertyInOutDeletedRemoved)
    {
        this.isPropertyInOutDeletedRemoved = isPropertyInOutDeletedRemoved;
    }


    public static class CreateInOutLineMvoDto extends CreateOrMergePatchInOutLineMvoDto
    {
        @Override
        public String getCommandType() {
            return AbstractCommandDto.COMMAND_TYPE_CREATE;
        }

    }

    public static class MergePatchInOutLineMvoDto extends CreateOrMergePatchInOutLineMvoDto
    {
        @Override
        public String getCommandType() {
            return AbstractCommandDto.COMMAND_TYPE_MERGE_PATCH;
        }

    }

}

