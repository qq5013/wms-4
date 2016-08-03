namespace Dddml.Wms.Domain {

	export class UserLoginStateEventId {

		private userId: string;

		getUserId(): string {
			return this.userId;
		}

		setUserId(userId: string) {
			this.userId = userId;
		}

		private loginKey: LoginKey;

		getLoginKey(): LoginKey {
			if(!this.loginKey) {
				this.loginKey = new LoginKey(); 
			}
			return this.loginKey;
		}

		setLoginKey(loginKey: LoginKey) {
			this.loginKey = loginKey;
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

