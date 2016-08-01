package org.dddml.wms.domain;

import java.util.*;
import java.util.function.Consumer;
import org.dddml.support.criterion.Criterion;
import org.joda.money.Money;
import java.math.BigDecimal;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractInOutApplicationService implements InOutApplicationService
{

    private EventStore eventStore;

    protected EventStore getEventStore()
    {
        return eventStore;
    }

    private InOutStateRepository stateRepository;

    protected InOutStateRepository getStateRepository()
    {
        return stateRepository;
    }

    public AbstractInOutApplicationService(EventStore eventStore, InOutStateRepository stateRepository)
    {
        this.eventStore = eventStore;
        this.stateRepository = stateRepository;
    }

    public void when(InOutCommand.CreateInOut c) {
        update(c, ar -> ar.create(c));
    }

    public void when(InOutCommand.MergePatchInOut c) {
        update(c, ar -> ar.mergePatch(c));
    }

    public void when(InOutCommand.DeleteInOut c) {
        update(c, ar -> ar.delete(c));
    }

    public InOutState get(String id) {
        InOutState state = getStateRepository().get(id);

        if (state != null && state.isStateUnsaved()) { state = null; }

        return state;
    }

    public Iterable<InOutState> getAll(Integer firstResult, Integer maxResults) {
        return getStateRepository().getAll(firstResult, maxResults);
    }

    public Iterable<InOutState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    public Iterable<InOutState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    public Iterable<InOutState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().getByProperty(propertyName, propertyValue, orders, firstResult, maxResults);
    }

    public long getCount(Iterable<Map.Entry<String, Object>> filter) {
        return getStateRepository().getCount(filter);
    }

    public long getCount(Criterion filter) {
        return getStateRepository().getCount(filter);
    }

    public InOutStateEvent getStateEvent(String documentNumber, long version) {
        InOutStateEvent e = (InOutStateEvent)getEventStore().getStateEvent(toEventStoreAggregateId(documentNumber), version);
        if (e != null)
        { e.setStateEventReadOnly(true); }
        return e;
    }

    public InOutLineState getInOutLine(String inOutDocumentNumber, SkuId skuId) {
        return getStateRepository().getInOutLine(inOutDocumentNumber, skuId);
    }


    public InOutAggregate getInOutAggregate(InOutState state)
    {
        return new AbstractInOutAggregate.SimpleInOutAggregate(state);
    }

    public EventStoreAggregateId toEventStoreAggregateId(String aggregateId)
    {
        return new EventStoreAggregateId.SimpleEventStoreAggregateId(aggregateId);
    }

    protected void update(InOutCommand c, Consumer<InOutAggregate> action)
    {
        String aggregateId = c.getDocumentNumber();
        InOutState state = getStateRepository().get(aggregateId);
        InOutAggregate aggregate = getInOutAggregate(state);

        EventStoreAggregateId eventStoreAggregateId = toEventStoreAggregateId(aggregateId);

        boolean repeated = isRepeatedCommand(c, eventStoreAggregateId, state);
        if (repeated) { return; }

        aggregate.throwOnInvalidStateTransition(c);
        action.accept(aggregate);
        getEventStore().appendEvents(eventStoreAggregateId, c.getVersion(), // State version may be null!
            aggregate.getChanges(), (events) -> { getStateRepository().save(state); });
        
    }

    protected boolean isRepeatedCommand(InOutCommand command, EventStoreAggregateId eventStoreAggregateId, InOutState state)
    {
        boolean repeated = false;
        if (command.getVersion() == null) { command.setVersion(InOutState.VERSION_NULL); }
        if (state.getVersion() != null && state.getVersion() > command.getVersion())
        {
            Event lastEvent = getEventStore().findLastEvent(InOutStateEvent.class, eventStoreAggregateId, command.getVersion());
            if (lastEvent != null && lastEvent instanceof AbstractStateEvent && command.getCommandId().equals(((AbstractStateEvent) lastEvent).getCommandId()))
            {
                repeated = true;
            }
        }
        return repeated;
    }

    public static class SimpleInOutApplicationService extends AbstractInOutApplicationService 
    {
        public SimpleInOutApplicationService(EventStore eventStore, InOutStateRepository stateRepository)
        {
            super(eventStore, stateRepository);
        }

    }

}

