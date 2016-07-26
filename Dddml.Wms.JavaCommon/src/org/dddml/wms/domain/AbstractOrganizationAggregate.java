package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractOrganizationAggregate extends AbstractAggregate implements OrganizationAggregate
{
    private OrganizationState state;

    private List<Event> changes = new ArrayList<Event>();

    public AbstractOrganizationAggregate(OrganizationState state)
    {
        this.state = state;
    }

    public abstract OrganizationState getState();

    public abstract List<Event> getChanges();

    public abstract void create(OrganizationCommand.CreateOrganization c);

    public abstract void mergePatch(OrganizationCommand.MergePatchOrganization c);

    public abstract void delete(OrganizationCommand.DeleteOrganization c);

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getVersion() == null || this.state.getVersion().equals(OrganizationState.VERSION_ZERO))
        {
            if (isCommandCreate((OrganizationCommand)c))
            {
                return;
            }
            throw DomainError.named("premature", "Can't do anything to unexistent aggregate");
        }
        if (this.state.getDeleted())
        {
            throw DomainError.named("zombie", "Can't do anything to deleted aggregate.");
        }
        if (isCommandCreate((OrganizationCommand)c))
            throw DomainError.named("rebirth", "Can't create aggregate that already exists");
    }

    protected void apply(Event e)
    {
        onApplying(e);
        this.state.mutate(e);
        this.changes.add(e);
    }


    private static boolean isCommandCreate(OrganizationCommand c)
    {
        return c.getVersion() == null || c.getVersion().equals(OrganizationState.VERSION_ZERO);
    }


    ////////////////////////

    protected OrganizationStateEvent.OrganizationStateCreated newOrganizationStateCreated(String commandId, String requesterId) {
        OrganizationStateEventId stateEventId = new OrganizationStateEventId(this.state.getOrganizationId(), this.state.getVersion());
        OrganizationStateEvent.OrganizationStateCreated e = newOrganizationStateCreated(stateEventId);
        ((AbstractOrganizationStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected OrganizationStateEvent.OrganizationStateMergePatched newOrganizationStateMergePatched(String commandId, String requesterId) {
        OrganizationStateEventId stateEventId = new OrganizationStateEventId(this.state.getOrganizationId(), this.state.getVersion());
        OrganizationStateEvent.OrganizationStateMergePatched e = newOrganizationStateMergePatched(stateEventId);
        ((AbstractOrganizationStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected OrganizationStateEvent.OrganizationStateDeleted newOrganizationStateDeleted(String commandId, String requesterId) {
        OrganizationStateEventId stateEventId = new OrganizationStateEventId(this.state.getOrganizationId(), this.state.getVersion());
        OrganizationStateEvent.OrganizationStateDeleted e = newOrganizationStateDeleted(stateEventId);
        ((AbstractOrganizationStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected OrganizationStateEvent.OrganizationStateCreated newOrganizationStateCreated(OrganizationStateEventId stateEventId) {
        return new AbstractOrganizationStateEvent.SimpleOrganizationStateCreated(stateEventId);
    }

    protected OrganizationStateEvent.OrganizationStateMergePatched newOrganizationStateMergePatched(OrganizationStateEventId stateEventId) {
        return new AbstractOrganizationStateEvent.SimpleOrganizationStateMergePatched(stateEventId);
    }

    protected OrganizationStateEvent.OrganizationStateDeleted newOrganizationStateDeleted(OrganizationStateEventId stateEventId)
    {
        return new AbstractOrganizationStateEvent.SimpleOrganizationStateDeleted(stateEventId);
    }


}

