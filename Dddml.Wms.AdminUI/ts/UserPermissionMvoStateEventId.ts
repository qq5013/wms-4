namespace Dddml.Wms.Domain {

	export class UserPermissionMvoStateEventId {

		private userPermissionId: UserPermissionId;

		getUserPermissionId(): UserPermissionId {
			if(!this.userPermissionId) {
				this.userPermissionId = new UserPermissionId(); 
			}
			return this.userPermissionId;
		}

		setUserPermissionId(userPermissionId: UserPermissionId) {
			this.userPermissionId = userPermissionId;
		}

		private userVersion: string;

		getUserVersion(): string {
			return this.userVersion;
		}

		setUserVersion(userVersion: string) {
			this.userVersion = userVersion;
		}

	}
}

