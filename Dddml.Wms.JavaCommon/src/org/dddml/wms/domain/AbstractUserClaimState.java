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
        return this.getVersion() == null;
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

    public void when(UserClaimStateCreated e)
    {
        throwOnWrongEvent(e);
        this.setClaimType(e.getClaimType());
        this.setClaimValue(e.getClaimValue());
        this.setActive(e.getActive());

        this.setDeleted(false);

        this.setCreatedBy(e.getCreatedBy());
        this.setCreatedAt(e.getCreatedAt());

    }

    public void when(UserClaimStateMergePatched e)
    {
        throwOnWrongEvent(e);

        if (e.getClaimType() == null)
        {
            if (e.getIsPropertyClaimTypeRemoved() != null && e.getIsPropertyClaimTypeRemoved())
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
            if (e.getIsPropertyClaimValueRemoved() != null && e.getIsPropertyClaimValueRemoved())
            {
                this.setClaimValue(null);
            }
        }
        else
        {
            this.setClaimValue(e.getClaimValue());
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

        this.setUpdatedBy(e.getCreatedBy());
        this.setUpdatedAt(e.getCreatedAt());

    }

    public void when(UserClaimStateRemoved e)
    {
        throwOnWrongEvent(e);

        this.setDeleted(true);
        this.setUpdatedBy(e.getCreatedBy());
        this.setUpdatedAt(e.getCreatedAt());

    }

    protected void throwOnWrongEvent(UserClaimStateEvent stateEvent)
    {
        String stateEntityIdUserId = this.getUserClaimId().getUserId();
        String eventEntityIdUserId = stateEvent.getStateEventId().getUserId();
        if (stateEntityIdUserId != eventEntityIdUserId)
        {
            throw DomainError.named("mutateWrongEntity", "Entity Id UserId %1$s in state but entity id UserId %2$s in event", stateEntityIdUserId, eventEntityIdUserId);
        }

        Integer stateEntityIdClaimId = this.getUserClaimId().getClaimId();
        Integer eventEntityIdClaimId = stateEvent.getStateEventId().getClaimId();
        if (stateEntityIdClaimId != eventEntityIdClaimId)
        {
            throw DomainError.named("mutateWrongEntity", "Entity Id ClaimId %1$s in state but entity id ClaimId %2$s in event", stateEntityIdClaimId, eventEntityIdClaimId);
        }

        Long stateVersion = this.getVersion();
        Long eventVersion = stateEvent.getVersion();
        if (!(stateVersion == null && eventVersion == UserClaimState.VERSION_NULL) && stateVersion != eventVersion)
        {
            throw DomainError.named("concurrencyConflict", "Conflict between state version (%1$s) and event version (%2$s + 1)", stateVersion, eventVersion);
        }

    }

    public static class SimpleUserClaimState extends AbstractUserClaimState
    {
    }


}

