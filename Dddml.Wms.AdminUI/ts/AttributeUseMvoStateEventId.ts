namespace Dddml.Wms.Domain {

	export class AttributeUseMvoStateEventId {

		private attributeSetAttributeUseId: AttributeSetAttributeUseId;

		getAttributeSetAttributeUseId(): AttributeSetAttributeUseId {
			if(!this.attributeSetAttributeUseId) {
				this.attributeSetAttributeUseId = new AttributeSetAttributeUseId(); 
			}
			return this.attributeSetAttributeUseId;
		}

		setAttributeSetAttributeUseId(attributeSetAttributeUseId: AttributeSetAttributeUseId) {
			this.attributeSetAttributeUseId = attributeSetAttributeUseId;
		}

		private attributeSetVersion: string;

		getAttributeSetVersion(): string {
			return this.attributeSetVersion;
		}

		setAttributeSetVersion(attributeSetVersion: string) {
			this.attributeSetVersion = attributeSetVersion;
		}

	}
}

