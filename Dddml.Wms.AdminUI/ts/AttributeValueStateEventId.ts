namespace Dddml.Wms.Domain {

	export class AttributeValueStateEventId {

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

		private AttributeVersion: string;

		getAttributeVersion(): string {
			return this.AttributeVersion;
		}

		setAttributeVersion(attributeVersion: string) {
			this.AttributeVersion = attributeVersion;
		}

	}
}

