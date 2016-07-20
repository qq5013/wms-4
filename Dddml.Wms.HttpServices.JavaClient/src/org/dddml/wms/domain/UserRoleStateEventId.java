package org.dddml.wms.domain;


public class UserRoleStateEventId
{
    private String userId;

    public String getUserId()
    {
        return this.userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    private String roleId;

    public String getRoleId()
    {
        return this.roleId;
    }

    public void setRoleId(String roleId)
    {
        this.roleId = roleId;
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

    UserRoleStateEventId ()
    {
    }

    public UserRoleStateEventId (String userId, String roleId, Long userVersion)
    {
        this.userId = userId;
        this.roleId = roleId;
        this.userVersion = userVersion;
    }

}

