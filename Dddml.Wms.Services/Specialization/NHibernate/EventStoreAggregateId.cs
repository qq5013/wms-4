using System;
using Dddml.Wms.Specialization;

namespace Dddml.Wms.Specialization.NHibernate
{
	public class EventStoreAggregateId : IEventStoreAggregateId
	{
		public object Id { get; private set; }

		public EventStoreAggregateId (object id)
		{               
			this.Id = id;
        }

    }
}

