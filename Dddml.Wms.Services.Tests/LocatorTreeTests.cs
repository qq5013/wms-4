using Dddml.Wms.Domain;
using Dddml.Wms.Specialization;
using Dddml.Wms.Specialization.Spring;
using Dddml.Wms.Support;
using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace Dddml.Wms.Services.Tests
{
    [TestFixture]
    public class LocatorTreeTests : TestsBase
    {

        ILocatorTreeRepository locatorTreeRepository;

        ILocatorApplicationService locatorApplicationService;

        [SetUp]
        public void SetUp()
        {
            base.SetUp();

            locatorTreeRepository = ApplicationContext.Current["locatorTreeRepository"] as ILocatorTreeRepository;
            locatorApplicationService = ApplicationContext.Current["locatorApplicationService"] as ILocatorApplicationService;

        }

        [Test]
        public void TestAddLocators()
        {
            var locator1 = new CreateLocator();
            locator1.LocatorId = Guid.NewGuid().ToString();
            locator1.X = "1";
            locator1.WarehouseId = "1";
            locatorApplicationService.When(locator1);

            var locator2 = new CreateLocator();
            locator2.LocatorId = Guid.NewGuid().ToString();
            locator2.ParentLocatorId = locator1.LocatorId;
            locator2.X = locator1.X;
            locator2.Y = "2";
            locator2.WarehouseId = "1";
            locatorApplicationService.When(locator2);

            var roots = locatorTreeRepository.GetRoots((IEnumerable<KeyValuePair<string, object>>)null, null).ToList();
            Assert.GreaterOrEqual(roots.Count, 1);
            Console.WriteLine(roots[0].Content.LocatorId);
            if (roots != null && roots.Count > 0)
            {
                Assert.GreaterOrEqual(roots[0].Children.Count(), 1);
                foreach (var c in roots[0].Children)
                {
                    Console.WriteLine(c.Content.LocatorId);
                }
            }
        }


        //private static void PrintAsJObject(object value, string name)
        //{
        //    JObject jObj = JObject.FromObject(value);
        //    Console.WriteLine("==================== Object [name = " + name + "] : ====================");
        //    Console.WriteLine(jObj.ToString());
        //    Console.WriteLine("==================== End Of Object [name = " + name + "] ====================");
        //}
    }


}
