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
    public partial class UserClaimMvoAggregate : AggregateBase, IUserClaimMvoAggregate
    {

        readonly IUserClaimMvoState _state;

        readonly IList<IEvent> _changes = new List<IEvent>();

        public IUserClaimMvoState State
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

        UserClaimId IGlobalIdentity<UserClaimId>.GlobalId
        {
            get
            {
                return this._state.GlobalId;
            }
        }

        #endregion


        public UserClaimMvoAggregate(IUserClaimMvoState state)
        {
            _state = state;
        }


        public virtual void ThrowOnInvalidStateTransition(ICommand c)
        {
            if (((IUserClaimMvoStateProperties)_state).UserVersion == UserClaimMvoState.VersionZero)
            {
                if (IsCommandCreate((IUserClaimMvoCommand)c))
                {
                    return;
                }
                throw DomainError.Named("premature", "Can't do anything to unexistent aggregate");
            }
            if (_state.Deleted)
            {
                throw DomainError.Named("zombie", "Can't do anything to deleted aggregate.");
            }
            if (IsCommandCreate((IUserClaimMvoCommand)c))
                throw DomainError.Named("rebirth", "Can't create aggregate that already exists");
        }

        private static bool IsCommandCreate(IUserClaimMvoCommand c)
        {
            return c.UserVersion == UserClaimMvoState.VersionZero;
        }

        protected virtual void Apply(IEvent e)
        {
            BeforeApply(e);
            _state.Mutate(e);
            _changes.Add(e);
        }

        public virtual void Create(ICreateUserClaimMvo c)
        {
            IUserClaimMvoStateCreated e = Map(c);
            Apply(e);
        }

        public virtual void MergePatch(IMergePatchUserClaimMvo c)
        {
            IUserClaimMvoStateMergePatched e = Map(c);
            Apply(e);
        }

        public virtual void Delete(IDeleteUserClaimMvo c)
        {
            IUserClaimMvoStateDeleted e = Map(c);
            Apply(e);
        }


        protected virtual IUserClaimMvoStateCreated Map(ICreateUserClaimMvo c)
        {
			var stateEventId = new UserClaimMvoStateEventId(c.UserClaimId, c.UserVersion);
            IUserClaimMvoStateCreated e = NewUserClaimMvoStateCreated(stateEventId);
		
            e.ClaimType = c.ClaimType;
            e.ClaimValue = c.ClaimValue;
            e.Version = c.Version;
            e.Active = c.Active;
            e.UserAccessFailedCount = c.UserAccessFailedCount;
            e.UserEmail = c.UserEmail;
            e.UserEmailConfirmed = c.UserEmailConfirmed;
            e.UserLockoutEnabled = c.UserLockoutEnabled;
            e.UserLockoutEndDateUtc = c.UserLockoutEndDateUtc;
            e.UserPasswordHash = c.UserPasswordHash;
            e.UserPhoneNumber = c.UserPhoneNumber;
            e.UserPhoneNumberConfirmed = c.UserPhoneNumberConfirmed;
            e.UserTwoFactorEnabled = c.UserTwoFactorEnabled;
            e.UserSecurityStamp = c.UserSecurityStamp;
            e.UserCreatedBy = c.UserCreatedBy;
            e.UserCreatedAt = c.UserCreatedAt;
            e.UserUpdatedBy = c.UserUpdatedBy;
            e.UserUpdatedAt = c.UserUpdatedAt;
            e.UserActive = c.UserActive;
            e.UserDeleted = c.UserDeleted;
            ReflectUtils.CopyPropertyValue("CommandId", c, e);


            e.CreatedBy = (string)c.RequesterId;
            e.CreatedAt = DateTime.Now;
			var userVersion = c.UserVersion;


            return e;
        }

        protected virtual IUserClaimMvoStateMergePatched Map(IMergePatchUserClaimMvo c)
        {
			var stateEventId = new UserClaimMvoStateEventId(c.UserClaimId, c.UserVersion);
            IUserClaimMvoStateMergePatched e = NewUserClaimMvoStateMergePatched(stateEventId);

            e.ClaimType = c.ClaimType;
            e.ClaimValue = c.ClaimValue;
            e.Version = c.Version;
            e.Active = c.Active;
            e.UserAccessFailedCount = c.UserAccessFailedCount;
            e.UserEmail = c.UserEmail;
            e.UserEmailConfirmed = c.UserEmailConfirmed;
            e.UserLockoutEnabled = c.UserLockoutEnabled;
            e.UserLockoutEndDateUtc = c.UserLockoutEndDateUtc;
            e.UserPasswordHash = c.UserPasswordHash;
            e.UserPhoneNumber = c.UserPhoneNumber;
            e.UserPhoneNumberConfirmed = c.UserPhoneNumberConfirmed;
            e.UserTwoFactorEnabled = c.UserTwoFactorEnabled;
            e.UserSecurityStamp = c.UserSecurityStamp;
            e.UserCreatedBy = c.UserCreatedBy;
            e.UserCreatedAt = c.UserCreatedAt;
            e.UserUpdatedBy = c.UserUpdatedBy;
            e.UserUpdatedAt = c.UserUpdatedAt;
            e.UserActive = c.UserActive;
            e.UserDeleted = c.UserDeleted;
            e.IsPropertyClaimTypeRemoved = c.IsPropertyClaimTypeRemoved;
            e.IsPropertyClaimValueRemoved = c.IsPropertyClaimValueRemoved;
            e.IsPropertyVersionRemoved = c.IsPropertyVersionRemoved;
            e.IsPropertyActiveRemoved = c.IsPropertyActiveRemoved;
            e.IsPropertyUserAccessFailedCountRemoved = c.IsPropertyUserAccessFailedCountRemoved;
            e.IsPropertyUserEmailRemoved = c.IsPropertyUserEmailRemoved;
            e.IsPropertyUserEmailConfirmedRemoved = c.IsPropertyUserEmailConfirmedRemoved;
            e.IsPropertyUserLockoutEnabledRemoved = c.IsPropertyUserLockoutEnabledRemoved;
            e.IsPropertyUserLockoutEndDateUtcRemoved = c.IsPropertyUserLockoutEndDateUtcRemoved;
            e.IsPropertyUserPasswordHashRemoved = c.IsPropertyUserPasswordHashRemoved;
            e.IsPropertyUserPhoneNumberRemoved = c.IsPropertyUserPhoneNumberRemoved;
            e.IsPropertyUserPhoneNumberConfirmedRemoved = c.IsPropertyUserPhoneNumberConfirmedRemoved;
            e.IsPropertyUserTwoFactorEnabledRemoved = c.IsPropertyUserTwoFactorEnabledRemoved;
            e.IsPropertyUserSecurityStampRemoved = c.IsPropertyUserSecurityStampRemoved;
            e.IsPropertyUserCreatedByRemoved = c.IsPropertyUserCreatedByRemoved;
            e.IsPropertyUserCreatedAtRemoved = c.IsPropertyUserCreatedAtRemoved;
            e.IsPropertyUserUpdatedByRemoved = c.IsPropertyUserUpdatedByRemoved;
            e.IsPropertyUserUpdatedAtRemoved = c.IsPropertyUserUpdatedAtRemoved;
            e.IsPropertyUserActiveRemoved = c.IsPropertyUserActiveRemoved;
            e.IsPropertyUserDeletedRemoved = c.IsPropertyUserDeletedRemoved;

            ReflectUtils.CopyPropertyValue("CommandId", c, e);


            e.CreatedBy = (string)c.RequesterId;
            e.CreatedAt = DateTime.Now;

			var userVersion = c.UserVersion;


            return e;
        }

        protected virtual IUserClaimMvoStateDeleted Map(IDeleteUserClaimMvo c)
        {
			var stateEventId = new UserClaimMvoStateEventId(c.UserClaimId, c.UserVersion);
            IUserClaimMvoStateDeleted e = NewUserClaimMvoStateDeleted(stateEventId);
			
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
            else if (innerIdValue != outerIdValue)
            {
                if (innerIdValue is string && outerIdValue is string && ((string)innerIdValue).Normalize() == ((string)outerIdValue).Normalize())
                {
                    return;
                }
                throw DomainError.Named("inconsistentId", "Outer {0} {1} NOT equals inner {2} {3}", outerIdName, outerIdValue, innerIdName, innerIdValue);
            }
        }

////////////////////////

        protected UserClaimMvoStateCreated NewUserClaimMvoStateCreated(string commandId, string requesterId)
        {
            var stateEventId = new UserClaimMvoStateEventId(_state.UserClaimId, ((IUserClaimMvoStateProperties)_state).UserVersion);
            var e = NewUserClaimMvoStateCreated(stateEventId);

            e.CommandId = commandId;

            e.CreatedBy = (string)requesterId;
            e.CreatedAt = DateTime.Now;

            return e;
        }

        protected UserClaimMvoStateMergePatched NewUserClaimMvoStateMergePatched(string commandId, string requesterId)
        {
            var stateEventId = new UserClaimMvoStateEventId(_state.UserClaimId, ((IUserClaimMvoStateProperties)_state).UserVersion);
            var e = NewUserClaimMvoStateMergePatched(stateEventId);

            e.CommandId = commandId;

            e.CreatedBy = (string)requesterId;
            e.CreatedAt = DateTime.Now;

            return e;
        }


        protected UserClaimMvoStateDeleted NewUserClaimMvoStateDeleted(string commandId, string requesterId)
        {
            var stateEventId = new UserClaimMvoStateEventId(_state.UserClaimId, ((IUserClaimMvoStateProperties)_state).UserVersion);
            var e = NewUserClaimMvoStateDeleted(stateEventId);

            e.CommandId = commandId;

            e.CreatedBy = (string)requesterId;
            e.CreatedAt = DateTime.Now;

            return e;
        }

////////////////////////

		private UserClaimMvoStateCreated NewUserClaimMvoStateCreated(UserClaimMvoStateEventId stateEventId)
		{
			return new UserClaimMvoStateCreated(stateEventId);			
		}

        private UserClaimMvoStateMergePatched NewUserClaimMvoStateMergePatched(UserClaimMvoStateEventId stateEventId)
		{
			return new UserClaimMvoStateMergePatched(stateEventId);
		}

        private UserClaimMvoStateDeleted NewUserClaimMvoStateDeleted(UserClaimMvoStateEventId stateEventId)
		{
			return new UserClaimMvoStateDeleted(stateEventId);
		}


    }

}

