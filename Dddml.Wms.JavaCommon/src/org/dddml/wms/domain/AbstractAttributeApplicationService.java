package org.dddml.wms.domain;

import java.util.*;
import java.util.function.Consumer;
import org.dddml.support.criterion.Criterion;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractAttributeApplicationService implements AttributeApplicationService
{

    private EventStore eventStore;

    protected EventStore getEventStore()
    {
        return eventStore;
    }

    private AttributeStateRepository stateRepository;

    protected AttributeStateRepository getStateRepository()
    {
        return stateRepository;
    }

    public AbstractAttributeApplicationService(EventStore eventStore, AttributeStateRepository stateRepository)
    {
        this.eventStore = eventStore;
        this.stateRepository = stateRepository;
    }

    public void when(AttributeCommand.CreateAttribute c) {
        update(c, ar -> ar.create(c));
    }

    public void when(AttributeCommand.MergePatchAttribute c) {
        update(c, ar -> ar.mergePatch(c));
    }

    public void when(AttributeCommand.DeleteAttribute c) {
        update(c, ar -> ar.delete(c));
    }

    public AttributeState get(String id) {
        AttributeState state = getStateRepository().get(id);

        if (state != null && state.isStateUnsaved()) { state = null; }

        return state;
    }

    public Iterable<AttributeState> getAll(Integer firstResult, Integer maxResults) {
        return getStateRepository().getAll(firstResult, maxResults);
    }

    public Iterable<AttributeState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    public Iterable<AttributeState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    public Iterable<AttributeState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().getByProperty(propertyName, propertyValue, orders, firstResult, maxResults);
    }

    public long getCount(Iterable<Map.Entry<String, Object>> filter) {
        return getStateRepository().getCount(filter);
    }

    public long getCount(Criterion filter) {
        return getStateRepository().getCount(filter);
    }

    public AttributeStateEvent getStateEvent(String attributeId, long version) {
        throw new UnsupportedOperationException(); //todo
    }

    public AttributeValueState getAttributeValue(String attributeId, String value) {
        return getStateRepository().getAttributeValue(attributeId, value);
    }


    public AttributeAggregate getAttributeAggregate(AttributeState state)
    {
        return new AbstractAttributeAggregate.SimpleAttributeAggregate(state);
    }

    public EventStoreAggregateId toEventStoreAggregateId(String aggregateId)
    {
        return new EventStoreAggregateId.SimpleEventStoreAggregateId(aggregateId);
    }

    protected void update(AttributeCommand c, Consumer<AttributeAggregate> action)
    {
        String aggregateId = c.getAttributeId();
        AttributeState state = getStateRepository().get(aggregateId);
        AttributeAggregate aggregate = getAttributeAggregate(state);

        EventStoreAggregateId eventStoreAggregateId = toEventStoreAggregateId(aggregateId);

        boolean repeated = isRepeatedCommand(c, eventStoreAggregateId, state);
        if (repeated) { return; }

        aggregate.throwOnInvalidStateTransition(c);
        action.accept(aggregate);
        getEventStore().appendEvents(eventStoreAggregateId, c.getVersion(), // State version may be null!
            aggregate.getChanges(), (events) -> { getStateRepository().save(state); });
        
    }

    protected boolean isRepeatedCommand(AttributeCommand command, EventStoreAggregateId eventStoreAggregateId, AttributeState state)
    {
        boolean repeated = false;
        if (command.getVersion() == null) { command.setVersion(AttributeState.VERSION_NULL); }
        if (state.getVersion() != null && state.getVersion() > command.getVersion())
        {
            Event lastEvent = getEventStore().findLastEvent(AttributeStateEvent.class, eventStoreAggregateId, command.getVersion());
            if (lastEvent != null && lastEvent instanceof AbstractStateEvent && command.getCommandId().equals(((AbstractStateEvent) lastEvent).getCommandId()))
            {
                repeated = true;
            }
        }
        return repeated;
    }

    public static class SimpleAttributeApplicationService extends AbstractAttributeApplicationService 
    {
        public SimpleAttributeApplicationService(EventStore eventStore, AttributeStateRepository stateRepository)
        {
            super(eventStore, stateRepository);
        }

    }

}

