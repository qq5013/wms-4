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

    public partial class LocatorTree : ILocatorTree
    {
        private ILocatorState _state;

        private ILocatorTreeRepository _repository;

        public LocatorTree(ILocatorState state, ILocatorTreeRepository repository)
        {
            this._state = state;
            this._repository = repository;
        }

        public IEnumerable<ILocatorTree> Children
        {
            get
            {
                return _repository.GetChildren(this._state.LocatorId, (IEnumerable<KeyValuePair<string, object>>)null, null);
            }
        }

        IEnumerable<ITree<ILocatorState>> ITree<ILocatorState>.Children
        {
            get { return this.Children; }
        }

        public ILocatorState Content
        {
            get { return _state; }
        }

    }

}

