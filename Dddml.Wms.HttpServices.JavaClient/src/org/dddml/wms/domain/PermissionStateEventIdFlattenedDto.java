package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class PermissionStateEventIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "permissionId",
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
	
    private PermissionStateEventId value;

    public PermissionStateEventIdFlattenedDto()
    {
        this(new PermissionStateEventId());
    }

    public PermissionStateEventIdFlattenedDto(PermissionStateEventId value)
    {
        this.value = value;
    }

    public PermissionStateEventId toPermissionStateEventId()
    {
        return this.value;
    }


    public String getPermissionId()
    {
        return this.value.getPermissionId();
    }

    public void setPermissionId(String permissionId)
    {
        this.value.setPermissionId(permissionId);
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

        PermissionStateEventIdFlattenedDto other = (PermissionStateEventIdFlattenedDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

