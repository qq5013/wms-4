package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractRoleAggregate extends AbstractAggregate implements RoleAggregate
{
    private RoleState state;

    private List<Event> changes = new ArrayList<Event>();

    public AbstractRoleAggregate(RoleState state)
    {
        this.state = state;
    }

    public RoleState getState() {
        return this.state;
    }

    public List<Event> getChanges() {
        return this.changes;
    }

    public void create(RoleCommand.CreateRole c)
    {
        if (c.getVersion() == null) { c.setVersion(RoleState.VERSION_NULL); }
        RoleStateEvent.RoleStateCreated e = map(c);
        apply(e);
    }

    public void mergePatch(RoleCommand.MergePatchRole c)
    {
        RoleStateEvent.RoleStateMergePatched e = map(c);
        apply(e);
    }

    public void delete(RoleCommand.DeleteRole c)
    {
        RoleStateEvent.RoleStateDeleted e = map(c);
        apply(e);
    }

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getVersion() == null)
        {
            if (isCommandCreate((RoleCommand)c))
            {
                return;
            }
            throw DomainError.named("premature", "Can't do anything to unexistent aggregate");
        }
        if (this.state.getDeleted())
        {
            throw DomainError.named("zombie", "Can't do anything to deleted aggregate.");
        }
        if (isCommandCreate((RoleCommand)c))
            throw DomainError.named("rebirth", "Can't create aggregate that already exists");
    }

    protected void apply(Event e)
    {
        onApplying(e);
        state.mutate(e);
        changes.add(e);
    }

    protected RoleStateEvent.RoleStateCreated map(RoleCommand.CreateRole c)
    {
        RoleStateEventId stateEventId = new RoleStateEventId(c.getRoleId(), c.getVersion());
        RoleStateEvent.RoleStateCreated e = newRoleStateCreated(stateEventId);
        e.setName(c.getName());
        e.setDescription(c.getDescription());
        e.setActive(c.getActive());
        ((AbstractRoleStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long version = c.getVersion();
        return e;
    }

    protected RoleStateEvent.RoleStateMergePatched map(RoleCommand.MergePatchRole c)
    {
        RoleStateEventId stateEventId = new RoleStateEventId(c.getRoleId(), c.getVersion());
        RoleStateEvent.RoleStateMergePatched e = newRoleStateMergePatched(stateEventId);
        e.setName(c.getName());
        e.setDescription(c.getDescription());
        e.setActive(c.getActive());
        e.setIsPropertyNameRemoved(c.getIsPropertyNameRemoved());
        e.setIsPropertyDescriptionRemoved(c.getIsPropertyDescriptionRemoved());
        e.setIsPropertyActiveRemoved(c.getIsPropertyActiveRemoved());
        ((AbstractRoleStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long version = c.getVersion();
        return e;
    }

    protected RoleStateEvent.RoleStateDeleted map(RoleCommand.DeleteRole c)
    {
        RoleStateEventId stateEventId = new RoleStateEventId(c.getRoleId(), c.getVersion());
        RoleStateEvent.RoleStateDeleted e = newRoleStateDeleted(stateEventId);
        ((AbstractRoleStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;
    }


    private static boolean isCommandCreate(RoleCommand c)
    {
        return ((c instanceof RoleCommand.CreateRole) 
            && c.getVersion().equals(RoleState.VERSION_NULL));
    }


    ////////////////////////

    protected RoleStateEvent.RoleStateCreated newRoleStateCreated(String commandId, String requesterId) {
        RoleStateEventId stateEventId = new RoleStateEventId(this.state.getRoleId(), this.state.getVersion());
        RoleStateEvent.RoleStateCreated e = newRoleStateCreated(stateEventId);
        ((AbstractRoleStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected RoleStateEvent.RoleStateMergePatched newRoleStateMergePatched(String commandId, String requesterId) {
        RoleStateEventId stateEventId = new RoleStateEventId(this.state.getRoleId(), this.state.getVersion());
        RoleStateEvent.RoleStateMergePatched e = newRoleStateMergePatched(stateEventId);
        ((AbstractRoleStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected RoleStateEvent.RoleStateDeleted newRoleStateDeleted(String commandId, String requesterId) {
        RoleStateEventId stateEventId = new RoleStateEventId(this.state.getRoleId(), this.state.getVersion());
        RoleStateEvent.RoleStateDeleted e = newRoleStateDeleted(stateEventId);
        ((AbstractRoleStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected RoleStateEvent.RoleStateCreated newRoleStateCreated(RoleStateEventId stateEventId) {
        return new AbstractRoleStateEvent.SimpleRoleStateCreated(stateEventId);
    }

    protected RoleStateEvent.RoleStateMergePatched newRoleStateMergePatched(RoleStateEventId stateEventId) {
        return new AbstractRoleStateEvent.SimpleRoleStateMergePatched(stateEventId);
    }

    protected RoleStateEvent.RoleStateDeleted newRoleStateDeleted(RoleStateEventId stateEventId)
    {
        return new AbstractRoleStateEvent.SimpleRoleStateDeleted(stateEventId);
    }


    public static class SimpleRoleAggregate extends AbstractRoleAggregate
    {
        public SimpleRoleAggregate(RoleState state) {
            super(state);
        }
    }

}

