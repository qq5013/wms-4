using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Linq.Expressions;
using System.Security.Claims;
using System.Threading.Tasks;
using Microsoft.AspNet.Identity;
using Dddml.Wms.Domain;
using Dddml.Wms.Specialization;

namespace Dddml.Wms.AspNet.Identity
{

    public class UserStore: 
        //IUserLoginStore<IdentityUser>, 
        IUserClaimStore<IdentityUser>, 
        IUserRoleStore<IdentityUser>, 
        IUserPasswordStore<IdentityUser>, 
        IUserSecurityStampStore<IdentityUser>, 
        IUserStore<IdentityUser>, 
        IUserLockoutStore<IdentityUser, string>, 
        IUserEmailStore<IdentityUser>, 
        IUserPhoneNumberStore<IdentityUser>, 
        IUserTwoFactorStore<IdentityUser, string>
    {

        IUserApplicationService UserApplicationService
        {
            get
            {
                return ApplicationContext.Current["UserApplicationService"] as IUserApplicationService;
            }
        }

        public virtual Task<IdentityUser> FindByIdAsync(string userId)
        {
            var state = UserApplicationService.Get(userId);
            return Task.FromResult(state == null ? null : new IdentityUser((UserState)state));
        }

        public virtual Task<IdentityUser> FindByNameAsync(string userName)
        {
            var state = UserApplicationService.GetByProperty("UserName", userName, null, 0, 1).FirstOrDefault();
            return Task.FromResult(state == null ? null : new IdentityUser((UserState)state));
        }

        public virtual Task CreateAsync(IdentityUser user)
        {
            if ((object)user == null)
            {
                throw new ArgumentNullException("user");
            }
            UserApplicationService.When(user.State.ToCreateUser());
            return Task.FromResult(0);
        }

        public virtual Task DeleteAsync(IdentityUser user)
        {
            if ((object)user == null)
            {
                throw new ArgumentNullException("user");
            }
            UserApplicationService.When(user.State.ToDeleteUser());
            return Task.FromResult(0);
        }

        public virtual Task UpdateAsync(IdentityUser user)
        {
            if ((object)user == null)
            {
                throw new ArgumentNullException("user");
            }
            UserApplicationService.When(user.State.ToMergePatchUser());
            return Task.FromResult(0);
        }

        //public virtual Task<IdentityUser> FindAsync(UserLoginInfo login)
        //{
        //    if (login == null)
        //    {
        //        throw new ArgumentNullException("login");
        //    }
        //    var query = from u in this.Context.Query<IdentityUser>()
        //                from l in u.Logins
        //                where l.LoginProvider == login.LoginProvider && l.ProviderKey == login.ProviderKey
        //                select u;
        //    return Task.FromResult(query.SingleOrDefault());
        //}

        //public virtual Task AddLoginAsync(IdentityUser user, UserLoginInfo login)
        //{
        //    this.ThrowIfDisposed();
        //    if ((object)user == null)
        //    {
        //        throw new ArgumentNullException("user");
        //    }
        //    if (login == null)
        //    {
        //        throw new ArgumentNullException("login");
        //    }
        //    user.Logins.Add(new IdentityUserLogin()
        //    {
        //        ProviderKey = login.ProviderKey,
        //        LoginProvider = login.LoginProvider
        //    });
        //    this.Context.SaveOrUpdate(user);
        //    return Task.FromResult<int>(0);
        //}

        //public virtual Task RemoveLoginAsync(IdentityUser user, UserLoginInfo login)
        //{
        //    this.ThrowIfDisposed();
        //    if ((object)user == null)
        //    {
        //        throw new ArgumentNullException("user");
        //    }
        //    if (login == null)
        //    {
        //        throw new ArgumentNullException("login");
        //    }
        //    var info = user.Logins.SingleOrDefault(x => x.LoginProvider == login.LoginProvider && x.ProviderKey == login.ProviderKey);
        //    if (info != null)
        //    {
        //        user.Logins.Remove(info);
        //        this.Context.Update(user);
        //    }
        //    return Task.FromResult<int>(0);
        //}

        //public virtual Task<IList<UserLoginInfo>> GetLoginsAsync(IdentityUser user)
        //{
        //    this.ThrowIfDisposed();
        //    if ((object)user == null)
        //    {
        //        throw new ArgumentNullException("user");
        //    }
        //    IList<UserLoginInfo> result = new List<UserLoginInfo>();
        //    foreach (IdentityUserLogin identityUserLogin in (IEnumerable<IdentityUserLogin>)user.Logins)
        //    {
        //        result.Add(new UserLoginInfo(identityUserLogin.LoginProvider, identityUserLogin.ProviderKey));
        //    }
        //    return Task.FromResult<IList<UserLoginInfo>>(result);
        //}

        public virtual Task<IList<Claim>> GetClaimsAsync(IdentityUser user)
        {
            if ((object)user == null)
            {
                throw new ArgumentNullException("user");
            }

            IList<Claim> result = new List<Claim>();
            foreach (var identityUserClaim in user.State.UserClaims)
            {
                result.Add(new Claim(identityUserClaim.ClaimType, identityUserClaim.ClaimValue));
            }

            return Task.FromResult<IList<Claim>>(result);
        }

        public virtual Task AddClaimAsync(IdentityUser user, Claim claim)
        {
            if ((object)user == null)
            {
                throw new ArgumentNullException("user");
            }
            if (claim == null)
            {
                throw new ArgumentNullException("claim");
            }

            var claimId = user.State.UserClaims.Count();
            user.State.UserClaims.AddToSave(new UserClaimState()
            {
                UserClaimId = new UserClaimId(user.UserId, claimId),
                ClaimType = claim.Type,
                ClaimValue = claim.Value
            });

            return Task.FromResult<int>(0);
        }

        public virtual Task RemoveClaimAsync(IdentityUser user, Claim claim)
        {
            if ((object)user == null)
            {
                throw new ArgumentNullException("user");
            }
            if (claim == null)
            {
                throw new ArgumentNullException("claim");
            }

            foreach (var identityUserClaim in Enumerable.ToList<IUserClaimState>(Enumerable.Where<IUserClaimState>(user.State.UserClaims, (Func<IUserClaimState, bool>)(uc =>
            {
                if (uc.ClaimValue == claim.Value)
                {
                    return uc.ClaimType == claim.Type;
                }
                else
                {
                    return false;
                }
            }))))
            {
                user.State.UserClaims.Remove(identityUserClaim);
            }

            return Task.FromResult<int>(0);
        }

        public virtual Task AddToRoleAsync(IdentityUser user, string role)
        {
            if ((object)user == null)
            {
                throw new ArgumentNullException("user");
            }
            if (string.IsNullOrWhiteSpace(role))
            {
                throw new ArgumentNullException("role");
            }

            var userRole = (UserRoleState)user.State.UserRoles.Get(role);
            if (userRole == null) { userRole = new UserRoleState(); }
            userRole.UserRoleId = new UserRoleId(user.UserId, role);
            user.State.UserRoles.AddToSave(userRole);

            return Task.FromResult<int>(0);
        }

        public virtual Task RemoveFromRoleAsync(IdentityUser user, string role)
        {
            if ((object)user == null)
            {
                throw new ArgumentNullException("user");
            }
            if (string.IsNullOrWhiteSpace(role))
            {
                throw new ArgumentNullException("role");
            }

            var userRole = (UserRoleState)user.State.UserRoles.Get(role);
            if (userRole != null) {
                user.State.UserRoles.Remove(userRole);
            }

            return Task.FromResult<int>(0);
        }

        public virtual Task<IList<string>> GetRolesAsync(IdentityUser user)
        {
            if ((object)user == null)
            {
                throw new ArgumentNullException("user");
            }

            var roles = (IList<string>)Enumerable.ToList<string>(
                Enumerable.Select<IUserRoleState, string>((IEnumerable<IUserRoleState>)user.State.UserRoles, (Func<IUserRoleState, string>)(u => u.RoleId)));
            return Task.FromResult<IList<string>>(roles);
        }

        public virtual Task<bool> IsInRoleAsync(IdentityUser user, string role)
        {
            if ((object)user == null)
            {
                throw new ArgumentNullException("user");
            }
            if (string.IsNullOrWhiteSpace(role))
            {
                throw new ArgumentNullException("role");
            }
            else
            {
                return Task.FromResult<bool>(
                    Enumerable.Any<IUserRoleState>(
                    (IEnumerable<IUserRoleState>)user.State.UserRoles, (Func<IUserRoleState, bool>)(r => r.RoleId.ToUpper() == role.ToUpper())));
            }
        }

        public virtual Task SetPasswordHashAsync(IdentityUser user, string passwordHash)
        {
            if ((object)user == null)
            {
                throw new ArgumentNullException("user");
            }
            user.PasswordHash = passwordHash;
            return Task.FromResult<int>(0);
        }

        public virtual Task<string> GetPasswordHashAsync(IdentityUser user)
        {
            if ((object)user == null)
            {
                throw new ArgumentNullException("user");
            }
            else
            {
                return Task.FromResult<string>(user.PasswordHash);
            }
        }

        public virtual Task SetSecurityStampAsync(IdentityUser user, string stamp)
        {
            if ((object)user == null)
            {
                throw new ArgumentNullException("user");
            }
            user.SecurityStamp = stamp;
            return Task.FromResult<int>(0);
        }

        public virtual Task<string> GetSecurityStampAsync(IdentityUser user)
        {
            if ((object)user == null)
            {
                throw new ArgumentNullException("user");
            }
            else
            {
                return Task.FromResult<string>(user.SecurityStamp);
            }
        }

        public virtual Task<bool> HasPasswordAsync(IdentityUser user)
        {
            return Task.FromResult<bool>(user.PasswordHash != null);
        }

        //public IQueryable<IdentityUser> Users
        //{
        //    get
        //    {
        //        this.ThrowIfDisposed();
        //        return this.Context.Query<IdentityUser>();
        //    }
        //}

        public Task<int> GetAccessFailedCountAsync(IdentityUser user)
        {
            if (user == null)
            {
                throw new ArgumentNullException("user");
            }
            return Task.FromResult<int>(user.AccessFailedCount);
        }

        public virtual Task<bool> GetLockoutEnabledAsync(IdentityUser user)
        {
            if (user == null)
            {
                throw new ArgumentNullException("user");
            }
            return Task.FromResult<bool>(user.LockoutEnabled);
        }

        public virtual Task<DateTimeOffset> GetLockoutEndDateAsync(IdentityUser user)
        {
            DateTimeOffset dateTimeOffset;
            if (user == null)
            {
                throw new ArgumentNullException("user");
            }
            if (user.LockoutEndDateUtc.HasValue)
            {
                DateTime? lockoutEndDateUtc = user.LockoutEndDateUtc;
                dateTimeOffset = new DateTimeOffset(DateTime.SpecifyKind(lockoutEndDateUtc.Value, DateTimeKind.Utc));
            }
            else
            {
                dateTimeOffset = new DateTimeOffset();
            }
            return Task.FromResult<DateTimeOffset>(dateTimeOffset);
        }

        public virtual Task<int> IncrementAccessFailedCountAsync(IdentityUser user)
        {
            if (user == null)
            {
                throw new ArgumentNullException("user");
            }
            user.AccessFailedCount = user.AccessFailedCount + 1;
            return Task.FromResult<int>(user.AccessFailedCount);
        }

        public virtual Task ResetAccessFailedCountAsync(IdentityUser user)
        {
            if (user == null)
            {
                throw new ArgumentNullException("user");
            }
            user.AccessFailedCount = 0;
            return Task.FromResult<int>(0);
        }

        public virtual Task SetLockoutEnabledAsync(IdentityUser user, bool enabled)
        {
            if (user == null)
            {
                throw new ArgumentNullException("user");
            }
            user.LockoutEnabled = enabled;
            return Task.FromResult<int>(0);
        }

        public virtual Task SetLockoutEndDateAsync(IdentityUser user, DateTimeOffset lockoutEnd)
        {
            DateTime? nullable;
            if (user == null)
            {
                throw new ArgumentNullException("user");
            }
            if (lockoutEnd == DateTimeOffset.MinValue)
            {
                nullable = null;
            }
            else
            {
                nullable = new DateTime?(lockoutEnd.UtcDateTime);
            }
            user.LockoutEndDateUtc = nullable;
            return Task.FromResult<int>(0);
        }

        public virtual Task<IdentityUser> FindByEmailAsync(string email)
        {
            var state = UserApplicationService.GetByProperty("Email", email, null, 0, 1).FirstOrDefault();
            return Task.FromResult(state == null ? null : new IdentityUser((UserState)state));
        }

        public virtual Task<string> GetEmailAsync(IdentityUser user)
        {
            if (user == null)
            {
                throw new ArgumentNullException("user");
            }
            return Task.FromResult<string>(user.Email);
        }

        public virtual Task<bool> GetEmailConfirmedAsync(IdentityUser user)
        {
            if (user == null)
            {
                throw new ArgumentNullException("user");
            }
            return Task.FromResult<bool>(user.EmailConfirmed);
        }

        public virtual Task SetEmailAsync(IdentityUser user, string email)
        {
            if (user == null)
            {
                throw new ArgumentNullException("user");
            }
            user.Email = email;
            return Task.FromResult<int>(0);
        }

        public virtual Task SetEmailConfirmedAsync(IdentityUser user, bool confirmed)
        {
            if (user == null)
            {
                throw new ArgumentNullException("user");
            }
            user.EmailConfirmed = confirmed;
            return Task.FromResult<int>(0);
        }

        public virtual Task<string> GetPhoneNumberAsync(IdentityUser user)
        {
            if (user == null)
            {
                throw new ArgumentNullException("user");
            }
            return Task.FromResult<string>(user.PhoneNumber);
        }

        public virtual Task<bool> GetPhoneNumberConfirmedAsync(IdentityUser user)
        {
            if (user == null)
            {
                throw new ArgumentNullException("user");
            }
            return Task.FromResult<bool>(user.PhoneNumberConfirmed);
        }

        public virtual Task SetPhoneNumberAsync(IdentityUser user, string phoneNumber)
        {
            if (user == null)
            {
                throw new ArgumentNullException("user");
            }
            user.PhoneNumber = phoneNumber;
            return Task.FromResult<int>(0);
        }

        public virtual Task SetPhoneNumberConfirmedAsync(IdentityUser user, bool confirmed)
        {
            if (user == null)
            {
                throw new ArgumentNullException("user");
            }
            user.PhoneNumberConfirmed = confirmed;
            return Task.FromResult<int>(0);
        }

        public virtual Task<bool> GetTwoFactorEnabledAsync(IdentityUser user)
        {
            if (user == null)
            {
                throw new ArgumentNullException("user");
            }
            return Task.FromResult<bool>(user.TwoFactorEnabled);
        }

        public virtual Task SetTwoFactorEnabledAsync(IdentityUser user, bool enabled)
        {
            if (user == null)
            {
                throw new ArgumentNullException("user");
            }
            user.TwoFactorEnabled = enabled;
            return Task.FromResult<int>(0);
        }


        public void Dispose()
        {
            this.Dispose(true);
            GC.SuppressFinalize((object)this);
        }

        protected virtual void Dispose(bool disposing)
        {
            //this._disposed = true;
        }

    }
}
