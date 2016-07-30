namespace Dddml.Wms.Domain {

	export class OrganizationStructureStateEventId {

		private Id: OrganizationStructureId;

		getId(): OrganizationStructureId {
			return this.Id;
		}

		setId(id: OrganizationStructureId) {
			// ???
			//if(!this.Id) {
			//    this.Id = new OrganizationStructureId(); 
			//}
			this.Id = id;
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

