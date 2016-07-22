package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class LocatorStateEventIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "locatorId",
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
	
    private LocatorStateEventId value;

    public LocatorStateEventIdFlattenedDto()
    {
        this(new LocatorStateEventId());
    }

    public LocatorStateEventIdFlattenedDto(LocatorStateEventId value)
    {
        this.value = value;
    }

    public LocatorStateEventId toLocatorStateEventId()
    {
        return this.value;
    }


    public String getLocatorId()
    {
        return this.value.getLocatorId();
    }

    public void setLocatorId(String locatorId)
    {
        this.value.setLocatorId(locatorId);
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

        LocatorStateEventIdFlattenedDto other = (LocatorStateEventIdFlattenedDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

