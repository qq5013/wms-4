namespace Dddml.Wms.Domain {

	export class UserLoginMvoStateEventId {

		private UserLoginId: UserLoginId;

		getUserLoginId(): UserLoginId {
			return this.UserLoginId;
		}

		setUserLoginId(userLoginId: UserLoginId) {
			// ???
			//if(!this.UserLoginId) {
			//    this.UserLoginId = new UserLoginId(); 
			//}
			this.UserLoginId = userLoginId;
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

