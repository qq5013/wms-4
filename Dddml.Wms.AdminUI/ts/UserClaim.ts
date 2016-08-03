namespace Dddml.Wms.Domain {

	export class UserClaim {

		private claimId: number;

		getClaimId(): number {
			return this.claimId;
		}

		setClaimId(claimId: number) {
			this.claimId = claimId;
		}

		private claimType: string;

		getClaimType(): string {
			return this.claimType;
		}

		setClaimType(claimType: string) {
			this.claimType = claimType;
		}

		private claimValue: string;

		getClaimValue(): string {
			return this.claimValue;
		}

		setClaimValue(claimValue: string) {
			this.claimValue = claimValue;
		}

		private active: boolean;

		getActive(): boolean {
			return this.active;
		}

		setActive(active: boolean) {
			this.active = active;
		}

		private version: string;

		getVersion(): string {
			return this.version;
		}

		setVersion(version: string) {
			this.version = version;
		}

		private userId: string;

		getUserId(): string {
			return this.userId;
		}

		setUserId(userId: string) {
			this.userId = userId;
		}

		private createdBy: string;

		getCreatedBy(): string {
			return this.createdBy;
		}

		setCreatedBy(createdBy: string) {
			this.createdBy = createdBy;
		}

		private createdAt: string;

		getCreatedAt(): string {
			return this.createdAt;
		}

		setCreatedAt(createdAt: string) {
			this.createdAt = createdAt;
		}

		private updatedBy: string;

		getUpdatedBy(): string {
			return this.updatedBy;
		}

		setUpdatedBy(updatedBy: string) {
			this.updatedBy = updatedBy;
		}

		private updatedAt: string;

		getUpdatedAt(): string {
			return this.updatedAt;
		}

		setUpdatedAt(updatedAt: string) {
			this.updatedAt = updatedAt;
		}

	}
}

