namespace Dddml.Wms.Domain {

	export class PermissionStateEventId {

		private permissionId: string;

		getPermissionId(): string {
			return this.permissionId;
		}

		setPermissionId(permissionId: string) {
			this.permissionId = permissionId;
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

