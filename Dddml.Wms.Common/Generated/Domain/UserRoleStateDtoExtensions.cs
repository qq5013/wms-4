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

	public static partial class UserRoleStateExtensions
	{

        public static IUserRoleCommand ToCreateOrMergePatchUserRole(this UserRoleStateDto state)
        {
            return state.ToCreateOrMergePatchUserRole<CreateUserRoleDto, MergePatchUserRoleDto>();
        }

        public static RemoveUserRoleDto ToRemoveUserRole(this UserRoleStateDto state)
        {
            return state.ToRemoveUserRole<RemoveUserRoleDto>();
        }

        public static MergePatchUserRoleDto ToMergePatchUserRole(this UserRoleStateDto state)
        {
            return state.ToMergePatchUserRole<MergePatchUserRoleDto>();
        }

        public static CreateUserRoleDto ToCreateUserRole(this UserRoleStateDto state)
        {
            return state.ToCreateUserRole<CreateUserRoleDto>();
        }
		

	}

}

