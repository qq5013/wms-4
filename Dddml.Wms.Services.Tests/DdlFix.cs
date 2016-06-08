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

namespace Dddml.Wms.Services.Tests
{
    [TestFixture]
    public class DdlFix
    {

        ISessionFactory _sessionFactory;

        [SetUp]
        public void SetUp()
        {
            ApplicationContext.Current = SpringApplicationContext.Instance;
            _sessionFactory = ApplicationContext.Current["NHibernateSessionFactory"] as ISessionFactory;

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
