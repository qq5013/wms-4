namespace Dddml.Wms.Domain {

	export class UserLoginMvoStateEventId {

		private userLoginId: UserLoginId;

		getUserLoginId(): UserLoginId {
			if(!this.userLoginId) {
				this.userLoginId = new UserLoginId(); 
			}
			return this.userLoginId;
		}

		setUserLoginId(userLoginId: UserLoginId) {
			this.userLoginId = userLoginId;
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

