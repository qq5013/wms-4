namespace Dddml.Wms.Domain {

	export class AttributeSetInstanceStateEventId {

		private attributeSetInstanceId: string;

		getAttributeSetInstanceId(): string {
			return this.attributeSetInstanceId;
		}

		setAttributeSetInstanceId(attributeSetInstanceId: string) {
			this.attributeSetInstanceId = attributeSetInstanceId;
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

