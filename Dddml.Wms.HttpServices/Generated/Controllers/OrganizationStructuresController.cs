﻿// <autogenerated>
//   This file was generated by T4 code generator GenerateControllers.tt.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

using System;
using System.Collections.Generic;
using Dddml.Wms.Specialization;
using Dddml.Wms.Domain;
using Dddml.Wms.Domain.Metadata;
using Dddml.Wms.HttpServices.Filters;
using System.Linq;
using System.Net;
using System.ComponentModel;
using System.Net.Http;
using System.Net.Http.Formatting;
using System.Web.Http;
using Newtonsoft.Json.Linq;
using Dddml.Support.Criterion;

namespace Dddml.Wms.HttpServices.ApiControllers
{

    [RoutePrefix("api/OrganizationStructures")][Authorize]
    public partial class OrganizationStructuresController : ApiController
    {

        IOrganizationStructureApplicationService _organizationStructureApplicationService = ApplicationContext.Current["OrganizationStructureApplicationService"] as IOrganizationStructureApplicationService;

        [Route(Order = 1)]
        [HttpGet]
        public IEnumerable<OrganizationStructureStateDto> GetAll(string sort = null, string fields = null, int firstResult = 0, int maxResults = int.MaxValue, string filter = null)
        {
          try {
            IEnumerable<IOrganizationStructureState> states = null; 
            if (!String.IsNullOrWhiteSpace(filter))
            {
                states = _organizationStructureApplicationService.Get(CriterionDto.ToSubclass(JObject.Parse(filter).ToObject<CriterionDto>(),new ApiControllerTypeConverter(), new PropertyTypeResolver())
                    , OrganizationStructuresControllerUtils.GetQueryOrders(sort, QueryOrderSeparator), firstResult, maxResults);
            }
            else 
            {
                states = _organizationStructureApplicationService.Get(OrganizationStructuresControllerUtils.GetQueryFilterDictionary(this.Request.GetQueryNameValuePairs())
                    , OrganizationStructuresControllerUtils.GetQueryOrders(sort, QueryOrderSeparator), firstResult, maxResults);
            }
            var stateDtos = new List<OrganizationStructureStateDto>();
            foreach (var s in states)
            {
                var dto = s is OrganizationStructureStateDto ? (OrganizationStructureStateDto)s : new OrganizationStructureStateDto((OrganizationStructureState)s);
                if (String.IsNullOrWhiteSpace(fields))
                {
                    dto.AllFieldsReturned = true;
                }
                else
                {
                    dto.ReturnedFieldsString = fields;
                }
                stateDtos.Add(dto);
            }
            return stateDtos;
          } catch (Exception ex) { var response = OrganizationStructuresControllerUtils.GetErrorHttpResponseMessage(ex); throw new HttpResponseException(response); }
        }

        [HttpGet]
        public OrganizationStructureStateDto Get(string id, string fields = null)
        {
          try {
            var idObj = OrganizationStructuresControllerUtils.ParseIdString(id);
            var state = (OrganizationStructureState)_organizationStructureApplicationService.Get(idObj);
            if (state == null) { return null; }
            var stateDto = new OrganizationStructureStateDto(state);
            if (String.IsNullOrWhiteSpace(fields))
            {
                stateDto.AllFieldsReturned = true;
            }
            else
            {
                stateDto.ReturnedFieldsString = fields;
            }
            return stateDto;
          } catch (Exception ex) { var response = OrganizationStructuresControllerUtils.GetErrorHttpResponseMessage(ex); throw new HttpResponseException(response); }
        }


        [Route("_count")]
        [HttpGet]
        public long GetCount(string filter = null)
        {
          try
          {
            long count = 0;
            if (!String.IsNullOrWhiteSpace(filter))
            {
                count = _organizationStructureApplicationService.GetCount(CriterionDto.ToSubclass(JObject.Parse(filter).ToObject<CriterionDto>(),new ApiControllerTypeConverter(), new PropertyTypeResolver()));
            }
            else 
            {
                count = _organizationStructureApplicationService.GetCount(OrganizationStructuresControllerUtils.GetQueryFilterDictionary(this.Request.GetQueryNameValuePairs()));
            }
            return count;
          } catch (Exception ex) { var response = OrganizationStructuresControllerUtils.GetErrorHttpResponseMessage(ex); throw new HttpResponseException(response); }
        }

        [HttpPut][SetRequesterId]
        public void Put(string id, [FromBody]CreateOrganizationStructureDto value)
        {
          try {
            OrganizationStructuresControllerUtils.SetNullIdOrThrowOnInconsistentIds(id, value);
            _organizationStructureApplicationService.When(value as ICreateOrganizationStructure);
          } catch (Exception ex) { var response = OrganizationStructuresControllerUtils.GetErrorHttpResponseMessage(ex); throw new HttpResponseException(response); }
        }

        [HttpPatch][SetRequesterId]
        public void Patch(string id, [FromBody]MergePatchOrganizationStructureDto value)
        {
          try {
            OrganizationStructuresControllerUtils.SetNullIdOrThrowOnInconsistentIds(id, value);
            _organizationStructureApplicationService.When(value as IMergePatchOrganizationStructure);
          } catch (Exception ex) { var response = OrganizationStructuresControllerUtils.GetErrorHttpResponseMessage(ex); throw new HttpResponseException(response); }
        }

        [HttpDelete][SetRequesterId]
        public void Delete(string id, string commandId, string version, string requesterId = default(string))
        {
          try {
            var value = new DeleteOrganizationStructureDto();
            value.CommandId = commandId;
            value.RequesterId = requesterId;
            value.Version = (long)Convert.ChangeType(version, typeof(long));
            OrganizationStructuresControllerUtils.SetNullIdOrThrowOnInconsistentIds(id, value);
            _organizationStructureApplicationService.When(value as IDeleteOrganizationStructure);
          } catch (Exception ex) { var response = OrganizationStructuresControllerUtils.GetErrorHttpResponseMessage(ex); throw new HttpResponseException(response); }
        }


        [Route("_metadata/filteringFields")]
        [HttpGet]
        public IEnumerable<PropertyMetadata> GetMetadataFilteringFields()
        {
          try {
            var filtering = new List<PropertyMetadata>();
            foreach (var p in OrganizationStructureMetadata.Instance.Properties)
            {
                if (p.IsFilteringProperty)
                {
                    filtering.Add(p);
                }
            }
            return filtering;
          } catch (Exception ex) { var response = OrganizationStructuresControllerUtils.GetErrorHttpResponseMessage(ex); throw new HttpResponseException(response); }
        }

        [Route("{id}/_stateEvents/{version}")]
        [HttpGet]
        public IOrganizationStructureStateEvent GetStateEvent(string id, long version)
        {
          try {
            var idObj = OrganizationStructuresControllerUtils.ParseIdString(id);
            return _organizationStructureApplicationService.GetStateEvent(idObj, version);
          } catch (Exception ex) { var response = OrganizationStructuresControllerUtils.GetErrorHttpResponseMessage(ex); throw new HttpResponseException(response); }
        }


		// /////////////////////////////////////////////////

        protected virtual string QueryOrderSeparator
        {
            get { return ","; }
        }

        // ////////////////////////////////

        private class ApiControllerTypeConverter : Dddml.Support.Criterion.ITypeConverter
        {
            public T ConvertFromString<T>(string text)
            {
                return (T)ApplicationContext.Current.TypeConverter.ConvertFromString(typeof(T), text);
            }

            public object ConvertFromString(Type type, string text)
            {
                return ApplicationContext.Current.TypeConverter.ConvertFromString(type, text);
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
                throw new NotSupportedException();
            }
        }

        private class PropertyTypeResolver : IPropertyTypeResolver
        {

            public Type ResolveTypeByPropertyName(string propertyName)
            {
                return OrganizationStructuresControllerUtils.GetFilterPropertyType(propertyName);
            }
        }

    }


    
    public static class OrganizationStructuresControllerUtils
    {

        public static HttpResponseMessage GetErrorHttpResponseMessage(Exception ex)
        {
            var errorName = ex.GetType().Name;
            var errorMessage = ex.Message;
            if (ex is DomainError)
            {
                DomainError de = ex as DomainError;
                errorName = de.Name;
                errorMessage = de.Message;
            }
            else
            {
                //改进??
                errorMessage = String.IsNullOrWhiteSpace(ex.Message) ? String.Empty : ex.Message.Substring(0, (ex.Message.Length > 140) ? 140 : ex.Message.Length);
            }
            dynamic content = new JObject();
            content.ErrorName = errorName;
            content.ErrorMessage = errorMessage;
            var response = new HttpResponseMessage(HttpStatusCode.InternalServerError)
            {
                Content = new ObjectContent<JObject>(content as JObject, new JsonMediaTypeFormatter()),
                ReasonPhrase = "Server Error"
            };
            return response;
        }

        public static void SetNullIdOrThrowOnInconsistentIds(string id, CreateOrMergePatchOrDeleteOrganizationStructureDto value)
        {
            var idObj = ParseIdString(id.IsNormalized() ? id : id.Normalize());
            if (value.Id == null)
            {
                value.Id = new OrganizationStructureIdDto(idObj);
            }
            else if (!((ICreateOrMergePatchOrDeleteOrganizationStructure)value).Id.Equals(idObj))
            {
                throw DomainError.Named("inconsistentId", "Argument Id {0} NOT equals body Id {1}", id, value.Id);
            }
        }

        public static OrganizationStructureId ParseIdString(string idString)
        {
            var formatter = new OrganizationStructureIdFlattenedDtoFormatter();
            var idDto = formatter.Parse(idString);
            var rId = idDto.ToOrganizationStructureId();
            return rId;
        }

        public static string GetFilterPropertyName(string fieldName)
        {
            if (String.Equals(fieldName, "sort", StringComparison.InvariantCultureIgnoreCase)
                || String.Equals(fieldName, "firstResult", StringComparison.InvariantCultureIgnoreCase)
                || String.Equals(fieldName, "maxResults", StringComparison.InvariantCultureIgnoreCase)
                || String.Equals(fieldName, "fields", StringComparison.InvariantCultureIgnoreCase))
            {
                return null;
            }
            if (OrganizationStructureMetadata.Instance.PropertyMetadataDictionary.ContainsKey(fieldName))
            {
                var p = OrganizationStructureMetadata.Instance.PropertyMetadataDictionary[fieldName];
                if (p.IsFilteringProperty)
                {
                    var propertyName = fieldName;
                    if (p.IsDerived)
                    {
                        propertyName = p.DerivedFrom;
                    }
                    return propertyName;
                }
            }
            return null;
        }

        public static Type GetFilterPropertyType(string propertyName)
        {
            if (OrganizationStructureMetadata.Instance.PropertyMetadataDictionary.ContainsKey(propertyName))
            {
                return OrganizationStructureMetadata.Instance.PropertyMetadataDictionary[propertyName].Type;
            }
            return typeof(string);
        }

        public static IDictionary<string, object> GetQueryFilterDictionary(IEnumerable<KeyValuePair<string, string>> queryNameValuePairs)
        {
            var filter = new Dictionary<string, object>();
            foreach (var p in queryNameValuePairs)
            {
                var pName = GetFilterPropertyName(p.Key);
                if (!String.IsNullOrWhiteSpace(pName))
                {
                    Type type = GetFilterPropertyType(pName);
                    var pValue = ApplicationContext.Current.TypeConverter.ConvertFromString(type, p.Value);
                    filter.Add(pName, pValue);
                }
            }
            return filter;
        }

        public static IList<string> GetQueryOrders(string str, string separator)
        {
            if (String.IsNullOrWhiteSpace(str))
            {
                return new string[0];
            }
            var arr = str.Split(new string[] { separator }, StringSplitOptions.RemoveEmptyEntries);
            var orders = new List<string>();
            foreach (var a in arr)
            {
                orders.Add(a.Trim());
            }
            return orders;
        }

        public static IEnumerable<OrganizationStructureStateDto> ToOrganizationStructureStateDtoCollection(IEnumerable<OrganizationStructureId> ids)
        {
            var states = new List<OrganizationStructureStateDto>();
            foreach (var id in ids)
            {
                var dto = new OrganizationStructureStateDto();
                dto.Id = new OrganizationStructureIdDto(id);
                states.Add(dto);
            }
            return states;
        }

    }

}

