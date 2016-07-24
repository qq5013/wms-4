package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.AbstractStateEventDto;

public class UserRoleMvoStateEventDto extends AbstractStateEventDto
{
    private String stateEventType;

    public String getStateEventType() {
        return this.stateEventType;
    }

    public void setStateEventType(String type)
    {
        this.stateEventType = type;
    }

    private UserRoleMvoStateEventIdDto stateEventId;

    public UserRoleMvoStateEventIdDto getStateEventId() {
        return this.stateEventId;
    }

    public void getStateEventId(UserRoleMvoStateEventIdDto stateEventId) {
        this.stateEventId = stateEventId;
    }

    private Long version;

    public Long getVersion() {
        return this.version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    private Boolean active;

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    private String userUserName;

    public String getUserUserName() {
        return this.userUserName;
    }

    public void setUserUserName(String userUserName) {
        this.userUserName = userUserName;
    }

    private Integer userAccessFailedCount;

    public Integer getUserAccessFailedCount() {
        return this.userAccessFailedCount;
    }

    public void setUserAccessFailedCount(Integer userAccessFailedCount) {
        this.userAccessFailedCount = userAccessFailedCount;
    }

    private String userEmail;

    public String getUserEmail() {
        return this.userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    private Boolean userEmailConfirmed;

    public Boolean getUserEmailConfirmed() {
        return this.userEmailConfirmed;
    }

    public void setUserEmailConfirmed(Boolean userEmailConfirmed) {
        this.userEmailConfirmed = userEmailConfirmed;
    }

    private Boolean userLockoutEnabled;

    public Boolean getUserLockoutEnabled() {
        return this.userLockoutEnabled;
    }

    public void setUserLockoutEnabled(Boolean userLockoutEnabled) {
        this.userLockoutEnabled = userLockoutEnabled;
    }

    private Date userLockoutEndDateUtc;

    public Date getUserLockoutEndDateUtc() {
        return this.userLockoutEndDateUtc;
    }

    public void setUserLockoutEndDateUtc(Date userLockoutEndDateUtc) {
        this.userLockoutEndDateUtc = userLockoutEndDateUtc;
    }

    private String userPasswordHash;

    public String getUserPasswordHash() {
        return this.userPasswordHash;
    }

    public void setUserPasswordHash(String userPasswordHash) {
        this.userPasswordHash = userPasswordHash;
    }

    private String userPhoneNumber;

    public String getUserPhoneNumber() {
        return this.userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    private Boolean userPhoneNumberConfirmed;

    public Boolean getUserPhoneNumberConfirmed() {
        return this.userPhoneNumberConfirmed;
    }

    public void setUserPhoneNumberConfirmed(Boolean userPhoneNumberConfirmed) {
        this.userPhoneNumberConfirmed = userPhoneNumberConfirmed;
    }

    private Boolean userTwoFactorEnabled;

    public Boolean getUserTwoFactorEnabled() {
        return this.userTwoFactorEnabled;
    }

    public void setUserTwoFactorEnabled(Boolean userTwoFactorEnabled) {
        this.userTwoFactorEnabled = userTwoFactorEnabled;
    }

    private String userSecurityStamp;

    public String getUserSecurityStamp() {
        return this.userSecurityStamp;
    }

    public void setUserSecurityStamp(String userSecurityStamp) {
        this.userSecurityStamp = userSecurityStamp;
    }

    private String userCreatedBy;

    public String getUserCreatedBy() {
        return this.userCreatedBy;
    }

    public void setUserCreatedBy(String userCreatedBy) {
        this.userCreatedBy = userCreatedBy;
    }

    private Date userCreatedAt;

    public Date getUserCreatedAt() {
        return this.userCreatedAt;
    }

    public void setUserCreatedAt(Date userCreatedAt) {
        this.userCreatedAt = userCreatedAt;
    }

    private String userUpdatedBy;

    public String getUserUpdatedBy() {
        return this.userUpdatedBy;
    }

    public void setUserUpdatedBy(String userUpdatedBy) {
        this.userUpdatedBy = userUpdatedBy;
    }

    private Date userUpdatedAt;

    public Date getUserUpdatedAt() {
        return this.userUpdatedAt;
    }

    public void setUserUpdatedAt(Date userUpdatedAt) {
        this.userUpdatedAt = userUpdatedAt;
    }

    private Boolean userActive;

    public Boolean getUserActive() {
        return this.userActive;
    }

    public void setUserActive(Boolean userActive) {
        this.userActive = userActive;
    }

    private Boolean userDeleted;

    public Boolean getUserDeleted() {
        return this.userDeleted;
    }

    public void setUserDeleted(Boolean userDeleted) {
        this.userDeleted = userDeleted;
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

    private String commandId;

    public String getCommandId() {
        return commandId;
    }

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    private Boolean isPropertyVersionRemoved;

    public Boolean getIsPropertyVersionRemoved() {
        return this.isPropertyVersionRemoved;
    }

    public void setIsPropertyVersionRemoved(Boolean removed) {
        this.isPropertyVersionRemoved = removed;
    }

    private Boolean isPropertyActiveRemoved;

    public Boolean getIsPropertyActiveRemoved() {
        return this.isPropertyActiveRemoved;
    }

    public void setIsPropertyActiveRemoved(Boolean removed) {
        this.isPropertyActiveRemoved = removed;
    }

    private Boolean isPropertyUserUserNameRemoved;

    public Boolean getIsPropertyUserUserNameRemoved() {
        return this.isPropertyUserUserNameRemoved;
    }

    public void setIsPropertyUserUserNameRemoved(Boolean removed) {
        this.isPropertyUserUserNameRemoved = removed;
    }

    private Boolean isPropertyUserAccessFailedCountRemoved;

    public Boolean getIsPropertyUserAccessFailedCountRemoved() {
        return this.isPropertyUserAccessFailedCountRemoved;
    }

    public void setIsPropertyUserAccessFailedCountRemoved(Boolean removed) {
        this.isPropertyUserAccessFailedCountRemoved = removed;
    }

    private Boolean isPropertyUserEmailRemoved;

    public Boolean getIsPropertyUserEmailRemoved() {
        return this.isPropertyUserEmailRemoved;
    }

    public void setIsPropertyUserEmailRemoved(Boolean removed) {
        this.isPropertyUserEmailRemoved = removed;
    }

    private Boolean isPropertyUserEmailConfirmedRemoved;

    public Boolean getIsPropertyUserEmailConfirmedRemoved() {
        return this.isPropertyUserEmailConfirmedRemoved;
    }

    public void setIsPropertyUserEmailConfirmedRemoved(Boolean removed) {
        this.isPropertyUserEmailConfirmedRemoved = removed;
    }

    private Boolean isPropertyUserLockoutEnabledRemoved;

    public Boolean getIsPropertyUserLockoutEnabledRemoved() {
        return this.isPropertyUserLockoutEnabledRemoved;
    }

    public void setIsPropertyUserLockoutEnabledRemoved(Boolean removed) {
        this.isPropertyUserLockoutEnabledRemoved = removed;
    }

    private Boolean isPropertyUserLockoutEndDateUtcRemoved;

    public Boolean getIsPropertyUserLockoutEndDateUtcRemoved() {
        return this.isPropertyUserLockoutEndDateUtcRemoved;
    }

    public void setIsPropertyUserLockoutEndDateUtcRemoved(Boolean removed) {
        this.isPropertyUserLockoutEndDateUtcRemoved = removed;
    }

    private Boolean isPropertyUserPasswordHashRemoved;

    public Boolean getIsPropertyUserPasswordHashRemoved() {
        return this.isPropertyUserPasswordHashRemoved;
    }

    public void setIsPropertyUserPasswordHashRemoved(Boolean removed) {
        this.isPropertyUserPasswordHashRemoved = removed;
    }

    private Boolean isPropertyUserPhoneNumberRemoved;

    public Boolean getIsPropertyUserPhoneNumberRemoved() {
        return this.isPropertyUserPhoneNumberRemoved;
    }

    public void setIsPropertyUserPhoneNumberRemoved(Boolean removed) {
        this.isPropertyUserPhoneNumberRemoved = removed;
    }

    private Boolean isPropertyUserPhoneNumberConfirmedRemoved;

    public Boolean getIsPropertyUserPhoneNumberConfirmedRemoved() {
        return this.isPropertyUserPhoneNumberConfirmedRemoved;
    }

    public void setIsPropertyUserPhoneNumberConfirmedRemoved(Boolean removed) {
        this.isPropertyUserPhoneNumberConfirmedRemoved = removed;
    }

    private Boolean isPropertyUserTwoFactorEnabledRemoved;

    public Boolean getIsPropertyUserTwoFactorEnabledRemoved() {
        return this.isPropertyUserTwoFactorEnabledRemoved;
    }

    public void setIsPropertyUserTwoFactorEnabledRemoved(Boolean removed) {
        this.isPropertyUserTwoFactorEnabledRemoved = removed;
    }

    private Boolean isPropertyUserSecurityStampRemoved;

    public Boolean getIsPropertyUserSecurityStampRemoved() {
        return this.isPropertyUserSecurityStampRemoved;
    }

    public void setIsPropertyUserSecurityStampRemoved(Boolean removed) {
        this.isPropertyUserSecurityStampRemoved = removed;
    }

    private Boolean isPropertyUserCreatedByRemoved;

    public Boolean getIsPropertyUserCreatedByRemoved() {
        return this.isPropertyUserCreatedByRemoved;
    }

    public void setIsPropertyUserCreatedByRemoved(Boolean removed) {
        this.isPropertyUserCreatedByRemoved = removed;
    }

    private Boolean isPropertyUserCreatedAtRemoved;

    public Boolean getIsPropertyUserCreatedAtRemoved() {
        return this.isPropertyUserCreatedAtRemoved;
    }

    public void setIsPropertyUserCreatedAtRemoved(Boolean removed) {
        this.isPropertyUserCreatedAtRemoved = removed;
    }

    private Boolean isPropertyUserUpdatedByRemoved;

    public Boolean getIsPropertyUserUpdatedByRemoved() {
        return this.isPropertyUserUpdatedByRemoved;
    }

    public void setIsPropertyUserUpdatedByRemoved(Boolean removed) {
        this.isPropertyUserUpdatedByRemoved = removed;
    }

    private Boolean isPropertyUserUpdatedAtRemoved;

    public Boolean getIsPropertyUserUpdatedAtRemoved() {
        return this.isPropertyUserUpdatedAtRemoved;
    }

    public void setIsPropertyUserUpdatedAtRemoved(Boolean removed) {
        this.isPropertyUserUpdatedAtRemoved = removed;
    }

    private Boolean isPropertyUserActiveRemoved;

    public Boolean getIsPropertyUserActiveRemoved() {
        return this.isPropertyUserActiveRemoved;
    }

    public void setIsPropertyUserActiveRemoved(Boolean removed) {
        this.isPropertyUserActiveRemoved = removed;
    }

    private Boolean isPropertyUserDeletedRemoved;

    public Boolean getIsPropertyUserDeletedRemoved() {
        return this.isPropertyUserDeletedRemoved;
    }

    public void setIsPropertyUserDeletedRemoved(Boolean removed) {
        this.isPropertyUserDeletedRemoved = removed;
    }


	public static class UserRoleMvoStateCreatedDto extends UserRoleMvoStateEventDto
	{
        @Override
        public String getStateEventType()
        {
            return AbstractStateEventDto.STATE_EVENT_TYPE_CREATED;
        }

	}


	public static class UserRoleMvoStateMergePatchedDto extends UserRoleMvoStateEventDto
	{
        @Override
        public String getStateEventType()
        {
            return AbstractStateEventDto.STATE_EVENT_TYPE_MERGE_PATCHED;
        }

	}


	public class UserRoleMvoStateDeletedDto extends UserRoleMvoStateEventDto
	{
        @Override
        public String getStateEventType()
        {
            return AbstractStateEventDto.STATE_EVENT_TYPE_DELETED;
        }

	}


}

