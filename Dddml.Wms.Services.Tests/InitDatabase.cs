using Dddml.Support.NHibernate;
using Dddml.Wms.Domain;
using Dddml.Wms.Specialization;
using Dddml.Wms.Specialization.Spring;
using Dddml.Wms.Support;
using Microsoft.AspNet.Identity;
using NHibernate;
using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Configuration;
using System.IO;
using System.Linq;
using System.Text;

namespace Dddml.Wms.Services.Tests
{
    [TestFixture]
    public class InitDatabase : TestsBase
    {

        public static string TestUserId
        {
            get
            {
                return "test@dddml.org";
            }
        }

        public static string TestUserPassword
        {
            get
            {
                return "123456Abc!";
            }
        }

        public static Tuple<string, string, string> GetRoleWarehouseOperator()
        {
            var roleWarehouseOperator = new Tuple<string, string, string>("WarehouseOperator", "库存作业人员", "可以进行出入库操作的人员");
            return roleWarehouseOperator;
        }

        public static Tuple<string, string, string> GetRoleWarehouseManager()
        {
            var roleWarehouseManager = new Tuple<string, string, string>("WarehouseManager", "仓库主管", "可以对仓库业务进行管理的角色");
            return roleWarehouseManager;
        }

        public static Tuple<string, string, string> GetRoleSystemAdministrator()
        {
            var roleSysAdmin = new Tuple<string, string, string>("SystemAdministrator", "系统管理员", "可以进行基础数据维护和用户管理的角色");
            return roleSysAdmin;
        }

        // ////////////////////////////////////////////////

        ISessionFactory _sessionFactory;

        IAudienceApplicationService _audienceApplicationService;

        IUserApplicationService _userApplicationService;

        IRoleApplicationService _roleApplicationService;

        IPermissionApplicationService _permissionApplicationService;

        IRolePermissionApplicationService _rolePermissionApplicationService;

        PasswordHasher _passwordHasher = new PasswordHasher();


        [SetUp]
        public void SetUp()
        {
            base.SetUp();

            _sessionFactory = ApplicationContext.Current["NHibernateSessionFactory"] as ISessionFactory;

            _audienceApplicationService = ApplicationContext.Current["AudienceApplicationService"] as IAudienceApplicationService;

            _userApplicationService = ApplicationContext.Current["UserApplicationService"] as IUserApplicationService;

            _roleApplicationService = ApplicationContext.Current["RoleApplicationService"] as IRoleApplicationService;

            _permissionApplicationService = ApplicationContext.Current["PermissionApplicationService"] as IPermissionApplicationService;

            _rolePermissionApplicationService = ApplicationContext.Current["RolePermissionApplicationService"] as IRolePermissionApplicationService;

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

                var roles = CreateRoles();

                var userIdAndPassword = CreateTestUser(roles);

                CreatePermissions();
            }
        }

        /// <summary>
        /// Create a user for test.
        /// </summary>
        /// <param name="roles">Role Ids.</param>
        /// <returns>User Id and password.</returns>
        private Tuple<string, string> CreateTestUser(ICollection<string> roles)
        {
            var userId = TestUserId;
            var password = TestUserPassword;
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

        /// <summary>
        /// Return Created Role Ids.
        /// </summary>
        /// <returns>Role Ids.</returns>
        private ICollection<string> CreateRoles()
        {
            var roleSysAdmin = GetRoleSystemAdministrator();
            var roleWarehouseManager = GetRoleWarehouseManager();
            var roleWarehouseOperator = GetRoleWarehouseOperator();
            var roles = new Tuple<string, string, string>[] { roleSysAdmin, roleWarehouseManager, roleWarehouseOperator };

            CreateRoles(roles);

            CreateRolePermissions(roleSysAdmin.Item1, PermissionUtils.Permissions.SystemManagement);

            CreateRolePermissions(roleWarehouseManager.Item1, PermissionUtils.Permissions.MaterailInOutManagement);
            CreateRolePermissions(roleWarehouseManager.Item1, PermissionUtils.Permissions.InventoryManagement);
            CreateRolePermissions(roleWarehouseManager.Item1, PermissionUtils.Permissions.ViewsAndReports);

            CreateRolePermissions(roleWarehouseOperator.Item1, PermissionUtils.Permissions.MaterailInOutManagement);

            return roles.Select(r => r.Item1).ToList();
        }


        private void CreateRolePermissions(string roleId, PermissionUtils.Permission p)
        {
            var cs = PermissionUtils.GrantPermissionsToRole(roleId, p);
            foreach (var c in cs)
            {
                _rolePermissionApplicationService.When(c);
            }
        }

        private void CreateRoles(ICollection<Tuple<string, string, string>> roles)
        {
            foreach (var r in roles)
            {
                CreateRole role = new CreateRole();
                role.RoleId = r.Item1;
                role.Name = r.Item2;
                role.Description = r.Item3;
                _roleApplicationService.When(role);
                
            }
        }

        private void CreatePermissions()
        {
            foreach (var p in PermissionUtils.GetRootPermissions())
            {
                CreatePermission(p);
            }
        }

        private void CreatePermission(PermissionUtils.Permission p)
        {
            var c = p.ToCreatePermission();
            _permissionApplicationService.When(c);
            if (p.ChildPermissions != null)
            {
                foreach (var childP in p.ChildPermissions)
                {
                    CreatePermission(childP);
                }
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
            ContextualKeyRoutingConnectionProvider.CurrentRoutingKey = AnyConnectionRoutingKey;

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
