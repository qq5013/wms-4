using System;
using System.Text;


namespace Dddml.Wms.Support
{

    /// <summary>
    /// 用于标注物料属性的Attribute。
    /// </summary>
    [AttributeUsage(AttributeTargets.Field | AttributeTargets.Property, AllowMultiple = false, Inherited = true)]
    public class AttributeAttribute : Attribute
    {
        private string attributeValueType;

        public string AttributeValueType
        {
            get { return attributeValueType; }
            set { attributeValueType = value; }
        }

        private string description;

        public string Description
        {
            get { return description; }
            set { description = value; }
        }

        private bool isActive = true;

        public bool IsActive
        {
            get { return isActive; }
            set { isActive = value; }
        }

        private bool isInstanceAttribute = true;

        public bool IsInstanceAttribute
        {
            get { return isInstanceAttribute; }
            set { isInstanceAttribute = value; }
        }


        public AttributeAttribute()
        { }


    }
}
