namespace Dddml.Wms.Domain {

	export class RolePermissionId {

		private roleId: string;

		getRoleId(): string {
			return this.roleId;
		}

		setRoleId(roleId: string) {
			this.roleId = roleId;
		}

		private permissionId: string;

		getPermissionId(): string {
			return this.permissionId;
		}

		setPermissionId(permissionId: string) {
			this.permissionId = permissionId;
		}

	}
}

