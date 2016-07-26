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

    public abstract OrganizationStructureState getState();

    public abstract List<Event> getChanges();

    public abstract void create(OrganizationStructureCommand.CreateOrganizationStructure c);

    public abstract void mergePatch(OrganizationStructureCommand.MergePatchOrganizationStructure c);

    public abstract void delete(OrganizationStructureCommand.DeleteOrganizationStructure c);

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getVersion() == null || this.state.getVersion().equals(OrganizationStructureState.VERSION_ZERO))
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
        this.state.mutate(e);
        this.changes.add(e);
    }


    private static boolean isCommandCreate(OrganizationStructureCommand c)
    {
        return c.getVersion() == null || c.getVersion().equals(OrganizationStructureState.VERSION_ZERO);
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


}

