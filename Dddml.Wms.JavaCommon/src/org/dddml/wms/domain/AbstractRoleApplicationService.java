package org.dddml.wms.domain;

import java.util.*;
import java.util.function.Consumer;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractRoleApplicationService implements RoleApplicationService
{

    private EventStore eventStore;

    protected EventStore getEventStore()
    {
        return eventStore;
    }

    private RoleStateRepository stateRepository;

    protected RoleStateRepository getStateRepository()
    {
        return stateRepository;
    }

    public AbstractRoleApplicationService(EventStore eventStore, RoleStateRepository stateRepository)
    {
        this.eventStore = eventStore;
        this.stateRepository = stateRepository;
    }

    public void when(RoleCommand.CreateRole c) {
        update(c, ar -> ar.create(c));
    }

    public void when(RoleCommand.MergePatchRole c) {
        update(c, ar -> ar.mergePatch(c));
    }

    public void when(RoleCommand.DeleteRole c) {
        update(c, ar -> ar.delete(c));
    }

    public RoleState get(String id) {
        RoleState state = getStateRepository().get(id);

        if (state != null && state.isStateUnsaved()) { state = null; }

        return state;
    }

    public Iterable<RoleState> getAll(Integer firstResult, Integer maxResults) {
        return getStateRepository().getAll(firstResult, maxResults);
    }

    public Iterable<RoleState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    //public Iterable<RoleState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    public Iterable<RoleState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().getByProperty(propertyName, propertyValue, orders, firstResult, maxResults);
    }

    public long getCount(Iterable<Map.Entry<String, Object>> filter) {
        return getStateRepository().getCount(filter);
    }

    //public long getCount(Criterion filter);

    public RoleStateEvent getStateEvent(String roleId, long version) {
        throw new UnsupportedOperationException(); //todo
    }

    public RoleAggregate getRoleAggregate(RoleState state)
    {
        return new AbstractRoleAggregate.SimpleRoleAggregate(state);
    }

    public EventStoreAggregateId toEventStoreAggregateId(String aggregateId)
    {
        return new EventStoreAggregateId.SimpleEventStoreAggregateId(aggregateId);
    }

    protected void update(RoleCommand c, Consumer<RoleAggregate> action)
    {
        String aggregateId = c.getRoleId();
        RoleState state = getStateRepository().get(aggregateId);
        RoleAggregate aggregate = getRoleAggregate(state);

        EventStoreAggregateId eventStoreAggregateId = toEventStoreAggregateId(aggregateId);

        boolean repeated = isRepeatedCommand(c, eventStoreAggregateId, state);
        if (repeated) { return; }

        aggregate.throwOnInvalidStateTransition(c);
        action.accept(aggregate);
        getEventStore().appendEvents(eventStoreAggregateId, state.getVersion(), aggregate.getChanges(), (events) -> { getStateRepository().save(state); });
        
    }

    protected boolean isRepeatedCommand(RoleCommand command, EventStoreAggregateId eventStoreAggregateId, RoleState state)
    {
        boolean repeated = false;
        if (state.getVersion() > command.getVersion())
        {
            Event lastEvent = getEventStore().findLastEvent(RoleStateEvent.class, eventStoreAggregateId, command.getVersion());
            if (lastEvent != null && lastEvent instanceof AbstractStateEvent && command.getCommandId().equals(((AbstractStateEvent) lastEvent).getCommandId()))
            {
                repeated = true;
            }
        }
        return repeated;
    }

    public static class SimpleRoleApplicationService extends AbstractRoleApplicationService 
    {
        public SimpleRoleApplicationService(EventStore eventStore, RoleStateRepository stateRepository)
        {
            super(eventStore, stateRepository);
        }

    }

}

