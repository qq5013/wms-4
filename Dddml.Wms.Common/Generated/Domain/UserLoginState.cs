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

	public partial class UserLoginState : UserLoginStateProperties, IUserLoginState
	{

		public virtual string CreatedBy { get; set; }

		public virtual DateTime CreatedAt { get; set; }

		public virtual string UpdatedBy { get; set; }

		public virtual DateTime UpdatedAt { get; set; }

		public virtual bool Deleted { get; set; }


		#region IIdentity implementation

        private UserLoginId _userLoginId = new UserLoginId();

        public virtual UserLoginId UserLoginId 
        {
            get { return this._userLoginId; }
            set { this._userLoginId = value; }
        }

		UserLoginId IGlobalIdentity<UserLoginId>.GlobalId {
			get {
				return  this.UserLoginId;
			}
		}

        LoginKey ILocalIdentity<LoginKey>.LocalId
        {
            get
            {
                return this.LoginKey;
            }
        }


        public override string UserId {
			get {
				return this.UserLoginId.UserId;
			}
			set {
				this.UserLoginId.UserId = value;
			}
		}

        public override LoginKey LoginKey {
			get {
				return this.UserLoginId.LoginKey;
			}
			set {
				this.UserLoginId.LoginKey = value;
			}
		}

		#endregion



		#region IActive implementation

		bool IActive.Active
		{
			get
			{
				return this.Active;
			}
		}

		#endregion

		#region IDeleted implementation

		bool IDeleted.Deleted
		{
			get
			{
				return this.Deleted;
			}
		}

		#endregion

		#region ICreated implementation

		string ICreated<string>.CreatedBy
		{
			get
			{
				return this.CreatedBy;
			}
			set
			{
				this.CreatedBy = value;
			}
		}

		DateTime ICreated<string>.CreatedAt
		{
			get
			{
				return this.CreatedAt;
			}
			set
			{
				this.CreatedAt = value;
			}
		}

		#endregion

		#region IUpdated implementation

		string IUpdated<string>.UpdatedBy
		{
			get
			{
				return this.UpdatedBy;
			}
		}

		DateTime IUpdated<string>.UpdatedAt
		{
			get
			{
				return this.UpdatedAt;
			}
		}

		#endregion

		#region IVersioned implementation

		long IVersioned<long>.Version
		{
			get
			{
				return this.Version;
			}
		}


		#endregion

        bool IUserLoginState.IsUnsaved
        {
            get { return ((IVersioned<long>)this).Version == VersionZero; }
        }

		public static long VersionZero
		{
			get
			{
				return (long)0;
			}
		}


		public UserLoginState ()
		{
            InitializeProperties();
		}



		public virtual void When(IUserLoginStateCreated e)
		{
			ThrowOnWrongEvent(e);
            this.Active = (e.Active != null && e.Active.HasValue) ? e.Active.Value : default(bool);

			this.Deleted = false;

			this.CreatedBy = e.CreatedBy;
			this.CreatedAt = e.CreatedAt;


		}


		public virtual void When(IUserLoginStateMergePatched e)
		{
			ThrowOnWrongEvent(e);

			if (e.Active == null)
			{
				if (e.IsPropertyActiveRemoved)
				{
					this.Active = default(bool);
				}
			}
			else
			{
				this.Active = (e.Active != null && e.Active.HasValue) ? e.Active.Value : default(bool);
			}


			this.UpdatedBy = e.CreatedBy;
			this.UpdatedAt = e.CreatedAt;


		}

		public virtual void When(IUserLoginStateRemoved e)
		{
			ThrowOnWrongEvent(e);

			this.Deleted = true;
			this.UpdatedBy = e.CreatedBy;
			this.UpdatedAt = e.CreatedAt;

		}


		public virtual void Mutate(IEvent e)
		{
			((dynamic)this).When((dynamic)e);
		}

		protected void ThrowOnWrongEvent(IUserLoginStateEvent stateEvent)
		{
				var stateEntityIdUserId = (this as IGlobalIdentity<UserLoginId>).GlobalId.UserId;
				var eventEntityIdUserId = stateEvent.StateEventId.UserId;
				if (stateEntityIdUserId != eventEntityIdUserId)
				{
					DomainError.Named("mutateWrongEntity", "Entity Id UserId {0} in state but entity id UserId {1} in event", stateEntityIdUserId, eventEntityIdUserId);
				}

				var stateEntityIdLoginKey = (this as IGlobalIdentity<UserLoginId>).GlobalId.LoginKey;
				var eventEntityIdLoginKey = stateEvent.StateEventId.LoginKey;
				if (stateEntityIdLoginKey != eventEntityIdLoginKey)
				{
					DomainError.Named("mutateWrongEntity", "Entity Id LoginKey {0} in state but entity id LoginKey {1} in event", stateEntityIdLoginKey, eventEntityIdLoginKey);
				}

			var stateVersion = this.Version;
			var eventVersion = stateEvent.Version;
			if (UserLoginState.VersionZero == eventVersion)
			{
				eventVersion = stateEvent.Version = stateVersion;
			}
			if (stateVersion != eventVersion)
			{
				throw DomainError.Named("concurrencyConflict", "Conflict between state version {0} and event version {1}", stateVersion, eventVersion);
			}

		}
	}

}

