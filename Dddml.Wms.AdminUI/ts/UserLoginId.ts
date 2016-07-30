namespace Dddml.Wms.Domain {

	export class UserLoginId {

		private UserId: string;

		getUserId(): string {
			return this.UserId;
		}

		setUserId(userId: string) {
			this.UserId = userId;
		}

		private LoginKey: LoginKey;

		getLoginKey(): LoginKey {
			return this.LoginKey;
		}

		setLoginKey(loginKey: LoginKey) {
			// ???
			//if(!this.LoginKey) {
			//    this.LoginKey = new LoginKey(); 
			//}
			this.LoginKey = loginKey;
		}

	}
}

