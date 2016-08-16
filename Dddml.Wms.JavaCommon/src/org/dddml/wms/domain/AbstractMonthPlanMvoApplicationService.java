package org.dddml.wms.domain;

import java.util.*;
import java.util.function.Consumer;
import org.dddml.support.criterion.Criterion;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractMonthPlanMvoApplicationService implements MonthPlanMvoApplicationService
{

    private EventStore eventStore;

    protected EventStore getEventStore()
    {
        return eventStore;
    }

    private MonthPlanMvoStateRepository stateRepository;

    protected MonthPlanMvoStateRepository getStateRepository()
    {
        return stateRepository;
    }

    public AbstractMonthPlanMvoApplicationService(EventStore eventStore, MonthPlanMvoStateRepository stateRepository)
    {
        this.eventStore = eventStore;
        this.stateRepository = stateRepository;
    }

    public void when(MonthPlanMvoCommand.CreateMonthPlanMvo c) {
        update(c, ar -> ar.create(c));
    }

    public void when(MonthPlanMvoCommand.MergePatchMonthPlanMvo c) {
        update(c, ar -> ar.mergePatch(c));
    }

    public void when(MonthPlanMvoCommand.DeleteMonthPlanMvo c) {
        update(c, ar -> ar.delete(c));
    }

    public MonthPlanMvoState get(MonthPlanId id) {
        MonthPlanMvoState state = getStateRepository().get(id);

        if (state != null && state.isStateUnsaved()) { state = null; }

        return state;
    }

    public Iterable<MonthPlanMvoState> getAll(Integer firstResult, Integer maxResults) {
        return getStateRepository().getAll(firstResult, maxResults);
    }

    public Iterable<MonthPlanMvoState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    public Iterable<MonthPlanMvoState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    public Iterable<MonthPlanMvoState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().getByProperty(propertyName, propertyValue, orders, firstResult, maxResults);
    }

    public long getCount(Iterable<Map.Entry<String, Object>> filter) {
        return getStateRepository().getCount(filter);
    }

    public long getCount(Criterion filter) {
        return getStateRepository().getCount(filter);
    }

    public MonthPlanMvoStateEvent getStateEvent(MonthPlanId monthPlanId, long version) {
        MonthPlanMvoStateEvent e = (MonthPlanMvoStateEvent)getEventStore().getStateEvent(toEventStoreAggregateId(monthPlanId), version);
        if (e != null)
        { e.setStateEventReadOnly(true); }
        return e;
    }


    public MonthPlanMvoAggregate getMonthPlanMvoAggregate(MonthPlanMvoState state)
    {
        return new AbstractMonthPlanMvoAggregate.SimpleMonthPlanMvoAggregate(state);
    }

    public EventStoreAggregateId toEventStoreAggregateId(MonthPlanId aggregateId)
    {
        return new EventStoreAggregateId.SimpleEventStoreAggregateId(aggregateId);
    }

    protected void update(MonthPlanMvoCommand c, Consumer<MonthPlanMvoAggregate> action)
    {
        MonthPlanId aggregateId = c.getMonthPlanId();
        MonthPlanMvoState state = getStateRepository().get(aggregateId);
        MonthPlanMvoAggregate aggregate = getMonthPlanMvoAggregate(state);

        EventStoreAggregateId eventStoreAggregateId = toEventStoreAggregateId(aggregateId);

        boolean repeated = isRepeatedCommand(c, eventStoreAggregateId, state);
        if (repeated) { return; }

        aggregate.throwOnInvalidStateTransition(c);
        action.accept(aggregate);
        getEventStore().appendEvents(eventStoreAggregateId, c.getPersonVersion(), // State version may be null!
            aggregate.getChanges(), (events) -> { getStateRepository().save(state); });
        
    }

    protected boolean isRepeatedCommand(MonthPlanMvoCommand command, EventStoreAggregateId eventStoreAggregateId, MonthPlanMvoState state)
    {
        boolean repeated = false;
        if (command.getPersonVersion() == null) { command.setPersonVersion(MonthPlanMvoState.VERSION_NULL); }
        if (state.getPersonVersion() != null && state.getPersonVersion() > command.getPersonVersion())
        {
            Event lastEvent = getEventStore().findLastEvent(AbstractMonthPlanMvoStateEvent.class, eventStoreAggregateId, command.getPersonVersion());
            if (lastEvent != null && lastEvent instanceof AbstractStateEvent
               && command.getCommandId() != null && command.getCommandId().equals(((AbstractStateEvent) lastEvent).getCommandId()))
            {
                repeated = true;
            }
        }
        return repeated;
    }

    public static class SimpleMonthPlanMvoApplicationService extends AbstractMonthPlanMvoApplicationService 
    {
        public SimpleMonthPlanMvoApplicationService(EventStore eventStore, MonthPlanMvoStateRepository stateRepository)
        {
            super(eventStore, stateRepository);
        }

    }

}

