package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractOrganizationStructureAggregate extends AbstractAggregate implements OrganizationStructureAggregate
{
    private OrganizationStructureState state;

    private List<Event> changes = new ArrayList<Event>();

    public AbstractOrganizationStructureAggregate(OrganizationStructureState state)
    {
        this.state = state;
    }

    public OrganizationStructureState getState() {
        return this.state;
    }

    public List<Event> getChanges() {
        return this.changes;
    }

    public void create(OrganizationStructureCommand.CreateOrganizationStructure c)
    {
        if (c.getVersion() == null) { c.setVersion(OrganizationStructureState.VERSION_NULL); }
        OrganizationStructureStateEvent.OrganizationStructureStateCreated e = map(c);
        apply(e);
    }

    public void mergePatch(OrganizationStructureCommand.MergePatchOrganizationStructure c)
    {
        OrganizationStructureStateEvent.OrganizationStructureStateMergePatched e = map(c);
        apply(e);
    }

    public void delete(OrganizationStructureCommand.DeleteOrganizationStructure c)
    {
        OrganizationStructureStateEvent.OrganizationStructureStateDeleted e = map(c);
        apply(e);
    }

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getVersion() == null)
        {
            if (isCommandCreate((OrganizationStructureCommand)c))
            {
                return;
            }
            throw DomainError.named("premature", "Can't do anything to unexistent aggregate");
        }
        if (this.state.getDeleted())
        {
            throw DomainError.named("zombie", "Can't do anything to deleted aggregate.");
        }
        if (isCommandCreate((OrganizationStructureCommand)c))
            throw DomainError.named("rebirth", "Can't create aggregate that already exists");
    }

    protected void apply(Event e)
    {
        onApplying(e);
        state.mutate(e);
        changes.add(e);
    }

    protected OrganizationStructureStateEvent.OrganizationStructureStateCreated map(OrganizationStructureCommand.CreateOrganizationStructure c)
    {
        OrganizationStructureStateEventId stateEventId = new OrganizationStructureStateEventId(c.getId(), c.getVersion());
        OrganizationStructureStateEvent.OrganizationStructureStateCreated e = newOrganizationStructureStateCreated(stateEventId);
        e.setActive(c.getActive());
        ((AbstractOrganizationStructureStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long version = c.getVersion();
        return e;
    }

    protected OrganizationStructureStateEvent.OrganizationStructureStateMergePatched map(OrganizationStructureCommand.MergePatchOrganizationStructure c)
    {
        OrganizationStructureStateEventId stateEventId = new OrganizationStructureStateEventId(c.getId(), c.getVersion());
        OrganizationStructureStateEvent.OrganizationStructureStateMergePatched e = newOrganizationStructureStateMergePatched(stateEventId);
        e.setActive(c.getActive());
        e.setIsPropertyActiveRemoved(c.getIsPropertyActiveRemoved());
        ((AbstractOrganizationStructureStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long version = c.getVersion();
        return e;
    }

    protected OrganizationStructureStateEvent.OrganizationStructureStateDeleted map(OrganizationStructureCommand.DeleteOrganizationStructure c)
    {
        OrganizationStructureStateEventId stateEventId = new OrganizationStructureStateEventId(c.getId(), c.getVersion());
        OrganizationStructureStateEvent.OrganizationStructureStateDeleted e = newOrganizationStructureStateDeleted(stateEventId);
        ((AbstractOrganizationStructureStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;
    }


    private static boolean isCommandCreate(OrganizationStructureCommand c)
    {
        return ((c instanceof OrganizationStructureCommand.CreateOrganizationStructure) 
            && c.getVersion().equals(OrganizationStructureState.VERSION_NULL));
    }


    ////////////////////////

    protected OrganizationStructureStateEvent.OrganizationStructureStateCreated newOrganizationStructureStateCreated(String commandId, String requesterId) {
        OrganizationStructureStateEventId stateEventId = new OrganizationStructureStateEventId(this.state.getId(), this.state.getVersion());
        OrganizationStructureStateEvent.OrganizationStructureStateCreated e = newOrganizationStructureStateCreated(stateEventId);
        ((AbstractOrganizationStructureStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected OrganizationStructureStateEvent.OrganizationStructureStateMergePatched newOrganizationStructureStateMergePatched(String commandId, String requesterId) {
        OrganizationStructureStateEventId stateEventId = new OrganizationStructureStateEventId(this.state.getId(), this.state.getVersion());
        OrganizationStructureStateEvent.OrganizationStructureStateMergePatched e = newOrganizationStructureStateMergePatched(stateEventId);
        ((AbstractOrganizationStructureStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected OrganizationStructureStateEvent.OrganizationStructureStateDeleted newOrganizationStructureStateDeleted(String commandId, String requesterId) {
        OrganizationStructureStateEventId stateEventId = new OrganizationStructureStateEventId(this.state.getId(), this.state.getVersion());
        OrganizationStructureStateEvent.OrganizationStructureStateDeleted e = newOrganizationStructureStateDeleted(stateEventId);
        ((AbstractOrganizationStructureStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected OrganizationStructureStateEvent.OrganizationStructureStateCreated newOrganizationStructureStateCreated(OrganizationStructureStateEventId stateEventId) {
        return new AbstractOrganizationStructureStateEvent.SimpleOrganizationStructureStateCreated(stateEventId);
    }

    protected OrganizationStructureStateEvent.OrganizationStructureStateMergePatched newOrganizationStructureStateMergePatched(OrganizationStructureStateEventId stateEventId) {
        return new AbstractOrganizationStructureStateEvent.SimpleOrganizationStructureStateMergePatched(stateEventId);
    }

    protected OrganizationStructureStateEvent.OrganizationStructureStateDeleted newOrganizationStructureStateDeleted(OrganizationStructureStateEventId stateEventId)
    {
        return new AbstractOrganizationStructureStateEvent.SimpleOrganizationStructureStateDeleted(stateEventId);
    }


    public static class SimpleOrganizationStructureAggregate extends AbstractOrganizationStructureAggregate
    {
        public SimpleOrganizationStructureAggregate(OrganizationStructureState state) {
            super(state);
        }
    }

}

