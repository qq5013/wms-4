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

        protected string AnyConnectionRoutingKey 
        {
            get
            {
                return RoutingConnectionProviderDictionary.Keys.First();
            }
        }

        private static Random _random = new Random();

        protected string RandomConnectionRoutingKey
        {
            get
            {
                var keys = RoutingConnectionProviderDictionary.Keys.ToList();
                var idx = _random.Next(keys.Count);
                return keys[idx];
            }
        }

        protected void ContextualKeyRoutingConnectionProviderNextRandomRoutingKey()
        {
            ContextualKeyRoutingConnectionProvider.CurrentRoutingKey = RandomConnectionRoutingKey;
            System.Console.WriteLine("============= ContextualKeyRoutingConnectionProvider.CurrentRoutingKey ============");
            System.Console.WriteLine(String.Format("CurrentRoutingKey: {0}", ContextualKeyRoutingConnectionProvider.CurrentRoutingKey));
        }

        protected string GetCurrentConnectionString()
        {
            var connString = RoutingConnectionProviderDictionary[ContextualKeyRoutingConnectionProvider.CurrentRoutingKey];
            return connString;
        }

        public void SetUp()
        {
            ApplicationContext.Current = SpringApplicationContext.Instance;

            RoutingConnectionProviderDictionary = ApplicationContext.Current["RoutingConnectionProviderDictionary"] as IDictionary<string, string>;

            ContextualKeyRoutingConnectionProviderNextRandomRoutingKey();
        }


    }
}
