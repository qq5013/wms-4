namespace Dddml.Wms.Domain {

	export class PersonalName {

		private firstName: string;

		getFirstName(): string {
			return this.firstName;
		}

		setFirstName(firstName: string) {
			this.firstName = firstName;
		}

		private lastName: string;

		getLastName(): string {
			return this.lastName;
		}

		setLastName(lastName: string) {
			this.lastName = lastName;
		}

	}
}

