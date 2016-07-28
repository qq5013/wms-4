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

    public AudienceState getState() {
        return this.state;
    }

    public List<Event> getChanges() {
        return this.changes;
    }

    public void create(AudienceCommand.CreateAudience c)
    {
        if (c.getVersion() == null) { c.setVersion(AudienceState.VERSION_NULL); }
        AudienceStateEvent.AudienceStateCreated e = map(c);
        apply(e);
    }

    public void mergePatch(AudienceCommand.MergePatchAudience c)
    {
        AudienceStateEvent.AudienceStateMergePatched e = map(c);
        apply(e);
    }

    public void delete(AudienceCommand.DeleteAudience c)
    {
        AudienceStateEvent.AudienceStateDeleted e = map(c);
        apply(e);
    }

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getVersion() == null)
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
        state.mutate(e);
        changes.add(e);
    }

    protected AudienceStateEvent.AudienceStateCreated map(AudienceCommand.CreateAudience c)
    {
        AudienceStateEventId stateEventId = new AudienceStateEventId(c.getClientId(), c.getVersion());
        AudienceStateEvent.AudienceStateCreated e = newAudienceStateCreated(stateEventId);
        e.setName(c.getName());
        e.setBase64Secret(c.getBase64Secret());
        e.setActive(c.getActive());
        ((AbstractAudienceStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long version = c.getVersion();
        return e;
    }

    protected AudienceStateEvent.AudienceStateMergePatched map(AudienceCommand.MergePatchAudience c)
    {
        AudienceStateEventId stateEventId = new AudienceStateEventId(c.getClientId(), c.getVersion());
        AudienceStateEvent.AudienceStateMergePatched e = newAudienceStateMergePatched(stateEventId);
        e.setName(c.getName());
        e.setBase64Secret(c.getBase64Secret());
        e.setActive(c.getActive());
        e.setIsPropertyNameRemoved(c.getIsPropertyNameRemoved());
        e.setIsPropertyBase64SecretRemoved(c.getIsPropertyBase64SecretRemoved());
        e.setIsPropertyActiveRemoved(c.getIsPropertyActiveRemoved());
        ((AbstractAudienceStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long version = c.getVersion();
        return e;
    }

    protected AudienceStateEvent.AudienceStateDeleted map(AudienceCommand.DeleteAudience c)
    {
        AudienceStateEventId stateEventId = new AudienceStateEventId(c.getClientId(), c.getVersion());
        AudienceStateEvent.AudienceStateDeleted e = newAudienceStateDeleted(stateEventId);
        ((AbstractAudienceStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;
    }


    private static boolean isCommandCreate(AudienceCommand c)
    {
        return ((c instanceof AudienceCommand.CreateAudience) 
            && c.getVersion().equals(AudienceState.VERSION_NULL));
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


    public static class SimpleAudienceAggregate extends AbstractAudienceAggregate
    {
        public SimpleAudienceAggregate(AudienceState state) {
            super(state);
        }
    }

}

