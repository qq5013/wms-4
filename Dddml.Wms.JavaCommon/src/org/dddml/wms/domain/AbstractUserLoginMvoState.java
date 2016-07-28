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
        return this.getUserVersion() == null;
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

    public void when(UserLoginMvoStateCreated e)
    {
        throwOnWrongEvent(e);
        this.setVersion(e.getVersion());
        this.setActive(e.getActive());
        this.setUserUserName(e.getUserUserName());
        this.setUserAccessFailedCount(e.getUserAccessFailedCount());
        this.setUserEmail(e.getUserEmail());
        this.setUserEmailConfirmed(e.getUserEmailConfirmed());
        this.setUserLockoutEnabled(e.getUserLockoutEnabled());
        this.setUserLockoutEndDateUtc(e.getUserLockoutEndDateUtc());
        this.setUserPasswordHash(e.getUserPasswordHash());
        this.setUserPhoneNumber(e.getUserPhoneNumber());
        this.setUserPhoneNumberConfirmed(e.getUserPhoneNumberConfirmed());
        this.setUserTwoFactorEnabled(e.getUserTwoFactorEnabled());
        this.setUserSecurityStamp(e.getUserSecurityStamp());
        this.setUserCreatedBy(e.getUserCreatedBy());
        this.setUserCreatedAt(e.getUserCreatedAt());
        this.setUserUpdatedBy(e.getUserUpdatedBy());
        this.setUserUpdatedAt(e.getUserUpdatedAt());
        this.setUserActive(e.getUserActive());
        this.setUserDeleted(e.getUserDeleted());

        this.setDeleted(false);

        this.setCreatedBy(e.getCreatedBy());
        this.setCreatedAt(e.getCreatedAt());

    }

    public void when(UserLoginMvoStateMergePatched e)
    {
        throwOnWrongEvent(e);

        if (e.getVersion() == null)
        {
            if (e.getIsPropertyVersionRemoved() != null && e.getIsPropertyVersionRemoved())
            {
                this.setVersion(null);
            }
        }
        else
        {
            this.setVersion(e.getVersion());
        }
        if (e.getActive() == null)
        {
            if (e.getIsPropertyActiveRemoved() != null && e.getIsPropertyActiveRemoved())
            {
                this.setActive(null);
            }
        }
        else
        {
            this.setActive(e.getActive());
        }
        if (e.getUserUserName() == null)
        {
            if (e.getIsPropertyUserUserNameRemoved() != null && e.getIsPropertyUserUserNameRemoved())
            {
                this.setUserUserName(null);
            }
        }
        else
        {
            this.setUserUserName(e.getUserUserName());
        }
        if (e.getUserAccessFailedCount() == null)
        {
            if (e.getIsPropertyUserAccessFailedCountRemoved() != null && e.getIsPropertyUserAccessFailedCountRemoved())
            {
                this.setUserAccessFailedCount(null);
            }
        }
        else
        {
            this.setUserAccessFailedCount(e.getUserAccessFailedCount());
        }
        if (e.getUserEmail() == null)
        {
            if (e.getIsPropertyUserEmailRemoved() != null && e.getIsPropertyUserEmailRemoved())
            {
                this.setUserEmail(null);
            }
        }
        else
        {
            this.setUserEmail(e.getUserEmail());
        }
        if (e.getUserEmailConfirmed() == null)
        {
            if (e.getIsPropertyUserEmailConfirmedRemoved() != null && e.getIsPropertyUserEmailConfirmedRemoved())
            {
                this.setUserEmailConfirmed(null);
            }
        }
        else
        {
            this.setUserEmailConfirmed(e.getUserEmailConfirmed());
        }
        if (e.getUserLockoutEnabled() == null)
        {
            if (e.getIsPropertyUserLockoutEnabledRemoved() != null && e.getIsPropertyUserLockoutEnabledRemoved())
            {
                this.setUserLockoutEnabled(null);
            }
        }
        else
        {
            this.setUserLockoutEnabled(e.getUserLockoutEnabled());
        }
        if (e.getUserLockoutEndDateUtc() == null)
        {
            if (e.getIsPropertyUserLockoutEndDateUtcRemoved() != null && e.getIsPropertyUserLockoutEndDateUtcRemoved())
            {
                this.setUserLockoutEndDateUtc(null);
            }
        }
        else
        {
            this.setUserLockoutEndDateUtc(e.getUserLockoutEndDateUtc());
        }
        if (e.getUserPasswordHash() == null)
        {
            if (e.getIsPropertyUserPasswordHashRemoved() != null && e.getIsPropertyUserPasswordHashRemoved())
            {
                this.setUserPasswordHash(null);
            }
        }
        else
        {
            this.setUserPasswordHash(e.getUserPasswordHash());
        }
        if (e.getUserPhoneNumber() == null)
        {
            if (e.getIsPropertyUserPhoneNumberRemoved() != null && e.getIsPropertyUserPhoneNumberRemoved())
            {
                this.setUserPhoneNumber(null);
            }
        }
        else
        {
            this.setUserPhoneNumber(e.getUserPhoneNumber());
        }
        if (e.getUserPhoneNumberConfirmed() == null)
        {
            if (e.getIsPropertyUserPhoneNumberConfirmedRemoved() != null && e.getIsPropertyUserPhoneNumberConfirmedRemoved())
            {
                this.setUserPhoneNumberConfirmed(null);
            }
        }
        else
        {
            this.setUserPhoneNumberConfirmed(e.getUserPhoneNumberConfirmed());
        }
        if (e.getUserTwoFactorEnabled() == null)
        {
            if (e.getIsPropertyUserTwoFactorEnabledRemoved() != null && e.getIsPropertyUserTwoFactorEnabledRemoved())
            {
                this.setUserTwoFactorEnabled(null);
            }
        }
        else
        {
            this.setUserTwoFactorEnabled(e.getUserTwoFactorEnabled());
        }
        if (e.getUserSecurityStamp() == null)
        {
            if (e.getIsPropertyUserSecurityStampRemoved() != null && e.getIsPropertyUserSecurityStampRemoved())
            {
                this.setUserSecurityStamp(null);
            }
        }
        else
        {
            this.setUserSecurityStamp(e.getUserSecurityStamp());
        }
        if (e.getUserCreatedBy() == null)
        {
            if (e.getIsPropertyUserCreatedByRemoved() != null && e.getIsPropertyUserCreatedByRemoved())
            {
                this.setUserCreatedBy(null);
            }
        }
        else
        {
            this.setUserCreatedBy(e.getUserCreatedBy());
        }
        if (e.getUserCreatedAt() == null)
        {
            if (e.getIsPropertyUserCreatedAtRemoved() != null && e.getIsPropertyUserCreatedAtRemoved())
            {
                this.setUserCreatedAt(null);
            }
        }
        else
        {
            this.setUserCreatedAt(e.getUserCreatedAt());
        }
        if (e.getUserUpdatedBy() == null)
        {
            if (e.getIsPropertyUserUpdatedByRemoved() != null && e.getIsPropertyUserUpdatedByRemoved())
            {
                this.setUserUpdatedBy(null);
            }
        }
        else
        {
            this.setUserUpdatedBy(e.getUserUpdatedBy());
        }
        if (e.getUserUpdatedAt() == null)
        {
            if (e.getIsPropertyUserUpdatedAtRemoved() != null && e.getIsPropertyUserUpdatedAtRemoved())
            {
                this.setUserUpdatedAt(null);
            }
        }
        else
        {
            this.setUserUpdatedAt(e.getUserUpdatedAt());
        }
        if (e.getUserActive() == null)
        {
            if (e.getIsPropertyUserActiveRemoved() != null && e.getIsPropertyUserActiveRemoved())
            {
                this.setUserActive(null);
            }
        }
        else
        {
            this.setUserActive(e.getUserActive());
        }
        if (e.getUserDeleted() == null)
        {
            if (e.getIsPropertyUserDeletedRemoved() != null && e.getIsPropertyUserDeletedRemoved())
            {
                this.setUserDeleted(null);
            }
        }
        else
        {
            this.setUserDeleted(e.getUserDeleted());
        }

        this.setUpdatedBy(e.getCreatedBy());
        this.setUpdatedAt(e.getCreatedAt());

    }

    public void when(UserLoginMvoStateDeleted e)
    {
        throwOnWrongEvent(e);

        this.setDeleted(true);
        this.setUpdatedBy(e.getCreatedBy());
        this.setUpdatedAt(e.getCreatedAt());

    }

    protected void throwOnWrongEvent(UserLoginMvoStateEvent stateEvent)
    {
        UserLoginId stateEntityId = this.getUserLoginId(); // Aggregate Id
        UserLoginId eventEntityId = stateEvent.getStateEventId().getUserLoginId(); // EntityBase.Aggregate.GetStateEventIdPropertyIdName();
        if (!stateEntityId.equals(eventEntityId))
        {
            throw DomainError.named("mutateWrongEntity", "Entity Id %1$s in state but entity id %2$s in event", stateEntityId, eventEntityId);
        }

        Long stateVersion = this.getUserVersion();
        Long eventVersion = stateEvent.getStateEventId().getUserVersion();// Aggregate Version
        if (!(stateVersion == null && eventVersion == UserLoginMvoState.VERSION_NULL) && stateVersion != eventVersion)
        {
            throw DomainError.named("concurrencyConflict", "Conflict between state version (%1$s) and event version (%2$s + 1)", stateVersion, eventVersion);
        }

    }

    public static class SimpleUserLoginMvoState extends AbstractUserLoginMvoState
    {
    }


}

