package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class RolePermissionStateEventIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "idRoleId",
            "idPermissionId",
            "version",
        };

    public static final String[] propertyTypes = new String[]{
            "String",
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
	
    private RolePermissionStateEventId value;

    public RolePermissionStateEventIdFlattenedDto()
    {
        this(new RolePermissionStateEventId());
    }

    public RolePermissionStateEventIdFlattenedDto(RolePermissionStateEventId value)
    {
        this.value = value;
    }

    public RolePermissionStateEventId toRolePermissionStateEventId()
    {
        return this.value;
    }


    public String getIdRoleId()
    {
        return this.value.getId().getRoleId();
    }

    public void setIdRoleId(String idRoleId)
    {
        this.value.getId().setRoleId(idRoleId);
    }

    public String getIdPermissionId()
    {
        return this.value.getId().getPermissionId();
    }

    public void setIdPermissionId(String idPermissionId)
    {
        this.value.getId().setPermissionId(idPermissionId);
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

        RolePermissionStateEventIdFlattenedDto other = (RolePermissionStateEventIdFlattenedDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

