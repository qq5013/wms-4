package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class OrganizationStructureTypeStateEventIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "id",
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
	
    private OrganizationStructureTypeStateEventId value;

    public OrganizationStructureTypeStateEventIdFlattenedDto()
    {
        this(new OrganizationStructureTypeStateEventId());
    }

    public OrganizationStructureTypeStateEventIdFlattenedDto(OrganizationStructureTypeStateEventId value)
    {
        this.value = value;
    }

    public OrganizationStructureTypeStateEventId toOrganizationStructureTypeStateEventId()
    {
        return this.value;
    }


    public String getId()
    {
        return this.value.getId();
    }

    public void setId(String id)
    {
        this.value.setId(id);
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

        OrganizationStructureTypeStateEventIdFlattenedDto other = (OrganizationStructureTypeStateEventIdFlattenedDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

