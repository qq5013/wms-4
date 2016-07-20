package org.dddml.wms.domain;


public class UserPermissionId
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

    private String permissionId;

    public String getPermissionId()
    {
        return this.permissionId;
    }

    public void setPermissionId(String permissionId)
    {
        this.permissionId = permissionId;
    }

    UserPermissionId ()
    {
    }

    public UserPermissionId (String userId, String permissionId)
    {
        this.userId = userId;
        this.permissionId = permissionId;
    }

}

