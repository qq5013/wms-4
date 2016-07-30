namespace Dddml.Wms.Domain {

	export class OrganizationStateEventId {

		private OrganizationId: string;

		getOrganizationId(): string {
			return this.OrganizationId;
		}

		setOrganizationId(organizationId: string) {
			this.OrganizationId = organizationId;
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

