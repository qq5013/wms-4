namespace Dddml.Wms.Domain {

	export class SkuId {

		private productId: string;

		getProductId(): string {
			return this.productId;
		}

		setProductId(productId: string) {
			this.productId = productId;
		}

		private attributeSetInstanceId: string;

		getAttributeSetInstanceId(): string {
			return this.attributeSetInstanceId;
		}

		setAttributeSetInstanceId(attributeSetInstanceId: string) {
			this.attributeSetInstanceId = attributeSetInstanceId;
		}

	}
}

