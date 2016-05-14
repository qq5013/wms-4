using System;
using System.Text;

namespace Dddml.Wms.Support
{

    [AttributeUsage(AttributeTargets.Field | AttributeTargets.Property, AllowMultiple = true, Inherited = true)]
    public class AttributeGroupAttribute : Attribute
    {
        private string groupName;

        public string GroupName
        {
            get { return groupName; }
            set { groupName = value; }
        }


        public AttributeGroupAttribute(string groupName)
        {
            this.groupName = groupName;
        }


    }
}
