package org.dddml.wms.domain;

import org.dddml.wms.domain.RolePermissionIdDto;
import java.util.Date;
import org.dddml.wms.domain.AbstractCommandDto;

public abstract class AbstractRolePermissionCommandDto extends AbstractCommandDto
{
    private RolePermissionIdDto id;

    public RolePermissionIdDto getId()
    {
        return this.id;
    }

    public void setId(RolePermissionIdDto id)
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

