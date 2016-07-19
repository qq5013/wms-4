package org.dddml.wms.domain;


public class RolePermissionStateEventId
{
    private RolePermissionId id;

    public RolePermissionId getId()
    {
        return this.id;
    }

    public void setId(RolePermissionId id)
    {
        this.id = id;
    }

    private Long version;

    public Long getVersion()
    {
        return this.version;
    }

    public void setVersion(Long version)
    {
        this.version = version;
    }

    public String getIdRoleId()
    {
        return getId().getRoleId();
    }

    public void setIdRoleId(String idRoleId)
    {
        getId().setRoleId(idRoleId);
    }

    public String getIdPermissionId()
    {
        return getId().getPermissionId();
    }

    public void setIdPermissionId(String idPermissionId)
    {
        getId().setPermissionId(idPermissionId);
    }


}

