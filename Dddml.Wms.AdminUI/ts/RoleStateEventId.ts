namespace Dddml.Wms.Domain {

	export class RoleStateEventId {

		private RoleId: string;

		getRoleId(): string {
			return this.RoleId;
		}

		setRoleId(roleId: string) {
			this.RoleId = roleId;
		}

		private Version: string;

		getVersion(): string {
			return this.Version;
		}

		setVersion(version: string) {
			this.Version = version;
		}

	}
}

