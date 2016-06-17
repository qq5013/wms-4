using Dddml.Wms.Domain;
using Dddml.Wms.Specialization;
using Dddml.Wms.Specialization.Spring;
using Dddml.Wms.Support;
using NHibernate;
using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.IO;
using System.Text.RegularExpressions;
using System.Configuration;

namespace Dddml.Wms.Services.Tests
{
    [TestFixture]
    public class InitDatabase
    {

        ISessionFactory _sessionFactory;

        IAudienceApplicationService _audienceApplicationService; 

        [SetUp]
        public void SetUp()
        {
            ApplicationContext.Current = SpringApplicationContext.Instance;
            
            _sessionFactory = ApplicationContext.Current["NHibernateSessionFactory"] as ISessionFactory;

            _audienceApplicationService = ApplicationContext.Current["AudienceApplicationService"] as IAudienceApplicationService;
        }

        [Test]
        public void Seed()
        {
            CreateAudience audience = new CreateAudience();
            audience.ClientId = ConfigurationManager.AppSettings["self.ClientId"];
            audience.Base64Secret = ConfigurationManager.AppSettings["self.Base64Secret"];
            audience.Name = ConfigurationManager.AppSettings["self.ClientName"];

            Assert.IsNotNull(audience.ClientId);
            Assert.IsNotNull(audience.Base64Secret);
            Assert.IsNotNull(audience.Name);

            var existed = _audienceApplicationService.Get(audience.ClientId);
            if (existed != null && (existed as IAudienceStateProperties).Version > 0)
            {
                //do nothing
            }
            else
            {
                _audienceApplicationService.When(audience);
            }

        }

        //[Test]
        //[Category("InitDatabase_999")]
        public void Fix()
        {
            string[] sqlFiles = new string[] 
            {
                @"..\..\sql\DropRViewNameConflictedTables.sql", 
                @"..\..\sql\CreateRViews.sql", 
                @"..\..\sql\AddStateIdForeignKeyConstraints.sql"
            };
            foreach (string file in sqlFiles)
            {
                using (StreamReader reader = new StreamReader(File.OpenRead(file)))
                {
                    string sql = reader.ReadToEnd();
                    using (ISession session = _sessionFactory.OpenSession())
                    {
                        ISQLQuery query = session.CreateSQLQuery(sql);
                        query.ExecuteUpdate();
                    }
                }
            }
        }

    }


}
