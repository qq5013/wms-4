namespace Dddml.Wms.Domain {

	export class OrganizationStructureId {

		private OrganizationStructureTypeId: string;

		getOrganizationStructureTypeId(): string {
			return this.OrganizationStructureTypeId;
		}

		setOrganizationStructureTypeId(organizationStructureTypeId: string) {
			this.OrganizationStructureTypeId = organizationStructureTypeId;
		}

		private ParentId: string;

		getParentId(): string {
			return this.ParentId;
		}

		setParentId(parentId: string) {
			this.ParentId = parentId;
		}

		private SubsidiaryId: string;

		getSubsidiaryId(): string {
			return this.SubsidiaryId;
		}

		setSubsidiaryId(subsidiaryId: string) {
			this.SubsidiaryId = subsidiaryId;
		}

	}
}

