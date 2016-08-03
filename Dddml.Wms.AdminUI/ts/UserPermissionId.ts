namespace Dddml.Wms.Domain {

	export class UserPermissionId {

		private userId: string;

		getUserId(): string {
			return this.userId;
		}

		setUserId(userId: string) {
			this.userId = userId;
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

