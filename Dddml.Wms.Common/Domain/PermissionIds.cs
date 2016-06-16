using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Dddml.Wms.Domain
{
    public static class PermissionIds
    {


        public const string SystemManagement = "SystemManagement";
        public const string UserManagement = "UserManagement";
        public const string RoleManagement = "RoleManagement";
        public const string OrganizationManagement = "OrganizationManagement";
        public const string WarehouseManagement = "WarehouseManagement";
        public const string LocatorManagement = "LocatorManagement";
        public const string ProductManagement = "ProductManagement";
        public const string ProductLocatorUseManagement = "ProductLocatorUseManagement";
        public const string SoftVersionManagement = "SoftVersionManagement";
        public const string DataImport = "DataImport";

        public const string MaterailInOutManagement = "MaterailInOutManagement";
        public const string MaterailIn = "MaterailIn";
        public const string MaterailInReverse = "MaterailInReverse";
        public const string MaterailInComplete = "MaterailInComplete";
        public const string MaterailInVoid = "MaterailInVoid";
        public const string MaterailOut = "MaterailOut";
        public const string MaterailOutReverse = "MaterailOutReverse";
        public const string MaterailOutComplete = "MaterailOutComplete";
        public const string MaterailOutVoid = "MaterailOutVoid";
        public const string InTransitMovement = "InTransitMovement";
        public const string InTransitMovementVoid = "InTransitMovementVoid";
        public const string InTransitMovementReverse = "InTransitMovementReverse";
        public const string InTransitMovementForward = "InTransitMovementForward";
        public const string InTransitMovementAccept = "InTransitMovementAccept";
        public const string InTransitMovementReject = "InTransitMovementReject";
        public const string MaterailLocatorTransfer = "MaterailLocatorTransfer";

        public const string InventoryManagement = "InventoryManagement";
        public const string DailyInventory = "DailyInventory";
        public const string CreateWarehouseInventory = "CreateWarehouseInventory";
        public const string WarehouseInventory = "WarehouseInventory";
        public const string WarehouseInventoryComplete = "WarehouseInventoryComplete";
        public const string WarehouseInventoryVoid = "WarehouseInventoryVoid";
        public const string WarehouseInventoryReverse = "WarehouseInventoryReverse";

        public const string ViewsAndReports = "ViewsAndReports";
        public const string StorageView = "StorageView";
        public const string TransactionView = "TransactionView";
        public const string LocatorProductTransactionView = "LocatorProductTransactionView";
        public const string InOutView = "InOutView";
        public const string InventoryView = "InventoryView";
        public const string StorageTransactionCheck = "StorageTransactionCheck";

        public const string Tests = "Tests";

    }
}
