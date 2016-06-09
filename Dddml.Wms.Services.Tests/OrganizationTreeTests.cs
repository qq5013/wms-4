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
    public class OrganizationTreeTests
    {

        IOrganizationTreeRepository organizationTreeRepository;

        IOrganizationApplicationService organizationApplicationService;

        IOrganizationStructureApplicationService organizationStructureApplicationService;

        IOrganizationStructureTypeApplicationService organizationStructureTypeApplicationService;

        [SetUp]
        public void SetUp()
        {
            ApplicationContext.Current = SpringApplicationContext.Instance;
            organizationTreeRepository = ApplicationContext.Current["organizationTreeRepository"] as IOrganizationTreeRepository;
            organizationApplicationService = ApplicationContext.Current["organizationApplicationService"] as IOrganizationApplicationService;
            organizationStructureApplicationService = ApplicationContext.Current["organizationStructureApplicationService"] as IOrganizationStructureApplicationService;
            organizationStructureTypeApplicationService = ApplicationContext.Current["organizationStructureTypeApplicationService"] as IOrganizationStructureTypeApplicationService;

        }

        [Test]
        public void TestAddOrganizations()
        {
            var orgStructureTypeId = Guid.NewGuid().ToString();
            var orgStructureType = new CreateOrganizationStructureType();
            orgStructureType.Id = orgStructureTypeId;
            organizationStructureTypeApplicationService.When(orgStructureType);

            var organization1 = new CreateOrganization();
            organization1.OrganizationId = Guid.NewGuid().ToString();
            organization1.Name = "Org_test_1" + organization1.OrganizationId;
            organizationApplicationService.When(organization1);

            var organization2 = new CreateOrganization();
            organization2.OrganizationId = Guid.NewGuid().ToString();
            organization2.Name = "Org_test_2" + organization2.OrganizationId;
            organizationApplicationService.When(organization2);

            var orgStructure_0_1 = new CreateOrganizationStructure();
            var orgStructure_0_1_Id = new OrganizationStructureId(orgStructureTypeId, "", organization1.OrganizationId);
            orgStructure_0_1.Id = orgStructure_0_1_Id;
            organizationStructureApplicationService.When(orgStructure_0_1);

            var orgStructure_1_2 = new CreateOrganizationStructure();
            var orgStructure_1_2_Id = new OrganizationStructureId(orgStructureTypeId, organization1.OrganizationId, organization2.OrganizationId);
            orgStructure_1_2.Id = orgStructure_1_2_Id;
            organizationStructureApplicationService.When(orgStructure_1_2);

            var roots = organizationTreeRepository.GetRoots((IEnumerable<KeyValuePair<string, object>>)null, null).ToList();
            Assert.GreaterOrEqual(roots.Count, 1);
            Console.WriteLine(roots[0].Content.OrganizationId);
            if (roots != null && roots.Count > 0)
            {
                Assert.GreaterOrEqual(roots[0].Children.Count(), 1);
                foreach (var c in roots[0].Children)
                {
                    Console.WriteLine(c.Content.OrganizationId);
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
