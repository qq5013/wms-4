using Dddml.Wms.Specialization;
using Dddml.Wms.Specialization.Spring;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Dddml.Wms.Domain;

namespace Dddml.Wms.Services.Tests
{
    class Program
    {

        private static void Setup()
        {
            ApplicationContext.Current = SpringApplicationContext.Instance;
        }

        static void Main(string[] args)
        {
            Setup();

            IAttributeSetInstanceApplicationService attributeSetInstanceApplicationService = ApplicationContext.Current["attributeSetInstanceApplicationService"] as IAttributeSetInstanceApplicationService;

            Console.WriteLine(attributeSetInstanceApplicationService.GetAll(0, int.MaxValue));

            Console.ReadKey();

        }
    }
}
