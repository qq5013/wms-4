using Dddml.Wms.Domain;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Dddml.Wms.Support
{
    public static class PermissionUtils
    {

        public static IList<string> GetPermissionIds(IList<Permission> permissions)
        {
            IList<string> ids = new List<string>();
            foreach (Permission permission in permissions)
            {
                if (!ids.Contains(permission.PermissionId))
                {
                    ids.Add(permission.PermissionId);
                }
            }
            return ids;
        }

        public static ICollection<Permission> UnionPermissions(IList<Permission> permissions1, IList<Permission> permissions2)
        {
            IDictionary<string, Permission> dict = new Dictionary<string, Permission>();
            foreach (Permission permission in permissions1)
            {
                dict[permission.PermissionId] = permission;
            }
            foreach (Permission permission in permissions2)
            {
                if (!dict.ContainsKey(permission.PermissionId))
                {
                    dict[permission.PermissionId] = permission;
                }
            }
            return new List<Permission>(dict.Values);
        }

        public static ICollection<Permission> GetRootPermissions()
        {
            return new Permission[] {
                Permissions.SystemManagement, 
                Permissions.MaterailInOutManagement, 
                Permissions.InventoryManagement,
                Permissions.ViewsAndReports
            };
        }

        public static IList<CreateRolePermission> GrantPermissionsToRole(string roleId, Permission p)
        {
            var commands = new List<CreateRolePermission>();
            var c = CreateRolePermission(roleId, p);
            commands.Add(c);
            return commands;
        }

        private static CreateRolePermission CreateRolePermission(string roleId, Permission p)
        {
            var c = new CreateRolePermission();
            c.Id = new RolePermissionId();
            c.Id.RoleId = roleId;
            c.Id.PermissionId = p.PermissionId;

            return c;
        }

        public static class Permissions
        {
            public static readonly Permission SystemManagement = new Permission(PermissionIds.SystemManagement, "系统管理", null);
            public static readonly Permission UserManagement = new Permission(PermissionIds.UserManagement, "用户管理", SystemManagement);
            public static readonly Permission RoleManagement = new Permission(PermissionIds.RoleManagement, "角色管理", SystemManagement);
            public static readonly Permission OrganizationManagement = new Permission(PermissionIds.OrganizationManagement, "组织管理", SystemManagement);
            public static readonly Permission WarehouseManagement = new Permission(PermissionIds.WarehouseManagement, "库位管理", SystemManagement);
            public static readonly Permission LocatorManagement = new Permission(PermissionIds.LocatorManagement, "货位管理", SystemManagement);
            public static readonly Permission ProductManagement = new Permission(PermissionIds.ProductManagement, "物料维护", SystemManagement);
            public static readonly Permission ProductLocatorUseManagement = new Permission(PermissionIds.ProductLocatorUseManagement, "物料储位关系维护", SystemManagement);
            public static readonly Permission SoftVersionManagement = new Permission(PermissionIds.SoftVersionManagement, "软件版本管理", SystemManagement);
            public static readonly Permission DataImport = new Permission(PermissionIds.DataImport, "数据导入", SystemManagement);

            public static readonly Permission MaterailInOutManagement = new Permission(PermissionIds.MaterailInOutManagement, "物料管理", null);

            public static readonly Permission MaterailIn = new Permission(PermissionIds.MaterailIn, "入库", MaterailInOutManagement);
            public static readonly Permission MaterailInReverse = new Permission(PermissionIds.MaterailInReverse, "入库反转", MaterailInOutManagement);
            public static readonly Permission MaterailInComplete = new Permission(PermissionIds.MaterailInComplete, "确认入库", MaterailInOutManagement);
            public static readonly Permission MaterailInVoid = new Permission(PermissionIds.MaterailInVoid, "取消入库", MaterailInOutManagement);

            public static readonly Permission MaterailOut = new Permission(PermissionIds.MaterailOut, "出库", MaterailInOutManagement);
            public static readonly Permission MaterailOutReverse = new Permission(PermissionIds.MaterailOutReverse, "出库反转", MaterailInOutManagement);
            public static readonly Permission MaterailOutComplete = new Permission(PermissionIds.MaterailOutComplete, "确认出库", MaterailInOutManagement);
            public static readonly Permission MaterailOutVoid = new Permission(PermissionIds.MaterailOutVoid, "取消出库", MaterailInOutManagement);

            public static readonly Permission InTransitMovement = new Permission(PermissionIds.InTransitMovement, "调拨出库", MaterailInOutManagement);
            public static readonly Permission InTransitMovementVoid = new Permission(PermissionIds.InTransitMovementVoid, "取消调拨", MaterailInOutManagement);
            public static readonly Permission InTransitMovementReverse = new Permission(PermissionIds.InTransitMovementReverse, "调拨反转", MaterailInOutManagement);
            public static readonly Permission InTransitMovementConfirm = new Permission(PermissionIds.InTransitMovementConfirm, "调拨出库确认", MaterailInOutManagement);
            public static readonly Permission InTransitMovementAccept = new Permission(PermissionIds.InTransitMovementAccept, "接收调拨", MaterailInOutManagement);
            public static readonly Permission InTransitMovementReject = new Permission(PermissionIds.InTransitMovementReject, "拒收调拨", MaterailInOutManagement);

            public static readonly Permission MaterailLocatorTransfer = new Permission(PermissionIds.MaterailLocatorTransfer, "库存转储位", MaterailInOutManagement);//转储

            public static readonly Permission InventoryManagement = new Permission(PermissionIds.InventoryManagement, "盘点管理", null);
            public static readonly Permission DailyInventory = new Permission(PermissionIds.DailyInventory, "日常盘点", InventoryManagement);//“稽核盘点”
            public static readonly Permission CreateWarehouseInventory = new Permission(PermissionIds.CreateWarehouseInventory, "新建库存盘点单", InventoryManagement);
            public static readonly Permission WarehouseInventory = new Permission(PermissionIds.WarehouseInventory, "库存盘点", InventoryManagement);
            public static readonly Permission WarehouseInventoryComplete = new Permission(PermissionIds.WarehouseInventoryComplete, "执行库存盘点结果", InventoryManagement);
            public static readonly Permission WarehouseInventoryVoid = new Permission(PermissionIds.WarehouseInventoryVoid, "撤销库存盘点", InventoryManagement);
            public static readonly Permission WarehouseInventoryReverse = new Permission(PermissionIds.WarehouseInventoryReverse, "库存盘点反转", InventoryManagement);

            public static readonly Permission ViewsAndReports = new Permission(PermissionIds.ViewsAndReports, "报表查询", null);
            public static readonly Permission StorageView = new Permission(PermissionIds.StorageView, "库存查询", ViewsAndReports);
            public static readonly Permission TransactionView = new Permission(PermissionIds.TransactionView, "库存事务查询", ViewsAndReports);//异动查询
            public static readonly Permission LocatorProductTransactionView = new Permission(PermissionIds.LocatorProductTransactionView, "储位事务查询", ViewsAndReports);//储位物料异动查询

            public static readonly Permission InOutView = new Permission(PermissionIds.InOutView, "入库出库单据查询", ViewsAndReports);
            //public static readonly Permission InventoryDetailsView = new Permission(PermissionIds.InventoryDetailsView, "盘盈盘亏明细表", ReportQuery);
            public static readonly Permission InventoryView = new Permission(PermissionIds.InventoryView, "盘点单查询", ViewsAndReports);
            public static readonly Permission StorageTransactionCheck = new Permission(PermissionIds.StorageTransactionCheck, "库存验算", ViewsAndReports);

            //public static readonly Permission Tests = new Permission(PermissionIds.Tests, "测试", ViewsAndReports);

        }

        public class Permission
        {
            /// <summary>
            /// 权限 Id.
            /// </summary>
            public virtual string PermissionId { get; set; }

            /// <summary>
            /// 权限名称
            /// </summary>
            public virtual string PermissionName { get; set; }

            /// <summary>
            /// 本权限隶属的上级权限
            /// </summary>
            public virtual Permission ParentPermission { get; set; }

            private IList<Permission> _childPermissions = new List<Permission>();

            /// <summary>
            /// 本权限之下的所有子权限列表
            /// </summary>
            public virtual IList<Permission> ChildPermissions
            {
                get
                {
                    return _childPermissions;
                }
                set
                {
                    _childPermissions = value;
                }
            }

            public virtual string ParentPermissionId
            {
                get
                {
                    if (ParentPermission != null)
                    {
                        return ParentPermission.PermissionId;
                    }
                    else
                    {
                        return null;
                    }
                }
            }

            public Permission()
            {
            }

            public Permission(string id, string name, Permission parent)
            {
                PermissionId = id;
                PermissionName = name;
                ParentPermission = parent;
                if (parent != null)
                {
                    parent.ChildPermissions.Add(this);
                }
            }

            public CreatePermission ToCreatePermission()
            {
                var c = new CreatePermission();
                c.PermissionId = this.PermissionId;
                c.ParentPermissionId = this.ParentPermissionId;
                c.Name = this.PermissionName;
                return c;
            }

  
        }

    }
}
