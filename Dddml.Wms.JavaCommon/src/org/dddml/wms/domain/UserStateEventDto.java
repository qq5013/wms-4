package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.AbstractStateEventDto;

public class UserStateEventDto extends AbstractStateEventDto
{
    private String stateEventType;

    public String getStateEventType() {
        return this.stateEventType;
    }

    public void setStateEventType(String type)
    {
        this.stateEventType = type;
    }

    private UserStateEventIdDto stateEventId;

    public UserStateEventIdDto getStateEventId() {
        return this.stateEventId;
    }

    public void getStateEventId(UserStateEventIdDto stateEventId) {
        this.stateEventId = stateEventId;
    }

    private String userName;

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private Integer accessFailedCount;

    public Integer getAccessFailedCount() {
        return this.accessFailedCount;
    }

    public void setAccessFailedCount(Integer accessFailedCount) {
        this.accessFailedCount = accessFailedCount;
    }

    private String email;

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private Boolean emailConfirmed;

    public Boolean getEmailConfirmed() {
        return this.emailConfirmed;
    }

    public void setEmailConfirmed(Boolean emailConfirmed) {
        this.emailConfirmed = emailConfirmed;
    }

    private Boolean lockoutEnabled;

    public Boolean getLockoutEnabled() {
        return this.lockoutEnabled;
    }

    public void setLockoutEnabled(Boolean lockoutEnabled) {
        this.lockoutEnabled = lockoutEnabled;
    }

    private Date lockoutEndDateUtc;

    public Date getLockoutEndDateUtc() {
        return this.lockoutEndDateUtc;
    }

    public void setLockoutEndDateUtc(Date lockoutEndDateUtc) {
        this.lockoutEndDateUtc = lockoutEndDateUtc;
    }

    private String passwordHash;

    public String getPasswordHash() {
        return this.passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    private String phoneNumber;

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private Boolean phoneNumberConfirmed;

    public Boolean getPhoneNumberConfirmed() {
        return this.phoneNumberConfirmed;
    }

    public void setPhoneNumberConfirmed(Boolean phoneNumberConfirmed) {
        this.phoneNumberConfirmed = phoneNumberConfirmed;
    }

    private Boolean twoFactorEnabled;

    public Boolean getTwoFactorEnabled() {
        return this.twoFactorEnabled;
    }

    public void setTwoFactorEnabled(Boolean twoFactorEnabled) {
        this.twoFactorEnabled = twoFactorEnabled;
    }

    private String securityStamp;

    public String getSecurityStamp() {
        return this.securityStamp;
    }

    public void setSecurityStamp(String securityStamp) {
        this.securityStamp = securityStamp;
    }

    private Boolean active;

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    private String createdBy;

    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    private Date createdAt;

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    private Boolean isPropertyUserNameRemoved;

    public Boolean getIsPropertyUserNameRemoved() {
        return this.isPropertyUserNameRemoved;
    }

    public void setIsPropertyUserNameRemoved(Boolean removed) {
        this.isPropertyUserNameRemoved = removed;
    }

    private Boolean isPropertyAccessFailedCountRemoved;

    public Boolean getIsPropertyAccessFailedCountRemoved() {
        return this.isPropertyAccessFailedCountRemoved;
    }

    public void setIsPropertyAccessFailedCountRemoved(Boolean removed) {
        this.isPropertyAccessFailedCountRemoved = removed;
    }

    private Boolean isPropertyEmailRemoved;

    public Boolean getIsPropertyEmailRemoved() {
        return this.isPropertyEmailRemoved;
    }

    public void setIsPropertyEmailRemoved(Boolean removed) {
        this.isPropertyEmailRemoved = removed;
    }

    private Boolean isPropertyEmailConfirmedRemoved;

    public Boolean getIsPropertyEmailConfirmedRemoved() {
        return this.isPropertyEmailConfirmedRemoved;
    }

    public void setIsPropertyEmailConfirmedRemoved(Boolean removed) {
        this.isPropertyEmailConfirmedRemoved = removed;
    }

    private Boolean isPropertyLockoutEnabledRemoved;

    public Boolean getIsPropertyLockoutEnabledRemoved() {
        return this.isPropertyLockoutEnabledRemoved;
    }

    public void setIsPropertyLockoutEnabledRemoved(Boolean removed) {
        this.isPropertyLockoutEnabledRemoved = removed;
    }

    private Boolean isPropertyLockoutEndDateUtcRemoved;

    public Boolean getIsPropertyLockoutEndDateUtcRemoved() {
        return this.isPropertyLockoutEndDateUtcRemoved;
    }

    public void setIsPropertyLockoutEndDateUtcRemoved(Boolean removed) {
        this.isPropertyLockoutEndDateUtcRemoved = removed;
    }

    private Boolean isPropertyPasswordHashRemoved;

    public Boolean getIsPropertyPasswordHashRemoved() {
        return this.isPropertyPasswordHashRemoved;
    }

    public void setIsPropertyPasswordHashRemoved(Boolean removed) {
        this.isPropertyPasswordHashRemoved = removed;
    }

    private Boolean isPropertyPhoneNumberRemoved;

    public Boolean getIsPropertyPhoneNumberRemoved() {
        return this.isPropertyPhoneNumberRemoved;
    }

    public void setIsPropertyPhoneNumberRemoved(Boolean removed) {
        this.isPropertyPhoneNumberRemoved = removed;
    }

    private Boolean isPropertyPhoneNumberConfirmedRemoved;

    public Boolean getIsPropertyPhoneNumberConfirmedRemoved() {
        return this.isPropertyPhoneNumberConfirmedRemoved;
    }

    public void setIsPropertyPhoneNumberConfirmedRemoved(Boolean removed) {
        this.isPropertyPhoneNumberConfirmedRemoved = removed;
    }

    private Boolean isPropertyTwoFactorEnabledRemoved;

    public Boolean getIsPropertyTwoFactorEnabledRemoved() {
        return this.isPropertyTwoFactorEnabledRemoved;
    }

    public void setIsPropertyTwoFactorEnabledRemoved(Boolean removed) {
        this.isPropertyTwoFactorEnabledRemoved = removed;
    }

    private Boolean isPropertySecurityStampRemoved;

    public Boolean getIsPropertySecurityStampRemoved() {
        return this.isPropertySecurityStampRemoved;
    }

    public void setIsPropertySecurityStampRemoved(Boolean removed) {
        this.isPropertySecurityStampRemoved = removed;
    }

    private Boolean isPropertyActiveRemoved;

    public Boolean getIsPropertyActiveRemoved() {
        return this.isPropertyActiveRemoved;
    }

    public void setIsPropertyActiveRemoved(Boolean removed) {
        this.isPropertyActiveRemoved = removed;
    }


    private UserRoleStateEventDto[] userRoleEvents;

    public UserRoleStateEventDto[] getUserRoleEvents() {
        return this.userRoleEvents;
    }

    public void setUserRoleEvents(UserRoleStateEventDto[] events) {
        this.userRoleEvents = events;
    }


    private UserClaimStateEventDto[] userClaimEvents;

    public UserClaimStateEventDto[] getUserClaimEvents() {
        return this.userClaimEvents;
    }

    public void setUserClaimEvents(UserClaimStateEventDto[] events) {
        this.userClaimEvents = events;
    }


    private UserPermissionStateEventDto[] userPermissionEvents;

    public UserPermissionStateEventDto[] getUserPermissionEvents() {
        return this.userPermissionEvents;
    }

    public void setUserPermissionEvents(UserPermissionStateEventDto[] events) {
        this.userPermissionEvents = events;
    }


    private UserLoginStateEventDto[] userLoginEvents;

    public UserLoginStateEventDto[] getUserLoginEvents() {
        return this.userLoginEvents;
    }

    public void setUserLoginEvents(UserLoginStateEventDto[] events) {
        this.userLoginEvents = events;
    }


	public static class UserStateCreatedDto extends UserStateEventDto
	{
        @Override
        public String getStateEventType()
        {
            return AbstractStateEventDto.STATE_EVENT_TYPE_CREATED;
        }

	}


	public static class UserStateMergePatchedDto extends UserStateEventDto
	{
        @Override
        public String getStateEventType()
        {
            return AbstractStateEventDto.STATE_EVENT_TYPE_MERGE_PATCHED;
        }

	}


	public class UserStateDeletedDto extends UserStateEventDto
	{
        @Override
        public String getStateEventType()
        {
            return AbstractStateEventDto.STATE_EVENT_TYPE_DELETED;
        }

	}


}

