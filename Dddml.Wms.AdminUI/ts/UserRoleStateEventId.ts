namespace Dddml.Wms.Domain {

	export class UserRoleStateEventId {

		private userId: string;

		getUserId(): string {
			return this.userId;
		}

		setUserId(userId: string) {
			this.userId = userId;
		}

		private roleId: string;

		getRoleId(): string {
			return this.roleId;
		}

		setRoleId(roleId: string) {
			this.roleId = roleId;
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

