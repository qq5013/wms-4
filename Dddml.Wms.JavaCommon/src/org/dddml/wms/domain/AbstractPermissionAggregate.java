package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractPermissionAggregate extends AbstractAggregate implements PermissionAggregate
{
    private PermissionState state;

    private List<Event> changes = new ArrayList<Event>();

    public AbstractPermissionAggregate(PermissionState state)
    {
        this.state = state;
    }

    public PermissionState getState() {
        return this.state;
    }

    public List<Event> getChanges() {
        return this.changes;
    }

    public void create(PermissionCommand.CreatePermission c)
    {
        if (c.getVersion() == null) { c.setVersion(PermissionState.VERSION_NULL); }
        PermissionStateEvent.PermissionStateCreated e = map(c);
        apply(e);
    }

    public void mergePatch(PermissionCommand.MergePatchPermission c)
    {
        PermissionStateEvent.PermissionStateMergePatched e = map(c);
        apply(e);
    }

    public void delete(PermissionCommand.DeletePermission c)
    {
        PermissionStateEvent.PermissionStateDeleted e = map(c);
        apply(e);
    }

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getVersion() == null)
        {
            if (isCommandCreate((PermissionCommand)c))
            {
                return;
            }
            throw DomainError.named("premature", "Can't do anything to unexistent aggregate");
        }
        if (this.state.getDeleted())
        {
            throw DomainError.named("zombie", "Can't do anything to deleted aggregate.");
        }
        if (isCommandCreate((PermissionCommand)c))
            throw DomainError.named("rebirth", "Can't create aggregate that already exists");
    }

    protected void apply(Event e)
    {
        onApplying(e);
        state.mutate(e);
        changes.add(e);
    }

    protected PermissionStateEvent.PermissionStateCreated map(PermissionCommand.CreatePermission c)
    {
        PermissionStateEventId stateEventId = new PermissionStateEventId(c.getPermissionId(), c.getVersion());
        PermissionStateEvent.PermissionStateCreated e = newPermissionStateCreated(stateEventId);
        e.setName(c.getName());
        e.setParentPermissionId(c.getParentPermissionId());
        e.setDescription(c.getDescription());
        e.setActive(c.getActive());
        ((AbstractPermissionStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long version = c.getVersion();
        return e;
    }

    protected PermissionStateEvent.PermissionStateMergePatched map(PermissionCommand.MergePatchPermission c)
    {
        PermissionStateEventId stateEventId = new PermissionStateEventId(c.getPermissionId(), c.getVersion());
        PermissionStateEvent.PermissionStateMergePatched e = newPermissionStateMergePatched(stateEventId);
        e.setName(c.getName());
        e.setParentPermissionId(c.getParentPermissionId());
        e.setDescription(c.getDescription());
        e.setActive(c.getActive());
        e.setIsPropertyNameRemoved(c.getIsPropertyNameRemoved());
        e.setIsPropertyParentPermissionIdRemoved(c.getIsPropertyParentPermissionIdRemoved());
        e.setIsPropertyDescriptionRemoved(c.getIsPropertyDescriptionRemoved());
        e.setIsPropertyActiveRemoved(c.getIsPropertyActiveRemoved());
        ((AbstractPermissionStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long version = c.getVersion();
        return e;
    }

    protected PermissionStateEvent.PermissionStateDeleted map(PermissionCommand.DeletePermission c)
    {
        PermissionStateEventId stateEventId = new PermissionStateEventId(c.getPermissionId(), c.getVersion());
        PermissionStateEvent.PermissionStateDeleted e = newPermissionStateDeleted(stateEventId);
        ((AbstractPermissionStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;
    }


    private static boolean isCommandCreate(PermissionCommand c)
    {
        return ((c instanceof PermissionCommand.CreatePermission) 
            && c.getVersion().equals(PermissionState.VERSION_NULL));
    }


    ////////////////////////

    protected PermissionStateEvent.PermissionStateCreated newPermissionStateCreated(String commandId, String requesterId) {
        PermissionStateEventId stateEventId = new PermissionStateEventId(this.state.getPermissionId(), this.state.getVersion());
        PermissionStateEvent.PermissionStateCreated e = newPermissionStateCreated(stateEventId);
        ((AbstractPermissionStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected PermissionStateEvent.PermissionStateMergePatched newPermissionStateMergePatched(String commandId, String requesterId) {
        PermissionStateEventId stateEventId = new PermissionStateEventId(this.state.getPermissionId(), this.state.getVersion());
        PermissionStateEvent.PermissionStateMergePatched e = newPermissionStateMergePatched(stateEventId);
        ((AbstractPermissionStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected PermissionStateEvent.PermissionStateDeleted newPermissionStateDeleted(String commandId, String requesterId) {
        PermissionStateEventId stateEventId = new PermissionStateEventId(this.state.getPermissionId(), this.state.getVersion());
        PermissionStateEvent.PermissionStateDeleted e = newPermissionStateDeleted(stateEventId);
        ((AbstractPermissionStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected PermissionStateEvent.PermissionStateCreated newPermissionStateCreated(PermissionStateEventId stateEventId) {
        return new AbstractPermissionStateEvent.SimplePermissionStateCreated(stateEventId);
    }

    protected PermissionStateEvent.PermissionStateMergePatched newPermissionStateMergePatched(PermissionStateEventId stateEventId) {
        return new AbstractPermissionStateEvent.SimplePermissionStateMergePatched(stateEventId);
    }

    protected PermissionStateEvent.PermissionStateDeleted newPermissionStateDeleted(PermissionStateEventId stateEventId)
    {
        return new AbstractPermissionStateEvent.SimplePermissionStateDeleted(stateEventId);
    }


    public static class SimplePermissionAggregate extends AbstractPermissionAggregate
    {
        public SimplePermissionAggregate(PermissionState state) {
            super(state);
        }
    }

}

