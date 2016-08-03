namespace Dddml.Wms.Domain {

	export class AudienceStateEventId {

		private clientId: string;

		getClientId(): string {
			return this.clientId;
		}

		setClientId(clientId: string) {
			this.clientId = clientId;
		}

		private version: string;

		getVersion(): string {
			return this.version;
		}

		setVersion(version: string) {
			this.version = version;
		}

	}
}

