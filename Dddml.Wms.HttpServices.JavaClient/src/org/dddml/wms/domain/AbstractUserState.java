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

    public abstract void when(UserStateCreated e);

    public abstract void when(UserStateMergePatched e);

    public abstract void when(UserStateDeleted e);


    protected void throwOnWrongEvent(UserStateEvent stateEvent)
    {
        String stateEntityId = this.getUserId(); // Aggregate Id
        String eventEntityId = stateEvent.getStateEventId().getUserId(); // EntityBase.Aggregate.GetStateEventIdPropertyIdName();
        if (!stateEntityId.equals(eventEntityId))
        {
            DomainError.named("mutateWrongEntity", "Entity Id %1$s in state but entity id %2$s in event", stateEntityId, eventEntityId);
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

