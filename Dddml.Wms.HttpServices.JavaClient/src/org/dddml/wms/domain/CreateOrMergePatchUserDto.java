package org.dddml.wms.domain;

import java.util.Date;

public class CreateOrMergePatchUserDto extends AbstractUserCommandDto
{
    private String userName;

    public String getUserName()
    {
        return this.userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    private Integer accessFailedCount;

    public Integer getAccessFailedCount()
    {
        return this.accessFailedCount;
    }

    public void setAccessFailedCount(Integer accessFailedCount)
    {
        this.accessFailedCount = accessFailedCount;
    }

    private String email;

    public String getEmail()
    {
        return this.email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    private Boolean emailConfirmed;

    public Boolean getEmailConfirmed()
    {
        return this.emailConfirmed;
    }

    public void setEmailConfirmed(Boolean emailConfirmed)
    {
        this.emailConfirmed = emailConfirmed;
    }

    private Boolean lockoutEnabled;

    public Boolean getLockoutEnabled()
    {
        return this.lockoutEnabled;
    }

    public void setLockoutEnabled(Boolean lockoutEnabled)
    {
        this.lockoutEnabled = lockoutEnabled;
    }

    private Date lockoutEndDateUtc;

    public Date getLockoutEndDateUtc()
    {
        return this.lockoutEndDateUtc;
    }

    public void setLockoutEndDateUtc(Date lockoutEndDateUtc)
    {
        this.lockoutEndDateUtc = lockoutEndDateUtc;
    }

    private String passwordHash;

    public String getPasswordHash()
    {
        return this.passwordHash;
    }

    public void setPasswordHash(String passwordHash)
    {
        this.passwordHash = passwordHash;
    }

    private String phoneNumber;

    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    private Boolean phoneNumberConfirmed;

    public Boolean getPhoneNumberConfirmed()
    {
        return this.phoneNumberConfirmed;
    }

    public void setPhoneNumberConfirmed(Boolean phoneNumberConfirmed)
    {
        this.phoneNumberConfirmed = phoneNumberConfirmed;
    }

    private Boolean twoFactorEnabled;

    public Boolean getTwoFactorEnabled()
    {
        return this.twoFactorEnabled;
    }

    public void setTwoFactorEnabled(Boolean twoFactorEnabled)
    {
        this.twoFactorEnabled = twoFactorEnabled;
    }

    private String securityStamp;

    public String getSecurityStamp()
    {
        return this.securityStamp;
    }

    public void setSecurityStamp(String securityStamp)
    {
        this.securityStamp = securityStamp;
    }

    private Boolean active;

    public Boolean getActive()
    {
        return this.active;
    }

    public void setActive(Boolean active)
    {
        this.active = active;
    }

    private CreateOrMergePatchUserRoleDto[] userRoles;

    public CreateOrMergePatchUserRoleDto[] getUserRoles()
    {
        return this.userRoles;
    }

    public void setUserRoles(CreateOrMergePatchUserRoleDto[] userRoles)
    {
        this.userRoles = userRoles;
    }

    private CreateOrMergePatchUserClaimDto[] userClaims;

    public CreateOrMergePatchUserClaimDto[] getUserClaims()
    {
        return this.userClaims;
    }

    public void setUserClaims(CreateOrMergePatchUserClaimDto[] userClaims)
    {
        this.userClaims = userClaims;
    }

    private CreateOrMergePatchUserPermissionDto[] userPermissions;

    public CreateOrMergePatchUserPermissionDto[] getUserPermissions()
    {
        return this.userPermissions;
    }

    public void setUserPermissions(CreateOrMergePatchUserPermissionDto[] userPermissions)
    {
        this.userPermissions = userPermissions;
    }

    private CreateOrMergePatchUserLoginDto[] userLogins;

    public CreateOrMergePatchUserLoginDto[] getUserLogins()
    {
        return this.userLogins;
    }

    public void setUserLogins(CreateOrMergePatchUserLoginDto[] userLogins)
    {
        this.userLogins = userLogins;
    }

    private Boolean isPropertyUserNameRemoved;

    public Boolean getIsPropertyUserNameRemoved()
    {
        return this.isPropertyUserNameRemoved;
    }

    public void setIsPropertyUserNameRemoved(Boolean isPropertyUserNameRemoved)
    {
        this.isPropertyUserNameRemoved = isPropertyUserNameRemoved;
    }

    private Boolean isPropertyAccessFailedCountRemoved;

    public Boolean getIsPropertyAccessFailedCountRemoved()
    {
        return this.isPropertyAccessFailedCountRemoved;
    }

    public void setIsPropertyAccessFailedCountRemoved(Boolean isPropertyAccessFailedCountRemoved)
    {
        this.isPropertyAccessFailedCountRemoved = isPropertyAccessFailedCountRemoved;
    }

    private Boolean isPropertyEmailRemoved;

    public Boolean getIsPropertyEmailRemoved()
    {
        return this.isPropertyEmailRemoved;
    }

    public void setIsPropertyEmailRemoved(Boolean isPropertyEmailRemoved)
    {
        this.isPropertyEmailRemoved = isPropertyEmailRemoved;
    }

    private Boolean isPropertyEmailConfirmedRemoved;

    public Boolean getIsPropertyEmailConfirmedRemoved()
    {
        return this.isPropertyEmailConfirmedRemoved;
    }

    public void setIsPropertyEmailConfirmedRemoved(Boolean isPropertyEmailConfirmedRemoved)
    {
        this.isPropertyEmailConfirmedRemoved = isPropertyEmailConfirmedRemoved;
    }

    private Boolean isPropertyLockoutEnabledRemoved;

    public Boolean getIsPropertyLockoutEnabledRemoved()
    {
        return this.isPropertyLockoutEnabledRemoved;
    }

    public void setIsPropertyLockoutEnabledRemoved(Boolean isPropertyLockoutEnabledRemoved)
    {
        this.isPropertyLockoutEnabledRemoved = isPropertyLockoutEnabledRemoved;
    }

    private Boolean isPropertyLockoutEndDateUtcRemoved;

    public Boolean getIsPropertyLockoutEndDateUtcRemoved()
    {
        return this.isPropertyLockoutEndDateUtcRemoved;
    }

    public void setIsPropertyLockoutEndDateUtcRemoved(Boolean isPropertyLockoutEndDateUtcRemoved)
    {
        this.isPropertyLockoutEndDateUtcRemoved = isPropertyLockoutEndDateUtcRemoved;
    }

    private Boolean isPropertyPasswordHashRemoved;

    public Boolean getIsPropertyPasswordHashRemoved()
    {
        return this.isPropertyPasswordHashRemoved;
    }

    public void setIsPropertyPasswordHashRemoved(Boolean isPropertyPasswordHashRemoved)
    {
        this.isPropertyPasswordHashRemoved = isPropertyPasswordHashRemoved;
    }

    private Boolean isPropertyPhoneNumberRemoved;

    public Boolean getIsPropertyPhoneNumberRemoved()
    {
        return this.isPropertyPhoneNumberRemoved;
    }

    public void setIsPropertyPhoneNumberRemoved(Boolean isPropertyPhoneNumberRemoved)
    {
        this.isPropertyPhoneNumberRemoved = isPropertyPhoneNumberRemoved;
    }

    private Boolean isPropertyPhoneNumberConfirmedRemoved;

    public Boolean getIsPropertyPhoneNumberConfirmedRemoved()
    {
        return this.isPropertyPhoneNumberConfirmedRemoved;
    }

    public void setIsPropertyPhoneNumberConfirmedRemoved(Boolean isPropertyPhoneNumberConfirmedRemoved)
    {
        this.isPropertyPhoneNumberConfirmedRemoved = isPropertyPhoneNumberConfirmedRemoved;
    }

    private Boolean isPropertyTwoFactorEnabledRemoved;

    public Boolean getIsPropertyTwoFactorEnabledRemoved()
    {
        return this.isPropertyTwoFactorEnabledRemoved;
    }

    public void setIsPropertyTwoFactorEnabledRemoved(Boolean isPropertyTwoFactorEnabledRemoved)
    {
        this.isPropertyTwoFactorEnabledRemoved = isPropertyTwoFactorEnabledRemoved;
    }

    private Boolean isPropertySecurityStampRemoved;

    public Boolean getIsPropertySecurityStampRemoved()
    {
        return this.isPropertySecurityStampRemoved;
    }

    public void setIsPropertySecurityStampRemoved(Boolean isPropertySecurityStampRemoved)
    {
        this.isPropertySecurityStampRemoved = isPropertySecurityStampRemoved;
    }

    private Boolean isPropertyActiveRemoved;

    public Boolean getIsPropertyActiveRemoved()
    {
        return this.isPropertyActiveRemoved;
    }

    public void setIsPropertyActiveRemoved(Boolean isPropertyActiveRemoved)
    {
        this.isPropertyActiveRemoved = isPropertyActiveRemoved;
    }


    public static class CreateUserDto extends CreateOrMergePatchUserDto
    {
        @Override
        public String getCommandType() {
            return AbstractCommandDto.COMMAND_TYPE_CREATE;
        }

    }

    public static class MergePatchUserDto extends CreateOrMergePatchUserDto
    {
        @Override
        public String getCommandType() {
            return AbstractCommandDto.COMMAND_TYPE_MERGE_PATCH;
        }

    }

}

