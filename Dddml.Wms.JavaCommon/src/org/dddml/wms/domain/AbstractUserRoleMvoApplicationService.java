package org.dddml.wms.domain;

import java.util.*;
import java.util.function.Consumer;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractUserRoleMvoApplicationService implements UserRoleMvoApplicationService
{

    private EventStore eventStore;

    protected EventStore getEventStore()
    {
        return eventStore;
    }

    private UserRoleMvoStateRepository stateRepository;

    protected UserRoleMvoStateRepository getStateRepository()
    {
        return stateRepository;
    }

    public AbstractUserRoleMvoApplicationService(EventStore eventStore, UserRoleMvoStateRepository stateRepository)
    {
        this.eventStore = eventStore;
        this.stateRepository = stateRepository;
    }

    public void when(UserRoleMvoCommand.CreateUserRoleMvo c) {
        update(c, ar -> ar.create(c));
    }

    public void when(UserRoleMvoCommand.MergePatchUserRoleMvo c) {
        update(c, ar -> ar.mergePatch(c));
    }

    public void when(UserRoleMvoCommand.DeleteUserRoleMvo c) {
        update(c, ar -> ar.delete(c));
    }

    public UserRoleMvoState get(UserRoleId id) {
        UserRoleMvoState state = getStateRepository().get(id);

        if (state != null && state.isStateUnsaved()) { state = null; }

        return state;
    }

    public Iterable<UserRoleMvoState> getAll(Integer firstResult, Integer maxResults) {
        return getStateRepository().getAll(firstResult, maxResults);
    }

    public Iterable<UserRoleMvoState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    //public Iterable<UserRoleMvoState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    public Iterable<UserRoleMvoState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().getByProperty(propertyName, propertyValue, orders, firstResult, maxResults);
    }

    public long getCount(Iterable<Map.Entry<String, Object>> filter) {
        return getStateRepository().getCount(filter);
    }

    //public long getCount(Criterion filter);

    public UserRoleMvoStateEvent getStateEvent(UserRoleId userRoleId, long version) {
        throw new UnsupportedOperationException(); //todo
    }

    public UserRoleMvoAggregate getUserRoleMvoAggregate(UserRoleMvoState state)
    {
        return new AbstractUserRoleMvoAggregate.SimpleUserRoleMvoAggregate(state);
    }

    public EventStoreAggregateId toEventStoreAggregateId(UserRoleId aggregateId)
    {
        return new EventStoreAggregateId.SimpleEventStoreAggregateId(aggregateId);
    }

    protected void update(UserRoleMvoCommand c, Consumer<UserRoleMvoAggregate> action)
    {
        UserRoleId aggregateId = c.getUserRoleId();
        UserRoleMvoState state = getStateRepository().get(aggregateId);
        UserRoleMvoAggregate aggregate = getUserRoleMvoAggregate(state);

        EventStoreAggregateId eventStoreAggregateId = toEventStoreAggregateId(aggregateId);

        boolean repeated = isRepeatedCommand(c, eventStoreAggregateId, state);
        if (repeated) { return; }

        aggregate.throwOnInvalidStateTransition(c);
        action.accept(aggregate);
        getEventStore().appendEvents(eventStoreAggregateId, c.getUserVersion(), // State version may be null!
            aggregate.getChanges(), (events) -> { getStateRepository().save(state); });
        
    }

    protected boolean isRepeatedCommand(UserRoleMvoCommand command, EventStoreAggregateId eventStoreAggregateId, UserRoleMvoState state)
    {
        boolean repeated = false;
        if (command.getUserVersion() == null) { command.setUserVersion(UserRoleMvoState.VERSION_NULL); }
        if (state.getUserVersion() != null && state.getUserVersion() > command.getUserVersion())
        {
            Event lastEvent = getEventStore().findLastEvent(UserRoleMvoStateEvent.class, eventStoreAggregateId, command.getUserVersion());
            if (lastEvent != null && lastEvent instanceof AbstractStateEvent && command.getCommandId().equals(((AbstractStateEvent) lastEvent).getCommandId()))
            {
                repeated = true;
            }
        }
        return repeated;
    }

    public static class SimpleUserRoleMvoApplicationService extends AbstractUserRoleMvoApplicationService 
    {
        public SimpleUserRoleMvoApplicationService(EventStore eventStore, UserRoleMvoStateRepository stateRepository)
        {
            super(eventStore, stateRepository);
        }

    }

}

