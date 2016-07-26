package org.dddml.wms.domain;

import java.util.*;
import java.math.BigDecimal;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractAttributeSetInstanceAggregate extends AbstractAggregate implements AttributeSetInstanceAggregate
{
    private AttributeSetInstanceState state;

    private List<Event> changes = new ArrayList<Event>();

    public AbstractAttributeSetInstanceAggregate(AttributeSetInstanceState state)
    {
        this.state = state;
    }

    public abstract AttributeSetInstanceState getState();

    public abstract List<Event> getChanges();

    public abstract void create(AttributeSetInstanceCommand.CreateAttributeSetInstance c);

    public abstract void mergePatch(AttributeSetInstanceCommand.MergePatchAttributeSetInstance c);

    public abstract void delete(AttributeSetInstanceCommand.DeleteAttributeSetInstance c);

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getVersion() == null || this.state.getVersion().equals(AttributeSetInstanceState.VERSION_ZERO))
        {
            if (isCommandCreate((AttributeSetInstanceCommand)c))
            {
                return;
            }
            throw DomainError.named("premature", "Can't do anything to unexistent aggregate");
        }
        if (this.state.getDeleted())
        {
            throw DomainError.named("zombie", "Can't do anything to deleted aggregate.");
        }
        if (isCommandCreate((AttributeSetInstanceCommand)c))
            throw DomainError.named("rebirth", "Can't create aggregate that already exists");
    }

    protected void apply(Event e)
    {
        onApplying(e);
        this.state.mutate(e);
        this.changes.add(e);
    }


    private static boolean isCommandCreate(AttributeSetInstanceCommand c)
    {
        return c.getVersion() == null || c.getVersion().equals(AttributeSetInstanceState.VERSION_ZERO);
    }


    ////////////////////////

    protected AttributeSetInstanceStateEvent.AttributeSetInstanceStateCreated newAttributeSetInstanceStateCreated(String commandId, String requesterId) {
        AttributeSetInstanceStateEventId stateEventId = new AttributeSetInstanceStateEventId(this.state.getAttributeSetInstanceId(), this.state.getVersion());
        AttributeSetInstanceStateEvent.AttributeSetInstanceStateCreated e = newAttributeSetInstanceStateCreated(stateEventId);
        ((AbstractAttributeSetInstanceStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected AttributeSetInstanceStateEvent.AttributeSetInstanceStateMergePatched newAttributeSetInstanceStateMergePatched(String commandId, String requesterId) {
        AttributeSetInstanceStateEventId stateEventId = new AttributeSetInstanceStateEventId(this.state.getAttributeSetInstanceId(), this.state.getVersion());
        AttributeSetInstanceStateEvent.AttributeSetInstanceStateMergePatched e = newAttributeSetInstanceStateMergePatched(stateEventId);
        ((AbstractAttributeSetInstanceStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected AttributeSetInstanceStateEvent.AttributeSetInstanceStateDeleted newAttributeSetInstanceStateDeleted(String commandId, String requesterId) {
        AttributeSetInstanceStateEventId stateEventId = new AttributeSetInstanceStateEventId(this.state.getAttributeSetInstanceId(), this.state.getVersion());
        AttributeSetInstanceStateEvent.AttributeSetInstanceStateDeleted e = newAttributeSetInstanceStateDeleted(stateEventId);
        ((AbstractAttributeSetInstanceStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected AttributeSetInstanceStateEvent.AttributeSetInstanceStateCreated newAttributeSetInstanceStateCreated(AttributeSetInstanceStateEventId stateEventId) {
        return new AbstractAttributeSetInstanceStateEvent.SimpleAttributeSetInstanceStateCreated(stateEventId);
    }

    protected AttributeSetInstanceStateEvent.AttributeSetInstanceStateMergePatched newAttributeSetInstanceStateMergePatched(AttributeSetInstanceStateEventId stateEventId) {
        return new AbstractAttributeSetInstanceStateEvent.SimpleAttributeSetInstanceStateMergePatched(stateEventId);
    }

    protected AttributeSetInstanceStateEvent.AttributeSetInstanceStateDeleted newAttributeSetInstanceStateDeleted(AttributeSetInstanceStateEventId stateEventId)
    {
        return new AbstractAttributeSetInstanceStateEvent.SimpleAttributeSetInstanceStateDeleted(stateEventId);
    }


}

