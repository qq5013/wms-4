namespace Dddml.Wms.Domain {

	export class InOutStateEventId {

		private documentNumber: string;

		getDocumentNumber(): string {
			return this.documentNumber;
		}

		setDocumentNumber(documentNumber: string) {
			this.documentNumber = documentNumber;
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

