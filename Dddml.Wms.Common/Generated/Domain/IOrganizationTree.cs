﻿// <autogenerated>
//   This file was generated by T4 code generator GenerateBoundedContextDomain.tt.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

using System;
using System.Collections.Generic;
using Dddml.Wms.Specialization;
using Dddml.Wms.Domain;

namespace Dddml.Wms.Domain
{
    public partial interface IOrganizationTree : ITree<IOrganizationState>
    {
        new IEnumerable<IOrganizationTree> Children { get; }
    }

    public partial interface IOrganizationTreeRepository : ITreeRepository<IOrganizationTree, string>
    {
    }

}

