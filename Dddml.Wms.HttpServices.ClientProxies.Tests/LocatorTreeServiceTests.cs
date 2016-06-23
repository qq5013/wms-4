using Dddml.Wms.Domain;
using Dddml.Wms.Support;
using Newtonsoft.Json.Linq;
using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http;
using System.Net.Http.Formatting;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace Dddml.Wms.HttpServices.ClientProxies.Tests
{

    [TestFixture]
    public class LocatorTreeServiceTests : ClientProxyTestsBase
    {

        private ILocatorTreeApplicationServiceFactory _locatorTreeApplicationServiceFactory;

        [SetUp]
        public void SetUp()
        {
            base.SetUp();
            _locatorTreeApplicationServiceFactory = new LocatorTreeApplicationServiceProxyFactory();
        }

        [Test]
        public void TestGetAttributeSetInstance()
        {
            var treeService = _locatorTreeApplicationServiceFactory.LocatorTreeApplicationService;
            var ids = treeService.GetRootIds((IEnumerable<KeyValuePair<string, object>>)null);
            foreach (var id in ids)
            {
                var states = treeService.GetChildren(id, (IEnumerable<KeyValuePair<string, object>>)null);
                foreach (var s in states)
                {
                    PrintAsJObject(s, "Locator");
                }
                Console.WriteLine(id);
            }
            
        }

        private static void PrintAsJObject(object value, string name)
        {
            JObject jObj = JObject.FromObject(value);
            Console.WriteLine("==================== Object [name = " + name + "] : ====================");
            Console.WriteLine(jObj.ToString());
            Console.WriteLine("==================== End Of Object [name = " + name + "] ====================");
        }


      
    }
}
