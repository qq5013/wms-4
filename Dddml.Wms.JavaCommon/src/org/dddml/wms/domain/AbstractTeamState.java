package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.TeamStateEvent.*;

public abstract class AbstractTeamState implements TeamState
{

    private String teamName;

    public String getTeamName()
    {
        return this.teamName;
    }

    public void setTeamName(String teamName)
    {
        this.teamName = teamName;
    }

    private String description;

    public String getDescription()
    {
        return this.description;
    }

    public void setDescription(String description)
    {
        this.description = description;
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

    private Set<PersonalName> players;

    public Set<PersonalName> getPlayers()
    {
        return this.players;
    }

    public void setPlayers(Set<PersonalName> players)
    {
        this.players = players;
    }

    private Set<String> mascots;

    public Set<String> getMascots()
    {
        return this.mascots;
    }

    public void setMascots(Set<String> mascots)
    {
        this.mascots = mascots;
    }

    public boolean isStateUnsaved() 
    {
        return this.getVersion() == null;
    }


    public AbstractTeamState()
    {
        initializeProperties();
    }
    
    protected void initializeProperties() {
    }


    public void mutate(Event e) {
        if (e instanceof TeamStateCreated) {
            when((TeamStateCreated) e);
        } else if (e instanceof TeamStateMergePatched) {
            when((TeamStateMergePatched) e);
        } else if (e instanceof TeamStateDeleted) {
            when((TeamStateDeleted) e);
        }
    }

    public void when(TeamStateCreated e)
    {
        throwOnWrongEvent(e);
        this.setDescription(e.getDescription());
        this.setPlayers(e.getPlayers());
        this.setMascots(e.getMascots());
        this.setActive(e.getActive());

        this.setDeleted(false);

        this.setCreatedBy(e.getCreatedBy());
        this.setCreatedAt(e.getCreatedAt());

    }

    public void when(TeamStateMergePatched e)
    {
        throwOnWrongEvent(e);

        if (e.getDescription() == null)
        {
            if (e.getIsPropertyDescriptionRemoved() != null && e.getIsPropertyDescriptionRemoved())
            {
                this.setDescription(null);
            }
        }
        else
        {
            this.setDescription(e.getDescription());
        }
        if (e.getPlayers() == null)
        {
            if (e.getIsPropertyPlayersRemoved() != null && e.getIsPropertyPlayersRemoved())
            {
                this.setPlayers(null);
            }
        }
        else
        {
            this.setPlayers(e.getPlayers());
        }
        if (e.getMascots() == null)
        {
            if (e.getIsPropertyMascotsRemoved() != null && e.getIsPropertyMascotsRemoved())
            {
                this.setMascots(null);
            }
        }
        else
        {
            this.setMascots(e.getMascots());
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

    public void when(TeamStateDeleted e)
    {
        throwOnWrongEvent(e);

        this.setDeleted(true);
        this.setUpdatedBy(e.getCreatedBy());
        this.setUpdatedAt(e.getCreatedAt());

    }

    public void save()
    {
    }

    protected void throwOnWrongEvent(TeamStateEvent stateEvent)
    {
        String stateEntityId = this.getTeamName(); // Aggregate Id
        String eventEntityId = stateEvent.getStateEventId().getTeamName(); // EntityBase.Aggregate.GetStateEventIdPropertyIdName();
        if (!stateEntityId.equals(eventEntityId))
        {
            throw DomainError.named("mutateWrongEntity", "Entity Id %1$s in state but entity id %2$s in event", stateEntityId, eventEntityId);
        }

        Long stateVersion = this.getVersion();
        Long eventVersion = stateEvent.getStateEventId().getVersion();// Aggregate Version
        if (eventVersion == null) {
            throw new NullPointerException("stateEvent.getStateEventId().getVersion() == null");
        }
        if (!(stateVersion == null && eventVersion.equals(TeamState.VERSION_NULL)) && !eventVersion.equals(stateVersion))
        {
            throw DomainError.named("concurrencyConflict", "Conflict between state version (%1$s) and event version (%2$s)", stateVersion, eventVersion);
        }

    }

    public static class SimpleTeamState extends AbstractTeamState
    {
    }


}

