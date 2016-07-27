package org.dddml.wms.domain;

import java.util.*;
import java.util.function.Consumer;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractAttributeSetInstanceExtensionFieldGroupApplicationService implements AttributeSetInstanceExtensionFieldGroupApplicationService
{

    private EventStore eventStore;

    protected EventStore getEventStore()
    {
        return eventStore;
    }

    private AttributeSetInstanceExtensionFieldGroupStateRepository stateRepository;

    protected AttributeSetInstanceExtensionFieldGroupStateRepository getStateRepository()
    {
        return stateRepository;
    }

    public AbstractAttributeSetInstanceExtensionFieldGroupApplicationService(EventStore eventStore, AttributeSetInstanceExtensionFieldGroupStateRepository stateRepository)
    {
        this.eventStore = eventStore;
        this.stateRepository = stateRepository;
    }

    public void when(AttributeSetInstanceExtensionFieldGroupCommand.CreateAttributeSetInstanceExtensionFieldGroup c) {
        update(c, ar -> ar.create(c));
    }

    public void when(AttributeSetInstanceExtensionFieldGroupCommand.MergePatchAttributeSetInstanceExtensionFieldGroup c) {
        update(c, ar -> ar.mergePatch(c));
    }

    public void when(AttributeSetInstanceExtensionFieldGroupCommand.DeleteAttributeSetInstanceExtensionFieldGroup c) {
        update(c, ar -> ar.delete(c));
    }

    public AttributeSetInstanceExtensionFieldGroupState get(String id) {
        AttributeSetInstanceExtensionFieldGroupState state = getStateRepository().get(id);

        if (state != null && state.isStateUnsaved()) { state = null; }

        return state;
    }

    public Iterable<AttributeSetInstanceExtensionFieldGroupState> getAll(Integer firstResult, Integer maxResults) {
        return getStateRepository().getAll(firstResult, maxResults);
    }

    public Iterable<AttributeSetInstanceExtensionFieldGroupState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    //public Iterable<AttributeSetInstanceExtensionFieldGroupState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    public Iterable<AttributeSetInstanceExtensionFieldGroupState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().getByProperty(propertyName, propertyValue, orders, firstResult, maxResults);
    }

    public long getCount(Iterable<Map.Entry<String, Object>> filter) {
        return getStateRepository().getCount(filter);
    }

    //public long getCount(Criterion filter);

    public AttributeSetInstanceExtensionFieldGroupStateEvent getStateEvent(String id, long version) {
        throw new UnsupportedOperationException(); //todo
    }

    public AttributeSetInstanceExtensionFieldGroupAggregate getAttributeSetInstanceExtensionFieldGroupAggregate(AttributeSetInstanceExtensionFieldGroupState state)
    {
        return new AbstractAttributeSetInstanceExtensionFieldGroupAggregate.SimpleAttributeSetInstanceExtensionFieldGroupAggregate(state);
    }

    public EventStoreAggregateId toEventStoreAggregateId(String aggregateId)
    {
        return new EventStoreAggregateId.SimpleEventStoreAggregateId(aggregateId);
    }

    protected void update(AttributeSetInstanceExtensionFieldGroupCommand c, Consumer<AttributeSetInstanceExtensionFieldGroupAggregate> action)
    {
        String aggregateId = c.getId();
        AttributeSetInstanceExtensionFieldGroupState state = getStateRepository().get(aggregateId);
        AttributeSetInstanceExtensionFieldGroupAggregate aggregate = getAttributeSetInstanceExtensionFieldGroupAggregate(state);

        EventStoreAggregateId eventStoreAggregateId = toEventStoreAggregateId(aggregateId);

        boolean repeated = isRepeatedCommand(c, eventStoreAggregateId, state);
        if (repeated) { return; }

        aggregate.throwOnInvalidStateTransition(c);
        action.accept(aggregate);
        getEventStore().appendEvents(eventStoreAggregateId, state.getVersion(), aggregate.getChanges(), (events) -> { getStateRepository().save(state); });
        
    }

    protected boolean isRepeatedCommand(AttributeSetInstanceExtensionFieldGroupCommand command, EventStoreAggregateId eventStoreAggregateId, AttributeSetInstanceExtensionFieldGroupState state)
    {
        boolean repeated = false;
        if (state.getVersion() > command.getVersion())
        {
            Event lastEvent = getEventStore().findLastEvent(AttributeSetInstanceExtensionFieldGroupStateEvent.class, eventStoreAggregateId, command.getVersion());
            if (lastEvent != null && lastEvent instanceof AbstractStateEvent && command.getCommandId().equals(((AbstractStateEvent) lastEvent).getCommandId()))
            {
                repeated = true;
            }
        }
        return repeated;
    }

    public static class SimpleAttributeSetInstanceExtensionFieldGroupApplicationService extends AbstractAttributeSetInstanceExtensionFieldGroupApplicationService 
    {
        public SimpleAttributeSetInstanceExtensionFieldGroupApplicationService(EventStore eventStore, AttributeSetInstanceExtensionFieldGroupStateRepository stateRepository)
        {
            super(eventStore, stateRepository);
        }

    }

}

