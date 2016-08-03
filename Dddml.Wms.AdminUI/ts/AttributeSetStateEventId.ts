namespace Dddml.Wms.Domain {

	export class AttributeSetStateEventId {

		private attributeSetId: string;

		getAttributeSetId(): string {
			return this.attributeSetId;
		}

		setAttributeSetId(attributeSetId: string) {
			this.attributeSetId = attributeSetId;
		}

		private version: string;

		getVersion(): string {
			return this.version;
		}

		setVersion(version: string) {
			this.version = version;
		}

	}
}

