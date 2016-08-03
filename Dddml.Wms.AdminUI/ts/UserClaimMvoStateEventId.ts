namespace Dddml.Wms.Domain {

	export class UserClaimMvoStateEventId {

		private userClaimId: UserClaimId;

		getUserClaimId(): UserClaimId {
			if(!this.userClaimId) {
				this.userClaimId = new UserClaimId(); 
			}
			return this.userClaimId;
		}

		setUserClaimId(userClaimId: UserClaimId) {
			this.userClaimId = userClaimId;
		}

		private userVersion: string;

		getUserVersion(): string {
			return this.userVersion;
		}

		setUserVersion(userVersion: string) {
			this.userVersion = userVersion;
		}

	}
}

