namespace Dddml.Wms.Domain {

	export class AttributeValueId {

		private AttributeId: string;

		getAttributeId(): string {
			return this.AttributeId;
		}

		setAttributeId(attributeId: string) {
			this.AttributeId = attributeId;
		}

		private Value: string;

		getValue(): string {
			return this.Value;
		}

		setValue(value: string) {
			this.Value = value;
		}

	}
}

