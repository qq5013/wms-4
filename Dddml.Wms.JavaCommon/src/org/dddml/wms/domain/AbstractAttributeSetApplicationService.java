package org.dddml.wms.domain;

import java.util.*;
import java.util.function.Consumer;
import org.dddml.support.criterion.Criterion;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractAttributeSetApplicationService implements AttributeSetApplicationService
{

    private EventStore eventStore;

    protected EventStore getEventStore()
    {
        return eventStore;
    }

    private AttributeSetStateRepository stateRepository;

    protected AttributeSetStateRepository getStateRepository()
    {
        return stateRepository;
    }

    public AbstractAttributeSetApplicationService(EventStore eventStore, AttributeSetStateRepository stateRepository)
    {
        this.eventStore = eventStore;
        this.stateRepository = stateRepository;
    }

    public void when(AttributeSetCommand.CreateAttributeSet c) {
        update(c, ar -> ar.create(c));
    }

    public void when(AttributeSetCommand.MergePatchAttributeSet c) {
        update(c, ar -> ar.mergePatch(c));
    }

    public void when(AttributeSetCommand.DeleteAttributeSet c) {
        update(c, ar -> ar.delete(c));
    }

    public AttributeSetState get(String id) {
        AttributeSetState state = getStateRepository().get(id);

        if (state != null && state.isStateUnsaved()) { state = null; }

        return state;
    }

    public Iterable<AttributeSetState> getAll(Integer firstResult, Integer maxResults) {
        return getStateRepository().getAll(firstResult, maxResults);
    }

    public Iterable<AttributeSetState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    public Iterable<AttributeSetState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    public Iterable<AttributeSetState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().getByProperty(propertyName, propertyValue, orders, firstResult, maxResults);
    }

    public long getCount(Iterable<Map.Entry<String, Object>> filter) {
        return getStateRepository().getCount(filter);
    }

    public long getCount(Criterion filter) {
        return getStateRepository().getCount(filter);
    }

    public AttributeSetStateEvent getStateEvent(String attributeSetId, long version) {
        AttributeSetStateEvent e = (AttributeSetStateEvent)getEventStore().getStateEvent(toEventStoreAggregateId(attributeSetId), version);
        if (e != null)
        { e.setStateEventReadOnly(true); }
        return e;
    }

    public AttributeUseState getAttributeUse(String attributeSetId, String attributeId) {
        return getStateRepository().getAttributeUse(attributeSetId, attributeId);
    }


    public AttributeSetAggregate getAttributeSetAggregate(AttributeSetState state)
    {
        return new AbstractAttributeSetAggregate.SimpleAttributeSetAggregate(state);
    }

    public EventStoreAggregateId toEventStoreAggregateId(String aggregateId)
    {
        return new EventStoreAggregateId.SimpleEventStoreAggregateId(aggregateId);
    }

    protected void update(AttributeSetCommand c, Consumer<AttributeSetAggregate> action)
    {
        String aggregateId = c.getAttributeSetId();
        AttributeSetState state = getStateRepository().get(aggregateId);
        AttributeSetAggregate aggregate = getAttributeSetAggregate(state);

        EventStoreAggregateId eventStoreAggregateId = toEventStoreAggregateId(aggregateId);

        boolean repeated = isRepeatedCommand(c, eventStoreAggregateId, state);
        if (repeated) { return; }

        aggregate.throwOnInvalidStateTransition(c);
        action.accept(aggregate);
        getEventStore().appendEvents(eventStoreAggregateId, c.getVersion(), // State version may be null!
            aggregate.getChanges(), (events) -> { getStateRepository().save(state); });
        
    }

    protected boolean isRepeatedCommand(AttributeSetCommand command, EventStoreAggregateId eventStoreAggregateId, AttributeSetState state)
    {
        boolean repeated = false;
        if (command.getVersion() == null) { command.setVersion(AttributeSetState.VERSION_NULL); }
        if (state.getVersion() != null && state.getVersion() > command.getVersion())
        {
            Event lastEvent = getEventStore().findLastEvent(AttributeSetStateEvent.class, eventStoreAggregateId, command.getVersion());
            if (lastEvent != null && lastEvent instanceof AbstractStateEvent && command.getCommandId().equals(((AbstractStateEvent) lastEvent).getCommandId()))
            {
                repeated = true;
            }
        }
        return repeated;
    }

    public static class SimpleAttributeSetApplicationService extends AbstractAttributeSetApplicationService 
    {
        public SimpleAttributeSetApplicationService(EventStore eventStore, AttributeSetStateRepository stateRepository)
        {
            super(eventStore, stateRepository);
        }

    }

}

