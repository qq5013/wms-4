namespace Dddml.Wms.Domain {

	export class LoginKey {

		private LoginProvider: string;

		getLoginProvider(): string {
			return this.LoginProvider;
		}

		setLoginProvider(loginProvider: string) {
			this.LoginProvider = loginProvider;
		}

		private ProviderKey: string;

		getProviderKey(): string {
			return this.ProviderKey;
		}

		setProviderKey(providerKey: string) {
			this.ProviderKey = providerKey;
		}

	}
}

