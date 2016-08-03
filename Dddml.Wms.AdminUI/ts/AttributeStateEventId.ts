namespace Dddml.Wms.Domain {

	export class AttributeStateEventId {

		private attributeId: string;

		getAttributeId(): string {
			return this.attributeId;
		}

		setAttributeId(attributeId: string) {
			this.attributeId = attributeId;
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

