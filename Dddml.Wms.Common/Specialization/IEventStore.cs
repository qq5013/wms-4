using System;
using System.Collections.Generic;

namespace Dddml.Wms.Specialization
{

	public interface IEventStore
	{
		EventStream LoadEventStream(IEventStoreAggregateId aggregateId);

		void AppendEvents(IEventStoreAggregateId aggregateId, long version, ICollection<IEvent> events, Action afterEventsAppended);

        IEvent FindLastEvent(Type eventType, IEventStoreAggregateId eventStoreAaggregateId, long version);

        IEvent GetStateEvent(IEventStoreAggregateId eventStoreAaggregateId, long version);
    }
}

