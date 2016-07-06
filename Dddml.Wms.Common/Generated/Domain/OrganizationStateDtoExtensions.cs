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

	public static partial class OrganizationStateExtensions
	{

        public static IOrganizationCommand ToCreateOrMergePatchOrganization(this OrganizationStateDto state)
        {
            return state.ToCreateOrMergePatchOrganization<CreateOrganizationDto, MergePatchOrganizationDto>();
        }

        public static DeleteOrganizationDto ToDeleteOrganization(this OrganizationStateDto state)
        {
            return state.ToDeleteOrganization<DeleteOrganizationDto>();
        }

        public static MergePatchOrganizationDto ToMergePatchOrganization(this OrganizationStateDto state)
        {
            return state.ToMergePatchOrganization<MergePatchOrganizationDto>();
        }

        public static CreateOrganizationDto ToCreateOrganization(this OrganizationStateDto state)
        {
            return state.ToCreateOrganization<CreateOrganizationDto>();
        }
		

	}

}

