using System;

namespace Dddml.Wms.Specialization
{
    public static class ReflectUtils
    {
        public static void CopyPropertyValue(string propertyName, object source, object destination)
        {
            if (source != null)
            {
                var srcProp = source.GetType().GetProperty(propertyName);
                var value = srcProp.GetValue(source);
                SetPropertyValue(propertyName, destination, value);
            }
        }

        public static void SetPropertyValue(string propertyName, object obj, object value)
        {
            var dstProp = obj.GetType().GetProperty(propertyName);
            if (dstProp != null)
            {
                dstProp.SetValue(obj, value);
            }
        }

        public static object GetPropertyValue(string propertyName, object obj)
        {
            var dstProp = obj.GetType().GetProperty(propertyName);
            if (dstProp != null)
            {
                dstProp.GetValue(obj);
            }
            return null;
        }

    }
}

