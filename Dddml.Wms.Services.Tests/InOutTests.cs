using Dddml.Wms.Domain;
using Dddml.Wms.Specialization;
using Dddml.Wms.Specialization.Spring;
using Dddml.Wms.Support;
using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Text.RegularExpressions;
using NodaMoney;

namespace Dddml.Wms.Services.Tests
{
    [TestFixture]
    public class InOutTests
    {

        IInOutApplicationService inOutApplicationService;

        [SetUp]
        public void SetUp()
        {
            ApplicationContext.Current = SpringApplicationContext.Instance;
            inOutApplicationService = ApplicationContext.Current["inOutApplicationService"] as IInOutApplicationService;

        }

        [Test]
        public void TestCreateAndVoidInout()
        {
            var documentNumber = Guid.NewGuid().ToString();

            CreateInOut inOut = new CreateInOut();
            inOut.DocumentNumber = documentNumber;
            inOut.CommandId = Guid.NewGuid().ToString();
            inOut.DocumentAction = new DocumentAction(DocumentActionName.Draft);// 不能这样写：inOut.DocumentStatus = DocumentStatus.Drafted
            inOut.ChargeAmount = new Money(10000, "CNY");
            inOut.FreightAmount = new Money(400, "CNY");
            inOutApplicationService.When(inOut);

            MergePatchInOut patchInOut = new MergePatchInOut();
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


    }


}
