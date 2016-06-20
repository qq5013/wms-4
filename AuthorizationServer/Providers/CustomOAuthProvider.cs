using Dddml.Wms.Domain;
using Dddml.Wms.Domain.Services;
using Dddml.Wms.Specialization;
using Microsoft.AspNet.Identity;
using Microsoft.Owin;
using Microsoft.Owin.Security;
using Microsoft.Owin.Security.OAuth;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Claims;
using System.Threading.Tasks;
using System.Web;

namespace Dddml.Wms.AuthorizationServer.Providers
{
    public class CustomOAuthProvider : OAuthAuthorizationServerProvider
    {

        IAudienceApplicationService AudienceApplicationService
        {
            get
            {
                return ApplicationContext.Current["AudienceApplicationService"] as IAudienceApplicationService;
            }
        }

        IIdentityService IdentityService
        {
            get
            {
                return ApplicationContext.Current["IdentityService"] as IIdentityService;
            }
        }

        IUserApplicationService UserApplicationService
        {
            get 
            {
                return ApplicationContext.Current["UserApplicationService"] as IUserApplicationService;
            }
        }

        PasswordHasher PasswordHasher = new PasswordHasher();

        public override Task ValidateClientAuthentication(OAuthValidateClientAuthenticationContext context)
        {
            string clientId = string.Empty;
            string clientSecret = string.Empty;
            string symmetricKeyAsBase64 = string.Empty;

            if (!context.TryGetBasicCredentials(out clientId, out clientSecret))
            {
                context.TryGetFormCredentials(out clientId, out clientSecret);
            }

            if (context.ClientId == null)
            {
                context.SetError("invalid_clientId", "client_Id is not set");
                return Task.FromResult<object>(null);
            }

            var audience = AudienceApplicationService.Get(context.ClientId);//AudiencesStore.FindAudience(context.ClientId);

            if (audience == null)
            {
                context.SetError("invalid_clientId", string.Format("Invalid client_id '{0}'", context.ClientId));
                return Task.FromResult<object>(null);
            }
            
            context.Validated();
            return Task.FromResult<object>(null);
        }

        public override Task GrantResourceOwnerCredentials(OAuthGrantResourceOwnerCredentialsContext context)
        {
            context.OwinContext.Response.Headers.Add("Access-Control-Allow-Origin", new[] { "*" });

            var userName = context.UserName;
            var password = context.Password;

            // //////////////////////////////////////////////////
            //注意：这里使用 UserName 作为登录 Id
            // //////////////////////////////////////////////////
            IUserState user;
            if (!CheckPassword(userName, password, out user))
            {
                context.SetError("invalid_grant", "The user name or password is incorrect");
                return Task.FromResult<object>(null);
            }

            var userId = user.UserId;
            var identity = new ClaimsIdentity("JWT");
            identity.AddClaim(new Claim(ClaimTypes.Name, userId));
            identity.AddClaim(new Claim("sub", userId));

            var roles = IdentityService.GetUserRoleIds(userId);
            if (roles != null)
            {
                foreach (var role in roles)
                {
                    identity.AddClaim(new Claim(ClaimTypes.Role, role));
                }
            }

            var props = new AuthenticationProperties(new Dictionary<string, string>
                {
                    {
                         "audience", (context.ClientId == null) ? string.Empty : context.ClientId
                    }
                });

            var ticket = new AuthenticationTicket(identity, props);
            context.Validated(ticket);
            return Task.FromResult<object>(null);
        }

        private bool CheckPassword(string userName, string password, out IUserState user)
        {
            user = UserApplicationService.GetByProperty("UserName", userName, null, 0, 1).FirstOrDefault();
            bool isOk = true;
            if (user == null || PasswordHasher.VerifyHashedPassword(user.PasswordHash, password) == PasswordVerificationResult.Failed)
            {
                isOk = false;
            }
            return isOk;
        }

    }
}