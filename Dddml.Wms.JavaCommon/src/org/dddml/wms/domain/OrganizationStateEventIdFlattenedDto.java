package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class OrganizationStateEventIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "organizationId",
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
	
    private OrganizationStateEventId value;

    public OrganizationStateEventIdFlattenedDto()
    {
        this(new OrganizationStateEventId());
    }

    public OrganizationStateEventIdFlattenedDto(OrganizationStateEventId value)
    {
        this.value = value;
    }

    public OrganizationStateEventId toOrganizationStateEventId()
    {
        return this.value;
    }


    public String getOrganizationId()
    {
        return this.value.getOrganizationId();
    }

    public void setOrganizationId(String organizationId)
    {
        this.value.setOrganizationId(organizationId);
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

        OrganizationStateEventIdFlattenedDto other = (OrganizationStateEventIdFlattenedDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

