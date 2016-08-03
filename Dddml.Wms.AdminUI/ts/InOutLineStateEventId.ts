namespace Dddml.Wms.Domain {

	export class InOutLineStateEventId {

		private inOutDocumentNumber: string;

		getInOutDocumentNumber(): string {
			return this.inOutDocumentNumber;
		}

		setInOutDocumentNumber(inOutDocumentNumber: string) {
			this.inOutDocumentNumber = inOutDocumentNumber;
		}

		private skuId: SkuId;

		getSkuId(): SkuId {
			if(!this.skuId) {
				this.skuId = new SkuId(); 
			}
			return this.skuId;
		}

		setSkuId(skuId: SkuId) {
			this.skuId = skuId;
		}

		private inOutVersion: string;

		getInOutVersion(): string {
			return this.inOutVersion;
		}

		setInOutVersion(inOutVersion: string) {
			this.inOutVersion = inOutVersion;
		}

	}
}

