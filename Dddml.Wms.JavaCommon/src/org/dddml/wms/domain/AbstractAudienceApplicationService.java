package org.dddml.wms.domain;

import java.util.*;
import java.util.function.Consumer;
import org.dddml.support.criterion.Criterion;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractAudienceApplicationService implements AudienceApplicationService
{

    private EventStore eventStore;

    protected EventStore getEventStore()
    {
        return eventStore;
    }

    private AudienceStateRepository stateRepository;

    protected AudienceStateRepository getStateRepository()
    {
        return stateRepository;
    }

    public AbstractAudienceApplicationService(EventStore eventStore, AudienceStateRepository stateRepository)
    {
        this.eventStore = eventStore;
        this.stateRepository = stateRepository;
    }

    public void when(AudienceCommand.CreateAudience c) {
        update(c, ar -> ar.create(c));
    }

    public void when(AudienceCommand.MergePatchAudience c) {
        update(c, ar -> ar.mergePatch(c));
    }

    public void when(AudienceCommand.DeleteAudience c) {
        update(c, ar -> ar.delete(c));
    }

    public AudienceState get(String id) {
        AudienceState state = getStateRepository().get(id);

        if (state != null && state.isStateUnsaved()) { state = null; }

        return state;
    }

    public Iterable<AudienceState> getAll(Integer firstResult, Integer maxResults) {
        return getStateRepository().getAll(firstResult, maxResults);
    }

    public Iterable<AudienceState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    public Iterable<AudienceState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    public Iterable<AudienceState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().getByProperty(propertyName, propertyValue, orders, firstResult, maxResults);
    }

    public long getCount(Iterable<Map.Entry<String, Object>> filter) {
        return getStateRepository().getCount(filter);
    }

    public long getCount(Criterion filter) {
        return getStateRepository().getCount(filter);
    }

    public AudienceStateEvent getStateEvent(String clientId, long version) {
        AudienceStateEvent e = (AudienceStateEvent)getEventStore().getStateEvent(toEventStoreAggregateId(clientId), version);
        if (e != null)
        { e.setStateEventReadOnly(true); }
        return e;
    }


    public AudienceAggregate getAudienceAggregate(AudienceState state)
    {
        return new AbstractAudienceAggregate.SimpleAudienceAggregate(state);
    }

    public EventStoreAggregateId toEventStoreAggregateId(String aggregateId)
    {
        return new EventStoreAggregateId.SimpleEventStoreAggregateId(aggregateId);
    }

    protected void update(AudienceCommand c, Consumer<AudienceAggregate> action)
    {
        String aggregateId = c.getClientId();
        AudienceState state = getStateRepository().get(aggregateId);
        AudienceAggregate aggregate = getAudienceAggregate(state);

        EventStoreAggregateId eventStoreAggregateId = toEventStoreAggregateId(aggregateId);

        boolean repeated = isRepeatedCommand(c, eventStoreAggregateId, state);
        if (repeated) { return; }

        aggregate.throwOnInvalidStateTransition(c);
        action.accept(aggregate);
        getEventStore().appendEvents(eventStoreAggregateId, c.getVersion(), // State version may be null!
            aggregate.getChanges(), (events) -> { getStateRepository().save(state); });
        
    }

    protected boolean isRepeatedCommand(AudienceCommand command, EventStoreAggregateId eventStoreAggregateId, AudienceState state)
    {
        boolean repeated = false;
        if (command.getVersion() == null) { command.setVersion(AudienceState.VERSION_NULL); }
        if (state.getVersion() != null && state.getVersion() > command.getVersion())
        {
            Event lastEvent = getEventStore().findLastEvent(AbstractAudienceStateEvent.class, eventStoreAggregateId, command.getVersion());
            if (lastEvent != null && lastEvent instanceof AbstractStateEvent
               && command.getCommandId() != null && command.getCommandId().equals(((AbstractStateEvent) lastEvent).getCommandId()))
            {
                repeated = true;
            }
        }
        return repeated;
    }

    public static class SimpleAudienceApplicationService extends AbstractAudienceApplicationService 
    {
        public SimpleAudienceApplicationService(EventStore eventStore, AudienceStateRepository stateRepository)
        {
            super(eventStore, stateRepository);
        }

    }

}

