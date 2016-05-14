using System;
using System.Collections.Generic;
using Dddml.Wms.Specialization;
using NHibernate;
using Spring.Transaction.Interceptor;


namespace Dddml.Wms.Specialization.NHibernate
{
	public abstract class NHibernateEventStoreBase : IEventStore
	{
		public ISessionFactory SessionFactory { get; set; }

		protected ISession CurrentSession {
			get { return this.SessionFactory.GetCurrentSession (); }
		}

		public NHibernateEventStoreBase ()
		{
		}


		#region IEventStore implementation

		[Transaction (ReadOnly = true)]
		public EventStream LoadEventStream (IEventStoreAggregateId aggregateId)
		{
			throw new NotImplementedException ();
		}

		[Transaction]
		public void AppendEvents (IEventStoreAggregateId aggregateId, long version, ICollection<IEvent> events, Action afterEventsAppended)
		{
			foreach (IEvent e in events) {
				CurrentSession.Save (e);

                var saveable = e as ISaveable;
				if (saveable != null) {
					saveable.Save ();
				}
                //Console.WriteLine("####################################################");
                afterEventsAppended();
                //Console.WriteLine("####################################################");

            }
        }

        [Transaction(ReadOnly = true)]
        public virtual IEvent FindLastEvent(Type eventType, IEventStoreAggregateId eventStoreAaggregateId, long version)
        {
            Type supportedEventType = GetSupportedStateEventType();
            if (!eventType.IsAssignableFrom(supportedEventType))
            {
                throw new NotSupportedException();
            }
            object eventId = GetEventId(eventStoreAaggregateId, version);

            return CurrentSession.Get(eventType, eventId) as IEvent;
        }

        #endregion

        public abstract Type GetSupportedStateEventType();

        public abstract object GetEventId(IEventStoreAggregateId eventStoreAaggregateId, long version);

    }
}

