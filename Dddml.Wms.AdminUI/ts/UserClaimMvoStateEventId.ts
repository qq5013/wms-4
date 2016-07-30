namespace Dddml.Wms.Domain {

	export class UserClaimMvoStateEventId {

		private UserClaimId: UserClaimId;

		getUserClaimId(): UserClaimId {
			return this.UserClaimId;
		}

		setUserClaimId(userClaimId: UserClaimId) {
			// ???
			//if(!this.UserClaimId) {
			//    this.UserClaimId = new UserClaimId(); 
			//}
			this.UserClaimId = userClaimId;
		}

		private UserVersion: string;

		getUserVersion(): string {
			return this.UserVersion;
		}

		setUserVersion(userVersion: string) {
			this.UserVersion = userVersion;
		}

	}
}

