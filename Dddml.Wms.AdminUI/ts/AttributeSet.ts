namespace Dddml.Wms.Domain {

	export class AttributeSet {

		private attributeSetId: string;

		getAttributeSetId(): string {
			return this.attributeSetId;
		}

		setAttributeSetId(attributeSetId: string) {
			this.attributeSetId = attributeSetId;
		}

		private name: string;

		getName(): string {
			return this.name;
		}

		setName(name: string) {
			this.name = name;
		}

		private organizationId: string;

		getOrganizationId(): string {
			return this.organizationId;
		}

		setOrganizationId(organizationId: string) {
			this.organizationId = organizationId;
		}

		private description: string;

		getDescription(): string {
			return this.description;
		}

		setDescription(description: string) {
			this.description = description;
		}

		private serialNumberAttributeId: string;

		getSerialNumberAttributeId(): string {
			return this.serialNumberAttributeId;
		}

		setSerialNumberAttributeId(serialNumberAttributeId: string) {
			this.serialNumberAttributeId = serialNumberAttributeId;
		}

		private lotAttributeId: string;

		getLotAttributeId(): string {
			return this.lotAttributeId;
		}

		setLotAttributeId(lotAttributeId: string) {
			this.lotAttributeId = lotAttributeId;
		}

		private referenceId: string;

		getReferenceId(): string {
			return this.referenceId;
		}

		setReferenceId(referenceId: string) {
			this.referenceId = referenceId;
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

		private attributeUses: Array<AttributeUse>;

		getAttributeUses() {
			return this.attributeUses;
		}
	
		setAttributeUses(attributeUses: Array<AttributeUse>){
			this.attributeUses = attributeUses;
		}

	}
}

