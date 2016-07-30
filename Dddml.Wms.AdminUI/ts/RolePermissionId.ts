namespace Dddml.Wms.Domain {

	export class RolePermissionId {

		private RoleId: string;

		getRoleId(): string {
			return this.RoleId;
		}

		setRoleId(roleId: string) {
			this.RoleId = roleId;
		}

		private PermissionId: string;

		getPermissionId(): string {
			return this.PermissionId;
		}

		setPermissionId(permissionId: string) {
			this.PermissionId = permissionId;
		}

	}
}

