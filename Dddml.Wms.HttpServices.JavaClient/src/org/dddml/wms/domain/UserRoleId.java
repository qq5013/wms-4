package org.dddml.wms.domain;


public class UserRoleId
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

    UserRoleId ()
    {
    }

    public UserRoleId (String userId, String roleId)
    {
        this.userId = userId;
        this.roleId = roleId;
    }

}

