namespace Dddml.Wms.Domain {

	export class UserRoleMvoStateEventId {

		private UserRoleId: UserRoleId;

		getUserRoleId(): UserRoleId {
			if(!this.UserRoleId) {
				this.UserRoleId = new UserRoleId(); 
			}
			return this.UserRoleId;
		}

		setUserRoleId(userRoleId: UserRoleId) {
			this.UserRoleId = userRoleId;
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

