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

	public abstract class UserRoleMvoStateProperties : IUserRoleMvoStateProperties
	{
		public virtual UserRoleId UserRoleId { get; set; }

		public virtual long Version { get; set; }

		public virtual bool Active { get; set; }

		public virtual int UserAccessFailedCount { get; set; }

		public virtual string UserEmail { get; set; }

		public virtual bool UserEmailConfirmed { get; set; }

		public virtual bool UserLockoutEnabled { get; set; }

		public virtual DateTime? UserLockoutEndDateUtc { get; set; }

		public virtual string UserPasswordHash { get; set; }

		public virtual string UserPhoneNumber { get; set; }

		public virtual bool UserPhoneNumberConfirmed { get; set; }

		public virtual bool UserTwoFactorEnabled { get; set; }

		public virtual string UserSecurityStamp { get; set; }

		public virtual long UserVersion { get; set; }

		public virtual string UserCreatedBy { get; set; }

		public virtual DateTime UserCreatedAt { get; set; }

		public virtual string UserUpdatedBy { get; set; }

		public virtual DateTime UserUpdatedAt { get; set; }

		public virtual bool UserActive { get; set; }

		public virtual bool UserDeleted { get; set; }


        protected virtual void InitializeProperties()
        { 
        }

	}
}
