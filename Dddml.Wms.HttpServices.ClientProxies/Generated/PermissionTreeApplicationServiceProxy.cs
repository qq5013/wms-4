﻿// <autogenerated>
//   This file was generated by T4 code generator GenerateRamlClientProxies.tt.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

using System;
using System.Collections.Generic;
using Dddml.Wms.Specialization;
using Dddml.Wms.Domain;
using System.Linq;
using System.Net;
using System.Threading.Tasks;
using System.Net.Http;
using System.Web.Http;
using Dddml.Wms.HttpServices.ClientProxies.Raml;
using Dddml.Wms.HttpServices.ClientProxies.Raml.Models;
using System.Text;
using System.ComponentModel;
using RAML.Api.Core;
using Newtonsoft.Json.Linq;
using Dddml.Support.Criterion;
using Dddml.Wms.Specialization.HttpServices.ClientProxies;


namespace Dddml.Wms.HttpServices.ClientProxies
{

    public partial class PermissionTreeApplicationServiceProxy : IPermissionTreeApplicationService
    {

        private DddmlWmsRamlClient _ramlClient;

        public PermissionTreeApplicationServiceProxy(ProxyTemplate proxyTemplate)
            : this(proxyTemplate.GetEndpointUrl())
        {
            _ramlClient.GetAuthenticationHeaderValue = proxyTemplate.GetAuthenticationHeaderValue;
        }

        public PermissionTreeApplicationServiceProxy(string endpointUrl)
        {
            _ramlClient = new DddmlWmsRamlClient(endpointUrl);
        }

        public PermissionTreeApplicationServiceProxy(HttpClient httpClient)
        {
            _ramlClient = new DddmlWmsRamlClient(httpClient);
        }

        public IEnumerable<IPermissionState> GetRoots(ICriterion filter, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue)
        {
            return GetRoots(filter, orders, firstResult, maxResults, null);
        }

        public async Task<IEnumerable<IPermissionState>> GetRootsAsync(ICriterion filter, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue, IList<string> fields = null)
        {
            IEnumerable<IPermissionState> states = null;
			var q = new PermissionTreesGetQuery();
			q.FirstResult = firstResult;
			q.MaxResults = maxResults;
            q.Sort = PermissionProxyUtils.GetOrdersQueryValueString(orders);
            q.Fields = PermissionProxyUtils.GetReturnedFieldsQueryValueString(fields, QueryFieldValueSeparator);
            q.Filter = PermissionProxyUtils.GetFilterQueryValueString(filter);
            var req = new PermissionTreesGetRequest();
            req.Query = q;
            var resp = await _ramlClient.PermissionTrees.Get(req);
            PermissionProxyUtils.ThrowOnHttpResponseError(resp);
            states = resp.Content;
            return states;
        }

        public IEnumerable<IPermissionState> GetRoots(ICriterion filter, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue, IList<string> fields = null)
        {
            return GetRootsAsync(filter, orders, firstResult, maxResults, fields).GetAwaiter().GetResult();
        }

        public IEnumerable<IPermissionState> GetChildren(string parentId, ICriterion filter, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue)
        {
            return GetChildren(parentId, filter, orders, firstResult, maxResults, null);
        }

        public async Task<IEnumerable<IPermissionState>> GetChildrenAsync(string parentId, ICriterion filter, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue, IList<string> fields = null)
        {
            IEnumerable<IPermissionState> states = null;
			var q = new PermissionTreesGetQuery();
            var parentIdObj = (parentId);
			q.ParentId = parentIdObj;
			q.FirstResult = firstResult;
			q.MaxResults = maxResults;
            q.Sort = PermissionProxyUtils.GetOrdersQueryValueString(orders);
            q.Fields = PermissionProxyUtils.GetReturnedFieldsQueryValueString(fields, QueryFieldValueSeparator);
            q.Filter = PermissionProxyUtils.GetFilterQueryValueString(filter);
            var req = new PermissionTreesGetRequest();
            req.Query = q;
            var resp = await _ramlClient.PermissionTrees.Get(req);
            PermissionProxyUtils.ThrowOnHttpResponseError(resp);
            states = resp.Content;
            return states;
        }

        public IEnumerable<IPermissionState> GetChildren(string parentId, ICriterion filter, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue, IList<string> fields = null)
        {
            return GetChildrenAsync(parentId, filter, orders, firstResult, maxResults, fields).GetAwaiter().GetResult();
        }

        public IEnumerable<IPermissionState> GetRoots(IEnumerable<KeyValuePair<string, object>> filter, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue)
        {
            return GetRoots(filter, orders, firstResult, maxResults, null);
        }

        public async Task<IEnumerable<IPermissionState>> GetRootsAsync(IEnumerable<KeyValuePair<string, object>> filter, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue, IList<string> fields = null)
        {
            IEnumerable<IPermissionState> states = null;
			var q = new PermissionTreesGetQuery();
			q.FirstResult = firstResult;
			q.MaxResults = maxResults;
            q.Sort = PermissionProxyUtils.GetOrdersQueryValueString(orders);
            q.Fields = PermissionProxyUtils.GetReturnedFieldsQueryValueString(fields, QueryFieldValueSeparator);
            q.FilterTag = PermissionProxyUtils.GetFilterTagQueryValueString(filter);
            var req = new PermissionTreesGetRequest();
            req.Query = q;
            var resp = await _ramlClient.PermissionTrees.Get(req);
            PermissionProxyUtils.ThrowOnHttpResponseError(resp);
            states = resp.Content;
            return states;
        }

        public IEnumerable<IPermissionState> GetRoots(IEnumerable<KeyValuePair<string, object>> filter, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue, IList<string> fields = null)
        {
            return GetRootsAsync(filter, orders, firstResult, maxResults, fields).GetAwaiter().GetResult();
        }

        public IEnumerable<IPermissionState> GetChildren(string parentId, IEnumerable<KeyValuePair<string, object>> filter, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue)
        {
            return GetChildren(parentId, filter, orders, firstResult, maxResults, null);
        }

        public async Task<IEnumerable<IPermissionState>> GetChildrenAsync(string parentId, IEnumerable<KeyValuePair<string, object>> filter, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue, IList<string> fields = null)
        {
            IEnumerable<IPermissionState> states = null;
			var q = new PermissionTreesGetQuery();
            var parentIdObj = (parentId);
			q.ParentId = parentIdObj;
			q.FirstResult = firstResult;
			q.MaxResults = maxResults;
            q.Sort = PermissionProxyUtils.GetOrdersQueryValueString(orders);
            q.Fields = PermissionProxyUtils.GetReturnedFieldsQueryValueString(fields, QueryFieldValueSeparator);
            q.FilterTag = PermissionProxyUtils.GetFilterTagQueryValueString(filter);
            var req = new PermissionTreesGetRequest();
            req.Query = q;
            var resp = await _ramlClient.PermissionTrees.Get(req);
            PermissionProxyUtils.ThrowOnHttpResponseError(resp);
            states = resp.Content;
            return states;
        }

        public IEnumerable<IPermissionState> GetChildren(string parentId, IEnumerable<KeyValuePair<string, object>> filter, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue, IList<string> fields = null)
        {
            return GetChildrenAsync(parentId, filter, orders, firstResult, maxResults, fields).GetAwaiter().GetResult();
        }

        public IEnumerable<string> GetRootIds(ICriterion filter, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue)
        {
            return GetRootIds(filter, orders, firstResult, maxResults, null);
        }

        public async Task<IEnumerable<string>> GetRootIdsAsync(ICriterion filter, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue, IList<string> fields = null)
        {
            IEnumerable<IPermissionState> states = null;
			var q = new PermissionTreesGetQuery();
			q.FirstResult = firstResult;
			q.MaxResults = maxResults;
            q.Sort = PermissionProxyUtils.GetOrdersQueryValueString(orders);
            q.Fields = PermissionProxyUtils.GetReturnedFieldsQueryValueString(fields, QueryFieldValueSeparator);
            q.Filter = PermissionProxyUtils.GetFilterQueryValueString(filter);
            var req = new PermissionTreesGetRequest();
            req.Query = q;
            var resp = await _ramlClient.PermissionTrees.Get(req);
            PermissionProxyUtils.ThrowOnHttpResponseError(resp);
            states = resp.Content;
            return PermissionProxyUtils.ToIdCollection(states);
        }

        public IEnumerable<string> GetRootIds(ICriterion filter, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue, IList<string> fields = null)
        {
            return GetRootIdsAsync(filter, orders, firstResult, maxResults, fields).GetAwaiter().GetResult();
        }

        public IEnumerable<string> GetChildIds(string parentId, ICriterion filter, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue)
        {
            return GetChildIds(parentId, filter, orders, firstResult, maxResults, null);
        }

        public async Task<IEnumerable<string>> GetChildIdsAsync(string parentId, ICriterion filter, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue, IList<string> fields = null)
        {
            IEnumerable<IPermissionState> states = null;
			var q = new PermissionTreesGetQuery();
            var parentIdObj = (parentId);
			q.ParentId = parentIdObj;
			q.FirstResult = firstResult;
			q.MaxResults = maxResults;
            q.Sort = PermissionProxyUtils.GetOrdersQueryValueString(orders);
            q.Fields = PermissionProxyUtils.GetReturnedFieldsQueryValueString(fields, QueryFieldValueSeparator);
            q.Filter = PermissionProxyUtils.GetFilterQueryValueString(filter);
            var req = new PermissionTreesGetRequest();
            req.Query = q;
            var resp = await _ramlClient.PermissionTrees.Get(req);
            PermissionProxyUtils.ThrowOnHttpResponseError(resp);
            states = resp.Content;
            return PermissionProxyUtils.ToIdCollection(states);
        }

        public IEnumerable<string> GetChildIds(string parentId, ICriterion filter, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue, IList<string> fields = null)
        {
            return GetChildIdsAsync(parentId, filter, orders, firstResult, maxResults, fields).GetAwaiter().GetResult();
        }

        public IEnumerable<string> GetRootIds(IEnumerable<KeyValuePair<string, object>> filter, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue)
        {
            return GetRootIds(filter, orders, firstResult, maxResults, null);
        }

        public async Task<IEnumerable<string>> GetRootIdsAsync(IEnumerable<KeyValuePair<string, object>> filter, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue, IList<string> fields = null)
        {
            IEnumerable<IPermissionState> states = null;
			var q = new PermissionTreesGetQuery();
			q.FirstResult = firstResult;
			q.MaxResults = maxResults;
            q.Sort = PermissionProxyUtils.GetOrdersQueryValueString(orders);
            q.Fields = PermissionProxyUtils.GetReturnedFieldsQueryValueString(fields, QueryFieldValueSeparator);
            q.FilterTag = PermissionProxyUtils.GetFilterTagQueryValueString(filter);
            var req = new PermissionTreesGetRequest();
            req.Query = q;
            var resp = await _ramlClient.PermissionTrees.Get(req);
            PermissionProxyUtils.ThrowOnHttpResponseError(resp);
            states = resp.Content;
            return PermissionProxyUtils.ToIdCollection(states);
        }

        public IEnumerable<string> GetRootIds(IEnumerable<KeyValuePair<string, object>> filter, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue, IList<string> fields = null)
        {
            return GetRootIdsAsync(filter, orders, firstResult, maxResults, fields).GetAwaiter().GetResult();
        }

        public IEnumerable<string> GetChildIds(string parentId, IEnumerable<KeyValuePair<string, object>> filter, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue)
        {
            return GetChildIds(parentId, filter, orders, firstResult, maxResults, null);
        }

        public async Task<IEnumerable<string>> GetChildIdsAsync(string parentId, IEnumerable<KeyValuePair<string, object>> filter, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue, IList<string> fields = null)
        {
            IEnumerable<IPermissionState> states = null;
			var q = new PermissionTreesGetQuery();
            var parentIdObj = (parentId);
			q.ParentId = parentIdObj;
			q.FirstResult = firstResult;
			q.MaxResults = maxResults;
            q.Sort = PermissionProxyUtils.GetOrdersQueryValueString(orders);
            q.Fields = PermissionProxyUtils.GetReturnedFieldsQueryValueString(fields, QueryFieldValueSeparator);
            q.FilterTag = PermissionProxyUtils.GetFilterTagQueryValueString(filter);
            var req = new PermissionTreesGetRequest();
            req.Query = q;
            var resp = await _ramlClient.PermissionTrees.Get(req);
            PermissionProxyUtils.ThrowOnHttpResponseError(resp);
            states = resp.Content;
            return PermissionProxyUtils.ToIdCollection(states);
        }

        public IEnumerable<string> GetChildIds(string parentId, IEnumerable<KeyValuePair<string, object>> filter, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue, IList<string> fields = null)
        {
            return GetChildIdsAsync(parentId, filter, orders, firstResult, maxResults, fields).GetAwaiter().GetResult();
        }


        protected virtual string QueryFieldValueSeparator
        {
            get { return ","; }
        }

        protected virtual string QueryOrderSeparator
        {
            get { return ","; }
        }

    }

    public partial class PermissionTreeApplicationServiceProxyFactory : ProxyFactoryBase, IPermissionTreeApplicationServiceFactory
    {

        public PermissionTreeApplicationServiceProxyFactory() : base()
        {}

        public PermissionTreeApplicationServiceProxyFactory(string endpointUrl) : base(endpointUrl)
        {}

        public IPermissionTreeApplicationService PermissionTreeApplicationService
        {
            get
            {
                return new PermissionTreeApplicationServiceProxy(ProxyTemplate);
            }
        }
    }

}

