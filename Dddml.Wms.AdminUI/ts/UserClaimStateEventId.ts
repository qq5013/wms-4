namespace Dddml.Wms.Domain {

	export class UserClaimStateEventId {

		private userId: string;

		getUserId(): string {
			return this.userId;
		}

		setUserId(userId: string) {
			this.userId = userId;
		}

		private claimId: number;

		getClaimId(): number {
			return this.claimId;
		}

		setClaimId(claimId: number) {
			this.claimId = claimId;
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

