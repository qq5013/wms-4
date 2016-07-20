package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.specialization.DomainError;
import org.dddml.wms.domain.UserLoginMvoStateEvent.*;

public abstract class AbstractUserLoginMvoState implements UserLoginMvoState
{

    private UserLoginId userLoginId;

    public UserLoginId getUserLoginId()
    {
        return this.userLoginId;
    }

    public void setUserLoginId(UserLoginId userLoginId)
    {
        this.userLoginId = userLoginId;
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

    private Long userVersion;

    public Long getUserVersion()
    {
        return this.userVersion;
    }

    public void setUserVersion(Long userVersion)
    {
        this.userVersion = userVersion;
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

    public boolean isStateUnsaved() 
    {
        return VERSION_ZERO.equals(this.getUserVersion());
    }


    public AbstractUserLoginMvoState()
    {
        initializeProperties();
    }
    
    protected void initializeProperties() {
    }


    public void mutate(Event e) {
        if (e instanceof UserLoginMvoStateCreated) {
            when((UserLoginMvoStateCreated) e);
        } else if (e instanceof UserLoginMvoStateMergePatched) {
            when((UserLoginMvoStateMergePatched) e);
        } else if (e instanceof UserLoginMvoStateDeleted) {
            when((UserLoginMvoStateDeleted) e);
        }
    }

    public abstract void when(UserLoginMvoStateCreated e);

    public abstract void when(UserLoginMvoStateMergePatched e);

    public abstract void when(UserLoginMvoStateDeleted e);


    protected void throwOnWrongEvent(UserLoginMvoStateEvent stateEvent)
    {
        UserLoginId stateEntityId = this.getUserLoginId(); // Aggregate Id
        UserLoginId eventEntityId = stateEvent.getStateEventId().getUserLoginId(); // EntityBase.Aggregate.GetStateEventIdPropertyIdName();
        if (!stateEntityId.equals(eventEntityId))
        {
            DomainError.named("mutateWrongEntity", "Entity Id %1$s in state but entity id %2$s in event", stateEntityId, eventEntityId);
        }

        Long stateVersion = this.getUserVersion();
        Long eventVersion = stateEvent.getStateEventId().getUserVersion();
        if (!stateVersion.equals(eventVersion))
        {
            throw DomainError.named("concurrencyConflict", "Conflict between state version %1$s and event version %2$s", stateVersion, eventVersion);
        }

    }


}

