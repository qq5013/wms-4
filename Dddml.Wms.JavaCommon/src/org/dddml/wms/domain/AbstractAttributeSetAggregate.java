package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractAttributeSetAggregate extends AbstractAggregate implements AttributeSetAggregate
{
    private AttributeSetState state;

    private List<Event> changes = new ArrayList<Event>();

    public AbstractAttributeSetAggregate(AttributeSetState state)
    {
        this.state = state;
    }

    public AttributeSetState getState() {
        return this.state;
    }

    public List<Event> getChanges() {
        return this.changes;
    }

    public void create(AttributeSetCommand.CreateAttributeSet c)
    {
        AttributeSetStateEvent.AttributeSetStateCreated e = map(c);
        apply(e);
    }

    public void mergePatch(AttributeSetCommand.MergePatchAttributeSet c)
    {
        AttributeSetStateEvent.AttributeSetStateMergePatched e = map(c);
        apply(e);
    }

    public void delete(AttributeSetCommand.DeleteAttributeSet c)
    {
        AttributeSetStateEvent.AttributeSetStateDeleted e = map(c);
        apply(e);
    }

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getVersion() == null || this.state.getVersion().equals(AttributeSetState.VERSION_ZERO))
        {
            if (isCommandCreate((AttributeSetCommand)c))
            {
                return;
            }
            throw DomainError.named("premature", "Can't do anything to unexistent aggregate");
        }
        if (this.state.getDeleted())
        {
            throw DomainError.named("zombie", "Can't do anything to deleted aggregate.");
        }
        if (isCommandCreate((AttributeSetCommand)c))
            throw DomainError.named("rebirth", "Can't create aggregate that already exists");
    }

    protected void apply(Event e)
    {
        onApplying(e);
        this.state.mutate(e);
        this.changes.add(e);
    }

    protected AttributeSetStateEvent.AttributeSetStateCreated map(AttributeSetCommand.CreateAttributeSet c)
    {
        AttributeSetStateEventId stateEventId = new AttributeSetStateEventId(c.getAttributeSetId(), c.getVersion());
        AttributeSetStateEvent.AttributeSetStateCreated e = newAttributeSetStateCreated(stateEventId);
        e.setName(c.getName());
        e.setOrganizationId(c.getOrganizationId());
        e.setDescription(c.getDescription());
        e.setSerialNumberAttributeId(c.getSerialNumberAttributeId());
        e.setLotAttributeId(c.getLotAttributeId());
        e.setReferenceId(c.getReferenceId());
        e.setActive(c.getActive());
        ((AbstractAttributeSetStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long version = c.getVersion();
        for (AttributeUseCommand.CreateAttributeUse innerCommand : c.getAttributeUses())
        {
            throwOnInconsistentCommands(c, innerCommand);
            AttributeUseStateEvent.AttributeUseStateCreated innerEvent = mapCreate(innerCommand, c, version, this.state);
            e.addAttributeUseEvent(innerEvent);
        }

        return e;
    }

    protected AttributeSetStateEvent.AttributeSetStateMergePatched map(AttributeSetCommand.MergePatchAttributeSet c)
    {
        AttributeSetStateEventId stateEventId = new AttributeSetStateEventId(c.getAttributeSetId(), c.getVersion());
        AttributeSetStateEvent.AttributeSetStateMergePatched e = newAttributeSetStateMergePatched(stateEventId);
        e.setName(c.getName());
        e.setOrganizationId(c.getOrganizationId());
        e.setDescription(c.getDescription());
        e.setSerialNumberAttributeId(c.getSerialNumberAttributeId());
        e.setLotAttributeId(c.getLotAttributeId());
        e.setReferenceId(c.getReferenceId());
        e.setActive(c.getActive());
        e.setIsPropertyNameRemoved(c.getIsPropertyNameRemoved());
        e.setIsPropertyOrganizationIdRemoved(c.getIsPropertyOrganizationIdRemoved());
        e.setIsPropertyDescriptionRemoved(c.getIsPropertyDescriptionRemoved());
        e.setIsPropertySerialNumberAttributeIdRemoved(c.getIsPropertySerialNumberAttributeIdRemoved());
        e.setIsPropertyLotAttributeIdRemoved(c.getIsPropertyLotAttributeIdRemoved());
        e.setIsPropertyReferenceIdRemoved(c.getIsPropertyReferenceIdRemoved());
        e.setIsPropertyActiveRemoved(c.getIsPropertyActiveRemoved());
        ((AbstractAttributeSetStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long version = c.getVersion();
        for (AttributeUseCommand innerCommand : c.getAttributeUseCommands())
        {
            throwOnInconsistentCommands(c, innerCommand);
            AttributeUseStateEvent innerEvent = map(innerCommand, c, version, this.state);
            e.addAttributeUseEvent(innerEvent);
        }

        return e;
    }

    protected AttributeSetStateEvent.AttributeSetStateDeleted map(AttributeSetCommand.DeleteAttributeSet c)
    {
        AttributeSetStateEventId stateEventId = new AttributeSetStateEventId(c.getAttributeSetId(), c.getVersion());
        AttributeSetStateEvent.AttributeSetStateDeleted e = newAttributeSetStateDeleted(stateEventId);
        ((AbstractAttributeSetStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;
    }


    protected AttributeUseStateEvent map(AttributeUseCommand c, AttributeSetCommand outerCommand, long version, AttributeSetState outerState)
    {
        AttributeUseCommand.CreateAttributeUse create = (c.getCommandType().equals(CommandType.CREATE)) ? ((AttributeUseCommand.CreateAttributeUse)c) : null;
        if(create != null)
        {
            return mapCreate(create, outerCommand, version, outerState);
        }

        AttributeUseCommand.MergePatchAttributeUse merge = (c.getCommandType().equals(CommandType.MERGE_PATCH)) ? ((AttributeUseCommand.MergePatchAttributeUse)c) : null;
        if(merge != null)
        {
            return mapMergePatch(merge, outerCommand, version, outerState);
        }

        AttributeUseCommand.RemoveAttributeUse remove = (c.getCommandType().equals(CommandType.REMOVE)) ? ((AttributeUseCommand.RemoveAttributeUse)c) : null;
        if (remove != null)
        {
            return mapRemove(remove, outerCommand, version);
        }
        throw new UnsupportedOperationException();
    }

    protected AttributeUseStateEvent.AttributeUseStateCreated mapCreate(AttributeUseCommand.CreateAttributeUse c, AttributeSetCommand outerCommand, Long version, AttributeSetState outerState)
    {
        ((AbstractCommand)c).setRequesterId(outerCommand.getRequesterId());
        AttributeUseStateEventId stateEventId = new AttributeUseStateEventId(c.getAttributeSetId(), c.getAttributeId(), version);
        AttributeUseStateEvent.AttributeUseStateCreated e = newAttributeUseStateCreated(stateEventId);
        AttributeUseState s = outerState.getAttributeUses().get(c.getAttributeId());

        e.setSequenceNumber(c.getSequenceNumber());
        e.setActive(c.getActive());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;

    }// END map(ICreate... ////////////////////////////

    protected AttributeUseStateEvent.AttributeUseStateMergePatched mapMergePatch(AttributeUseCommand.MergePatchAttributeUse c, AttributeSetCommand outerCommand, Long version, AttributeSetState outerState)
    {
        ((AbstractCommand)c).setRequesterId(outerCommand.getRequesterId());
        AttributeUseStateEventId stateEventId = new AttributeUseStateEventId(c.getAttributeSetId(), c.getAttributeId(), version);
        AttributeUseStateEvent.AttributeUseStateMergePatched e = newAttributeUseStateMergePatched(stateEventId);
        AttributeUseState s = outerState.getAttributeUses().get(c.getAttributeId());

        e.setSequenceNumber(c.getSequenceNumber());
        e.setActive(c.getActive());
        e.setIsPropertySequenceNumberRemoved(c.getIsPropertySequenceNumberRemoved());
        e.setIsPropertyActiveRemoved(c.getIsPropertyActiveRemoved());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;

    }// END map(IMergePatch... ////////////////////////////

    protected AttributeUseStateEvent.AttributeUseStateRemoved mapRemove(AttributeUseCommand.RemoveAttributeUse c, AttributeSetCommand outerCommand, Long version)
    {
        ((AbstractCommand)c).setRequesterId(outerCommand.getRequesterId());
        AttributeUseStateEventId stateEventId = new AttributeUseStateEventId(c.getAttributeSetId(), c.getAttributeId(), version);
        AttributeUseStateEvent.AttributeUseStateRemoved e = newAttributeUseStateRemoved(stateEventId);

        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());

        return e;

    }// END map(IRemove... ////////////////////////////

    protected void throwOnInconsistentCommands(AttributeSetCommand command, AttributeUseCommand innerCommand)
    {
        AbstractAttributeSetCommand properties = command instanceof AbstractAttributeSetCommand ? (AbstractAttributeSetCommand) command : null;
        AbstractAttributeUseCommand innerProperties = innerCommand instanceof AbstractAttributeUseCommand ? (AbstractAttributeUseCommand) innerCommand : null;
        if (properties == null || innerProperties == null) { return; }
        String outerAttributeSetIdName = "AttributeSetId";
        String outerAttributeSetIdValue = properties.getAttributeSetId();
        String innerAttributeSetIdName = "AttributeSetId";
        String innerAttributeSetIdValue = innerProperties.getAttributeSetId();
        if (innerAttributeSetIdValue == null) {
            innerProperties.setAttributeSetId(outerAttributeSetIdValue);
        }
        else if (innerAttributeSetIdValue != outerAttributeSetIdValue && innerAttributeSetIdValue != null && !innerAttributeSetIdValue.equals(outerAttributeSetIdValue)) {
            throw DomainError.named("inconsistentId", "Outer %1$s %2$s NOT equals inner %3$s %4$s", outerAttributeSetIdName, outerAttributeSetIdValue, innerAttributeSetIdName, innerAttributeSetIdValue);
        }
    }// END throwOnInconsistentCommands /////////////////////


    private static boolean isCommandCreate(AttributeSetCommand c)
    {
        return c.getVersion() == null || c.getVersion().equals(AttributeSetState.VERSION_ZERO);
    }


    ////////////////////////

    protected AttributeSetStateEvent.AttributeSetStateCreated newAttributeSetStateCreated(String commandId, String requesterId) {
        AttributeSetStateEventId stateEventId = new AttributeSetStateEventId(this.state.getAttributeSetId(), this.state.getVersion());
        AttributeSetStateEvent.AttributeSetStateCreated e = newAttributeSetStateCreated(stateEventId);
        ((AbstractAttributeSetStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected AttributeSetStateEvent.AttributeSetStateMergePatched newAttributeSetStateMergePatched(String commandId, String requesterId) {
        AttributeSetStateEventId stateEventId = new AttributeSetStateEventId(this.state.getAttributeSetId(), this.state.getVersion());
        AttributeSetStateEvent.AttributeSetStateMergePatched e = newAttributeSetStateMergePatched(stateEventId);
        ((AbstractAttributeSetStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected AttributeSetStateEvent.AttributeSetStateDeleted newAttributeSetStateDeleted(String commandId, String requesterId) {
        AttributeSetStateEventId stateEventId = new AttributeSetStateEventId(this.state.getAttributeSetId(), this.state.getVersion());
        AttributeSetStateEvent.AttributeSetStateDeleted e = newAttributeSetStateDeleted(stateEventId);
        ((AbstractAttributeSetStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected AttributeSetStateEvent.AttributeSetStateCreated newAttributeSetStateCreated(AttributeSetStateEventId stateEventId) {
        return new AbstractAttributeSetStateEvent.SimpleAttributeSetStateCreated(stateEventId);
    }

    protected AttributeSetStateEvent.AttributeSetStateMergePatched newAttributeSetStateMergePatched(AttributeSetStateEventId stateEventId) {
        return new AbstractAttributeSetStateEvent.SimpleAttributeSetStateMergePatched(stateEventId);
    }

    protected AttributeSetStateEvent.AttributeSetStateDeleted newAttributeSetStateDeleted(AttributeSetStateEventId stateEventId)
    {
        return new AbstractAttributeSetStateEvent.SimpleAttributeSetStateDeleted(stateEventId);
    }

    protected AttributeUseStateEvent.AttributeUseStateCreated newAttributeUseStateCreated(AttributeUseStateEventId stateEventId) {
        return new AbstractAttributeUseStateEvent.SimpleAttributeUseStateCreated(stateEventId);
    }

    protected AttributeUseStateEvent.AttributeUseStateMergePatched newAttributeUseStateMergePatched(AttributeUseStateEventId stateEventId) {
        return new AbstractAttributeUseStateEvent.SimpleAttributeUseStateMergePatched(stateEventId);
    }

    protected AttributeUseStateEvent.AttributeUseStateRemoved newAttributeUseStateRemoved(AttributeUseStateEventId stateEventId)
    {
        return new AbstractAttributeUseStateEvent.SimpleAttributeUseStateRemoved(stateEventId);
    }


    public static class SimpleAttributeSetAggregate extends AbstractAttributeSetAggregate
    {
        public SimpleAttributeSetAggregate(AttributeSetState state) {
            super(state);
        }
    }

}

