package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class TeamStateEventIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "teamName",
            "version",
        };

    public static final String[] propertyTypes = new String[]{
            "String",
            "Long",
        };

    public static final Map<String, String> propertyTypeMap;

    static {
        propertyTypeMap = new HashMap<String, String>();
        for (int i = 0; i < propertyNames.length; i++ ) {
            propertyTypeMap.put(propertyNames[i], propertyTypes[i]);
        }
    }
	
    private TeamStateEventId value;

    public TeamStateEventIdFlattenedDto()
    {
        this(new TeamStateEventId());
    }

    public TeamStateEventIdFlattenedDto(TeamStateEventId value)
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

        TeamStateEventIdFlattenedDto other = (TeamStateEventIdFlattenedDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

