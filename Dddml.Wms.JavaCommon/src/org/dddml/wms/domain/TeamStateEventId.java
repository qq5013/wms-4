package org.dddml.wms.domain;

import java.io.Serializable;

public class TeamStateEventId implements Serializable
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

    private Long version;

    public Long getVersion()
    {
        return this.version;
    }

    public void setVersion(Long version)
    {
        this.version = version;
    }

    public TeamStateEventId()
    {
    }

    public TeamStateEventId(String teamName, Long version)
    {
        this.teamName = teamName;
        this.version = version;
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

        TeamStateEventId other = (TeamStateEventId)obj;
        return true 
            && (teamName == other.teamName || (teamName != null && teamName.equals(other.teamName)))
            && (version == other.version || (version != null && version.equals(other.version)))
            ;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        if (this.teamName != null) {
            hash += 13 * this.teamName.hashCode();
        }
        if (this.version != null) {
            hash += 13 * this.version.hashCode();
        }
        return hash;
    }

}

