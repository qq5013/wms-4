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

    public abstract PermissionState getState();

    public abstract List<Event> getChanges();

    public abstract void create(PermissionCommand.CreatePermission c);

    public abstract void mergePatch(PermissionCommand.MergePatchPermission c);

    public abstract void delete(PermissionCommand.DeletePermission c);

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getVersion() == null || this.state.getVersion().equals(PermissionState.VERSION_ZERO))
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
        this.state.mutate(e);
        this.changes.add(e);
    }


    private static boolean isCommandCreate(PermissionCommand c)
    {
        return c.getVersion() == null || c.getVersion().equals(PermissionState.VERSION_ZERO);
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


}

