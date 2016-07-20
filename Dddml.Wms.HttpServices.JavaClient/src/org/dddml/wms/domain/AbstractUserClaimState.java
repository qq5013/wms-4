package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.specialization.DomainError;
import org.dddml.wms.domain.UserClaimStateEvent.*;

public abstract class AbstractUserClaimState implements UserClaimState
{

    private UserClaimId userClaimId = new UserClaimId();

    public UserClaimId getUserClaimId() {
        return this.userClaimId;
    }

    public void setUserClaimId(UserClaimId userClaimId) {
        this.userClaimId = userClaimId;
    }

    private Integer claimId;

    public Integer getClaimId()
    {
        return this.claimId;
    }

    public void setClaimId(Integer claimId)
    {
        this.claimId = claimId;
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

    private String userId;

    public String getUserId()
    {
        return this.userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public boolean isStateUnsaved() 
    {
        return VERSION_ZERO.equals(this.getVersion());
    }


    public AbstractUserClaimState()
    {
        initializeProperties();
    }
    
    protected void initializeProperties() {
    }


    public void mutate(Event e) {
        if (e instanceof UserClaimStateCreated) {
            when((UserClaimStateCreated) e);
        } else if (e instanceof UserClaimStateMergePatched) {
            when((UserClaimStateMergePatched) e);
        } else if (e instanceof UserClaimStateRemoved) {
            when((UserClaimStateRemoved) e);
        }
    }

    public abstract void when(UserClaimStateCreated e);

    public abstract void when(UserClaimStateMergePatched e);

    public abstract void when(UserClaimStateRemoved e);


    protected void throwOnWrongEvent(UserClaimStateEvent stateEvent)
    {
        String stateEntityIdUserId = this.getUserClaimId().getUserId();
        String eventEntityIdUserId = stateEvent.getStateEventId().getUserId();
        if (stateEntityIdUserId != eventEntityIdUserId)
        {
            DomainError.named("mutateWrongEntity", "Entity Id UserId %1$s in state but entity id UserId %2$s in event", stateEntityIdUserId, eventEntityIdUserId);
        }

        Integer stateEntityIdClaimId = this.getUserClaimId().getClaimId();
        Integer eventEntityIdClaimId = stateEvent.getStateEventId().getClaimId();
        if (stateEntityIdClaimId != eventEntityIdClaimId)
        {
            DomainError.named("mutateWrongEntity", "Entity Id ClaimId %1$s in state but entity id ClaimId %2$s in event", stateEntityIdClaimId, eventEntityIdClaimId);
        }

        Long stateVersion = this.getVersion();
        Long eventVersion = stateEvent.getVersion();
        if (UserClaimState.VERSION_ZERO.equals(eventVersion))
        {
            stateEvent.setVersion(stateVersion);
            eventVersion = stateVersion;
        }
        if (!stateVersion.equals(eventVersion))
        {
            throw DomainError.named("concurrencyConflict", "Conflict between state version %1$s and event version %2$s", stateVersion, eventVersion);
        }

    }


}

