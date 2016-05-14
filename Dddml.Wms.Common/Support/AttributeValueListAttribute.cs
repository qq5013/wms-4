using System;
using System.Text;

namespace Dddml.Wms.Support
{
    [AttributeUsage(AttributeTargets.Field | AttributeTargets.Property, AllowMultiple = true, Inherited = true)]
    public class AttributeValueListAttribute : Attribute
    {
        private string listTypeName;

        public string ListTypeName
        {
            get { return listTypeName; }
            set { listTypeName = value; }
        }

        private Type listType;

        public Type ListType
        {
            get { return listType; }
            set { listType = value; }
        }

        private string namePattern = ".*";

        public string NamePattern
        {
            get { return namePattern; }
            set { namePattern = value; }
        }

        public AttributeValueListAttribute(Type listType)
        {
            this.listTypeName = listType.FullName;
            this.listType = listType;
        }

        public AttributeValueListAttribute(string listType)
        {
            this.listTypeName = listType;
            Type t = Type.GetType(listType, false);
            this.listType = t;
        }


    }
}
