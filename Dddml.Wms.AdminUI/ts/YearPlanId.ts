namespace Dddml.Wms.Domain {

	export class YearPlanId {

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

	}
}

