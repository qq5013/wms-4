using System;

namespace Dddml.Wms.Specialization
{
    public interface ITypeConverter
    {
        object ConvertFromString(Type type, string text);

        string ConvertToString(Type type, object obj);

    }
}
