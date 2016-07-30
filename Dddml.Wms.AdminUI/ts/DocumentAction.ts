namespace Dddml.Wms.Domain {

	export class DocumentAction {

		private Name: string;

		getName(): string {
			return this.Name;
		}

		setName(name: string) {
			this.Name = name;
		}

	}
}

