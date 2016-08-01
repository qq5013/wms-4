package org.dddml.wms.domain;

import java.util.*;
import java.util.function.Consumer;
import org.dddml.support.criterion.Criterion;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractAttributeSetInstanceExtensionFieldMvoApplicationService implements AttributeSetInstanceExtensionFieldMvoApplicationService
{

    private EventStore eventStore;

    protected EventStore getEventStore()
    {
        return eventStore;
    }

    private AttributeSetInstanceExtensionFieldMvoStateRepository stateRepository;

    protected AttributeSetInstanceExtensionFieldMvoStateRepository getStateRepository()
    {
        return stateRepository;
    }

    public AbstractAttributeSetInstanceExtensionFieldMvoApplicationService(EventStore eventStore, AttributeSetInstanceExtensionFieldMvoStateRepository stateRepository)
    {
        this.eventStore = eventStore;
        this.stateRepository = stateRepository;
    }

    public void when(AttributeSetInstanceExtensionFieldMvoCommand.CreateAttributeSetInstanceExtensionFieldMvo c) {
        update(c, ar -> ar.create(c));
    }

    public void when(AttributeSetInstanceExtensionFieldMvoCommand.MergePatchAttributeSetInstanceExtensionFieldMvo c) {
        update(c, ar -> ar.mergePatch(c));
    }

    public void when(AttributeSetInstanceExtensionFieldMvoCommand.DeleteAttributeSetInstanceExtensionFieldMvo c) {
        update(c, ar -> ar.delete(c));
    }

    public AttributeSetInstanceExtensionFieldMvoState get(AttributeSetInstanceExtensionFieldId id) {
        AttributeSetInstanceExtensionFieldMvoState state = getStateRepository().get(id);

        if (state != null && state.isStateUnsaved()) { state = null; }

        return state;
    }

    public Iterable<AttributeSetInstanceExtensionFieldMvoState> getAll(Integer firstResult, Integer maxResults) {
        return getStateRepository().getAll(firstResult, maxResults);
    }

    public Iterable<AttributeSetInstanceExtensionFieldMvoState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    public Iterable<AttributeSetInstanceExtensionFieldMvoState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    public Iterable<AttributeSetInstanceExtensionFieldMvoState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().getByProperty(propertyName, propertyValue, orders, firstResult, maxResults);
    }

    public long getCount(Iterable<Map.Entry<String, Object>> filter) {
        return getStateRepository().getCount(filter);
    }

    public long getCount(Criterion filter) {
        return getStateRepository().getCount(filter);
    }

    public AttributeSetInstanceExtensionFieldMvoStateEvent getStateEvent(AttributeSetInstanceExtensionFieldId attributeSetInstanceExtensionFieldId, long version) {
        throw new UnsupportedOperationException(); //todo
    }


    public AttributeSetInstanceExtensionFieldMvoAggregate getAttributeSetInstanceExtensionFieldMvoAggregate(AttributeSetInstanceExtensionFieldMvoState state)
    {
        return new AbstractAttributeSetInstanceExtensionFieldMvoAggregate.SimpleAttributeSetInstanceExtensionFieldMvoAggregate(state);
    }

    public EventStoreAggregateId toEventStoreAggregateId(AttributeSetInstanceExtensionFieldId aggregateId)
    {
        return new EventStoreAggregateId.SimpleEventStoreAggregateId(aggregateId);
    }

    protected void update(AttributeSetInstanceExtensionFieldMvoCommand c, Consumer<AttributeSetInstanceExtensionFieldMvoAggregate> action)
    {
        AttributeSetInstanceExtensionFieldId aggregateId = c.getAttributeSetInstanceExtensionFieldId();
        AttributeSetInstanceExtensionFieldMvoState state = getStateRepository().get(aggregateId);
        AttributeSetInstanceExtensionFieldMvoAggregate aggregate = getAttributeSetInstanceExtensionFieldMvoAggregate(state);

        EventStoreAggregateId eventStoreAggregateId = toEventStoreAggregateId(aggregateId);

        boolean repeated = isRepeatedCommand(c, eventStoreAggregateId, state);
        if (repeated) { return; }

        aggregate.throwOnInvalidStateTransition(c);
        action.accept(aggregate);
        getEventStore().appendEvents(eventStoreAggregateId, c.getAttrSetInstEFGroupVersion(), // State version may be null!
            aggregate.getChanges(), (events) -> { getStateRepository().save(state); });
        
    }

    protected boolean isRepeatedCommand(AttributeSetInstanceExtensionFieldMvoCommand command, EventStoreAggregateId eventStoreAggregateId, AttributeSetInstanceExtensionFieldMvoState state)
    {
        boolean repeated = false;
        if (command.getAttrSetInstEFGroupVersion() == null) { command.setAttrSetInstEFGroupVersion(AttributeSetInstanceExtensionFieldMvoState.VERSION_NULL); }
        if (state.getAttrSetInstEFGroupVersion() != null && state.getAttrSetInstEFGroupVersion() > command.getAttrSetInstEFGroupVersion())
        {
            Event lastEvent = getEventStore().findLastEvent(AttributeSetInstanceExtensionFieldMvoStateEvent.class, eventStoreAggregateId, command.getAttrSetInstEFGroupVersion());
            if (lastEvent != null && lastEvent instanceof AbstractStateEvent && command.getCommandId().equals(((AbstractStateEvent) lastEvent).getCommandId()))
            {
                repeated = true;
            }
        }
        return repeated;
    }

    public static class SimpleAttributeSetInstanceExtensionFieldMvoApplicationService extends AbstractAttributeSetInstanceExtensionFieldMvoApplicationService 
    {
        public SimpleAttributeSetInstanceExtensionFieldMvoApplicationService(EventStore eventStore, AttributeSetInstanceExtensionFieldMvoStateRepository stateRepository)
        {
            super(eventStore, stateRepository);
        }

    }

}

