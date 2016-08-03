namespace Dddml.Wms.Domain {

	export class InOutLineId {

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

	}
}

