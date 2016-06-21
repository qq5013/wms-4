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
	public interface IUserClaimCommand : ICommand, ICommandDto
	{

	}


	public interface ICreateOrMergePatchOrRemoveUserClaim : IUserClaimCommand
	{
		int ClaimId { get; set; }

		string ClaimType { get; set; }

		string ClaimValue { get; set; }

		bool? Active { get; set; }

		// Outer Id:

		string UserId { get; set; }


	}

	public interface ICreateUserClaim : ICreateOrMergePatchOrRemoveUserClaim
	{
	}

	public interface IMergePatchUserClaim : ICreateOrMergePatchOrRemoveUserClaim
	{

		bool IsPropertyClaimTypeRemoved { get; set; }

		bool IsPropertyClaimValueRemoved { get; set; }

		bool IsPropertyActiveRemoved { get; set; }


	}

	public interface IRemoveUserClaim : ICreateOrMergePatchOrRemoveUserClaim
	{
	}


}
