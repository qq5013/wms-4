namespace Dddml.Wms.Domain {

	export class Attribute {

		private AttributeId: string;

		getAttributeId(): string {
			return this.AttributeId;
		}

		setAttributeId(attributeId: string) {
			this.AttributeId = attributeId;
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

		private IsMandatory: boolean;

		getIsMandatory(): boolean {
			return this.IsMandatory;
		}

		setIsMandatory(isMandatory: boolean) {
			this.IsMandatory = isMandatory;
		}

		private IsInstanceAttribute: boolean;

		getIsInstanceAttribute(): boolean {
			return this.IsInstanceAttribute;
		}

		setIsInstanceAttribute(isInstanceAttribute: boolean) {
			this.IsInstanceAttribute = isInstanceAttribute;
		}

		private AttributeValueType: string;

		getAttributeValueType(): string {
			return this.AttributeValueType;
		}

		setAttributeValueType(attributeValueType: string) {
			this.AttributeValueType = attributeValueType;
		}

		private AttributeValueLength: number;

		getAttributeValueLength(): number {
			return this.AttributeValueLength;
		}

		setAttributeValueLength(attributeValueLength: number) {
			this.AttributeValueLength = attributeValueLength;
		}

		private IsList: boolean;

		getIsList(): boolean {
			return this.IsList;
		}

		setIsList(isList: boolean) {
			this.IsList = isList;
		}

		private FieldName: string;

		getFieldName(): string {
			return this.FieldName;
		}

		setFieldName(fieldName: string) {
			this.FieldName = fieldName;
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

		private AttributeValues: Array<AttributeValue>;

		getAttributeValues() {
			return this.AttributeValues;
		}
	
		setAttributeValues(attributeValues: Array<AttributeValue>){
			this.AttributeValues = attributeValues;
		}

	}
}

