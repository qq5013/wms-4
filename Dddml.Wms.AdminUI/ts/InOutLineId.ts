namespace Dddml.Wms.Domain {

	export class InOutLineId {

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

	}
}

