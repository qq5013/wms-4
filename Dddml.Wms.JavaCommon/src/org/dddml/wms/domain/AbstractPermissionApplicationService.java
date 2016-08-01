package org.dddml.wms.domain;

import java.util.*;
import java.util.function.Consumer;
import org.dddml.support.criterion.Criterion;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractPermissionApplicationService implements PermissionApplicationService
{

    private EventStore eventStore;

    protected EventStore getEventStore()
    {
        return eventStore;
    }

    private PermissionStateRepository stateRepository;

    protected PermissionStateRepository getStateRepository()
    {
        return stateRepository;
    }

    public AbstractPermissionApplicationService(EventStore eventStore, PermissionStateRepository stateRepository)
    {
        this.eventStore = eventStore;
        this.stateRepository = stateRepository;
    }

    public void when(PermissionCommand.CreatePermission c) {
        update(c, ar -> ar.create(c));
    }

    public void when(PermissionCommand.MergePatchPermission c) {
        update(c, ar -> ar.mergePatch(c));
    }

    public void when(PermissionCommand.DeletePermission c) {
        update(c, ar -> ar.delete(c));
    }

    public PermissionState get(String id) {
        PermissionState state = getStateRepository().get(id);

        if (state != null && state.isStateUnsaved()) { state = null; }

        return state;
    }

    public Iterable<PermissionState> getAll(Integer firstResult, Integer maxResults) {
        return getStateRepository().getAll(firstResult, maxResults);
    }

    public Iterable<PermissionState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    public Iterable<PermissionState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    public Iterable<PermissionState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().getByProperty(propertyName, propertyValue, orders, firstResult, maxResults);
    }

    public long getCount(Iterable<Map.Entry<String, Object>> filter) {
        return getStateRepository().getCount(filter);
    }

    public long getCount(Criterion filter) {
        return getStateRepository().getCount(filter);
    }

    public PermissionStateEvent getStateEvent(String permissionId, long version) {
        throw new UnsupportedOperationException(); //todo
    }


    public PermissionAggregate getPermissionAggregate(PermissionState state)
    {
        return new AbstractPermissionAggregate.SimplePermissionAggregate(state);
    }

    public EventStoreAggregateId toEventStoreAggregateId(String aggregateId)
    {
        return new EventStoreAggregateId.SimpleEventStoreAggregateId(aggregateId);
    }

    protected void update(PermissionCommand c, Consumer<PermissionAggregate> action)
    {
        String aggregateId = c.getPermissionId();
        PermissionState state = getStateRepository().get(aggregateId);
        PermissionAggregate aggregate = getPermissionAggregate(state);

        EventStoreAggregateId eventStoreAggregateId = toEventStoreAggregateId(aggregateId);

        boolean repeated = isRepeatedCommand(c, eventStoreAggregateId, state);
        if (repeated) { return; }

        aggregate.throwOnInvalidStateTransition(c);
        action.accept(aggregate);
        getEventStore().appendEvents(eventStoreAggregateId, c.getVersion(), // State version may be null!
            aggregate.getChanges(), (events) -> { getStateRepository().save(state); });
        
    }

    protected boolean isRepeatedCommand(PermissionCommand command, EventStoreAggregateId eventStoreAggregateId, PermissionState state)
    {
        boolean repeated = false;
        if (command.getVersion() == null) { command.setVersion(PermissionState.VERSION_NULL); }
        if (state.getVersion() != null && state.getVersion() > command.getVersion())
        {
            Event lastEvent = getEventStore().findLastEvent(PermissionStateEvent.class, eventStoreAggregateId, command.getVersion());
            if (lastEvent != null && lastEvent instanceof AbstractStateEvent && command.getCommandId().equals(((AbstractStateEvent) lastEvent).getCommandId()))
            {
                repeated = true;
            }
        }
        return repeated;
    }

    public static class SimplePermissionApplicationService extends AbstractPermissionApplicationService 
    {
        public SimplePermissionApplicationService(EventStore eventStore, PermissionStateRepository stateRepository)
        {
            super(eventStore, stateRepository);
        }

    }

}

