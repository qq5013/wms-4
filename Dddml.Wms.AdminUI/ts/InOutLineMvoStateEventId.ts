namespace Dddml.Wms.Domain {

	export class InOutLineMvoStateEventId {

		private InOutLineId: InOutLineId;

		getInOutLineId(): InOutLineId {
			if(!this.InOutLineId) {
				this.InOutLineId = new InOutLineId(); 
			}
			return this.InOutLineId;
		}

		setInOutLineId(inOutLineId: InOutLineId) {
			this.InOutLineId = inOutLineId;
		}

		private InOutVersion: string;

		getInOutVersion(): string {
			return this.InOutVersion;
		}

		setInOutVersion(inOutVersion: string) {
			this.InOutVersion = inOutVersion;
		}

	}
}

