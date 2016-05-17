using Dddml.Wms.HttpServices.ApiControllers;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using Newtonsoft.Json.Linq;
using Dddml.Wms.Domain;


namespace Dddml.Wms.HttpServices.ApiControllers
{
    public class AttributeSetInstanceDtoJObjectMapper : AttributeSetInstanceDtoJObjectMapperBase
    {
        protected override void MapExtensionProperties(JObject dynamicObject, CreateAttributeSetInstanceDto command)
        {
            //todo
        }

        protected override void MapExtensionProperties(JObject dynamicObject, MergePatchAttributeSetInstanceDto command)
        {
            //todo
        }

        protected override void MapExtensionProperties(AttributeSetInstanceStateDto command, JObject dynamicObject)
        {
            //todo
        }
    }
}