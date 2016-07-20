package org.dddml.wms.domain;

import java.math.BigDecimal;
import java.util.Date;
import nodamoney.Money;
import org.dddml.wms.specialization.Event;

public interface InOutLineMvoStateEvent extends Event
{
    InOutLineMvoStateEventId getStateEventId();

    boolean getStateEventReadOnly();

    void setStateEventReadOnly(boolean readOnly);

    Long getLineNumber();

    void setLineNumber(Long lineNumber);

    String getDescription();

    void setDescription(String description);

    String getLocatorId();

    void setLocatorId(String locatorId);

    String getProduct();

    void setProduct(String product);

    String getUomId();

    void setUomId(String uomId);

    BigDecimal getMovementQuantity();

    void setMovementQuantity(BigDecimal movementQuantity);

    BigDecimal getConfirmedQuantity();

    void setConfirmedQuantity(BigDecimal confirmedQuantity);

    BigDecimal getScrappedQuantity();

    void setScrappedQuantity(BigDecimal scrappedQuantity);

    BigDecimal getTargetQuantity();

    void setTargetQuantity(BigDecimal targetQuantity);

    BigDecimal getPickedQuantity();

    void setPickedQuantity(BigDecimal pickedQuantity);

    Boolean getIsInvoiced();

    void setIsInvoiced(Boolean isInvoiced);

    String getAttributeSetInstanceId();

    void setAttributeSetInstanceId(String attributeSetInstanceId);

    Boolean getIsDescription();

    void setIsDescription(Boolean isDescription);

    Boolean getProcessed();

    void setProcessed(Boolean processed);

    BigDecimal getQuantityEntered();

    void setQuantityEntered(BigDecimal quantityEntered);

    Long getRmaLineNumber();

    void setRmaLineNumber(Long rmaLineNumber);

    Long getReversalLineNumber();

    void setReversalLineNumber(Long reversalLineNumber);

    Long getVersion();

    void setVersion(Long version);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    Date getCreatedAt();

    void setCreatedAt(Date createdAt);

    Boolean getActive();

    void setActive(Boolean active);

    Boolean getInOutIsSOTransaction();

    void setInOutIsSOTransaction(Boolean inOutIsSOTransaction);

    String getInOutDocumentStatus();

    void setInOutDocumentStatus(String inOutDocumentStatus);

    Boolean getInOutPosted();

    void setInOutPosted(Boolean inOutPosted);

    Boolean getInOutProcessing();

    void setInOutProcessing(Boolean inOutProcessing);

    Boolean getInOutProcessed();

    void setInOutProcessed(Boolean inOutProcessed);

    Integer getInOutDocumentType();

    void setInOutDocumentType(Integer inOutDocumentType);

    String getInOutDescription();

    void setInOutDescription(String inOutDescription);

    String getInOutOrderNumber();

    void setInOutOrderNumber(String inOutOrderNumber);

    Date getInOutDateOrdered();

    void setInOutDateOrdered(Date inOutDateOrdered);

    Boolean getInOutIsPrinted();

    void setInOutIsPrinted(Boolean inOutIsPrinted);

    String getInOutMovementType();

    void setInOutMovementType(String inOutMovementType);

    Date getInOutMovementDate();

    void setInOutMovementDate(Date inOutMovementDate);

    String getInOutBusinessPartnerId();

    void setInOutBusinessPartnerId(String inOutBusinessPartnerId);

    String getInOutWarehouseId();

    void setInOutWarehouseId(String inOutWarehouseId);

    String getInOutPOReference();

    void setInOutPOReference(String inOutPOReference);

    Money getInOutFreightAmount();

    void setInOutFreightAmount(Money inOutFreightAmount);

    String getInOutShipperId();

    void setInOutShipperId(String inOutShipperId);

    Money getInOutChargeAmount();

    void setInOutChargeAmount(Money inOutChargeAmount);

    Date getInOutDatePrinted();

    void setInOutDatePrinted(Date inOutDatePrinted);

    String getInOutSalesRepresentative();

    void setInOutSalesRepresentative(String inOutSalesRepresentative);

    Integer getInOutNumberOfPackages();

    void setInOutNumberOfPackages(Integer inOutNumberOfPackages);

    Date getInOutPickDate();

    void setInOutPickDate(Date inOutPickDate);

    Date getInOutShipDate();

    void setInOutShipDate(Date inOutShipDate);

    String getInOutTrackingNumber();

    void setInOutTrackingNumber(String inOutTrackingNumber);

    Date getInOutDateReceived();

    void setInOutDateReceived(Date inOutDateReceived);

    Boolean getInOutIsInTransit();

    void setInOutIsInTransit(Boolean inOutIsInTransit);

    Boolean getInOutIsApproved();

    void setInOutIsApproved(Boolean inOutIsApproved);

    Boolean getInOutIsInDispute();

    void setInOutIsInDispute(Boolean inOutIsInDispute);

    BigDecimal getInOutVolume();

    void setInOutVolume(BigDecimal inOutVolume);

    BigDecimal getInOutWeight();

    void setInOutWeight(BigDecimal inOutWeight);

    String getInOutRmaNumber();

    void setInOutRmaNumber(String inOutRmaNumber);

    String getInOutReversalNumber();

    void setInOutReversalNumber(String inOutReversalNumber);

    Boolean getInOutIsDropShip();

    void setInOutIsDropShip(Boolean inOutIsDropShip);

    String getInOutDropShipBusinessPartnerId();

    void setInOutDropShipBusinessPartnerId(String inOutDropShipBusinessPartnerId);

    String getInOutCreatedBy();

    void setInOutCreatedBy(String inOutCreatedBy);

    Date getInOutCreatedAt();

    void setInOutCreatedAt(Date inOutCreatedAt);

    String getInOutUpdatedBy();

    void setInOutUpdatedBy(String inOutUpdatedBy);

    Date getInOutUpdatedAt();

    void setInOutUpdatedAt(Date inOutUpdatedAt);

    Boolean getInOutActive();

    void setInOutActive(Boolean inOutActive);

    Boolean getInOutDeleted();

    void setInOutDeleted(Boolean inOutDeleted);

    

    interface InOutLineMvoStateCreated extends InOutLineMvoStateEvent
    {
    
    }


    interface InOutLineMvoStateMergePatched extends InOutLineMvoStateEvent
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

    interface InOutLineMvoStateDeleted extends InOutLineMvoStateEvent
    {
    }


}

