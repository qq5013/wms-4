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

	public abstract class UserPermissionStateProperties : IUserPermissionStateProperties
	{
		public virtual string PermissionId { get; set; }

		public virtual long Version { get; set; }

		public virtual bool Active { get; set; }

		// Outer Id:

		public virtual string UserId { get; set; }


        protected virtual void InitializeProperties()
        { 
        }

	}
}
