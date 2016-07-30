namespace Dddml.Wms.Domain {

	export class UserClaimId {

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

	}
}

