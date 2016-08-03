namespace Dddml.Wms.Domain {

	export class AttributeSetAttributeUseId {

		private attributeSetId: string;

		getAttributeSetId(): string {
			return this.attributeSetId;
		}

		setAttributeSetId(attributeSetId: string) {
			this.attributeSetId = attributeSetId;
		}

		private attributeId: string;

		getAttributeId(): string {
			return this.attributeId;
		}

		setAttributeId(attributeId: string) {
			this.attributeId = attributeId;
		}

	}
}

