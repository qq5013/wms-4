using System;
using System.ComponentModel;

namespace Dddml.Wms.Specialization
{
    public class DefaultTypeConverter : ITypeConverter
    {
        public virtual object ConvertFromString(Type type, string text)
        {
            var converter = TypeDescriptor.GetConverter(type);
            return converter.ConvertFromString(text);
        }

        public virtual string ConvertToString(Type type, object value)
        {
            var converter = TypeDescriptor.GetConverter(type);
            return converter.ConvertToString(value);
        }
    }
}
