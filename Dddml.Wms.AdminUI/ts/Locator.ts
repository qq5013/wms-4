namespace Dddml.Wms.Domain {

	export class Locator {

		private LocatorId: string;

		getLocatorId(): string {
			return this.LocatorId;
		}

		setLocatorId(locatorId: string) {
			this.LocatorId = locatorId;
		}

		private WarehouseId: string;

		getWarehouseId(): string {
			return this.WarehouseId;
		}

		setWarehouseId(warehouseId: string) {
			this.WarehouseId = warehouseId;
		}

		private ParentLocatorId: string;

		getParentLocatorId(): string {
			return this.ParentLocatorId;
		}

		setParentLocatorId(parentLocatorId: string) {
			this.ParentLocatorId = parentLocatorId;
		}

		private LocatorType: string;

		getLocatorType(): string {
			return this.LocatorType;
		}

		setLocatorType(locatorType: string) {
			this.LocatorType = locatorType;
		}

		private PriorityNumber: string;

		getPriorityNumber(): string {
			return this.PriorityNumber;
		}

		setPriorityNumber(priorityNumber: string) {
			this.PriorityNumber = priorityNumber;
		}

		private IsDefault: boolean;

		getIsDefault(): boolean {
			return this.IsDefault;
		}

		setIsDefault(isDefault: boolean) {
			this.IsDefault = isDefault;
		}

		private X: string;

		getX(): string {
			return this.X;
		}

		setX(x: string) {
			this.X = x;
		}

		private Y: string;

		getY(): string {
			return this.Y;
		}

		setY(y: string) {
			this.Y = y;
		}

		private Z: string;

		getZ(): string {
			return this.Z;
		}

		setZ(z: string) {
			this.Z = z;
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

	}
}

