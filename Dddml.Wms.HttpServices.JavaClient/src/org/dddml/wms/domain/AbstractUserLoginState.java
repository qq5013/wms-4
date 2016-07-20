package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
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


    public abstract void mutate(Event e);

    public abstract void when(UserLoginStateCreated e);

    public abstract void when(UserLoginStateMergePatched e);

    public abstract void when(UserLoginStateRemoved e);
    
}

