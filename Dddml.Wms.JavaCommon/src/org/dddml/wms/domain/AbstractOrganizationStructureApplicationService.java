package org.dddml.wms.domain;

import java.util.*;
import java.util.function.Consumer;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractOrganizationStructureApplicationService implements OrganizationStructureApplicationService
{

    private EventStore eventStore;

    protected EventStore getEventStore()
    {
        return eventStore;
    }

    private OrganizationStructureStateRepository stateRepository;

    protected OrganizationStructureStateRepository getStateRepository()
    {
        return stateRepository;
    }

    public AbstractOrganizationStructureApplicationService(EventStore eventStore, OrganizationStructureStateRepository stateRepository)
    {
        this.eventStore = eventStore;
        this.stateRepository = stateRepository;
    }

    public void when(OrganizationStructureCommand.CreateOrganizationStructure c) {
        update(c, ar -> ar.create(c));
    }

    public void when(OrganizationStructureCommand.MergePatchOrganizationStructure c) {
        update(c, ar -> ar.mergePatch(c));
    }

    public void when(OrganizationStructureCommand.DeleteOrganizationStructure c) {
        update(c, ar -> ar.delete(c));
    }

    public OrganizationStructureState get(OrganizationStructureId id) {
        OrganizationStructureState state = getStateRepository().get(id);

        if (state != null && state.isStateUnsaved()) { state = null; }

        return state;
    }

    public Iterable<OrganizationStructureState> getAll(Integer firstResult, Integer maxResults) {
        return getStateRepository().getAll(firstResult, maxResults);
    }

    public Iterable<OrganizationStructureState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    //public Iterable<OrganizationStructureState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    public Iterable<OrganizationStructureState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().getByProperty(propertyName, propertyValue, orders, firstResult, maxResults);
    }

    public long getCount(Iterable<Map.Entry<String, Object>> filter) {
        return getStateRepository().getCount(filter);
    }

    //public long getCount(Criterion filter);

    public OrganizationStructureStateEvent getStateEvent(OrganizationStructureId id, long version) {
        throw new UnsupportedOperationException(); //todo
    }

    public OrganizationStructureAggregate getOrganizationStructureAggregate(OrganizationStructureState state)
    {
        return new AbstractOrganizationStructureAggregate.SimpleOrganizationStructureAggregate(state);
    }

    public EventStoreAggregateId toEventStoreAggregateId(OrganizationStructureId aggregateId)
    {
        return new EventStoreAggregateId.SimpleEventStoreAggregateId(aggregateId);
    }

    protected void update(OrganizationStructureCommand c, Consumer<OrganizationStructureAggregate> action)
    {
        OrganizationStructureId aggregateId = c.getId();
        OrganizationStructureState state = getStateRepository().get(aggregateId);
        OrganizationStructureAggregate aggregate = getOrganizationStructureAggregate(state);

        EventStoreAggregateId eventStoreAggregateId = toEventStoreAggregateId(aggregateId);

        boolean repeated = isRepeatedCommand(c, eventStoreAggregateId, state);
        if (repeated) { return; }

        aggregate.throwOnInvalidStateTransition(c);
        action.accept(aggregate);
        getEventStore().appendEvents(eventStoreAggregateId, state.getVersion(), aggregate.getChanges(), (events) -> { getStateRepository().save(state); });
        
    }

    protected boolean isRepeatedCommand(OrganizationStructureCommand command, EventStoreAggregateId eventStoreAggregateId, OrganizationStructureState state)
    {
        boolean repeated = false;
        if (state.getVersion() > command.getVersion())
        {
            Event lastEvent = getEventStore().findLastEvent(OrganizationStructureStateEvent.class, eventStoreAggregateId, command.getVersion());
            if (lastEvent != null && lastEvent instanceof AbstractStateEvent && command.getCommandId().equals(((AbstractStateEvent) lastEvent).getCommandId()))
            {
                repeated = true;
            }
        }
        return repeated;
    }

    public static class SimpleOrganizationStructureApplicationService extends AbstractOrganizationStructureApplicationService 
    {
        public SimpleOrganizationStructureApplicationService(EventStore eventStore, OrganizationStructureStateRepository stateRepository)
        {
            super(eventStore, stateRepository);
        }

    }

}

