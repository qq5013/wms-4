namespace Dddml.Wms.Domain {

	export class TeamStateEventId {

		private teamName: string;

		getTeamName(): string {
			return this.teamName;
		}

		setTeamName(teamName: string) {
			this.teamName = teamName;
		}

		private version: string;

		getVersion(): string {
			return this.version;
		}

		setVersion(version: string) {
			this.version = version;
		}

	}
}

