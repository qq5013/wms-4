namespace Dddml.Wms.Domain {

	export class AttributeValue {

		private Value: string;

		getValue(): string {
			return this.Value;
		}

		setValue(value: string) {
			this.Value = value;
		}

		private Name: string;

		getName(): string {
			return this.Name;
		}

		setName(name: string) {
			this.Name = name;
		}

		private Description: string;

		getDescription(): string {
			return this.Description;
		}

		setDescription(description: string) {
			this.Description = description;
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

		private AttributeId: string;

		getAttributeId(): string {
			return this.AttributeId;
		}

		setAttributeId(attributeId: string) {
			this.AttributeId = attributeId;
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

