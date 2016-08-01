package org.dddml.wms.domain;

import java.util.*;
import java.util.function.Consumer;
import org.dddml.support.criterion.Criterion;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractWarehouseApplicationService implements WarehouseApplicationService
{

    private EventStore eventStore;

    protected EventStore getEventStore()
    {
        return eventStore;
    }

    private WarehouseStateRepository stateRepository;

    protected WarehouseStateRepository getStateRepository()
    {
        return stateRepository;
    }

    public AbstractWarehouseApplicationService(EventStore eventStore, WarehouseStateRepository stateRepository)
    {
        this.eventStore = eventStore;
        this.stateRepository = stateRepository;
    }

    public void when(WarehouseCommand.CreateWarehouse c) {
        update(c, ar -> ar.create(c));
    }

    public void when(WarehouseCommand.MergePatchWarehouse c) {
        update(c, ar -> ar.mergePatch(c));
    }

    public void when(WarehouseCommand.DeleteWarehouse c) {
        update(c, ar -> ar.delete(c));
    }

    public WarehouseState get(String id) {
        WarehouseState state = getStateRepository().get(id);

        if (state != null && state.isStateUnsaved()) { state = null; }

        return state;
    }

    public Iterable<WarehouseState> getAll(Integer firstResult, Integer maxResults) {
        return getStateRepository().getAll(firstResult, maxResults);
    }

    public Iterable<WarehouseState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    public Iterable<WarehouseState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    public Iterable<WarehouseState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().getByProperty(propertyName, propertyValue, orders, firstResult, maxResults);
    }

    public long getCount(Iterable<Map.Entry<String, Object>> filter) {
        return getStateRepository().getCount(filter);
    }

    public long getCount(Criterion filter) {
        return getStateRepository().getCount(filter);
    }

    public WarehouseStateEvent getStateEvent(String warehouseId, long version) {
        throw new UnsupportedOperationException(); //todo
    }


    public WarehouseAggregate getWarehouseAggregate(WarehouseState state)
    {
        return new AbstractWarehouseAggregate.SimpleWarehouseAggregate(state);
    }

    public EventStoreAggregateId toEventStoreAggregateId(String aggregateId)
    {
        return new EventStoreAggregateId.SimpleEventStoreAggregateId(aggregateId);
    }

    protected void update(WarehouseCommand c, Consumer<WarehouseAggregate> action)
    {
        String aggregateId = c.getWarehouseId();
        WarehouseState state = getStateRepository().get(aggregateId);
        WarehouseAggregate aggregate = getWarehouseAggregate(state);

        EventStoreAggregateId eventStoreAggregateId = toEventStoreAggregateId(aggregateId);

        boolean repeated = isRepeatedCommand(c, eventStoreAggregateId, state);
        if (repeated) { return; }

        aggregate.throwOnInvalidStateTransition(c);
        action.accept(aggregate);
        getEventStore().appendEvents(eventStoreAggregateId, c.getVersion(), // State version may be null!
            aggregate.getChanges(), (events) -> { getStateRepository().save(state); });
        
    }

    protected boolean isRepeatedCommand(WarehouseCommand command, EventStoreAggregateId eventStoreAggregateId, WarehouseState state)
    {
        boolean repeated = false;
        if (command.getVersion() == null) { command.setVersion(WarehouseState.VERSION_NULL); }
        if (state.getVersion() != null && state.getVersion() > command.getVersion())
        {
            Event lastEvent = getEventStore().findLastEvent(WarehouseStateEvent.class, eventStoreAggregateId, command.getVersion());
            if (lastEvent != null && lastEvent instanceof AbstractStateEvent && command.getCommandId().equals(((AbstractStateEvent) lastEvent).getCommandId()))
            {
                repeated = true;
            }
        }
        return repeated;
    }

    public static class SimpleWarehouseApplicationService extends AbstractWarehouseApplicationService 
    {
        public SimpleWarehouseApplicationService(EventStore eventStore, WarehouseStateRepository stateRepository)
        {
            super(eventStore, stateRepository);
        }

    }

}

