package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractAttributeAggregate extends AbstractAggregate implements AttributeAggregate
{
    private AttributeState state;

    private List<Event> changes = new ArrayList<Event>();

    public AbstractAttributeAggregate(AttributeState state)
    {
        this.state = state;
    }

    public AttributeState getState() {
        return this.state;
    }

    public List<Event> getChanges() {
        return this.changes;
    }

    public void create(AttributeCommand.CreateAttribute c)
    {
        if (c.getVersion() == null) { c.setVersion(AttributeState.VERSION_NULL); }
        AttributeStateEvent.AttributeStateCreated e = map(c);
        apply(e);
    }

    public void mergePatch(AttributeCommand.MergePatchAttribute c)
    {
        AttributeStateEvent.AttributeStateMergePatched e = map(c);
        apply(e);
    }

    public void delete(AttributeCommand.DeleteAttribute c)
    {
        AttributeStateEvent.AttributeStateDeleted e = map(c);
        apply(e);
    }

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getVersion() == null)
        {
            if (isCommandCreate((AttributeCommand)c))
            {
                return;
            }
            throw DomainError.named("premature", "Can't do anything to unexistent aggregate");
        }
        if (this.state.getDeleted())
        {
            throw DomainError.named("zombie", "Can't do anything to deleted aggregate.");
        }
        if (isCommandCreate((AttributeCommand)c))
            throw DomainError.named("rebirth", "Can't create aggregate that already exists");
    }

    protected void apply(Event e)
    {
        onApplying(e);
        state.mutate(e);
        changes.add(e);
    }

    protected AttributeStateEvent.AttributeStateCreated map(AttributeCommand.CreateAttribute c)
    {
        AttributeStateEventId stateEventId = new AttributeStateEventId(c.getAttributeId(), c.getVersion());
        AttributeStateEvent.AttributeStateCreated e = newAttributeStateCreated(stateEventId);
        e.setName(c.getName());
        e.setOrganizationId(c.getOrganizationId());
        e.setDescription(c.getDescription());
        e.setIsMandatory(c.getIsMandatory());
        e.setIsInstanceAttribute(c.getIsInstanceAttribute());
        e.setAttributeValueType(c.getAttributeValueType());
        e.setAttributeValueLength(c.getAttributeValueLength());
        e.setIsList(c.getIsList());
        e.setFieldName(c.getFieldName());
        e.setReferenceId(c.getReferenceId());
        e.setActive(c.getActive());
        ((AbstractAttributeStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long version = c.getVersion();
        for (AttributeValueCommand.CreateAttributeValue innerCommand : c.getAttributeValues())
        {
            throwOnInconsistentCommands(c, innerCommand);
            AttributeValueStateEvent.AttributeValueStateCreated innerEvent = mapCreate(innerCommand, c, version, this.state);
            e.addAttributeValueEvent(innerEvent);
        }

        return e;
    }

    protected AttributeStateEvent.AttributeStateMergePatched map(AttributeCommand.MergePatchAttribute c)
    {
        AttributeStateEventId stateEventId = new AttributeStateEventId(c.getAttributeId(), c.getVersion());
        AttributeStateEvent.AttributeStateMergePatched e = newAttributeStateMergePatched(stateEventId);
        e.setName(c.getName());
        e.setOrganizationId(c.getOrganizationId());
        e.setDescription(c.getDescription());
        e.setIsMandatory(c.getIsMandatory());
        e.setIsInstanceAttribute(c.getIsInstanceAttribute());
        e.setAttributeValueType(c.getAttributeValueType());
        e.setAttributeValueLength(c.getAttributeValueLength());
        e.setIsList(c.getIsList());
        e.setFieldName(c.getFieldName());
        e.setReferenceId(c.getReferenceId());
        e.setActive(c.getActive());
        e.setIsPropertyNameRemoved(c.getIsPropertyNameRemoved());
        e.setIsPropertyOrganizationIdRemoved(c.getIsPropertyOrganizationIdRemoved());
        e.setIsPropertyDescriptionRemoved(c.getIsPropertyDescriptionRemoved());
        e.setIsPropertyIsMandatoryRemoved(c.getIsPropertyIsMandatoryRemoved());
        e.setIsPropertyIsInstanceAttributeRemoved(c.getIsPropertyIsInstanceAttributeRemoved());
        e.setIsPropertyAttributeValueTypeRemoved(c.getIsPropertyAttributeValueTypeRemoved());
        e.setIsPropertyAttributeValueLengthRemoved(c.getIsPropertyAttributeValueLengthRemoved());
        e.setIsPropertyIsListRemoved(c.getIsPropertyIsListRemoved());
        e.setIsPropertyFieldNameRemoved(c.getIsPropertyFieldNameRemoved());
        e.setIsPropertyReferenceIdRemoved(c.getIsPropertyReferenceIdRemoved());
        e.setIsPropertyActiveRemoved(c.getIsPropertyActiveRemoved());
        ((AbstractAttributeStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long version = c.getVersion();
        for (AttributeValueCommand innerCommand : c.getAttributeValueCommands())
        {
            throwOnInconsistentCommands(c, innerCommand);
            AttributeValueStateEvent innerEvent = map(innerCommand, c, version, this.state);
            e.addAttributeValueEvent(innerEvent);
        }

        return e;
    }

    protected AttributeStateEvent.AttributeStateDeleted map(AttributeCommand.DeleteAttribute c)
    {
        AttributeStateEventId stateEventId = new AttributeStateEventId(c.getAttributeId(), c.getVersion());
        AttributeStateEvent.AttributeStateDeleted e = newAttributeStateDeleted(stateEventId);
        ((AbstractAttributeStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;
    }


    protected AttributeValueStateEvent map(AttributeValueCommand c, AttributeCommand outerCommand, long version, AttributeState outerState)
    {
        AttributeValueCommand.CreateAttributeValue create = (c.getCommandType().equals(CommandType.CREATE)) ? ((AttributeValueCommand.CreateAttributeValue)c) : null;
        if(create != null)
        {
            return mapCreate(create, outerCommand, version, outerState);
        }

        AttributeValueCommand.MergePatchAttributeValue merge = (c.getCommandType().equals(CommandType.MERGE_PATCH)) ? ((AttributeValueCommand.MergePatchAttributeValue)c) : null;
        if(merge != null)
        {
            return mapMergePatch(merge, outerCommand, version, outerState);
        }

        AttributeValueCommand.RemoveAttributeValue remove = (c.getCommandType().equals(CommandType.REMOVE)) ? ((AttributeValueCommand.RemoveAttributeValue)c) : null;
        if (remove != null)
        {
            return mapRemove(remove, outerCommand, version);
        }
        throw new UnsupportedOperationException();
    }

    protected AttributeValueStateEvent.AttributeValueStateCreated mapCreate(AttributeValueCommand.CreateAttributeValue c, AttributeCommand outerCommand, Long version, AttributeState outerState)
    {
        ((AbstractCommand)c).setRequesterId(outerCommand.getRequesterId());
        AttributeValueStateEventId stateEventId = new AttributeValueStateEventId(c.getAttributeId(), c.getValue(), version);
        AttributeValueStateEvent.AttributeValueStateCreated e = newAttributeValueStateCreated(stateEventId);
        AttributeValueState s = outerState.getAttributeValues().get(c.getValue());

        e.setName(c.getName());
        e.setDescription(c.getDescription());
        e.setReferenceId(c.getReferenceId());
        e.setActive(c.getActive());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;

    }// END map(ICreate... ////////////////////////////

    protected AttributeValueStateEvent.AttributeValueStateMergePatched mapMergePatch(AttributeValueCommand.MergePatchAttributeValue c, AttributeCommand outerCommand, Long version, AttributeState outerState)
    {
        ((AbstractCommand)c).setRequesterId(outerCommand.getRequesterId());
        AttributeValueStateEventId stateEventId = new AttributeValueStateEventId(c.getAttributeId(), c.getValue(), version);
        AttributeValueStateEvent.AttributeValueStateMergePatched e = newAttributeValueStateMergePatched(stateEventId);
        AttributeValueState s = outerState.getAttributeValues().get(c.getValue());

        e.setName(c.getName());
        e.setDescription(c.getDescription());
        e.setReferenceId(c.getReferenceId());
        e.setActive(c.getActive());
        e.setIsPropertyNameRemoved(c.getIsPropertyNameRemoved());
        e.setIsPropertyDescriptionRemoved(c.getIsPropertyDescriptionRemoved());
        e.setIsPropertyReferenceIdRemoved(c.getIsPropertyReferenceIdRemoved());
        e.setIsPropertyActiveRemoved(c.getIsPropertyActiveRemoved());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;

    }// END map(IMergePatch... ////////////////////////////

    protected AttributeValueStateEvent.AttributeValueStateRemoved mapRemove(AttributeValueCommand.RemoveAttributeValue c, AttributeCommand outerCommand, Long version)
    {
        ((AbstractCommand)c).setRequesterId(outerCommand.getRequesterId());
        AttributeValueStateEventId stateEventId = new AttributeValueStateEventId(c.getAttributeId(), c.getValue(), version);
        AttributeValueStateEvent.AttributeValueStateRemoved e = newAttributeValueStateRemoved(stateEventId);

        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());

        return e;

    }// END map(IRemove... ////////////////////////////

    protected void throwOnInconsistentCommands(AttributeCommand command, AttributeValueCommand innerCommand)
    {
        AbstractAttributeCommand properties = command instanceof AbstractAttributeCommand ? (AbstractAttributeCommand) command : null;
        AbstractAttributeValueCommand innerProperties = innerCommand instanceof AbstractAttributeValueCommand ? (AbstractAttributeValueCommand) innerCommand : null;
        if (properties == null || innerProperties == null) { return; }
        String outerAttributeIdName = "AttributeId";
        String outerAttributeIdValue = properties.getAttributeId();
        String innerAttributeIdName = "AttributeId";
        String innerAttributeIdValue = innerProperties.getAttributeId();
        if (innerAttributeIdValue == null) {
            innerProperties.setAttributeId(outerAttributeIdValue);
        }
        else if (innerAttributeIdValue != outerAttributeIdValue 
            && (innerAttributeIdValue == null || innerAttributeIdValue != null && !innerAttributeIdValue.equals(outerAttributeIdValue))) 
        {
            throw DomainError.named("inconsistentId", "Outer %1$s %2$s NOT equals inner %3$s %4$s", outerAttributeIdName, outerAttributeIdValue, innerAttributeIdName, innerAttributeIdValue);
        }
    }// END throwOnInconsistentCommands /////////////////////


    private static boolean isCommandCreate(AttributeCommand c)
    {
        return ((c instanceof AttributeCommand.CreateAttribute) 
            && c.getVersion().equals(AttributeState.VERSION_NULL));
    }


    ////////////////////////

    protected AttributeStateEvent.AttributeStateCreated newAttributeStateCreated(String commandId, String requesterId) {
        AttributeStateEventId stateEventId = new AttributeStateEventId(this.state.getAttributeId(), this.state.getVersion());
        AttributeStateEvent.AttributeStateCreated e = newAttributeStateCreated(stateEventId);
        ((AbstractAttributeStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected AttributeStateEvent.AttributeStateMergePatched newAttributeStateMergePatched(String commandId, String requesterId) {
        AttributeStateEventId stateEventId = new AttributeStateEventId(this.state.getAttributeId(), this.state.getVersion());
        AttributeStateEvent.AttributeStateMergePatched e = newAttributeStateMergePatched(stateEventId);
        ((AbstractAttributeStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected AttributeStateEvent.AttributeStateDeleted newAttributeStateDeleted(String commandId, String requesterId) {
        AttributeStateEventId stateEventId = new AttributeStateEventId(this.state.getAttributeId(), this.state.getVersion());
        AttributeStateEvent.AttributeStateDeleted e = newAttributeStateDeleted(stateEventId);
        ((AbstractAttributeStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected AttributeStateEvent.AttributeStateCreated newAttributeStateCreated(AttributeStateEventId stateEventId) {
        return new AbstractAttributeStateEvent.SimpleAttributeStateCreated(stateEventId);
    }

    protected AttributeStateEvent.AttributeStateMergePatched newAttributeStateMergePatched(AttributeStateEventId stateEventId) {
        return new AbstractAttributeStateEvent.SimpleAttributeStateMergePatched(stateEventId);
    }

    protected AttributeStateEvent.AttributeStateDeleted newAttributeStateDeleted(AttributeStateEventId stateEventId)
    {
        return new AbstractAttributeStateEvent.SimpleAttributeStateDeleted(stateEventId);
    }

    protected AttributeValueStateEvent.AttributeValueStateCreated newAttributeValueStateCreated(AttributeValueStateEventId stateEventId) {
        return new AbstractAttributeValueStateEvent.SimpleAttributeValueStateCreated(stateEventId);
    }

    protected AttributeValueStateEvent.AttributeValueStateMergePatched newAttributeValueStateMergePatched(AttributeValueStateEventId stateEventId) {
        return new AbstractAttributeValueStateEvent.SimpleAttributeValueStateMergePatched(stateEventId);
    }

    protected AttributeValueStateEvent.AttributeValueStateRemoved newAttributeValueStateRemoved(AttributeValueStateEventId stateEventId)
    {
        return new AbstractAttributeValueStateEvent.SimpleAttributeValueStateRemoved(stateEventId);
    }


    public static class SimpleAttributeAggregate extends AbstractAttributeAggregate
    {
        public SimpleAttributeAggregate(AttributeState state) {
            super(state);
        }
    }

}

