package org.dddml.wms.domain;

import java.util.Set;
import nodamoney.Money;
import java.math.BigDecimal;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.InOutStateEvent.*;

public interface InOutState
{
    String getDocumentNumber();

    void setDocumentNumber(String documentNumber);

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

    Long getVersion();

    void setVersion(Long version);

    Boolean getActive();

    void setActive(Boolean active);


    boolean isStateUnsaved();

    InOutLineStates getInOutLines();


    void when(InOutStateCreated e);

    void when(InOutStateMergePatched e);

    void when(InOutStateDeleted e);

    void mutate(Event e);

    
}

