package org.dddml.wms.domain;

import java.util.Date;


public class TeamStateDto
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

    private Boolean active;

    public Boolean getActive()
    {
        return this.active;
    }

    public void setActive(Boolean active)
    {
        this.active = active;
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

    private PersonalNameDto[] players;

    public PersonalNameDto[] getPlayers() {
        return this.players;
    }

    public void setPlayers(PersonalNameDto[] players) {
        this.players = players;
    }

    private String[] mascots;

    public String[] getMascots() {
        return this.mascots;
    }

    public void setMascots(String[] mascots) {
        this.mascots = mascots;
    }


}

