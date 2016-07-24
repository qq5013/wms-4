package org.dddml.wms.domain;

import java.io.Serializable;

public class UserPermissionId implements Serializable
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

    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        UserPermissionId other = (UserPermissionId)obj;
        return true 
            && (userId == other.userId || (userId != null && userId.equals(other.userId)))
            && (permissionId == other.permissionId || (permissionId != null && permissionId.equals(other.permissionId)))
            ;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        if (this.userId != null) {
            hash += 13 * this.userId.hashCode();
        }
        if (this.permissionId != null) {
            hash += 13 * this.permissionId.hashCode();
        }
        return hash;
    }

}

