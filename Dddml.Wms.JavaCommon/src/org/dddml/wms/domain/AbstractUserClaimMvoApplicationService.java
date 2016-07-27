package org.dddml.wms.domain;

import java.util.*;
import java.util.function.Consumer;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractUserClaimMvoApplicationService implements UserClaimMvoApplicationService
{

    private EventStore eventStore;

    protected EventStore getEventStore()
    {
        return eventStore;
    }

    private UserClaimMvoStateRepository stateRepository;

    protected UserClaimMvoStateRepository getStateRepository()
    {
        return stateRepository;
    }

    public AbstractUserClaimMvoApplicationService(EventStore eventStore, UserClaimMvoStateRepository stateRepository)
    {
        this.eventStore = eventStore;
        this.stateRepository = stateRepository;
    }

    public void when(UserClaimMvoCommand.CreateUserClaimMvo c) {
        update(c, ar -> ar.create(c));
    }

    public void when(UserClaimMvoCommand.MergePatchUserClaimMvo c) {
        update(c, ar -> ar.mergePatch(c));
    }

    public void when(UserClaimMvoCommand.DeleteUserClaimMvo c) {
        update(c, ar -> ar.delete(c));
    }

    public UserClaimMvoState get(UserClaimId id) {
        UserClaimMvoState state = getStateRepository().get(id);

        if (state != null && state.isStateUnsaved()) { state = null; }

        return state;
    }

    public Iterable<UserClaimMvoState> getAll(Integer firstResult, Integer maxResults) {
        return getStateRepository().getAll(firstResult, maxResults);
    }

    public Iterable<UserClaimMvoState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    //public Iterable<UserClaimMvoState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    public Iterable<UserClaimMvoState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().getByProperty(propertyName, propertyValue, orders, firstResult, maxResults);
    }

    public long getCount(Iterable<Map.Entry<String, Object>> filter) {
        return getStateRepository().getCount(filter);
    }

    //public long getCount(Criterion filter);

    public UserClaimMvoStateEvent getStateEvent(UserClaimId userClaimId, long version) {
        throw new UnsupportedOperationException(); //todo
    }

    public UserClaimMvoAggregate getUserClaimMvoAggregate(UserClaimMvoState state)
    {
        return new AbstractUserClaimMvoAggregate.SimpleUserClaimMvoAggregate(state);
    }

    public EventStoreAggregateId toEventStoreAggregateId(UserClaimId aggregateId)
    {
        return new EventStoreAggregateId.SimpleEventStoreAggregateId(aggregateId);
    }

    protected void update(UserClaimMvoCommand c, Consumer<UserClaimMvoAggregate> action)
    {
        UserClaimId aggregateId = c.getUserClaimId();
        UserClaimMvoState state = getStateRepository().get(aggregateId);
        UserClaimMvoAggregate aggregate = getUserClaimMvoAggregate(state);

        EventStoreAggregateId eventStoreAggregateId = toEventStoreAggregateId(aggregateId);

        boolean repeated = isRepeatedCommand(c, eventStoreAggregateId, state);
        if (repeated) { return; }

        aggregate.throwOnInvalidStateTransition(c);
        action.accept(aggregate);
        getEventStore().appendEvents(eventStoreAggregateId, state.getUserVersion(), aggregate.getChanges(), (events) -> { getStateRepository().save(state); });
        
    }

    protected boolean isRepeatedCommand(UserClaimMvoCommand command, EventStoreAggregateId eventStoreAggregateId, UserClaimMvoState state)
    {
        boolean repeated = false;
        if (state.getUserVersion() > command.getUserVersion())
        {
            Event lastEvent = getEventStore().findLastEvent(UserClaimMvoStateEvent.class, eventStoreAggregateId, command.getUserVersion());
            if (lastEvent != null && lastEvent instanceof AbstractStateEvent && command.getCommandId().equals(((AbstractStateEvent) lastEvent).getCommandId()))
            {
                repeated = true;
            }
        }
        return repeated;
    }

    public static class SimpleUserClaimMvoApplicationService extends AbstractUserClaimMvoApplicationService 
    {
        public SimpleUserClaimMvoApplicationService(EventStore eventStore, UserClaimMvoStateRepository stateRepository)
        {
            super(eventStore, stateRepository);
        }

    }

}

