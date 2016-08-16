package org.dddml.wms.domain;

import java.util.*;
import java.util.function.Consumer;
import org.dddml.support.criterion.Criterion;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractTeamApplicationService implements TeamApplicationService
{

    private EventStore eventStore;

    protected EventStore getEventStore()
    {
        return eventStore;
    }

    private TeamStateRepository stateRepository;

    protected TeamStateRepository getStateRepository()
    {
        return stateRepository;
    }

    public AbstractTeamApplicationService(EventStore eventStore, TeamStateRepository stateRepository)
    {
        this.eventStore = eventStore;
        this.stateRepository = stateRepository;
    }

    public void when(TeamCommand.CreateTeam c) {
        update(c, ar -> ar.create(c));
    }

    public void when(TeamCommand.MergePatchTeam c) {
        update(c, ar -> ar.mergePatch(c));
    }

    public void when(TeamCommand.DeleteTeam c) {
        update(c, ar -> ar.delete(c));
    }

    public TeamState get(String id) {
        TeamState state = getStateRepository().get(id);

        if (state != null && state.isStateUnsaved()) { state = null; }

        return state;
    }

    public Iterable<TeamState> getAll(Integer firstResult, Integer maxResults) {
        return getStateRepository().getAll(firstResult, maxResults);
    }

    public Iterable<TeamState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    public Iterable<TeamState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    public Iterable<TeamState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().getByProperty(propertyName, propertyValue, orders, firstResult, maxResults);
    }

    public long getCount(Iterable<Map.Entry<String, Object>> filter) {
        return getStateRepository().getCount(filter);
    }

    public long getCount(Criterion filter) {
        return getStateRepository().getCount(filter);
    }

    public TeamStateEvent getStateEvent(String teamName, long version) {
        TeamStateEvent e = (TeamStateEvent)getEventStore().getStateEvent(toEventStoreAggregateId(teamName), version);
        if (e != null)
        { e.setStateEventReadOnly(true); }
        return e;
    }


    public TeamAggregate getTeamAggregate(TeamState state)
    {
        return new AbstractTeamAggregate.SimpleTeamAggregate(state);
    }

    public EventStoreAggregateId toEventStoreAggregateId(String aggregateId)
    {
        return new EventStoreAggregateId.SimpleEventStoreAggregateId(aggregateId);
    }

    protected void update(TeamCommand c, Consumer<TeamAggregate> action)
    {
        String aggregateId = c.getTeamName();
        TeamState state = getStateRepository().get(aggregateId);
        TeamAggregate aggregate = getTeamAggregate(state);

        EventStoreAggregateId eventStoreAggregateId = toEventStoreAggregateId(aggregateId);

        boolean repeated = isRepeatedCommand(c, eventStoreAggregateId, state);
        if (repeated) { return; }

        aggregate.throwOnInvalidStateTransition(c);
        action.accept(aggregate);
        getEventStore().appendEvents(eventStoreAggregateId, c.getVersion(), // State version may be null!
            aggregate.getChanges(), (events) -> { getStateRepository().save(state); });
        
    }

    protected boolean isRepeatedCommand(TeamCommand command, EventStoreAggregateId eventStoreAggregateId, TeamState state)
    {
        boolean repeated = false;
        if (command.getVersion() == null) { command.setVersion(TeamState.VERSION_NULL); }
        if (state.getVersion() != null && state.getVersion() > command.getVersion())
        {
            Event lastEvent = getEventStore().findLastEvent(AbstractTeamStateEvent.class, eventStoreAggregateId, command.getVersion());
            if (lastEvent != null && lastEvent instanceof AbstractStateEvent
               && command.getCommandId() != null && command.getCommandId().equals(((AbstractStateEvent) lastEvent).getCommandId()))
            {
                repeated = true;
            }
        }
        return repeated;
    }

    public static class SimpleTeamApplicationService extends AbstractTeamApplicationService 
    {
        public SimpleTeamApplicationService(EventStore eventStore, TeamStateRepository stateRepository)
        {
            super(eventStore, stateRepository);
        }

    }

}

