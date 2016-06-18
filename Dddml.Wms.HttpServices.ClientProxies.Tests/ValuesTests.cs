using Dddml.Wms.Domain;
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
    public class ValuesTests
    {
        private string _endpointUrl = "http://localhost:63078/"; //注意，最后的斜杠是必须的！

        private string _authzServerEndpointUrl = "http://localhost:58760/";

        [SetUp]
        public void SetUp()
        {
        }

        [Test]
        public void TestGetValue()
        {
            
            //var userNameAndPassword = RegisterTestUser();
            //var accessToken = GetJwtAccessToken(userNameAndPassword.Item1, userNameAndPassword.Item2);

            var accessToken = GetJwtAccessToken("jyang", "jyang");
            Console.WriteLine(accessToken);

            var client = new HttpClient { BaseAddress = new Uri(_endpointUrl) };
            string valId = "1";
            var url = "api/Values/{id}";
            url = url.Replace("{id}", valId);

            var req = new HttpRequestMessage(HttpMethod.Get, url);
            //Authorization: Bearer 
            req.Headers.Authorization = new System.Net.Http.Headers.AuthenticationHeaderValue("Bearer", accessToken);
            //req.Content = new ObjectContent(typeof(JObject), jObject, new JsonMediaTypeFormatter());
            var response = client.SendAsync(req).GetAwaiter().GetResult();
            Assert.AreEqual(HttpStatusCode.OK, response.StatusCode);

            Console.WriteLine(response.Content);
            Console.WriteLine(response.Headers);
            Console.WriteLine(response.StatusCode);
            Console.WriteLine(response.ReasonPhrase);
        }

        private Tuple<string, string> RegisterTestUser()
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
        
            var client = new HttpClient { BaseAddress = new Uri(_endpointUrl) };
            var url = "api/Account/Register";

            var email = Guid.NewGuid().ToString() + "@tests.net";
            var password = "Password1!";
            dynamic jObject = new JObject();
            jObject.Email = email;
            jObject.Password = password;
            jObject.ConfirmPassword = password;

            var req = new HttpRequestMessage(HttpMethod.Post, url);
            req.Content = new ObjectContent(typeof(JObject), jObject, new JsonMediaTypeFormatter());
            var response = client.SendAsync(req).GetAwaiter().GetResult();
            Assert.AreEqual(HttpStatusCode.OK, response.StatusCode);

            Console.WriteLine(response.Content);
            Console.WriteLine(response.Headers);
            Console.WriteLine(response.StatusCode);
            Console.WriteLine(response.ReasonPhrase);

            return new Tuple<string, string>(email, password);
        }


        private string GetJwtAccessToken(string loginId, string password)
        {

            var client = new HttpClient { BaseAddress = new Uri(_authzServerEndpointUrl) };
            var url = "oauth2/token";

            string client_id = ConfigurationManager.AppSettings["self.ClientId"];
            Assert.IsNotNull(client_id);

            var postContent = new Dictionary<string, string>();
            
            postContent["grant_type"] = "password";
            postContent["username"] = loginId;
            postContent["password"] = password;
            postContent["client_id"] = client_id;

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


            var client = new HttpClient { BaseAddress = new Uri(_endpointUrl) };
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
        

        private static void PrintAsJObject(object value, string name)
        {
            JObject jObj = JObject.FromObject(value);
            Console.WriteLine("==================== Object [name = " + name + "] : ====================");
            Console.WriteLine(jObj.ToString());
            Console.WriteLine("==================== End Of Object [name = " + name + "] ====================");
        }


      
    }
}
