package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractAttributeUseMvoAggregate extends AbstractAggregate implements AttributeUseMvoAggregate
{
    private AttributeUseMvoState state;

    private List<Event> changes = new ArrayList<Event>();

    public AbstractAttributeUseMvoAggregate(AttributeUseMvoState state)
    {
        this.state = state;
    }

    public AttributeUseMvoState getState() {
        return this.state;
    }

    public List<Event> getChanges() {
        return this.changes;
    }

    public void create(AttributeUseMvoCommand.CreateAttributeUseMvo c)
    {
        AttributeUseMvoStateEvent.AttributeUseMvoStateCreated e = map(c);
        apply(e);
    }

    public void mergePatch(AttributeUseMvoCommand.MergePatchAttributeUseMvo c)
    {
        AttributeUseMvoStateEvent.AttributeUseMvoStateMergePatched e = map(c);
        apply(e);
    }

    public void delete(AttributeUseMvoCommand.DeleteAttributeUseMvo c)
    {
        AttributeUseMvoStateEvent.AttributeUseMvoStateDeleted e = map(c);
        apply(e);
    }

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getAttributeSetVersion() == null || this.state.getAttributeSetVersion().equals(AttributeUseMvoState.VERSION_ZERO))
        {
            if (isCommandCreate((AttributeUseMvoCommand)c))
            {
                return;
            }
            throw DomainError.named("premature", "Can't do anything to unexistent aggregate");
        }
        if (this.state.getDeleted())
        {
            throw DomainError.named("zombie", "Can't do anything to deleted aggregate.");
        }
        if (isCommandCreate((AttributeUseMvoCommand)c))
            throw DomainError.named("rebirth", "Can't create aggregate that already exists");
    }

    protected void apply(Event e)
    {
        onApplying(e);
        this.state.mutate(e);
        this.changes.add(e);
    }

    protected AttributeUseMvoStateEvent.AttributeUseMvoStateCreated map(AttributeUseMvoCommand.CreateAttributeUseMvo c)
    {
        AttributeUseMvoStateEventId stateEventId = new AttributeUseMvoStateEventId(c.getAttributeSetAttributeUseId(), c.getAttributeSetVersion());
        AttributeUseMvoStateEvent.AttributeUseMvoStateCreated e = newAttributeUseMvoStateCreated(stateEventId);
        e.setSequenceNumber(c.getSequenceNumber());
        e.setVersion(c.getVersion());
        e.setActive(c.getActive());
        e.setAttributeSetName(c.getAttributeSetName());
        e.setAttributeSetOrganizationId(c.getAttributeSetOrganizationId());
        e.setAttributeSetDescription(c.getAttributeSetDescription());
        e.setAttributeSetSerialNumberAttributeId(c.getAttributeSetSerialNumberAttributeId());
        e.setAttributeSetLotAttributeId(c.getAttributeSetLotAttributeId());
        e.setAttributeSetReferenceId(c.getAttributeSetReferenceId());
        e.setAttributeSetCreatedBy(c.getAttributeSetCreatedBy());
        e.setAttributeSetCreatedAt(c.getAttributeSetCreatedAt());
        e.setAttributeSetUpdatedBy(c.getAttributeSetUpdatedBy());
        e.setAttributeSetUpdatedAt(c.getAttributeSetUpdatedAt());
        e.setAttributeSetActive(c.getAttributeSetActive());
        e.setAttributeSetDeleted(c.getAttributeSetDeleted());
        ((AbstractAttributeUseMvoStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long attributeSetVersion = c.getAttributeSetVersion();
        return e;
    }

    protected AttributeUseMvoStateEvent.AttributeUseMvoStateMergePatched map(AttributeUseMvoCommand.MergePatchAttributeUseMvo c)
    {
        AttributeUseMvoStateEventId stateEventId = new AttributeUseMvoStateEventId(c.getAttributeSetAttributeUseId(), c.getAttributeSetVersion());
        AttributeUseMvoStateEvent.AttributeUseMvoStateMergePatched e = newAttributeUseMvoStateMergePatched(stateEventId);
        e.setSequenceNumber(c.getSequenceNumber());
        e.setVersion(c.getVersion());
        e.setActive(c.getActive());
        e.setAttributeSetName(c.getAttributeSetName());
        e.setAttributeSetOrganizationId(c.getAttributeSetOrganizationId());
        e.setAttributeSetDescription(c.getAttributeSetDescription());
        e.setAttributeSetSerialNumberAttributeId(c.getAttributeSetSerialNumberAttributeId());
        e.setAttributeSetLotAttributeId(c.getAttributeSetLotAttributeId());
        e.setAttributeSetReferenceId(c.getAttributeSetReferenceId());
        e.setAttributeSetCreatedBy(c.getAttributeSetCreatedBy());
        e.setAttributeSetCreatedAt(c.getAttributeSetCreatedAt());
        e.setAttributeSetUpdatedBy(c.getAttributeSetUpdatedBy());
        e.setAttributeSetUpdatedAt(c.getAttributeSetUpdatedAt());
        e.setAttributeSetActive(c.getAttributeSetActive());
        e.setAttributeSetDeleted(c.getAttributeSetDeleted());
        e.setIsPropertySequenceNumberRemoved(c.getIsPropertySequenceNumberRemoved());
        e.setIsPropertyVersionRemoved(c.getIsPropertyVersionRemoved());
        e.setIsPropertyActiveRemoved(c.getIsPropertyActiveRemoved());
        e.setIsPropertyAttributeSetNameRemoved(c.getIsPropertyAttributeSetNameRemoved());
        e.setIsPropertyAttributeSetOrganizationIdRemoved(c.getIsPropertyAttributeSetOrganizationIdRemoved());
        e.setIsPropertyAttributeSetDescriptionRemoved(c.getIsPropertyAttributeSetDescriptionRemoved());
        e.setIsPropertyAttributeSetSerialNumberAttributeIdRemoved(c.getIsPropertyAttributeSetSerialNumberAttributeIdRemoved());
        e.setIsPropertyAttributeSetLotAttributeIdRemoved(c.getIsPropertyAttributeSetLotAttributeIdRemoved());
        e.setIsPropertyAttributeSetReferenceIdRemoved(c.getIsPropertyAttributeSetReferenceIdRemoved());
        e.setIsPropertyAttributeSetCreatedByRemoved(c.getIsPropertyAttributeSetCreatedByRemoved());
        e.setIsPropertyAttributeSetCreatedAtRemoved(c.getIsPropertyAttributeSetCreatedAtRemoved());
        e.setIsPropertyAttributeSetUpdatedByRemoved(c.getIsPropertyAttributeSetUpdatedByRemoved());
        e.setIsPropertyAttributeSetUpdatedAtRemoved(c.getIsPropertyAttributeSetUpdatedAtRemoved());
        e.setIsPropertyAttributeSetActiveRemoved(c.getIsPropertyAttributeSetActiveRemoved());
        e.setIsPropertyAttributeSetDeletedRemoved(c.getIsPropertyAttributeSetDeletedRemoved());
        ((AbstractAttributeUseMvoStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long attributeSetVersion = c.getAttributeSetVersion();
        return e;
    }

    protected AttributeUseMvoStateEvent.AttributeUseMvoStateDeleted map(AttributeUseMvoCommand.DeleteAttributeUseMvo c)
    {
        AttributeUseMvoStateEventId stateEventId = new AttributeUseMvoStateEventId(c.getAttributeSetAttributeUseId(), c.getAttributeSetVersion());
        AttributeUseMvoStateEvent.AttributeUseMvoStateDeleted e = newAttributeUseMvoStateDeleted(stateEventId);
        ((AbstractAttributeUseMvoStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;
    }


    private static boolean isCommandCreate(AttributeUseMvoCommand c)
    {
        return c.getAttributeSetVersion() == null || c.getAttributeSetVersion().equals(AttributeUseMvoState.VERSION_ZERO);
    }


    ////////////////////////

    protected AttributeUseMvoStateEvent.AttributeUseMvoStateCreated newAttributeUseMvoStateCreated(String commandId, String requesterId) {
        AttributeUseMvoStateEventId stateEventId = new AttributeUseMvoStateEventId(this.state.getAttributeSetAttributeUseId(), this.state.getAttributeSetVersion());
        AttributeUseMvoStateEvent.AttributeUseMvoStateCreated e = newAttributeUseMvoStateCreated(stateEventId);
        ((AbstractAttributeUseMvoStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected AttributeUseMvoStateEvent.AttributeUseMvoStateMergePatched newAttributeUseMvoStateMergePatched(String commandId, String requesterId) {
        AttributeUseMvoStateEventId stateEventId = new AttributeUseMvoStateEventId(this.state.getAttributeSetAttributeUseId(), this.state.getAttributeSetVersion());
        AttributeUseMvoStateEvent.AttributeUseMvoStateMergePatched e = newAttributeUseMvoStateMergePatched(stateEventId);
        ((AbstractAttributeUseMvoStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected AttributeUseMvoStateEvent.AttributeUseMvoStateDeleted newAttributeUseMvoStateDeleted(String commandId, String requesterId) {
        AttributeUseMvoStateEventId stateEventId = new AttributeUseMvoStateEventId(this.state.getAttributeSetAttributeUseId(), this.state.getAttributeSetVersion());
        AttributeUseMvoStateEvent.AttributeUseMvoStateDeleted e = newAttributeUseMvoStateDeleted(stateEventId);
        ((AbstractAttributeUseMvoStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected AttributeUseMvoStateEvent.AttributeUseMvoStateCreated newAttributeUseMvoStateCreated(AttributeUseMvoStateEventId stateEventId) {
        return new AbstractAttributeUseMvoStateEvent.SimpleAttributeUseMvoStateCreated(stateEventId);
    }

    protected AttributeUseMvoStateEvent.AttributeUseMvoStateMergePatched newAttributeUseMvoStateMergePatched(AttributeUseMvoStateEventId stateEventId) {
        return new AbstractAttributeUseMvoStateEvent.SimpleAttributeUseMvoStateMergePatched(stateEventId);
    }

    protected AttributeUseMvoStateEvent.AttributeUseMvoStateDeleted newAttributeUseMvoStateDeleted(AttributeUseMvoStateEventId stateEventId)
    {
        return new AbstractAttributeUseMvoStateEvent.SimpleAttributeUseMvoStateDeleted(stateEventId);
    }


    public static class SimpleAttributeUseMvoAggregate extends AbstractAttributeUseMvoAggregate
    {
        public SimpleAttributeUseMvoAggregate(AttributeUseMvoState state) {
            super(state);
        }
    }

}

