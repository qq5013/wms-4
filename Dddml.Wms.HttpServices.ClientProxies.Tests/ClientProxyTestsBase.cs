using Dddml.Wms.Specialization;
using Dddml.Wms.Specialization.HttpServices.ClientProxies;
using System;
using System.Collections.Generic;
using System.Configuration;
using System.Linq;
using System.Net.Http;
using System.Text;
using System.Threading.Tasks;

namespace Dddml.Wms.HttpServices.ClientProxies.Tests
{
    public abstract class ClientProxyTestsBase
    {

        protected ProxyTemplate ProxyTemplate
        {
            get { return TestApplicationContext["HttpClientProxyTemplate"] as ProxyTemplate; }
        }

        public TestApplicationContext TestApplicationContext
        {
            get { return ApplicationContext.Current as TestApplicationContext; }
        }

        public void SetUp()
        {
            ApplicationContext.Current = new TestApplicationContext();

            var oauthToken = ConfigurationManager.AppSettings["test.OAuthBearerToken"];
            if (oauthToken != null)
            {
                TestApplicationContext.OAuthBearerToken = oauthToken;
            }
            else
            {
                var loginIdAndPassword = TestApplicationContext.RegisterTestUser();

                var accessToken = TestApplicationContext.GetOAuthBearerToken(loginIdAndPassword.Item1, loginIdAndPassword.Item2);
                //上面这行代码已经在上下文中设置 Access token
                //TestApplicationContext.OAuthBearerToken = accessToken;
            }
        }

        protected void SetAuthenticationHeader(HttpRequestMessage req)
        {
            var authHeader = ProxyTemplate.GetAuthenticationHeaderValue();
            req.Headers.Authorization = new System.Net.Http.Headers.AuthenticationHeaderValue(authHeader.Item1, authHeader.Item2);
        }

    }
}
