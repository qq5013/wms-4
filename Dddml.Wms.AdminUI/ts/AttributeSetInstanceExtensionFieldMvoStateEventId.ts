namespace Dddml.Wms.Domain {

	export class AttributeSetInstanceExtensionFieldMvoStateEventId {

		private attributeSetInstanceExtensionFieldId: AttributeSetInstanceExtensionFieldId;

		getAttributeSetInstanceExtensionFieldId(): AttributeSetInstanceExtensionFieldId {
			if(!this.attributeSetInstanceExtensionFieldId) {
				this.attributeSetInstanceExtensionFieldId = new AttributeSetInstanceExtensionFieldId(); 
			}
			return this.attributeSetInstanceExtensionFieldId;
		}

		setAttributeSetInstanceExtensionFieldId(attributeSetInstanceExtensionFieldId: AttributeSetInstanceExtensionFieldId) {
			this.attributeSetInstanceExtensionFieldId = attributeSetInstanceExtensionFieldId;
		}

		private attrSetInstEFGroupVersion: string;

		getAttrSetInstEFGroupVersion(): string {
			return this.attrSetInstEFGroupVersion;
		}

		setAttrSetInstEFGroupVersion(attrSetInstEFGroupVersion: string) {
			this.attrSetInstEFGroupVersion = attrSetInstEFGroupVersion;
		}

	}
}

