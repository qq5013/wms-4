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

    public abstract RoleState getState();

    public abstract List<Event> getChanges();

    public abstract void create(RoleCommand.CreateRole c);

    public abstract void mergePatch(RoleCommand.MergePatchRole c);

    public abstract void delete(RoleCommand.DeleteRole c);

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getVersion() == null || this.state.getVersion().equals(RoleState.VERSION_ZERO))
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
        this.state.mutate(e);
        this.changes.add(e);
    }


    private static boolean isCommandCreate(RoleCommand c)
    {
        return c.getVersion() == null || c.getVersion().equals(RoleState.VERSION_ZERO);
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


}

