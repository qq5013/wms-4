namespace Dddml.Wms.Domain {

	export class InOutLineStateEventId {

		private InOutDocumentNumber: string;

		getInOutDocumentNumber(): string {
			return this.InOutDocumentNumber;
		}

		setInOutDocumentNumber(inOutDocumentNumber: string) {
			this.InOutDocumentNumber = inOutDocumentNumber;
		}

		private SkuId: SkuId;

		getSkuId(): SkuId {
			if(!this.SkuId) {
				this.SkuId = new SkuId(); 
			}
			return this.SkuId;
		}

		setSkuId(skuId: SkuId) {
			this.SkuId = skuId;
		}

		private InOutVersion: string;

		getInOutVersion(): string {
			return this.InOutVersion;
		}

		setInOutVersion(inOutVersion: string) {
			this.InOutVersion = inOutVersion;
		}

	}
}

