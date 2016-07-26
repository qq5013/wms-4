package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractAttributeSetInstanceExtensionFieldMvoAggregate extends AbstractAggregate implements AttributeSetInstanceExtensionFieldMvoAggregate
{
    private AttributeSetInstanceExtensionFieldMvoState state;

    private List<Event> changes = new ArrayList<Event>();

    public AbstractAttributeSetInstanceExtensionFieldMvoAggregate(AttributeSetInstanceExtensionFieldMvoState state)
    {
        this.state = state;
    }

    public abstract AttributeSetInstanceExtensionFieldMvoState getState();

    public abstract List<Event> getChanges();

    public abstract void create(AttributeSetInstanceExtensionFieldMvoCommand.CreateAttributeSetInstanceExtensionFieldMvo c);

    public abstract void mergePatch(AttributeSetInstanceExtensionFieldMvoCommand.MergePatchAttributeSetInstanceExtensionFieldMvo c);

    public abstract void delete(AttributeSetInstanceExtensionFieldMvoCommand.DeleteAttributeSetInstanceExtensionFieldMvo c);

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getAttrSetInstEFGroupVersion() == null || this.state.getAttrSetInstEFGroupVersion().equals(AttributeSetInstanceExtensionFieldMvoState.VERSION_ZERO))
        {
            if (isCommandCreate((AttributeSetInstanceExtensionFieldMvoCommand)c))
            {
                return;
            }
            throw DomainError.named("premature", "Can't do anything to unexistent aggregate");
        }
        if (this.state.getDeleted())
        {
            throw DomainError.named("zombie", "Can't do anything to deleted aggregate.");
        }
        if (isCommandCreate((AttributeSetInstanceExtensionFieldMvoCommand)c))
            throw DomainError.named("rebirth", "Can't create aggregate that already exists");
    }

    protected void apply(Event e)
    {
        onApplying(e);
        this.state.mutate(e);
        this.changes.add(e);
    }


    private static boolean isCommandCreate(AttributeSetInstanceExtensionFieldMvoCommand c)
    {
        return c.getAttrSetInstEFGroupVersion() == null || c.getAttrSetInstEFGroupVersion().equals(AttributeSetInstanceExtensionFieldMvoState.VERSION_ZERO);
    }


    ////////////////////////

    protected AttributeSetInstanceExtensionFieldMvoStateEvent.AttributeSetInstanceExtensionFieldMvoStateCreated newAttributeSetInstanceExtensionFieldMvoStateCreated(String commandId, String requesterId) {
        AttributeSetInstanceExtensionFieldMvoStateEventId stateEventId = new AttributeSetInstanceExtensionFieldMvoStateEventId(this.state.getAttributeSetInstanceExtensionFieldId(), this.state.getAttrSetInstEFGroupVersion());
        AttributeSetInstanceExtensionFieldMvoStateEvent.AttributeSetInstanceExtensionFieldMvoStateCreated e = newAttributeSetInstanceExtensionFieldMvoStateCreated(stateEventId);
        ((AbstractAttributeSetInstanceExtensionFieldMvoStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected AttributeSetInstanceExtensionFieldMvoStateEvent.AttributeSetInstanceExtensionFieldMvoStateMergePatched newAttributeSetInstanceExtensionFieldMvoStateMergePatched(String commandId, String requesterId) {
        AttributeSetInstanceExtensionFieldMvoStateEventId stateEventId = new AttributeSetInstanceExtensionFieldMvoStateEventId(this.state.getAttributeSetInstanceExtensionFieldId(), this.state.getAttrSetInstEFGroupVersion());
        AttributeSetInstanceExtensionFieldMvoStateEvent.AttributeSetInstanceExtensionFieldMvoStateMergePatched e = newAttributeSetInstanceExtensionFieldMvoStateMergePatched(stateEventId);
        ((AbstractAttributeSetInstanceExtensionFieldMvoStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected AttributeSetInstanceExtensionFieldMvoStateEvent.AttributeSetInstanceExtensionFieldMvoStateDeleted newAttributeSetInstanceExtensionFieldMvoStateDeleted(String commandId, String requesterId) {
        AttributeSetInstanceExtensionFieldMvoStateEventId stateEventId = new AttributeSetInstanceExtensionFieldMvoStateEventId(this.state.getAttributeSetInstanceExtensionFieldId(), this.state.getAttrSetInstEFGroupVersion());
        AttributeSetInstanceExtensionFieldMvoStateEvent.AttributeSetInstanceExtensionFieldMvoStateDeleted e = newAttributeSetInstanceExtensionFieldMvoStateDeleted(stateEventId);
        ((AbstractAttributeSetInstanceExtensionFieldMvoStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected AttributeSetInstanceExtensionFieldMvoStateEvent.AttributeSetInstanceExtensionFieldMvoStateCreated newAttributeSetInstanceExtensionFieldMvoStateCreated(AttributeSetInstanceExtensionFieldMvoStateEventId stateEventId) {
        return new AbstractAttributeSetInstanceExtensionFieldMvoStateEvent.SimpleAttributeSetInstanceExtensionFieldMvoStateCreated(stateEventId);
    }

    protected AttributeSetInstanceExtensionFieldMvoStateEvent.AttributeSetInstanceExtensionFieldMvoStateMergePatched newAttributeSetInstanceExtensionFieldMvoStateMergePatched(AttributeSetInstanceExtensionFieldMvoStateEventId stateEventId) {
        return new AbstractAttributeSetInstanceExtensionFieldMvoStateEvent.SimpleAttributeSetInstanceExtensionFieldMvoStateMergePatched(stateEventId);
    }

    protected AttributeSetInstanceExtensionFieldMvoStateEvent.AttributeSetInstanceExtensionFieldMvoStateDeleted newAttributeSetInstanceExtensionFieldMvoStateDeleted(AttributeSetInstanceExtensionFieldMvoStateEventId stateEventId)
    {
        return new AbstractAttributeSetInstanceExtensionFieldMvoStateEvent.SimpleAttributeSetInstanceExtensionFieldMvoStateDeleted(stateEventId);
    }


}

