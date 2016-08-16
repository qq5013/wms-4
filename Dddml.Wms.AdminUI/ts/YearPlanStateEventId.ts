namespace Dddml.Wms.Domain {

	export class YearPlanStateEventId {

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

		private personVersion: string;

		getPersonVersion(): string {
			return this.personVersion;
		}

		setPersonVersion(personVersion: string) {
			this.personVersion = personVersion;
		}

	}
}

