package org.dddml.wms.domain;

import java.util.*;
import java.util.function.Consumer;
import org.dddml.support.criterion.Criterion;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractYearPlanMvoApplicationService implements YearPlanMvoApplicationService
{

    private EventStore eventStore;

    protected EventStore getEventStore()
    {
        return eventStore;
    }

    private YearPlanMvoStateRepository stateRepository;

    protected YearPlanMvoStateRepository getStateRepository()
    {
        return stateRepository;
    }

    public AbstractYearPlanMvoApplicationService(EventStore eventStore, YearPlanMvoStateRepository stateRepository)
    {
        this.eventStore = eventStore;
        this.stateRepository = stateRepository;
    }

    public void when(YearPlanMvoCommand.CreateYearPlanMvo c) {
        update(c, ar -> ar.create(c));
    }

    public void when(YearPlanMvoCommand.MergePatchYearPlanMvo c) {
        update(c, ar -> ar.mergePatch(c));
    }

    public void when(YearPlanMvoCommand.DeleteYearPlanMvo c) {
        update(c, ar -> ar.delete(c));
    }

    public YearPlanMvoState get(YearPlanId id) {
        YearPlanMvoState state = getStateRepository().get(id);

        if (state != null && state.isStateUnsaved()) { state = null; }

        return state;
    }

    public Iterable<YearPlanMvoState> getAll(Integer firstResult, Integer maxResults) {
        return getStateRepository().getAll(firstResult, maxResults);
    }

    public Iterable<YearPlanMvoState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    public Iterable<YearPlanMvoState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    public Iterable<YearPlanMvoState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().getByProperty(propertyName, propertyValue, orders, firstResult, maxResults);
    }

    public long getCount(Iterable<Map.Entry<String, Object>> filter) {
        return getStateRepository().getCount(filter);
    }

    public long getCount(Criterion filter) {
        return getStateRepository().getCount(filter);
    }

    public YearPlanMvoStateEvent getStateEvent(YearPlanId yearPlanId, long version) {
        YearPlanMvoStateEvent e = (YearPlanMvoStateEvent)getEventStore().getStateEvent(toEventStoreAggregateId(yearPlanId), version);
        if (e != null)
        { e.setStateEventReadOnly(true); }
        return e;
    }


    public YearPlanMvoAggregate getYearPlanMvoAggregate(YearPlanMvoState state)
    {
        return new AbstractYearPlanMvoAggregate.SimpleYearPlanMvoAggregate(state);
    }

    public EventStoreAggregateId toEventStoreAggregateId(YearPlanId aggregateId)
    {
        return new EventStoreAggregateId.SimpleEventStoreAggregateId(aggregateId);
    }

    protected void update(YearPlanMvoCommand c, Consumer<YearPlanMvoAggregate> action)
    {
        YearPlanId aggregateId = c.getYearPlanId();
        YearPlanMvoState state = getStateRepository().get(aggregateId);
        YearPlanMvoAggregate aggregate = getYearPlanMvoAggregate(state);

        EventStoreAggregateId eventStoreAggregateId = toEventStoreAggregateId(aggregateId);

        boolean repeated = isRepeatedCommand(c, eventStoreAggregateId, state);
        if (repeated) { return; }

        aggregate.throwOnInvalidStateTransition(c);
        action.accept(aggregate);
        getEventStore().appendEvents(eventStoreAggregateId, c.getPersonVersion(), // State version may be null!
            aggregate.getChanges(), (events) -> { getStateRepository().save(state); });
        
    }

    protected boolean isRepeatedCommand(YearPlanMvoCommand command, EventStoreAggregateId eventStoreAggregateId, YearPlanMvoState state)
    {
        boolean repeated = false;
        if (command.getPersonVersion() == null) { command.setPersonVersion(YearPlanMvoState.VERSION_NULL); }
        if (state.getPersonVersion() != null && state.getPersonVersion() > command.getPersonVersion())
        {
            Event lastEvent = getEventStore().findLastEvent(AbstractYearPlanMvoStateEvent.class, eventStoreAggregateId, command.getPersonVersion());
            if (lastEvent != null && lastEvent instanceof AbstractStateEvent
               && command.getCommandId() != null && command.getCommandId().equals(((AbstractStateEvent) lastEvent).getCommandId()))
            {
                repeated = true;
            }
        }
        return repeated;
    }

    public static class SimpleYearPlanMvoApplicationService extends AbstractYearPlanMvoApplicationService 
    {
        public SimpleYearPlanMvoApplicationService(EventStore eventStore, YearPlanMvoStateRepository stateRepository)
        {
            super(eventStore, stateRepository);
        }

    }

}

