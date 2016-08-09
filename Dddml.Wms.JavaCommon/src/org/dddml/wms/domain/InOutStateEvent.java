package org.dddml.wms.domain;

import java.util.*;
import org.joda.money.Money;
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

    void setPOReference(String poReference);

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

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    Date getCreatedAt();

    void setCreatedAt(Date createdAt);

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
        Boolean getIsPropertyIsSOTransactionRemoved();

        void setIsPropertyIsSOTransactionRemoved(Boolean removed);

        Boolean getIsPropertyDocumentStatusRemoved();

        void setIsPropertyDocumentStatusRemoved(Boolean removed);

        Boolean getIsPropertyPostedRemoved();

        void setIsPropertyPostedRemoved(Boolean removed);

        Boolean getIsPropertyProcessingRemoved();

        void setIsPropertyProcessingRemoved(Boolean removed);

        Boolean getIsPropertyProcessedRemoved();

        void setIsPropertyProcessedRemoved(Boolean removed);

        Boolean getIsPropertyDocumentTypeRemoved();

        void setIsPropertyDocumentTypeRemoved(Boolean removed);

        Boolean getIsPropertyDescriptionRemoved();

        void setIsPropertyDescriptionRemoved(Boolean removed);

        Boolean getIsPropertyOrderNumberRemoved();

        void setIsPropertyOrderNumberRemoved(Boolean removed);

        Boolean getIsPropertyDateOrderedRemoved();

        void setIsPropertyDateOrderedRemoved(Boolean removed);

        Boolean getIsPropertyIsPrintedRemoved();

        void setIsPropertyIsPrintedRemoved(Boolean removed);

        Boolean getIsPropertyMovementTypeRemoved();

        void setIsPropertyMovementTypeRemoved(Boolean removed);

        Boolean getIsPropertyMovementDateRemoved();

        void setIsPropertyMovementDateRemoved(Boolean removed);

        Boolean getIsPropertyBusinessPartnerIdRemoved();

        void setIsPropertyBusinessPartnerIdRemoved(Boolean removed);

        Boolean getIsPropertyWarehouseIdRemoved();

        void setIsPropertyWarehouseIdRemoved(Boolean removed);

        Boolean getIsPropertyPOReferenceRemoved();

        void setIsPropertyPOReferenceRemoved(Boolean removed);

        Boolean getIsPropertyFreightAmountRemoved();

        void setIsPropertyFreightAmountRemoved(Boolean removed);

        Boolean getIsPropertyShipperIdRemoved();

        void setIsPropertyShipperIdRemoved(Boolean removed);

        Boolean getIsPropertyChargeAmountRemoved();

        void setIsPropertyChargeAmountRemoved(Boolean removed);

        Boolean getIsPropertyDatePrintedRemoved();

        void setIsPropertyDatePrintedRemoved(Boolean removed);

        Boolean getIsPropertySalesRepresentativeRemoved();

        void setIsPropertySalesRepresentativeRemoved(Boolean removed);

        Boolean getIsPropertyNumberOfPackagesRemoved();

        void setIsPropertyNumberOfPackagesRemoved(Boolean removed);

        Boolean getIsPropertyPickDateRemoved();

        void setIsPropertyPickDateRemoved(Boolean removed);

        Boolean getIsPropertyShipDateRemoved();

        void setIsPropertyShipDateRemoved(Boolean removed);

        Boolean getIsPropertyTrackingNumberRemoved();

        void setIsPropertyTrackingNumberRemoved(Boolean removed);

        Boolean getIsPropertyDateReceivedRemoved();

        void setIsPropertyDateReceivedRemoved(Boolean removed);

        Boolean getIsPropertyIsInTransitRemoved();

        void setIsPropertyIsInTransitRemoved(Boolean removed);

        Boolean getIsPropertyIsApprovedRemoved();

        void setIsPropertyIsApprovedRemoved(Boolean removed);

        Boolean getIsPropertyIsInDisputeRemoved();

        void setIsPropertyIsInDisputeRemoved(Boolean removed);

        Boolean getIsPropertyVolumeRemoved();

        void setIsPropertyVolumeRemoved(Boolean removed);

        Boolean getIsPropertyWeightRemoved();

        void setIsPropertyWeightRemoved(Boolean removed);

        Boolean getIsPropertyRmaNumberRemoved();

        void setIsPropertyRmaNumberRemoved(Boolean removed);

        Boolean getIsPropertyReversalNumberRemoved();

        void setIsPropertyReversalNumberRemoved(Boolean removed);

        Boolean getIsPropertyIsDropShipRemoved();

        void setIsPropertyIsDropShipRemoved(Boolean removed);

        Boolean getIsPropertyDropShipBusinessPartnerIdRemoved();

        void setIsPropertyDropShipBusinessPartnerIdRemoved(Boolean removed);

        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);

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

