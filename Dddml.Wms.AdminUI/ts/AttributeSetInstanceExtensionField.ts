namespace Dddml.Wms.Domain {

	export class AttributeSetInstanceExtensionField {

		private Index: string;

		getIndex(): string {
			return this.Index;
		}

		setIndex(index: string) {
			this.Index = index;
		}

		private Name: string;

		getName(): string {
			return this.Name;
		}

		setName(name: string) {
			this.Name = name;
		}

		private Type: string;

		getType(): string {
			return this.Type;
		}

		setType(type: string) {
			this.Type = type;
		}

		private Length: number;

		getLength(): number {
			return this.Length;
		}

		setLength(length: number) {
			this.Length = length;
		}

		private Alias: string;

		getAlias(): string {
			return this.Alias;
		}

		setAlias(alias: string) {
			this.Alias = alias;
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

		private GroupId: string;

		getGroupId(): string {
			return this.GroupId;
		}

		setGroupId(groupId: string) {
			this.GroupId = groupId;
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

