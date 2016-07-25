package org.dddml.wms.domain;

import java.math.BigDecimal;
import java.util.Date;
import org.dddml.wms.domain.Command;

public interface InOutLineCommand extends Command
{
    SkuId getSkuId();

    String getInOutDocumentNumber();


    interface CreateOrMergePatchInOutLine extends InOutLineCommand
    {
        Long getLineNumber();

        String getDescription();

        String getLocatorId();

        String getProduct();

        String getUomId();

        BigDecimal getMovementQuantity();

        BigDecimal getConfirmedQuantity();

        BigDecimal getScrappedQuantity();

        BigDecimal getTargetQuantity();

        BigDecimal getPickedQuantity();

        Boolean getIsInvoiced();

        String getAttributeSetInstanceId();

        Boolean getIsDescription();

        Boolean getProcessed();

        BigDecimal getQuantityEntered();

        Long getRmaLineNumber();

        Long getReversalLineNumber();

        Boolean getActive();

    }

    interface CreateInOutLine extends CreateOrMergePatchInOutLine
    {
    }

    interface MergePatchInOutLine extends CreateOrMergePatchInOutLine
    {
        Boolean getIsPropertyLineNumberRemoved();

        Boolean getIsPropertyDescriptionRemoved();

        Boolean getIsPropertyLocatorIdRemoved();

        Boolean getIsPropertyProductRemoved();

        Boolean getIsPropertyUomIdRemoved();

        Boolean getIsPropertyMovementQuantityRemoved();

        Boolean getIsPropertyConfirmedQuantityRemoved();

        Boolean getIsPropertyScrappedQuantityRemoved();

        Boolean getIsPropertyTargetQuantityRemoved();

        Boolean getIsPropertyPickedQuantityRemoved();

        Boolean getIsPropertyIsInvoicedRemoved();

        Boolean getIsPropertyAttributeSetInstanceIdRemoved();

        Boolean getIsPropertyIsDescriptionRemoved();

        Boolean getIsPropertyProcessedRemoved();

        Boolean getIsPropertyQuantityEnteredRemoved();

        Boolean getIsPropertyRmaLineNumberRemoved();

        Boolean getIsPropertyReversalLineNumberRemoved();

        Boolean getIsPropertyActiveRemoved();

    }

	interface RemoveInOutLine extends InOutLineCommand
	{
	}

}

