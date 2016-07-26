package org.dddml.wms.domain;

import org.joda.money.Money;
import java.math.BigDecimal;
import java.util.Date;
import org.dddml.wms.domain.Command;

public interface InOutCommand extends Command
{
    String getDocumentNumber();

    Long getVersion();


    interface CreateOrMergePatchInOut extends InOutCommand
    {
        Boolean getIsSOTransaction();

        DocumentAction getDocumentAction();

        Boolean getPosted();

        Boolean getProcessing();

        Boolean getProcessed();

        Integer getDocumentType();

        String getDescription();

        String getOrderNumber();

        Date getDateOrdered();

        Boolean getIsPrinted();

        String getMovementType();

        Date getMovementDate();

        String getBusinessPartnerId();

        String getWarehouseId();

        String getPOReference();

        Money getFreightAmount();

        String getShipperId();

        Money getChargeAmount();

        Date getDatePrinted();

        String getSalesRepresentative();

        Integer getNumberOfPackages();

        Date getPickDate();

        Date getShipDate();

        String getTrackingNumber();

        Date getDateReceived();

        Boolean getIsInTransit();

        Boolean getIsApproved();

        Boolean getIsInDispute();

        BigDecimal getVolume();

        BigDecimal getWeight();

        String getRmaNumber();

        String getReversalNumber();

        Boolean getIsDropShip();

        String getDropShipBusinessPartnerId();

        Boolean getActive();

    }

    interface CreateInOut extends CreateOrMergePatchInOut
    {
        CreateInOutLineCommands getInOutLines();

        InOutLineCommand.CreateInOutLine newCreateInOutLine();

    }

    interface MergePatchInOut extends CreateOrMergePatchInOut
    {
        Boolean getIsPropertyIsSOTransactionRemoved();

        Boolean getIsPropertyPostedRemoved();

        Boolean getIsPropertyProcessingRemoved();

        Boolean getIsPropertyProcessedRemoved();

        Boolean getIsPropertyDocumentTypeRemoved();

        Boolean getIsPropertyDescriptionRemoved();

        Boolean getIsPropertyOrderNumberRemoved();

        Boolean getIsPropertyDateOrderedRemoved();

        Boolean getIsPropertyIsPrintedRemoved();

        Boolean getIsPropertyMovementTypeRemoved();

        Boolean getIsPropertyMovementDateRemoved();

        Boolean getIsPropertyBusinessPartnerIdRemoved();

        Boolean getIsPropertyWarehouseIdRemoved();

        Boolean getIsPropertyPOReferenceRemoved();

        Boolean getIsPropertyFreightAmountRemoved();

        Boolean getIsPropertyShipperIdRemoved();

        Boolean getIsPropertyChargeAmountRemoved();

        Boolean getIsPropertyDatePrintedRemoved();

        Boolean getIsPropertySalesRepresentativeRemoved();

        Boolean getIsPropertyNumberOfPackagesRemoved();

        Boolean getIsPropertyPickDateRemoved();

        Boolean getIsPropertyShipDateRemoved();

        Boolean getIsPropertyTrackingNumberRemoved();

        Boolean getIsPropertyDateReceivedRemoved();

        Boolean getIsPropertyIsInTransitRemoved();

        Boolean getIsPropertyIsApprovedRemoved();

        Boolean getIsPropertyIsInDisputeRemoved();

        Boolean getIsPropertyVolumeRemoved();

        Boolean getIsPropertyWeightRemoved();

        Boolean getIsPropertyRmaNumberRemoved();

        Boolean getIsPropertyReversalNumberRemoved();

        Boolean getIsPropertyIsDropShipRemoved();

        Boolean getIsPropertyDropShipBusinessPartnerIdRemoved();

        Boolean getIsPropertyActiveRemoved();

        InOutLineCommands getInOutLineCommands();

        InOutLineCommand.CreateInOutLine newCreateInOutLine();

        InOutLineCommand.MergePatchInOutLine newMergePatchInOutLine();

        InOutLineCommand.RemoveInOutLine newRemoveInOutLine();

    }

	interface DeleteInOut extends InOutCommand
	{
	}

    interface CreateInOutLineCommands extends Iterable<InOutLineCommand.CreateInOutLine>
    {
        void add(InOutLineCommand.CreateInOutLine c);

        void remove(InOutLineCommand.CreateInOutLine c);

        void clear();
    }

    interface InOutLineCommands extends Iterable<InOutLineCommand>
    {
        void add(InOutLineCommand c);

        void remove(InOutLineCommand c);

        void clear();
    }

}

