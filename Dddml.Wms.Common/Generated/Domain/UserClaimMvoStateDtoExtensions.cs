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

	public static partial class UserClaimMvoStateDtoExtensions
	{

        public static IUserClaimMvoCommand ToCreateOrMergePatchUserClaimMvo(this UserClaimMvoStateDto state)
        {
            return state.ToCreateOrMergePatchUserClaimMvo<CreateUserClaimMvoDto, MergePatchUserClaimMvoDto>();
        }

        public static DeleteUserClaimMvoDto ToDeleteUserClaimMvo(this UserClaimMvoStateDto state)
        {
            return state.ToDeleteUserClaimMvo<DeleteUserClaimMvoDto>();
        }

        public static MergePatchUserClaimMvoDto ToMergePatchUserClaimMvo(this UserClaimMvoStateDto state)
        {
            return state.ToMergePatchUserClaimMvo<MergePatchUserClaimMvoDto>();
        }

        public static CreateUserClaimMvoDto ToCreateUserClaimMvo(this UserClaimMvoStateDto state)
        {
            return state.ToCreateUserClaimMvo<CreateUserClaimMvoDto>();
        }
		

	}

}

