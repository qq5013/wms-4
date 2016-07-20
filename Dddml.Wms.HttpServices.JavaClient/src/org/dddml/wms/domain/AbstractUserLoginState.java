package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.specialization.DomainError;
import org.dddml.wms.domain.UserLoginStateEvent.*;

public abstract class AbstractUserLoginState implements UserLoginState
{

    private UserLoginId userLoginId = new UserLoginId();

    public UserLoginId getUserLoginId() {
        return this.userLoginId;
    }

    public void setUserLoginId(UserLoginId userLoginId) {
        this.userLoginId = userLoginId;
    }

    private LoginKey loginKey;

    public LoginKey getLoginKey()
    {
        return this.loginKey;
    }

    public void setLoginKey(LoginKey loginKey)
    {
        this.loginKey = loginKey;
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


    public AbstractUserLoginState()
    {
        initializeProperties();
    }
    
    protected void initializeProperties() {
    }


    public void mutate(Event e) {
        if (e instanceof UserLoginStateCreated) {
            when((UserLoginStateCreated) e);
        } else if (e instanceof UserLoginStateMergePatched) {
            when((UserLoginStateMergePatched) e);
        } else if (e instanceof UserLoginStateRemoved) {
            when((UserLoginStateRemoved) e);
        }
    }

    public void when(UserLoginStateCreated e)
    {
        throwOnWrongEvent(e);
        this.setActive(e.getActive());

        this.setDeleted(false);

        this.setCreatedBy(e.getCreatedBy());
        this.setCreatedAt(e.getCreatedAt());

    }

    public void when(UserLoginStateMergePatched e)
    {
        throwOnWrongEvent(e);

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

    }

    public void when(UserLoginStateRemoved e)
    {
        throwOnWrongEvent(e);

        this.setDeleted(true);
        this.setUpdatedBy(e.getCreatedBy());
        this.setUpdatedAt(e.getCreatedAt());

    }

    protected void throwOnWrongEvent(UserLoginStateEvent stateEvent)
    {
        String stateEntityIdUserId = this.getUserLoginId().getUserId();
        String eventEntityIdUserId = stateEvent.getStateEventId().getUserId();
        if (stateEntityIdUserId != eventEntityIdUserId)
        {
            throw DomainError.named("mutateWrongEntity", "Entity Id UserId %1$s in state but entity id UserId %2$s in event", stateEntityIdUserId, eventEntityIdUserId);
        }

        LoginKey stateEntityIdLoginKey = this.getUserLoginId().getLoginKey();
        LoginKey eventEntityIdLoginKey = stateEvent.getStateEventId().getLoginKey();
        if (stateEntityIdLoginKey != eventEntityIdLoginKey)
        {
            throw DomainError.named("mutateWrongEntity", "Entity Id LoginKey %1$s in state but entity id LoginKey %2$s in event", stateEntityIdLoginKey, eventEntityIdLoginKey);
        }

        Long stateVersion = this.getVersion();
        Long eventVersion = stateEvent.getVersion();
        if (UserLoginState.VERSION_ZERO.equals(eventVersion))
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

