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

    public String getUserPermissionIdUserId()
    {
        return getUserPermissionId().getUserId();
    }

    public void setUserPermissionIdUserId(String userPermissionIdUserId)
    {
        getUserPermissionId().setUserId(userPermissionIdUserId);
    }

    public String getUserPermissionIdPermissionId()
    {
        return getUserPermissionId().getPermissionId();
    }

    public void setUserPermissionIdPermissionId(String userPermissionIdPermissionId)
    {
        getUserPermissionId().setPermissionId(userPermissionIdPermissionId);
    }


}

