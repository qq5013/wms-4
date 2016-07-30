namespace Dddml.Wms.Domain {

	export class LocatorStateEventId {

		private LocatorId: string;

		getLocatorId(): string {
			return this.LocatorId;
		}

		setLocatorId(locatorId: string) {
			this.LocatorId = locatorId;
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

