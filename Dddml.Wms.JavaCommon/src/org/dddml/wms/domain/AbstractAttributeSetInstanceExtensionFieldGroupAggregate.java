package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractAttributeSetInstanceExtensionFieldGroupAggregate extends AbstractAggregate implements AttributeSetInstanceExtensionFieldGroupAggregate
{
    private AttributeSetInstanceExtensionFieldGroupState state;

    private List<Event> changes = new ArrayList<Event>();

    public AbstractAttributeSetInstanceExtensionFieldGroupAggregate(AttributeSetInstanceExtensionFieldGroupState state)
    {
        this.state = state;
    }

    public AttributeSetInstanceExtensionFieldGroupState getState() {
        return this.state;
    }

    public List<Event> getChanges() {
        return this.changes;
    }

    public void create(AttributeSetInstanceExtensionFieldGroupCommand.CreateAttributeSetInstanceExtensionFieldGroup c)
    {
        AttributeSetInstanceExtensionFieldGroupStateEvent.AttributeSetInstanceExtensionFieldGroupStateCreated e = map(c);
        apply(e);
    }

    public void mergePatch(AttributeSetInstanceExtensionFieldGroupCommand.MergePatchAttributeSetInstanceExtensionFieldGroup c)
    {
        AttributeSetInstanceExtensionFieldGroupStateEvent.AttributeSetInstanceExtensionFieldGroupStateMergePatched e = map(c);
        apply(e);
    }

    public void delete(AttributeSetInstanceExtensionFieldGroupCommand.DeleteAttributeSetInstanceExtensionFieldGroup c)
    {
        AttributeSetInstanceExtensionFieldGroupStateEvent.AttributeSetInstanceExtensionFieldGroupStateDeleted e = map(c);
        apply(e);
    }

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getVersion() == null || this.state.getVersion().equals(AttributeSetInstanceExtensionFieldGroupState.VERSION_ZERO))
        {
            if (isCommandCreate((AttributeSetInstanceExtensionFieldGroupCommand)c))
            {
                return;
            }
            throw DomainError.named("premature", "Can't do anything to unexistent aggregate");
        }
        if (this.state.getDeleted())
        {
            throw DomainError.named("zombie", "Can't do anything to deleted aggregate.");
        }
        if (isCommandCreate((AttributeSetInstanceExtensionFieldGroupCommand)c))
            throw DomainError.named("rebirth", "Can't create aggregate that already exists");
    }

    protected void apply(Event e)
    {
        onApplying(e);
        this.state.mutate(e);
        this.changes.add(e);
    }

    protected AttributeSetInstanceExtensionFieldGroupStateEvent.AttributeSetInstanceExtensionFieldGroupStateCreated map(AttributeSetInstanceExtensionFieldGroupCommand.CreateAttributeSetInstanceExtensionFieldGroup c)
    {
        AttributeSetInstanceExtensionFieldGroupStateEventId stateEventId = new AttributeSetInstanceExtensionFieldGroupStateEventId(c.getId(), c.getVersion());
        AttributeSetInstanceExtensionFieldGroupStateEvent.AttributeSetInstanceExtensionFieldGroupStateCreated e = newAttributeSetInstanceExtensionFieldGroupStateCreated(stateEventId);
        e.setFieldType(c.getFieldType());
        e.setFieldLength(c.getFieldLength());
        e.setFieldCount(c.getFieldCount());
        e.setNameFormat(c.getNameFormat());
        e.setDescription(c.getDescription());
        e.setActive(c.getActive());
        ((AbstractAttributeSetInstanceExtensionFieldGroupStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long version = c.getVersion();
        for (AttributeSetInstanceExtensionFieldCommand.CreateAttributeSetInstanceExtensionField innerCommand : c.getFields())
        {
            throwOnInconsistentCommands(c, innerCommand);
            AttributeSetInstanceExtensionFieldStateEvent.AttributeSetInstanceExtensionFieldStateCreated innerEvent = mapCreate(innerCommand, c, version, this.state);
            e.addAttributeSetInstanceExtensionFieldEvent(innerEvent);
        }

        return e;
    }

    protected AttributeSetInstanceExtensionFieldGroupStateEvent.AttributeSetInstanceExtensionFieldGroupStateMergePatched map(AttributeSetInstanceExtensionFieldGroupCommand.MergePatchAttributeSetInstanceExtensionFieldGroup c)
    {
        AttributeSetInstanceExtensionFieldGroupStateEventId stateEventId = new AttributeSetInstanceExtensionFieldGroupStateEventId(c.getId(), c.getVersion());
        AttributeSetInstanceExtensionFieldGroupStateEvent.AttributeSetInstanceExtensionFieldGroupStateMergePatched e = newAttributeSetInstanceExtensionFieldGroupStateMergePatched(stateEventId);
        e.setFieldType(c.getFieldType());
        e.setFieldLength(c.getFieldLength());
        e.setFieldCount(c.getFieldCount());
        e.setNameFormat(c.getNameFormat());
        e.setDescription(c.getDescription());
        e.setActive(c.getActive());
        e.setIsPropertyFieldTypeRemoved(c.getIsPropertyFieldTypeRemoved());
        e.setIsPropertyFieldLengthRemoved(c.getIsPropertyFieldLengthRemoved());
        e.setIsPropertyFieldCountRemoved(c.getIsPropertyFieldCountRemoved());
        e.setIsPropertyNameFormatRemoved(c.getIsPropertyNameFormatRemoved());
        e.setIsPropertyDescriptionRemoved(c.getIsPropertyDescriptionRemoved());
        e.setIsPropertyActiveRemoved(c.getIsPropertyActiveRemoved());
        ((AbstractAttributeSetInstanceExtensionFieldGroupStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long version = c.getVersion();
        for (AttributeSetInstanceExtensionFieldCommand innerCommand : c.getAttributeSetInstanceExtensionFieldCommands())
        {
            throwOnInconsistentCommands(c, innerCommand);
            AttributeSetInstanceExtensionFieldStateEvent innerEvent = map(innerCommand, c, version, this.state);
            e.addAttributeSetInstanceExtensionFieldEvent(innerEvent);
        }

        return e;
    }

    protected AttributeSetInstanceExtensionFieldGroupStateEvent.AttributeSetInstanceExtensionFieldGroupStateDeleted map(AttributeSetInstanceExtensionFieldGroupCommand.DeleteAttributeSetInstanceExtensionFieldGroup c)
    {
        AttributeSetInstanceExtensionFieldGroupStateEventId stateEventId = new AttributeSetInstanceExtensionFieldGroupStateEventId(c.getId(), c.getVersion());
        AttributeSetInstanceExtensionFieldGroupStateEvent.AttributeSetInstanceExtensionFieldGroupStateDeleted e = newAttributeSetInstanceExtensionFieldGroupStateDeleted(stateEventId);
        ((AbstractAttributeSetInstanceExtensionFieldGroupStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;
    }


    protected AttributeSetInstanceExtensionFieldStateEvent map(AttributeSetInstanceExtensionFieldCommand c, AttributeSetInstanceExtensionFieldGroupCommand outerCommand, long version, AttributeSetInstanceExtensionFieldGroupState outerState)
    {
        AttributeSetInstanceExtensionFieldCommand.CreateAttributeSetInstanceExtensionField create = (c.getCommandType().equals(CommandType.CREATE)) ? ((AttributeSetInstanceExtensionFieldCommand.CreateAttributeSetInstanceExtensionField)c) : null;
        if(create != null)
        {
            return mapCreate(create, outerCommand, version, outerState);
        }

        AttributeSetInstanceExtensionFieldCommand.MergePatchAttributeSetInstanceExtensionField merge = (c.getCommandType().equals(CommandType.MERGE_PATCH)) ? ((AttributeSetInstanceExtensionFieldCommand.MergePatchAttributeSetInstanceExtensionField)c) : null;
        if(merge != null)
        {
            return mapMergePatch(merge, outerCommand, version, outerState);
        }

        AttributeSetInstanceExtensionFieldCommand.RemoveAttributeSetInstanceExtensionField remove = (c.getCommandType().equals(CommandType.REMOVE)) ? ((AttributeSetInstanceExtensionFieldCommand.RemoveAttributeSetInstanceExtensionField)c) : null;
        if (remove != null)
        {
            return mapRemove(remove, outerCommand, version);
        }
        throw new UnsupportedOperationException();
    }

    protected AttributeSetInstanceExtensionFieldStateEvent.AttributeSetInstanceExtensionFieldStateCreated mapCreate(AttributeSetInstanceExtensionFieldCommand.CreateAttributeSetInstanceExtensionField c, AttributeSetInstanceExtensionFieldGroupCommand outerCommand, Long version, AttributeSetInstanceExtensionFieldGroupState outerState)
    {
        ((AbstractCommand)c).setRequesterId(outerCommand.getRequesterId());
        AttributeSetInstanceExtensionFieldStateEventId stateEventId = new AttributeSetInstanceExtensionFieldStateEventId(c.getGroupId(), c.getIndex(), version);
        AttributeSetInstanceExtensionFieldStateEvent.AttributeSetInstanceExtensionFieldStateCreated e = newAttributeSetInstanceExtensionFieldStateCreated(stateEventId);
        AttributeSetInstanceExtensionFieldState s = outerState.getFields().get(c.getIndex());

        e.setName(c.getName());
        e.setType(c.getType());
        e.setLength(c.getLength());
        e.setAlias(c.getAlias());
        e.setDescription(c.getDescription());
        e.setActive(c.getActive());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;

    }// END map(ICreate... ////////////////////////////

    protected AttributeSetInstanceExtensionFieldStateEvent.AttributeSetInstanceExtensionFieldStateMergePatched mapMergePatch(AttributeSetInstanceExtensionFieldCommand.MergePatchAttributeSetInstanceExtensionField c, AttributeSetInstanceExtensionFieldGroupCommand outerCommand, Long version, AttributeSetInstanceExtensionFieldGroupState outerState)
    {
        ((AbstractCommand)c).setRequesterId(outerCommand.getRequesterId());
        AttributeSetInstanceExtensionFieldStateEventId stateEventId = new AttributeSetInstanceExtensionFieldStateEventId(c.getGroupId(), c.getIndex(), version);
        AttributeSetInstanceExtensionFieldStateEvent.AttributeSetInstanceExtensionFieldStateMergePatched e = newAttributeSetInstanceExtensionFieldStateMergePatched(stateEventId);
        AttributeSetInstanceExtensionFieldState s = outerState.getFields().get(c.getIndex());

        e.setName(c.getName());
        e.setType(c.getType());
        e.setLength(c.getLength());
        e.setAlias(c.getAlias());
        e.setDescription(c.getDescription());
        e.setActive(c.getActive());
        e.setIsPropertyNameRemoved(c.getIsPropertyNameRemoved());
        e.setIsPropertyTypeRemoved(c.getIsPropertyTypeRemoved());
        e.setIsPropertyLengthRemoved(c.getIsPropertyLengthRemoved());
        e.setIsPropertyAliasRemoved(c.getIsPropertyAliasRemoved());
        e.setIsPropertyDescriptionRemoved(c.getIsPropertyDescriptionRemoved());
        e.setIsPropertyActiveRemoved(c.getIsPropertyActiveRemoved());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;

    }// END map(IMergePatch... ////////////////////////////

    protected AttributeSetInstanceExtensionFieldStateEvent.AttributeSetInstanceExtensionFieldStateRemoved mapRemove(AttributeSetInstanceExtensionFieldCommand.RemoveAttributeSetInstanceExtensionField c, AttributeSetInstanceExtensionFieldGroupCommand outerCommand, Long version)
    {
        ((AbstractCommand)c).setRequesterId(outerCommand.getRequesterId());
        AttributeSetInstanceExtensionFieldStateEventId stateEventId = new AttributeSetInstanceExtensionFieldStateEventId(c.getGroupId(), c.getIndex(), version);
        AttributeSetInstanceExtensionFieldStateEvent.AttributeSetInstanceExtensionFieldStateRemoved e = newAttributeSetInstanceExtensionFieldStateRemoved(stateEventId);

        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());

        return e;

    }// END map(IRemove... ////////////////////////////

    protected void throwOnInconsistentCommands(AttributeSetInstanceExtensionFieldGroupCommand command, AttributeSetInstanceExtensionFieldCommand innerCommand)
    {
        AbstractAttributeSetInstanceExtensionFieldGroupCommand properties = command instanceof AbstractAttributeSetInstanceExtensionFieldGroupCommand ? (AbstractAttributeSetInstanceExtensionFieldGroupCommand) command : null;
        AbstractAttributeSetInstanceExtensionFieldCommand innerProperties = innerCommand instanceof AbstractAttributeSetInstanceExtensionFieldCommand ? (AbstractAttributeSetInstanceExtensionFieldCommand) innerCommand : null;
        if (properties == null || innerProperties == null) { return; }
        String outerIdName = "Id";
        String outerIdValue = properties.getId();
        String innerGroupIdName = "GroupId";
        String innerGroupIdValue = innerProperties.getGroupId();
        if (innerGroupIdValue == null) {
            innerProperties.setGroupId(outerIdValue);
        }
        else if (innerGroupIdValue != outerIdValue && innerGroupIdValue != null && !innerGroupIdValue.equals(outerIdValue)) {
            throw DomainError.named("inconsistentId", "Outer %1$s %2$s NOT equals inner %3$s %4$s", outerIdName, outerIdValue, innerGroupIdName, innerGroupIdValue);
        }
    }// END throwOnInconsistentCommands /////////////////////


    private static boolean isCommandCreate(AttributeSetInstanceExtensionFieldGroupCommand c)
    {
        return c.getVersion() == null || c.getVersion().equals(AttributeSetInstanceExtensionFieldGroupState.VERSION_ZERO);
    }


    ////////////////////////

    protected AttributeSetInstanceExtensionFieldGroupStateEvent.AttributeSetInstanceExtensionFieldGroupStateCreated newAttributeSetInstanceExtensionFieldGroupStateCreated(String commandId, String requesterId) {
        AttributeSetInstanceExtensionFieldGroupStateEventId stateEventId = new AttributeSetInstanceExtensionFieldGroupStateEventId(this.state.getId(), this.state.getVersion());
        AttributeSetInstanceExtensionFieldGroupStateEvent.AttributeSetInstanceExtensionFieldGroupStateCreated e = newAttributeSetInstanceExtensionFieldGroupStateCreated(stateEventId);
        ((AbstractAttributeSetInstanceExtensionFieldGroupStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected AttributeSetInstanceExtensionFieldGroupStateEvent.AttributeSetInstanceExtensionFieldGroupStateMergePatched newAttributeSetInstanceExtensionFieldGroupStateMergePatched(String commandId, String requesterId) {
        AttributeSetInstanceExtensionFieldGroupStateEventId stateEventId = new AttributeSetInstanceExtensionFieldGroupStateEventId(this.state.getId(), this.state.getVersion());
        AttributeSetInstanceExtensionFieldGroupStateEvent.AttributeSetInstanceExtensionFieldGroupStateMergePatched e = newAttributeSetInstanceExtensionFieldGroupStateMergePatched(stateEventId);
        ((AbstractAttributeSetInstanceExtensionFieldGroupStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected AttributeSetInstanceExtensionFieldGroupStateEvent.AttributeSetInstanceExtensionFieldGroupStateDeleted newAttributeSetInstanceExtensionFieldGroupStateDeleted(String commandId, String requesterId) {
        AttributeSetInstanceExtensionFieldGroupStateEventId stateEventId = new AttributeSetInstanceExtensionFieldGroupStateEventId(this.state.getId(), this.state.getVersion());
        AttributeSetInstanceExtensionFieldGroupStateEvent.AttributeSetInstanceExtensionFieldGroupStateDeleted e = newAttributeSetInstanceExtensionFieldGroupStateDeleted(stateEventId);
        ((AbstractAttributeSetInstanceExtensionFieldGroupStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected AttributeSetInstanceExtensionFieldGroupStateEvent.AttributeSetInstanceExtensionFieldGroupStateCreated newAttributeSetInstanceExtensionFieldGroupStateCreated(AttributeSetInstanceExtensionFieldGroupStateEventId stateEventId) {
        return new AbstractAttributeSetInstanceExtensionFieldGroupStateEvent.SimpleAttributeSetInstanceExtensionFieldGroupStateCreated(stateEventId);
    }

    protected AttributeSetInstanceExtensionFieldGroupStateEvent.AttributeSetInstanceExtensionFieldGroupStateMergePatched newAttributeSetInstanceExtensionFieldGroupStateMergePatched(AttributeSetInstanceExtensionFieldGroupStateEventId stateEventId) {
        return new AbstractAttributeSetInstanceExtensionFieldGroupStateEvent.SimpleAttributeSetInstanceExtensionFieldGroupStateMergePatched(stateEventId);
    }

    protected AttributeSetInstanceExtensionFieldGroupStateEvent.AttributeSetInstanceExtensionFieldGroupStateDeleted newAttributeSetInstanceExtensionFieldGroupStateDeleted(AttributeSetInstanceExtensionFieldGroupStateEventId stateEventId)
    {
        return new AbstractAttributeSetInstanceExtensionFieldGroupStateEvent.SimpleAttributeSetInstanceExtensionFieldGroupStateDeleted(stateEventId);
    }

    protected AttributeSetInstanceExtensionFieldStateEvent.AttributeSetInstanceExtensionFieldStateCreated newAttributeSetInstanceExtensionFieldStateCreated(AttributeSetInstanceExtensionFieldStateEventId stateEventId) {
        return new AbstractAttributeSetInstanceExtensionFieldStateEvent.SimpleAttributeSetInstanceExtensionFieldStateCreated(stateEventId);
    }

    protected AttributeSetInstanceExtensionFieldStateEvent.AttributeSetInstanceExtensionFieldStateMergePatched newAttributeSetInstanceExtensionFieldStateMergePatched(AttributeSetInstanceExtensionFieldStateEventId stateEventId) {
        return new AbstractAttributeSetInstanceExtensionFieldStateEvent.SimpleAttributeSetInstanceExtensionFieldStateMergePatched(stateEventId);
    }

    protected AttributeSetInstanceExtensionFieldStateEvent.AttributeSetInstanceExtensionFieldStateRemoved newAttributeSetInstanceExtensionFieldStateRemoved(AttributeSetInstanceExtensionFieldStateEventId stateEventId)
    {
        return new AbstractAttributeSetInstanceExtensionFieldStateEvent.SimpleAttributeSetInstanceExtensionFieldStateRemoved(stateEventId);
    }


    public static class SimpleAttributeSetInstanceExtensionFieldGroupAggregate extends AbstractAttributeSetInstanceExtensionFieldGroupAggregate
    {
        public SimpleAttributeSetInstanceExtensionFieldGroupAggregate(AttributeSetInstanceExtensionFieldGroupState state) {
            super(state);
        }
    }

}

