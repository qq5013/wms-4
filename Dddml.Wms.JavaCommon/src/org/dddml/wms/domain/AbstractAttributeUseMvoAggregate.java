package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractAttributeUseMvoAggregate extends AbstractAggregate implements AttributeUseMvoAggregate
{
    private AttributeUseMvoState state;

    private List<Event> changes = new ArrayList<Event>();

    public AbstractAttributeUseMvoAggregate(AttributeUseMvoState state)
    {
        this.state = state;
    }

    public abstract AttributeUseMvoState getState();

    public abstract List<Event> getChanges();

    public abstract void create(AttributeUseMvoCommand.CreateAttributeUseMvo c);

    public abstract void mergePatch(AttributeUseMvoCommand.MergePatchAttributeUseMvo c);

    public abstract void delete(AttributeUseMvoCommand.DeleteAttributeUseMvo c);

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getAttributeSetVersion() == null || this.state.getAttributeSetVersion().equals(AttributeUseMvoState.VERSION_ZERO))
        {
            if (isCommandCreate((AttributeUseMvoCommand)c))
            {
                return;
            }
            throw DomainError.named("premature", "Can't do anything to unexistent aggregate");
        }
        if (this.state.getDeleted())
        {
            throw DomainError.named("zombie", "Can't do anything to deleted aggregate.");
        }
        if (isCommandCreate((AttributeUseMvoCommand)c))
            throw DomainError.named("rebirth", "Can't create aggregate that already exists");
    }

    protected void apply(Event e)
    {
        onApplying(e);
        this.state.mutate(e);
        this.changes.add(e);
    }


    private static boolean isCommandCreate(AttributeUseMvoCommand c)
    {
        return c.getAttributeSetVersion() == null || c.getAttributeSetVersion().equals(AttributeUseMvoState.VERSION_ZERO);
    }


    ////////////////////////

    protected AttributeUseMvoStateEvent.AttributeUseMvoStateCreated newAttributeUseMvoStateCreated(String commandId, String requesterId) {
        AttributeUseMvoStateEventId stateEventId = new AttributeUseMvoStateEventId(this.state.getAttributeSetAttributeUseId(), this.state.getAttributeSetVersion());
        AttributeUseMvoStateEvent.AttributeUseMvoStateCreated e = newAttributeUseMvoStateCreated(stateEventId);
        ((AbstractAttributeUseMvoStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected AttributeUseMvoStateEvent.AttributeUseMvoStateMergePatched newAttributeUseMvoStateMergePatched(String commandId, String requesterId) {
        AttributeUseMvoStateEventId stateEventId = new AttributeUseMvoStateEventId(this.state.getAttributeSetAttributeUseId(), this.state.getAttributeSetVersion());
        AttributeUseMvoStateEvent.AttributeUseMvoStateMergePatched e = newAttributeUseMvoStateMergePatched(stateEventId);
        ((AbstractAttributeUseMvoStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected AttributeUseMvoStateEvent.AttributeUseMvoStateDeleted newAttributeUseMvoStateDeleted(String commandId, String requesterId) {
        AttributeUseMvoStateEventId stateEventId = new AttributeUseMvoStateEventId(this.state.getAttributeSetAttributeUseId(), this.state.getAttributeSetVersion());
        AttributeUseMvoStateEvent.AttributeUseMvoStateDeleted e = newAttributeUseMvoStateDeleted(stateEventId);
        ((AbstractAttributeUseMvoStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected AttributeUseMvoStateEvent.AttributeUseMvoStateCreated newAttributeUseMvoStateCreated(AttributeUseMvoStateEventId stateEventId) {
        return new AbstractAttributeUseMvoStateEvent.SimpleAttributeUseMvoStateCreated(stateEventId);
    }

    protected AttributeUseMvoStateEvent.AttributeUseMvoStateMergePatched newAttributeUseMvoStateMergePatched(AttributeUseMvoStateEventId stateEventId) {
        return new AbstractAttributeUseMvoStateEvent.SimpleAttributeUseMvoStateMergePatched(stateEventId);
    }

    protected AttributeUseMvoStateEvent.AttributeUseMvoStateDeleted newAttributeUseMvoStateDeleted(AttributeUseMvoStateEventId stateEventId)
    {
        return new AbstractAttributeUseMvoStateEvent.SimpleAttributeUseMvoStateDeleted(stateEventId);
    }


}

