namespace Dddml.Wms.Domain {

	export class DayPlanMvoStateEventId {

		private dayPlanId: DayPlanId;

		getDayPlanId(): DayPlanId {
			if(!this.dayPlanId) {
				this.dayPlanId = new DayPlanId(); 
			}
			return this.dayPlanId;
		}

		setDayPlanId(dayPlanId: DayPlanId) {
			this.dayPlanId = dayPlanId;
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

