package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.AbstractCommandDto;

public abstract class AbstractUserRoleCommandDto extends AbstractCommandDto
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


}

