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

        public IEnumerable<string> GetUserRoleIds(string userId)
        {
            var user = UserApplicationService.Get(userId);

            var ids = new List<string>();

            AddUserRoleIdsAndPermissionIdsToList(user, ids);

            return ids;
        }

        private void AddUserRoleIdsAndPermissionIdsToList(IUserState user, List<string> idList)
        {
            var userRoles = user.UserRoles;
            if (userRoles != null)
            {
                foreach (var role in userRoles)
                {
                    idList.Add(role.RoleId);

                    var rolePermissions = RolePermissionApplicationService.GetByProperty("Id.RoleId", role.RoleId);
                    if (rolePermissions != null)
                    {
                        foreach (var p in rolePermissions)
                        {
                            if (!idList.Contains(p.Id.PermissionId))
                            {
                                idList.Add(p.Id.PermissionId);
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
                    idList.Add(p.PermissionId);
                }
            }

        }
    }

}
