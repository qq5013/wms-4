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

	public interface IInOutStateProperties
	{
		string DocumentNumber { get; set; }

		bool IsSOTransaction { get; set; }

		string DocumentStatus { get; set; }

		bool Posted { get; set; }

		bool Processing { get; set; }

		bool Processed { get; set; }

		int DocumentType { get; set; }

		string Description { get; set; }

		string OrderNumber { get; set; }

		DateTime? DateOrdered { get; set; }

		bool IsPrinted { get; set; }

		string MovementType { get; set; }

		DateTime? MovementDate { get; set; }

		string BusinessPartnerId { get; set; }

		string WarehouseId { get; set; }

		string POReference { get; set; }

		decimal FreightAmount { get; set; }

		string ShipperId { get; set; }

		decimal ChargeAmount { get; set; }

		DateTime? DatePrinted { get; set; }

		string SalesRepresentative { get; set; }

		int NumberOfPackages { get; set; }

		DateTime? PickDate { get; set; }

		DateTime? ShipDate { get; set; }

		string TrackingNumber { get; set; }

		DateTime? DateReceived { get; set; }

		bool IsInTransit { get; set; }

		bool IsApproved { get; set; }

		bool IsInDispute { get; set; }

		decimal Volume { get; set; }

		decimal Weight { get; set; }

		string RmaNumber { get; set; }

		string ReversalNumber { get; set; }

		bool IsDropShip { get; set; }

		string DropShipBusinessPartnerId { get; set; }

		long Version { get; set; }

		bool Active { get; set; }


	}

}
