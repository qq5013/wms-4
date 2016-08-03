namespace Dddml.Wms.Domain {

	export class UserRoleId {

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

	}
}

