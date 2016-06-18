using Microsoft.Owin;
using Microsoft.Owin.Security;
using Microsoft.Owin.Security.OAuth;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Claims;
using System.Threading.Tasks;
using System.Web;
using Dddml.Wms.Domain;
using Dddml.Wms.Specialization;
using Dddml.Wms.Domain.Services;

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

            //Dummy check here, you need to do your DB checks against membership system http://bit.ly/SPAAuthCode
            if (context.UserName != context.Password)
            {
                context.SetError("invalid_grant", "The user name or password is incorrect");
                //return;
                return Task.FromResult<object>(null);
            }

            var identity = new ClaimsIdentity("JWT");

            identity.AddClaim(new Claim(ClaimTypes.Name, context.UserName));
            identity.AddClaim(new Claim("sub", context.UserName));

            var roles = IdentityService.GetUserAllRoleIdsAndPermissionIds(context.UserName);
            if (roles != null)
            {
                foreach (var role in roles)
                {
                    identity.AddClaim(new Claim(ClaimTypes.Role, role));
                }
            }
            //identity.AddClaim(new Claim(ClaimTypes.Role, "Supervisor"));
            //identity.AddClaim(new Claim(ClaimTypes.Role, "Manager"));

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
    }
}