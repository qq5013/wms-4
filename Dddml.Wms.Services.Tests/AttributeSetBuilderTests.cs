using Dddml.Wms.Domain;
using Dddml.Wms.Specialization;
using Dddml.Wms.Specialization.Spring;
using Dddml.Wms.Support;
using NUnit.Framework;
using System.Collections.Generic;
using System.Text.RegularExpressions;

namespace Dddml.Wms.Services.Tests
{
    [TestFixture]
    public class AttributeSetBuilderTests : TestsBase
    {

        IAttributeSetApplicationService attributeSetApplicationService;

        IAttributeApplicationService attributeApplicationService;
        

        [SetUp]
        public void SetUp()
        {
            base.SetUp();

            attributeSetApplicationService = ApplicationContext.Current["attributeSetApplicationService"] as IAttributeSetApplicationService;
            attributeApplicationService = ApplicationContext.Current["attributeApplicationService"] as IAttributeApplicationService;

        }

        [Test]
        public void TestAttributeSetBuilder()
        {
            var attributeSetBuilder = new AttributeSetBuilder<CreateAttributeSet, CreateAttribute, CreateAttributeValue, CreateAttributeUse>(new IdGenerator());


            IList<CreateAttribute> attrs;
            IList<CreateAttributeValue> attrVals;
            IList<CreateAttributeSet> attrSets;
            IList<CreateAttributeUse> attrUses;

            ////////////////////////////////////////////

            attributeSetBuilder.BuildAttributeSetsFromEntityType(typeof(AttributeSetInstanceTestClass1), out attrSets, out attrs, out attrVals, out attrUses);

            Assert.AreEqual(3, attrSets.Count);//System.Console.WriteLine(attrSets);
            System.Console.WriteLine(attrs);
            System.Console.WriteLine(attrVals);
            System.Console.WriteLine(attrUses);

            foreach (var a in attrs)
            {
                attributeApplicationService.When(a);
            }
            foreach (var attrSet in attrSets)
            {
                attributeSetApplicationService.When(attrSet);
            }

            ////////////////////////////////////////////

            attributeSetBuilder.BuildAttributeSetsFromEntityType(typeof(AttributeSetInstanceTestClass2), out attrSets, out attrs, out attrVals, out attrUses);

            Assert.AreEqual(1, attrSets.Count);//System.Console.WriteLine(attrSets);
            System.Console.WriteLine(attrs);
            Assert.AreEqual(1, attrs.Count);
            Assert.IsTrue(attrs[0].IsList); 
            Assert.AreEqual((typeof(int)).Name, attrs[0].AttributeValueType);
            System.Console.WriteLine(attrVals);
            System.Console.WriteLine(attrUses);

            foreach (var a in attrs)
            {
                attributeApplicationService.When(a);
            }
            foreach (var attrSet in attrSets)
            {
                attributeSetApplicationService.When(attrSet);
            }

            ////////////////////////////////////////////

            attributeSetBuilder.BuildAttributeSetsFromEntityType(typeof(AttributeSetInstanceTestClass3), out attrSets, out attrs, out attrVals, out attrUses);

            Assert.AreEqual(1, attrSets.Count); //System.Console.WriteLine(attrSets);
            Assert.AreEqual(1, attrs.Count); //System.Console.WriteLine(attrs);
            Assert.IsTrue(attrs[0].IsList);
            Assert.AreEqual((typeof(string)).Name, attrs[0].AttributeValueType);
            Assert.AreEqual(3, attrVals.Count); //System.Console.WriteLine(attrVals);
            System.Console.WriteLine(attrUses);

            foreach (var a in attrs)
            {
                attributeApplicationService.When(a);
            }
            foreach (var attrSet in attrSets)
            {
                attributeSetApplicationService.When(attrSet);
            }

            ////////////////////////////////////////////

            attributeSetBuilder.BuildAttributeSetsFromEntityType(typeof(AttributeSetInstanceTestClass4), out attrSets, out attrs, out attrVals, out attrUses);

            Assert.AreEqual(1, attrSets.Count); //System.Console.WriteLine(attrSets);
            Assert.AreEqual(1, attrs.Count); //System.Console.WriteLine(attrs);
            Assert.IsTrue(attrs[0].IsList);
            Assert.AreEqual((typeof(int)).Name, attrs[0].AttributeValueType);
            Assert.AreEqual(7, attrVals.Count); //System.Console.WriteLine(attrVals);

            foreach (var a in attrs)
            {
                attributeApplicationService.When(a);
            }
            foreach (var attrSet in attrSets)
            {
                attributeSetApplicationService.When(attrSet);
            }

            ////////////////////////////////////////////

            System.Console.WriteLine(attributeSetApplicationService.GetAll(0, int.MaxValue));

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


        class AttributeSetInstanceTestClass4
        {
            public WhatDay WhatDay { get; set; }
        }

        enum WhatDay
        {
            Monday, 
            Tuesday, 
            Wednesday, 
            Thursday, 
            Friday, 
            Saturday, 
            Sunday 
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
