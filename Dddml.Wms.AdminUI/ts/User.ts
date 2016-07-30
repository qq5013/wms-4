namespace Dddml.Wms.Domain {

	export class User {

		private UserId: string;

		getUserId(): string {
			return this.UserId;
		}

		setUserId(userId: string) {
			this.UserId = userId;
		}

		private UserName: string;

		getUserName(): string {
			return this.UserName;
		}

		setUserName(userName: string) {
			this.UserName = userName;
		}

		private AccessFailedCount: number;

		getAccessFailedCount(): number {
			return this.AccessFailedCount;
		}

		setAccessFailedCount(accessFailedCount: number) {
			this.AccessFailedCount = accessFailedCount;
		}

		private Email: string;

		getEmail(): string {
			return this.Email;
		}

		setEmail(email: string) {
			this.Email = email;
		}

		private EmailConfirmed: boolean;

		getEmailConfirmed(): boolean {
			return this.EmailConfirmed;
		}

		setEmailConfirmed(emailConfirmed: boolean) {
			this.EmailConfirmed = emailConfirmed;
		}

		private LockoutEnabled: boolean;

		getLockoutEnabled(): boolean {
			return this.LockoutEnabled;
		}

		setLockoutEnabled(lockoutEnabled: boolean) {
			this.LockoutEnabled = lockoutEnabled;
		}

		private LockoutEndDateUtc: string;

		getLockoutEndDateUtc(): string {
			return this.LockoutEndDateUtc;
		}

		setLockoutEndDateUtc(lockoutEndDateUtc: string) {
			this.LockoutEndDateUtc = lockoutEndDateUtc;
		}

		private PasswordHash: string;

		getPasswordHash(): string {
			return this.PasswordHash;
		}

		setPasswordHash(passwordHash: string) {
			this.PasswordHash = passwordHash;
		}

		private PhoneNumber: string;

		getPhoneNumber(): string {
			return this.PhoneNumber;
		}

		setPhoneNumber(phoneNumber: string) {
			this.PhoneNumber = phoneNumber;
		}

		private PhoneNumberConfirmed: boolean;

		getPhoneNumberConfirmed(): boolean {
			return this.PhoneNumberConfirmed;
		}

		setPhoneNumberConfirmed(phoneNumberConfirmed: boolean) {
			this.PhoneNumberConfirmed = phoneNumberConfirmed;
		}

		private TwoFactorEnabled: boolean;

		getTwoFactorEnabled(): boolean {
			return this.TwoFactorEnabled;
		}

		setTwoFactorEnabled(twoFactorEnabled: boolean) {
			this.TwoFactorEnabled = twoFactorEnabled;
		}

		private SecurityStamp: string;

		getSecurityStamp(): string {
			return this.SecurityStamp;
		}

		setSecurityStamp(securityStamp: string) {
			this.SecurityStamp = securityStamp;
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

		private UserRoles: Array<UserRole>;

		getUserRoles() {
			return this.UserRoles;
		}
	
		setUserRoles(userRoles: Array<UserRole>){
			this.UserRoles = userRoles;
		}

		private UserClaims: Array<UserClaim>;

		getUserClaims() {
			return this.UserClaims;
		}
	
		setUserClaims(userClaims: Array<UserClaim>){
			this.UserClaims = userClaims;
		}

		private UserPermissions: Array<UserPermission>;

		getUserPermissions() {
			return this.UserPermissions;
		}
	
		setUserPermissions(userPermissions: Array<UserPermission>){
			this.UserPermissions = userPermissions;
		}

		private UserLogins: Array<UserLogin>;

		getUserLogins() {
			return this.UserLogins;
		}
	
		setUserLogins(userLogins: Array<UserLogin>){
			this.UserLogins = userLogins;
		}

	}
}

