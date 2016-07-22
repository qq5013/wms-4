using Newtonsoft.Json;
using Newtonsoft.Json.Linq;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Dddml.Wms.HttpServices.JsonConverters
{
    public class LongConverter : JsonConverter
    {
        public override bool CanConvert(Type objectType)
        {
            return (objectType == typeof(long) || objectType == typeof(long?));
        }

        public override object ReadJson(JsonReader reader, Type objectType, object existingValue, JsonSerializer serializer)
        {
            JToken token = JToken.Load(reader);
            if (token.Type == JTokenType.Float || token.Type == JTokenType.Integer)
            {
                return token.ToObject<long>();
            }
            if (token.Type == JTokenType.String)
            {
                // customize this to suit your needs
                return long.Parse(token.ToString(), System.Globalization.CultureInfo.InvariantCulture);
            }
            if (token.Type == JTokenType.Null && objectType == typeof(long?))
            {
                return null;
            }
            throw new JsonSerializationException("Unexpected token type: " + token.Type.ToString());
        }

        public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
        {
            serializer.Serialize(writer, value.ToString());
        }
    }

}
