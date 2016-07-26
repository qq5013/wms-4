package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractAudienceAggregate extends AbstractAggregate implements AudienceAggregate
{
    private AudienceState state;

    private List<Event> changes = new ArrayList<Event>();

    public AbstractAudienceAggregate(AudienceState state)
    {
        this.state = state;
    }

    public abstract AudienceState getState();

    public abstract List<Event> getChanges();

    public abstract void create(AudienceCommand.CreateAudience c);

    public abstract void mergePatch(AudienceCommand.MergePatchAudience c);

    public abstract void delete(AudienceCommand.DeleteAudience c);

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getVersion() == null || this.state.getVersion().equals(AudienceState.VERSION_ZERO))
        {
            if (isCommandCreate((AudienceCommand)c))
            {
                return;
            }
            throw DomainError.named("premature", "Can't do anything to unexistent aggregate");
        }
        if (this.state.getDeleted())
        {
            throw DomainError.named("zombie", "Can't do anything to deleted aggregate.");
        }
        if (isCommandCreate((AudienceCommand)c))
            throw DomainError.named("rebirth", "Can't create aggregate that already exists");
    }

    protected void apply(Event e)
    {
        onApplying(e);
        this.state.mutate(e);
        this.changes.add(e);
    }


    private static boolean isCommandCreate(AudienceCommand c)
    {
        return c.getVersion() == null || c.getVersion().equals(AudienceState.VERSION_ZERO);
    }


    ////////////////////////

    protected AudienceStateEvent.AudienceStateCreated newAudienceStateCreated(String commandId, String requesterId) {
        AudienceStateEventId stateEventId = new AudienceStateEventId(this.state.getClientId(), this.state.getVersion());
        AudienceStateEvent.AudienceStateCreated e = newAudienceStateCreated(stateEventId);
        ((AbstractAudienceStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected AudienceStateEvent.AudienceStateMergePatched newAudienceStateMergePatched(String commandId, String requesterId) {
        AudienceStateEventId stateEventId = new AudienceStateEventId(this.state.getClientId(), this.state.getVersion());
        AudienceStateEvent.AudienceStateMergePatched e = newAudienceStateMergePatched(stateEventId);
        ((AbstractAudienceStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected AudienceStateEvent.AudienceStateDeleted newAudienceStateDeleted(String commandId, String requesterId) {
        AudienceStateEventId stateEventId = new AudienceStateEventId(this.state.getClientId(), this.state.getVersion());
        AudienceStateEvent.AudienceStateDeleted e = newAudienceStateDeleted(stateEventId);
        ((AbstractAudienceStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected AudienceStateEvent.AudienceStateCreated newAudienceStateCreated(AudienceStateEventId stateEventId) {
        return new AbstractAudienceStateEvent.SimpleAudienceStateCreated(stateEventId);
    }

    protected AudienceStateEvent.AudienceStateMergePatched newAudienceStateMergePatched(AudienceStateEventId stateEventId) {
        return new AbstractAudienceStateEvent.SimpleAudienceStateMergePatched(stateEventId);
    }

    protected AudienceStateEvent.AudienceStateDeleted newAudienceStateDeleted(AudienceStateEventId stateEventId)
    {
        return new AbstractAudienceStateEvent.SimpleAudienceStateDeleted(stateEventId);
    }


}

