package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.specialization.DomainError;
import org.dddml.wms.domain.AudienceStateEvent.*;

public abstract class AbstractAudienceState implements AudienceState
{

    private String clientId;

    public String getClientId()
    {
        return this.clientId;
    }

    public void setClientId(String clientId)
    {
        this.clientId = clientId;
    }

    private String name;

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    private String base64Secret;

    public String getBase64Secret()
    {
        return this.base64Secret;
    }

    public void setBase64Secret(String base64Secret)
    {
        this.base64Secret = base64Secret;
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


    public AbstractAudienceState()
    {
        initializeProperties();
    }
    
    protected void initializeProperties() {
    }


    public void mutate(Event e) {
        if (e instanceof AudienceStateCreated) {
            when((AudienceStateCreated) e);
        } else if (e instanceof AudienceStateMergePatched) {
            when((AudienceStateMergePatched) e);
        } else if (e instanceof AudienceStateDeleted) {
            when((AudienceStateDeleted) e);
        }
    }

    public void when(AudienceStateCreated e)
    {
        throwOnWrongEvent(e);
        this.setName(e.getName());
        this.setBase64Secret(e.getBase64Secret());
        this.setActive(e.getActive());

        this.setDeleted(false);

        this.setCreatedBy(e.getCreatedBy());
        this.setCreatedAt(e.getCreatedAt());

    }

    public void when(AudienceStateMergePatched e)
    {
        throwOnWrongEvent(e);

        if (e.getName() == null)
        {
            if (e.getIsPropertyNameRemoved() != null && e.getIsPropertyNameRemoved())
            {
                this.setName(null);
            }
        }
        else
        {
            this.setName(e.getName());
        }
        if (e.getBase64Secret() == null)
        {
            if (e.getIsPropertyBase64SecretRemoved() != null && e.getIsPropertyBase64SecretRemoved())
            {
                this.setBase64Secret(null);
            }
        }
        else
        {
            this.setBase64Secret(e.getBase64Secret());
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

    public void when(AudienceStateDeleted e)
    {
        throwOnWrongEvent(e);

        this.setDeleted(true);
        this.setUpdatedBy(e.getCreatedBy());
        this.setUpdatedAt(e.getCreatedAt());

    }

    protected void throwOnWrongEvent(AudienceStateEvent stateEvent)
    {
        String stateEntityId = this.getClientId(); // Aggregate Id
        String eventEntityId = stateEvent.getStateEventId().getClientId(); // EntityBase.Aggregate.GetStateEventIdPropertyIdName();
        if (!stateEntityId.equals(eventEntityId))
        {
            throw DomainError.named("mutateWrongEntity", "Entity Id %1$s in state but entity id %2$s in event", stateEntityId, eventEntityId);
        }

        Long stateVersion = this.getVersion();
        if(stateVersion == null) {
            stateVersion = AudienceState.VERSION_ZERO;
        }
        Long eventVersion = stateEvent.getStateEventId().getVersion();// Aggregate Version
        if(eventVersion == null) {
            eventVersion = AudienceState.VERSION_ZERO;
            stateEvent.getStateEventId().setVersion(eventVersion);
        }
        if (!stateVersion.equals(eventVersion))
        {
            throw DomainError.named("concurrencyConflict", "Conflict between state version %1$s and event version %2$s", stateVersion, eventVersion);
        }

    }

    public static class SimpleAudienceState extends AbstractAudienceState
    {
    }


}

