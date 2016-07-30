namespace Dddml.Wms.Domain {

	export class AttributeUseStateEventId {

		private AttributeSetId: string;

		getAttributeSetId(): string {
			return this.AttributeSetId;
		}

		setAttributeSetId(attributeSetId: string) {
			this.AttributeSetId = attributeSetId;
		}

		private AttributeId: string;

		getAttributeId(): string {
			return this.AttributeId;
		}

		setAttributeId(attributeId: string) {
			this.AttributeId = attributeId;
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

