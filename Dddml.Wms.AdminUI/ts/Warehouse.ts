namespace Dddml.Wms.Domain {

	export class Warehouse {

		private warehouseId: string;

		getWarehouseId(): string {
			return this.warehouseId;
		}

		setWarehouseId(warehouseId: string) {
			this.warehouseId = warehouseId;
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

		private isInTransit: boolean;

		getIsInTransit(): boolean {
			return this.isInTransit;
		}

		setIsInTransit(isInTransit: boolean) {
			this.isInTransit = isInTransit;
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

	}
}

