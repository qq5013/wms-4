using Dddml.Support.NHibernate;
using Dddml.Wms.Domain;
using Dddml.Wms.Specialization;
using Dddml.Wms.Specialization.Spring;
using Microsoft.AspNet.Identity;
using NHibernate;
using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Configuration;
using System.IO;
using System.Text;

namespace Dddml.Wms.Services.Tests
{
    [TestFixture]
    public class InitDatabase : TestsBase
    {

        ISessionFactory _sessionFactory;

        IAudienceApplicationService _audienceApplicationService;

        IUserApplicationService _userApplicationService;

        IRoleApplicationService _roleApplicationService;

        PasswordHasher _passwordHasher = new PasswordHasher();


        [SetUp]
        public void SetUp()
        {
            base.SetUp();

            _sessionFactory = ApplicationContext.Current["NHibernateSessionFactory"] as ISessionFactory;

            _audienceApplicationService = ApplicationContext.Current["AudienceApplicationService"] as IAudienceApplicationService;

            _userApplicationService = ApplicationContext.Current["UserApplicationService"] as IUserApplicationService;

            _roleApplicationService = ApplicationContext.Current["RoleApplicationService"] as IRoleApplicationService;

        }

        [Test]
        public void CreateDatabaseAndSeed()
        {
            foreach (var connRoutingKey in RoutingConnectionProviderDictionary.Keys)
            {
                ContextualKeyRoutingConnectionProvider.CurrentRoutingKey = connRoutingKey;

                var connString = GetCurrentConnectionString();

                DropCreateDatebase(connString);

                CreateSelfClient();

                var roles = new string[] { "Supervisor", "Manager" };

                CreateRoles(roles);

                var userIdAndPassword = CreateTestUser(roles);
            }
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

        private const string SqlDelimiter = ";";

        [Test]
        public void Hbm2DdlOutput()
        {
            ContextualKeyRoutingConnectionProvider.CurrentRoutingKey = FirstConnectionRoutingKey;

            var connString = GetCurrentConnectionString();
            var cfg = GetNHibernateConfiguration(connString);

            var schemaExport = new NHibernate.Tool.hbm2ddl.SchemaExport(cfg);

            schemaExport.SetOutputFile(@"..\..\sql\hbm2ddl_drop.sql").SetDelimiter(SqlDelimiter).Drop(true, false);
            schemaExport.SetOutputFile(@"..\..\sql\hbm2ddl_create.sql").SetDelimiter(SqlDelimiter).Create(true, false);

            var sb = new StringBuilder();
            var schemaUpdate = new NHibernate.Tool.hbm2ddl.SchemaUpdate(cfg);
            
            schemaUpdate.Execute(s => sb.Append(s).Append(SqlDelimiter), false);

            using (var writer = new StreamWriter(@"..\..\sql\hbm2ddl_update.sql"))
            {
                writer.Write(sb.ToString());
            }
        }


        //[Category("InitDatabase_999")]
        //[Test]
        private void DropCreateDatebase(string connString)
        {
            var cfg = GetNHibernateConfiguration(connString);

            string[] sqlFiles = new string[] 
            {
                @"..\..\sql\DropRViews.sql", 
                @"..\..\sql\DropStateIdForeignKeyConstraints.sql",
                @"..\..\sql\hbm2ddl_create_fix.sql",
                @"..\..\sql\DropRViewNameConflictedTables.sql", 
                @"..\..\sql\CreateRViews.sql", 
                @"..\..\sql\AddStateIdForeignKeyConstraints.sql",
            };

            var sf = cfg.BuildSessionFactory();
            foreach (string file in sqlFiles)
            {
                using (StreamReader reader = new StreamReader(File.OpenRead(file)))
                {
                    string sql = reader.ReadToEnd();

                    using (ISession session = sf.OpenSession())
                    {
                        ISQLQuery query = session.CreateSQLQuery(sql);
                        query.ExecuteUpdate();
                    }
                }
            }
        }

        private NHibernate.Cfg.Configuration GetNHibernateConfiguration(string connString)
        {
            //var conn = (_sessionFactory as NHibernate.Impl.SessionFactoryImpl).ConnectionProvider.GetConnection();
            if (!connString.ToLower().Contains("Allow User Variables=True".ToLower()))
            {
                connString = connString + (connString.EndsWith(";") ? "" : ";") + "Allow User Variables=True";
            }

            var dialect = (_sessionFactory as NHibernate.Impl.SessionFactoryImpl).Dialect;
            var cfg = new NHibernate.Cfg.Configuration();
            cfg.Properties.Add("dialect", dialect.GetType().FullName);
            cfg.Properties.Add("connection.connection_string", connString);
            cfg.AddAssembly("Dddml.Wms.Services");
            return cfg;
        }

    }


}
