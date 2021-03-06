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

    public partial class OrganizationTree : IOrganizationTree
    {
        private IOrganizationState _state;

        private IOrganizationTreeRepository _repository;

        public OrganizationTree(IOrganizationState state, IOrganizationTreeRepository repository)
        {
            this._state = state;
            this._repository = repository;
        }

        public IEnumerable<IOrganizationTree> Children
        {
            get
            {
                return _repository.GetChildren(this._state.OrganizationId, (IEnumerable<KeyValuePair<string, object>>)null, null);
            }
        }

        IEnumerable<ITree<IOrganizationState>> ITree<IOrganizationState>.Children
        {
            get { return this.Children; }
        }

        public IOrganizationState Content
        {
            get { return _state; }
        }

    }

}

