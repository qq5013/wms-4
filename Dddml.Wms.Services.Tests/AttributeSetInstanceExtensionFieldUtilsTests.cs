using Dddml.Wms.Domain;
using Dddml.Wms.Specialization;
using Dddml.Wms.Specialization.Spring;
using Dddml.Wms.Support;
using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Dddml.Wms.Services.Tests
{

    [TestFixture]
    public class AttributeSetInstanceExtensionFieldUtilsTests : TestsBase
    {

        IAttributeSetInstanceExtensionFieldGroupApplicationService attributeSetInstanceExtensionFieldGroupApplicationService;



        [SetUp]
        public void SetUp()
        {
            base.SetUp();

            attributeSetInstanceExtensionFieldGroupApplicationService = ApplicationContext.Current["attributeSetInstanceExtensionFieldGroupApplicationService"] as IAttributeSetInstanceExtensionFieldGroupApplicationService;
        }

        [Test]
        public void TestCreateAttributeSetInstanceExtensionFieldGroups()
        {
            var extensionFieldGroups = AttributeSetInstanceExtensionFieldUtils.CreateAttributeSetInstanceExtensionFieldGroups();

            foreach (var g in extensionFieldGroups)
            {
                attributeSetInstanceExtensionFieldGroupApplicationService.When(g);
            }

        }


    }
}
