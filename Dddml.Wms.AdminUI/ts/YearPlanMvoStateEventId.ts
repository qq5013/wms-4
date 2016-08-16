namespace Dddml.Wms.Domain {

	export class YearPlanMvoStateEventId {

		private yearPlanId: YearPlanId;

		getYearPlanId(): YearPlanId {
			if(!this.yearPlanId) {
				this.yearPlanId = new YearPlanId(); 
			}
			return this.yearPlanId;
		}

		setYearPlanId(yearPlanId: YearPlanId) {
			this.yearPlanId = yearPlanId;
		}

		private personVersion: string;

		getPersonVersion(): string {
			return this.personVersion;
		}

		setPersonVersion(personVersion: string) {
			this.personVersion = personVersion;
		}

	}
}

