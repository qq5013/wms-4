using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Dddml.Wms.Domain.Services
{
    public partial class IdentityService : IIdentityService
    {

        public bool IsUsingPermissionsAsRoles { get; set; }

        public IRolePermissionApplicationService RolePermissionApplicationService { get; set; }

        public IUserApplicationService UserApplicationService { get; set; }

        public IEnumerable<string> GetUserRoleIds(string userId)
        {
            var user = UserApplicationService.Get(userId);

            var idList = new List<string>();

            AddUserRoleIdsToList(user, idList);

            if (IsUsingPermissionsAsRoles)
            {
                AddUserRolesPermissionIdsToList(user.UserRoles, idList);
            }

            //貌似让用户直接关联到 Permission 这样已经太复杂了，有必要？
            //AddUserPermissionIdsToIdList(user, idList);

            return idList;
        }

        private void AddUserRoleIdsToList(IUserState user, IList<string> idList)
        {
            var userRoles = user.UserRoles;
            if (userRoles != null)
            {
                foreach (var role in userRoles)
                {
                    idList.Add(role.RoleId);
                }
            }
        }

        private void AddUserRolesPermissionIdsToList(IUserRoleStates userRoles, IList<string> idList)
        {
            if (userRoles != null)
            {
                foreach (var role in userRoles)
                {
                    var roleId = role.RoleId;
                    AddPermissionIdsToIdListByRoleId(roleId, idList);
                }
            }
        }

        private void AddPermissionIdsToIdListByRoleId(string roleId, IList<string> idList)
        {
            var rolePermissions = RolePermissionApplicationService.GetByProperty("Id.RoleId", roleId);
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

        private static void AddUserPermissionIdsToIdList(IUserState user, List<string> idList)
        {
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
