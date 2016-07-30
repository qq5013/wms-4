namespace Dddml.Wms.Domain {

	export class UserClaim {

		private ClaimId: number;

		getClaimId(): number {
			return this.ClaimId;
		}

		setClaimId(claimId: number) {
			this.ClaimId = claimId;
		}

		private ClaimType: string;

		getClaimType(): string {
			return this.ClaimType;
		}

		setClaimType(claimType: string) {
			this.ClaimType = claimType;
		}

		private ClaimValue: string;

		getClaimValue(): string {
			return this.ClaimValue;
		}

		setClaimValue(claimValue: string) {
			this.ClaimValue = claimValue;
		}

		private Active: boolean;

		getActive(): boolean {
			return this.Active;
		}

		setActive(active: boolean) {
			this.Active = active;
		}

		private Version: string;

		getVersion(): string {
			return this.Version;
		}

		setVersion(version: string) {
			this.Version = version;
		}

		private UserId: string;

		getUserId(): string {
			return this.UserId;
		}

		setUserId(userId: string) {
			this.UserId = userId;
		}

		private CreatedBy: string;

		getCreatedBy(): string {
			return this.CreatedBy;
		}

		setCreatedBy(createdBy: string) {
			this.CreatedBy = createdBy;
		}

		private CreatedAt: string;

		getCreatedAt(): string {
			return this.CreatedAt;
		}

		setCreatedAt(createdAt: string) {
			this.CreatedAt = createdAt;
		}

		private UpdatedBy: string;

		getUpdatedBy(): string {
			return this.UpdatedBy;
		}

		setUpdatedBy(updatedBy: string) {
			this.UpdatedBy = updatedBy;
		}

		private UpdatedAt: string;

		getUpdatedAt(): string {
			return this.UpdatedAt;
		}

		setUpdatedAt(updatedAt: string) {
			this.UpdatedAt = updatedAt;
		}

	}
}

