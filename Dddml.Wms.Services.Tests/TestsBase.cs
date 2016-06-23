using Dddml.Support.NHibernate;
using Dddml.Wms.Specialization;
using Dddml.Wms.Specialization.Spring;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Dddml.Wms.Services.Tests
{
    public abstract class TestsBase
    {
        protected IDictionary<string, string> RoutingConnectionProviderDictionary;

        protected string FirstConnectionRoutingKey;

        protected string GetCurrentConnectionString()
        {
            var connString = RoutingConnectionProviderDictionary[ContextualKeyRoutingConnectionProvider.CurrentRoutingKey];
            return connString;
        }

        public void SetUp()
        {
            ApplicationContext.Current = SpringApplicationContext.Instance;

            RoutingConnectionProviderDictionary = ApplicationContext.Current["RoutingConnectionProviderDictionary"] as IDictionary<string, string>;

            FirstConnectionRoutingKey = RoutingConnectionProviderDictionary.Keys.First();

            ContextualKeyRoutingConnectionProvider.CurrentRoutingKey = FirstConnectionRoutingKey;

        }

    }
}
