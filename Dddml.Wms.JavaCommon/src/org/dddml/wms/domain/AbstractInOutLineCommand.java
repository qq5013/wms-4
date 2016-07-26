package org.dddml.wms.domain;

import java.util.*;
import java.math.BigDecimal;
import java.util.Date;
import org.dddml.wms.domain.AbstractCommand;

public abstract class AbstractInOutLineCommand extends AbstractCommand implements InOutLineCommand
{
    private SkuId skuId;

    public SkuId getSkuId()
    {
        return this.skuId;
    }

    public void setSkuId(SkuId skuId)
    {
        this.skuId = skuId;
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


    public static abstract class AbstractCreateOrMergePatchInOutLine extends AbstractInOutLineCommand implements CreateOrMergePatchInOutLine
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

        private Boolean active;

        public Boolean getActive()
        {
            return this.active;
        }

        public void setActive(Boolean active)
        {
            this.active = active;
        }

    }

    public static abstract class AbstractCreateInOutLine extends AbstractCreateOrMergePatchInOutLine implements CreateInOutLine
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_CREATE;
        }

    }

    public static abstract class AbstractMergePatchInOutLine extends AbstractCreateOrMergePatchInOutLine implements MergePatchInOutLine
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_MERGE_PATCH;
        }

        private Boolean isPropertyLineNumberRemoved;

        public Boolean getIsPropertyLineNumberRemoved()
        {
            return this.isPropertyLineNumberRemoved;
        }

        public void setIsPropertyLineNumberRemoved(Boolean removed)
        {
            this.isPropertyLineNumberRemoved = removed;
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

        private Boolean isPropertyLocatorIdRemoved;

        public Boolean getIsPropertyLocatorIdRemoved()
        {
            return this.isPropertyLocatorIdRemoved;
        }

        public void setIsPropertyLocatorIdRemoved(Boolean removed)
        {
            this.isPropertyLocatorIdRemoved = removed;
        }

        private Boolean isPropertyProductRemoved;

        public Boolean getIsPropertyProductRemoved()
        {
            return this.isPropertyProductRemoved;
        }

        public void setIsPropertyProductRemoved(Boolean removed)
        {
            this.isPropertyProductRemoved = removed;
        }

        private Boolean isPropertyUomIdRemoved;

        public Boolean getIsPropertyUomIdRemoved()
        {
            return this.isPropertyUomIdRemoved;
        }

        public void setIsPropertyUomIdRemoved(Boolean removed)
        {
            this.isPropertyUomIdRemoved = removed;
        }

        private Boolean isPropertyMovementQuantityRemoved;

        public Boolean getIsPropertyMovementQuantityRemoved()
        {
            return this.isPropertyMovementQuantityRemoved;
        }

        public void setIsPropertyMovementQuantityRemoved(Boolean removed)
        {
            this.isPropertyMovementQuantityRemoved = removed;
        }

        private Boolean isPropertyConfirmedQuantityRemoved;

        public Boolean getIsPropertyConfirmedQuantityRemoved()
        {
            return this.isPropertyConfirmedQuantityRemoved;
        }

        public void setIsPropertyConfirmedQuantityRemoved(Boolean removed)
        {
            this.isPropertyConfirmedQuantityRemoved = removed;
        }

        private Boolean isPropertyScrappedQuantityRemoved;

        public Boolean getIsPropertyScrappedQuantityRemoved()
        {
            return this.isPropertyScrappedQuantityRemoved;
        }

        public void setIsPropertyScrappedQuantityRemoved(Boolean removed)
        {
            this.isPropertyScrappedQuantityRemoved = removed;
        }

        private Boolean isPropertyTargetQuantityRemoved;

        public Boolean getIsPropertyTargetQuantityRemoved()
        {
            return this.isPropertyTargetQuantityRemoved;
        }

        public void setIsPropertyTargetQuantityRemoved(Boolean removed)
        {
            this.isPropertyTargetQuantityRemoved = removed;
        }

        private Boolean isPropertyPickedQuantityRemoved;

        public Boolean getIsPropertyPickedQuantityRemoved()
        {
            return this.isPropertyPickedQuantityRemoved;
        }

        public void setIsPropertyPickedQuantityRemoved(Boolean removed)
        {
            this.isPropertyPickedQuantityRemoved = removed;
        }

        private Boolean isPropertyIsInvoicedRemoved;

        public Boolean getIsPropertyIsInvoicedRemoved()
        {
            return this.isPropertyIsInvoicedRemoved;
        }

        public void setIsPropertyIsInvoicedRemoved(Boolean removed)
        {
            this.isPropertyIsInvoicedRemoved = removed;
        }

        private Boolean isPropertyAttributeSetInstanceIdRemoved;

        public Boolean getIsPropertyAttributeSetInstanceIdRemoved()
        {
            return this.isPropertyAttributeSetInstanceIdRemoved;
        }

        public void setIsPropertyAttributeSetInstanceIdRemoved(Boolean removed)
        {
            this.isPropertyAttributeSetInstanceIdRemoved = removed;
        }

        private Boolean isPropertyIsDescriptionRemoved;

        public Boolean getIsPropertyIsDescriptionRemoved()
        {
            return this.isPropertyIsDescriptionRemoved;
        }

        public void setIsPropertyIsDescriptionRemoved(Boolean removed)
        {
            this.isPropertyIsDescriptionRemoved = removed;
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

        private Boolean isPropertyQuantityEnteredRemoved;

        public Boolean getIsPropertyQuantityEnteredRemoved()
        {
            return this.isPropertyQuantityEnteredRemoved;
        }

        public void setIsPropertyQuantityEnteredRemoved(Boolean removed)
        {
            this.isPropertyQuantityEnteredRemoved = removed;
        }

        private Boolean isPropertyRmaLineNumberRemoved;

        public Boolean getIsPropertyRmaLineNumberRemoved()
        {
            return this.isPropertyRmaLineNumberRemoved;
        }

        public void setIsPropertyRmaLineNumberRemoved(Boolean removed)
        {
            this.isPropertyRmaLineNumberRemoved = removed;
        }

        private Boolean isPropertyReversalLineNumberRemoved;

        public Boolean getIsPropertyReversalLineNumberRemoved()
        {
            return this.isPropertyReversalLineNumberRemoved;
        }

        public void setIsPropertyReversalLineNumberRemoved(Boolean removed)
        {
            this.isPropertyReversalLineNumberRemoved = removed;
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

    }

    public static class SimpleCreateInOutLine extends AbstractCreateInOutLine
    {
    }

    public static class SimpleMergePatchInOutLine extends AbstractMergePatchInOutLine
    {
    }

	public static class SimpleRemoveInOutLine extends AbstractInOutLineCommand implements RemoveInOutLine
	{
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_REMOVE;
        }
	}


}

