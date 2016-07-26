package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractLocatorAggregate extends AbstractAggregate implements LocatorAggregate
{
    private LocatorState state;

    private List<Event> changes = new ArrayList<Event>();

    public AbstractLocatorAggregate(LocatorState state)
    {
        this.state = state;
    }

    public abstract LocatorState getState();

    public abstract List<Event> getChanges();

    public abstract void create(LocatorCommand.CreateLocator c);

    public abstract void mergePatch(LocatorCommand.MergePatchLocator c);

    public abstract void delete(LocatorCommand.DeleteLocator c);

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getVersion() == null || this.state.getVersion().equals(LocatorState.VERSION_ZERO))
        {
            if (isCommandCreate((LocatorCommand)c))
            {
                return;
            }
            throw DomainError.named("premature", "Can't do anything to unexistent aggregate");
        }
        if (this.state.getDeleted())
        {
            throw DomainError.named("zombie", "Can't do anything to deleted aggregate.");
        }
        if (isCommandCreate((LocatorCommand)c))
            throw DomainError.named("rebirth", "Can't create aggregate that already exists");
    }

    protected void apply(Event e)
    {
        onApplying(e);
        this.state.mutate(e);
        this.changes.add(e);
    }


    private static boolean isCommandCreate(LocatorCommand c)
    {
        return c.getVersion() == null || c.getVersion().equals(LocatorState.VERSION_ZERO);
    }


    ////////////////////////

    protected LocatorStateEvent.LocatorStateCreated newLocatorStateCreated(String commandId, String requesterId) {
        LocatorStateEventId stateEventId = new LocatorStateEventId(this.state.getLocatorId(), this.state.getVersion());
        LocatorStateEvent.LocatorStateCreated e = newLocatorStateCreated(stateEventId);
        ((AbstractLocatorStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected LocatorStateEvent.LocatorStateMergePatched newLocatorStateMergePatched(String commandId, String requesterId) {
        LocatorStateEventId stateEventId = new LocatorStateEventId(this.state.getLocatorId(), this.state.getVersion());
        LocatorStateEvent.LocatorStateMergePatched e = newLocatorStateMergePatched(stateEventId);
        ((AbstractLocatorStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected LocatorStateEvent.LocatorStateDeleted newLocatorStateDeleted(String commandId, String requesterId) {
        LocatorStateEventId stateEventId = new LocatorStateEventId(this.state.getLocatorId(), this.state.getVersion());
        LocatorStateEvent.LocatorStateDeleted e = newLocatorStateDeleted(stateEventId);
        ((AbstractLocatorStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected LocatorStateEvent.LocatorStateCreated newLocatorStateCreated(LocatorStateEventId stateEventId) {
        return new AbstractLocatorStateEvent.SimpleLocatorStateCreated(stateEventId);
    }

    protected LocatorStateEvent.LocatorStateMergePatched newLocatorStateMergePatched(LocatorStateEventId stateEventId) {
        return new AbstractLocatorStateEvent.SimpleLocatorStateMergePatched(stateEventId);
    }

    protected LocatorStateEvent.LocatorStateDeleted newLocatorStateDeleted(LocatorStateEventId stateEventId)
    {
        return new AbstractLocatorStateEvent.SimpleLocatorStateDeleted(stateEventId);
    }


}

