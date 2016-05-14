using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;


namespace Dddml.Wms.Support
{
    public static class AttributeValueTypeUtils
    {

        public const string ListAttributeValueTypeName = "List";

        /// <summary>
        /// 尝试获取物料属性值类型。注意这里不返回List类型。
        /// </summary>
        /// <param name="attributeValueType">属性值类型</param>
        /// <returns></returns>
        public static bool TryGetAttributeValueType(Type type, out string attributeValueType)
        {
            attributeValueType = null;
            if (IsBasicType(type))
            {
                attributeValueType = type.Name;
                return true;
            }
            if (NullableUtils.IsNullableType(type))
            {
                Type underlyingType = NullableUtils.GetUnderlyingType(type);
                if (IsBasicType(underlyingType))
                {
                    attributeValueType = underlyingType.Name;
                    return true;
                }
            }
            return false;
        }

        /// <summary>
        /// 当前认为是“基本类型”的包括：
        /// System.Type.IsPrimitive为true的类型；
        /// 枚举；
        /// 字符串string；
        /// object。
        /// </summary>
        /// <param name="type"></param>
        /// <returns></returns>
        public static bool IsBasicType(System.Type type)
        {
            if (type.IsPrimitive || type.IsEnum || type == typeof(string) || type == typeof(DateTime)
                || type == typeof(decimal))
            {
                return true;
            }
            return false;
        }

    }
}
