package org.dddml.wms.domain;


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

    public String getUserRoleIdUserId()
    {
        return getUserRoleId().getUserId();
    }

    public void setUserRoleIdUserId(String userRoleIdUserId)
    {
        getUserRoleId().setUserId(userRoleIdUserId);
    }

    public String getUserRoleIdRoleId()
    {
        return getUserRoleId().getRoleId();
    }

    public void setUserRoleIdRoleId(String userRoleIdRoleId)
    {
        getUserRoleId().setRoleId(userRoleIdRoleId);
    }

    UserRoleMvoStateEventId ()
    {
    }

    public UserRoleMvoStateEventId (UserRoleId userRoleId, Long userVersion)
    {
        this.userRoleId = userRoleId;
        this.userVersion = userVersion;
    }

}

