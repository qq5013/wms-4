package org.dddml.wms.domain;

import org.dddml.wms.domain.RolePermissionId;

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

}

