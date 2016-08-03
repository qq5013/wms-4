namespace Dddml.Wms.Domain {

	export class RolePermissionStateEventId {

		private id: RolePermissionId;

		getId(): RolePermissionId {
			if(!this.id) {
				this.id = new RolePermissionId(); 
			}
			return this.id;
		}

		setId(id: RolePermissionId) {
			this.id = id;
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

