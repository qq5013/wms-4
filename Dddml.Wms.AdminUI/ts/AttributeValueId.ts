namespace Dddml.Wms.Domain {

	export class AttributeValueId {

		private attributeId: string;

		getAttributeId(): string {
			return this.attributeId;
		}

		setAttributeId(attributeId: string) {
			this.attributeId = attributeId;
		}

		private value: string;

		getValue(): string {
			return this.value;
		}

		setValue(value: string) {
			this.value = value;
		}

	}
}

