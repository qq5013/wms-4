namespace Dddml.Wms.Domain {

	export class AttributeSetStateEventId {

		private AttributeSetId: string;

		getAttributeSetId(): string {
			return this.AttributeSetId;
		}

		setAttributeSetId(attributeSetId: string) {
			this.AttributeSetId = attributeSetId;
		}

		private Version: string;

		getVersion(): string {
			return this.Version;
		}

		setVersion(version: string) {
			this.Version = version;
		}

	}
}

