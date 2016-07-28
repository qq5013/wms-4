package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.UserRoleStateEvent.*;

public abstract class AbstractUserRoleState implements UserRoleState
{

    private UserRoleId userRoleId = new UserRoleId();

    public UserRoleId getUserRoleId() {
        return this.userRoleId;
    }

    public void setUserRoleId(UserRoleId userRoleId) {
        this.userRoleId = userRoleId;
    }

    public String getUserId() {
        return this.getUserRoleId().getUserId();
    }
        
    public void setUserId(String userId) {
        this.getUserRoleId().setUserId(userId);
    }

    public String getRoleId() {
        return this.getUserRoleId().getRoleId();
    }
        
    public void setRoleId(String roleId) {
        this.getUserRoleId().setRoleId(roleId);
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
        return this.getVersion() == null;
    }


    public AbstractUserRoleState()
    {
        initializeProperties();
    }
    
    protected void initializeProperties() {
    }


    public void mutate(Event e) {
        if (e instanceof UserRoleStateCreated) {
            when((UserRoleStateCreated) e);
        } else if (e instanceof UserRoleStateMergePatched) {
            when((UserRoleStateMergePatched) e);
        } else if (e instanceof UserRoleStateRemoved) {
            when((UserRoleStateRemoved) e);
        }
    }

    public void when(UserRoleStateCreated e)
    {
        throwOnWrongEvent(e);
        this.setActive(e.getActive());

        this.setDeleted(false);

        this.setCreatedBy(e.getCreatedBy());
        this.setCreatedAt(e.getCreatedAt());

    }

    public void when(UserRoleStateMergePatched e)
    {
        throwOnWrongEvent(e);

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

    public void when(UserRoleStateRemoved e)
    {
        throwOnWrongEvent(e);

        this.setDeleted(true);
        this.setUpdatedBy(e.getCreatedBy());
        this.setUpdatedAt(e.getCreatedAt());

    }

    public void save()
    {
    }

    protected void throwOnWrongEvent(UserRoleStateEvent stateEvent)
    {
        String stateEntityIdUserId = this.getUserRoleId().getUserId();
        String eventEntityIdUserId = stateEvent.getStateEventId().getUserId();
        if (stateEntityIdUserId != eventEntityIdUserId)
        {
            throw DomainError.named("mutateWrongEntity", "Entity Id UserId %1$s in state but entity id UserId %2$s in event", stateEntityIdUserId, eventEntityIdUserId);
        }

        String stateEntityIdRoleId = this.getUserRoleId().getRoleId();
        String eventEntityIdRoleId = stateEvent.getStateEventId().getRoleId();
        if (stateEntityIdRoleId != eventEntityIdRoleId)
        {
            throw DomainError.named("mutateWrongEntity", "Entity Id RoleId %1$s in state but entity id RoleId %2$s in event", stateEntityIdRoleId, eventEntityIdRoleId);
        }

        Long stateVersion = this.getVersion();
        Long eventVersion = stateEvent.getVersion();
        if (eventVersion == null) {
            eventVersion = stateVersion == null ? UserRoleState.VERSION_NULL : stateVersion;
            stateEvent.setVersion(eventVersion);
        }
        if (!(stateVersion == null && eventVersion.equals(UserRoleState.VERSION_NULL)) && !eventVersion.equals(stateVersion))
        {
            throw DomainError.named("concurrencyConflict", "Conflict between state version (%1$s) and event version (%2$s)", stateVersion, eventVersion);
        }

    }

    public static class SimpleUserRoleState extends AbstractUserRoleState
    {
    }


}

