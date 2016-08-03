namespace Dddml.Wms.Domain {

	export class LoginKey {

		private loginProvider: string;

		getLoginProvider(): string {
			return this.loginProvider;
		}

		setLoginProvider(loginProvider: string) {
			this.loginProvider = loginProvider;
		}

		private providerKey: string;

		getProviderKey(): string {
			return this.providerKey;
		}

		setProviderKey(providerKey: string) {
			this.providerKey = providerKey;
		}

	}
}

