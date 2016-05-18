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
    public class AttributeSetInstanceServiceTests
    {
        private string _endpointUrl = "http://localhost:63078/api/"; //注意，最后的斜杠是必须的！

        private IAttributeApplicationServiceFactory _attributeApplicationServiceFactory;

        private IAttributeSetApplicationServiceFactory _attributeSetApplicationServiceFactory;


        [SetUp]
        public void SetUp()
        { 
            _attributeApplicationServiceFactory = new AttributeApplicationServiceProxyFactory(_endpointUrl);

            _attributeSetApplicationServiceFactory = new AttributeSetApplicationServiceProxyFactory(_endpointUrl);

            InitAttrbuteSet();
        }

        [Test]
        public void TestPutAttributeSetInstance()
        {

            var client = new HttpClient { BaseAddress = new Uri(_endpointUrl) };
            var attrSetInstId = Guid.NewGuid().ToString();

            var url = "AttributeSetInstances/{id}";
            url = url.Replace("{id}", attrSetInstId);

            var attrSetInst = new CreateAttributeSetInstanceDto();
            attrSetInst.AttributeSetId = IdGenerator._lastAttributeSetId;
            attrSetInst.SerialNumber = attrSetInstId;
            attrSetInst.Lot = DateTime.Today.ToString();

            dynamic jObject = JObject.FromObject(attrSetInst);
            jObject.Color = "R";

            var req = new HttpRequestMessage(HttpMethod.Put, url);
            req.Content = new ObjectContent(typeof(JObject), jObject, new JsonMediaTypeFormatter());
            var response = client.SendAsync(req).GetAwaiter().GetResult();

            Console.WriteLine(response.Content);
            Console.WriteLine(response.Headers);
            Console.WriteLine(response.StatusCode);
            Console.WriteLine(response.ReasonPhrase);

            dynamic resultObj = TestGetAttributeSetInstance(attrSetInstId);

            Assert.AreEqual("R", resultObj.Color);

            // 如果 AttributeSetInstance 是“可变的”，那么可以 Patch：
            TestMergePatchAttributeSetInstance(attrSetInstId);
            TestGetAttributeSetInstance(attrSetInstId);

        }

        private JObject TestGetAttributeSetInstance(string attrSetInstId)
        {
            var client = new HttpClient { BaseAddress = new Uri(_endpointUrl) };
            string idStr = attrSetInstId;

            var url = "AttributeSetInstances/{id}";
            url = url.Replace("{id}", idStr);

            var req = new HttpRequestMessage(HttpMethod.Get, url);
            var response = client.SendAsync(req).GetAwaiter().GetResult();

            var jObject = response.Content.ReadAsAsync<JObject>().GetAwaiter().GetResult();
            Console.WriteLine(jObject);
            Console.WriteLine(response.Headers);
            Console.WriteLine(response.StatusCode);
            Console.WriteLine(response.ReasonPhrase);

            return jObject;
        }

        private void TestMergePatchAttributeSetInstance(string attrSetInstId)
        {
            var client = new HttpClient { BaseAddress = new Uri(_endpointUrl) };
            //var attrSetInstId = Guid.NewGuid().ToString();

            var url = "AttributeSetInstances/{id}";
            url = url.Replace("{id}", attrSetInstId);

            var attrSetInst = new MergePatchAttributeSetInstanceDto();
            attrSetInst.AttributeSetId = IdGenerator._lastAttributeSetId;
            attrSetInst.SerialNumber = attrSetInstId;
            attrSetInst.Lot = DateTime.Today.ToString();
            attrSetInst.Version = 1;

            dynamic jObject = JObject.FromObject(attrSetInst);
            jObject.IsPropertyColorRemoved = true;

            var req = new HttpRequestMessage(new HttpMethod("PATCH"), url);
            req.Content = new ObjectContent(typeof(JObject), jObject, new JsonMediaTypeFormatter());
            var response = client.SendAsync(req).GetAwaiter().GetResult();

            Console.WriteLine(response.Content);
            Console.WriteLine(response.Headers);
            Console.WriteLine(response.StatusCode);
            Console.WriteLine(response.ReasonPhrase);

        }



        private void InitAttrbuteSet()
        {
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

            foreach (var a in attrs)
            {
                a.FieldName = "_F_C5_0_";//TODO 检查这个是字段是否已经被使用？
                _attributeApplicationServiceFactory.AttributeApplicationService.When((ICreateAttribute)a);
                
            }
            foreach (var attrSet in attrSets)
            {
                _attributeSetApplicationServiceFactory.AttributeSetApplicationService.When((ICreateAttributeSet)attrSet);
            }

        }

        class IdGenerator : AttributeSetBuilder<CreateAttributeSetDto, CreateAttributeDto, CreateAttributeValueDto, CreateAttributeUseDto>.IdGenerator
        {
            [ThreadStatic]
            internal static string _lastAttributeSetId;

            static Regex IdRegex = new Regex("^[_A-Za-z][_A-Za-z0-9]*$");

            public string GenerateAttributeSetId(CreateAttributeSetDto attributeSet)
            {
                string id = null;
                if (IdRegex.IsMatch(attributeSet.Name))
                {
                    id = attributeSet.Name + System.DateTime.Now.Ticks;
                }
                else
                {
                    id = System.Guid.NewGuid().ToString();
                }
                _lastAttributeSetId = id;
                return id;
            }

            public string GenerateAttributeId(CreateAttributeDto attribute)
            {
                return attribute.Name + System.DateTime.Now.Ticks;
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
