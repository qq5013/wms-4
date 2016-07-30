namespace Dddml.Wms.Domain {

	export class UserPermissionStateEventId {

		private UserId: string;

		getUserId(): string {
			return this.UserId;
		}

		setUserId(userId: string) {
			this.UserId = userId;
		}

		private PermissionId: string;

		getPermissionId(): string {
			return this.PermissionId;
		}

		setPermissionId(permissionId: string) {
			this.PermissionId = permissionId;
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

