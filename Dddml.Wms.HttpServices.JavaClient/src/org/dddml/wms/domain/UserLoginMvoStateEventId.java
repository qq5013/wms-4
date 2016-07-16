package org.dddml.wms.domain;

import org.dddml.wms.domain.UserLoginId;

public class UserLoginMvoStateEventId
{
    private UserLoginId userLoginId;

    public UserLoginId getUserLoginId()
    {
        return this.userLoginId;
    }

    public void setUserLoginId(UserLoginId userLoginId)
    {
        this.userLoginId = userLoginId;
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

