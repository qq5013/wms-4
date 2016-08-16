namespace Dddml.Wms.Domain {

	export class YearPlanMvo {

		private yearPlanId: YearPlanId;

		getYearPlanId(): YearPlanId {
			return this.yearPlanId;
		}

		setYearPlanId(yearPlanId: YearPlanId) {
			this.yearPlanId = yearPlanId;
		}

		private description: string;

		getDescription(): string {
			return this.description;
		}

		setDescription(description: string) {
			this.description = description;
		}

		private version: string;

		getVersion(): string {
			return this.version;
		}

		setVersion(version: string) {
			this.version = version;
		}

		private active: boolean;

		getActive(): boolean {
			return this.active;
		}

		setActive(active: boolean) {
			this.active = active;
		}

		private personBirthDate: string;

		getPersonBirthDate(): string {
			return this.personBirthDate;
		}

		setPersonBirthDate(personBirthDate: string) {
			this.personBirthDate = personBirthDate;
		}

		private personLoves: PersonalName;

		getPersonLoves(): PersonalName {
			return this.personLoves;
		}

		setPersonLoves(personLoves: PersonalName) {
			this.personLoves = personLoves;
		}

		private personCreatedBy: string;

		getPersonCreatedBy(): string {
			return this.personCreatedBy;
		}

		setPersonCreatedBy(personCreatedBy: string) {
			this.personCreatedBy = personCreatedBy;
		}

		private personCreatedAt: string;

		getPersonCreatedAt(): string {
			return this.personCreatedAt;
		}

		setPersonCreatedAt(personCreatedAt: string) {
			this.personCreatedAt = personCreatedAt;
		}

		private personUpdatedBy: string;

		getPersonUpdatedBy(): string {
			return this.personUpdatedBy;
		}

		setPersonUpdatedBy(personUpdatedBy: string) {
			this.personUpdatedBy = personUpdatedBy;
		}

		private personUpdatedAt: string;

		getPersonUpdatedAt(): string {
			return this.personUpdatedAt;
		}

		setPersonUpdatedAt(personUpdatedAt: string) {
			this.personUpdatedAt = personUpdatedAt;
		}

		private personActive: boolean;

		getPersonActive(): boolean {
			return this.personActive;
		}

		setPersonActive(personActive: boolean) {
			this.personActive = personActive;
		}

		private personDeleted: boolean;

		getPersonDeleted(): boolean {
			return this.personDeleted;
		}

		setPersonDeleted(personDeleted: boolean) {
			this.personDeleted = personDeleted;
		}

		private personVersion: string;

		getPersonVersion(): string {
			return this.personVersion;
		}

		setPersonVersion(personVersion: string) {
			this.personVersion = personVersion;
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

	}
}

