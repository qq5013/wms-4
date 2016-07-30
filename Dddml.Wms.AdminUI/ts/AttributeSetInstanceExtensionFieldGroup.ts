namespace Dddml.Wms.Domain {

	export class AttributeSetInstanceExtensionFieldGroup {

		private Id: string;

		getId(): string {
			return this.Id;
		}

		setId(id: string) {
			this.Id = id;
		}

		private FieldType: string;

		getFieldType(): string {
			return this.FieldType;
		}

		setFieldType(fieldType: string) {
			this.FieldType = fieldType;
		}

		private FieldLength: number;

		getFieldLength(): number {
			return this.FieldLength;
		}

		setFieldLength(fieldLength: number) {
			this.FieldLength = fieldLength;
		}

		private FieldCount: number;

		getFieldCount(): number {
			return this.FieldCount;
		}

		setFieldCount(fieldCount: number) {
			this.FieldCount = fieldCount;
		}

		private NameFormat: string;

		getNameFormat(): string {
			return this.NameFormat;
		}

		setNameFormat(nameFormat: string) {
			this.NameFormat = nameFormat;
		}

		private Description: string;

		getDescription(): string {
			return this.Description;
		}

		setDescription(description: string) {
			this.Description = description;
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

		private Fields: Array<AttributeSetInstanceExtensionField>;

		getFields() {
			return this.Fields;
		}
	
		setFields(fields: Array<AttributeSetInstanceExtensionField>){
			this.Fields = fields;
		}

	}
}

