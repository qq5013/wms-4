namespace Dddml.Wms.Domain {

	export class AttributeUse {

		private AttributeId: string;

		getAttributeId(): string {
			return this.AttributeId;
		}

		setAttributeId(attributeId: string) {
			this.AttributeId = attributeId;
		}

		private SequenceNumber: number;

		getSequenceNumber(): number {
			return this.SequenceNumber;
		}

		setSequenceNumber(sequenceNumber: number) {
			this.SequenceNumber = sequenceNumber;
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

		private AttributeSetId: string;

		getAttributeSetId(): string {
			return this.AttributeSetId;
		}

		setAttributeSetId(attributeSetId: string) {
			this.AttributeSetId = attributeSetId;
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

	}
}

