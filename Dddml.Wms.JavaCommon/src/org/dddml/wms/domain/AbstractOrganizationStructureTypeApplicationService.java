package org.dddml.wms.domain;

import java.util.*;
import java.util.function.Consumer;
import org.dddml.support.criterion.Criterion;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractOrganizationStructureTypeApplicationService implements OrganizationStructureTypeApplicationService
{

    private EventStore eventStore;

    protected EventStore getEventStore()
    {
        return eventStore;
    }

    private OrganizationStructureTypeStateRepository stateRepository;

    protected OrganizationStructureTypeStateRepository getStateRepository()
    {
        return stateRepository;
    }

    public AbstractOrganizationStructureTypeApplicationService(EventStore eventStore, OrganizationStructureTypeStateRepository stateRepository)
    {
        this.eventStore = eventStore;
        this.stateRepository = stateRepository;
    }

    public void when(OrganizationStructureTypeCommand.CreateOrganizationStructureType c) {
        update(c, ar -> ar.create(c));
    }

    public void when(OrganizationStructureTypeCommand.MergePatchOrganizationStructureType c) {
        update(c, ar -> ar.mergePatch(c));
    }

    public void when(OrganizationStructureTypeCommand.DeleteOrganizationStructureType c) {
        update(c, ar -> ar.delete(c));
    }

    public OrganizationStructureTypeState get(String id) {
        OrganizationStructureTypeState state = getStateRepository().get(id);

        if (state != null && state.isStateUnsaved()) { state = null; }

        return state;
    }

    public Iterable<OrganizationStructureTypeState> getAll(Integer firstResult, Integer maxResults) {
        return getStateRepository().getAll(firstResult, maxResults);
    }

    public Iterable<OrganizationStructureTypeState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    public Iterable<OrganizationStructureTypeState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().get(filter, orders, firstResult, maxResults);
    }

    public Iterable<OrganizationStructureTypeState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults) {
        return getStateRepository().getByProperty(propertyName, propertyValue, orders, firstResult, maxResults);
    }

    public long getCount(Iterable<Map.Entry<String, Object>> filter) {
        return getStateRepository().getCount(filter);
    }

    public long getCount(Criterion filter) {
        return getStateRepository().getCount(filter);
    }

    public OrganizationStructureTypeStateEvent getStateEvent(String id, long version) {
        throw new UnsupportedOperationException(); //todo
    }

    public OrganizationStructureTypeAggregate getOrganizationStructureTypeAggregate(OrganizationStructureTypeState state)
    {
        return new AbstractOrganizationStructureTypeAggregate.SimpleOrganizationStructureTypeAggregate(state);
    }

    public EventStoreAggregateId toEventStoreAggregateId(String aggregateId)
    {
        return new EventStoreAggregateId.SimpleEventStoreAggregateId(aggregateId);
    }

    protected void update(OrganizationStructureTypeCommand c, Consumer<OrganizationStructureTypeAggregate> action)
    {
        String aggregateId = c.getId();
        OrganizationStructureTypeState state = getStateRepository().get(aggregateId);
        OrganizationStructureTypeAggregate aggregate = getOrganizationStructureTypeAggregate(state);

        EventStoreAggregateId eventStoreAggregateId = toEventStoreAggregateId(aggregateId);

        boolean repeated = isRepeatedCommand(c, eventStoreAggregateId, state);
        if (repeated) { return; }

        aggregate.throwOnInvalidStateTransition(c);
        action.accept(aggregate);
        getEventStore().appendEvents(eventStoreAggregateId, c.getVersion(), // State version may be null!
            aggregate.getChanges(), (events) -> { getStateRepository().save(state); });
        
    }

    protected boolean isRepeatedCommand(OrganizationStructureTypeCommand command, EventStoreAggregateId eventStoreAggregateId, OrganizationStructureTypeState state)
    {
        boolean repeated = false;
        if (command.getVersion() == null) { command.setVersion(OrganizationStructureTypeState.VERSION_NULL); }
        if (state.getVersion() != null && state.getVersion() > command.getVersion())
        {
            Event lastEvent = getEventStore().findLastEvent(OrganizationStructureTypeStateEvent.class, eventStoreAggregateId, command.getVersion());
            if (lastEvent != null && lastEvent instanceof AbstractStateEvent && command.getCommandId().equals(((AbstractStateEvent) lastEvent).getCommandId()))
            {
                repeated = true;
            }
        }
        return repeated;
    }

    public static class SimpleOrganizationStructureTypeApplicationService extends AbstractOrganizationStructureTypeApplicationService 
    {
        public SimpleOrganizationStructureTypeApplicationService(EventStore eventStore, OrganizationStructureTypeStateRepository stateRepository)
        {
            super(eventStore, stateRepository);
        }

    }

}

