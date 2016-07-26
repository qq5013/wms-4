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

    public abstract InOutLineMvoState getState();

    public abstract List<Event> getChanges();

    public abstract void create(InOutLineMvoCommand.CreateInOutLineMvo c);

    public abstract void mergePatch(InOutLineMvoCommand.MergePatchInOutLineMvo c);

    public abstract void delete(InOutLineMvoCommand.DeleteInOutLineMvo c);

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


}

