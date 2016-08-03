namespace Dddml.Wms.Domain {

	export class LocatorStateEventId {

		private locatorId: string;

		getLocatorId(): string {
			return this.locatorId;
		}

		setLocatorId(locatorId: string) {
			this.locatorId = locatorId;
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

