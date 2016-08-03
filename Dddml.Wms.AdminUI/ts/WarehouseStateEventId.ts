namespace Dddml.Wms.Domain {

	export class WarehouseStateEventId {

		private warehouseId: string;

		getWarehouseId(): string {
			return this.warehouseId;
		}

		setWarehouseId(warehouseId: string) {
			this.warehouseId = warehouseId;
		}

		private version: string;

		getVersion(): string {
			return this.version;
		}

		setVersion(version: string) {
			this.version = version;
		}

	}
}

