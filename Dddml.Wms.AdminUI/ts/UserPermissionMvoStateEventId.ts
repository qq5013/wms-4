namespace Dddml.Wms.Domain {

	export class UserPermissionMvoStateEventId {

		private UserPermissionId: UserPermissionId;

		getUserPermissionId(): UserPermissionId {
			return this.UserPermissionId;
		}

		setUserPermissionId(userPermissionId: UserPermissionId) {
			// ???
			//if(!this.UserPermissionId) {
			//    this.UserPermissionId = new UserPermissionId(); 
			//}
			this.UserPermissionId = userPermissionId;
		}

		private UserVersion: string;

		getUserVersion(): string {
			return this.UserVersion;
		}

		setUserVersion(userVersion: string) {
			this.UserVersion = userVersion;
		}

	}
}

