namespace Dddml.Wms.Domain {

	export class WarehouseStateEventId {

		private WarehouseId: string;

		getWarehouseId(): string {
			return this.WarehouseId;
		}

		setWarehouseId(warehouseId: string) {
			this.WarehouseId = warehouseId;
		}

		private Version: string;

		getVersion(): string {
			return this.Version;
		}

		setVersion(version: string) {
			this.Version = version;
		}

	}
}

