package org.dddml.wms.domain;

import java.math.BigDecimal;
import java.util.Date;
import org.joda.money.Money;
import org.dddml.wms.domain.Command;

public interface InOutLineMvoCommand extends Command
{
    InOutLineId getInOutLineId();

    Long getInOutVersion();


    interface CreateOrMergePatchInOutLineMvo extends InOutLineMvoCommand
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

        Long getVersion();

        Boolean getActive();

        Boolean getInOutIsSOTransaction();

        DocumentAction getDocumentAction();

        Boolean getInOutPosted();

        Boolean getInOutProcessing();

        Boolean getInOutProcessed();

        Integer getInOutDocumentType();

        String getInOutDescription();

        String getInOutOrderNumber();

        Date getInOutDateOrdered();

        Boolean getInOutIsPrinted();

        String getInOutMovementType();

        Date getInOutMovementDate();

        String getInOutBusinessPartnerId();

        String getInOutWarehouseId();

        String getInOutPOReference();

        Money getInOutFreightAmount();

        String getInOutShipperId();

        Money getInOutChargeAmount();

        Date getInOutDatePrinted();

        String getInOutSalesRepresentative();

        Integer getInOutNumberOfPackages();

        Date getInOutPickDate();

        Date getInOutShipDate();

        String getInOutTrackingNumber();

        Date getInOutDateReceived();

        Boolean getInOutIsInTransit();

        Boolean getInOutIsApproved();

        Boolean getInOutIsInDispute();

        BigDecimal getInOutVolume();

        BigDecimal getInOutWeight();

        String getInOutRmaNumber();

        String getInOutReversalNumber();

        Boolean getInOutIsDropShip();

        String getInOutDropShipBusinessPartnerId();

        String getInOutCreatedBy();

        Date getInOutCreatedAt();

        String getInOutUpdatedBy();

        Date getInOutUpdatedAt();

        Boolean getInOutActive();

        Boolean getInOutDeleted();

    }

    interface CreateInOutLineMvo extends CreateOrMergePatchInOutLineMvo
    {
    }

    interface MergePatchInOutLineMvo extends CreateOrMergePatchInOutLineMvo
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

        Boolean getIsPropertyVersionRemoved();

        Boolean getIsPropertyActiveRemoved();

        Boolean getIsPropertyInOutIsSOTransactionRemoved();

        Boolean getIsPropertyInOutPostedRemoved();

        Boolean getIsPropertyInOutProcessingRemoved();

        Boolean getIsPropertyInOutProcessedRemoved();

        Boolean getIsPropertyInOutDocumentTypeRemoved();

        Boolean getIsPropertyInOutDescriptionRemoved();

        Boolean getIsPropertyInOutOrderNumberRemoved();

        Boolean getIsPropertyInOutDateOrderedRemoved();

        Boolean getIsPropertyInOutIsPrintedRemoved();

        Boolean getIsPropertyInOutMovementTypeRemoved();

        Boolean getIsPropertyInOutMovementDateRemoved();

        Boolean getIsPropertyInOutBusinessPartnerIdRemoved();

        Boolean getIsPropertyInOutWarehouseIdRemoved();

        Boolean getIsPropertyInOutPOReferenceRemoved();

        Boolean getIsPropertyInOutFreightAmountRemoved();

        Boolean getIsPropertyInOutShipperIdRemoved();

        Boolean getIsPropertyInOutChargeAmountRemoved();

        Boolean getIsPropertyInOutDatePrintedRemoved();

        Boolean getIsPropertyInOutSalesRepresentativeRemoved();

        Boolean getIsPropertyInOutNumberOfPackagesRemoved();

        Boolean getIsPropertyInOutPickDateRemoved();

        Boolean getIsPropertyInOutShipDateRemoved();

        Boolean getIsPropertyInOutTrackingNumberRemoved();

        Boolean getIsPropertyInOutDateReceivedRemoved();

        Boolean getIsPropertyInOutIsInTransitRemoved();

        Boolean getIsPropertyInOutIsApprovedRemoved();

        Boolean getIsPropertyInOutIsInDisputeRemoved();

        Boolean getIsPropertyInOutVolumeRemoved();

        Boolean getIsPropertyInOutWeightRemoved();

        Boolean getIsPropertyInOutRmaNumberRemoved();

        Boolean getIsPropertyInOutReversalNumberRemoved();

        Boolean getIsPropertyInOutIsDropShipRemoved();

        Boolean getIsPropertyInOutDropShipBusinessPartnerIdRemoved();

        Boolean getIsPropertyInOutCreatedByRemoved();

        Boolean getIsPropertyInOutCreatedAtRemoved();

        Boolean getIsPropertyInOutUpdatedByRemoved();

        Boolean getIsPropertyInOutUpdatedAtRemoved();

        Boolean getIsPropertyInOutActiveRemoved();

        Boolean getIsPropertyInOutDeletedRemoved();

    }

	interface DeleteInOutLineMvo extends InOutLineMvoCommand
	{
	}

}

