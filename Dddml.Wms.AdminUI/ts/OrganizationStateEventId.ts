namespace Dddml.Wms.Domain {

	export class OrganizationStateEventId {

		private organizationId: string;

		getOrganizationId(): string {
			return this.organizationId;
		}

		setOrganizationId(organizationId: string) {
			this.organizationId = organizationId;
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

