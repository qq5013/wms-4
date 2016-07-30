namespace Dddml.Wms.Domain {

	export class RolePermissionStateEventId {

		private Id: RolePermissionId;

		getId(): RolePermissionId {
			if(!this.Id) {
				this.Id = new RolePermissionId(); 
			}
			return this.Id;
		}

		setId(id: RolePermissionId) {
			this.Id = id;
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

