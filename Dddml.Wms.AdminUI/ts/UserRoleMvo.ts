namespace Dddml.Wms.Domain {

	export class UserRoleMvo {

		private userRoleId: UserRoleId;

		getUserRoleId(): UserRoleId {
			return this.userRoleId;
		}

		setUserRoleId(userRoleId: UserRoleId) {
			this.userRoleId = userRoleId;
		}

		private version: string;

		getVersion(): string {
			return this.version;
		}

		setVersion(version: string) {
			this.version = version;
		}

		private active: boolean;

		getActive(): boolean {
			return this.active;
		}

		setActive(active: boolean) {
			this.active = active;
		}

		private userUserName: string;

		getUserUserName(): string {
			return this.userUserName;
		}

		setUserUserName(userUserName: string) {
			this.userUserName = userUserName;
		}

		private userAccessFailedCount: number;

		getUserAccessFailedCount(): number {
			return this.userAccessFailedCount;
		}

		setUserAccessFailedCount(userAccessFailedCount: number) {
			this.userAccessFailedCount = userAccessFailedCount;
		}

		private userEmail: string;

		getUserEmail(): string {
			return this.userEmail;
		}

		setUserEmail(userEmail: string) {
			this.userEmail = userEmail;
		}

		private userEmailConfirmed: boolean;

		getUserEmailConfirmed(): boolean {
			return this.userEmailConfirmed;
		}

		setUserEmailConfirmed(userEmailConfirmed: boolean) {
			this.userEmailConfirmed = userEmailConfirmed;
		}

		private userLockoutEnabled: boolean;

		getUserLockoutEnabled(): boolean {
			return this.userLockoutEnabled;
		}

		setUserLockoutEnabled(userLockoutEnabled: boolean) {
			this.userLockoutEnabled = userLockoutEnabled;
		}

		private userLockoutEndDateUtc: string;

		getUserLockoutEndDateUtc(): string {
			return this.userLockoutEndDateUtc;
		}

		setUserLockoutEndDateUtc(userLockoutEndDateUtc: string) {
			this.userLockoutEndDateUtc = userLockoutEndDateUtc;
		}

		private userPasswordHash: string;

		getUserPasswordHash(): string {
			return this.userPasswordHash;
		}

		setUserPasswordHash(userPasswordHash: string) {
			this.userPasswordHash = userPasswordHash;
		}

		private userPhoneNumber: string;

		getUserPhoneNumber(): string {
			return this.userPhoneNumber;
		}

		setUserPhoneNumber(userPhoneNumber: string) {
			this.userPhoneNumber = userPhoneNumber;
		}

		private userPhoneNumberConfirmed: boolean;

		getUserPhoneNumberConfirmed(): boolean {
			return this.userPhoneNumberConfirmed;
		}

		setUserPhoneNumberConfirmed(userPhoneNumberConfirmed: boolean) {
			this.userPhoneNumberConfirmed = userPhoneNumberConfirmed;
		}

		private userTwoFactorEnabled: boolean;

		getUserTwoFactorEnabled(): boolean {
			return this.userTwoFactorEnabled;
		}

		setUserTwoFactorEnabled(userTwoFactorEnabled: boolean) {
			this.userTwoFactorEnabled = userTwoFactorEnabled;
		}

		private userSecurityStamp: string;

		getUserSecurityStamp(): string {
			return this.userSecurityStamp;
		}

		setUserSecurityStamp(userSecurityStamp: string) {
			this.userSecurityStamp = userSecurityStamp;
		}

		private userCreatedBy: string;

		getUserCreatedBy(): string {
			return this.userCreatedBy;
		}

		setUserCreatedBy(userCreatedBy: string) {
			this.userCreatedBy = userCreatedBy;
		}

		private userCreatedAt: string;

		getUserCreatedAt(): string {
			return this.userCreatedAt;
		}

		setUserCreatedAt(userCreatedAt: string) {
			this.userCreatedAt = userCreatedAt;
		}

		private userUpdatedBy: string;

		getUserUpdatedBy(): string {
			return this.userUpdatedBy;
		}

		setUserUpdatedBy(userUpdatedBy: string) {
			this.userUpdatedBy = userUpdatedBy;
		}

		private userUpdatedAt: string;

		getUserUpdatedAt(): string {
			return this.userUpdatedAt;
		}

		setUserUpdatedAt(userUpdatedAt: string) {
			this.userUpdatedAt = userUpdatedAt;
		}

		private userActive: boolean;

		getUserActive(): boolean {
			return this.userActive;
		}

		setUserActive(userActive: boolean) {
			this.userActive = userActive;
		}

		private userDeleted: boolean;

		getUserDeleted(): boolean {
			return this.userDeleted;
		}

		setUserDeleted(userDeleted: boolean) {
			this.userDeleted = userDeleted;
		}

		private userVersion: string;

		getUserVersion(): string {
			return this.userVersion;
		}

		setUserVersion(userVersion: string) {
			this.userVersion = userVersion;
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

