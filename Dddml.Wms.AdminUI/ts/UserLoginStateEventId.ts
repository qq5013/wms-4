namespace Dddml.Wms.Domain {

	export class UserLoginStateEventId {

		private UserId: string;

		getUserId(): string {
			return this.UserId;
		}

		setUserId(userId: string) {
			this.UserId = userId;
		}

		private LoginKey: LoginKey;

		getLoginKey(): LoginKey {
			if(!this.LoginKey) {
				this.LoginKey = new LoginKey(); 
			}
			return this.LoginKey;
		}

		setLoginKey(loginKey: LoginKey) {
			this.LoginKey = loginKey;
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

