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
	public interface IOrganizationStructureStateEvent : IEvent, IStateEventDto, IGlobalIdentity<OrganizationStructureStateEventId>, ICreated<string>
	{
		OrganizationStructureStateEventId StateEventId { get; }

        bool ReadOnly { get; set; }

		bool? Active { get; set; }

	}

	public interface IOrganizationStructureStateCreated : IOrganizationStructureStateEvent//, IOrganizationStructureStateProperties
	{
	
	}


	public interface IOrganizationStructureStateMergePatched : IOrganizationStructureStateEvent//, IOrganizationStructureStateProperties
	{
		bool IsPropertyActiveRemoved { get; set; }


	}

	public interface IOrganizationStructureStateDeleted : IOrganizationStructureStateEvent
	{
	}


}

