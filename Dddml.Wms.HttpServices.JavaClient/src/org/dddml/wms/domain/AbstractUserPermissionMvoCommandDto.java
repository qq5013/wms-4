package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.AbstractCommandDto;

public abstract class AbstractUserPermissionMvoCommandDto extends AbstractCommandDto
{
    private UserPermissionIdDto userPermissionId;

    public UserPermissionIdDto getUserPermissionId()
    {
        return this.userPermissionId;
    }

    public void setUserPermissionId(UserPermissionIdDto userPermissionId)
    {
        this.userPermissionId = userPermissionId;
    }

    private Long userVersion;

    public Long getUserVersion()
    {
        return this.userVersion;
    }

    public void setUserVersion(Long userVersion)
    {
        this.userVersion = userVersion;
    }


}

