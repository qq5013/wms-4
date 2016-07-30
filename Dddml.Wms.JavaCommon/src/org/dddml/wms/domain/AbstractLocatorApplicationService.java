package org.dddml.wms.domain;

import java.util.*;
import java.util.function.Consumer;
import org.dddml.support.criterion.Criterion;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractLocatorApplicationService implements LocatorApplicationService
{

    private EventStore eventStore;

    protected EventStore getEventStore()
    {
        return eventStore;
    }

    private LocatorStateRepository stateRepository;

    protected LocatorStateRepository getStateRepository()
    {
        return stateRepository;
    }

    public AbstractLocatorApplicationService(EventStore eventStore, LocatorStateRepository stateRepository)
    {
        this.eventStore = eventStore;
        this.stateRepository = stateRepository;
    }

    public void when(LocatorCommand.CreateLocator c) {
        update(c, ar -> ar.create(c));
    }

    public void when(LocatorCommand.MergePatchLocator c) {
        update(c, ar -> ar.mergePatch(c));
    }

    public void when(LocatorCommand.DeleteLocator c) {
        update(c, ar -> ar.delete(c));
    }

    public LocatorState get(String id) {
        LocatorState state = getStateRepository().get(id);

        if (state != null && state.isStateUnsaved()) { state = null; }

        return state;
    }

    public Iterable<LocatorState> getAll(Integer firstResult, Integer maxResults) {
        return getStateRepository().getAll(firstResult, maxResults);
    }

    public Iterable<LocatorState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    public Iterable<LocatorState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    public Iterable<LocatorState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().getByProperty(propertyName, propertyValue, orders, firstResult, maxResults);
    }

    public long getCount(Iterable<Map.Entry<String, Object>> filter) {
        return getStateRepository().getCount(filter);
    }

    public long getCount(Criterion filter) {
        return getStateRepository().getCount(filter);
    }

    public LocatorStateEvent getStateEvent(String locatorId, long version) {
        throw new UnsupportedOperationException(); //todo
    }

    public LocatorAggregate getLocatorAggregate(LocatorState state)
    {
        return new AbstractLocatorAggregate.SimpleLocatorAggregate(state);
    }

    public EventStoreAggregateId toEventStoreAggregateId(String aggregateId)
    {
        return new EventStoreAggregateId.SimpleEventStoreAggregateId(aggregateId);
    }

    protected void update(LocatorCommand c, Consumer<LocatorAggregate> action)
    {
        String aggregateId = c.getLocatorId();
        LocatorState state = getStateRepository().get(aggregateId);
        LocatorAggregate aggregate = getLocatorAggregate(state);

        EventStoreAggregateId eventStoreAggregateId = toEventStoreAggregateId(aggregateId);

        boolean repeated = isRepeatedCommand(c, eventStoreAggregateId, state);
        if (repeated) { return; }

        aggregate.throwOnInvalidStateTransition(c);
        action.accept(aggregate);
        getEventStore().appendEvents(eventStoreAggregateId, c.getVersion(), // State version may be null!
            aggregate.getChanges(), (events) -> { getStateRepository().save(state); });
        
    }

    protected boolean isRepeatedCommand(LocatorCommand command, EventStoreAggregateId eventStoreAggregateId, LocatorState state)
    {
        boolean repeated = false;
        if (command.getVersion() == null) { command.setVersion(LocatorState.VERSION_NULL); }
        if (state.getVersion() != null && state.getVersion() > command.getVersion())
        {
            Event lastEvent = getEventStore().findLastEvent(LocatorStateEvent.class, eventStoreAggregateId, command.getVersion());
            if (lastEvent != null && lastEvent instanceof AbstractStateEvent && command.getCommandId().equals(((AbstractStateEvent) lastEvent).getCommandId()))
            {
                repeated = true;
            }
        }
        return repeated;
    }

    public static class SimpleLocatorApplicationService extends AbstractLocatorApplicationService 
    {
        public SimpleLocatorApplicationService(EventStore eventStore, LocatorStateRepository stateRepository)
        {
            super(eventStore, stateRepository);
        }

    }

}

