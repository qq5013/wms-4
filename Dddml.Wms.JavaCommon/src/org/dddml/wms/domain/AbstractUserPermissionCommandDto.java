package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.AbstractCommandDto;

public abstract class AbstractUserPermissionCommandDto extends AbstractCommandDto
{
    private String permissionId;

    public String getPermissionId()
    {
        return this.permissionId;
    }

    public void setPermissionId(String permissionId)
    {
        this.permissionId = permissionId;
    }


}

