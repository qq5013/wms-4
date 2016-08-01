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

    public partial class RoleApplicationServiceProxy : IRoleApplicationService
    {

        private DddmlWmsRamlClient _ramlClient;

        public RoleApplicationServiceProxy(ProxyTemplate proxyTemplate)
            : this(proxyTemplate.GetEndpointUrl())
        {
            _ramlClient.GetAuthenticationHeaderValue = proxyTemplate.GetAuthenticationHeaderValue;
        }

        public RoleApplicationServiceProxy(string endpointUrl)
        {
            _ramlClient = new DddmlWmsRamlClient(endpointUrl);
        }

        public RoleApplicationServiceProxy(HttpClient httpClient)
        {
            _ramlClient = new DddmlWmsRamlClient(httpClient);
        }

        public async Task WhenAsync(CreateRoleDto c)
        {
            var idObj = (c as ICreateRole).RoleId;
            var uriParameters = new RoleUriParameters();
            uriParameters.Id = idObj;

            var req = new RolePutRequest(uriParameters, (CreateRoleDto)c);
                
            var resp = await _ramlClient.Role.Put(req);
            RoleProxyUtils.ThrowOnHttpResponseError(resp);
        }

        public void When(CreateRoleDto c)
        {
            WhenAsync(c).GetAwaiter().GetResult();
        }

        public async Task WhenAsync(MergePatchRoleDto c)
        {
            var idObj = (c as IMergePatchRole).RoleId;
            var uriParameters = new RoleUriParameters();
            uriParameters.Id = idObj;

            var req = new RolePatchRequest(uriParameters, (MergePatchRoleDto)c);
            var resp = await _ramlClient.Role.Patch(req);
            RoleProxyUtils.ThrowOnHttpResponseError(resp);
        }

        public void When(MergePatchRoleDto c)
        {
            WhenAsync(c).GetAwaiter().GetResult();
        }

        public async Task WhenAsync(DeleteRoleDto c)
        {
            var idObj = (c as IDeleteRole).RoleId;
            var uriParameters = new RoleUriParameters();
            uriParameters.Id = idObj;

            var q = new RoleDeleteQuery();
            q.CommandId = c.CommandId;
            q.RequesterId = c.RequesterId;
            q.Version = Convert.ToString(c.Version);
                
            var req = new RoleDeleteRequest(uriParameters);
            req.Query = q;

            var resp = await _ramlClient.Role.Delete(req);
            RoleProxyUtils.ThrowOnHttpResponseError(resp);
        }

        public void When(DeleteRoleDto c)
        {
            WhenAsync(c).GetAwaiter().GetResult();
        }
		
        void IRoleApplicationService.When(ICreateRole c)
        {
            this.When((CreateRoleDto)c);
        }

        void IRoleApplicationService.When(IMergePatchRole c)
        {
            this.When((MergePatchRoleDto)c);
        }

        void IRoleApplicationService.When(IDeleteRole c)
        {
            this.When((DeleteRoleDto)c);
        }

        public async Task<IRoleState> GetAsync(string roleId)
        {
            IRoleState state = null;
            var idObj = roleId;
            var uriParameters = new RoleUriParameters();
            uriParameters.Id = idObj;

            var req = new RoleGetRequest(uriParameters);

            var resp = await _ramlClient.Role.Get(req);
            RoleProxyUtils.ThrowOnHttpResponseError(resp);
            state = resp.Content;
            return state;
        }

        public IRoleState Get(string roleId)
        {
            return GetAsync(roleId).GetAwaiter().GetResult();
        }


        public IEnumerable<IRoleState> GetAll(int firstResult, int maxResults)
        {
            return Get((IDictionary<string, object>)null, null, firstResult, maxResults);
        }

        public IEnumerable<IRoleState> Get(IEnumerable<KeyValuePair<string, object>> filter, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue)
        {
            return Get(filter, orders, firstResult, maxResults, null);
        }

        public async Task<IEnumerable<IRoleState>> GetAsync(IEnumerable<KeyValuePair<string, object>> filter, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue, IList<string> fields = null)
        {
            IEnumerable<IRoleState> states = null;
			var q = new RolesGetQuery();
			q.FirstResult = firstResult;
			q.MaxResults = maxResults;
            q.Sort = RoleProxyUtils.GetOrdersQueryValueString(orders);
            q.Fields = RoleProxyUtils.GetReturnedFieldsQueryValueString(fields, QueryFieldValueSeparator);
            q.FilterTag = RoleProxyUtils.GetFilterTagQueryValueString(filter);
            var req = new RolesGetRequest();
            req.Query = q;
            var resp = await _ramlClient.Roles.Get(req);
            RoleProxyUtils.ThrowOnHttpResponseError(resp);
            states = resp.Content;
            return states;
        }

        public IEnumerable<IRoleState> Get(IEnumerable<KeyValuePair<string, object>> filter, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue, IList<string> fields = null)
        {
            return GetAsync(filter, orders, firstResult, maxResults, fields).GetAwaiter().GetResult();
        }

        public IEnumerable<IRoleState> GetByProperty(string propertyName, object propertyValue, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue)
        {
            return GetByProperty(propertyName, propertyValue, orders, firstResult, maxResults, null);
        }

        public IEnumerable<IRoleState> GetByProperty(string propertyName, object propertyValue, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue, IList<string> fields = null)
        {
            var filter = Restrictions.Eq(propertyName, propertyValue);
            return Get(filter, orders, firstResult, maxResults, fields);
        }

        public virtual void Execute(object command)
        {
            ((dynamic)this).When((dynamic)command);
        }

        public IEnumerable<IRoleState> Get(ICriterion filter, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue)
        {
            return Get(filter, orders, firstResult, maxResults, null);
        }

        public async Task<IEnumerable<IRoleState>> GetAsync(ICriterion filter, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue, IList<string> fields = null)
        {
            IEnumerable<IRoleState> states = null;
			var q = new RolesGetQuery();
			q.FirstResult = firstResult;
			q.MaxResults = maxResults;
            q.Sort = RoleProxyUtils.GetOrdersQueryValueString(orders);
            q.Fields = RoleProxyUtils.GetReturnedFieldsQueryValueString(fields, QueryFieldValueSeparator);
            q.Filter = RoleProxyUtils.GetFilterQueryValueString(filter);
            var req = new RolesGetRequest();
            req.Query = q;
            var resp = await _ramlClient.Roles.Get(req);
            RoleProxyUtils.ThrowOnHttpResponseError(resp);
            states = resp.Content;
            return states;
        }

        public IEnumerable<IRoleState> Get(ICriterion filter, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue, IList<string> fields = null)
        {
            return GetAsync(filter, orders, firstResult, maxResults, fields).GetAwaiter().GetResult();
        }

        public async virtual Task<long> GetCountAsync(IEnumerable<KeyValuePair<string, object>> filter)
		{
			var q = new RolesCountGetQuery();
            q.FilterTag = RoleProxyUtils.GetFilterTagQueryValueString(filter);
            var req = new RolesCountGetRequest();
            req.Query = q;
            var resp = await _ramlClient.RolesCount.Get(req);
            RoleProxyUtils.ThrowOnHttpResponseError(resp);
            return long.Parse(await resp.RawContent.ReadAsStringAsync());
		}

        public virtual long GetCount(IEnumerable<KeyValuePair<string, object>> filter)
		{
		    return GetCountAsync(filter).GetAwaiter().GetResult();
		}

        public async virtual Task<long> GetCountAsync(ICriterion filter)
		{
			var q = new RolesCountGetQuery();
            q.Filter = RoleProxyUtils.GetFilterQueryValueString(filter);
            var req = new RolesCountGetRequest();
            req.Query = q;
            var resp = await _ramlClient.RolesCount.Get(req);
            RoleProxyUtils.ThrowOnHttpResponseError(resp);
            return long.Parse(await resp.RawContent.ReadAsStringAsync());
		}

        public virtual long GetCount(ICriterion filter)
		{
		    return GetCountAsync(filter).GetAwaiter().GetResult();
		}

        public async Task<IRoleStateEvent> GetStateEventAsync(string roleId, long version)
        {
            var idObj = roleId;
            var uriParameters = new RoleStateEventUriParameters();
            uriParameters.Id = idObj;
            uriParameters.Version = version.ToString();

            var req = new RoleStateEventGetRequest(uriParameters);
            var resp = await _ramlClient.RoleStateEvent.Get(req);
            RoleProxyUtils.ThrowOnHttpResponseError(resp);
            return resp.Content;
        }

        public IRoleStateEvent GetStateEvent(string roleId, long version)
        {
            return GetStateEventAsync(roleId, version).GetAwaiter().GetResult();
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


    public partial class RoleApplicationServiceProxyFactory : ProxyFactoryBase, IRoleApplicationServiceFactory
    {

        public RoleApplicationServiceProxyFactory() : base()
        {}

        public RoleApplicationServiceProxyFactory(string endpointUrl) : base(endpointUrl)
        {}

        public IRoleApplicationService RoleApplicationService
        {
            get
            {
                return new RoleApplicationServiceProxy(ProxyTemplate);
            }
        }
		
        public ICreateRole NewCreateRole()
        {
            return new CreateRoleDto();
        }

        public IMergePatchRole NewMergePatchRole()
        {
            return new MergePatchRoleDto();
        }

        public IDeleteRole NewDeleteRole()
        {
            return new DeleteRoleDto();
        }
    }

    public static class RoleProxyUtils
    {

        private class ProxyTypeConverter : Dddml.Support.Criterion.ITypeConverter
        {
            public T ConvertFromString<T>(string text)
            {
                throw new NotSupportedException();
            }

            public object ConvertFromString(Type type, string text)
            {
                throw new NotSupportedException();
            }

            public string ConvertToString<T>(T value)
            {
                return ApplicationContext.Current.TypeConverter.ConvertToString(typeof(T), value);
            }

            public string ConvertToString(object value)
            {
                return ApplicationContext.Current.TypeConverter.ConvertToString(value.GetType(), value);
            }

            public string[] ConvertToStringArray(object[] values)
            {
                var list = new List<string>();
                foreach (var o in values)
                {
                    list.Add(ConvertToString(o));
                }
                return list.ToArray();
            }
        }


        public static string GetFilterQueryValueString(ICriterion filter)
        {
            if (filter == null) { return null; }
            return WebUtility.UrlEncode(JObject.FromObject(new CriterionDto(filter, new ProxyTypeConverter())).ToString());
        }

        public static string GetFilterTagQueryValueString(IEnumerable<KeyValuePair<string, object>> filter)
        {
            if (filter == null) { return null; }
            StringBuilder sb = new StringBuilder();
            sb.Append(DateTime.Now.Ticks);
            foreach (var p in filter)
            {
                var k = p.Key;
                var v = p.Value;
                sb.Append("&");
                sb.Append(k);
                sb.Append("=");
                if (v != null)
                {
                    string valStr = ApplicationContext.Current.TypeConverter.ConvertToString(v.GetType(), v);
                    sb.Append(WebUtility.UrlEncode(valStr));
                }

            }
            return sb.ToString();
        }

        public static string GetReturnedFieldsQueryValueString(IList<string> fields, string separator)
        {
            if (fields == null) { return null; }
            StringBuilder sb = new StringBuilder();
            foreach (var f in fields)
            {
                sb.Append(WebUtility.UrlEncode(f));
                sb.Append(separator);
            }
            return sb.ToString();
        }

        public static string GetOrdersQueryValueString(IList<string> orders)
        {
            if (orders == null) { return null; }
            StringBuilder sb = new StringBuilder();
            foreach (var ord in orders)
            {
                sb.Append(WebUtility.UrlEncode(ord));
                sb.Append(",");
            }
            return sb.ToString();
        }

        public static void ThrowOnHttpResponseError(ApiResponse resp)
        {
            var httpResponseMessage = new HttpResponseMessage()
            {
                StatusCode = resp.StatusCode,
                Content = resp.RawContent,
                ReasonPhrase = resp.ReasonPhrase
            };
            if (httpResponseMessage.IsSuccessStatusCode)
            {
                return;
            }
            try
            {
                if (resp.StatusCode == HttpStatusCode.InternalServerError)
                {
                    IEnumerable<string> headerValues = new List<string>();
                    if (resp.RawContent != null && resp.RawContent.Headers != null)
                        resp.RawContent.Headers.TryGetValues("Content-Type", out headerValues);
                    if (headerValues.Any(hv => hv.ToLowerInvariant().Contains("json")))
                    {
                        JObject jObj = JObject.Parse(httpResponseMessage.Content.ReadAsStringAsync().GetAwaiter().GetResult());
                        var errorName = jObj.GetValue("ErrorName").ToObject<string>();
                        var errorMessage = jObj.GetValue("ErrorMessage").ToObject<string>();
                        throw DomainError.Named(errorName, errorMessage);
                    }
                }
                throw new HttpResponseException(httpResponseMessage);
            }
            catch
            {
                throw new HttpResponseException(httpResponseMessage);
            }
        }

        public static IEnumerable<string> ToIdCollection(IEnumerable<IRoleState> states)
        {
            var ids = new List<string>();
            foreach (var s in states)
            {
                ids.Add(s.RoleId);
            }
            return ids;
        }

    }

}

