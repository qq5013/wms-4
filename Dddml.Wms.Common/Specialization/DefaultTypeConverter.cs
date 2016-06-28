using System;
using System.ComponentModel;

namespace Dddml.Wms.Specialization
{
    public class DefaultTypeConverter : ITypeConverter
    {
        global::Dddml.Support.Criterion.DefaultTypeConverter _innerTypeConverter = new global::Dddml.Support.Criterion.DefaultTypeConverter();

        public virtual object ConvertFromString(Type type, string text)
        {
            return _innerTypeConverter.ConvertFromString(type, text);
        }

        public virtual string ConvertToString(Type type, object value)
        {
            return _innerTypeConverter.ConvertToString(type, value);
        }
    }
}
