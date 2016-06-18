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

	public partial class UserClaimMvoState : UserClaimMvoStateProperties, IUserClaimMvoState
	{

		//public virtual long UserVersion { get; set; }

		public virtual string CreatedBy { get; set; }

		public virtual DateTime CreatedAt { get; set; }

		public virtual string UpdatedBy { get; set; }

		public virtual DateTime UpdatedAt { get; set; }

		public virtual bool Deleted { get; set; }


		#region IIdentity implementation

		UserClaimId IGlobalIdentity<UserClaimId>.GlobalId
		{
			get
			{
				return this.UserClaimId;
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
				return this.UserVersion;
			}
		}


		#endregion

		public static long VersionZero
		{
			get
			{
				return (long)0;
			}
		}


		public UserClaimMvoState ()
		{
            InitializeProperties();
		}



		public virtual void When(IUserClaimMvoStateCreated e)
		{
			ThrowOnWrongEvent(e);
			this.ClaimType = e.ClaimType;

			this.ClaimValue = e.ClaimValue;

            this.Version = (e.Version != null && e.Version.HasValue) ? e.Version.Value : default(long);

            this.Active = (e.Active != null && e.Active.HasValue) ? e.Active.Value : default(bool);

            this.UserAccessFailedCount = (e.UserAccessFailedCount != null && e.UserAccessFailedCount.HasValue) ? e.UserAccessFailedCount.Value : default(int);

			this.UserEmail = e.UserEmail;

            this.UserEmailConfirmed = (e.UserEmailConfirmed != null && e.UserEmailConfirmed.HasValue) ? e.UserEmailConfirmed.Value : default(bool);

            this.UserLockoutEnabled = (e.UserLockoutEnabled != null && e.UserLockoutEnabled.HasValue) ? e.UserLockoutEnabled.Value : default(bool);

			this.UserLockoutEndDateUtc = e.UserLockoutEndDateUtc;

			this.UserPasswordHash = e.UserPasswordHash;

			this.UserPhoneNumber = e.UserPhoneNumber;

            this.UserPhoneNumberConfirmed = (e.UserPhoneNumberConfirmed != null && e.UserPhoneNumberConfirmed.HasValue) ? e.UserPhoneNumberConfirmed.Value : default(bool);

            this.UserTwoFactorEnabled = (e.UserTwoFactorEnabled != null && e.UserTwoFactorEnabled.HasValue) ? e.UserTwoFactorEnabled.Value : default(bool);

			this.UserSecurityStamp = e.UserSecurityStamp;

			this.UserCreatedBy = e.UserCreatedBy;

            this.UserCreatedAt = (e.UserCreatedAt != null && e.UserCreatedAt.HasValue) ? e.UserCreatedAt.Value : default(DateTime);

			this.UserUpdatedBy = e.UserUpdatedBy;

            this.UserUpdatedAt = (e.UserUpdatedAt != null && e.UserUpdatedAt.HasValue) ? e.UserUpdatedAt.Value : default(DateTime);

            this.UserActive = (e.UserActive != null && e.UserActive.HasValue) ? e.UserActive.Value : default(bool);

            this.UserDeleted = (e.UserDeleted != null && e.UserDeleted.HasValue) ? e.UserDeleted.Value : default(bool);

			this.Deleted = false;

			this.CreatedBy = e.CreatedBy;
			this.CreatedAt = e.CreatedAt;


		}


		public virtual void When(IUserClaimMvoStateMergePatched e)
		{
			ThrowOnWrongEvent(e);

			if (e.ClaimType == null)
			{
				if (e.IsPropertyClaimTypeRemoved)
				{
					this.ClaimType = default(string);
				}
			}
			else
			{
				this.ClaimType = e.ClaimType;
			}

			if (e.ClaimValue == null)
			{
				if (e.IsPropertyClaimValueRemoved)
				{
					this.ClaimValue = default(string);
				}
			}
			else
			{
				this.ClaimValue = e.ClaimValue;
			}

			if (e.Version == null)
			{
				if (e.IsPropertyVersionRemoved)
				{
					this.Version = default(long);
				}
			}
			else
			{
				this.Version = (e.Version != null && e.Version.HasValue) ? e.Version.Value : default(long);
			}

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

			if (e.UserAccessFailedCount == null)
			{
				if (e.IsPropertyUserAccessFailedCountRemoved)
				{
					this.UserAccessFailedCount = default(int);
				}
			}
			else
			{
				this.UserAccessFailedCount = (e.UserAccessFailedCount != null && e.UserAccessFailedCount.HasValue) ? e.UserAccessFailedCount.Value : default(int);
			}

			if (e.UserEmail == null)
			{
				if (e.IsPropertyUserEmailRemoved)
				{
					this.UserEmail = default(string);
				}
			}
			else
			{
				this.UserEmail = e.UserEmail;
			}

			if (e.UserEmailConfirmed == null)
			{
				if (e.IsPropertyUserEmailConfirmedRemoved)
				{
					this.UserEmailConfirmed = default(bool);
				}
			}
			else
			{
				this.UserEmailConfirmed = (e.UserEmailConfirmed != null && e.UserEmailConfirmed.HasValue) ? e.UserEmailConfirmed.Value : default(bool);
			}

			if (e.UserLockoutEnabled == null)
			{
				if (e.IsPropertyUserLockoutEnabledRemoved)
				{
					this.UserLockoutEnabled = default(bool);
				}
			}
			else
			{
				this.UserLockoutEnabled = (e.UserLockoutEnabled != null && e.UserLockoutEnabled.HasValue) ? e.UserLockoutEnabled.Value : default(bool);
			}

			if (e.UserLockoutEndDateUtc == null)
			{
				if (e.IsPropertyUserLockoutEndDateUtcRemoved)
				{
					this.UserLockoutEndDateUtc = default(DateTime?);
				}
			}
			else
			{
				this.UserLockoutEndDateUtc = e.UserLockoutEndDateUtc;
			}

			if (e.UserPasswordHash == null)
			{
				if (e.IsPropertyUserPasswordHashRemoved)
				{
					this.UserPasswordHash = default(string);
				}
			}
			else
			{
				this.UserPasswordHash = e.UserPasswordHash;
			}

			if (e.UserPhoneNumber == null)
			{
				if (e.IsPropertyUserPhoneNumberRemoved)
				{
					this.UserPhoneNumber = default(string);
				}
			}
			else
			{
				this.UserPhoneNumber = e.UserPhoneNumber;
			}

			if (e.UserPhoneNumberConfirmed == null)
			{
				if (e.IsPropertyUserPhoneNumberConfirmedRemoved)
				{
					this.UserPhoneNumberConfirmed = default(bool);
				}
			}
			else
			{
				this.UserPhoneNumberConfirmed = (e.UserPhoneNumberConfirmed != null && e.UserPhoneNumberConfirmed.HasValue) ? e.UserPhoneNumberConfirmed.Value : default(bool);
			}

			if (e.UserTwoFactorEnabled == null)
			{
				if (e.IsPropertyUserTwoFactorEnabledRemoved)
				{
					this.UserTwoFactorEnabled = default(bool);
				}
			}
			else
			{
				this.UserTwoFactorEnabled = (e.UserTwoFactorEnabled != null && e.UserTwoFactorEnabled.HasValue) ? e.UserTwoFactorEnabled.Value : default(bool);
			}

			if (e.UserSecurityStamp == null)
			{
				if (e.IsPropertyUserSecurityStampRemoved)
				{
					this.UserSecurityStamp = default(string);
				}
			}
			else
			{
				this.UserSecurityStamp = e.UserSecurityStamp;
			}

			if (e.UserCreatedBy == null)
			{
				if (e.IsPropertyUserCreatedByRemoved)
				{
					this.UserCreatedBy = default(string);
				}
			}
			else
			{
				this.UserCreatedBy = e.UserCreatedBy;
			}

			if (e.UserCreatedAt == null)
			{
				if (e.IsPropertyUserCreatedAtRemoved)
				{
					this.UserCreatedAt = default(DateTime);
				}
			}
			else
			{
				this.UserCreatedAt = (e.UserCreatedAt != null && e.UserCreatedAt.HasValue) ? e.UserCreatedAt.Value : default(DateTime);
			}

			if (e.UserUpdatedBy == null)
			{
				if (e.IsPropertyUserUpdatedByRemoved)
				{
					this.UserUpdatedBy = default(string);
				}
			}
			else
			{
				this.UserUpdatedBy = e.UserUpdatedBy;
			}

			if (e.UserUpdatedAt == null)
			{
				if (e.IsPropertyUserUpdatedAtRemoved)
				{
					this.UserUpdatedAt = default(DateTime);
				}
			}
			else
			{
				this.UserUpdatedAt = (e.UserUpdatedAt != null && e.UserUpdatedAt.HasValue) ? e.UserUpdatedAt.Value : default(DateTime);
			}

			if (e.UserActive == null)
			{
				if (e.IsPropertyUserActiveRemoved)
				{
					this.UserActive = default(bool);
				}
			}
			else
			{
				this.UserActive = (e.UserActive != null && e.UserActive.HasValue) ? e.UserActive.Value : default(bool);
			}

			if (e.UserDeleted == null)
			{
				if (e.IsPropertyUserDeletedRemoved)
				{
					this.UserDeleted = default(bool);
				}
			}
			else
			{
				this.UserDeleted = (e.UserDeleted != null && e.UserDeleted.HasValue) ? e.UserDeleted.Value : default(bool);
			}


			this.UpdatedBy = e.CreatedBy;
			this.UpdatedAt = e.CreatedAt;


		}

		public virtual void When(IUserClaimMvoStateDeleted e)
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

		protected void ThrowOnWrongEvent(IUserClaimMvoStateEvent stateEvent)
		{
			var stateEntityId = this.UserClaimId; // Aggregate Id
			var eventEntityId = stateEvent.StateEventId.UserClaimId; // EntityBase.Aggregate.GetStateEventIdPropertyIdName();
			if (stateEntityId != eventEntityId)
			{
				DomainError.Named("mutateWrongEntity", "Entity Id {0} in state but entity id {1} in event", stateEntityId, eventEntityId);
			}

			var stateVersion = this.UserVersion;
			var eventVersion = stateEvent.StateEventId.UserVersion;
			if (stateVersion != eventVersion)
			{
				throw DomainError.Named("concurrencyConflict", "Conflict between state version {0} and event version {1}", stateVersion, eventVersion);
			}

		}
	}

}

