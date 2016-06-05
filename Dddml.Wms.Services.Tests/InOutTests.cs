using Dddml.Wms.Domain;
using Dddml.Wms.Specialization;
using Dddml.Wms.Specialization.Spring;
using Dddml.Wms.Support;
using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Text.RegularExpressions;

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
            CreateInOut inOut = new CreateInOut();
            var documentNumber = Guid.NewGuid().ToString();
            inOut.DocumentNumber = documentNumber;
            inOut.CommandId = Guid.NewGuid().ToString();
            inOut.DocumentStatus = DocumentAction.Draft;//todo 属性的命令和属性的状态不应该是一回事。且属性的命令的名称应该可以自己定义。

            inOutApplicationService.When(inOut);

            MergePatchInOut patchInOut = new MergePatchInOut();
            patchInOut.DocumentNumber = documentNumber;
            patchInOut.DocumentStatus = DocumentAction.Void;//todo 未来这里应该设置属性的命令（名称应该可以自己定义），而不是设置属性的状态。
            patchInOut.Version = 1;
            patchInOut.CommandId = Guid.NewGuid().ToString();

            inOutApplicationService.When(patchInOut);

            var inOutResult = inOutApplicationService.Get(inOut.DocumentNumber);
            Console.WriteLine(inOutResult.DocumentNumber);
            Assert.AreEqual(DocumentStatus.Voided, inOutResult.DocumentStatus);
        }


    }


}
