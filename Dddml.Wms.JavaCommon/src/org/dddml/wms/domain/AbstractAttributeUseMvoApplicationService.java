package org.dddml.wms.domain;

import java.util.*;
import java.util.function.Consumer;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractAttributeUseMvoApplicationService implements AttributeUseMvoApplicationService
{

    private EventStore eventStore;

    protected EventStore getEventStore()
    {
        return eventStore;
    }

    private AttributeUseMvoStateRepository stateRepository;

    protected AttributeUseMvoStateRepository getStateRepository()
    {
        return stateRepository;
    }

    public AbstractAttributeUseMvoApplicationService(EventStore eventStore, AttributeUseMvoStateRepository stateRepository)
    {
        this.eventStore = eventStore;
        this.stateRepository = stateRepository;
    }

    public void when(AttributeUseMvoCommand.CreateAttributeUseMvo c) {
        update(c, ar -> ar.create(c));
    }

    public void when(AttributeUseMvoCommand.MergePatchAttributeUseMvo c) {
        update(c, ar -> ar.mergePatch(c));
    }

    public void when(AttributeUseMvoCommand.DeleteAttributeUseMvo c) {
        update(c, ar -> ar.delete(c));
    }

    public AttributeUseMvoState get(AttributeSetAttributeUseId id) {
        AttributeUseMvoState state = getStateRepository().get(id);

        if (state != null && state.isStateUnsaved()) { state = null; }

        return state;
    }

    public Iterable<AttributeUseMvoState> getAll(Integer firstResult, Integer maxResults) {
        return getStateRepository().getAll(firstResult, maxResults);
    }

    public Iterable<AttributeUseMvoState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    //public Iterable<AttributeUseMvoState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    public Iterable<AttributeUseMvoState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().getByProperty(propertyName, propertyValue, orders, firstResult, maxResults);
    }

    public long getCount(Iterable<Map.Entry<String, Object>> filter) {
        return getStateRepository().getCount(filter);
    }

    //public long getCount(Criterion filter);

    public AttributeUseMvoStateEvent getStateEvent(AttributeSetAttributeUseId attributeSetAttributeUseId, long version) {
        throw new UnsupportedOperationException(); //todo
    }

    public AttributeUseMvoAggregate getAttributeUseMvoAggregate(AttributeUseMvoState state)
    {
        return new AbstractAttributeUseMvoAggregate.SimpleAttributeUseMvoAggregate(state);
    }

    public EventStoreAggregateId toEventStoreAggregateId(AttributeSetAttributeUseId aggregateId)
    {
        return new EventStoreAggregateId.SimpleEventStoreAggregateId(aggregateId);
    }

    protected void update(AttributeUseMvoCommand c, Consumer<AttributeUseMvoAggregate> action)
    {
        AttributeSetAttributeUseId aggregateId = c.getAttributeSetAttributeUseId();
        AttributeUseMvoState state = getStateRepository().get(aggregateId);
        AttributeUseMvoAggregate aggregate = getAttributeUseMvoAggregate(state);

        EventStoreAggregateId eventStoreAggregateId = toEventStoreAggregateId(aggregateId);

        boolean repeated = isRepeatedCommand(c, eventStoreAggregateId, state);
        if (repeated) { return; }

        aggregate.throwOnInvalidStateTransition(c);
        action.accept(aggregate);
        getEventStore().appendEvents(eventStoreAggregateId, state.getAttributeSetVersion(), aggregate.getChanges(), (events) -> { getStateRepository().save(state); });
        
    }

    protected boolean isRepeatedCommand(AttributeUseMvoCommand command, EventStoreAggregateId eventStoreAggregateId, AttributeUseMvoState state)
    {
        boolean repeated = false;
        if (state.getAttributeSetVersion() > command.getAttributeSetVersion())
        {
            Event lastEvent = getEventStore().findLastEvent(AttributeUseMvoStateEvent.class, eventStoreAggregateId, command.getAttributeSetVersion());
            if (lastEvent != null && lastEvent instanceof AbstractStateEvent && command.getCommandId().equals(((AbstractStateEvent) lastEvent).getCommandId()))
            {
                repeated = true;
            }
        }
        return repeated;
    }

    public static class SimpleAttributeUseMvoApplicationService extends AbstractAttributeUseMvoApplicationService 
    {
        public SimpleAttributeUseMvoApplicationService(EventStore eventStore, AttributeUseMvoStateRepository stateRepository)
        {
            super(eventStore, stateRepository);
        }

    }

}

