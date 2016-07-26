package org.dddml.wms.domain;

import java.util.*;
import java.math.BigDecimal;
import java.util.Date;
import org.joda.money.Money;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractInOutLineMvoAggregate extends AbstractAggregate implements InOutLineMvoAggregate
{
    private InOutLineMvoState state;

    private List<Event> changes = new ArrayList<Event>();

    public AbstractInOutLineMvoAggregate(InOutLineMvoState state)
    {
        this.state = state;
    }

    public InOutLineMvoState getState() {
        return this.state;
    }

    public List<Event> getChanges() {
        return this.changes;
    }

    public void create(InOutLineMvoCommand.CreateInOutLineMvo c)
    {
        InOutLineMvoStateEvent.InOutLineMvoStateCreated e = map(c);
        apply(e);
    }

    public void mergePatch(InOutLineMvoCommand.MergePatchInOutLineMvo c)
    {
        InOutLineMvoStateEvent.InOutLineMvoStateMergePatched e = map(c);
        apply(e);
    }

    public void delete(InOutLineMvoCommand.DeleteInOutLineMvo c)
    {
        InOutLineMvoStateEvent.InOutLineMvoStateDeleted e = map(c);
        apply(e);
    }

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getInOutVersion() == null || this.state.getInOutVersion().equals(InOutLineMvoState.VERSION_ZERO))
        {
            if (isCommandCreate((InOutLineMvoCommand)c))
            {
                return;
            }
            throw DomainError.named("premature", "Can't do anything to unexistent aggregate");
        }
        if (this.state.getDeleted())
        {
            throw DomainError.named("zombie", "Can't do anything to deleted aggregate.");
        }
        if (isCommandCreate((InOutLineMvoCommand)c))
            throw DomainError.named("rebirth", "Can't create aggregate that already exists");
    }

    protected void apply(Event e)
    {
        onApplying(e);
        this.state.mutate(e);
        this.changes.add(e);
    }

    protected InOutLineMvoStateEvent.InOutLineMvoStateCreated map(InOutLineMvoCommand.CreateInOutLineMvo c)
    {
        InOutLineMvoStateEventId stateEventId = new InOutLineMvoStateEventId(c.getInOutLineId(), c.getInOutVersion());
        InOutLineMvoStateEvent.InOutLineMvoStateCreated e = newInOutLineMvoStateCreated(stateEventId);
        e.setLineNumber(c.getLineNumber());
        e.setDescription(c.getDescription());
        e.setLocatorId(c.getLocatorId());
        e.setProduct(c.getProduct());
        e.setUomId(c.getUomId());
        e.setMovementQuantity(c.getMovementQuantity());
        e.setConfirmedQuantity(c.getConfirmedQuantity());
        e.setScrappedQuantity(c.getScrappedQuantity());
        e.setTargetQuantity(c.getTargetQuantity());
        e.setPickedQuantity(c.getPickedQuantity());
        e.setIsInvoiced(c.getIsInvoiced());
        e.setAttributeSetInstanceId(c.getAttributeSetInstanceId());
        e.setIsDescription(c.getIsDescription());
        e.setProcessed(c.getProcessed());
        e.setQuantityEntered(c.getQuantityEntered());
        e.setRmaLineNumber(c.getRmaLineNumber());
        e.setReversalLineNumber(c.getReversalLineNumber());
        e.setVersion(c.getVersion());
        e.setActive(c.getActive());
        e.setInOutIsSOTransaction(c.getInOutIsSOTransaction());
        newInOutLineMvoDocumentActionCommandAndExecute(c, state, e);
        e.setInOutPosted(c.getInOutPosted());
        e.setInOutProcessing(c.getInOutProcessing());
        e.setInOutProcessed(c.getInOutProcessed());
        e.setInOutDocumentType(c.getInOutDocumentType());
        e.setInOutDescription(c.getInOutDescription());
        e.setInOutOrderNumber(c.getInOutOrderNumber());
        e.setInOutDateOrdered(c.getInOutDateOrdered());
        e.setInOutIsPrinted(c.getInOutIsPrinted());
        e.setInOutMovementType(c.getInOutMovementType());
        e.setInOutMovementDate(c.getInOutMovementDate());
        e.setInOutBusinessPartnerId(c.getInOutBusinessPartnerId());
        e.setInOutWarehouseId(c.getInOutWarehouseId());
        e.setInOutPOReference(c.getInOutPOReference());
        e.setInOutFreightAmount(c.getInOutFreightAmount());
        e.setInOutShipperId(c.getInOutShipperId());
        e.setInOutChargeAmount(c.getInOutChargeAmount());
        e.setInOutDatePrinted(c.getInOutDatePrinted());
        e.setInOutSalesRepresentative(c.getInOutSalesRepresentative());
        e.setInOutNumberOfPackages(c.getInOutNumberOfPackages());
        e.setInOutPickDate(c.getInOutPickDate());
        e.setInOutShipDate(c.getInOutShipDate());
        e.setInOutTrackingNumber(c.getInOutTrackingNumber());
        e.setInOutDateReceived(c.getInOutDateReceived());
        e.setInOutIsInTransit(c.getInOutIsInTransit());
        e.setInOutIsApproved(c.getInOutIsApproved());
        e.setInOutIsInDispute(c.getInOutIsInDispute());
        e.setInOutVolume(c.getInOutVolume());
        e.setInOutWeight(c.getInOutWeight());
        e.setInOutRmaNumber(c.getInOutRmaNumber());
        e.setInOutReversalNumber(c.getInOutReversalNumber());
        e.setInOutIsDropShip(c.getInOutIsDropShip());
        e.setInOutDropShipBusinessPartnerId(c.getInOutDropShipBusinessPartnerId());
        e.setInOutCreatedBy(c.getInOutCreatedBy());
        e.setInOutCreatedAt(c.getInOutCreatedAt());
        e.setInOutUpdatedBy(c.getInOutUpdatedBy());
        e.setInOutUpdatedAt(c.getInOutUpdatedAt());
        e.setInOutActive(c.getInOutActive());
        e.setInOutDeleted(c.getInOutDeleted());
        ((AbstractInOutLineMvoStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long inOutVersion = c.getInOutVersion();
        return e;
    }

    protected InOutLineMvoStateEvent.InOutLineMvoStateMergePatched map(InOutLineMvoCommand.MergePatchInOutLineMvo c)
    {
        InOutLineMvoStateEventId stateEventId = new InOutLineMvoStateEventId(c.getInOutLineId(), c.getInOutVersion());
        InOutLineMvoStateEvent.InOutLineMvoStateMergePatched e = newInOutLineMvoStateMergePatched(stateEventId);
        e.setLineNumber(c.getLineNumber());
        e.setDescription(c.getDescription());
        e.setLocatorId(c.getLocatorId());
        e.setProduct(c.getProduct());
        e.setUomId(c.getUomId());
        e.setMovementQuantity(c.getMovementQuantity());
        e.setConfirmedQuantity(c.getConfirmedQuantity());
        e.setScrappedQuantity(c.getScrappedQuantity());
        e.setTargetQuantity(c.getTargetQuantity());
        e.setPickedQuantity(c.getPickedQuantity());
        e.setIsInvoiced(c.getIsInvoiced());
        e.setAttributeSetInstanceId(c.getAttributeSetInstanceId());
        e.setIsDescription(c.getIsDescription());
        e.setProcessed(c.getProcessed());
        e.setQuantityEntered(c.getQuantityEntered());
        e.setRmaLineNumber(c.getRmaLineNumber());
        e.setReversalLineNumber(c.getReversalLineNumber());
        e.setVersion(c.getVersion());
        e.setActive(c.getActive());
        e.setInOutIsSOTransaction(c.getInOutIsSOTransaction());
        newInOutLineMvoDocumentActionCommandAndExecute(c, state, e);
        e.setInOutPosted(c.getInOutPosted());
        e.setInOutProcessing(c.getInOutProcessing());
        e.setInOutProcessed(c.getInOutProcessed());
        e.setInOutDocumentType(c.getInOutDocumentType());
        e.setInOutDescription(c.getInOutDescription());
        e.setInOutOrderNumber(c.getInOutOrderNumber());
        e.setInOutDateOrdered(c.getInOutDateOrdered());
        e.setInOutIsPrinted(c.getInOutIsPrinted());
        e.setInOutMovementType(c.getInOutMovementType());
        e.setInOutMovementDate(c.getInOutMovementDate());
        e.setInOutBusinessPartnerId(c.getInOutBusinessPartnerId());
        e.setInOutWarehouseId(c.getInOutWarehouseId());
        e.setInOutPOReference(c.getInOutPOReference());
        e.setInOutFreightAmount(c.getInOutFreightAmount());
        e.setInOutShipperId(c.getInOutShipperId());
        e.setInOutChargeAmount(c.getInOutChargeAmount());
        e.setInOutDatePrinted(c.getInOutDatePrinted());
        e.setInOutSalesRepresentative(c.getInOutSalesRepresentative());
        e.setInOutNumberOfPackages(c.getInOutNumberOfPackages());
        e.setInOutPickDate(c.getInOutPickDate());
        e.setInOutShipDate(c.getInOutShipDate());
        e.setInOutTrackingNumber(c.getInOutTrackingNumber());
        e.setInOutDateReceived(c.getInOutDateReceived());
        e.setInOutIsInTransit(c.getInOutIsInTransit());
        e.setInOutIsApproved(c.getInOutIsApproved());
        e.setInOutIsInDispute(c.getInOutIsInDispute());
        e.setInOutVolume(c.getInOutVolume());
        e.setInOutWeight(c.getInOutWeight());
        e.setInOutRmaNumber(c.getInOutRmaNumber());
        e.setInOutReversalNumber(c.getInOutReversalNumber());
        e.setInOutIsDropShip(c.getInOutIsDropShip());
        e.setInOutDropShipBusinessPartnerId(c.getInOutDropShipBusinessPartnerId());
        e.setInOutCreatedBy(c.getInOutCreatedBy());
        e.setInOutCreatedAt(c.getInOutCreatedAt());
        e.setInOutUpdatedBy(c.getInOutUpdatedBy());
        e.setInOutUpdatedAt(c.getInOutUpdatedAt());
        e.setInOutActive(c.getInOutActive());
        e.setInOutDeleted(c.getInOutDeleted());
        e.setIsPropertyLineNumberRemoved(c.getIsPropertyLineNumberRemoved());
        e.setIsPropertyDescriptionRemoved(c.getIsPropertyDescriptionRemoved());
        e.setIsPropertyLocatorIdRemoved(c.getIsPropertyLocatorIdRemoved());
        e.setIsPropertyProductRemoved(c.getIsPropertyProductRemoved());
        e.setIsPropertyUomIdRemoved(c.getIsPropertyUomIdRemoved());
        e.setIsPropertyMovementQuantityRemoved(c.getIsPropertyMovementQuantityRemoved());
        e.setIsPropertyConfirmedQuantityRemoved(c.getIsPropertyConfirmedQuantityRemoved());
        e.setIsPropertyScrappedQuantityRemoved(c.getIsPropertyScrappedQuantityRemoved());
        e.setIsPropertyTargetQuantityRemoved(c.getIsPropertyTargetQuantityRemoved());
        e.setIsPropertyPickedQuantityRemoved(c.getIsPropertyPickedQuantityRemoved());
        e.setIsPropertyIsInvoicedRemoved(c.getIsPropertyIsInvoicedRemoved());
        e.setIsPropertyAttributeSetInstanceIdRemoved(c.getIsPropertyAttributeSetInstanceIdRemoved());
        e.setIsPropertyIsDescriptionRemoved(c.getIsPropertyIsDescriptionRemoved());
        e.setIsPropertyProcessedRemoved(c.getIsPropertyProcessedRemoved());
        e.setIsPropertyQuantityEnteredRemoved(c.getIsPropertyQuantityEnteredRemoved());
        e.setIsPropertyRmaLineNumberRemoved(c.getIsPropertyRmaLineNumberRemoved());
        e.setIsPropertyReversalLineNumberRemoved(c.getIsPropertyReversalLineNumberRemoved());
        e.setIsPropertyVersionRemoved(c.getIsPropertyVersionRemoved());
        e.setIsPropertyActiveRemoved(c.getIsPropertyActiveRemoved());
        e.setIsPropertyInOutIsSOTransactionRemoved(c.getIsPropertyInOutIsSOTransactionRemoved());
        e.setIsPropertyInOutPostedRemoved(c.getIsPropertyInOutPostedRemoved());
        e.setIsPropertyInOutProcessingRemoved(c.getIsPropertyInOutProcessingRemoved());
        e.setIsPropertyInOutProcessedRemoved(c.getIsPropertyInOutProcessedRemoved());
        e.setIsPropertyInOutDocumentTypeRemoved(c.getIsPropertyInOutDocumentTypeRemoved());
        e.setIsPropertyInOutDescriptionRemoved(c.getIsPropertyInOutDescriptionRemoved());
        e.setIsPropertyInOutOrderNumberRemoved(c.getIsPropertyInOutOrderNumberRemoved());
        e.setIsPropertyInOutDateOrderedRemoved(c.getIsPropertyInOutDateOrderedRemoved());
        e.setIsPropertyInOutIsPrintedRemoved(c.getIsPropertyInOutIsPrintedRemoved());
        e.setIsPropertyInOutMovementTypeRemoved(c.getIsPropertyInOutMovementTypeRemoved());
        e.setIsPropertyInOutMovementDateRemoved(c.getIsPropertyInOutMovementDateRemoved());
        e.setIsPropertyInOutBusinessPartnerIdRemoved(c.getIsPropertyInOutBusinessPartnerIdRemoved());
        e.setIsPropertyInOutWarehouseIdRemoved(c.getIsPropertyInOutWarehouseIdRemoved());
        e.setIsPropertyInOutPOReferenceRemoved(c.getIsPropertyInOutPOReferenceRemoved());
        e.setIsPropertyInOutFreightAmountRemoved(c.getIsPropertyInOutFreightAmountRemoved());
        e.setIsPropertyInOutShipperIdRemoved(c.getIsPropertyInOutShipperIdRemoved());
        e.setIsPropertyInOutChargeAmountRemoved(c.getIsPropertyInOutChargeAmountRemoved());
        e.setIsPropertyInOutDatePrintedRemoved(c.getIsPropertyInOutDatePrintedRemoved());
        e.setIsPropertyInOutSalesRepresentativeRemoved(c.getIsPropertyInOutSalesRepresentativeRemoved());
        e.setIsPropertyInOutNumberOfPackagesRemoved(c.getIsPropertyInOutNumberOfPackagesRemoved());
        e.setIsPropertyInOutPickDateRemoved(c.getIsPropertyInOutPickDateRemoved());
        e.setIsPropertyInOutShipDateRemoved(c.getIsPropertyInOutShipDateRemoved());
        e.setIsPropertyInOutTrackingNumberRemoved(c.getIsPropertyInOutTrackingNumberRemoved());
        e.setIsPropertyInOutDateReceivedRemoved(c.getIsPropertyInOutDateReceivedRemoved());
        e.setIsPropertyInOutIsInTransitRemoved(c.getIsPropertyInOutIsInTransitRemoved());
        e.setIsPropertyInOutIsApprovedRemoved(c.getIsPropertyInOutIsApprovedRemoved());
        e.setIsPropertyInOutIsInDisputeRemoved(c.getIsPropertyInOutIsInDisputeRemoved());
        e.setIsPropertyInOutVolumeRemoved(c.getIsPropertyInOutVolumeRemoved());
        e.setIsPropertyInOutWeightRemoved(c.getIsPropertyInOutWeightRemoved());
        e.setIsPropertyInOutRmaNumberRemoved(c.getIsPropertyInOutRmaNumberRemoved());
        e.setIsPropertyInOutReversalNumberRemoved(c.getIsPropertyInOutReversalNumberRemoved());
        e.setIsPropertyInOutIsDropShipRemoved(c.getIsPropertyInOutIsDropShipRemoved());
        e.setIsPropertyInOutDropShipBusinessPartnerIdRemoved(c.getIsPropertyInOutDropShipBusinessPartnerIdRemoved());
        e.setIsPropertyInOutCreatedByRemoved(c.getIsPropertyInOutCreatedByRemoved());
        e.setIsPropertyInOutCreatedAtRemoved(c.getIsPropertyInOutCreatedAtRemoved());
        e.setIsPropertyInOutUpdatedByRemoved(c.getIsPropertyInOutUpdatedByRemoved());
        e.setIsPropertyInOutUpdatedAtRemoved(c.getIsPropertyInOutUpdatedAtRemoved());
        e.setIsPropertyInOutActiveRemoved(c.getIsPropertyInOutActiveRemoved());
        e.setIsPropertyInOutDeletedRemoved(c.getIsPropertyInOutDeletedRemoved());
        ((AbstractInOutLineMvoStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long inOutVersion = c.getInOutVersion();
        return e;
    }

    protected InOutLineMvoStateEvent.InOutLineMvoStateDeleted map(InOutLineMvoCommand.DeleteInOutLineMvo c)
    {
        InOutLineMvoStateEventId stateEventId = new InOutLineMvoStateEventId(c.getInOutLineId(), c.getInOutVersion());
        InOutLineMvoStateEvent.InOutLineMvoStateDeleted e = newInOutLineMvoStateDeleted(stateEventId);
        ((AbstractInOutLineMvoStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;
    }

    protected void newInOutLineMvoDocumentActionCommandAndExecute(InOutLineMvoCommand.MergePatchInOutLineMvo c, InOutLineMvoState s, InOutLineMvoStateEvent.InOutLineMvoStateMergePatched e)
    {
        PropertyCommandHandler<DocumentAction, String> pCommandHandler = this.getInOutLineMvoDocumentActionCommandHandler();
        DocumentAction pCmdContent = c.getDocumentAction();
        PropertyCommand<DocumentAction, String> pCmd = new AbstractPropertyCommand.SimplePropertyCommand<DocumentAction, String>();
        pCmd.setContent(pCmdContent);
        pCmd.setStateGetter(() -> s.getInOutDocumentStatus());
        pCmd.setStateSetter(p -> e.setInOutDocumentStatus(p));
        pCmd.setOuterCommandType(CommandType.MERGE_PATCH);
        pCommandHandler.execute(pCmd);
    }

    protected void newInOutLineMvoDocumentActionCommandAndExecute(InOutLineMvoCommand.CreateInOutLineMvo c, InOutLineMvoState s, InOutLineMvoStateEvent.InOutLineMvoStateCreated e)
    {
        PropertyCommandHandler<DocumentAction, String> pCommandHandler = this.getInOutLineMvoDocumentActionCommandHandler();
        DocumentAction pCmdContent = c.getDocumentAction();
        PropertyCommand<DocumentAction, String> pCmd = new AbstractPropertyCommand.SimplePropertyCommand<DocumentAction, String>();
        pCmd.setContent(pCmdContent);
        pCmd.setStateGetter(() -> s.getInOutDocumentStatus());
        pCmd.setStateSetter(p -> e.setInOutDocumentStatus(p));
        pCmd.setOuterCommandType(CommandType.CREATE);
        pCommandHandler.execute(pCmd);
    }

    protected PropertyCommandHandler<DocumentAction, String> getInOutLineMvoDocumentActionCommandHandler()
    {
        return (PropertyCommandHandler<DocumentAction, String>)ApplicationContext.current.get("InOutLineMvoDocumentActionCommandHandler");
    }


    private static boolean isCommandCreate(InOutLineMvoCommand c)
    {
        return c.getInOutVersion() == null || c.getInOutVersion().equals(InOutLineMvoState.VERSION_ZERO);
    }


    ////////////////////////

    protected InOutLineMvoStateEvent.InOutLineMvoStateCreated newInOutLineMvoStateCreated(String commandId, String requesterId) {
        InOutLineMvoStateEventId stateEventId = new InOutLineMvoStateEventId(this.state.getInOutLineId(), this.state.getInOutVersion());
        InOutLineMvoStateEvent.InOutLineMvoStateCreated e = newInOutLineMvoStateCreated(stateEventId);
        ((AbstractInOutLineMvoStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected InOutLineMvoStateEvent.InOutLineMvoStateMergePatched newInOutLineMvoStateMergePatched(String commandId, String requesterId) {
        InOutLineMvoStateEventId stateEventId = new InOutLineMvoStateEventId(this.state.getInOutLineId(), this.state.getInOutVersion());
        InOutLineMvoStateEvent.InOutLineMvoStateMergePatched e = newInOutLineMvoStateMergePatched(stateEventId);
        ((AbstractInOutLineMvoStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected InOutLineMvoStateEvent.InOutLineMvoStateDeleted newInOutLineMvoStateDeleted(String commandId, String requesterId) {
        InOutLineMvoStateEventId stateEventId = new InOutLineMvoStateEventId(this.state.getInOutLineId(), this.state.getInOutVersion());
        InOutLineMvoStateEvent.InOutLineMvoStateDeleted e = newInOutLineMvoStateDeleted(stateEventId);
        ((AbstractInOutLineMvoStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected InOutLineMvoStateEvent.InOutLineMvoStateCreated newInOutLineMvoStateCreated(InOutLineMvoStateEventId stateEventId) {
        return new AbstractInOutLineMvoStateEvent.SimpleInOutLineMvoStateCreated(stateEventId);
    }

    protected InOutLineMvoStateEvent.InOutLineMvoStateMergePatched newInOutLineMvoStateMergePatched(InOutLineMvoStateEventId stateEventId) {
        return new AbstractInOutLineMvoStateEvent.SimpleInOutLineMvoStateMergePatched(stateEventId);
    }

    protected InOutLineMvoStateEvent.InOutLineMvoStateDeleted newInOutLineMvoStateDeleted(InOutLineMvoStateEventId stateEventId)
    {
        return new AbstractInOutLineMvoStateEvent.SimpleInOutLineMvoStateDeleted(stateEventId);
    }


    public static class SimpleInOutLineMvoAggregate extends AbstractInOutLineMvoAggregate
    {
        public SimpleInOutLineMvoAggregate(InOutLineMvoState state) {
            super(state);
        }
    }

}

