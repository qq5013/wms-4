namespace Dddml.Wms.Domain {

	export class DayPlanId {

		private personalName: PersonalName;

		getPersonalName(): PersonalName {
			if(!this.personalName) {
				this.personalName = new PersonalName(); 
			}
			return this.personalName;
		}

		setPersonalName(personalName: PersonalName) {
			this.personalName = personalName;
		}

		private year: number;

		getYear(): number {
			return this.year;
		}

		setYear(year: number) {
			this.year = year;
		}

		private month: number;

		getMonth(): number {
			return this.month;
		}

		setMonth(month: number) {
			this.month = month;
		}

		private day: number;

		getDay(): number {
			return this.day;
		}

		setDay(day: number) {
			this.day = day;
		}

	}
}

