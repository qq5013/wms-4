package org.dddml.wms.domain;

import org.dddml.wms.domain.UserPermissionId;

public class UserPermissionMvoStateEventId
{
    private UserPermissionId userPermissionId;

    public UserPermissionId getUserPermissionId()
    {
        return this.userPermissionId;
    }

    public void setUserPermissionId(UserPermissionId userPermissionId)
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

