package org.dddml.wms.domain;

import java.util.*;
import java.util.function.Consumer;
import org.dddml.support.criterion.Criterion;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractAttributeValueMvoApplicationService implements AttributeValueMvoApplicationService
{

    private EventStore eventStore;

    protected EventStore getEventStore()
    {
        return eventStore;
    }

    private AttributeValueMvoStateRepository stateRepository;

    protected AttributeValueMvoStateRepository getStateRepository()
    {
        return stateRepository;
    }

    public AbstractAttributeValueMvoApplicationService(EventStore eventStore, AttributeValueMvoStateRepository stateRepository)
    {
        this.eventStore = eventStore;
        this.stateRepository = stateRepository;
    }

    public void when(AttributeValueMvoCommand.CreateAttributeValueMvo c) {
        update(c, ar -> ar.create(c));
    }

    public void when(AttributeValueMvoCommand.MergePatchAttributeValueMvo c) {
        update(c, ar -> ar.mergePatch(c));
    }

    public void when(AttributeValueMvoCommand.DeleteAttributeValueMvo c) {
        update(c, ar -> ar.delete(c));
    }

    public AttributeValueMvoState get(AttributeValueId id) {
        AttributeValueMvoState state = getStateRepository().get(id);

        if (state != null && state.isStateUnsaved()) { state = null; }

        return state;
    }

    public Iterable<AttributeValueMvoState> getAll(Integer firstResult, Integer maxResults) {
        return getStateRepository().getAll(firstResult, maxResults);
    }

    public Iterable<AttributeValueMvoState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    public Iterable<AttributeValueMvoState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    public Iterable<AttributeValueMvoState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().getByProperty(propertyName, propertyValue, orders, firstResult, maxResults);
    }

    public long getCount(Iterable<Map.Entry<String, Object>> filter) {
        return getStateRepository().getCount(filter);
    }

    public long getCount(Criterion filter) {
        return getStateRepository().getCount(filter);
    }

    public AttributeValueMvoStateEvent getStateEvent(AttributeValueId attributeValueId, long version) {
        throw new UnsupportedOperationException(); //todo
    }

    public AttributeValueMvoAggregate getAttributeValueMvoAggregate(AttributeValueMvoState state)
    {
        return new AbstractAttributeValueMvoAggregate.SimpleAttributeValueMvoAggregate(state);
    }

    public EventStoreAggregateId toEventStoreAggregateId(AttributeValueId aggregateId)
    {
        return new EventStoreAggregateId.SimpleEventStoreAggregateId(aggregateId);
    }

    protected void update(AttributeValueMvoCommand c, Consumer<AttributeValueMvoAggregate> action)
    {
        AttributeValueId aggregateId = c.getAttributeValueId();
        AttributeValueMvoState state = getStateRepository().get(aggregateId);
        AttributeValueMvoAggregate aggregate = getAttributeValueMvoAggregate(state);

        EventStoreAggregateId eventStoreAggregateId = toEventStoreAggregateId(aggregateId);

        boolean repeated = isRepeatedCommand(c, eventStoreAggregateId, state);
        if (repeated) { return; }

        aggregate.throwOnInvalidStateTransition(c);
        action.accept(aggregate);
        getEventStore().appendEvents(eventStoreAggregateId, c.getAttributeVersion(), // State version may be null!
            aggregate.getChanges(), (events) -> { getStateRepository().save(state); });
        
    }

    protected boolean isRepeatedCommand(AttributeValueMvoCommand command, EventStoreAggregateId eventStoreAggregateId, AttributeValueMvoState state)
    {
        boolean repeated = false;
        if (command.getAttributeVersion() == null) { command.setAttributeVersion(AttributeValueMvoState.VERSION_NULL); }
        if (state.getAttributeVersion() != null && state.getAttributeVersion() > command.getAttributeVersion())
        {
            Event lastEvent = getEventStore().findLastEvent(AttributeValueMvoStateEvent.class, eventStoreAggregateId, command.getAttributeVersion());
            if (lastEvent != null && lastEvent instanceof AbstractStateEvent && command.getCommandId().equals(((AbstractStateEvent) lastEvent).getCommandId()))
            {
                repeated = true;
            }
        }
        return repeated;
    }

    public static class SimpleAttributeValueMvoApplicationService extends AbstractAttributeValueMvoApplicationService 
    {
        public SimpleAttributeValueMvoApplicationService(EventStore eventStore, AttributeValueMvoStateRepository stateRepository)
        {
            super(eventStore, stateRepository);
        }

    }

}

