namespace Dddml.Wms.Domain {

	export class AttributeSetInstanceExtensionFieldGroup {

		private id: string;

		getId(): string {
			return this.id;
		}

		setId(id: string) {
			this.id = id;
		}

		private fieldType: string;

		getFieldType(): string {
			return this.fieldType;
		}

		setFieldType(fieldType: string) {
			this.fieldType = fieldType;
		}

		private fieldLength: number;

		getFieldLength(): number {
			return this.fieldLength;
		}

		setFieldLength(fieldLength: number) {
			this.fieldLength = fieldLength;
		}

		private fieldCount: number;

		getFieldCount(): number {
			return this.fieldCount;
		}

		setFieldCount(fieldCount: number) {
			this.fieldCount = fieldCount;
		}

		private nameFormat: string;

		getNameFormat(): string {
			return this.nameFormat;
		}

		setNameFormat(nameFormat: string) {
			this.nameFormat = nameFormat;
		}

		private description: string;

		getDescription(): string {
			return this.description;
		}

		setDescription(description: string) {
			this.description = description;
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

		private fields: Array<AttributeSetInstanceExtensionField>;

		getFields() {
			return this.fields;
		}
	
		setFields(fields: Array<AttributeSetInstanceExtensionField>){
			this.fields = fields;
		}

	}
}

