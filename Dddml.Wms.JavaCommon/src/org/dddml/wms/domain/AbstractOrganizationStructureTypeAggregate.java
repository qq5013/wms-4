package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractOrganizationStructureTypeAggregate extends AbstractAggregate implements OrganizationStructureTypeAggregate
{
    private OrganizationStructureTypeState state;

    private List<Event> changes = new ArrayList<Event>();

    public AbstractOrganizationStructureTypeAggregate(OrganizationStructureTypeState state)
    {
        this.state = state;
    }

    public abstract OrganizationStructureTypeState getState();

    public abstract List<Event> getChanges();

    public abstract void create(OrganizationStructureTypeCommand.CreateOrganizationStructureType c);

    public abstract void mergePatch(OrganizationStructureTypeCommand.MergePatchOrganizationStructureType c);

    public abstract void delete(OrganizationStructureTypeCommand.DeleteOrganizationStructureType c);

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getVersion() == null || this.state.getVersion().equals(OrganizationStructureTypeState.VERSION_ZERO))
        {
            if (isCommandCreate((OrganizationStructureTypeCommand)c))
            {
                return;
            }
            throw DomainError.named("premature", "Can't do anything to unexistent aggregate");
        }
        if (this.state.getDeleted())
        {
            throw DomainError.named("zombie", "Can't do anything to deleted aggregate.");
        }
        if (isCommandCreate((OrganizationStructureTypeCommand)c))
            throw DomainError.named("rebirth", "Can't create aggregate that already exists");
    }

    protected void apply(Event e)
    {
        onApplying(e);
        this.state.mutate(e);
        this.changes.add(e);
    }


    private static boolean isCommandCreate(OrganizationStructureTypeCommand c)
    {
        return c.getVersion() == null || c.getVersion().equals(OrganizationStructureTypeState.VERSION_ZERO);
    }


    ////////////////////////

    protected OrganizationStructureTypeStateEvent.OrganizationStructureTypeStateCreated newOrganizationStructureTypeStateCreated(String commandId, String requesterId) {
        OrganizationStructureTypeStateEventId stateEventId = new OrganizationStructureTypeStateEventId(this.state.getId(), this.state.getVersion());
        OrganizationStructureTypeStateEvent.OrganizationStructureTypeStateCreated e = newOrganizationStructureTypeStateCreated(stateEventId);
        ((AbstractOrganizationStructureTypeStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected OrganizationStructureTypeStateEvent.OrganizationStructureTypeStateMergePatched newOrganizationStructureTypeStateMergePatched(String commandId, String requesterId) {
        OrganizationStructureTypeStateEventId stateEventId = new OrganizationStructureTypeStateEventId(this.state.getId(), this.state.getVersion());
        OrganizationStructureTypeStateEvent.OrganizationStructureTypeStateMergePatched e = newOrganizationStructureTypeStateMergePatched(stateEventId);
        ((AbstractOrganizationStructureTypeStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected OrganizationStructureTypeStateEvent.OrganizationStructureTypeStateDeleted newOrganizationStructureTypeStateDeleted(String commandId, String requesterId) {
        OrganizationStructureTypeStateEventId stateEventId = new OrganizationStructureTypeStateEventId(this.state.getId(), this.state.getVersion());
        OrganizationStructureTypeStateEvent.OrganizationStructureTypeStateDeleted e = newOrganizationStructureTypeStateDeleted(stateEventId);
        ((AbstractOrganizationStructureTypeStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected OrganizationStructureTypeStateEvent.OrganizationStructureTypeStateCreated newOrganizationStructureTypeStateCreated(OrganizationStructureTypeStateEventId stateEventId) {
        return new AbstractOrganizationStructureTypeStateEvent.SimpleOrganizationStructureTypeStateCreated(stateEventId);
    }

    protected OrganizationStructureTypeStateEvent.OrganizationStructureTypeStateMergePatched newOrganizationStructureTypeStateMergePatched(OrganizationStructureTypeStateEventId stateEventId) {
        return new AbstractOrganizationStructureTypeStateEvent.SimpleOrganizationStructureTypeStateMergePatched(stateEventId);
    }

    protected OrganizationStructureTypeStateEvent.OrganizationStructureTypeStateDeleted newOrganizationStructureTypeStateDeleted(OrganizationStructureTypeStateEventId stateEventId)
    {
        return new AbstractOrganizationStructureTypeStateEvent.SimpleOrganizationStructureTypeStateDeleted(stateEventId);
    }


}

