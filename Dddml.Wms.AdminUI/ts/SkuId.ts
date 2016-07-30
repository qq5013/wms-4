namespace Dddml.Wms.Domain {

	export class SkuId {

		private ProductId: string;

		getProductId(): string {
			return this.ProductId;
		}

		setProductId(productId: string) {
			this.ProductId = productId;
		}

		private AttributeSetInstanceId: string;

		getAttributeSetInstanceId(): string {
			return this.AttributeSetInstanceId;
		}

		setAttributeSetInstanceId(attributeSetInstanceId: string) {
			this.AttributeSetInstanceId = attributeSetInstanceId;
		}

	}
}

