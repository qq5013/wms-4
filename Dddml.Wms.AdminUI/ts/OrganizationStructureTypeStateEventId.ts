namespace Dddml.Wms.Domain {

	export class OrganizationStructureTypeStateEventId {

		private id: string;

		getId(): string {
			return this.id;
		}

		setId(id: string) {
			this.id = id;
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

