using Dddml.Wms.Domain;
using Dddml.Wms.Specialization;
using Dddml.Wms.Specialization.HttpServices.ClientProxies;
using Dddml.Wms.Support;
using Newtonsoft.Json.Linq;
using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Configuration;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Net.Http.Formatting;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace Dddml.Wms.HttpServices.ClientProxies.Tests
{

    [TestFixture]
    public class ValuesTests : ClientProxyTestsBase
    {

        [SetUp]
        public void SetUp()
        {
            base.SetUp();
        }

        [Test]
        public void TestGetValue()
        {
            TestGetValue1();
        }

        private void TestGetValue1()
        {
            //var accessToken = GetJwtAccessToken("jyang", "jyang");
            //Console.WriteLine(accessToken);

            string endpointUrl = ProxyTemplate.GetEndpointUrl();

            var client = new HttpClient { BaseAddress = new Uri(endpointUrl) };
            string valId = "1";
            var url = "Values/{id}";
            url = url.Replace("{id}", valId);

            var req = new HttpRequestMessage(HttpMethod.Get, url);
            SetAuthenticationHeader(req);
            //req.Content = new ObjectContent(typeof(JObject), jObject, new JsonMediaTypeFormatter());
            var response = client.SendAsync(req).GetAwaiter().GetResult();
            Assert.AreEqual(HttpStatusCode.OK, response.StatusCode);

            Console.WriteLine(response.Content);
            Console.WriteLine(response.Headers);
            Console.WriteLine(response.StatusCode);
            Console.WriteLine(response.ReasonPhrase);
        }


       private static void PrintAsJObject(object value, string name)
        {
            JObject jObj = JObject.FromObject(value);
            Console.WriteLine("==================== Object [name = " + name + "] : ====================");
            Console.WriteLine(jObj.ToString());
            Console.WriteLine("==================== End Of Object [name = " + name + "] ====================");
        }



        // ///////////////////////////

        private string _GetAccessToken(string loginId, string password)
        {
            //var loginData = {
            //    grant_type: 'password',
            //    username: self.loginEmail(),
            //    password: self.loginPassword()
            //};

            //$.ajax({
            //    type: 'POST',
            //    url: '/Token',
            //    data: loginData
            //}).done(function (data) {
            //    self.user(data.userName);
            //    // Cache the access token in session storage.
            //    sessionStorage.setItem(tokenKey, data.access_token);
            //}).fail(showError);

            string endpointUrl = ProxyTemplate.GetEndpointUrl();
            var client = new HttpClient { BaseAddress = new Uri(endpointUrl) };
            var url = "Token";

            var postContent = new Dictionary<string, string>();
            postContent["grant_type"] = "password";
            postContent["username"] = loginId;
            postContent["password"] = password;

            var req = new HttpRequestMessage(HttpMethod.Post, url);
            req.Content = new FormUrlEncodedContent(postContent);
            var response = client.SendAsync(req).GetAwaiter().GetResult();
            Assert.AreEqual(HttpStatusCode.OK, response.StatusCode);

            dynamic result = response.Content.ReadAsAsync<JObject>(new MediaTypeFormatter[] { new JsonMediaTypeFormatter() }).GetAwaiter().GetResult();

            Console.WriteLine(result);
            Console.WriteLine(response.Headers);
            Console.WriteLine(response.StatusCode);
            Console.WriteLine(response.ReasonPhrase);
            
            return result.access_token;

        }
        

      
    }
}
