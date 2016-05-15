using Dddml.Wms.Domain;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Reflection;
using System.Text.RegularExpressions;


namespace Dddml.Wms.Support
{


    /// <summary>
    /// 物料属性工具。
    /// </summary>
    /// <typeparam name="TUser">用户类型</typeparam>
    /// <typeparam name="TAttribute">物料属性类型</typeparam>
    /// <typeparam name="TAttributeValue">物料属性值类型</typeparam>
    /// <typeparam name="TAttributeSet">物料属性集合类型</typeparam>
    /// <typeparam name="TAttributeUse">“物料属性使用”类型</typeparam>
    public class AttributeSetBuilder<TAttributeSet, TAttribute, TAttributeValue, TAttributeUse>
        where TAttributeSet : ICreateAttributeSet, new()
        where TAttribute : ICreateAttribute, new()
        where TAttributeValue : ICreateAttributeValue
        where TAttributeUse : ICreateAttributeUse
    {

        public interface IdGenerator
        {

            string GenerateAttributeSetId(TAttributeSet attributeSet);

            string GenerateAttributeId(TAttribute attribute);

        }


        public IdGenerator _theIdGenerator;

        private ICollection<string> _ignoredMembers = new List<string>(new string[] { 
                "IsActive", "Active",
                "CreatedBy", 
                "CreationTime", "CreatedAt", 
                "UpdatedBy",
                "UpdateTime", "UpdatedAt",
                "OrganizationId",
                "AttributeSet", "AttributeSetId", 
                "AttributeSetInstanceId",
                "Lot",
                "LotNumber",
                "SerialNumber",
                "Description",
                "RowVersion", "Version",
                "Id"
        });

        public ICollection<string> IgnoredMembers
        {
            get { return _ignoredMembers; }
            set { _ignoredMembers = value; }
        }

        public AttributeSetBuilder(IdGenerator idGenerator)
        {
            this._theIdGenerator = idGenerator;

        }

        /// <summary>
        /// 从实体类（的成员中）中提取物料属性信息。
        /// </summary>
        /// <param name="entityType">实体类型</param>
        /// <param name="attributeSets">物料属性集</param>
        /// <param name="attributes">物料属性</param>
        /// <param name="attributeValues">物料属性值</param>
        /// <param name="attributeUses">“物料属性使用”</param>
        public void BuildAttributeSetsFromEntityType(Type entityType,out IList<TAttributeSet> attributeSets, out IList<TAttribute> attributes, out IList<TAttributeValue> attributeValues, out IList<TAttributeUse> attributeUses)
        {

            AttributeGroupDictionary groupDictionary;
            GetAttributesAndAttributeValues(entityType, out attributes, out attributeValues, out groupDictionary);

            attributeSets = new List<TAttributeSet>();
            attributeUses = new List<TAttributeUse>();

            if (groupDictionary.Count > 0)
            {
                foreach (KeyValuePair<string, IList<TAttribute>> pair in groupDictionary)
                {
                    IList<TAttributeUse> attrUses;
                    TAttributeSet attrSet = GetAttributeSet(pair.Key, pair.Value, out attrUses);
                    attributeSets.Add(attrSet);
                    ((List<TAttributeUse>)attributeUses).AddRange(attrUses);
                }
            }

            IList<TAttributeUse> totalAttributeSetUses;
            TAttributeSet totalAttributeSet = GetTotalAttributeSet(entityType, attributes, out totalAttributeSetUses);
            attributeSets.Add(totalAttributeSet);
            ((List<TAttributeUse>)attributeUses).AddRange(totalAttributeSetUses);
        }



        /// <summary>
        /// 取得包含全部物料属性的属性集。
        /// </summary>
        private TAttributeSet GetTotalAttributeSet(Type entityType, IList<TAttribute> attributes, out IList<TAttributeUse> attributeUses)
        {
            TAttributeSet attrSet = GetAttributeSet(entityType);
            attributeUses = GetAttributeUses(attrSet, attributes);
            return attrSet;
        }

        /// <summary>
        /// 取得（生成）一个属性集。
        /// </summary>
        /// <param name="attributeSetName"></param>
        /// <param name="attributes"></param>
        /// <returns></returns>
        private TAttributeSet GetAttributeSet(string attributeSetName, IList<TAttribute> attributes, out IList<TAttributeUse> attributeUses)
        {
            TAttributeSet attrSet = new TAttributeSet();
            attrSet.Name = attributeSetName;
            attrSet.Description = attributeSetName;
            attrSet.Active = true;
            attrSet.AttributeSetId = this._theIdGenerator.GenerateAttributeSetId(attrSet);
            attributeUses = GetAttributeUses(attrSet, attributes);
            return attrSet;
        }


        /// <summary>
        /// 取得“物料属性使用”，即生成物料属性集和属性之间的关联对象。
        /// </summary>
        /// <param name="attributeSet">物料属性集</param>
        /// <param name="attributes">物料属性</param>
        /// <returns></returns>
        private IList<TAttributeUse> GetAttributeUses(TAttributeSet attributeSet, IList<TAttribute> attributes)
        {
            List<TAttributeUse> attributeUses = new List<TAttributeUse>();
            foreach (TAttribute a in attributes)
            {
                TAttributeUse au = (TAttributeUse)attributeSet.NewCreateAttributeUse();//new TAttributeUse();
                au.AttributeId = a.AttributeId;
                au.AttributeSetId = attributeSet.AttributeSetId;
                au.Active = true;
                attributeUses.Add(au);
                attributeSet.AttributeUses.Add(au);
            }
            return attributeUses;
        }

        /// <summary>
        /// 取得物料属性和物料属性值。
        /// </summary>
        /// <param name="entityType">实体类型</param>
        /// <param name="attributes">物料属性</param>
        /// <param name="attributeValues">物料属性值</param>
        private void GetAttributesAndAttributeValues(Type entityType,
            out IList<TAttribute> attributes, out IList<TAttributeValue> attributeValues,
            out AttributeGroupDictionary groupDictionary)
        {
            attributes = new List<TAttribute>();
            attributeValues = new List<TAttributeValue>();
            groupDictionary = new AttributeGroupDictionary();
            List<MemberInfo> members = new List<MemberInfo>();
            members.AddRange(entityType.GetFields());
            members.AddRange(entityType.GetProperties());
            foreach (MemberInfo memberInfo in members)
            {
                if (IsMemberIgnored(memberInfo))
                { continue; }
                TAttribute a;
                IList<TAttributeValue> avs;
                if (TryGetAttributeAndAttributeValues(memberInfo, out a, out avs))
                {
                    attributes.Add(a);
                    if (avs != null)//如果存在属性值（属性的值类型是列表）
                    {
                        ((List<TAttributeValue>)attributeValues).AddRange(avs);
                    }
                    IList<AttributeGroupAttribute> groupAttributes = GetAttributeGroupAttributes(memberInfo);
                    if (groupAttributes != null)
                    {
                        foreach (AttributeGroupAttribute gAttr in groupAttributes)
                        {
                            groupDictionary.Add(gAttr.GroupName, a);
                        }
                    }
                }
            }
        }



        private IList<AttributeGroupAttribute> GetAttributeGroupAttributes(MemberInfo memberInfo)
        {
            AttributeGroupAttribute[] groupAttributes = (AttributeGroupAttribute[])(Attribute.GetCustomAttributes(memberInfo, typeof(AttributeGroupAttribute)));
            if (groupAttributes != null && groupAttributes.Length > 0)
            {
                return groupAttributes;
            }
            return null;
        }

        /// <summary>
        /// 取得物料属性和物料属性值（如果存在属性值的话）。
        /// </summary>
        /// <param name="memberInfo">成员信息</param>
        /// <param name="attribute">物料属性</param>
        /// <param name="attributeValues">物料属性值</param>
        /// <returns></returns>
        private bool TryGetAttributeAndAttributeValues(MemberInfo memberInfo, out TAttribute attribute, out IList<TAttributeValue> attributeValues)
        {
            attributeValues = null;
            if (TryGetAttribute(memberInfo, out attribute))
            {
                IList<TAttributeValue> aValues = GetAttributeValues(memberInfo, attribute);
                if (aValues != null)
                {
                    attributeValues = new List<TAttributeValue>(aValues);
                    attribute.IsList = true;//attribute.AttributeValueType = AttributeValueTypeUtils.ListAttributeValueTypeName;
                }
                return true;
            }
            return false;
        }

        /// <summary>
        /// 通过成员信息，获取物料属性的值。如果该物料属性的值类型不是“列表”，返回null。
        /// </summary>
        /// <param name="memberInfo">成员信息</param>
        /// <param name="attribute">物料属性</param>
        /// <returns>物料属性值的集合</returns>
        private static IList<TAttributeValue> GetAttributeValues(MemberInfo memberInfo, TAttribute attribute)
        {
            AttributeValueListAttribute[] listAttributes = (AttributeValueListAttribute[])(Attribute.GetCustomAttributes(memberInfo, typeof(AttributeValueListAttribute)));
            if (listAttributes != null && listAttributes.Length > 0)
            {
                //如果标注了物料属性值的来源类型
                List<TAttributeValue> allValues = new List<TAttributeValue>();
                foreach (AttributeValueListAttribute a in listAttributes)
                {
                    Type listType = a.ListType;
                    if (listType.IsEnum)
                    {
                        IList<TAttributeValue> avs = GetAttributeValuesFromEnum(attribute, listType, a);
                        if (avs != null)
                        {
                            allValues.AddRange(avs);
                        }
                    }
                    else
                    {
                        IList<TAttributeValue> avs = GetAttributeValuesFromStaticFields(attribute, listType, a);
                        if (avs != null)
                        {
                            allValues.AddRange(avs);
                        }
                    }

                }
                return allValues;
            }
            return null;
        }

        /// <summary>
        /// 从列表类型的静态字段（类成员，非实例成员）中获取物料属性值。
        /// </summary>
        /// <param name="attribute">物料属性</param>
        /// <param name="listType">列表类型</param>
        /// <param name="listAttribute">标注属性值类型为列表时使用的Attribute</param>
        /// <returns></returns>
        private static IList<TAttributeValue> GetAttributeValuesFromStaticFields(TAttribute attribute, Type listType, AttributeValueListAttribute listAttribute)
        {
            FieldInfo[] fieldInfos = listType.GetFields(BindingFlags.Public | BindingFlags.Static);
            if (fieldInfos == null || fieldInfos.Length == 0)
            {
                return null;
            }
            List<TAttributeValue> aValues = new List<TAttributeValue>();
            Regex regex = null;
            if (!String.IsNullOrEmpty(listAttribute.NamePattern))
            {
                regex = new Regex(listAttribute.NamePattern);
            }
            foreach (FieldInfo p in fieldInfos)
            {
                if (regex != null && !regex.IsMatch(p.Name))
                {
                    continue;
                }
                object val = p.GetValue(null);
                string name = p.Name;
                TAttributeValue aValue = (TAttributeValue)attribute.NewCreateAttributeValue();//new TAttributeValue();
                aValue.Name = name;
                aValue.Value = Convert.ToString(val);
                aValue.Active = true;
                aValue.Description = name;
                aValue.AttributeId = attribute.AttributeId;
                aValues.Add(aValue);
                attribute.AttributeValues.Add(aValue);
            }
            return aValues;
        }

        /// <summary>
        /// 从枚举类型中后去物料属性值。
        /// </summary>
        /// <param name="attribute">物料属性</param>
        /// <param name="enumType">枚举类型</param>
        /// <param name="listAttribute">标注属性值类型为列表时使用的Attribute</param>
        /// <returns></returns>
        private static IList<TAttributeValue> GetAttributeValuesFromEnum(TAttribute attribute, Type enumType, AttributeValueListAttribute listAttribute)
        {
            List<TAttributeValue> aValues = new List<TAttributeValue>();
            Array arr = Enum.GetValues(enumType);
            Regex regex = null;
            if (!String.IsNullOrEmpty(listAttribute.NamePattern))
            {
                regex = new Regex(listAttribute.NamePattern);
            }
            for (int i = 0; i < arr.Length; i++)
            {
                object val = arr.GetValue(i);
                val = Convert.ToInt64(val);
                string name = Enum.GetName(enumType, val);
                if (regex != null && !regex.IsMatch(name))
                {
                    continue;
                }
                TAttributeValue aValue = (TAttributeValue)attribute.NewCreateAttributeValue();// new TAttributeValue();
                aValue.Name = name;
                aValue.Value = Convert.ToString(val);
                aValue.Active = true;
                aValue.Description = name;
                aValue.AttributeId = attribute.AttributeId;
                aValues.Add(aValue);
                attribute.AttributeValues.Add(aValue);
            }
            return aValues;
        }

        /// <summary>
        /// 尝试取得物料属性。
        /// </summary>
        /// <param name="memberInfo"></param>
        /// <param name="attribute"></param>
        /// <returns></returns>
        private bool TryGetAttribute(MemberInfo memberInfo, out TAttribute attribute)
        {
            attribute = default(TAttribute);
            Type memberType = GetMemberType(memberInfo);
            string aValueType;
            bool isList;
            if (!AttributeValueTypeUtils.TryGetAttributeValueType(memberType, out aValueType, out isList))
            {
                //如果没法取得属性类型（成员类型不在支持之列），返回
                return false;
            }
            TAttribute a = new TAttribute();
            a.Name = memberInfo.Name;
            a.Description = memberInfo.Name;
            a.AttributeValueType = aValueType;
            a.IsList = isList;
            a.Active = true;
            a.IsInstanceAttribute = true;
            SetAttributeByAttributeAttribute(memberInfo, a);
            SetAttributeByDescriptionAttribute(memberInfo, a);
            a.AttributeId = this._theIdGenerator.GenerateAttributeId(a);
            attribute = a;
            return true;
        }

        private void SetAttributeByAttributeAttribute(MemberInfo memberInfo, TAttribute a)
        {
            AttributeAttribute aa = GetAttributeAttribute(memberInfo);
            if (aa != null)
            {
                if (!String.IsNullOrEmpty(aa.Description))
                { a.Description = aa.Description; }
                if (!String.IsNullOrEmpty(aa.AttributeValueType))
                { a.AttributeValueType = aa.AttributeValueType; }
                a.Active = aa.IsActive;
                a.IsInstanceAttribute = aa.IsInstanceAttribute;
            }
        }

        private void SetAttributeByDescriptionAttribute(MemberInfo memberInfo, TAttribute a)
        {
            DescriptionAttribute aa = GetDescriptionAttribute(memberInfo);
            if (aa != null)
            {
                if (!String.IsNullOrEmpty(aa.Description))
                { a.Description = aa.Description; }
            }
        }


        /// <summary>
        /// 取得标注物料属性的Attribute。
        /// </summary>
        /// <param name="memberInfo">成员信息</param>
        /// <returns></returns>
        private AttributeAttribute GetAttributeAttribute(MemberInfo memberInfo)
        {
            AttributeAttribute[] aAttributes = (AttributeAttribute[])(Attribute.GetCustomAttributes(memberInfo, typeof(AttributeAttribute)));
            if (aAttributes != null && aAttributes.Length > 0)
            {
                return aAttributes[0];
            }
            return null;
        }

        private DescriptionAttribute GetDescriptionAttribute(MemberInfo memberInfo)
        {
            DescriptionAttribute[] aAttributes = (DescriptionAttribute[])(Attribute.GetCustomAttributes(memberInfo, typeof(DescriptionAttribute)));
            if (aAttributes != null && aAttributes.Length > 0)
            {
                return aAttributes[0];
            }
            return null;
        }

        /// <summary>
        /// 该成员是否应该忽略。
        /// </summary>
        /// <param name="memberInfo"></param>
        /// <returns></returns>
        private bool IsMemberIgnored(MemberInfo memberInfo)
        {
            if (IgnoredMembers.Contains(memberInfo.Name))
            { return true; }
            if (memberInfo.MemberType == MemberTypes.Field)
            { if (((FieldInfo)memberInfo).IsStatic) { return true; } }
            if (memberInfo.MemberType == MemberTypes.Property)
            {
                PropertyInfo pInfo = (PropertyInfo)memberInfo;
                if (!pInfo.CanRead || !pInfo.CanWrite) { return true; }
                if (pInfo.GetGetMethod().IsStatic) { return true; }
                if (pInfo.GetSetMethod().IsStatic) { return true; }
            }
            AttributeIgnoreAttribute[] ignoreAttributes = (AttributeIgnoreAttribute[])(Attribute.GetCustomAttributes(memberInfo, typeof(AttributeIgnoreAttribute)));
            if (ignoreAttributes != null && ignoreAttributes.Length > 0)
            {
                return ignoreAttributes[0].Ignore;
            }
            return false;
        }

        /// <summary>
        /// 根据实体类型，生成一个属性集。
        /// </summary>
        /// <param name="entityType"></param>
        /// <returns></returns>
        private TAttributeSet GetAttributeSet(Type entityType)
        {
            TAttributeSet attributeSet = new TAttributeSet();
            attributeSet.Name = entityType.Name;
            attributeSet.Description = entityType.Name;
            attributeSet.Active = true;
            attributeSet.AttributeSetId = this._theIdGenerator.GenerateAttributeSetId(attributeSet);
            return attributeSet;
        }

        /// <summary>
        /// 取得成员类型。
        /// </summary>
        /// <param name="memberInfo"></param>
        /// <returns></returns>
        private Type GetMemberType(MemberInfo memberInfo)
        {
            if (memberInfo is PropertyInfo)
            {
                return ((PropertyInfo)memberInfo).PropertyType;
            }
            else if (memberInfo is FieldInfo)
            {
                return ((FieldInfo)memberInfo).FieldType;
            }
            else
            {
                throw new ArgumentException();
            }
        }


        private class AttributeGroupDictionary : Dictionary<string, IList<TAttribute>>
        {
            public void Add(string groupName, TAttribute attribute)
            {
                if (!ContainsKey(groupName))
                {
                    Add(groupName, new List<TAttribute>());
                }
                this[groupName].Add(attribute);
            }
        }


    }
}
