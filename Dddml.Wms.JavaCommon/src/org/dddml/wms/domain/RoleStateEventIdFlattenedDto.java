package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class RoleStateEventIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "roleId",
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
	
    private RoleStateEventId value;

    public RoleStateEventIdFlattenedDto()
    {
        this(new RoleStateEventId());
    }

    public RoleStateEventIdFlattenedDto(RoleStateEventId value)
    {
        this.value = value;
    }

    public RoleStateEventId toRoleStateEventId()
    {
        return this.value;
    }


    public String getRoleId()
    {
        return this.value.getRoleId();
    }

    public void setRoleId(String roleId)
    {
        this.value.setRoleId(roleId);
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

        RoleStateEventIdFlattenedDto other = (RoleStateEventIdFlattenedDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

