namespace Dddml.Wms.Domain {

	export class MonthPlanMvoStateEventId {

		private monthPlanId: MonthPlanId;

		getMonthPlanId(): MonthPlanId {
			if(!this.monthPlanId) {
				this.monthPlanId = new MonthPlanId(); 
			}
			return this.monthPlanId;
		}

		setMonthPlanId(monthPlanId: MonthPlanId) {
			this.monthPlanId = monthPlanId;
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

