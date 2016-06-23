using System;
using System.Collections.Generic;
using System.Linq;
using Microsoft.AspNet.Identity;
using Microsoft.Owin;
using Microsoft.Owin.Security.Cookies;
using Microsoft.Owin.Security.Google;
using Microsoft.Owin.Security.OAuth;
using Owin;
using Dddml.Wms.AuthorizationServer.Providers;
using Dddml.Wms.AuthorizationServer.Models;
using Dddml.Wms.AuthorizationServer.Formats;

namespace Dddml.Wms.AuthorizationServer
{
    public partial class Startup
    {

        public static OAuthAuthorizationServerOptions OAuthOptions { get; private set; }

        public static string PublicClientId { get; private set; }

        // 有关配置身份验证的详细信息，请访问 http://go.microsoft.com/fwlink/?LinkId=301864
        public void ConfigureAuth(IAppBuilder app)
        {
            // 将数据库上下文和用户管理器配置为对每个请求使用单个实例
            //app.CreatePerOwinContext(ApplicationDbContext.Create);
            //app.CreatePerOwinContext<ApplicationUserManager>(ApplicationUserManager.Create);

            //// 使应用程序可以使用 Cookie 来存储已登录用户的信息
            //// 并使用 Cookie 来临时存储有关使用第三方登录提供程序登录的用户的信息
            //app.UseCookieAuthentication(new CookieAuthenticationOptions());
            //app.UseExternalSignInCookie(DefaultAuthenticationTypes.ExternalCookie);


            //// 针对基于 OAuth 的流配置应用程序
            //PublicClientId = "self";
            //OAuthOptions = new OAuthAuthorizationServerOptions
            //{
            //    TokenEndpointPath = new PathString("/Token"),
            //    Provider = new ApplicationOAuthProvider(PublicClientId),
            //    AuthorizeEndpointPath = new PathString("/api/Account/ExternalLogin"),
            //    AccessTokenExpireTimeSpan = TimeSpan.FromDays(14),
            //    //在生产模式下设 AllowInsecureHttp = false
            //    AllowInsecureHttp = true
            //};

            //// 使应用程序可以使用不记名令牌来验证用户身份
            //app.UseOAuthBearerTokens(OAuthOptions);

            // /////////////////////////////////////////////////////////////////////
            
            OAuthAuthorizationServerOptions OAuthServerOptions = new OAuthAuthorizationServerOptions()
            {
                //For Dev enviroment only (on production should be AllowInsecureHttp = false)
                AllowInsecureHttp = true,
                TokenEndpointPath = new PathString("/oauth2/token"),
                AccessTokenExpireTimeSpan = TimeSpan.FromMinutes(30),
                Provider = new CustomOAuthProvider(),
                AccessTokenFormat = new CustomJwtFormat("http://jwtauthzsrv.wms.dddml.org"),
            };

            // OAuth 2.0 Bearer Access Token Generation
            app.UseOAuthAuthorizationServer(OAuthServerOptions);

            app.UseCors(Microsoft.Owin.Cors.CorsOptions.AllowAll);

            // /////////////////////////////////////////////////////////////////////

            // 取消注释以下行可允许使用第三方登录提供程序登录
            //app.UseMicrosoftAccountAuthentication(
            //    clientId: "",
            //    clientSecret: "");

            //app.UseTwitterAuthentication(
            //    consumerKey: "",
            //    consumerSecret: "");

            //app.UseFacebookAuthentication(
            //    appId: "",
            //    appSecret: "");

            //app.UseGoogleAuthentication(new GoogleOAuth2AuthenticationOptions()
            //{
            //    ClientId = "",
            //    ClientSecret = ""
            //});
        }
    }
}
