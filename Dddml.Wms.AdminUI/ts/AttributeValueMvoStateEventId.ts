namespace Dddml.Wms.Domain {

	export class AttributeValueMvoStateEventId {

		private attributeValueId: AttributeValueId;

		getAttributeValueId(): AttributeValueId {
			if(!this.attributeValueId) {
				this.attributeValueId = new AttributeValueId(); 
			}
			return this.attributeValueId;
		}

		setAttributeValueId(attributeValueId: AttributeValueId) {
			this.attributeValueId = attributeValueId;
		}

		private attributeVersion: string;

		getAttributeVersion(): string {
			return this.attributeVersion;
		}

		setAttributeVersion(attributeVersion: string) {
			this.attributeVersion = attributeVersion;
		}

	}
}

