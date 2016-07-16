package org.dddml.wms.domain;

import org.dddml.wms.domain.UserRoleId;

public class UserRoleMvoStateEventId
{
    private UserRoleId userRoleId;

    public UserRoleId getUserRoleId()
    {
        return this.userRoleId;
    }

    public void setUserRoleId(UserRoleId userRoleId)
    {
        this.userRoleId = userRoleId;
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

