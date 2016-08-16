package org.dddml.wms.domain;

import java.util.*;
import java.util.function.Consumer;
import org.dddml.support.criterion.Criterion;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractDayPlanMvoApplicationService implements DayPlanMvoApplicationService
{

    private EventStore eventStore;

    protected EventStore getEventStore()
    {
        return eventStore;
    }

    private DayPlanMvoStateRepository stateRepository;

    protected DayPlanMvoStateRepository getStateRepository()
    {
        return stateRepository;
    }

    public AbstractDayPlanMvoApplicationService(EventStore eventStore, DayPlanMvoStateRepository stateRepository)
    {
        this.eventStore = eventStore;
        this.stateRepository = stateRepository;
    }

    public void when(DayPlanMvoCommand.CreateDayPlanMvo c) {
        update(c, ar -> ar.create(c));
    }

    public void when(DayPlanMvoCommand.MergePatchDayPlanMvo c) {
        update(c, ar -> ar.mergePatch(c));
    }

    public void when(DayPlanMvoCommand.DeleteDayPlanMvo c) {
        update(c, ar -> ar.delete(c));
    }

    public DayPlanMvoState get(DayPlanId id) {
        DayPlanMvoState state = getStateRepository().get(id);

        if (state != null && state.isStateUnsaved()) { state = null; }

        return state;
    }

    public Iterable<DayPlanMvoState> getAll(Integer firstResult, Integer maxResults) {
        return getStateRepository().getAll(firstResult, maxResults);
    }

    public Iterable<DayPlanMvoState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    public Iterable<DayPlanMvoState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    public Iterable<DayPlanMvoState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().getByProperty(propertyName, propertyValue, orders, firstResult, maxResults);
    }

    public long getCount(Iterable<Map.Entry<String, Object>> filter) {
        return getStateRepository().getCount(filter);
    }

    public long getCount(Criterion filter) {
        return getStateRepository().getCount(filter);
    }

    public DayPlanMvoStateEvent getStateEvent(DayPlanId dayPlanId, long version) {
        DayPlanMvoStateEvent e = (DayPlanMvoStateEvent)getEventStore().getStateEvent(toEventStoreAggregateId(dayPlanId), version);
        if (e != null)
        { e.setStateEventReadOnly(true); }
        return e;
    }


    public DayPlanMvoAggregate getDayPlanMvoAggregate(DayPlanMvoState state)
    {
        return new AbstractDayPlanMvoAggregate.SimpleDayPlanMvoAggregate(state);
    }

    public EventStoreAggregateId toEventStoreAggregateId(DayPlanId aggregateId)
    {
        return new EventStoreAggregateId.SimpleEventStoreAggregateId(aggregateId);
    }

    protected void update(DayPlanMvoCommand c, Consumer<DayPlanMvoAggregate> action)
    {
        DayPlanId aggregateId = c.getDayPlanId();
        DayPlanMvoState state = getStateRepository().get(aggregateId);
        DayPlanMvoAggregate aggregate = getDayPlanMvoAggregate(state);

        EventStoreAggregateId eventStoreAggregateId = toEventStoreAggregateId(aggregateId);

        boolean repeated = isRepeatedCommand(c, eventStoreAggregateId, state);
        if (repeated) { return; }

        aggregate.throwOnInvalidStateTransition(c);
        action.accept(aggregate);
        getEventStore().appendEvents(eventStoreAggregateId, c.getPersonVersion(), // State version may be null!
            aggregate.getChanges(), (events) -> { getStateRepository().save(state); });
        
    }

    protected boolean isRepeatedCommand(DayPlanMvoCommand command, EventStoreAggregateId eventStoreAggregateId, DayPlanMvoState state)
    {
        boolean repeated = false;
        if (command.getPersonVersion() == null) { command.setPersonVersion(DayPlanMvoState.VERSION_NULL); }
        if (state.getPersonVersion() != null && state.getPersonVersion() > command.getPersonVersion())
        {
            Event lastEvent = getEventStore().findLastEvent(AbstractDayPlanMvoStateEvent.class, eventStoreAggregateId, command.getPersonVersion());
            if (lastEvent != null && lastEvent instanceof AbstractStateEvent
               && command.getCommandId() != null && command.getCommandId().equals(((AbstractStateEvent) lastEvent).getCommandId()))
            {
                repeated = true;
            }
        }
        return repeated;
    }

    public static class SimpleDayPlanMvoApplicationService extends AbstractDayPlanMvoApplicationService 
    {
        public SimpleDayPlanMvoApplicationService(EventStore eventStore, DayPlanMvoStateRepository stateRepository)
        {
            super(eventStore, stateRepository);
        }

    }

}

