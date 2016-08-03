namespace Dddml.Wms.Domain {

	export class Locator {

		private locatorId: string;

		getLocatorId(): string {
			return this.locatorId;
		}

		setLocatorId(locatorId: string) {
			this.locatorId = locatorId;
		}

		private warehouseId: string;

		getWarehouseId(): string {
			return this.warehouseId;
		}

		setWarehouseId(warehouseId: string) {
			this.warehouseId = warehouseId;
		}

		private parentLocatorId: string;

		getParentLocatorId(): string {
			return this.parentLocatorId;
		}

		setParentLocatorId(parentLocatorId: string) {
			this.parentLocatorId = parentLocatorId;
		}

		private locatorType: string;

		getLocatorType(): string {
			return this.locatorType;
		}

		setLocatorType(locatorType: string) {
			this.locatorType = locatorType;
		}

		private priorityNumber: string;

		getPriorityNumber(): string {
			return this.priorityNumber;
		}

		setPriorityNumber(priorityNumber: string) {
			this.priorityNumber = priorityNumber;
		}

		private isDefault: boolean;

		getIsDefault(): boolean {
			return this.isDefault;
		}

		setIsDefault(isDefault: boolean) {
			this.isDefault = isDefault;
		}

		private x: string;

		getX(): string {
			return this.x;
		}

		setX(x: string) {
			this.x = x;
		}

		private y: string;

		getY(): string {
			return this.y;
		}

		setY(y: string) {
			this.y = y;
		}

		private z: string;

		getZ(): string {
			return this.z;
		}

		setZ(z: string) {
			this.z = z;
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

