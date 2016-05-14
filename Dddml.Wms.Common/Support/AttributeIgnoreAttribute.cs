using System;
using System.Text;

namespace Dddml.Wms.Support
{
    /// <summary>
    /// 用于标注“忽略”的Attribute。
    /// </summary>
    [AttributeUsage(AttributeTargets.Field | AttributeTargets.Property, AllowMultiple = false, Inherited = true)]
    public class AttributeIgnoreAttribute : Attribute
    {
        private bool ignore = true;

        public bool Ignore
        {
            get { return ignore; }
            set { ignore = value; }
        }

        public AttributeIgnoreAttribute()
        { }


    }
}
