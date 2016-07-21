package org.dddml.wms.specialization;

import java.util.Collection;
import java.util.function.Consumer;

/**
 * Created by Yang on 2016/7/19.
 */
public interface EventStore {
    EventStream loadEventStream(EventStoreAggregateId aggregateId);

    void appendEvents(EventStoreAggregateId aggregateId, long version, Collection<Event> events, Consumer<Collection<Event>> afterEventsAppended);

    Event findLastEvent(Class eventType, EventStoreAggregateId eventStoreAggregateId, long version);

    Event getStateEvent(EventStoreAggregateId eventStoreAggregateId, long version);
}
