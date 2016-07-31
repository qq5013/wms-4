package org.dddml.wms.domain;

import java.util.*;
import java.math.BigDecimal;
import java.util.Date;
import org.joda.money.Money;

public abstract class AbstractInOutLineMvoStateCommandConverter<TCreateInOutLineMvo extends InOutLineMvoCommand.CreateInOutLineMvo, TMergePatchInOutLineMvo extends InOutLineMvoCommand.MergePatchInOutLineMvo, TDeleteInOutLineMvo extends InOutLineMvoCommand.DeleteInOutLineMvo>
{
    public InOutLineMvoCommand toCreateOrMergePatchInOutLineMvo(InOutLineMvoState state)
    {
        //where TCreateInOutLineMvo : ICreateInOutLineMvo, new()
        //where TMergePatchInOutLineMvo : IMergePatchInOutLineMvo, new()
        boolean bUnsaved = state.isStateUnsaved();
        if (bUnsaved)
        {
            return toCreateInOutLineMvo(state);
        }
        else 
        {
            return toMergePatchInOutLineMvo(state);
        }
    }

    public TDeleteInOutLineMvo toDeleteInOutLineMvo(InOutLineMvoState state) //where TDeleteInOutLineMvo : IDeleteInOutLineMvo, new()
    {
        TDeleteInOutLineMvo cmd = newDeleteInOutLineMvo();
        cmd.setInOutLineId(state.getInOutLineId());
        cmd.setInOutVersion(state.getInOutVersion());

        return cmd;
    }

    public TMergePatchInOutLineMvo toMergePatchInOutLineMvo(InOutLineMvoState state) //where TMergePatchInOutLineMvo : IMergePatchInOutLineMvo, new()
    {
        TMergePatchInOutLineMvo cmd = newMergePatchInOutLineMvo();

        cmd.setInOutVersion(state.getInOutVersion());

        cmd.setInOutLineId(state.getInOutLineId());
        cmd.setLineNumber(state.getLineNumber());
        cmd.setDescription(state.getDescription());
        cmd.setLocatorId(state.getLocatorId());
        cmd.setProduct(state.getProduct());
        cmd.setUomId(state.getUomId());
        cmd.setMovementQuantity(state.getMovementQuantity());
        cmd.setConfirmedQuantity(state.getConfirmedQuantity());
        cmd.setScrappedQuantity(state.getScrappedQuantity());
        cmd.setTargetQuantity(state.getTargetQuantity());
        cmd.setPickedQuantity(state.getPickedQuantity());
        cmd.setIsInvoiced(state.getIsInvoiced());
        cmd.setAttributeSetInstanceId(state.getAttributeSetInstanceId());
        cmd.setIsDescription(state.getIsDescription());
        cmd.setProcessed(state.getProcessed());
        cmd.setQuantityEntered(state.getQuantityEntered());
        cmd.setRmaLineNumber(state.getRmaLineNumber());
        cmd.setReversalLineNumber(state.getReversalLineNumber());
        cmd.setVersion(state.getVersion());
        cmd.setActive(state.getActive());
        cmd.setInOutIsSOTransaction(state.getInOutIsSOTransaction());
        cmd.setInOutPosted(state.getInOutPosted());
        cmd.setInOutProcessing(state.getInOutProcessing());
        cmd.setInOutProcessed(state.getInOutProcessed());
        cmd.setInOutDocumentType(state.getInOutDocumentType());
        cmd.setInOutDescription(state.getInOutDescription());
        cmd.setInOutOrderNumber(state.getInOutOrderNumber());
        cmd.setInOutDateOrdered(state.getInOutDateOrdered());
        cmd.setInOutIsPrinted(state.getInOutIsPrinted());
        cmd.setInOutMovementType(state.getInOutMovementType());
        cmd.setInOutMovementDate(state.getInOutMovementDate());
        cmd.setInOutBusinessPartnerId(state.getInOutBusinessPartnerId());
        cmd.setInOutWarehouseId(state.getInOutWarehouseId());
        cmd.setInOutPOReference(state.getInOutPOReference());
        cmd.setInOutFreightAmount(state.getInOutFreightAmount());
        cmd.setInOutShipperId(state.getInOutShipperId());
        cmd.setInOutChargeAmount(state.getInOutChargeAmount());
        cmd.setInOutDatePrinted(state.getInOutDatePrinted());
        cmd.setInOutSalesRepresentative(state.getInOutSalesRepresentative());
        cmd.setInOutNumberOfPackages(state.getInOutNumberOfPackages());
        cmd.setInOutPickDate(state.getInOutPickDate());
        cmd.setInOutShipDate(state.getInOutShipDate());
        cmd.setInOutTrackingNumber(state.getInOutTrackingNumber());
        cmd.setInOutDateReceived(state.getInOutDateReceived());
        cmd.setInOutIsInTransit(state.getInOutIsInTransit());
        cmd.setInOutIsApproved(state.getInOutIsApproved());
        cmd.setInOutIsInDispute(state.getInOutIsInDispute());
        cmd.setInOutVolume(state.getInOutVolume());
        cmd.setInOutWeight(state.getInOutWeight());
        cmd.setInOutRmaNumber(state.getInOutRmaNumber());
        cmd.setInOutReversalNumber(state.getInOutReversalNumber());
        cmd.setInOutIsDropShip(state.getInOutIsDropShip());
        cmd.setInOutDropShipBusinessPartnerId(state.getInOutDropShipBusinessPartnerId());
        cmd.setInOutCreatedBy(state.getInOutCreatedBy());
        cmd.setInOutCreatedAt(state.getInOutCreatedAt());
        cmd.setInOutUpdatedBy(state.getInOutUpdatedBy());
        cmd.setInOutUpdatedAt(state.getInOutUpdatedAt());
        cmd.setInOutActive(state.getInOutActive());
        cmd.setInOutDeleted(state.getInOutDeleted());
            
        if (state.getLineNumber() == null) { cmd.setIsPropertyLineNumberRemoved(true); }
        if (state.getDescription() == null) { cmd.setIsPropertyDescriptionRemoved(true); }
        if (state.getLocatorId() == null) { cmd.setIsPropertyLocatorIdRemoved(true); }
        if (state.getProduct() == null) { cmd.setIsPropertyProductRemoved(true); }
        if (state.getUomId() == null) { cmd.setIsPropertyUomIdRemoved(true); }
        if (state.getMovementQuantity() == null) { cmd.setIsPropertyMovementQuantityRemoved(true); }
        if (state.getConfirmedQuantity() == null) { cmd.setIsPropertyConfirmedQuantityRemoved(true); }
        if (state.getScrappedQuantity() == null) { cmd.setIsPropertyScrappedQuantityRemoved(true); }
        if (state.getTargetQuantity() == null) { cmd.setIsPropertyTargetQuantityRemoved(true); }
        if (state.getPickedQuantity() == null) { cmd.setIsPropertyPickedQuantityRemoved(true); }
        if (state.getIsInvoiced() == null) { cmd.setIsPropertyIsInvoicedRemoved(true); }
        if (state.getAttributeSetInstanceId() == null) { cmd.setIsPropertyAttributeSetInstanceIdRemoved(true); }
        if (state.getIsDescription() == null) { cmd.setIsPropertyIsDescriptionRemoved(true); }
        if (state.getProcessed() == null) { cmd.setIsPropertyProcessedRemoved(true); }
        if (state.getQuantityEntered() == null) { cmd.setIsPropertyQuantityEnteredRemoved(true); }
        if (state.getRmaLineNumber() == null) { cmd.setIsPropertyRmaLineNumberRemoved(true); }
        if (state.getReversalLineNumber() == null) { cmd.setIsPropertyReversalLineNumberRemoved(true); }
        if (state.getVersion() == null) { cmd.setIsPropertyVersionRemoved(true); }
        if (state.getActive() == null) { cmd.setIsPropertyActiveRemoved(true); }
        if (state.getInOutIsSOTransaction() == null) { cmd.setIsPropertyInOutIsSOTransactionRemoved(true); }
        if (state.getInOutPosted() == null) { cmd.setIsPropertyInOutPostedRemoved(true); }
        if (state.getInOutProcessing() == null) { cmd.setIsPropertyInOutProcessingRemoved(true); }
        if (state.getInOutProcessed() == null) { cmd.setIsPropertyInOutProcessedRemoved(true); }
        if (state.getInOutDocumentType() == null) { cmd.setIsPropertyInOutDocumentTypeRemoved(true); }
        if (state.getInOutDescription() == null) { cmd.setIsPropertyInOutDescriptionRemoved(true); }
        if (state.getInOutOrderNumber() == null) { cmd.setIsPropertyInOutOrderNumberRemoved(true); }
        if (state.getInOutDateOrdered() == null) { cmd.setIsPropertyInOutDateOrderedRemoved(true); }
        if (state.getInOutIsPrinted() == null) { cmd.setIsPropertyInOutIsPrintedRemoved(true); }
        if (state.getInOutMovementType() == null) { cmd.setIsPropertyInOutMovementTypeRemoved(true); }
        if (state.getInOutMovementDate() == null) { cmd.setIsPropertyInOutMovementDateRemoved(true); }
        if (state.getInOutBusinessPartnerId() == null) { cmd.setIsPropertyInOutBusinessPartnerIdRemoved(true); }
        if (state.getInOutWarehouseId() == null) { cmd.setIsPropertyInOutWarehouseIdRemoved(true); }
        if (state.getInOutPOReference() == null) { cmd.setIsPropertyInOutPOReferenceRemoved(true); }
        if (state.getInOutFreightAmount() == null) { cmd.setIsPropertyInOutFreightAmountRemoved(true); }
        if (state.getInOutShipperId() == null) { cmd.setIsPropertyInOutShipperIdRemoved(true); }
        if (state.getInOutChargeAmount() == null) { cmd.setIsPropertyInOutChargeAmountRemoved(true); }
        if (state.getInOutDatePrinted() == null) { cmd.setIsPropertyInOutDatePrintedRemoved(true); }
        if (state.getInOutSalesRepresentative() == null) { cmd.setIsPropertyInOutSalesRepresentativeRemoved(true); }
        if (state.getInOutNumberOfPackages() == null) { cmd.setIsPropertyInOutNumberOfPackagesRemoved(true); }
        if (state.getInOutPickDate() == null) { cmd.setIsPropertyInOutPickDateRemoved(true); }
        if (state.getInOutShipDate() == null) { cmd.setIsPropertyInOutShipDateRemoved(true); }
        if (state.getInOutTrackingNumber() == null) { cmd.setIsPropertyInOutTrackingNumberRemoved(true); }
        if (state.getInOutDateReceived() == null) { cmd.setIsPropertyInOutDateReceivedRemoved(true); }
        if (state.getInOutIsInTransit() == null) { cmd.setIsPropertyInOutIsInTransitRemoved(true); }
        if (state.getInOutIsApproved() == null) { cmd.setIsPropertyInOutIsApprovedRemoved(true); }
        if (state.getInOutIsInDispute() == null) { cmd.setIsPropertyInOutIsInDisputeRemoved(true); }
        if (state.getInOutVolume() == null) { cmd.setIsPropertyInOutVolumeRemoved(true); }
        if (state.getInOutWeight() == null) { cmd.setIsPropertyInOutWeightRemoved(true); }
        if (state.getInOutRmaNumber() == null) { cmd.setIsPropertyInOutRmaNumberRemoved(true); }
        if (state.getInOutReversalNumber() == null) { cmd.setIsPropertyInOutReversalNumberRemoved(true); }
        if (state.getInOutIsDropShip() == null) { cmd.setIsPropertyInOutIsDropShipRemoved(true); }
        if (state.getInOutDropShipBusinessPartnerId() == null) { cmd.setIsPropertyInOutDropShipBusinessPartnerIdRemoved(true); }
        if (state.getInOutCreatedBy() == null) { cmd.setIsPropertyInOutCreatedByRemoved(true); }
        if (state.getInOutCreatedAt() == null) { cmd.setIsPropertyInOutCreatedAtRemoved(true); }
        if (state.getInOutUpdatedBy() == null) { cmd.setIsPropertyInOutUpdatedByRemoved(true); }
        if (state.getInOutUpdatedAt() == null) { cmd.setIsPropertyInOutUpdatedAtRemoved(true); }
        if (state.getInOutActive() == null) { cmd.setIsPropertyInOutActiveRemoved(true); }
        if (state.getInOutDeleted() == null) { cmd.setIsPropertyInOutDeletedRemoved(true); }
        return cmd;
    }

    public TCreateInOutLineMvo toCreateInOutLineMvo(InOutLineMvoState state) //where TCreateInOutLineMvo : ICreateInOutLineMvo, new()
    {
        TCreateInOutLineMvo cmd = newCreateInOutLineMvo();

        cmd.setInOutVersion(state.getInOutVersion());
        cmd.setInOutLineId(state.getInOutLineId());
        cmd.setLineNumber(state.getLineNumber());
        cmd.setDescription(state.getDescription());
        cmd.setLocatorId(state.getLocatorId());
        cmd.setProduct(state.getProduct());
        cmd.setUomId(state.getUomId());
        cmd.setMovementQuantity(state.getMovementQuantity());
        cmd.setConfirmedQuantity(state.getConfirmedQuantity());
        cmd.setScrappedQuantity(state.getScrappedQuantity());
        cmd.setTargetQuantity(state.getTargetQuantity());
        cmd.setPickedQuantity(state.getPickedQuantity());
        cmd.setIsInvoiced(state.getIsInvoiced());
        cmd.setAttributeSetInstanceId(state.getAttributeSetInstanceId());
        cmd.setIsDescription(state.getIsDescription());
        cmd.setProcessed(state.getProcessed());
        cmd.setQuantityEntered(state.getQuantityEntered());
        cmd.setRmaLineNumber(state.getRmaLineNumber());
        cmd.setReversalLineNumber(state.getReversalLineNumber());
        cmd.setVersion(state.getVersion());
        cmd.setActive(state.getActive());
        cmd.setInOutIsSOTransaction(state.getInOutIsSOTransaction());
        cmd.setInOutPosted(state.getInOutPosted());
        cmd.setInOutProcessing(state.getInOutProcessing());
        cmd.setInOutProcessed(state.getInOutProcessed());
        cmd.setInOutDocumentType(state.getInOutDocumentType());
        cmd.setInOutDescription(state.getInOutDescription());
        cmd.setInOutOrderNumber(state.getInOutOrderNumber());
        cmd.setInOutDateOrdered(state.getInOutDateOrdered());
        cmd.setInOutIsPrinted(state.getInOutIsPrinted());
        cmd.setInOutMovementType(state.getInOutMovementType());
        cmd.setInOutMovementDate(state.getInOutMovementDate());
        cmd.setInOutBusinessPartnerId(state.getInOutBusinessPartnerId());
        cmd.setInOutWarehouseId(state.getInOutWarehouseId());
        cmd.setInOutPOReference(state.getInOutPOReference());
        cmd.setInOutFreightAmount(state.getInOutFreightAmount());
        cmd.setInOutShipperId(state.getInOutShipperId());
        cmd.setInOutChargeAmount(state.getInOutChargeAmount());
        cmd.setInOutDatePrinted(state.getInOutDatePrinted());
        cmd.setInOutSalesRepresentative(state.getInOutSalesRepresentative());
        cmd.setInOutNumberOfPackages(state.getInOutNumberOfPackages());
        cmd.setInOutPickDate(state.getInOutPickDate());
        cmd.setInOutShipDate(state.getInOutShipDate());
        cmd.setInOutTrackingNumber(state.getInOutTrackingNumber());
        cmd.setInOutDateReceived(state.getInOutDateReceived());
        cmd.setInOutIsInTransit(state.getInOutIsInTransit());
        cmd.setInOutIsApproved(state.getInOutIsApproved());
        cmd.setInOutIsInDispute(state.getInOutIsInDispute());
        cmd.setInOutVolume(state.getInOutVolume());
        cmd.setInOutWeight(state.getInOutWeight());
        cmd.setInOutRmaNumber(state.getInOutRmaNumber());
        cmd.setInOutReversalNumber(state.getInOutReversalNumber());
        cmd.setInOutIsDropShip(state.getInOutIsDropShip());
        cmd.setInOutDropShipBusinessPartnerId(state.getInOutDropShipBusinessPartnerId());
        cmd.setInOutCreatedBy(state.getInOutCreatedBy());
        cmd.setInOutCreatedAt(state.getInOutCreatedAt());
        cmd.setInOutUpdatedBy(state.getInOutUpdatedBy());
        cmd.setInOutUpdatedAt(state.getInOutUpdatedAt());
        cmd.setInOutActive(state.getInOutActive());
        cmd.setInOutDeleted(state.getInOutDeleted());
        return cmd;
    }

    protected abstract TCreateInOutLineMvo newCreateInOutLineMvo();

    protected abstract TMergePatchInOutLineMvo newMergePatchInOutLineMvo(); 

    protected abstract TDeleteInOutLineMvo newDeleteInOutLineMvo();

    public static class SimpleInOutLineMvoStateCommandConverter extends AbstractInOutLineMvoStateCommandConverter<AbstractInOutLineMvoCommand.SimpleCreateInOutLineMvo, AbstractInOutLineMvoCommand.SimpleMergePatchInOutLineMvo, AbstractInOutLineMvoCommand.SimpleDeleteInOutLineMvo>
    {
        @Override
        protected AbstractInOutLineMvoCommand.SimpleCreateInOutLineMvo newCreateInOutLineMvo() {
            return new AbstractInOutLineMvoCommand.SimpleCreateInOutLineMvo();
        }

        @Override
        protected AbstractInOutLineMvoCommand.SimpleMergePatchInOutLineMvo newMergePatchInOutLineMvo() {
            return new AbstractInOutLineMvoCommand.SimpleMergePatchInOutLineMvo();
        }

        @Override
        protected AbstractInOutLineMvoCommand.SimpleDeleteInOutLineMvo newDeleteInOutLineMvo() {
            return new AbstractInOutLineMvoCommand.SimpleDeleteInOutLineMvo();
        }


    }

}

