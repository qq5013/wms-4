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
using NodaMoney;
using Newtonsoft.Json.Serialization;
using Newtonsoft.Json;
using Dddml.Wms.Specialization;

namespace Dddml.Wms.HttpServices.ClientProxies.Tests
{

    [TestFixture]
    public class InOutServiceTests : ClientProxyTestsBase
    {
        //private string _endpointUrl = "http://localhost:63078/api/"; //注意，最后的斜杠是必须的！

        private IInOutApplicationServiceFactory _inOutApplicationServiceFactory;

        [SetUp]
        public void SetUp()
        {
            base.SetUp();

            _inOutApplicationServiceFactory = new InOutApplicationServiceProxyFactory();

            //JsonConvert.DefaultSettings = () => new JsonSerializerSettings()
            //{
            //    ContractResolver = new CustomContractResolver()
            //};
        }

        //private class CustomContractResolver : DefaultContractResolver
        //{
        //    private static readonly Type _moneyType = typeof(NodaMoney.Money);

        //    private static readonly JsonConverter _moneyJsonConverter = new NodaMoney.Serialization.JsonNet.MoneyJsonConverter();

        //    protected override JsonConverter ResolveContractConverter(Type objectType)
        //    {
        //        if (objectType != null && _moneyType.IsAssignableFrom(objectType))
        //        {
        //            return _moneyJsonConverter;
        //        }
        //        return base.ResolveContractConverter(objectType);
        //    }
        //}

        [Test]
        public void TestCreateAndVoidInout()
        {
            var documentNumber = Guid.NewGuid().ToString();
            var inOutApplicationService = _inOutApplicationServiceFactory.InOutApplicationService;

            var inOut = _inOutApplicationServiceFactory.NewCreateInOut();
            inOut.DocumentNumber = documentNumber;
            inOut.CommandId = Guid.NewGuid().ToString();
            inOut.DocumentAction = new DocumentAction(DocumentActionName.Draft);// 不能这样写：inOut.DocumentStatus = DocumentStatus.Drafted
            inOut.ChargeAmount = new Money(10000, "CNY");
            inOut.FreightAmount = new Money(400, "CNY");
            inOutApplicationService.When(inOut);

            PrintAsJObject(inOut, "InOut");

            var patchInOut =  _inOutApplicationServiceFactory.NewMergePatchInOut();
            patchInOut.DocumentNumber = documentNumber;
            patchInOut.DocumentAction = new DocumentAction(DocumentActionName.Void);//不能这样写：patchInOut.DocumentStatus = DocumentStatus.Voided
            patchInOut.Version = 1;
            patchInOut.CommandId = Guid.NewGuid().ToString();

            inOutApplicationService.When(patchInOut);

            var inOutResult = inOutApplicationService.Get(inOut.DocumentNumber);
            //Console.WriteLine(inOutResult.DocumentNumber);
            Assert.AreEqual(DocumentStatus.Voided, inOutResult.DocumentStatus);
            Console.WriteLine(inOutResult.FreightAmount);
            Assert.AreEqual(inOut.FreightAmount, inOutResult.FreightAmount);
            Console.WriteLine(inOutResult.ChargeAmount);
            Assert.AreEqual(inOut.ChargeAmount, inOutResult.ChargeAmount);

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
