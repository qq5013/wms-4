﻿// <autogenerated>
//   This file was generated by T4 code generator GenerateNHibernateTrees.tt.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

using System;
using System.Collections.Generic;
using Dddml.Wms.Specialization;
using Dddml.Wms.Domain;
using Dddml.Wms.Specialization.NHibernate;
using NHibernate;
using NHibernate.Criterion;
using Spring.Transaction.Interceptor;

namespace Dddml.Wms.Domain.NHibernate
{

    public partial class NHibernateOrganizationTreeRepository : IOrganizationTreeRepository
    {

        //private IOrganizationStateRepository _organizationStateRepository;

        //public IOrganizationStateRepository OrganizationStateRepository
        //{
        //    get { return this._organizationStateRepository; }
        //    set { this._organizationStateRepository = value; }
        //}

        //private IOrganizationStructureStateRepository _organizationStructureStateRepository;

        //public IOrganizationStructureStateRepository OrganizationStructureStateRepository
        //{
        //    get { return this._organizationStructureStateRepository; }
        //    set { this._organizationStructureStateRepository = value; }
        //}

        //[Transaction(ReadOnly = true)]
        //public virtual IEnumerable<IOrganizationTree> GetRoots(Dddml.Support.Criterion.ICriterion filter, int firstResult = 0, int maxResults = int.MaxValue)
        //{
        //    var states = OrganizationStateRepository.GetOrganizationTreeRoots(filter, firstResult, maxResults);
        //    return ToOrganizationTreeCollection(states);
        //}

        //[Transaction(ReadOnly = true)]
        //public virtual IEnumerable<IOrganizationTree> GetChildren(string parentId, Dddml.Support.Criterion.ICriterion filter, int firstResult = 0, int maxResults = int.MaxValue)
        //{
        //    var states = OrganizationStateRepository.GetOrganizationTreeChildren(parentId, filter, firstResult, maxResults);
        //    return ToOrganizationTreeCollection(states);
        //}

        //private IEnumerable<IOrganizationTree> ToOrganizationTreeCollection(IEnumerable<IOrganizationState> states)
        //{
        //    var trees = new List<OrganizationTree>();
        //    foreach (var r in states)
        //    {
        //        trees.Add(new OrganizationTree(r, this));
        //    }
        //    return trees;
        //}

    }

}

