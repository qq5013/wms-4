namespace Dddml.Wms.Domain {

	export class UserPermissionId {

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

	}
}

