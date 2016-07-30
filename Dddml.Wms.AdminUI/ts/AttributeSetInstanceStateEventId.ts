namespace Dddml.Wms.Domain {

	export class AttributeSetInstanceStateEventId {

		private AttributeSetInstanceId: string;

		getAttributeSetInstanceId(): string {
			return this.AttributeSetInstanceId;
		}

		setAttributeSetInstanceId(attributeSetInstanceId: string) {
			this.AttributeSetInstanceId = attributeSetInstanceId;
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

