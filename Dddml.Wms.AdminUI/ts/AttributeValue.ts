namespace Dddml.Wms.Domain {

	export class AttributeValue {

		private value: string;

		getValue(): string {
			return this.value;
		}

		setValue(value: string) {
			this.value = value;
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

		private attributeId: string;

		getAttributeId(): string {
			return this.attributeId;
		}

		setAttributeId(attributeId: string) {
			this.attributeId = attributeId;
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

