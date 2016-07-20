package org.dddml.wms.domain;

import java.math.BigDecimal;
import java.util.Date;
import org.dddml.wms.specialization.Event;

public interface InOutLineStateEvent extends Event
{

    InOutLineStateEventId getStateEventId();

    boolean getStateEventReadOnly();

    void setStateEventReadOnly(boolean readOnly);

    Long getVersion();

    void setVersion(Long version);

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

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    Date getCreatedAt();

    void setCreatedAt(Date createdAt);

    Boolean getActive();

    void setActive(Boolean active);

    String getInOutDocumentNumber();

    void setInOutDocumentNumber(String inOutDocumentNumber);

    

    interface InOutLineStateCreated extends InOutLineStateEvent
    {
    
    }


    interface InOutLineStateMergePatched extends InOutLineStateEvent
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

        Boolean isPropertyActiveRemoved();

        void setPropertyActiveRemoved(Boolean removed);


    }

    interface InOutLineStateRemoved extends InOutLineStateEvent
    {
    }


}

