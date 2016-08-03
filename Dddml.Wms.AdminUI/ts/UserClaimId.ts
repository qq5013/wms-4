namespace Dddml.Wms.Domain {

	export class UserClaimId {

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

	}
}

