package org.dddml.wms.domain;

import java.util.*;
import java.util.function.Consumer;
import org.dddml.support.criterion.Criterion;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractRolePermissionApplicationService implements RolePermissionApplicationService
{

    private EventStore eventStore;

    protected EventStore getEventStore()
    {
        return eventStore;
    }

    private RolePermissionStateRepository stateRepository;

    protected RolePermissionStateRepository getStateRepository()
    {
        return stateRepository;
    }

    public AbstractRolePermissionApplicationService(EventStore eventStore, RolePermissionStateRepository stateRepository)
    {
        this.eventStore = eventStore;
        this.stateRepository = stateRepository;
    }

    public void when(RolePermissionCommand.CreateRolePermission c) {
        update(c, ar -> ar.create(c));
    }

    public void when(RolePermissionCommand.MergePatchRolePermission c) {
        update(c, ar -> ar.mergePatch(c));
    }

    public void when(RolePermissionCommand.DeleteRolePermission c) {
        update(c, ar -> ar.delete(c));
    }

    public RolePermissionState get(RolePermissionId id) {
        RolePermissionState state = getStateRepository().get(id);

        if (state != null && state.isStateUnsaved()) { state = null; }

        return state;
    }

    public Iterable<RolePermissionState> getAll(Integer firstResult, Integer maxResults) {
        return getStateRepository().getAll(firstResult, maxResults);
    }

    public Iterable<RolePermissionState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    public Iterable<RolePermissionState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    public Iterable<RolePermissionState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().getByProperty(propertyName, propertyValue, orders, firstResult, maxResults);
    }

    public long getCount(Iterable<Map.Entry<String, Object>> filter) {
        return getStateRepository().getCount(filter);
    }

    public long getCount(Criterion filter) {
        return getStateRepository().getCount(filter);
    }

    public RolePermissionStateEvent getStateEvent(RolePermissionId id, long version) {
        RolePermissionStateEvent e = (RolePermissionStateEvent)getEventStore().getStateEvent(toEventStoreAggregateId(id), version);
        if (e != null)
        { e.setStateEventReadOnly(true); }
        return e;
    }


    public RolePermissionAggregate getRolePermissionAggregate(RolePermissionState state)
    {
        return new AbstractRolePermissionAggregate.SimpleRolePermissionAggregate(state);
    }

    public EventStoreAggregateId toEventStoreAggregateId(RolePermissionId aggregateId)
    {
        return new EventStoreAggregateId.SimpleEventStoreAggregateId(aggregateId);
    }

    protected void update(RolePermissionCommand c, Consumer<RolePermissionAggregate> action)
    {
        RolePermissionId aggregateId = c.getId();
        RolePermissionState state = getStateRepository().get(aggregateId);
        RolePermissionAggregate aggregate = getRolePermissionAggregate(state);

        EventStoreAggregateId eventStoreAggregateId = toEventStoreAggregateId(aggregateId);

        boolean repeated = isRepeatedCommand(c, eventStoreAggregateId, state);
        if (repeated) { return; }

        aggregate.throwOnInvalidStateTransition(c);
        action.accept(aggregate);
        getEventStore().appendEvents(eventStoreAggregateId, c.getVersion(), // State version may be null!
            aggregate.getChanges(), (events) -> { getStateRepository().save(state); });
        
    }

    protected boolean isRepeatedCommand(RolePermissionCommand command, EventStoreAggregateId eventStoreAggregateId, RolePermissionState state)
    {
        boolean repeated = false;
        if (command.getVersion() == null) { command.setVersion(RolePermissionState.VERSION_NULL); }
        if (state.getVersion() != null && state.getVersion() > command.getVersion())
        {
            Event lastEvent = getEventStore().findLastEvent(RolePermissionStateEvent.class, eventStoreAggregateId, command.getVersion());
            if (lastEvent != null && lastEvent instanceof AbstractStateEvent && command.getCommandId().equals(((AbstractStateEvent) lastEvent).getCommandId()))
            {
                repeated = true;
            }
        }
        return repeated;
    }

    public static class SimpleRolePermissionApplicationService extends AbstractRolePermissionApplicationService 
    {
        public SimpleRolePermissionApplicationService(EventStore eventStore, RolePermissionStateRepository stateRepository)
        {
            super(eventStore, stateRepository);
        }

    }

}

