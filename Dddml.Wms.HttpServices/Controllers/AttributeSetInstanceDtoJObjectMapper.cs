using Dddml.Wms.HttpServices.ApiControllers;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using Newtonsoft.Json.Linq;
using Dddml.Wms.Domain;
using Dddml.Wms.Services;
using Dddml.Wms.Specialization;
using Dynamitey;


namespace Dddml.Wms.HttpServices.ApiControllers
{
    public class AttributeSetInstanceDtoJObjectMapper : AttributeSetInstanceDtoJObjectMapperBase
    {
        public IAttributeSetService AttributeSetService { get; set; }

        protected override void MapExtensionProperties(JObject dynamicObject, CreateAttributeSetInstanceDto command)
        {
            var pDic = AttributeSetService.GetExtensionPropertyFieldDictionary(command.AttributeSetId);
            MapExtensionProperties(dynamicObject, command, pDic);
        }

        protected override void MapExtensionProperties(JObject dynamicObject, MergePatchAttributeSetInstanceDto command)
        {
            var pDic = AttributeSetService.GetExtensionPropertyFieldDictionary(command.AttributeSetId);
            MapExtensionProperties(dynamicObject, command, pDic);
            //TODO map IsPropertyXxxyyyRemoved ...
        }

        protected override void MapExtensionProperties(AttributeSetInstanceStateDto state, JObject dynamicObject)
        {
            var pDic = AttributeSetService.GetExtensionPropertyFieldDictionary(state.AttributeSetId);
        }


        //protected override JObject NewJObject(AttributeSetInstanceStateDto state)
        //{
        //    dynamic dynamicObject = new JObject();
        //    return dynamicObject;
        //}

        /// <summary>
        /// Map Extension properties.
        /// </summary>
        /// <param name="dynamicObject">Source object.</param>
        /// <param name="command">Target object.</param>
        /// <param name="propertyFieldDictionary">Extension propertyName-to-underlyingFieldName dictionary.</param>
        private static void MapExtensionProperties(JObject dynamicObject, CreateOrMergePatchOrDeleteAttributeSetInstanceDto command, IDictionary<string, string> propertyFieldDictionary)
        {
            foreach (var p in propertyFieldDictionary)
            {
                var propertyName = p.Key;
                var fieldName = p.Value;
                var pVal = dynamicObject.GetValue(propertyName, StringComparison.InvariantCultureIgnoreCase);
                if (pVal != null)
                {
                    var fieldType = command.GetType().GetProperty(fieldName).PropertyType;
                    Dynamic.InvokeSet(command, fieldName, pVal.ToObject(fieldType));
                }
            }
        }


    }
}