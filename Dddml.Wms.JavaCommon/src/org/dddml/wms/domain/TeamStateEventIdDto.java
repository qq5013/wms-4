package org.dddml.wms.domain;


public class TeamStateEventIdDto
{
	
    private TeamStateEventId value;

    public TeamStateEventIdDto()
    {
        this(new TeamStateEventId());
    }

    public TeamStateEventIdDto(TeamStateEventId value)
    {
        this.value = value;
    }

    public TeamStateEventId toTeamStateEventId()
    {
        return this.value;
    }

    public String getTeamName()
    {
        return this.value.getTeamName();
    }

    public void setTeamName(String teamName)
    {
        this.value.setTeamName(teamName);
    }

    public Long getVersion()
    {
        return this.value.getVersion();
    }

    public void setVersion(Long version)
    {
        this.value.setVersion(version);
    }


    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        TeamStateEventIdDto other = (TeamStateEventIdDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

