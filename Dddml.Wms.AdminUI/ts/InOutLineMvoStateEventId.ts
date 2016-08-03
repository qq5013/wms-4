namespace Dddml.Wms.Domain {

	export class InOutLineMvoStateEventId {

		private inOutLineId: InOutLineId;

		getInOutLineId(): InOutLineId {
			if(!this.inOutLineId) {
				this.inOutLineId = new InOutLineId(); 
			}
			return this.inOutLineId;
		}

		setInOutLineId(inOutLineId: InOutLineId) {
			this.inOutLineId = inOutLineId;
		}

		private inOutVersion: string;

		getInOutVersion(): string {
			return this.inOutVersion;
		}

		setInOutVersion(inOutVersion: string) {
			this.inOutVersion = inOutVersion;
		}

	}
}

