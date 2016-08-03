namespace Dddml.Wms.Domain {

	export class UserRoleMvoStateEventId {

		private userRoleId: UserRoleId;

		getUserRoleId(): UserRoleId {
			if(!this.userRoleId) {
				this.userRoleId = new UserRoleId(); 
			}
			return this.userRoleId;
		}

		setUserRoleId(userRoleId: UserRoleId) {
			this.userRoleId = userRoleId;
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

