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
    public class LocatorTreeServiceTests
    {
        private string _endpointUrl = "http://localhost:63078/api/"; //注意，最后的斜杠是必须的！

        private ILocatorTreeApplicationServiceFactory _locatorTreeApplicationServiceFactory;

        [SetUp]
        public void SetUp()
        {
            _locatorTreeApplicationServiceFactory = new LocatorTreeApplicationServiceProxyFactory(_endpointUrl);
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

        private void _test_test_test()
        {
            var client = new HttpClient { BaseAddress = new Uri(_endpointUrl) };
            
            var url = "LocatorTrees";

            var req = new HttpRequestMessage(HttpMethod.Get, url);
            var response = client.SendAsync(req).GetAwaiter().GetResult();

            var respContent = response.Content.ReadAsAsync<JObject>().GetAwaiter().GetResult();
            Console.WriteLine(respContent);
            Console.WriteLine(response.Headers);
            Console.WriteLine(response.StatusCode);
            Console.WriteLine(response.ReasonPhrase);

        }



      
    }
}
