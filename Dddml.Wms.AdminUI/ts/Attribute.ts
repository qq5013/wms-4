namespace Dddml.Wms.Domain {

	export class Attribute {

		private attributeId: string;

		getAttributeId(): string {
			return this.attributeId;
		}

		setAttributeId(attributeId: string) {
			this.attributeId = attributeId;
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

		private isMandatory: boolean;

		getIsMandatory(): boolean {
			return this.isMandatory;
		}

		setIsMandatory(isMandatory: boolean) {
			this.isMandatory = isMandatory;
		}

		private isInstanceAttribute: boolean;

		getIsInstanceAttribute(): boolean {
			return this.isInstanceAttribute;
		}

		setIsInstanceAttribute(isInstanceAttribute: boolean) {
			this.isInstanceAttribute = isInstanceAttribute;
		}

		private attributeValueType: string;

		getAttributeValueType(): string {
			return this.attributeValueType;
		}

		setAttributeValueType(attributeValueType: string) {
			this.attributeValueType = attributeValueType;
		}

		private attributeValueLength: number;

		getAttributeValueLength(): number {
			return this.attributeValueLength;
		}

		setAttributeValueLength(attributeValueLength: number) {
			this.attributeValueLength = attributeValueLength;
		}

		private isList: boolean;

		getIsList(): boolean {
			return this.isList;
		}

		setIsList(isList: boolean) {
			this.isList = isList;
		}

		private fieldName: string;

		getFieldName(): string {
			return this.fieldName;
		}

		setFieldName(fieldName: string) {
			this.fieldName = fieldName;
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

		private attributeValues: Array<AttributeValue>;

		getAttributeValues() {
			return this.attributeValues;
		}
	
		setAttributeValues(attributeValues: Array<AttributeValue>){
			this.attributeValues = attributeValues;
		}

	}
}

