using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Dddml.Wms.Domain.Services
{
    public partial class AuthorizationService : Dddml.Wms.Domain.Services.IAuthorizationService
    {
        public IUserRoleApplicationService UserRoleApplicationService { get; set; }

        public IRolePermissionApplicationService RolePermissionApplicationService { get; set; }

        public IUserPermissionApplicationService UserPermissionApplicationService { get; set; }

        public IEnumerable<string> GetUserAllPermissionIds(string userId)
        {
            var ids = new List<string>();
            var userPermissions = UserPermissionApplicationService.Get(new KeyValuePair<string, object>[] { new KeyValuePair<string,object>("Id.UserId", userId) });
            foreach (var p in userPermissions)
            {
                ids.Add(p.Id.PermissionId);
            }
            var userRoles = UserRoleApplicationService.Get(new KeyValuePair<string, object>[] { new KeyValuePair<string, object>("Id.UserId", userId) });
            foreach (var role in userRoles)
            {
                var rolePermissions = RolePermissionApplicationService.Get(new KeyValuePair<string, object>[] { new KeyValuePair<string, object>("Id.RoleId", role.Id.RoleId) });
                foreach (var p in rolePermissions)
                {
                    if (!ids.Contains(p.Id.PermissionId))
                    {
                        ids.Add(p.Id.PermissionId);
                    }
                }
            }
            return ids;
        }

    }
}
