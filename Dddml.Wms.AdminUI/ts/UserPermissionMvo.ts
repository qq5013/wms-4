namespace Dddml.Wms.Domain {

	export class UserPermissionMvo {

		private UserPermissionId: UserPermissionId;

		getUserPermissionId(): UserPermissionId {
			return this.UserPermissionId;
		}

		setUserPermissionId(userPermissionId: UserPermissionId) {
			this.UserPermissionId = userPermissionId;
		}

		private Version: string;

		getVersion(): string {
			return this.Version;
		}

		setVersion(version: string) {
			this.Version = version;
		}

		private Active: boolean;

		getActive(): boolean {
			return this.Active;
		}

		setActive(active: boolean) {
			this.Active = active;
		}

		private UserUserName: string;

		getUserUserName(): string {
			return this.UserUserName;
		}

		setUserUserName(userUserName: string) {
			this.UserUserName = userUserName;
		}

		private UserAccessFailedCount: number;

		getUserAccessFailedCount(): number {
			return this.UserAccessFailedCount;
		}

		setUserAccessFailedCount(userAccessFailedCount: number) {
			this.UserAccessFailedCount = userAccessFailedCount;
		}

		private UserEmail: string;

		getUserEmail(): string {
			return this.UserEmail;
		}

		setUserEmail(userEmail: string) {
			this.UserEmail = userEmail;
		}

		private UserEmailConfirmed: boolean;

		getUserEmailConfirmed(): boolean {
			return this.UserEmailConfirmed;
		}

		setUserEmailConfirmed(userEmailConfirmed: boolean) {
			this.UserEmailConfirmed = userEmailConfirmed;
		}

		private UserLockoutEnabled: boolean;

		getUserLockoutEnabled(): boolean {
			return this.UserLockoutEnabled;
		}

		setUserLockoutEnabled(userLockoutEnabled: boolean) {
			this.UserLockoutEnabled = userLockoutEnabled;
		}

		private UserLockoutEndDateUtc: string;

		getUserLockoutEndDateUtc(): string {
			return this.UserLockoutEndDateUtc;
		}

		setUserLockoutEndDateUtc(userLockoutEndDateUtc: string) {
			this.UserLockoutEndDateUtc = userLockoutEndDateUtc;
		}

		private UserPasswordHash: string;

		getUserPasswordHash(): string {
			return this.UserPasswordHash;
		}

		setUserPasswordHash(userPasswordHash: string) {
			this.UserPasswordHash = userPasswordHash;
		}

		private UserPhoneNumber: string;

		getUserPhoneNumber(): string {
			return this.UserPhoneNumber;
		}

		setUserPhoneNumber(userPhoneNumber: string) {
			this.UserPhoneNumber = userPhoneNumber;
		}

		private UserPhoneNumberConfirmed: boolean;

		getUserPhoneNumberConfirmed(): boolean {
			return this.UserPhoneNumberConfirmed;
		}

		setUserPhoneNumberConfirmed(userPhoneNumberConfirmed: boolean) {
			this.UserPhoneNumberConfirmed = userPhoneNumberConfirmed;
		}

		private UserTwoFactorEnabled: boolean;

		getUserTwoFactorEnabled(): boolean {
			return this.UserTwoFactorEnabled;
		}

		setUserTwoFactorEnabled(userTwoFactorEnabled: boolean) {
			this.UserTwoFactorEnabled = userTwoFactorEnabled;
		}

		private UserSecurityStamp: string;

		getUserSecurityStamp(): string {
			return this.UserSecurityStamp;
		}

		setUserSecurityStamp(userSecurityStamp: string) {
			this.UserSecurityStamp = userSecurityStamp;
		}

		private UserCreatedBy: string;

		getUserCreatedBy(): string {
			return this.UserCreatedBy;
		}

		setUserCreatedBy(userCreatedBy: string) {
			this.UserCreatedBy = userCreatedBy;
		}

		private UserCreatedAt: string;

		getUserCreatedAt(): string {
			return this.UserCreatedAt;
		}

		setUserCreatedAt(userCreatedAt: string) {
			this.UserCreatedAt = userCreatedAt;
		}

		private UserUpdatedBy: string;

		getUserUpdatedBy(): string {
			return this.UserUpdatedBy;
		}

		setUserUpdatedBy(userUpdatedBy: string) {
			this.UserUpdatedBy = userUpdatedBy;
		}

		private UserUpdatedAt: string;

		getUserUpdatedAt(): string {
			return this.UserUpdatedAt;
		}

		setUserUpdatedAt(userUpdatedAt: string) {
			this.UserUpdatedAt = userUpdatedAt;
		}

		private UserActive: boolean;

		getUserActive(): boolean {
			return this.UserActive;
		}

		setUserActive(userActive: boolean) {
			this.UserActive = userActive;
		}

		private UserDeleted: boolean;

		getUserDeleted(): boolean {
			return this.UserDeleted;
		}

		setUserDeleted(userDeleted: boolean) {
			this.UserDeleted = userDeleted;
		}

		private UserVersion: string;

		getUserVersion(): string {
			return this.UserVersion;
		}

		setUserVersion(userVersion: string) {
			this.UserVersion = userVersion;
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

