package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.specialization.DomainError;
import org.dddml.wms.domain.UserClaimMvoStateEvent.*;

public abstract class AbstractUserClaimMvoState implements UserClaimMvoState
{

    private UserClaimId userClaimId;

    public UserClaimId getUserClaimId()
    {
        return this.userClaimId;
    }

    public void setUserClaimId(UserClaimId userClaimId)
    {
        this.userClaimId = userClaimId;
    }

    private String claimType;

    public String getClaimType()
    {
        return this.claimType;
    }

    public void setClaimType(String claimType)
    {
        this.claimType = claimType;
    }

    private String claimValue;

    public String getClaimValue()
    {
        return this.claimValue;
    }

    public void setClaimValue(String claimValue)
    {
        this.claimValue = claimValue;
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


    public AbstractUserClaimMvoState()
    {
        initializeProperties();
    }
    
    protected void initializeProperties() {
    }


    public void mutate(Event e) {
        if (e instanceof UserClaimMvoStateCreated) {
            when((UserClaimMvoStateCreated) e);
        } else if (e instanceof UserClaimMvoStateMergePatched) {
            when((UserClaimMvoStateMergePatched) e);
        } else if (e instanceof UserClaimMvoStateDeleted) {
            when((UserClaimMvoStateDeleted) e);
        }
    }

    public void when(UserClaimMvoStateCreated e)
    {
        throwOnWrongEvent(e);
        this.setClaimType(e.getClaimType());
        this.setClaimValue(e.getClaimValue());
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

    public void when(UserClaimMvoStateMergePatched e)
    {
        throwOnWrongEvent(e);

        if (e.getClaimType() == null)
        {
            if (e.isPropertyClaimTypeRemoved() != null && e.isPropertyClaimTypeRemoved())
            {
                this.setClaimType(null);
            }
        }
        else
        {
            this.setClaimType(e.getClaimType());
        }
        if (e.getClaimValue() == null)
        {
            if (e.isPropertyClaimValueRemoved() != null && e.isPropertyClaimValueRemoved())
            {
                this.setClaimValue(null);
            }
        }
        else
        {
            this.setClaimValue(e.getClaimValue());
        }
        if (e.getVersion() == null)
        {
            if (e.isPropertyVersionRemoved() != null && e.isPropertyVersionRemoved())
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
            if (e.isPropertyActiveRemoved() != null && e.isPropertyActiveRemoved())
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
            if (e.isPropertyUserUserNameRemoved() != null && e.isPropertyUserUserNameRemoved())
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
            if (e.isPropertyUserAccessFailedCountRemoved() != null && e.isPropertyUserAccessFailedCountRemoved())
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
            if (e.isPropertyUserEmailRemoved() != null && e.isPropertyUserEmailRemoved())
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
            if (e.isPropertyUserEmailConfirmedRemoved() != null && e.isPropertyUserEmailConfirmedRemoved())
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
            if (e.isPropertyUserLockoutEnabledRemoved() != null && e.isPropertyUserLockoutEnabledRemoved())
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
            if (e.isPropertyUserLockoutEndDateUtcRemoved() != null && e.isPropertyUserLockoutEndDateUtcRemoved())
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
            if (e.isPropertyUserPasswordHashRemoved() != null && e.isPropertyUserPasswordHashRemoved())
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
            if (e.isPropertyUserPhoneNumberRemoved() != null && e.isPropertyUserPhoneNumberRemoved())
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
            if (e.isPropertyUserPhoneNumberConfirmedRemoved() != null && e.isPropertyUserPhoneNumberConfirmedRemoved())
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
            if (e.isPropertyUserTwoFactorEnabledRemoved() != null && e.isPropertyUserTwoFactorEnabledRemoved())
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
            if (e.isPropertyUserSecurityStampRemoved() != null && e.isPropertyUserSecurityStampRemoved())
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
            if (e.isPropertyUserCreatedByRemoved() != null && e.isPropertyUserCreatedByRemoved())
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
            if (e.isPropertyUserCreatedAtRemoved() != null && e.isPropertyUserCreatedAtRemoved())
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
            if (e.isPropertyUserUpdatedByRemoved() != null && e.isPropertyUserUpdatedByRemoved())
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
            if (e.isPropertyUserUpdatedAtRemoved() != null && e.isPropertyUserUpdatedAtRemoved())
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
            if (e.isPropertyUserActiveRemoved() != null && e.isPropertyUserActiveRemoved())
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
            if (e.isPropertyUserDeletedRemoved() != null && e.isPropertyUserDeletedRemoved())
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

    public void when(UserClaimMvoStateDeleted e)
    {
        throwOnWrongEvent(e);

        this.setDeleted(true);
        this.setUpdatedBy(e.getCreatedBy());
        this.setUpdatedAt(e.getCreatedAt());

    }

    protected void throwOnWrongEvent(UserClaimMvoStateEvent stateEvent)
    {
        UserClaimId stateEntityId = this.getUserClaimId(); // Aggregate Id
        UserClaimId eventEntityId = stateEvent.getStateEventId().getUserClaimId(); // EntityBase.Aggregate.GetStateEventIdPropertyIdName();
        if (!stateEntityId.equals(eventEntityId))
        {
            throw DomainError.named("mutateWrongEntity", "Entity Id %1$s in state but entity id %2$s in event", stateEntityId, eventEntityId);
        }

        Long stateVersion = this.getUserVersion();
        Long eventVersion = stateEvent.getStateEventId().getUserVersion();
        if (!stateVersion.equals(eventVersion))
        {
            throw DomainError.named("concurrencyConflict", "Conflict between state version %1$s and event version %2$s", stateVersion, eventVersion);
        }

    }


}

