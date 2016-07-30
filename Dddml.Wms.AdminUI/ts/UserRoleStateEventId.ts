namespace Dddml.Wms.Domain {

	export class UserRoleStateEventId {

		private UserId: string;

		getUserId(): string {
			return this.UserId;
		}

		setUserId(userId: string) {
			this.UserId = userId;
		}

		private RoleId: string;

		getRoleId(): string {
			return this.RoleId;
		}

		setRoleId(roleId: string) {
			this.RoleId = roleId;
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

