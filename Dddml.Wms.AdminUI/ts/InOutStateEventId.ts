namespace Dddml.Wms.Domain {

	export class InOutStateEventId {

		private DocumentNumber: string;

		getDocumentNumber(): string {
			return this.DocumentNumber;
		}

		setDocumentNumber(documentNumber: string) {
			this.DocumentNumber = documentNumber;
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

