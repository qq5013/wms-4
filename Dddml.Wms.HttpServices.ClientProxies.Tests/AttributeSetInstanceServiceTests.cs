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
    public class AttributeSetInstanceServiceTests : ClientProxyTestsBase
    {

        public const string TestColorAttributeFieldName = "_F_C5_4_";

        private IAttributeApplicationServiceFactory _attributeApplicationServiceFactory;

        private IAttributeSetApplicationServiceFactory _attributeSetApplicationServiceFactory;

        private string _testColorAttributeSetId;

        [SetUp]
        public void SetUp()
        {
            base.SetUp();

            _attributeApplicationServiceFactory = new AttributeApplicationServiceProxyFactory();

            _attributeSetApplicationServiceFactory = new AttributeSetApplicationServiceProxyFactory();

            _testColorAttributeSetId = GetOrCreateTestColorAttributeSetId();
        }

        [Test]
        public void TestPutAttributeSetInstance()
        {
            var endpointUrl = ProxyTemplate.GetEndpointUrl();
            var client = new HttpClient { BaseAddress = new Uri(endpointUrl) };
            var attrSetInstId = Guid.NewGuid().ToString();

            var url = "AttributeSetInstances/{id}";
            url = url.Replace("{id}", attrSetInstId);

            dynamic jObject = GetTestColorAttributeSetInstance(attrSetInstId, _testColorAttributeSetId);

            var req = new HttpRequestMessage(HttpMethod.Put, url);
            req.Content = new ObjectContent(typeof(JObject), jObject, new JsonMediaTypeFormatter());
            SetAuthenticationHeader(req);
            var response = client.SendAsync(req).GetAwaiter().GetResult();

            Console.WriteLine(response.Content);
            Console.WriteLine(response.Headers);
            Console.WriteLine(response.StatusCode);
            Console.WriteLine(response.ReasonPhrase);

            dynamic resultObj = TestGetAttributeSetInstance(attrSetInstId);

            Assert.AreEqual("R", resultObj.Color.ToString());

            TestPostAttributeSetInstance(client, jObject, url);
            TestPostAttributeSetInstance(client, jObject, url);

            TestGetAttributeSetInstance(attrSetInstId);

            //// 如果 AttributeSetInstance 是“可变的”，那么可以 Patch：
            //TestMergePatchAttributeSetInstance(attrSetInstId);
            
        }

        private void TestPostAttributeSetInstance(HttpClient client, dynamic jObject, string url)
        {
            var req = new HttpRequestMessage(HttpMethod.Post, url);
            SetAuthenticationHeader(req); 
            req.Content = new ObjectContent(typeof(JObject), jObject, new JsonMediaTypeFormatter());
            var response = client.SendAsync(req).GetAwaiter().GetResult();

            var respContent = response.Content.ReadAsAsync<string>().GetAwaiter().GetResult();
            Assert.NotNull(respContent);
            Console.WriteLine(respContent);
            Console.WriteLine(response.Headers);
            Console.WriteLine(response.StatusCode);
            Console.WriteLine(response.ReasonPhrase);
        }

        private static dynamic GetTestColorAttributeSetInstance(string attrSetInstId, string attrSetId)
        {
            var attrSetInst = new CreateAttributeSetInstanceDto();
            attrSetInst.SerialNumber = attrSetId;
            attrSetInst.Lot = DateTime.Today.ToString();

            attrSetInst.AttributeSetId = attrSetId;

            dynamic jObject = JObject.FromObject(attrSetInst);
            jObject.Color = "R";
            return jObject;
        }

        private JObject TestGetAttributeSetInstance(string attrSetInstId)
        {
            var endpointUrl = ProxyTemplate.GetEndpointUrl();
            var client = new HttpClient { BaseAddress = new Uri(endpointUrl) };
            string idStr = attrSetInstId;

            var url = "AttributeSetInstances/{id}";
            url = url.Replace("{id}", idStr);

            var req = new HttpRequestMessage(HttpMethod.Get, url);
            SetAuthenticationHeader(req); 
            var response = client.SendAsync(req).GetAwaiter().GetResult();

            var respContent = response.Content.ReadAsAsync<JObject>().GetAwaiter().GetResult();
            Console.WriteLine(respContent);
            Console.WriteLine(response.Headers);
            Console.WriteLine(response.StatusCode);
            Console.WriteLine(response.ReasonPhrase);

            return respContent;
        }

        private void TestMergePatchAttributeSetInstance(string attrSetInstId)
        {
            var endpointUrl = ProxyTemplate.GetEndpointUrl();
            var client = new HttpClient { BaseAddress = new Uri(endpointUrl) };
            //var attrSetInstId = Guid.NewGuid().ToString();

            var url = "AttributeSetInstances/{id}";
            url = url.Replace("{id}", attrSetInstId);

            var attrSetInst = new MergePatchAttributeSetInstanceDto();
            attrSetInst.AttributeSetId = _testColorAttributeSetId;//IdGenerator._lastAttributeSetId;
            attrSetInst.SerialNumber = attrSetInstId;
            attrSetInst.Lot = DateTime.Today.ToString();
            attrSetInst.Version = 1;

            dynamic jObject = JObject.FromObject(attrSetInst);
            jObject.IsPropertyColorRemoved = true;

            var req = new HttpRequestMessage(new HttpMethod("PATCH"), url);
            SetAuthenticationHeader(req); 
            req.Content = new ObjectContent(typeof(JObject), jObject, new JsonMediaTypeFormatter());
            var response = client.SendAsync(req).GetAwaiter().GetResult();

            Console.WriteLine(response.Content);
            Console.WriteLine(response.Headers);
            Console.WriteLine(response.StatusCode);
            Console.WriteLine(response.ReasonPhrase);

        }



        private string GetOrCreateTestColorAttributeSetId()
        {
            var attrSetId = IdGenerator.TestColorAttributeSetId;
            var attrSet = _attributeSetApplicationServiceFactory.AttributeSetApplicationService.Get(attrSetId);
            if (attrSet == null || attrSet.IsUnsaved)
            {
                attrSetId = CreateTestColorAttributeSet();
            }
            return attrSetId;
        }


        private string CreateTestColorAttributeSet()
        {
            string attrSetId;
            var attributeSetBuilder = new AttributeSetBuilder<CreateAttributeSetDto, CreateAttributeDto, CreateAttributeValueDto, CreateAttributeUseDto>(new IdGenerator());


            IList<CreateAttributeDto> attrs;
            IList<CreateAttributeValueDto> attrVals;
            IList<CreateAttributeSetDto> attrSets;
            IList<CreateAttributeUseDto> attrUses;

            ////////////////////////////////////////////

            attributeSetBuilder.BuildAttributeSetsFromEntityType(typeof(AttributeSetInstanceTestClass3), out attrSets, out attrs, out attrVals, out attrUses);

            Assert.AreEqual(1, attrSets.Count); //System.Console.WriteLine(attrSets);
            Assert.AreEqual(1, attrs.Count); //System.Console.WriteLine(attrs);
            Assert.IsTrue(attrs[0].IsList);
            Assert.AreEqual((typeof(string)).Name, attrs[0].AttributeValueType);
            Assert.AreEqual(3, attrVals.Count); //System.Console.WriteLine(attrVals);
            System.Console.WriteLine(attrUses);

            var attr_0 = attrs[0];
            attr_0.FieldName = TestColorAttributeFieldName;
            var existed = _attributeApplicationServiceFactory.AttributeApplicationService.GetByProperty("FieldName", attr_0.FieldName);
            if (existed != null && existed.Count() > 0)
            {
                Console.WriteLine(existed.First());
                // 检查属性/属性集是否完全相同？
                // 现在只是抛出异常：
                throw new InvalidOperationException(String.Format("Existed Attribute. attr_0.FieldName = \"{0}\";", attr_0.FieldName));
            }
            else
            {
                _attributeApplicationServiceFactory.AttributeApplicationService.When((ICreateAttribute)attr_0);

                var attrSet_0 = attrSets[0];
                _attributeSetApplicationServiceFactory.AttributeSetApplicationService.When((ICreateAttributeSet)attrSet_0);

                attrSetId = attrSets[0].AttributeSetId;
            }
            return attrSetId;
        }

        class IdGenerator : AttributeSetBuilder<CreateAttributeSetDto, CreateAttributeDto, CreateAttributeValueDto, CreateAttributeUseDto>.IdGenerator
        {

            public const string TestColorAttributeSetId = "TestColorAttributeSetId8c0fXA8idM6GE";

            //[ThreadStatic]
            //internal static string _lastAttributeSetId;

            //static Regex IdRegex = new Regex("^[_A-Za-z][_A-Za-z0-9]*$");

            public string GenerateAttributeSetId(CreateAttributeSetDto attributeSet)
            {
                //string id = null;
                //if (IdRegex.IsMatch(attributeSet.Name))
                //{
                //    id = attributeSet.Name + System.DateTime.Now.Ticks;
                //}
                //else
                //{
                var id = TestColorAttributeSetId;//System.Guid.NewGuid().ToString();
                //}
                //_lastAttributeSetId = id;
                return id;
            }

            public string GenerateAttributeId(CreateAttributeDto attribute)
            {
                return System.Guid.NewGuid().ToString();//attribute.Name + System.DateTime.Now.Ticks;
            }
        }

        class AttributeSetInstanceTestClass3
        {
            [AttributeValueList(typeof(RgbColor))]
            public string Color { get; set; }
        }

        static class RgbColor
        {
            public const string Red = "R";
            public const string Green = "G";
            public const string Blue = "B";
        }


      
    }
}
