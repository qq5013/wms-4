namespace Dddml.Wms.Domain {

	export class OrganizationStructureId {

		private organizationStructureTypeId: string;

		getOrganizationStructureTypeId(): string {
			return this.organizationStructureTypeId;
		}

		setOrganizationStructureTypeId(organizationStructureTypeId: string) {
			this.organizationStructureTypeId = organizationStructureTypeId;
		}

		private parentId: string;

		getParentId(): string {
			return this.parentId;
		}

		setParentId(parentId: string) {
			this.parentId = parentId;
		}

		private subsidiaryId: string;

		getSubsidiaryId(): string {
			return this.subsidiaryId;
		}

		setSubsidiaryId(subsidiaryId: string) {
			this.subsidiaryId = subsidiaryId;
		}

	}
}

