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

    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        RolePermissionId other = (RolePermissionId)obj;
        return true 
            && (roleId == other.roleId || (roleId != null && roleId.equals(other.roleId)))
            && (permissionId == other.permissionId || (permissionId != null && permissionId.equals(other.permissionId)))
            ;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        if (this.roleId != null) {
            hash += 13 * this.roleId.hashCode();
        }
        if (this.permissionId != null) {
            hash += 13 * this.permissionId.hashCode();
        }
        return hash;
    }

}

