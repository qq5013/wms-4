package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class AudienceStateEventIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "clientId",
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
	
    private AudienceStateEventId value;

    public AudienceStateEventIdFlattenedDto()
    {
        this(new AudienceStateEventId());
    }

    public AudienceStateEventIdFlattenedDto(AudienceStateEventId value)
    {
        this.value = value;
    }

    public AudienceStateEventId toAudienceStateEventId()
    {
        return this.value;
    }


    public String getClientId()
    {
        return this.value.getClientId();
    }

    public void setClientId(String clientId)
    {
        this.value.setClientId(clientId);
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

        AudienceStateEventIdFlattenedDto other = (AudienceStateEventIdFlattenedDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

