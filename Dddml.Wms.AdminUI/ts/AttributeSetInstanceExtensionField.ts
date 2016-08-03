namespace Dddml.Wms.Domain {

	export class AttributeSetInstanceExtensionField {

		private index: string;

		getIndex(): string {
			return this.index;
		}

		setIndex(index: string) {
			this.index = index;
		}

		private name: string;

		getName(): string {
			return this.name;
		}

		setName(name: string) {
			this.name = name;
		}

		private type: string;

		getType(): string {
			return this.type;
		}

		setType(type: string) {
			this.type = type;
		}

		private length: number;

		getLength(): number {
			return this.length;
		}

		setLength(length: number) {
			this.length = length;
		}

		private alias: string;

		getAlias(): string {
			return this.alias;
		}

		setAlias(alias: string) {
			this.alias = alias;
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

		private groupId: string;

		getGroupId(): string {
			return this.groupId;
		}

		setGroupId(groupId: string) {
			this.groupId = groupId;
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

