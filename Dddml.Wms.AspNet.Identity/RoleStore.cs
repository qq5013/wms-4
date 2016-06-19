using System;
using System.Linq;
using System.Linq.Expressions;
using System.Threading.Tasks;
using Microsoft.AspNet.Identity;
using Dddml.Wms.Domain;
using Dddml.Wms.Specialization;

namespace Dddml.Wms.AspNet.Identity
{
    public class RoleStore : IRoleStore<IdentityRole>, IDisposable
    {
        IRoleApplicationService RoleApplicationService
        {
            get 
            {
                return ApplicationContext.Current["RoleApplicationService"] as IRoleApplicationService;
            }
        }

        //private bool _disposed = false;

        public RoleStore()
        {
        }

        public virtual Task<IdentityRole> FindByIdAsync(string roleId)
        {
            var state = RoleApplicationService.Get(roleId);
            return Task.FromResult(new IdentityRole((RoleState)state));
        }

        public virtual Task<IdentityRole> FindByNameAsync(string roleName)
        {
            var state = RoleApplicationService.GetByProperty("Name", roleName, null, 0, 1).FirstOrDefault();
            return Task.FromResult(new IdentityRole((RoleState)state));
        }

        public virtual Task CreateAsync(IdentityRole role)
        {
            if ((object)role == null)
            {
                throw new ArgumentNullException("role");
            }

            RoleApplicationService.When(role.State.ToCreateRole());
            return Task.FromResult(0);
        }

        public virtual Task DeleteAsync(IdentityRole role)
        {
            if (role == null)
            {
                throw new ArgumentNullException("role");
            }

            RoleApplicationService.When(role.State.ToDeleteRole());
            return Task.FromResult(0);
        }

        public virtual Task UpdateAsync(IdentityRole role)
        {
            if ((object)role == null)
            {
                throw new ArgumentNullException("role");
            }

            RoleApplicationService.When(role.State.ToMergePatchRole());
            return Task.FromResult(0);
        }

        //public IQueryable<TRole> Roles
        //{
        //    get
        //    {
        //        this.ThrowIfDisposed();
        //        return this.Context.Query<TRole>();
        //    }
        //}

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
