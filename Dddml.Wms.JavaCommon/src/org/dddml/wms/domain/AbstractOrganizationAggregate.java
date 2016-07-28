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

    public OrganizationState getState() {
        return this.state;
    }

    public List<Event> getChanges() {
        return this.changes;
    }

    public void create(OrganizationCommand.CreateOrganization c)
    {
        if (c.getVersion() == null) { c.setVersion(OrganizationState.VERSION_NULL); }
        OrganizationStateEvent.OrganizationStateCreated e = map(c);
        apply(e);
    }

    public void mergePatch(OrganizationCommand.MergePatchOrganization c)
    {
        OrganizationStateEvent.OrganizationStateMergePatched e = map(c);
        apply(e);
    }

    public void delete(OrganizationCommand.DeleteOrganization c)
    {
        OrganizationStateEvent.OrganizationStateDeleted e = map(c);
        apply(e);
    }

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getVersion() == null)
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
        state.mutate(e);
        changes.add(e);
    }

    protected OrganizationStateEvent.OrganizationStateCreated map(OrganizationCommand.CreateOrganization c)
    {
        OrganizationStateEventId stateEventId = new OrganizationStateEventId(c.getOrganizationId(), c.getVersion());
        OrganizationStateEvent.OrganizationStateCreated e = newOrganizationStateCreated(stateEventId);
        e.setName(c.getName());
        e.setDescription(c.getDescription());
        e.setType(c.getType());
        e.setIsSummary(c.getIsSummary());
        e.setActive(c.getActive());
        ((AbstractOrganizationStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long version = c.getVersion();
        return e;
    }

    protected OrganizationStateEvent.OrganizationStateMergePatched map(OrganizationCommand.MergePatchOrganization c)
    {
        OrganizationStateEventId stateEventId = new OrganizationStateEventId(c.getOrganizationId(), c.getVersion());
        OrganizationStateEvent.OrganizationStateMergePatched e = newOrganizationStateMergePatched(stateEventId);
        e.setName(c.getName());
        e.setDescription(c.getDescription());
        e.setType(c.getType());
        e.setIsSummary(c.getIsSummary());
        e.setActive(c.getActive());
        e.setIsPropertyNameRemoved(c.getIsPropertyNameRemoved());
        e.setIsPropertyDescriptionRemoved(c.getIsPropertyDescriptionRemoved());
        e.setIsPropertyTypeRemoved(c.getIsPropertyTypeRemoved());
        e.setIsPropertyIsSummaryRemoved(c.getIsPropertyIsSummaryRemoved());
        e.setIsPropertyActiveRemoved(c.getIsPropertyActiveRemoved());
        ((AbstractOrganizationStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long version = c.getVersion();
        return e;
    }

    protected OrganizationStateEvent.OrganizationStateDeleted map(OrganizationCommand.DeleteOrganization c)
    {
        OrganizationStateEventId stateEventId = new OrganizationStateEventId(c.getOrganizationId(), c.getVersion());
        OrganizationStateEvent.OrganizationStateDeleted e = newOrganizationStateDeleted(stateEventId);
        ((AbstractOrganizationStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;
    }


    private static boolean isCommandCreate(OrganizationCommand c)
    {
        return ((c instanceof OrganizationCommand.CreateOrganization) 
            && c.getVersion().equals(OrganizationState.VERSION_NULL));
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


    public static class SimpleOrganizationAggregate extends AbstractOrganizationAggregate
    {
        public SimpleOrganizationAggregate(OrganizationState state) {
            super(state);
        }
    }

}

