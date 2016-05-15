using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection;
using System.Text;


namespace Dddml.Wms.Support
{

    internal static class NullableUtils
    {

        public static bool IsNullableType(System.Type type)
        {
            if (type.IsGenericType && type.GetGenericTypeDefinition() == typeof(Nullable<>))
            { return true; }
            return false;
        }

        public static Type GetUnderlyingType(Type nullableType)
        {
            if (IsNullableType(nullableType))
            {
                System.Type underlyingType = Nullable.GetUnderlyingType(nullableType);
                return underlyingType;
            }
            else
            {
                throw new ArgumentException();
            }

        }

        public static object GetUnderlyingValue(object nullableObject)
        {
            //TODO
            if (nullableObject == null)
            {
                throw new System.NullReferenceException();
            }
            object underlyingVal = null;
            System.Type nullableType = nullableObject.GetType();
            Type underlyingType = GetUnderlyingType(nullableType);
            if (underlyingType == typeof(DateTime))
            {
                if (((DateTime?)nullableObject).HasValue) { underlyingVal = ((DateTime?)nullableObject).Value; }// : underlyingVal = null;
            }
            else if (underlyingType == typeof(int))
            {
                if (((int?)nullableObject).HasValue) { underlyingVal = ((int?)nullableObject).Value; }// : underlyingVal = null;
            }
            else if (underlyingType == typeof(long))
            {
                if (((long?)nullableObject).HasValue) { underlyingVal = ((long?)nullableObject).Value; }//: underlyingVal = null;
            }
            else if (underlyingType == typeof(decimal))
            {
                if (((decimal?)nullableObject).HasValue) { underlyingVal = ((decimal?)nullableObject).Value; }
            }
            else if (underlyingType == typeof(bool))
            {
                if (((bool?)nullableObject).HasValue) { underlyingVal = ((bool?)nullableObject).Value; }
            }
            else
            {
                throw new NotImplementedException();
            }
            return underlyingVal;

        }

        public static object GetNullableObject(object underlyingValue)
        {
            //TODO
            if (underlyingValue == null) { return null; }
            System.Type underlyingType = underlyingValue.GetType();
            if (underlyingType == typeof(DateTime)) { return new DateTime?((DateTime)underlyingValue); }
            if (underlyingType == typeof(int)) { return new int?((int)underlyingValue); }
            if (underlyingType == typeof(long)) { return new long?((long)underlyingValue); }
            if (underlyingType == typeof(decimal)) { return new decimal?((decimal)underlyingValue); }
            if (underlyingType == typeof(bool)) { return new bool?((bool)underlyingValue); }
            throw new NotImplementedException();
            //string typeName = "System.Nullable<" + underlyingType.FullName + ">";
            //System.Type type = System.Type.GetType(typeName);
            //object nullableObj = System.Activator.CreateInstance(type);
            //SetMember(nullableObj, "Value", underlyingValue);
            //return nullableObj;
        }


        private static void SetMember(object obj, string memberName, object memberVal)
        {
            MemberInfo memberInfo = obj.GetType().GetMember(memberName)[0];
            if (memberInfo.MemberType == MemberTypes.Field)
            { ((FieldInfo)memberInfo).SetValue(obj, memberVal); }
            else if (memberInfo.MemberType == MemberTypes.Property)
            { ((PropertyInfo)memberInfo).SetValue(obj, memberVal, null); }
            else
            { throw new ArgumentException(); }
        }

    }
}
