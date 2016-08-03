namespace Dddml.Wms.Domain {

	export class User {

		private userId: string;

		getUserId(): string {
			return this.userId;
		}

		setUserId(userId: string) {
			this.userId = userId;
		}

		private userName: string;

		getUserName(): string {
			return this.userName;
		}

		setUserName(userName: string) {
			this.userName = userName;
		}

		private accessFailedCount: number;

		getAccessFailedCount(): number {
			return this.accessFailedCount;
		}

		setAccessFailedCount(accessFailedCount: number) {
			this.accessFailedCount = accessFailedCount;
		}

		private email: string;

		getEmail(): string {
			return this.email;
		}

		setEmail(email: string) {
			this.email = email;
		}

		private emailConfirmed: boolean;

		getEmailConfirmed(): boolean {
			return this.emailConfirmed;
		}

		setEmailConfirmed(emailConfirmed: boolean) {
			this.emailConfirmed = emailConfirmed;
		}

		private lockoutEnabled: boolean;

		getLockoutEnabled(): boolean {
			return this.lockoutEnabled;
		}

		setLockoutEnabled(lockoutEnabled: boolean) {
			this.lockoutEnabled = lockoutEnabled;
		}

		private lockoutEndDateUtc: string;

		getLockoutEndDateUtc(): string {
			return this.lockoutEndDateUtc;
		}

		setLockoutEndDateUtc(lockoutEndDateUtc: string) {
			this.lockoutEndDateUtc = lockoutEndDateUtc;
		}

		private passwordHash: string;

		getPasswordHash(): string {
			return this.passwordHash;
		}

		setPasswordHash(passwordHash: string) {
			this.passwordHash = passwordHash;
		}

		private phoneNumber: string;

		getPhoneNumber(): string {
			return this.phoneNumber;
		}

		setPhoneNumber(phoneNumber: string) {
			this.phoneNumber = phoneNumber;
		}

		private phoneNumberConfirmed: boolean;

		getPhoneNumberConfirmed(): boolean {
			return this.phoneNumberConfirmed;
		}

		setPhoneNumberConfirmed(phoneNumberConfirmed: boolean) {
			this.phoneNumberConfirmed = phoneNumberConfirmed;
		}

		private twoFactorEnabled: boolean;

		getTwoFactorEnabled(): boolean {
			return this.twoFactorEnabled;
		}

		setTwoFactorEnabled(twoFactorEnabled: boolean) {
			this.twoFactorEnabled = twoFactorEnabled;
		}

		private securityStamp: string;

		getSecurityStamp(): string {
			return this.securityStamp;
		}

		setSecurityStamp(securityStamp: string) {
			this.securityStamp = securityStamp;
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

		private userRoles: Array<UserRole>;

		getUserRoles() {
			return this.userRoles;
		}
	
		setUserRoles(userRoles: Array<UserRole>){
			this.userRoles = userRoles;
		}

		private userClaims: Array<UserClaim>;

		getUserClaims() {
			return this.userClaims;
		}
	
		setUserClaims(userClaims: Array<UserClaim>){
			this.userClaims = userClaims;
		}

		private userPermissions: Array<UserPermission>;

		getUserPermissions() {
			return this.userPermissions;
		}
	
		setUserPermissions(userPermissions: Array<UserPermission>){
			this.userPermissions = userPermissions;
		}

		private userLogins: Array<UserLogin>;

		getUserLogins() {
			return this.userLogins;
		}
	
		setUserLogins(userLogins: Array<UserLogin>){
			this.userLogins = userLogins;
		}

	}
}

