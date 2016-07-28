package org.dddml.wms.domain;

import java.util.Set;
import java.math.BigDecimal;
import java.util.Date;
import org.joda.money.Money;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.InOutLineMvoStateEvent.*;

public interface InOutLineMvoState
{
    Long VERSION_ZERO = 0L;

    Long VERSION_NULL = VERSION_ZERO - 1;

    InOutLineId getInOutLineId();

    void setInOutLineId(InOutLineId inOutLineId);

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

    String getUpdatedBy();

    void setUpdatedBy(String updatedBy);

    Date getUpdatedAt();

    void setUpdatedAt(Date updatedAt);

    Boolean getActive();

    void setActive(Boolean active);

    Boolean getDeleted();

    void setDeleted(Boolean deleted);

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

    Long getInOutVersion();

    void setInOutVersion(Long inOutVersion);

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


    boolean isStateUnsaved();


    void mutate(Event e);

    void when(InOutLineMvoStateCreated e);

    void when(InOutLineMvoStateMergePatched e);

    void when(InOutLineMvoStateDeleted e);
    
}

