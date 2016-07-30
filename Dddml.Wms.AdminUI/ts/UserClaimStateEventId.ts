namespace Dddml.Wms.Domain {

	export class UserClaimStateEventId {

		private UserId: string;

		getUserId(): string {
			return this.UserId;
		}

		setUserId(userId: string) {
			this.UserId = userId;
		}

		private ClaimId: number;

		getClaimId(): number {
			return this.ClaimId;
		}

		setClaimId(claimId: number) {
			this.ClaimId = claimId;
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

