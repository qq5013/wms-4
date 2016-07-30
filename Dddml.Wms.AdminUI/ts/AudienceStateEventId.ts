namespace Dddml.Wms.Domain {

	export class AudienceStateEventId {

		private ClientId: string;

		getClientId(): string {
			return this.ClientId;
		}

		setClientId(clientId: string) {
			this.ClientId = clientId;
		}

		private Version: string;

		getVersion(): string {
			return this.Version;
		}

		setVersion(version: string) {
			this.Version = version;
		}

	}
}

