using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Dddml.Wms.Domain.Services
{
    public partial class IdentityService : IIdentityService
    {

        public IRolePermissionApplicationService RolePermissionApplicationService { get; set; }

        public IUserApplicationService UserApplicationService { get; set; }

        public IEnumerable<string> GetUserAllRoleIdsAndPermissionIds(string userId)
        {
            var ids = new List<string>();
            var user = UserApplicationService.Get(userId);

            var userRoles = user.UserRoles;
            if (userRoles != null)
            {
                foreach (var role in userRoles)
                {
                    ids.Add(role.RoleId);

                    var rolePermissions = RolePermissionApplicationService.GetByProperty("Id.RoleId", role.RoleId);
                    if (rolePermissions != null)
                    {
                        foreach (var p in rolePermissions)
                        {
                            if (!ids.Contains(p.Id.PermissionId))
                            {
                                ids.Add(p.Id.PermissionId);
                            }
                        }
                    }
                }
            }

            var userPermissions = user.UserPermissions;
            if (userPermissions != null)
            {
                foreach (var p in userPermissions)
                {
                    ids.Add(p.PermissionId);
                }
            }

            return ids;
        }
    }

}
