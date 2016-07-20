package org.dddml.wms.domain;

import java.util.*;
import java.math.BigDecimal;
import java.util.Date;
import org.dddml.wms.specialization.*;

public abstract class AbstractInOutLineStateEvent implements InOutLineStateEvent
{
    private InOutLineStateEventId stateEventId;

    public InOutLineStateEventId getStateEventId() {
        return this.stateEventId;
    }

    public void setStateEventId(InOutLineStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }
    
    private boolean stateEventReadOnly;

    public boolean getStateEventReadOnly() { return this.stateEventReadOnly; }

    public void setStateEventReadOnly(boolean readOnly) { this.stateEventReadOnly = readOnly; }

    private Long version;

    public Long getVersion()
    {
        return this.version;
    }

    public void setVersion(Long version)
    {
        this.version = version;
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

    private String inOutDocumentNumber;

    public String getInOutDocumentNumber()
    {
        return this.inOutDocumentNumber;
    }

    public void setInOutDocumentNumber(String inOutDocumentNumber)
    {
        this.inOutDocumentNumber = inOutDocumentNumber;
    }

    protected AbstractInOutLineStateEvent() {
    }

    protected AbstractInOutLineStateEvent(InOutLineStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }


    public abstract String getStateEventType();


    public static abstract class AbstractInOutLineStateCreated extends AbstractInOutLineStateEvent implements InOutLineStateCreated
    {
        public AbstractInOutLineStateCreated() {
        }

        public AbstractInOutLineStateCreated(InOutLineStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.CREATED;
        }

    }


/*
    public static abstract class AbstractInOutLineStateMergePatched extends AbstractInOutLineStateEvent implements InOutLineStateMergePatched
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
*/

    public static abstract class AbstractInOutLineStateRemoved extends AbstractInOutLineStateEvent implements InOutLineStateRemoved
    {
        public AbstractInOutLineStateRemoved() {
        }

        public AbstractInOutLineStateRemoved(InOutLineStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.REMOVED;
        }

    }

}

