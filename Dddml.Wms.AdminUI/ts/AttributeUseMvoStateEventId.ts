namespace Dddml.Wms.Domain {

	export class AttributeUseMvoStateEventId {

		private AttributeSetAttributeUseId: AttributeSetAttributeUseId;

		getAttributeSetAttributeUseId(): AttributeSetAttributeUseId {
			if(!this.AttributeSetAttributeUseId) {
				this.AttributeSetAttributeUseId = new AttributeSetAttributeUseId(); 
			}
			return this.AttributeSetAttributeUseId;
		}

		setAttributeSetAttributeUseId(attributeSetAttributeUseId: AttributeSetAttributeUseId) {
			this.AttributeSetAttributeUseId = attributeSetAttributeUseId;
		}

		private AttributeSetVersion: string;

		getAttributeSetVersion(): string {
			return this.AttributeSetVersion;
		}

		setAttributeSetVersion(attributeSetVersion: string) {
			this.AttributeSetVersion = attributeSetVersion;
		}

	}
}

