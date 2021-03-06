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
	public interface IWarehouseState : IWarehouseStateProperties, 
		IGlobalIdentity<string>, 
		ICreated<string>, 
		IUpdated<string>, 
		IDeleted, 
		IActive, 
		IVersioned<long>
	{

		void When(IWarehouseStateCreated e);

		void When(IWarehouseStateMergePatched e);

		void When(IWarehouseStateDeleted e);

		void Mutate(IEvent e);


        bool IsUnsaved { get; }

	}
}

