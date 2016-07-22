package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class RolePermissionIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "roleId",
            "permissionId",
        };

    public static final String[] propertyTypes = new String[]{
            "String",
            "String",
        };

    public static final Map<String, String> propertyTypeMap;

    static {
        propertyTypeMap = new HashMap<String, String>();
        for (int i = 0; i < propertyNames.length; i++ ) {
            propertyTypeMap.put(propertyNames[i], propertyTypes[i]);
        }
    }
	
    private RolePermissionId value;

    public RolePermissionIdFlattenedDto()
    {
        this(new RolePermissionId());
    }

    public RolePermissionIdFlattenedDto(RolePermissionId value)
    {
        this.value = value;
    }

    public RolePermissionId toRolePermissionId()
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

    public String getPermissionId()
    {
        return this.value.getPermissionId();
    }

    public void setPermissionId(String permissionId)
    {
        this.value.setPermissionId(permissionId);
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

        RolePermissionIdFlattenedDto other = (RolePermissionIdFlattenedDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

