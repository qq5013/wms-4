namespace Dddml.Wms.Domain {

	export class Organization {

		private organizationId: string;

		getOrganizationId(): string {
			return this.organizationId;
		}

		setOrganizationId(organizationId: string) {
			this.organizationId = organizationId;
		}

		private name: string;

		getName(): string {
			return this.name;
		}

		setName(name: string) {
			this.name = name;
		}

		private description: string;

		getDescription(): string {
			return this.description;
		}

		setDescription(description: string) {
			this.description = description;
		}

		private type: string;

		getType(): string {
			return this.type;
		}

		setType(type: string) {
			this.type = type;
		}

		private isSummary: boolean;

		getIsSummary(): boolean {
			return this.isSummary;
		}

		setIsSummary(isSummary: boolean) {
			this.isSummary = isSummary;
		}

		private active: boolean;

		getActive(): boolean {
			return this.active;
		}

		setActive(active: boolean) {
			this.active = active;
		}

		private version: string;

		getVersion(): string {
			return this.version;
		}

		setVersion(version: string) {
			this.version = version;
		}

		private createdBy: string;

		getCreatedBy(): string {
			return this.createdBy;
		}

		setCreatedBy(createdBy: string) {
			this.createdBy = createdBy;
		}

		private createdAt: string;

		getCreatedAt(): string {
			return this.createdAt;
		}

		setCreatedAt(createdAt: string) {
			this.createdAt = createdAt;
		}

		private updatedBy: string;

		getUpdatedBy(): string {
			return this.updatedBy;
		}

		setUpdatedBy(updatedBy: string) {
			this.updatedBy = updatedBy;
		}

		private updatedAt: string;

		getUpdatedAt(): string {
			return this.updatedAt;
		}

		setUpdatedAt(updatedAt: string) {
			this.updatedAt = updatedAt;
		}

	}
}

