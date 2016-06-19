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
using Microsoft.AspNet.Identity;

namespace Dddml.Wms.Services.Tests
{
    [TestFixture]
    public class InitDatabase
    {

        ISessionFactory _sessionFactory;

        IAudienceApplicationService _audienceApplicationService;

        IUserApplicationService _userApplicationService;

        IRoleApplicationService _roleApplicationService;

        PasswordHasher _passwordHasher = new PasswordHasher();

        [SetUp]
        public void SetUp()
        {
            ApplicationContext.Current = SpringApplicationContext.Instance;
            
            _sessionFactory = ApplicationContext.Current["NHibernateSessionFactory"] as ISessionFactory;

            _audienceApplicationService = ApplicationContext.Current["AudienceApplicationService"] as IAudienceApplicationService;
            
            _userApplicationService = ApplicationContext.Current["UserApplicationService"] as IUserApplicationService;

            _roleApplicationService = ApplicationContext.Current["RoleApplicationService"] as IRoleApplicationService;
        }

        [Test]
        public void Seed()
        {
            //Hbm2DdlFix();

            CreateSelfClient();

            var roles = new string[] { "Supervisor", "Manager" };

            CreateRoles(roles);

            var userIdAndPassword = CreateTestUser(roles);


        }

        private Tuple<string, string> CreateTestUser(string[] roles)
        {
            var userId = "test@dddml.org";
            var password = "123456Abc!";
            var passwordHash = _passwordHasher.HashPassword(password);

            var user = new CreateUser();
            user.UserId = user.UserName = userId;
            user.PasswordHash = passwordHash;

            foreach (var r in roles)
            {
                var c = new CreateUserRole();
                c.RoleId = r;
                user.UserRoles.Add(c);
            }

            _userApplicationService.When(user);

            return new Tuple<string, string>(userId, password);
        }

        private void CreateRoles(string[] roles)
        {
            foreach (var r in roles)
            {
                CreateRole role = new CreateRole();
                role.RoleId = r;
                _roleApplicationService.When(role);
            }
        }

        private void CreateSelfClient()
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
        public void Hbm2DdlFix()
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
