package org.dddml.wms.domain;

import org.joda.money.Money;
import java.math.BigDecimal;
import java.util.Date;

public class CreateOrMergePatchInOutDto extends AbstractInOutCommandDto
{
    private Boolean isSOTransaction;

    public Boolean getIsSOTransaction()
    {
        return this.isSOTransaction;
    }

    public void setIsSOTransaction(Boolean isSOTransaction)
    {
        this.isSOTransaction = isSOTransaction;
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

    private String poReference;

    public String getPOReference()
    {
        return this.poReference;
    }

    public void setPOReference(String poReference)
    {
        this.poReference = poReference;
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

    private Boolean active;

    public Boolean getActive()
    {
        return this.active;
    }

    public void setActive(Boolean active)
    {
        this.active = active;
    }

    private CreateOrMergePatchInOutLineDto[] inOutLines;

    public CreateOrMergePatchInOutLineDto[] getInOutLines()
    {
        return this.inOutLines;
    }

    public void setInOutLines(CreateOrMergePatchInOutLineDto[] inOutLines)
    {
        this.inOutLines = inOutLines;
    }

    private Boolean isPropertyIsSOTransactionRemoved;

    public Boolean getIsPropertyIsSOTransactionRemoved()
    {
        return this.isPropertyIsSOTransactionRemoved;
    }

    public void setIsPropertyIsSOTransactionRemoved(Boolean removed)
    {
        this.isPropertyIsSOTransactionRemoved = removed;
    }

    private Boolean isPropertyPostedRemoved;

    public Boolean getIsPropertyPostedRemoved()
    {
        return this.isPropertyPostedRemoved;
    }

    public void setIsPropertyPostedRemoved(Boolean removed)
    {
        this.isPropertyPostedRemoved = removed;
    }

    private Boolean isPropertyProcessingRemoved;

    public Boolean getIsPropertyProcessingRemoved()
    {
        return this.isPropertyProcessingRemoved;
    }

    public void setIsPropertyProcessingRemoved(Boolean removed)
    {
        this.isPropertyProcessingRemoved = removed;
    }

    private Boolean isPropertyProcessedRemoved;

    public Boolean getIsPropertyProcessedRemoved()
    {
        return this.isPropertyProcessedRemoved;
    }

    public void setIsPropertyProcessedRemoved(Boolean removed)
    {
        this.isPropertyProcessedRemoved = removed;
    }

    private Boolean isPropertyDocumentTypeRemoved;

    public Boolean getIsPropertyDocumentTypeRemoved()
    {
        return this.isPropertyDocumentTypeRemoved;
    }

    public void setIsPropertyDocumentTypeRemoved(Boolean removed)
    {
        this.isPropertyDocumentTypeRemoved = removed;
    }

    private Boolean isPropertyDescriptionRemoved;

    public Boolean getIsPropertyDescriptionRemoved()
    {
        return this.isPropertyDescriptionRemoved;
    }

    public void setIsPropertyDescriptionRemoved(Boolean removed)
    {
        this.isPropertyDescriptionRemoved = removed;
    }

    private Boolean isPropertyOrderNumberRemoved;

    public Boolean getIsPropertyOrderNumberRemoved()
    {
        return this.isPropertyOrderNumberRemoved;
    }

    public void setIsPropertyOrderNumberRemoved(Boolean removed)
    {
        this.isPropertyOrderNumberRemoved = removed;
    }

    private Boolean isPropertyDateOrderedRemoved;

    public Boolean getIsPropertyDateOrderedRemoved()
    {
        return this.isPropertyDateOrderedRemoved;
    }

    public void setIsPropertyDateOrderedRemoved(Boolean removed)
    {
        this.isPropertyDateOrderedRemoved = removed;
    }

    private Boolean isPropertyIsPrintedRemoved;

    public Boolean getIsPropertyIsPrintedRemoved()
    {
        return this.isPropertyIsPrintedRemoved;
    }

    public void setIsPropertyIsPrintedRemoved(Boolean removed)
    {
        this.isPropertyIsPrintedRemoved = removed;
    }

    private Boolean isPropertyMovementTypeRemoved;

    public Boolean getIsPropertyMovementTypeRemoved()
    {
        return this.isPropertyMovementTypeRemoved;
    }

    public void setIsPropertyMovementTypeRemoved(Boolean removed)
    {
        this.isPropertyMovementTypeRemoved = removed;
    }

    private Boolean isPropertyMovementDateRemoved;

    public Boolean getIsPropertyMovementDateRemoved()
    {
        return this.isPropertyMovementDateRemoved;
    }

    public void setIsPropertyMovementDateRemoved(Boolean removed)
    {
        this.isPropertyMovementDateRemoved = removed;
    }

    private Boolean isPropertyBusinessPartnerIdRemoved;

    public Boolean getIsPropertyBusinessPartnerIdRemoved()
    {
        return this.isPropertyBusinessPartnerIdRemoved;
    }

    public void setIsPropertyBusinessPartnerIdRemoved(Boolean removed)
    {
        this.isPropertyBusinessPartnerIdRemoved = removed;
    }

    private Boolean isPropertyWarehouseIdRemoved;

    public Boolean getIsPropertyWarehouseIdRemoved()
    {
        return this.isPropertyWarehouseIdRemoved;
    }

    public void setIsPropertyWarehouseIdRemoved(Boolean removed)
    {
        this.isPropertyWarehouseIdRemoved = removed;
    }

    private Boolean isPropertyPOReferenceRemoved;

    public Boolean getIsPropertyPOReferenceRemoved()
    {
        return this.isPropertyPOReferenceRemoved;
    }

    public void setIsPropertyPOReferenceRemoved(Boolean removed)
    {
        this.isPropertyPOReferenceRemoved = removed;
    }

    private Boolean isPropertyFreightAmountRemoved;

    public Boolean getIsPropertyFreightAmountRemoved()
    {
        return this.isPropertyFreightAmountRemoved;
    }

    public void setIsPropertyFreightAmountRemoved(Boolean removed)
    {
        this.isPropertyFreightAmountRemoved = removed;
    }

    private Boolean isPropertyShipperIdRemoved;

    public Boolean getIsPropertyShipperIdRemoved()
    {
        return this.isPropertyShipperIdRemoved;
    }

    public void setIsPropertyShipperIdRemoved(Boolean removed)
    {
        this.isPropertyShipperIdRemoved = removed;
    }

    private Boolean isPropertyChargeAmountRemoved;

    public Boolean getIsPropertyChargeAmountRemoved()
    {
        return this.isPropertyChargeAmountRemoved;
    }

    public void setIsPropertyChargeAmountRemoved(Boolean removed)
    {
        this.isPropertyChargeAmountRemoved = removed;
    }

    private Boolean isPropertyDatePrintedRemoved;

    public Boolean getIsPropertyDatePrintedRemoved()
    {
        return this.isPropertyDatePrintedRemoved;
    }

    public void setIsPropertyDatePrintedRemoved(Boolean removed)
    {
        this.isPropertyDatePrintedRemoved = removed;
    }

    private Boolean isPropertySalesRepresentativeRemoved;

    public Boolean getIsPropertySalesRepresentativeRemoved()
    {
        return this.isPropertySalesRepresentativeRemoved;
    }

    public void setIsPropertySalesRepresentativeRemoved(Boolean removed)
    {
        this.isPropertySalesRepresentativeRemoved = removed;
    }

    private Boolean isPropertyNumberOfPackagesRemoved;

    public Boolean getIsPropertyNumberOfPackagesRemoved()
    {
        return this.isPropertyNumberOfPackagesRemoved;
    }

    public void setIsPropertyNumberOfPackagesRemoved(Boolean removed)
    {
        this.isPropertyNumberOfPackagesRemoved = removed;
    }

    private Boolean isPropertyPickDateRemoved;

    public Boolean getIsPropertyPickDateRemoved()
    {
        return this.isPropertyPickDateRemoved;
    }

    public void setIsPropertyPickDateRemoved(Boolean removed)
    {
        this.isPropertyPickDateRemoved = removed;
    }

    private Boolean isPropertyShipDateRemoved;

    public Boolean getIsPropertyShipDateRemoved()
    {
        return this.isPropertyShipDateRemoved;
    }

    public void setIsPropertyShipDateRemoved(Boolean removed)
    {
        this.isPropertyShipDateRemoved = removed;
    }

    private Boolean isPropertyTrackingNumberRemoved;

    public Boolean getIsPropertyTrackingNumberRemoved()
    {
        return this.isPropertyTrackingNumberRemoved;
    }

    public void setIsPropertyTrackingNumberRemoved(Boolean removed)
    {
        this.isPropertyTrackingNumberRemoved = removed;
    }

    private Boolean isPropertyDateReceivedRemoved;

    public Boolean getIsPropertyDateReceivedRemoved()
    {
        return this.isPropertyDateReceivedRemoved;
    }

    public void setIsPropertyDateReceivedRemoved(Boolean removed)
    {
        this.isPropertyDateReceivedRemoved = removed;
    }

    private Boolean isPropertyIsInTransitRemoved;

    public Boolean getIsPropertyIsInTransitRemoved()
    {
        return this.isPropertyIsInTransitRemoved;
    }

    public void setIsPropertyIsInTransitRemoved(Boolean removed)
    {
        this.isPropertyIsInTransitRemoved = removed;
    }

    private Boolean isPropertyIsApprovedRemoved;

    public Boolean getIsPropertyIsApprovedRemoved()
    {
        return this.isPropertyIsApprovedRemoved;
    }

    public void setIsPropertyIsApprovedRemoved(Boolean removed)
    {
        this.isPropertyIsApprovedRemoved = removed;
    }

    private Boolean isPropertyIsInDisputeRemoved;

    public Boolean getIsPropertyIsInDisputeRemoved()
    {
        return this.isPropertyIsInDisputeRemoved;
    }

    public void setIsPropertyIsInDisputeRemoved(Boolean removed)
    {
        this.isPropertyIsInDisputeRemoved = removed;
    }

    private Boolean isPropertyVolumeRemoved;

    public Boolean getIsPropertyVolumeRemoved()
    {
        return this.isPropertyVolumeRemoved;
    }

    public void setIsPropertyVolumeRemoved(Boolean removed)
    {
        this.isPropertyVolumeRemoved = removed;
    }

    private Boolean isPropertyWeightRemoved;

    public Boolean getIsPropertyWeightRemoved()
    {
        return this.isPropertyWeightRemoved;
    }

    public void setIsPropertyWeightRemoved(Boolean removed)
    {
        this.isPropertyWeightRemoved = removed;
    }

    private Boolean isPropertyRmaNumberRemoved;

    public Boolean getIsPropertyRmaNumberRemoved()
    {
        return this.isPropertyRmaNumberRemoved;
    }

    public void setIsPropertyRmaNumberRemoved(Boolean removed)
    {
        this.isPropertyRmaNumberRemoved = removed;
    }

    private Boolean isPropertyReversalNumberRemoved;

    public Boolean getIsPropertyReversalNumberRemoved()
    {
        return this.isPropertyReversalNumberRemoved;
    }

    public void setIsPropertyReversalNumberRemoved(Boolean removed)
    {
        this.isPropertyReversalNumberRemoved = removed;
    }

    private Boolean isPropertyIsDropShipRemoved;

    public Boolean getIsPropertyIsDropShipRemoved()
    {
        return this.isPropertyIsDropShipRemoved;
    }

    public void setIsPropertyIsDropShipRemoved(Boolean removed)
    {
        this.isPropertyIsDropShipRemoved = removed;
    }

    private Boolean isPropertyDropShipBusinessPartnerIdRemoved;

    public Boolean getIsPropertyDropShipBusinessPartnerIdRemoved()
    {
        return this.isPropertyDropShipBusinessPartnerIdRemoved;
    }

    public void setIsPropertyDropShipBusinessPartnerIdRemoved(Boolean removed)
    {
        this.isPropertyDropShipBusinessPartnerIdRemoved = removed;
    }

    private Boolean isPropertyActiveRemoved;

    public Boolean getIsPropertyActiveRemoved()
    {
        return this.isPropertyActiveRemoved;
    }

    public void setIsPropertyActiveRemoved(Boolean removed)
    {
        this.isPropertyActiveRemoved = removed;
    }


    public static class CreateInOutDto extends CreateOrMergePatchInOutDto
    {
        @Override
        public String getCommandType() {
            return AbstractCommandDto.COMMAND_TYPE_CREATE;
        }

    }

    public static class MergePatchInOutDto extends CreateOrMergePatchInOutDto
    {
        @Override
        public String getCommandType() {
            return AbstractCommandDto.COMMAND_TYPE_MERGE_PATCH;
        }

    }

}

