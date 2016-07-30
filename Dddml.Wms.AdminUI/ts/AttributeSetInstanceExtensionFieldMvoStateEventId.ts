namespace Dddml.Wms.Domain {

	export class AttributeSetInstanceExtensionFieldMvoStateEventId {

		private AttributeSetInstanceExtensionFieldId: AttributeSetInstanceExtensionFieldId;

		getAttributeSetInstanceExtensionFieldId(): AttributeSetInstanceExtensionFieldId {
			return this.AttributeSetInstanceExtensionFieldId;
		}

		setAttributeSetInstanceExtensionFieldId(attributeSetInstanceExtensionFieldId: AttributeSetInstanceExtensionFieldId) {
			// ???
			//if(!this.AttributeSetInstanceExtensionFieldId) {
			//    this.AttributeSetInstanceExtensionFieldId = new AttributeSetInstanceExtensionFieldId(); 
			//}
			this.AttributeSetInstanceExtensionFieldId = attributeSetInstanceExtensionFieldId;
		}

		private AttrSetInstEFGroupVersion: string;

		getAttrSetInstEFGroupVersion(): string {
			return this.AttrSetInstEFGroupVersion;
		}

		setAttrSetInstEFGroupVersion(attrSetInstEFGroupVersion: string) {
			this.AttrSetInstEFGroupVersion = attrSetInstEFGroupVersion;
		}

	}
}

