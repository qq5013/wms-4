package org.dddml.wms.domain;

import java.util.*;
import java.util.function.Consumer;
import org.dddml.support.criterion.Criterion;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractPersonApplicationService implements PersonApplicationService
{

    private EventStore eventStore;

    protected EventStore getEventStore()
    {
        return eventStore;
    }

    private PersonStateRepository stateRepository;

    protected PersonStateRepository getStateRepository()
    {
        return stateRepository;
    }

    public AbstractPersonApplicationService(EventStore eventStore, PersonStateRepository stateRepository)
    {
        this.eventStore = eventStore;
        this.stateRepository = stateRepository;
    }

    public void when(PersonCommand.CreatePerson c) {
        update(c, ar -> ar.create(c));
    }

    public void when(PersonCommand.MergePatchPerson c) {
        update(c, ar -> ar.mergePatch(c));
    }

    public void when(PersonCommand.DeletePerson c) {
        update(c, ar -> ar.delete(c));
    }

    public PersonState get(PersonalName id) {
        PersonState state = getStateRepository().get(id);

        if (state != null && state.isStateUnsaved()) { state = null; }

        return state;
    }

    public Iterable<PersonState> getAll(Integer firstResult, Integer maxResults) {
        return getStateRepository().getAll(firstResult, maxResults);
    }

    public Iterable<PersonState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    public Iterable<PersonState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    public Iterable<PersonState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().getByProperty(propertyName, propertyValue, orders, firstResult, maxResults);
    }

    public long getCount(Iterable<Map.Entry<String, Object>> filter) {
        return getStateRepository().getCount(filter);
    }

    public long getCount(Criterion filter) {
        return getStateRepository().getCount(filter);
    }

    public PersonStateEvent getStateEvent(PersonalName personalName, long version) {
        PersonStateEvent e = (PersonStateEvent)getEventStore().getStateEvent(toEventStoreAggregateId(personalName), version);
        if (e != null)
        { e.setStateEventReadOnly(true); }
        return e;
    }

    public YearPlanState getYearPlan(PersonalName personalName, Integer year) {
        return getStateRepository().getYearPlan(personalName, year);
    }

    public MonthPlanState getMonthPlan(PersonalName personalName, Integer year, Integer month) {
        return getStateRepository().getMonthPlan(personalName, year, month);
    }

    public DayPlanState getDayPlan(PersonalName personalName, Integer year, Integer month, Integer day) {
        return getStateRepository().getDayPlan(personalName, year, month, day);
    }


    public PersonAggregate getPersonAggregate(PersonState state)
    {
        return new AbstractPersonAggregate.SimplePersonAggregate(state);
    }

    public EventStoreAggregateId toEventStoreAggregateId(PersonalName aggregateId)
    {
        return new EventStoreAggregateId.SimpleEventStoreAggregateId(aggregateId);
    }

    protected void update(PersonCommand c, Consumer<PersonAggregate> action)
    {
        PersonalName aggregateId = c.getPersonalName();
        PersonState state = getStateRepository().get(aggregateId);
        PersonAggregate aggregate = getPersonAggregate(state);

        EventStoreAggregateId eventStoreAggregateId = toEventStoreAggregateId(aggregateId);

        boolean repeated = isRepeatedCommand(c, eventStoreAggregateId, state);
        if (repeated) { return; }

        aggregate.throwOnInvalidStateTransition(c);
        action.accept(aggregate);
        getEventStore().appendEvents(eventStoreAggregateId, c.getVersion(), // State version may be null!
            aggregate.getChanges(), (events) -> { getStateRepository().save(state); });
        
    }

    protected boolean isRepeatedCommand(PersonCommand command, EventStoreAggregateId eventStoreAggregateId, PersonState state)
    {
        boolean repeated = false;
        if (command.getVersion() == null) { command.setVersion(PersonState.VERSION_NULL); }
        if (state.getVersion() != null && state.getVersion() > command.getVersion())
        {
            Event lastEvent = getEventStore().findLastEvent(AbstractPersonStateEvent.class, eventStoreAggregateId, command.getVersion());
            if (lastEvent != null && lastEvent instanceof AbstractStateEvent
               && command.getCommandId() != null && command.getCommandId().equals(((AbstractStateEvent) lastEvent).getCommandId()))
            {
                repeated = true;
            }
        }
        return repeated;
    }

    public static class SimplePersonApplicationService extends AbstractPersonApplicationService 
    {
        public SimplePersonApplicationService(EventStore eventStore, PersonStateRepository stateRepository)
        {
            super(eventStore, stateRepository);
        }

    }

}

