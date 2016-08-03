﻿// <autogenerated>
//   This file was generated by T4 code generator GenerateBoundedContextDomainAggregates.tt.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

using System;
using System.Collections.Generic;
using Dddml.Wms.Specialization;
using Dddml.Wms.Domain;
using Dddml.Support.Criterion;

namespace Dddml.Wms.Domain
{
	public abstract partial class AttributeSetInstanceExtensionFieldGroupApplicationServiceBase : IAttributeSetInstanceExtensionFieldGroupApplicationService, IApplicationService
	{
		protected abstract IEventStore EventStore { get; }

		protected abstract IAttributeSetInstanceExtensionFieldGroupStateRepository StateRepository { get; }

		protected AttributeSetInstanceExtensionFieldGroupApplicationServiceBase()
		{
		}

		protected virtual void Update(IAttributeSetInstanceExtensionFieldGroupCommand c, Action<IAttributeSetInstanceExtensionFieldGroupAggregate> action)
		{
			var aggregateId = c.AggregateId;
			var state = StateRepository.Get(aggregateId);
			var aggregate = GetAttributeSetInstanceExtensionFieldGroupAggregate(state);

			var eventStoreAggregateId = ToEventStoreAggregateId(aggregateId);

			var repeated = IsRepeatedCommand(c, eventStoreAggregateId, state);
			if (repeated) { return; }

			aggregate.ThrowOnInvalidStateTransition(c);
			action(aggregate);
			EventStore.AppendEvents(eventStoreAggregateId, ((IAttributeSetInstanceExtensionFieldGroupStateProperties)state).Version, aggregate.Changes, () => { StateRepository.Save(state); });
		}


		protected bool IsRepeatedCommand(IAttributeSetInstanceExtensionFieldGroupCommand command, IEventStoreAggregateId eventStoreAggregateId, IAttributeSetInstanceExtensionFieldGroupState state)
		{
			bool repeated = false;
			if (((IAttributeSetInstanceExtensionFieldGroupStateProperties)state).Version > command.AggregateVersion)
			{
				var lastEvent = EventStore.FindLastEvent(typeof(IAttributeSetInstanceExtensionFieldGroupStateEvent), eventStoreAggregateId, command.AggregateVersion);
				if (lastEvent != null && lastEvent.CommandId == command.CommandId)
				{
					repeated = true;
				}
			}
			return repeated;
		}


		public virtual void Execute(object command)
		{
			((dynamic)this).When((dynamic)command);
		}


		public virtual void When(ICreateAttributeSetInstanceExtensionFieldGroup c)
		{
			Update(c, ar => ar.Create(c));
		}

		public virtual void When(IMergePatchAttributeSetInstanceExtensionFieldGroup c)
		{
			Update(c, ar => ar.MergePatch(c));
		}

		public virtual void When(IDeleteAttributeSetInstanceExtensionFieldGroup c)
		{
			Update(c, ar => ar.Delete(c));
		}

        public virtual IAttributeSetInstanceExtensionFieldGroupState Get(string id)
        {
            var state = StateRepository.Get(id);

            if (state != null && state.IsUnsaved) { state = null; }

            return state;
        }

        public virtual IEnumerable<IAttributeSetInstanceExtensionFieldGroupState> GetAll(int firstResult, int maxResults)
		{
            var states = StateRepository.GetAll(firstResult, maxResults);
			return states;
		}

        public virtual IEnumerable<IAttributeSetInstanceExtensionFieldGroupState> Get(IEnumerable<KeyValuePair<string, object>> filter, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue)
		{
            var states = StateRepository.Get(filter, orders, firstResult, maxResults);
			return states;
		}

        public virtual IEnumerable<IAttributeSetInstanceExtensionFieldGroupState> Get(ICriterion filter, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue)
		{
            var states = StateRepository.Get(filter, orders, firstResult, maxResults);
			return states;
		}

        public virtual IEnumerable<IAttributeSetInstanceExtensionFieldGroupState> GetByProperty(string propertyName, object propertyValue, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue)
        {
            var states = StateRepository.GetByProperty(propertyName, propertyValue, orders, firstResult, maxResults);
			return states;
        }

        public virtual long GetCount(IEnumerable<KeyValuePair<string, object>> filter)
		{
            return StateRepository.GetCount(filter);
		}

        public virtual long GetCount(ICriterion filter)
		{
            return StateRepository.GetCount(filter);
		}

	    public virtual IAttributeSetInstanceExtensionFieldGroupStateEvent GetStateEvent(string id, long version)
        {
            var e = (IAttributeSetInstanceExtensionFieldGroupStateEvent)EventStore.GetStateEvent(ToEventStoreAggregateId(id), version);
            if (e != null)
            {
                e.ReadOnly = true;
            }
            return e;
        }

        public virtual IAttributeSetInstanceExtensionFieldState GetAttributeSetInstanceExtensionField(string groupId, string index)
        {
            return StateRepository.GetAttributeSetInstanceExtensionField(groupId, index);
        }


		public abstract IAttributeSetInstanceExtensionFieldGroupAggregate GetAttributeSetInstanceExtensionFieldGroupAggregate(IAttributeSetInstanceExtensionFieldGroupState state);

		public abstract IEventStoreAggregateId ToEventStoreAggregateId(string aggregateId);


	}

}

