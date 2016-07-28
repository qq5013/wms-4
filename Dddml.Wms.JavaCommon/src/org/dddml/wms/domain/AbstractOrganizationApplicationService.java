package org.dddml.wms.domain;

import java.util.*;
import java.util.function.Consumer;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractOrganizationApplicationService implements OrganizationApplicationService
{

    private EventStore eventStore;

    protected EventStore getEventStore()
    {
        return eventStore;
    }

    private OrganizationStateRepository stateRepository;

    protected OrganizationStateRepository getStateRepository()
    {
        return stateRepository;
    }

    public AbstractOrganizationApplicationService(EventStore eventStore, OrganizationStateRepository stateRepository)
    {
        this.eventStore = eventStore;
        this.stateRepository = stateRepository;
    }

    public void when(OrganizationCommand.CreateOrganization c) {
        update(c, ar -> ar.create(c));
    }

    public void when(OrganizationCommand.MergePatchOrganization c) {
        update(c, ar -> ar.mergePatch(c));
    }

    public void when(OrganizationCommand.DeleteOrganization c) {
        update(c, ar -> ar.delete(c));
    }

    public OrganizationState get(String id) {
        OrganizationState state = getStateRepository().get(id);

        if (state != null && state.isStateUnsaved()) { state = null; }

        return state;
    }

    public Iterable<OrganizationState> getAll(Integer firstResult, Integer maxResults) {
        return getStateRepository().getAll(firstResult, maxResults);
    }

    public Iterable<OrganizationState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    //public Iterable<OrganizationState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    public Iterable<OrganizationState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().getByProperty(propertyName, propertyValue, orders, firstResult, maxResults);
    }

    public long getCount(Iterable<Map.Entry<String, Object>> filter) {
        return getStateRepository().getCount(filter);
    }

    //public long getCount(Criterion filter);

    public OrganizationStateEvent getStateEvent(String organizationId, long version) {
        throw new UnsupportedOperationException(); //todo
    }

    public OrganizationAggregate getOrganizationAggregate(OrganizationState state)
    {
        return new AbstractOrganizationAggregate.SimpleOrganizationAggregate(state);
    }

    public EventStoreAggregateId toEventStoreAggregateId(String aggregateId)
    {
        return new EventStoreAggregateId.SimpleEventStoreAggregateId(aggregateId);
    }

    protected void update(OrganizationCommand c, Consumer<OrganizationAggregate> action)
    {
        String aggregateId = c.getOrganizationId();
        OrganizationState state = getStateRepository().get(aggregateId);
        OrganizationAggregate aggregate = getOrganizationAggregate(state);

        EventStoreAggregateId eventStoreAggregateId = toEventStoreAggregateId(aggregateId);

        boolean repeated = isRepeatedCommand(c, eventStoreAggregateId, state);
        if (repeated) { return; }

        aggregate.throwOnInvalidStateTransition(c);
        action.accept(aggregate);
        getEventStore().appendEvents(eventStoreAggregateId, c.getVersion(), // State version may be null!
            aggregate.getChanges(), (events) -> { getStateRepository().save(state); });
        
    }

    protected boolean isRepeatedCommand(OrganizationCommand command, EventStoreAggregateId eventStoreAggregateId, OrganizationState state)
    {
        boolean repeated = false;
        if (command.getVersion() == null) { command.setVersion(OrganizationState.VERSION_NULL); }
        if (state.getVersion() != null && state.getVersion() > command.getVersion())
        {
            Event lastEvent = getEventStore().findLastEvent(OrganizationStateEvent.class, eventStoreAggregateId, command.getVersion());
            if (lastEvent != null && lastEvent instanceof AbstractStateEvent && command.getCommandId().equals(((AbstractStateEvent) lastEvent).getCommandId()))
            {
                repeated = true;
            }
        }
        return repeated;
    }

    public static class SimpleOrganizationApplicationService extends AbstractOrganizationApplicationService 
    {
        public SimpleOrganizationApplicationService(EventStore eventStore, OrganizationStateRepository stateRepository)
        {
            super(eventStore, stateRepository);
        }

    }

}

