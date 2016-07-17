package org.dddml.wms.domain;


public class RolePermissionIdFlattenedDto
{


    private static String[] _propertyNames = new String[]{
            "roleId",
            "permissionId",
        };

    private static String[] _propertyTypes = new String[]{
            "String",
            "String",
        };

    public static String[] getPropertyNames()
    {
        return _propertyNames;
    }

    public static String[] getPropertyTypes()
    {
        return _propertyTypes;
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


}

