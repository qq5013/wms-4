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

    public partial class AttributeUseMvoApplicationServiceProxy : IAttributeUseMvoApplicationService
    {

        private DddmlWmsRamlClient _ramlClient;

        public AttributeUseMvoApplicationServiceProxy(ProxyTemplate proxyTemplate)
            : this(proxyTemplate.GetEndpointUrl())
        {
            _ramlClient.GetAuthenticationHeaderValue = proxyTemplate.GetAuthenticationHeaderValue;
        }

        public AttributeUseMvoApplicationServiceProxy(string endpointUrl)
        {
            _ramlClient = new DddmlWmsRamlClient(endpointUrl);
        }

        public AttributeUseMvoApplicationServiceProxy(HttpClient httpClient)
        {
            _ramlClient = new DddmlWmsRamlClient(httpClient);
        }

        public async Task WhenAsync(CreateAttributeUseMvoDto c)
        {
            var idObj = AttributeUseMvoProxyUtils.ToIdString((c as ICreateAttributeUseMvo).AttributeSetAttributeUseId);
            var uriParameters = new AttributeUseMvoUriParameters();
            uriParameters.Id = idObj;

            var req = new AttributeUseMvoPutRequest(uriParameters, (CreateAttributeUseMvoDto)c);
                
            var resp = await _ramlClient.AttributeUseMvo.Put(req);
            AttributeUseMvoProxyUtils.ThrowOnHttpResponseError(resp);
        }

        public void When(CreateAttributeUseMvoDto c)
        {
            WhenAsync(c).GetAwaiter().GetResult();
        }

        public async Task WhenAsync(MergePatchAttributeUseMvoDto c)
        {
            var idObj = AttributeUseMvoProxyUtils.ToIdString((c as IMergePatchAttributeUseMvo).AttributeSetAttributeUseId);
            var uriParameters = new AttributeUseMvoUriParameters();
            uriParameters.Id = idObj;

            var req = new AttributeUseMvoPatchRequest(uriParameters, (MergePatchAttributeUseMvoDto)c);
            var resp = await _ramlClient.AttributeUseMvo.Patch(req);
            AttributeUseMvoProxyUtils.ThrowOnHttpResponseError(resp);
        }

        public void When(MergePatchAttributeUseMvoDto c)
        {
            WhenAsync(c).GetAwaiter().GetResult();
        }

        public async Task WhenAsync(DeleteAttributeUseMvoDto c)
        {
            var idObj = AttributeUseMvoProxyUtils.ToIdString((c as IDeleteAttributeUseMvo).AttributeSetAttributeUseId);
            var uriParameters = new AttributeUseMvoUriParameters();
            uriParameters.Id = idObj;

            var q = new AttributeUseMvoDeleteQuery();
            q.CommandId = c.CommandId;
            q.RequesterId = c.RequesterId;
            q.Version = Convert.ToString(c.Version);
                
            var req = new AttributeUseMvoDeleteRequest(uriParameters);
            req.Query = q;

            var resp = await _ramlClient.AttributeUseMvo.Delete(req);
            AttributeUseMvoProxyUtils.ThrowOnHttpResponseError(resp);
        }

        public void When(DeleteAttributeUseMvoDto c)
        {
            WhenAsync(c).GetAwaiter().GetResult();
        }
		
        void IAttributeUseMvoApplicationService.When(ICreateAttributeUseMvo c)
        {
            this.When((CreateAttributeUseMvoDto)c);
        }

        void IAttributeUseMvoApplicationService.When(IMergePatchAttributeUseMvo c)
        {
            this.When((MergePatchAttributeUseMvoDto)c);
        }

        void IAttributeUseMvoApplicationService.When(IDeleteAttributeUseMvo c)
        {
            this.When((DeleteAttributeUseMvoDto)c);
        }

        public async Task<IAttributeUseMvoState> GetAsync(AttributeSetAttributeUseId attributeSetAttributeUseId)
        {
            IAttributeUseMvoState state = null;
            var idObj = AttributeUseMvoProxyUtils.ToIdString(attributeSetAttributeUseId);
            var uriParameters = new AttributeUseMvoUriParameters();
            uriParameters.Id = idObj;

            var req = new AttributeUseMvoGetRequest(uriParameters);

            var resp = await _ramlClient.AttributeUseMvo.Get(req);
            AttributeUseMvoProxyUtils.ThrowOnHttpResponseError(resp);
            state = resp.Content;
            return state;
        }

        public IAttributeUseMvoState Get(AttributeSetAttributeUseId attributeSetAttributeUseId)
        {
            return GetAsync(attributeSetAttributeUseId).GetAwaiter().GetResult();
        }


        public IEnumerable<IAttributeUseMvoState> GetAll(int firstResult, int maxResults)
        {
            return Get((IDictionary<string, object>)null, null, firstResult, maxResults);
        }

        public IEnumerable<IAttributeUseMvoState> Get(IEnumerable<KeyValuePair<string, object>> filter, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue)
        {
            return Get(filter, orders, firstResult, maxResults, null);
        }

        public async Task<IEnumerable<IAttributeUseMvoState>> GetAsync(IEnumerable<KeyValuePair<string, object>> filter, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue, IList<string> fields = null)
        {
            IEnumerable<IAttributeUseMvoState> states = null;
			var q = new AttributeUseMvosGetQuery();
			q.FirstResult = firstResult;
			q.MaxResults = maxResults;
            q.Sort = AttributeUseMvoProxyUtils.GetOrdersQueryValueString(orders);
            q.Fields = AttributeUseMvoProxyUtils.GetReturnedFieldsQueryValueString(fields, QueryFieldValueSeparator);
            q.FilterTag = AttributeUseMvoProxyUtils.GetFilterTagQueryValueString(filter);
            var req = new AttributeUseMvosGetRequest();
            req.Query = q;
            var resp = await _ramlClient.AttributeUseMvos.Get(req);
            AttributeUseMvoProxyUtils.ThrowOnHttpResponseError(resp);
            states = resp.Content;
            return states;
        }

        public IEnumerable<IAttributeUseMvoState> Get(IEnumerable<KeyValuePair<string, object>> filter, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue, IList<string> fields = null)
        {
            return GetAsync(filter, orders, firstResult, maxResults, fields).GetAwaiter().GetResult();
        }

        public IEnumerable<IAttributeUseMvoState> GetByProperty(string propertyName, object propertyValue, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue)
        {
            return GetByProperty(propertyName, propertyValue, orders, firstResult, maxResults, null);
        }

        public IEnumerable<IAttributeUseMvoState> GetByProperty(string propertyName, object propertyValue, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue, IList<string> fields = null)
        {
            var filter = Restrictions.Eq(propertyName, propertyValue);
            return Get(filter, orders, firstResult, maxResults, fields);
        }

        public virtual void Execute(object command)
        {
            ((dynamic)this).When((dynamic)command);
        }

        public IEnumerable<IAttributeUseMvoState> Get(ICriterion filter, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue)
        {
            return Get(filter, orders, firstResult, maxResults, null);
        }

        public async Task<IEnumerable<IAttributeUseMvoState>> GetAsync(ICriterion filter, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue, IList<string> fields = null)
        {
            IEnumerable<IAttributeUseMvoState> states = null;
			var q = new AttributeUseMvosGetQuery();
			q.FirstResult = firstResult;
			q.MaxResults = maxResults;
            q.Sort = AttributeUseMvoProxyUtils.GetOrdersQueryValueString(orders);
            q.Fields = AttributeUseMvoProxyUtils.GetReturnedFieldsQueryValueString(fields, QueryFieldValueSeparator);
            q.Filter = AttributeUseMvoProxyUtils.GetFilterQueryValueString(filter);
            var req = new AttributeUseMvosGetRequest();
            req.Query = q;
            var resp = await _ramlClient.AttributeUseMvos.Get(req);
            AttributeUseMvoProxyUtils.ThrowOnHttpResponseError(resp);
            states = resp.Content;
            return states;
        }

        public IEnumerable<IAttributeUseMvoState> Get(ICriterion filter, IList<string> orders = null, int firstResult = 0, int maxResults = int.MaxValue, IList<string> fields = null)
        {
            return GetAsync(filter, orders, firstResult, maxResults, fields).GetAwaiter().GetResult();
        }

        public async virtual Task<long> GetCountAsync(IEnumerable<KeyValuePair<string, object>> filter)
		{
			var q = new AttributeUseMvosCountGetQuery();
            q.FilterTag = AttributeUseMvoProxyUtils.GetFilterTagQueryValueString(filter);
            var req = new AttributeUseMvosCountGetRequest();
            req.Query = q;
            var resp = await _ramlClient.AttributeUseMvosCount.Get(req);
            AttributeUseMvoProxyUtils.ThrowOnHttpResponseError(resp);
            return long.Parse(await resp.RawContent.ReadAsStringAsync());
		}

        public virtual long GetCount(IEnumerable<KeyValuePair<string, object>> filter)
		{
		    return GetCountAsync(filter).GetAwaiter().GetResult();
		}

        public async virtual Task<long> GetCountAsync(ICriterion filter)
		{
			var q = new AttributeUseMvosCountGetQuery();
            q.Filter = AttributeUseMvoProxyUtils.GetFilterQueryValueString(filter);
            var req = new AttributeUseMvosCountGetRequest();
            req.Query = q;
            var resp = await _ramlClient.AttributeUseMvosCount.Get(req);
            AttributeUseMvoProxyUtils.ThrowOnHttpResponseError(resp);
            return long.Parse(await resp.RawContent.ReadAsStringAsync());
		}

        public virtual long GetCount(ICriterion filter)
		{
		    return GetCountAsync(filter).GetAwaiter().GetResult();
		}

        public async Task<IAttributeUseMvoStateEvent> GetStateEventAsync(AttributeSetAttributeUseId attributeSetAttributeUseId, long version)
        {
            var idObj = AttributeUseMvoProxyUtils.ToIdString(attributeSetAttributeUseId);
            var uriParameters = new AttributeUseMvoStateEventUriParameters();
            uriParameters.Id = idObj;
            uriParameters.Version = version.ToString();

            var req = new AttributeUseMvoStateEventGetRequest(uriParameters);
            var resp = await _ramlClient.AttributeUseMvoStateEvent.Get(req);
            AttributeUseMvoProxyUtils.ThrowOnHttpResponseError(resp);
            return resp.Content;
        }

        public IAttributeUseMvoStateEvent GetStateEvent(AttributeSetAttributeUseId attributeSetAttributeUseId, long version)
        {
            return GetStateEventAsync(attributeSetAttributeUseId, version).GetAwaiter().GetResult();
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


    public partial class AttributeUseMvoApplicationServiceProxyFactory : ProxyFactoryBase, IAttributeUseMvoApplicationServiceFactory
    {

        public AttributeUseMvoApplicationServiceProxyFactory() : base()
        {}

        public AttributeUseMvoApplicationServiceProxyFactory(string endpointUrl) : base(endpointUrl)
        {}

        public IAttributeUseMvoApplicationService AttributeUseMvoApplicationService
        {
            get
            {
                return new AttributeUseMvoApplicationServiceProxy(ProxyTemplate);
            }
        }
		
        public ICreateAttributeUseMvo NewCreateAttributeUseMvo()
        {
            return new CreateAttributeUseMvoDto();
        }

        public IMergePatchAttributeUseMvo NewMergePatchAttributeUseMvo()
        {
            return new MergePatchAttributeUseMvoDto();
        }

        public IDeleteAttributeUseMvo NewDeleteAttributeUseMvo()
        {
            return new DeleteAttributeUseMvoDto();
        }
    }

    public static class AttributeUseMvoProxyUtils
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

        public static string ToIdString(AttributeSetAttributeUseId id)
        {
            var formatter = new AttributeSetAttributeUseIdFlattenedDtoFormatter();
            var idDto = new AttributeSetAttributeUseIdFlattenedDto(id);
            var idStr = formatter.ToString(idDto);
            return idStr;
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

        public static IEnumerable<AttributeSetAttributeUseId> ToIdCollection(IEnumerable<IAttributeUseMvoState> states)
        {
            var ids = new List<AttributeSetAttributeUseId>();
            foreach (var s in states)
            {
                ids.Add(s.AttributeSetAttributeUseId);
            }
            return ids;
        }

    }

}

