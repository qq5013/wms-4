package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.specialization.DomainError;
import org.dddml.wms.domain.UserStateEvent.*;

public abstract class AbstractUserState implements UserState
{

    private String userId;

    public String getUserId()
    {
        return this.userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

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

    private String updatedBy;

    public String getUpdatedBy()
    {
        return this.updatedBy;
    }

    public void setUpdatedBy(String updatedBy)
    {
        this.updatedBy = updatedBy;
    }

    private Date updatedAt;

    public Date getUpdatedAt()
    {
        return this.updatedAt;
    }

    public void setUpdatedAt(Date updatedAt)
    {
        this.updatedAt = updatedAt;
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

    private Boolean deleted;

    public Boolean getDeleted()
    {
        return this.deleted;
    }

    public void setDeleted(Boolean deleted)
    {
        this.deleted = deleted;
    }

    public boolean isStateUnsaved() 
    {
        return VERSION_ZERO.equals(this.getVersion());
    }

    private UserRoleStates userRoles;

    public UserRoleStates getUserRoles()
    {
        return this.userRoles;
    }

    public void setUserRoles(UserRoleStates userRoles)
    {
        this.userRoles = userRoles;
    }

    private UserClaimStates userClaims;

    public UserClaimStates getUserClaims()
    {
        return this.userClaims;
    }

    public void setUserClaims(UserClaimStates userClaims)
    {
        this.userClaims = userClaims;
    }

    private UserPermissionStates userPermissions;

    public UserPermissionStates getUserPermissions()
    {
        return this.userPermissions;
    }

    public void setUserPermissions(UserPermissionStates userPermissions)
    {
        this.userPermissions = userPermissions;
    }

    private UserLoginStates userLogins;

    public UserLoginStates getUserLogins()
    {
        return this.userLogins;
    }

    public void setUserLogins(UserLoginStates userLogins)
    {
        this.userLogins = userLogins;
    }


    public AbstractUserState()
    {
        userRoles = new SimpleUserRoleStates(this);

        userClaims = new SimpleUserClaimStates(this);

        userPermissions = new SimpleUserPermissionStates(this);

        userLogins = new SimpleUserLoginStates(this);

        initializeProperties();
    }
    
    protected void initializeProperties() {
    }


    public void mutate(Event e) {
        if (e instanceof UserStateCreated) {
            when((UserStateCreated) e);
        } else if (e instanceof UserStateMergePatched) {
            when((UserStateMergePatched) e);
        } else if (e instanceof UserStateDeleted) {
            when((UserStateDeleted) e);
        }
    }

    public void when(UserStateCreated e)
    {
        throwOnWrongEvent(e);
        this.setUserName(e.getUserName());
        this.setAccessFailedCount(e.getAccessFailedCount());
        this.setEmail(e.getEmail());
        this.setEmailConfirmed(e.getEmailConfirmed());
        this.setLockoutEnabled(e.getLockoutEnabled());
        this.setLockoutEndDateUtc(e.getLockoutEndDateUtc());
        this.setPasswordHash(e.getPasswordHash());
        this.setPhoneNumber(e.getPhoneNumber());
        this.setPhoneNumberConfirmed(e.getPhoneNumberConfirmed());
        this.setTwoFactorEnabled(e.getTwoFactorEnabled());
        this.setSecurityStamp(e.getSecurityStamp());
        this.setActive(e.getActive());

        this.setDeleted(false);

        this.setCreatedBy(e.getCreatedBy());
        this.setCreatedAt(e.getCreatedAt());

        for (UserRoleStateEvent.UserRoleStateCreated innerEvent : e.getUserRoleEvents()) {
            UserRoleState innerState = this.getUserRoles().get(innerEvent.getStateEventId().getRoleId());
            innerState.mutate(innerEvent);
        }
        for (UserClaimStateEvent.UserClaimStateCreated innerEvent : e.getUserClaimEvents()) {
            UserClaimState innerState = this.getUserClaims().get(innerEvent.getStateEventId().getClaimId());
            innerState.mutate(innerEvent);
        }
        for (UserPermissionStateEvent.UserPermissionStateCreated innerEvent : e.getUserPermissionEvents()) {
            UserPermissionState innerState = this.getUserPermissions().get(innerEvent.getStateEventId().getPermissionId());
            innerState.mutate(innerEvent);
        }
        for (UserLoginStateEvent.UserLoginStateCreated innerEvent : e.getUserLoginEvents()) {
            UserLoginState innerState = this.getUserLogins().get(innerEvent.getStateEventId().getLoginKey());
            innerState.mutate(innerEvent);
        }
    }

    public void when(UserStateMergePatched e)
    {
        throwOnWrongEvent(e);

        if (e.getUserName() == null)
        {
            if (e.isPropertyUserNameRemoved() != null && e.isPropertyUserNameRemoved())
            {
                this.setUserName(null);
            }
        }
        else
        {
            this.setUserName(e.getUserName());
        }
        if (e.getAccessFailedCount() == null)
        {
            if (e.isPropertyAccessFailedCountRemoved() != null && e.isPropertyAccessFailedCountRemoved())
            {
                this.setAccessFailedCount(null);
            }
        }
        else
        {
            this.setAccessFailedCount(e.getAccessFailedCount());
        }
        if (e.getEmail() == null)
        {
            if (e.isPropertyEmailRemoved() != null && e.isPropertyEmailRemoved())
            {
                this.setEmail(null);
            }
        }
        else
        {
            this.setEmail(e.getEmail());
        }
        if (e.getEmailConfirmed() == null)
        {
            if (e.isPropertyEmailConfirmedRemoved() != null && e.isPropertyEmailConfirmedRemoved())
            {
                this.setEmailConfirmed(null);
            }
        }
        else
        {
            this.setEmailConfirmed(e.getEmailConfirmed());
        }
        if (e.getLockoutEnabled() == null)
        {
            if (e.isPropertyLockoutEnabledRemoved() != null && e.isPropertyLockoutEnabledRemoved())
            {
                this.setLockoutEnabled(null);
            }
        }
        else
        {
            this.setLockoutEnabled(e.getLockoutEnabled());
        }
        if (e.getLockoutEndDateUtc() == null)
        {
            if (e.isPropertyLockoutEndDateUtcRemoved() != null && e.isPropertyLockoutEndDateUtcRemoved())
            {
                this.setLockoutEndDateUtc(null);
            }
        }
        else
        {
            this.setLockoutEndDateUtc(e.getLockoutEndDateUtc());
        }
        if (e.getPasswordHash() == null)
        {
            if (e.isPropertyPasswordHashRemoved() != null && e.isPropertyPasswordHashRemoved())
            {
                this.setPasswordHash(null);
            }
        }
        else
        {
            this.setPasswordHash(e.getPasswordHash());
        }
        if (e.getPhoneNumber() == null)
        {
            if (e.isPropertyPhoneNumberRemoved() != null && e.isPropertyPhoneNumberRemoved())
            {
                this.setPhoneNumber(null);
            }
        }
        else
        {
            this.setPhoneNumber(e.getPhoneNumber());
        }
        if (e.getPhoneNumberConfirmed() == null)
        {
            if (e.isPropertyPhoneNumberConfirmedRemoved() != null && e.isPropertyPhoneNumberConfirmedRemoved())
            {
                this.setPhoneNumberConfirmed(null);
            }
        }
        else
        {
            this.setPhoneNumberConfirmed(e.getPhoneNumberConfirmed());
        }
        if (e.getTwoFactorEnabled() == null)
        {
            if (e.isPropertyTwoFactorEnabledRemoved() != null && e.isPropertyTwoFactorEnabledRemoved())
            {
                this.setTwoFactorEnabled(null);
            }
        }
        else
        {
            this.setTwoFactorEnabled(e.getTwoFactorEnabled());
        }
        if (e.getSecurityStamp() == null)
        {
            if (e.isPropertySecurityStampRemoved() != null && e.isPropertySecurityStampRemoved())
            {
                this.setSecurityStamp(null);
            }
        }
        else
        {
            this.setSecurityStamp(e.getSecurityStamp());
        }
        if (e.getActive() == null)
        {
            if (e.isPropertyActiveRemoved() != null && e.isPropertyActiveRemoved())
            {
                this.setActive(null);
            }
        }
        else
        {
            this.setActive(e.getActive());
        }

        this.setUpdatedBy(e.getCreatedBy());
        this.setUpdatedAt(e.getCreatedAt());

        for (UserRoleStateEvent innerEvent : e.getUserRoleEvents()) {
            UserRoleState innerState = this.getUserRoles().get(innerEvent.getStateEventId().getRoleId());
            innerState.mutate(innerEvent);
            if (innerEvent instanceof UserRoleStateEvent.UserRoleStateRemoved)
            {
                //UserRoleStateEvent.UserRoleStateRemoved removed = (UserRoleStateEvent.UserRoleStateRemoved)innerEvent;
                this.getUserRoles().remove(innerState);
            }
        }
        for (UserClaimStateEvent innerEvent : e.getUserClaimEvents()) {
            UserClaimState innerState = this.getUserClaims().get(innerEvent.getStateEventId().getClaimId());
            innerState.mutate(innerEvent);
            if (innerEvent instanceof UserClaimStateEvent.UserClaimStateRemoved)
            {
                //UserClaimStateEvent.UserClaimStateRemoved removed = (UserClaimStateEvent.UserClaimStateRemoved)innerEvent;
                this.getUserClaims().remove(innerState);
            }
        }
        for (UserPermissionStateEvent innerEvent : e.getUserPermissionEvents()) {
            UserPermissionState innerState = this.getUserPermissions().get(innerEvent.getStateEventId().getPermissionId());
            innerState.mutate(innerEvent);
            if (innerEvent instanceof UserPermissionStateEvent.UserPermissionStateRemoved)
            {
                //UserPermissionStateEvent.UserPermissionStateRemoved removed = (UserPermissionStateEvent.UserPermissionStateRemoved)innerEvent;
                this.getUserPermissions().remove(innerState);
            }
        }
        for (UserLoginStateEvent innerEvent : e.getUserLoginEvents()) {
            UserLoginState innerState = this.getUserLogins().get(innerEvent.getStateEventId().getLoginKey());
            innerState.mutate(innerEvent);
            if (innerEvent instanceof UserLoginStateEvent.UserLoginStateRemoved)
            {
                //UserLoginStateEvent.UserLoginStateRemoved removed = (UserLoginStateEvent.UserLoginStateRemoved)innerEvent;
                this.getUserLogins().remove(innerState);
            }
        }
    }

    public void when(UserStateDeleted e)
    {
        throwOnWrongEvent(e);

        this.setDeleted(true);
        this.setUpdatedBy(e.getCreatedBy());
        this.setUpdatedAt(e.getCreatedAt());

        for (UserRoleState innerState : this.getUserRoles())
        {
            this.getUserRoles().remove(innerState);
        
            UserRoleStateEvent.UserRoleStateRemoved innerE = e.newUserRoleStateRemoved(innerState.getRoleId());
            innerE.setCreatedAt(e.getCreatedAt());
            innerE.setCreatedBy(e.getCreatedBy());
            innerState.when(innerE);
            //e.addUserRoleEvent(innerE);
        }
        for (UserClaimState innerState : this.getUserClaims())
        {
            this.getUserClaims().remove(innerState);
        
            UserClaimStateEvent.UserClaimStateRemoved innerE = e.newUserClaimStateRemoved(innerState.getClaimId());
            innerE.setCreatedAt(e.getCreatedAt());
            innerE.setCreatedBy(e.getCreatedBy());
            innerState.when(innerE);
            //e.addUserClaimEvent(innerE);
        }
        for (UserPermissionState innerState : this.getUserPermissions())
        {
            this.getUserPermissions().remove(innerState);
        
            UserPermissionStateEvent.UserPermissionStateRemoved innerE = e.newUserPermissionStateRemoved(innerState.getPermissionId());
            innerE.setCreatedAt(e.getCreatedAt());
            innerE.setCreatedBy(e.getCreatedBy());
            innerState.when(innerE);
            //e.addUserPermissionEvent(innerE);
        }
        for (UserLoginState innerState : this.getUserLogins())
        {
            this.getUserLogins().remove(innerState);
        
            UserLoginStateEvent.UserLoginStateRemoved innerE = e.newUserLoginStateRemoved(innerState.getLoginKey());
            innerE.setCreatedAt(e.getCreatedAt());
            innerE.setCreatedBy(e.getCreatedBy());
            innerState.when(innerE);
            //e.addUserLoginEvent(innerE);
        }
    }

    protected void throwOnWrongEvent(UserStateEvent stateEvent)
    {
        String stateEntityId = this.getUserId(); // Aggregate Id
        String eventEntityId = stateEvent.getStateEventId().getUserId(); // EntityBase.Aggregate.GetStateEventIdPropertyIdName();
        if (!stateEntityId.equals(eventEntityId))
        {
            throw DomainError.named("mutateWrongEntity", "Entity Id %1$s in state but entity id %2$s in event", stateEntityId, eventEntityId);
        }

        Long stateVersion = this.getVersion();
        Long eventVersion = stateEvent.getStateEventId().getVersion();
        if (!stateVersion.equals(eventVersion))
        {
            throw DomainError.named("concurrencyConflict", "Conflict between state version %1$s and event version %2$s", stateVersion, eventVersion);
        }

    }

    public static class SimpleUserRoleStates extends AbstractUserRoleStates
    {
        public SimpleUserRoleStates(UserState outerState)
        {
            super(outerState);
        }
    }

    public static class SimpleUserClaimStates extends AbstractUserClaimStates
    {
        public SimpleUserClaimStates(UserState outerState)
        {
            super(outerState);
        }
    }

    public static class SimpleUserPermissionStates extends AbstractUserPermissionStates
    {
        public SimpleUserPermissionStates(UserState outerState)
        {
            super(outerState);
        }
    }

    public static class SimpleUserLoginStates extends AbstractUserLoginStates
    {
        public SimpleUserLoginStates(UserState outerState)
        {
            super(outerState);
        }
    }


}

