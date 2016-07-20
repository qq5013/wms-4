package org.dddml.wms.domain;


public class RolePermissionId
{
    private String roleId;

    public String getRoleId()
    {
        return this.roleId;
    }

    public void setRoleId(String roleId)
    {
        this.roleId = roleId;
    }

    private String permissionId;

    public String getPermissionId()
    {
        return this.permissionId;
    }

    public void setPermissionId(String permissionId)
    {
        this.permissionId = permissionId;
    }

    RolePermissionId ()
    {
    }

    public RolePermissionId (String roleId, String permissionId)
    {
        this.roleId = roleId;
        this.permissionId = permissionId;
    }

}

