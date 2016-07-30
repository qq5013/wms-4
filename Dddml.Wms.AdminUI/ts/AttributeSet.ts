namespace Dddml.Wms.Domain {

	export class AttributeSet {

		private AttributeSetId: string;

		getAttributeSetId(): string {
			return this.AttributeSetId;
		}

		setAttributeSetId(attributeSetId: string) {
			this.AttributeSetId = attributeSetId;
		}

		private Name: string;

		getName(): string {
			return this.Name;
		}

		setName(name: string) {
			this.Name = name;
		}

		private OrganizationId: string;

		getOrganizationId(): string {
			return this.OrganizationId;
		}

		setOrganizationId(organizationId: string) {
			this.OrganizationId = organizationId;
		}

		private Description: string;

		getDescription(): string {
			return this.Description;
		}

		setDescription(description: string) {
			this.Description = description;
		}

		private SerialNumberAttributeId: string;

		getSerialNumberAttributeId(): string {
			return this.SerialNumberAttributeId;
		}

		setSerialNumberAttributeId(serialNumberAttributeId: string) {
			this.SerialNumberAttributeId = serialNumberAttributeId;
		}

		private LotAttributeId: string;

		getLotAttributeId(): string {
			return this.LotAttributeId;
		}

		setLotAttributeId(lotAttributeId: string) {
			this.LotAttributeId = lotAttributeId;
		}

		private ReferenceId: string;

		getReferenceId(): string {
			return this.ReferenceId;
		}

		setReferenceId(referenceId: string) {
			this.ReferenceId = referenceId;
		}

		private Active: boolean;

		getActive(): boolean {
			return this.Active;
		}

		setActive(active: boolean) {
			this.Active = active;
		}

		private Version: string;

		getVersion(): string {
			return this.Version;
		}

		setVersion(version: string) {
			this.Version = version;
		}

		private CreatedBy: string;

		getCreatedBy(): string {
			return this.CreatedBy;
		}

		setCreatedBy(createdBy: string) {
			this.CreatedBy = createdBy;
		}

		private CreatedAt: string;

		getCreatedAt(): string {
			return this.CreatedAt;
		}

		setCreatedAt(createdAt: string) {
			this.CreatedAt = createdAt;
		}

		private UpdatedBy: string;

		getUpdatedBy(): string {
			return this.UpdatedBy;
		}

		setUpdatedBy(updatedBy: string) {
			this.UpdatedBy = updatedBy;
		}

		private UpdatedAt: string;

		getUpdatedAt(): string {
			return this.UpdatedAt;
		}

		setUpdatedAt(updatedAt: string) {
			this.UpdatedAt = updatedAt;
		}

		private AttributeUses: Array<AttributeUse>;

		getAttributeUses() {
			return this.AttributeUses;
		}
	
		setAttributeUses(attributeUses: Array<AttributeUse>){
			this.AttributeUses = attributeUses;
		}

	}
}

