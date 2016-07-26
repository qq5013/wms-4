package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractAttributeValueMvoAggregate extends AbstractAggregate implements AttributeValueMvoAggregate
{
    private AttributeValueMvoState state;

    private List<Event> changes = new ArrayList<Event>();

    public AbstractAttributeValueMvoAggregate(AttributeValueMvoState state)
    {
        this.state = state;
    }

    public abstract AttributeValueMvoState getState();

    public abstract List<Event> getChanges();

    public abstract void create(AttributeValueMvoCommand.CreateAttributeValueMvo c);

    public abstract void mergePatch(AttributeValueMvoCommand.MergePatchAttributeValueMvo c);

    public abstract void delete(AttributeValueMvoCommand.DeleteAttributeValueMvo c);

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getAttributeVersion() == null || this.state.getAttributeVersion().equals(AttributeValueMvoState.VERSION_ZERO))
        {
            if (isCommandCreate((AttributeValueMvoCommand)c))
            {
                return;
            }
            throw DomainError.named("premature", "Can't do anything to unexistent aggregate");
        }
        if (this.state.getDeleted())
        {
            throw DomainError.named("zombie", "Can't do anything to deleted aggregate.");
        }
        if (isCommandCreate((AttributeValueMvoCommand)c))
            throw DomainError.named("rebirth", "Can't create aggregate that already exists");
    }

    protected void apply(Event e)
    {
        onApplying(e);
        this.state.mutate(e);
        this.changes.add(e);
    }


    private static boolean isCommandCreate(AttributeValueMvoCommand c)
    {
        return c.getAttributeVersion() == null || c.getAttributeVersion().equals(AttributeValueMvoState.VERSION_ZERO);
    }


    ////////////////////////

    protected AttributeValueMvoStateEvent.AttributeValueMvoStateCreated newAttributeValueMvoStateCreated(String commandId, String requesterId) {
        AttributeValueMvoStateEventId stateEventId = new AttributeValueMvoStateEventId(this.state.getAttributeValueId(), this.state.getAttributeVersion());
        AttributeValueMvoStateEvent.AttributeValueMvoStateCreated e = newAttributeValueMvoStateCreated(stateEventId);
        ((AbstractAttributeValueMvoStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected AttributeValueMvoStateEvent.AttributeValueMvoStateMergePatched newAttributeValueMvoStateMergePatched(String commandId, String requesterId) {
        AttributeValueMvoStateEventId stateEventId = new AttributeValueMvoStateEventId(this.state.getAttributeValueId(), this.state.getAttributeVersion());
        AttributeValueMvoStateEvent.AttributeValueMvoStateMergePatched e = newAttributeValueMvoStateMergePatched(stateEventId);
        ((AbstractAttributeValueMvoStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected AttributeValueMvoStateEvent.AttributeValueMvoStateDeleted newAttributeValueMvoStateDeleted(String commandId, String requesterId) {
        AttributeValueMvoStateEventId stateEventId = new AttributeValueMvoStateEventId(this.state.getAttributeValueId(), this.state.getAttributeVersion());
        AttributeValueMvoStateEvent.AttributeValueMvoStateDeleted e = newAttributeValueMvoStateDeleted(stateEventId);
        ((AbstractAttributeValueMvoStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected AttributeValueMvoStateEvent.AttributeValueMvoStateCreated newAttributeValueMvoStateCreated(AttributeValueMvoStateEventId stateEventId) {
        return new AbstractAttributeValueMvoStateEvent.SimpleAttributeValueMvoStateCreated(stateEventId);
    }

    protected AttributeValueMvoStateEvent.AttributeValueMvoStateMergePatched newAttributeValueMvoStateMergePatched(AttributeValueMvoStateEventId stateEventId) {
        return new AbstractAttributeValueMvoStateEvent.SimpleAttributeValueMvoStateMergePatched(stateEventId);
    }

    protected AttributeValueMvoStateEvent.AttributeValueMvoStateDeleted newAttributeValueMvoStateDeleted(AttributeValueMvoStateEventId stateEventId)
    {
        return new AbstractAttributeValueMvoStateEvent.SimpleAttributeValueMvoStateDeleted(stateEventId);
    }


}

