namespace Dddml.Wms.Domain {

	export class RoleStateEventId {

		private roleId: string;

		getRoleId(): string {
			return this.roleId;
		}

		setRoleId(roleId: string) {
			this.roleId = roleId;
		}

		private version: string;

		getVersion(): string {
			return this.version;
		}

		setVersion(version: string) {
			this.version = version;
		}

	}
}

