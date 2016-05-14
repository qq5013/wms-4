using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using Dddml.Wms.Support;
using Dddml.Wms.Domain;

namespace Dddml.Wms.Services.Tests
{
    public class AttributeSetBuilderTests
    {
        public static void TestAttributeSetBuilder()
        {
            var attributeSetBuilder = new AttributeSetBuilder<CreateAttributeSet, CreateAttribute, CreateAttributeValue, CreateAttributeUse>(new IdGenerator());
            
            
            IList<CreateAttribute> attrs;
            IList<CreateAttributeValue> attrVals;
            IList<CreateAttributeSet> attrSets;
            IList<CreateAttributeUse> attrUses;

            attributeSetBuilder.BuildAttributeSetsFromEntityType(typeof(AttributeSetInstanceTestClass1), out attrSets, out attrs, out attrVals, out attrUses);

            System.Console.WriteLine(attrSets);
            System.Console.WriteLine(attrs);
            System.Console.WriteLine(attrVals);
            System.Console.WriteLine(attrUses);

            attributeSetBuilder.BuildAttributeSetsFromEntityType(typeof(AttributeSetInstanceTestClass2), out attrSets, out attrs, out attrVals, out attrUses);

            System.Console.WriteLine(attrSets);
            System.Console.WriteLine(attrs);
            System.Console.WriteLine(attrVals);
            System.Console.WriteLine(attrUses);

            attributeSetBuilder.BuildAttributeSetsFromEntityType(typeof(AttributeSetInstanceTestClass3), out attrSets, out attrs, out attrVals, out attrUses);

            System.Console.WriteLine(attrSets);
            System.Console.WriteLine(attrs);
            System.Console.WriteLine(attrVals);
            System.Console.WriteLine(attrUses);

       }

        class IdGenerator : AttributeSetBuilder<CreateAttributeSet, CreateAttribute, CreateAttributeValue, CreateAttributeUse>.IdGenerator
        {

            static Regex IdRegex = new Regex("^[_A-Za-z][_A-Za-z0-9]*$");

            public string GenerateAttributeSetId(CreateAttributeSet attributeSet)
            {
                if (IdRegex.IsMatch(attributeSet.Name))
                {
                    return attributeSet.Name + System.DateTime.Now.Ticks;
                }
                return System.Guid.NewGuid().ToString();
            }

            public string GenerateAttributeId(CreateAttribute attribute)
            {
                return attribute.Name + System.DateTime.Now.Ticks;
            }
        }

        class AttributeSetInstanceTestClass3
        {
            [AttributeValueList(typeof(Color))]
            public string Color { get; set; }
        }

        static class Color
        {
            public const string Red = "R";
            public const string Green = "G";
            public const string Blue = "B";
        }

        class AttributeSetInstanceTestClass2
        {
            [AttributeValueList(typeof(ClothingSize))]
            public ClothingSize ClothingSize { get; set; }
        }


        enum ClothingSize : int
        {
            S = -1,
            M = 0,
            L = 1,
            XL = 2,
            XXL = 3,
            XXXL = 4,
            XXXXL = 5,
        }

        class AttributeSetInstanceTestClass1
        {

            [AttributeGroup("电子料")]
            [AttributeGroup("大宗料")]
            [Attribute(Description = "Date Code")]
            public virtual string DateCode { get; set; }

            [AttributeGroup("电子料")]
            [AttributeGroup("大宗料")]
            [Attribute(Description = "Vendor Code")]
            public virtual string VendorCode { get; set; }

            [AttributeGroup("电子料")]
            [Attribute(Description = "MC")]
            public virtual string MC { get; set; }

            [AttributeGroup("电子料")]
            [Attribute(Description = "MSD")]
            public virtual string MSD { get; set; }

            public virtual System.DateTime GuaranteeDate { get; set; }

        }

    }


    

}
