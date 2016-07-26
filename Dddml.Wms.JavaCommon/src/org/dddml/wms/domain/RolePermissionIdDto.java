package org.dddml.wms.domain;


public class RolePermissionIdDto
{
	
    private RolePermissionId value;

    public RolePermissionIdDto()
    {
        this(new RolePermissionId());
    }

    public RolePermissionIdDto(RolePermissionId value)
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

        RolePermissionIdDto other = (RolePermissionIdDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

