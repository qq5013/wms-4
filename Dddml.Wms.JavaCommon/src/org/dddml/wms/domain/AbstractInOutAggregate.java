package org.dddml.wms.domain;

import java.util.*;
import org.joda.money.Money;
import java.math.BigDecimal;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractInOutAggregate extends AbstractAggregate implements InOutAggregate
{
    private InOutState state;

    private List<Event> changes = new ArrayList<Event>();

    public AbstractInOutAggregate(InOutState state)
    {
        this.state = state;
    }

    public abstract InOutState getState();

    public abstract List<Event> getChanges();

    public abstract void create(InOutCommand.CreateInOut c);

    public abstract void mergePatch(InOutCommand.MergePatchInOut c);

    public abstract void delete(InOutCommand.DeleteInOut c);

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getVersion() == null || this.state.getVersion().equals(InOutState.VERSION_ZERO))
        {
            if (isCommandCreate((InOutCommand)c))
            {
                return;
            }
            throw DomainError.named("premature", "Can't do anything to unexistent aggregate");
        }
        if (this.state.getDeleted())
        {
            throw DomainError.named("zombie", "Can't do anything to deleted aggregate.");
        }
        if (isCommandCreate((InOutCommand)c))
            throw DomainError.named("rebirth", "Can't create aggregate that already exists");
    }

    protected void apply(Event e)
    {
        onApplying(e);
        this.state.mutate(e);
        this.changes.add(e);
    }


    protected InOutLineStateEvent map(InOutLineCommand c, InOutCommand outerCommand, long version, InOutState outerState)
    {
        InOutLineCommand.CreateInOutLine create = (c.getCommandType().equals(CommandType.CREATE)) ? ((InOutLineCommand.CreateInOutLine)c) : null;
        if(create != null)
        {
            return mapCreate(create, outerCommand, version, outerState);
        }

        InOutLineCommand.MergePatchInOutLine merge = (c.getCommandType().equals(CommandType.MERGE_PATCH)) ? ((InOutLineCommand.MergePatchInOutLine)c) : null;
        if(merge != null)
        {
            return mapMergePatch(merge, outerCommand, version, outerState);
        }

        InOutLineCommand.RemoveInOutLine remove = (c.getCommandType().equals(CommandType.REMOVE)) ? ((InOutLineCommand.RemoveInOutLine)c) : null;
        if (remove != null)
        {
            return mapRemove(remove, outerCommand, version);
        }
        throw new UnsupportedOperationException();
    }

    protected InOutLineStateEvent.InOutLineStateCreated mapCreate(InOutLineCommand.CreateInOutLine c, InOutCommand outerCommand, Long version, InOutState outerState)
    {
        ((AbstractCommand)c).setRequesterId(outerCommand.getRequesterId());
        InOutLineStateEventId stateEventId = new InOutLineStateEventId(c.getInOutDocumentNumber(), c.getSkuId(), version);
        InOutLineStateEvent.InOutLineStateCreated e = newInOutLineStateCreated(stateEventId);
        InOutLineState s = outerState.getInOutLines().get(c.getSkuId());

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
        e.setActive(c.getActive());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;

    }// END map(ICreate... ////////////////////////////

    protected InOutLineStateEvent.InOutLineStateMergePatched mapMergePatch(InOutLineCommand.MergePatchInOutLine c, InOutCommand outerCommand, Long version, InOutState outerState)
    {
        ((AbstractCommand)c).setRequesterId(outerCommand.getRequesterId());
        InOutLineStateEventId stateEventId = new InOutLineStateEventId(c.getInOutDocumentNumber(), c.getSkuId(), version);
        InOutLineStateEvent.InOutLineStateMergePatched e = newInOutLineStateMergePatched(stateEventId);
        InOutLineState s = outerState.getInOutLines().get(c.getSkuId());

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
        e.setActive(c.getActive());
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
        e.setIsPropertyActiveRemoved(c.getIsPropertyActiveRemoved());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;

    }// END map(IMergePatch... ////////////////////////////

    protected InOutLineStateEvent.InOutLineStateRemoved mapRemove(InOutLineCommand.RemoveInOutLine c, InOutCommand outerCommand, Long version)
    {
        ((AbstractCommand)c).setRequesterId(outerCommand.getRequesterId());
        InOutLineStateEventId stateEventId = new InOutLineStateEventId(c.getInOutDocumentNumber(), c.getSkuId(), version);
        InOutLineStateEvent.InOutLineStateRemoved e = newInOutLineStateRemoved(stateEventId);

        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());

        return e;

    }// END map(IRemove... ////////////////////////////

    protected void throwOnInconsistentCommands(InOutCommand command, InOutLineCommand innerCommand)
    {
        AbstractInOutCommand properties = command instanceof AbstractInOutCommand ? (AbstractInOutCommand) command : null;
        AbstractInOutLineCommand innerProperties = innerCommand instanceof AbstractInOutLineCommand ? (AbstractInOutLineCommand) innerCommand : null;
        if (properties == null || innerProperties == null) { return; }
        String outerDocumentNumberName = "DocumentNumber";
        String outerDocumentNumberValue = properties.getDocumentNumber();
        String innerInOutDocumentNumberName = "InOutDocumentNumber";
        String innerInOutDocumentNumberValue = innerProperties.getInOutDocumentNumber();
        if (innerInOutDocumentNumberValue == null) {
            innerProperties.setInOutDocumentNumber(outerDocumentNumberValue);
        }
        else if (innerInOutDocumentNumberValue != outerDocumentNumberValue && innerInOutDocumentNumberValue != null && !innerInOutDocumentNumberValue.equals(outerDocumentNumberValue)) {
            throw DomainError.named("inconsistentId", "Outer %1$s %2$s NOT equals inner %3$s %4$s", outerDocumentNumberName, outerDocumentNumberValue, innerInOutDocumentNumberName, innerInOutDocumentNumberValue);
        }
    }// END throwOnInconsistentCommands /////////////////////

    protected void newInOutDocumentActionCommandAndExecute(InOutCommand.MergePatchInOut c, InOutState s, InOutStateEvent.InOutStateMergePatched e)
    {
        PropertyCommandHandler<DocumentAction, String> pCommandHandler = this.getInOutDocumentActionCommandHandler();
        DocumentAction pCmdContent = c.getDocumentAction();
        PropertyCommand<DocumentAction, String> pCmd = new AbstractPropertyCommand.SimplePropertyCommand<DocumentAction, String>();
        pCmd.setContent(pCmdContent);
        pCmd.setStateGetter(() -> s.getDocumentStatus());
        pCmd.setStateSetter(p -> e.setDocumentStatus(p));
        pCmd.setOuterCommandType(CommandType.MERGE_PATCH);
        pCommandHandler.execute(pCmd);
    }

    protected void newInOutDocumentActionCommandAndExecute(InOutCommand.CreateInOut c, InOutState s, InOutStateEvent.InOutStateCreated e)
    {
        PropertyCommandHandler<DocumentAction, String> pCommandHandler = this.getInOutDocumentActionCommandHandler();
        DocumentAction pCmdContent = c.getDocumentAction();
        PropertyCommand<DocumentAction, String> pCmd = new AbstractPropertyCommand.SimplePropertyCommand<DocumentAction, String>();
        pCmd.setContent(pCmdContent);
        pCmd.setStateGetter(() -> s.getDocumentStatus());
        pCmd.setStateSetter(p -> e.setDocumentStatus(p));
        pCmd.setOuterCommandType(CommandType.CREATE);
        pCommandHandler.execute(pCmd);
    }

    protected PropertyCommandHandler<DocumentAction, String> getInOutDocumentActionCommandHandler()
    {
        return (PropertyCommandHandler<DocumentAction, String>)ApplicationContext.current.get("InOutDocumentActionCommandHandler");
    }


    private static boolean isCommandCreate(InOutCommand c)
    {
        return c.getVersion() == null || c.getVersion().equals(InOutState.VERSION_ZERO);
    }


    ////////////////////////

    protected InOutStateEvent.InOutStateCreated newInOutStateCreated(String commandId, String requesterId) {
        InOutStateEventId stateEventId = new InOutStateEventId(this.state.getDocumentNumber(), this.state.getVersion());
        InOutStateEvent.InOutStateCreated e = newInOutStateCreated(stateEventId);
        ((AbstractInOutStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected InOutStateEvent.InOutStateMergePatched newInOutStateMergePatched(String commandId, String requesterId) {
        InOutStateEventId stateEventId = new InOutStateEventId(this.state.getDocumentNumber(), this.state.getVersion());
        InOutStateEvent.InOutStateMergePatched e = newInOutStateMergePatched(stateEventId);
        ((AbstractInOutStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected InOutStateEvent.InOutStateDeleted newInOutStateDeleted(String commandId, String requesterId) {
        InOutStateEventId stateEventId = new InOutStateEventId(this.state.getDocumentNumber(), this.state.getVersion());
        InOutStateEvent.InOutStateDeleted e = newInOutStateDeleted(stateEventId);
        ((AbstractInOutStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected InOutStateEvent.InOutStateCreated newInOutStateCreated(InOutStateEventId stateEventId) {
        return new AbstractInOutStateEvent.SimpleInOutStateCreated(stateEventId);
    }

    protected InOutStateEvent.InOutStateMergePatched newInOutStateMergePatched(InOutStateEventId stateEventId) {
        return new AbstractInOutStateEvent.SimpleInOutStateMergePatched(stateEventId);
    }

    protected InOutStateEvent.InOutStateDeleted newInOutStateDeleted(InOutStateEventId stateEventId)
    {
        return new AbstractInOutStateEvent.SimpleInOutStateDeleted(stateEventId);
    }

    protected InOutLineStateEvent.InOutLineStateCreated newInOutLineStateCreated(InOutLineStateEventId stateEventId) {
        return new AbstractInOutLineStateEvent.SimpleInOutLineStateCreated(stateEventId);
    }

    protected InOutLineStateEvent.InOutLineStateMergePatched newInOutLineStateMergePatched(InOutLineStateEventId stateEventId) {
        return new AbstractInOutLineStateEvent.SimpleInOutLineStateMergePatched(stateEventId);
    }

    protected InOutLineStateEvent.InOutLineStateRemoved newInOutLineStateRemoved(InOutLineStateEventId stateEventId)
    {
        return new AbstractInOutLineStateEvent.SimpleInOutLineStateRemoved(stateEventId);
    }


}

