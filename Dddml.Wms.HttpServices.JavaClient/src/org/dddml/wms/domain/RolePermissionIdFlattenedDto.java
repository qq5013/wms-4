package org.dddml.wms.domain;


public class RolePermissionIdFlattenedDto
{


    public static String[] getPropertyNames()
    {
        return new String[]{
            "roleId",
            "permissionId",
        };
    }

    public static String[] getPropertyTypes()
    {
        return new String[]{
            "String",
            "String",
        };
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

