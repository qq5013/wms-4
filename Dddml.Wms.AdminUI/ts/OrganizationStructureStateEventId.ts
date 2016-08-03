namespace Dddml.Wms.Domain {

	export class OrganizationStructureStateEventId {

		private id: OrganizationStructureId;

		getId(): OrganizationStructureId {
			if(!this.id) {
				this.id = new OrganizationStructureId(); 
			}
			return this.id;
		}

		setId(id: OrganizationStructureId) {
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

