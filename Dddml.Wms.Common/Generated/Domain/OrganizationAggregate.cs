﻿// <autogenerated>
//   This file was generated by T4 code generator GenerateBoundedContextDomainAggregates.tt.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

using System;
using System.Collections.Generic;
using Dddml.Wms.Specialization;
using Dddml.Wms.Domain;

namespace Dddml.Wms.Domain
{
    public partial class OrganizationAggregate : AggregateBase, IOrganizationAggregate
    {

        readonly IOrganizationState _state;

        readonly IList<IEvent> _changes = new List<IEvent>();

        public IOrganizationState State
        {
            get
            {
                return _state;
            }
        }

        public IList<IEvent> Changes
        {
            get
            {
                return _changes;
            }
        }

        #region IIdentity implementation

        string IGlobalIdentity<string>.GlobalId
        {
            get
            {
                return this._state.GlobalId;
            }
        }

        #endregion


        public OrganizationAggregate(IOrganizationState state)
        {
            _state = state;
        }


        public virtual void ThrowOnInvalidStateTransition(ICommand c)
        {
            if (((IOrganizationStateProperties)_state).Version == OrganizationState.VersionZero)
            {
                if (IsCommandCreate((IOrganizationCommand)c))
                {
                    return;
                }
                throw DomainError.Named("premature", "Can't do anything to unexistent aggregate");
            }
            if (_state.Deleted)
            {
                throw DomainError.Named("zombie", "Can't do anything to deleted aggregate.");
            }
            if (IsCommandCreate((IOrganizationCommand)c))
                throw DomainError.Named("rebirth", "Can't create aggregate that already exists");
        }

        private static bool IsCommandCreate(IOrganizationCommand c)
        {
            return c.Version == OrganizationState.VersionZero;
        }

        protected virtual void Apply(IEvent e)
        {
            OnApplying(e);
            _state.Mutate(e);
            _changes.Add(e);
        }

        public virtual void Create(ICreateOrganization c)
        {
            IOrganizationStateCreated e = Map(c);
            Apply(e);
        }

        public virtual void MergePatch(IMergePatchOrganization c)
        {
            IOrganizationStateMergePatched e = Map(c);
            Apply(e);
        }

        public virtual void Delete(IDeleteOrganization c)
        {
            IOrganizationStateDeleted e = Map(c);
            Apply(e);
        }


        protected virtual IOrganizationStateCreated Map(ICreateOrganization c)
        {
			var stateEventId = new OrganizationStateEventId(c.OrganizationId, c.Version);
            IOrganizationStateCreated e = NewOrganizationStateCreated(stateEventId);
		
            e.Name = c.Name;
            e.Description = c.Description;
            e.Type = c.Type;
            e.IsSummary = c.IsSummary;
            e.Active = c.Active;
            ReflectUtils.CopyPropertyValue("CommandId", c, e);


            e.CreatedBy = (string)c.RequesterId;
            e.CreatedAt = DateTime.Now;
			var version = c.Version;


            return e;
        }

        protected virtual IOrganizationStateMergePatched Map(IMergePatchOrganization c)
        {
			var stateEventId = new OrganizationStateEventId(c.OrganizationId, c.Version);
            IOrganizationStateMergePatched e = NewOrganizationStateMergePatched(stateEventId);

            e.Name = c.Name;
            e.Description = c.Description;
            e.Type = c.Type;
            e.IsSummary = c.IsSummary;
            e.Active = c.Active;
            e.IsPropertyNameRemoved = c.IsPropertyNameRemoved;
            e.IsPropertyDescriptionRemoved = c.IsPropertyDescriptionRemoved;
            e.IsPropertyTypeRemoved = c.IsPropertyTypeRemoved;
            e.IsPropertyIsSummaryRemoved = c.IsPropertyIsSummaryRemoved;
            e.IsPropertyActiveRemoved = c.IsPropertyActiveRemoved;

            ReflectUtils.CopyPropertyValue("CommandId", c, e);


            e.CreatedBy = (string)c.RequesterId;
            e.CreatedAt = DateTime.Now;

			var version = c.Version;


            return e;
        }

        protected virtual IOrganizationStateDeleted Map(IDeleteOrganization c)
        {
			var stateEventId = new OrganizationStateEventId(c.OrganizationId, c.Version);
            IOrganizationStateDeleted e = NewOrganizationStateDeleted(stateEventId);
			
            ReflectUtils.CopyPropertyValue("CommandId", c, e);


            e.CreatedBy = (string)c.RequesterId;
            e.CreatedAt = DateTime.Now;


            return e;
        }

        private void SetNullInnerIdOrThrowOnInconsistentIds(object innerObject, string innerIdName, object innerIdValue, string outerIdName, object outerIdValue)
        {
            if (innerIdValue == null)
            {
                ReflectUtils.SetPropertyValue(innerIdName, innerObject, outerIdValue);
            }
            else if (!Object.Equals(innerIdValue, outerIdValue))
            {
                if (innerIdValue is string && outerIdValue is string && ((string)innerIdValue).Normalize() == ((string)outerIdValue).Normalize())
                {
                    return;
                }
                throw DomainError.Named("inconsistentId", "Outer {0} {1} NOT equals inner {2} {3}", outerIdName, outerIdValue, innerIdName, innerIdValue);
            }
        }

////////////////////////

        protected OrganizationStateCreated NewOrganizationStateCreated(string commandId, string requesterId)
        {
            var stateEventId = new OrganizationStateEventId(_state.OrganizationId, ((IOrganizationStateProperties)_state).Version);
            var e = NewOrganizationStateCreated(stateEventId);

            e.CommandId = commandId;

            e.CreatedBy = (string)requesterId;
            e.CreatedAt = DateTime.Now;

            return e;
        }

        protected OrganizationStateMergePatched NewOrganizationStateMergePatched(string commandId, string requesterId)
        {
            var stateEventId = new OrganizationStateEventId(_state.OrganizationId, ((IOrganizationStateProperties)_state).Version);
            var e = NewOrganizationStateMergePatched(stateEventId);

            e.CommandId = commandId;

            e.CreatedBy = (string)requesterId;
            e.CreatedAt = DateTime.Now;

            return e;
        }


        protected OrganizationStateDeleted NewOrganizationStateDeleted(string commandId, string requesterId)
        {
            var stateEventId = new OrganizationStateEventId(_state.OrganizationId, ((IOrganizationStateProperties)_state).Version);
            var e = NewOrganizationStateDeleted(stateEventId);

            e.CommandId = commandId;

            e.CreatedBy = (string)requesterId;
            e.CreatedAt = DateTime.Now;

            return e;
        }

////////////////////////

		private OrganizationStateCreated NewOrganizationStateCreated(OrganizationStateEventId stateEventId)
		{
			return new OrganizationStateCreated(stateEventId);			
		}

        private OrganizationStateMergePatched NewOrganizationStateMergePatched(OrganizationStateEventId stateEventId)
		{
			return new OrganizationStateMergePatched(stateEventId);
		}

        private OrganizationStateDeleted NewOrganizationStateDeleted(OrganizationStateEventId stateEventId)
		{
			return new OrganizationStateDeleted(stateEventId);
		}


    }

}

