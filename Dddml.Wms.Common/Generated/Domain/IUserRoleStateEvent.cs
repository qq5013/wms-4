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
	public interface IUserRoleStateEvent : IEvent, IStateEventDto, IGlobalIdentity<UserRoleStateEventId>, ICreated<string>
	{
		UserRoleStateEventId StateEventId { get; }

        bool ReadOnly { get; set; }

		long Version { get; set; }

		bool? Active { get; set; }

		// Outer Id:
		//string UserId { get; set; }


	}

	public interface IUserRoleStateCreated : IUserRoleStateEvent//, IUserRoleStateProperties
	{
	
	}


	public interface IUserRoleStateMergePatched : IUserRoleStateEvent//, IUserRoleStateProperties
	{
		bool IsPropertyActiveRemoved { get; set; }


	}

	public interface IUserRoleStateRemoved : IUserRoleStateEvent
	{
	}


}

