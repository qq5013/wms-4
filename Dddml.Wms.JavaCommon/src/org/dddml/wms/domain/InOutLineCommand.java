package org.dddml.wms.domain;

import java.math.BigDecimal;
import java.util.Date;
import org.dddml.wms.domain.Command;

public interface InOutLineCommand extends Command
{
    SkuId getSkuId();

    void setSkuId(SkuId skuId);

    String getInOutDocumentNumber();

    void setInOutDocumentNumber(String inOutDocumentNumber);


    interface CreateOrMergePatchInOutLine extends InOutLineCommand
    {
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

        Boolean getActive();

        void setActive(Boolean active);

    }

    interface CreateInOutLine extends CreateOrMergePatchInOutLine
    {
    }

    interface MergePatchInOutLine extends CreateOrMergePatchInOutLine
    {
        Boolean getIsPropertyLineNumberRemoved();

        void setIsPropertyLineNumberRemoved(Boolean removed);

        Boolean getIsPropertyDescriptionRemoved();

        void setIsPropertyDescriptionRemoved(Boolean removed);

        Boolean getIsPropertyLocatorIdRemoved();

        void setIsPropertyLocatorIdRemoved(Boolean removed);

        Boolean getIsPropertyProductRemoved();

        void setIsPropertyProductRemoved(Boolean removed);

        Boolean getIsPropertyUomIdRemoved();

        void setIsPropertyUomIdRemoved(Boolean removed);

        Boolean getIsPropertyMovementQuantityRemoved();

        void setIsPropertyMovementQuantityRemoved(Boolean removed);

        Boolean getIsPropertyConfirmedQuantityRemoved();

        void setIsPropertyConfirmedQuantityRemoved(Boolean removed);

        Boolean getIsPropertyScrappedQuantityRemoved();

        void setIsPropertyScrappedQuantityRemoved(Boolean removed);

        Boolean getIsPropertyTargetQuantityRemoved();

        void setIsPropertyTargetQuantityRemoved(Boolean removed);

        Boolean getIsPropertyPickedQuantityRemoved();

        void setIsPropertyPickedQuantityRemoved(Boolean removed);

        Boolean getIsPropertyIsInvoicedRemoved();

        void setIsPropertyIsInvoicedRemoved(Boolean removed);

        Boolean getIsPropertyAttributeSetInstanceIdRemoved();

        void setIsPropertyAttributeSetInstanceIdRemoved(Boolean removed);

        Boolean getIsPropertyIsDescriptionRemoved();

        void setIsPropertyIsDescriptionRemoved(Boolean removed);

        Boolean getIsPropertyProcessedRemoved();

        void setIsPropertyProcessedRemoved(Boolean removed);

        Boolean getIsPropertyQuantityEnteredRemoved();

        void setIsPropertyQuantityEnteredRemoved(Boolean removed);

        Boolean getIsPropertyRmaLineNumberRemoved();

        void setIsPropertyRmaLineNumberRemoved(Boolean removed);

        Boolean getIsPropertyReversalLineNumberRemoved();

        void setIsPropertyReversalLineNumberRemoved(Boolean removed);

        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);

    }

	interface RemoveInOutLine extends InOutLineCommand
	{
	}

}

