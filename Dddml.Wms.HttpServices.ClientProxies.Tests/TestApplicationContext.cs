using Dddml.Wms.Specialization;
using Dddml.Wms.Specialization.HttpServices.ClientProxies;
using Newtonsoft.Json.Linq;
using System;
using System.Collections.Generic;
using System.Configuration;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Net.Http.Formatting;
using System.Text;
using System.Threading.Tasks;

namespace Dddml.Wms.HttpServices.ClientProxies.Tests
{
    public class TestApplicationContext : ApplicationContext
    {
        private string _authzServerEndpointUrl = "http://localhost:58760/";

        private string _endpointUrl = "http://localhost:63078/api/"; //注意，最后的斜杠是必须的！

        private string _oAuthBearerToken;

        public string OAuthBearerToken 
        {
            get { return _oAuthBearerToken; }
            set { _oAuthBearerToken = value; }
        }

        public string AuthzServerEndpointUrl
        {
            get { return _authzServerEndpointUrl; }
        }

        public override object this[string name]
        {
            get
            {
                if (name.Equals("HttpClientProxyTemplate", StringComparison.InvariantCultureIgnoreCase))
                {
                    var proxyTemplate = new ProxyTemplate(() => _endpointUrl);
                    proxyTemplate.GetAuthenticationHeaderValue = () => (new Tuple<string, string>("Bearer", OAuthBearerToken));
                    return proxyTemplate;
                }
                throw new NotImplementedException();
            }
        }


        public string GetOAuthBearerToken(string loginId, string password)
        {
            var client = new HttpClient { BaseAddress = new Uri(AuthzServerEndpointUrl) };
            var url = "oauth2/token";

            string client_id = ConfigurationManager.AppSettings["self.ClientId"];
            if (String.IsNullOrWhiteSpace(client_id))
            { 
                throw new ArgumentNullException("AppSettings[\"self.ClientId\"]"); 
            }

            var postContent = new Dictionary<string, string>();

            postContent["grant_type"] = "password";
            postContent["username"] = loginId;
            postContent["password"] = password;
            postContent["client_id"] = client_id;

            var req = new HttpRequestMessage(HttpMethod.Post, url);
            req.Content = new FormUrlEncodedContent(postContent);
            var response = client.SendAsync(req).GetAwaiter().GetResult();
            if (!HttpStatusCode.OK.Equals(response.StatusCode))
            {
                throw new InvalidOperationException("!HttpStatusCode.OK.Equals(response.StatusCode)"); 
            }

            dynamic result = response.Content.ReadAsAsync<JObject>(new MediaTypeFormatter[] { new JsonMediaTypeFormatter() }).GetAwaiter().GetResult();

            Console.WriteLine(result);
            Console.WriteLine(response.Headers);
            Console.WriteLine(response.StatusCode);
            Console.WriteLine(response.ReasonPhrase);

            this._oAuthBearerToken = (string)result.access_token;
            return this._oAuthBearerToken;
        }


        public Tuple<string, string> RegisterTestUser()
        {
            //var data = {
            //    Email: self.registerEmail(),
            //    Password: self.registerPassword(),
            //    ConfirmPassword: self.registerPassword2()
            //};

            //$.ajax({
            //    type: 'POST',
            //    url: '/api/Account/Register',
            //    contentType: 'application/json; charset=utf-8',
            //    data: JSON.stringify(data)
            //}).done(function (data) {
            //    self.result("Done!");
            //}).fail(showError);

            string endpointUrl = _endpointUrl;

            var client = new HttpClient { BaseAddress = new Uri(endpointUrl) };
            var url = "Account/Register";

            var email = Guid.NewGuid().ToString() + "@tests.net";
            var password = "Password1!";
            dynamic jObject = new JObject();
            jObject.Email = email;
            jObject.Password = password;
            jObject.ConfirmPassword = password;

            var req = new HttpRequestMessage(HttpMethod.Post, url);
            req.Content = new ObjectContent(typeof(JObject), jObject, new JsonMediaTypeFormatter());
            var response = client.SendAsync(req).GetAwaiter().GetResult();
            //Assert.AreEqual(HttpStatusCode.OK, response.StatusCode);
            if (!HttpStatusCode.OK.Equals(response.StatusCode))
            {
                throw new InvalidOperationException("!HttpStatusCode.OK.Equals(response.StatusCode)");
            }

            Console.WriteLine(response.Content);
            Console.WriteLine(response.Headers);
            Console.WriteLine(response.StatusCode);
            Console.WriteLine(response.ReasonPhrase);

            return new Tuple<string, string>(email, password);
        }

    }
}
