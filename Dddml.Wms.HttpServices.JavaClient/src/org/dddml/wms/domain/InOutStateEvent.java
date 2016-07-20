package org.dddml.wms.domain;

import nodamoney.Money;
import java.math.BigDecimal;
import java.util.Date;
import org.dddml.wms.specialization.Event;

public interface InOutStateEvent extends Event
{

    InOutStateEventId getStateEventId();

    boolean getStateEventReadOnly();

    void setStateEventReadOnly(boolean readOnly);

    Boolean getIsSOTransaction();

    void setIsSOTransaction(Boolean isSOTransaction);

    String getDocumentStatus();

    void setDocumentStatus(String documentStatus);

    Boolean getPosted();

    void setPosted(Boolean posted);

    Boolean getProcessing();

    void setProcessing(Boolean processing);

    Boolean getProcessed();

    void setProcessed(Boolean processed);

    Integer getDocumentType();

    void setDocumentType(Integer documentType);

    String getDescription();

    void setDescription(String description);

    String getOrderNumber();

    void setOrderNumber(String orderNumber);

    Date getDateOrdered();

    void setDateOrdered(Date dateOrdered);

    Boolean getIsPrinted();

    void setIsPrinted(Boolean isPrinted);

    String getMovementType();

    void setMovementType(String movementType);

    Date getMovementDate();

    void setMovementDate(Date movementDate);

    String getBusinessPartnerId();

    void setBusinessPartnerId(String businessPartnerId);

    String getWarehouseId();

    void setWarehouseId(String warehouseId);

    String getPOReference();

    void setPOReference(String pOReference);

    Money getFreightAmount();

    void setFreightAmount(Money freightAmount);

    String getShipperId();

    void setShipperId(String shipperId);

    Money getChargeAmount();

    void setChargeAmount(Money chargeAmount);

    Date getDatePrinted();

    void setDatePrinted(Date datePrinted);

    String getSalesRepresentative();

    void setSalesRepresentative(String salesRepresentative);

    Integer getNumberOfPackages();

    void setNumberOfPackages(Integer numberOfPackages);

    Date getPickDate();

    void setPickDate(Date pickDate);

    Date getShipDate();

    void setShipDate(Date shipDate);

    String getTrackingNumber();

    void setTrackingNumber(String trackingNumber);

    Date getDateReceived();

    void setDateReceived(Date dateReceived);

    Boolean getIsInTransit();

    void setIsInTransit(Boolean isInTransit);

    Boolean getIsApproved();

    void setIsApproved(Boolean isApproved);

    Boolean getIsInDispute();

    void setIsInDispute(Boolean isInDispute);

    BigDecimal getVolume();

    void setVolume(BigDecimal volume);

    BigDecimal getWeight();

    void setWeight(BigDecimal weight);

    String getRmaNumber();

    void setRmaNumber(String rmaNumber);

    String getReversalNumber();

    void setReversalNumber(String reversalNumber);

    Boolean getIsDropShip();

    void setIsDropShip(Boolean isDropShip);

    String getDropShipBusinessPartnerId();

    void setDropShipBusinessPartnerId(String dropShipBusinessPartnerId);

    Boolean getActive();

    void setActive(Boolean active);

    

    interface InOutStateCreated extends InOutStateEvent
    {
        Iterable<InOutLineStateEvent.InOutLineStateCreated> getInOutLineEvents();
        
        void addInOutLineEvent(InOutLineStateEvent.InOutLineStateCreated e);

        InOutLineStateEvent.InOutLineStateCreated newInOutLineStateCreated(SkuId skuId);

    
    }


    interface InOutStateMergePatched extends InOutStateEvent
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

    interface InOutStateDeleted extends InOutStateEvent
    {
        Iterable<InOutLineStateEvent.InOutLineStateRemoved> getInOutLineEvents();
        
        void addInOutLineEvent(InOutLineStateEvent.InOutLineStateRemoved e);
        
        InOutLineStateEvent.InOutLineStateRemoved newInOutLineStateRemoved(SkuId skuId);

    }


}

