namespace Dddml.Wms.Domain {

	export class Person {

		private personalName: PersonalName;

		getPersonalName(): PersonalName {
			return this.personalName;
		}

		setPersonalName(personalName: PersonalName) {
			this.personalName = personalName;
		}

		private birthDate: string;

		getBirthDate(): string {
			return this.birthDate;
		}

		setBirthDate(birthDate: string) {
			this.birthDate = birthDate;
		}

		private loves: PersonalName;

		getLoves(): PersonalName {
			return this.loves;
		}

		setLoves(loves: PersonalName) {
			this.loves = loves;
		}

		private active: boolean;

		getActive(): boolean {
			return this.active;
		}

		setActive(active: boolean) {
			this.active = active;
		}

		private version: string;

		getVersion(): string {
			return this.version;
		}

		setVersion(version: string) {
			this.version = version;
		}

		private createdBy: string;

		getCreatedBy(): string {
			return this.createdBy;
		}

		setCreatedBy(createdBy: string) {
			this.createdBy = createdBy;
		}

		private createdAt: string;

		getCreatedAt(): string {
			return this.createdAt;
		}

		setCreatedAt(createdAt: string) {
			this.createdAt = createdAt;
		}

		private updatedBy: string;

		getUpdatedBy(): string {
			return this.updatedBy;
		}

		setUpdatedBy(updatedBy: string) {
			this.updatedBy = updatedBy;
		}

		private updatedAt: string;

		getUpdatedAt(): string {
			return this.updatedAt;
		}

		setUpdatedAt(updatedAt: string) {
			this.updatedAt = updatedAt;
		}

		private yearPlans: Array<YearPlan>;

		getYearPlans() {
			return this.yearPlans;
		}
	
		setYearPlans(yearPlans: Array<YearPlan>){
			this.yearPlans = yearPlans;
		}

	}
}

