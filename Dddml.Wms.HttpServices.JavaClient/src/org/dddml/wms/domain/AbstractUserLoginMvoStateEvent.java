package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;

public abstract class AbstractUserLoginMvoStateEvent implements UserLoginMvoStateEvent
{
    private UserLoginMvoStateEventId stateEventId;

    public UserLoginMvoStateEventId getStateEventId() {
        return this.stateEventId;
    }

    public void setStateEventId(UserLoginMvoStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }
    
    private boolean stateEventReadOnly;

    public boolean getStateEventReadOnly() { return this.stateEventReadOnly; }

    public void setStateEventReadOnly(boolean readOnly) { this.stateEventReadOnly = readOnly; }

    private Long version;

    public Long getVersion()
    {
        return this.version;
    }

    public void setVersion(Long version)
    {
        this.version = version;
    }

    private String createdBy;

    public String getCreatedBy()
    {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
    }

    private Date createdAt;

    public Date getCreatedAt()
    {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt)
    {
        this.createdAt = createdAt;
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

    private String userUserName;

    public String getUserUserName()
    {
        return this.userUserName;
    }

    public void setUserUserName(String userUserName)
    {
        this.userUserName = userUserName;
    }

    private Integer userAccessFailedCount;

    public Integer getUserAccessFailedCount()
    {
        return this.userAccessFailedCount;
    }

    public void setUserAccessFailedCount(Integer userAccessFailedCount)
    {
        this.userAccessFailedCount = userAccessFailedCount;
    }

    private String userEmail;

    public String getUserEmail()
    {
        return this.userEmail;
    }

    public void setUserEmail(String userEmail)
    {
        this.userEmail = userEmail;
    }

    private Boolean userEmailConfirmed;

    public Boolean getUserEmailConfirmed()
    {
        return this.userEmailConfirmed;
    }

    public void setUserEmailConfirmed(Boolean userEmailConfirmed)
    {
        this.userEmailConfirmed = userEmailConfirmed;
    }

    private Boolean userLockoutEnabled;

    public Boolean getUserLockoutEnabled()
    {
        return this.userLockoutEnabled;
    }

    public void setUserLockoutEnabled(Boolean userLockoutEnabled)
    {
        this.userLockoutEnabled = userLockoutEnabled;
    }

    private Date userLockoutEndDateUtc;

    public Date getUserLockoutEndDateUtc()
    {
        return this.userLockoutEndDateUtc;
    }

    public void setUserLockoutEndDateUtc(Date userLockoutEndDateUtc)
    {
        this.userLockoutEndDateUtc = userLockoutEndDateUtc;
    }

    private String userPasswordHash;

    public String getUserPasswordHash()
    {
        return this.userPasswordHash;
    }

    public void setUserPasswordHash(String userPasswordHash)
    {
        this.userPasswordHash = userPasswordHash;
    }

    private String userPhoneNumber;

    public String getUserPhoneNumber()
    {
        return this.userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber)
    {
        this.userPhoneNumber = userPhoneNumber;
    }

    private Boolean userPhoneNumberConfirmed;

    public Boolean getUserPhoneNumberConfirmed()
    {
        return this.userPhoneNumberConfirmed;
    }

    public void setUserPhoneNumberConfirmed(Boolean userPhoneNumberConfirmed)
    {
        this.userPhoneNumberConfirmed = userPhoneNumberConfirmed;
    }

    private Boolean userTwoFactorEnabled;

    public Boolean getUserTwoFactorEnabled()
    {
        return this.userTwoFactorEnabled;
    }

    public void setUserTwoFactorEnabled(Boolean userTwoFactorEnabled)
    {
        this.userTwoFactorEnabled = userTwoFactorEnabled;
    }

    private String userSecurityStamp;

    public String getUserSecurityStamp()
    {
        return this.userSecurityStamp;
    }

    public void setUserSecurityStamp(String userSecurityStamp)
    {
        this.userSecurityStamp = userSecurityStamp;
    }

    private String userCreatedBy;

    public String getUserCreatedBy()
    {
        return this.userCreatedBy;
    }

    public void setUserCreatedBy(String userCreatedBy)
    {
        this.userCreatedBy = userCreatedBy;
    }

    private Date userCreatedAt;

    public Date getUserCreatedAt()
    {
        return this.userCreatedAt;
    }

    public void setUserCreatedAt(Date userCreatedAt)
    {
        this.userCreatedAt = userCreatedAt;
    }

    private String userUpdatedBy;

    public String getUserUpdatedBy()
    {
        return this.userUpdatedBy;
    }

    public void setUserUpdatedBy(String userUpdatedBy)
    {
        this.userUpdatedBy = userUpdatedBy;
    }

    private Date userUpdatedAt;

    public Date getUserUpdatedAt()
    {
        return this.userUpdatedAt;
    }

    public void setUserUpdatedAt(Date userUpdatedAt)
    {
        this.userUpdatedAt = userUpdatedAt;
    }

    private Boolean userActive;

    public Boolean getUserActive()
    {
        return this.userActive;
    }

    public void setUserActive(Boolean userActive)
    {
        this.userActive = userActive;
    }

    private Boolean userDeleted;

    public Boolean getUserDeleted()
    {
        return this.userDeleted;
    }

    public void setUserDeleted(Boolean userDeleted)
    {
        this.userDeleted = userDeleted;
    }

    protected AbstractUserLoginMvoStateEvent() {
    }

    protected AbstractUserLoginMvoStateEvent(UserLoginMvoStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }


    public abstract String getStateEventType();


    public static abstract class AbstractUserLoginMvoStateCreated extends AbstractUserLoginMvoStateEvent implements UserLoginMvoStateCreated
    {
        public AbstractUserLoginMvoStateCreated() {
        }

        public AbstractUserLoginMvoStateCreated(UserLoginMvoStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.CREATED;
        }

    }


/*
    public static abstract class AbstractUserLoginMvoStateMergePatched extends AbstractUserLoginMvoStateEvent implements UserLoginMvoStateMergePatched
    {
        Boolean isPropertyVersionRemoved();

        void setPropertyVersionRemoved(Boolean removed);

        Boolean isPropertyActiveRemoved();

        void setPropertyActiveRemoved(Boolean removed);

        Boolean isPropertyUserUserNameRemoved();

        void setPropertyUserUserNameRemoved(Boolean removed);

        Boolean isPropertyUserAccessFailedCountRemoved();

        void setPropertyUserAccessFailedCountRemoved(Boolean removed);

        Boolean isPropertyUserEmailRemoved();

        void setPropertyUserEmailRemoved(Boolean removed);

        Boolean isPropertyUserEmailConfirmedRemoved();

        void setPropertyUserEmailConfirmedRemoved(Boolean removed);

        Boolean isPropertyUserLockoutEnabledRemoved();

        void setPropertyUserLockoutEnabledRemoved(Boolean removed);

        Boolean isPropertyUserLockoutEndDateUtcRemoved();

        void setPropertyUserLockoutEndDateUtcRemoved(Boolean removed);

        Boolean isPropertyUserPasswordHashRemoved();

        void setPropertyUserPasswordHashRemoved(Boolean removed);

        Boolean isPropertyUserPhoneNumberRemoved();

        void setPropertyUserPhoneNumberRemoved(Boolean removed);

        Boolean isPropertyUserPhoneNumberConfirmedRemoved();

        void setPropertyUserPhoneNumberConfirmedRemoved(Boolean removed);

        Boolean isPropertyUserTwoFactorEnabledRemoved();

        void setPropertyUserTwoFactorEnabledRemoved(Boolean removed);

        Boolean isPropertyUserSecurityStampRemoved();

        void setPropertyUserSecurityStampRemoved(Boolean removed);

        Boolean isPropertyUserCreatedByRemoved();

        void setPropertyUserCreatedByRemoved(Boolean removed);

        Boolean isPropertyUserCreatedAtRemoved();

        void setPropertyUserCreatedAtRemoved(Boolean removed);

        Boolean isPropertyUserUpdatedByRemoved();

        void setPropertyUserUpdatedByRemoved(Boolean removed);

        Boolean isPropertyUserUpdatedAtRemoved();

        void setPropertyUserUpdatedAtRemoved(Boolean removed);

        Boolean isPropertyUserActiveRemoved();

        void setPropertyUserActiveRemoved(Boolean removed);

        Boolean isPropertyUserDeletedRemoved();

        void setPropertyUserDeletedRemoved(Boolean removed);


    }
*/

    public static abstract class AbstractUserLoginMvoStateDeleted extends AbstractUserLoginMvoStateEvent implements UserLoginMvoStateDeleted
    {
        public AbstractUserLoginMvoStateDeleted() {
        }

        public AbstractUserLoginMvoStateDeleted(UserLoginMvoStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.DELETED;
        }

    }

}

