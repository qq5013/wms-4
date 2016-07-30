namespace Dddml.Wms.Domain {

	export class AttributeValueMvoStateEventId {

		private AttributeValueId: AttributeValueId;

		getAttributeValueId(): AttributeValueId {
			if(!this.AttributeValueId) {
				this.AttributeValueId = new AttributeValueId(); 
			}
			return this.AttributeValueId;
		}

		setAttributeValueId(attributeValueId: AttributeValueId) {
			this.AttributeValueId = attributeValueId;
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

