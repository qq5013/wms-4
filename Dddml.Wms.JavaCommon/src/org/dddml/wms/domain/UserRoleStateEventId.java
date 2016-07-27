package org.dddml.wms.domain;

import java.io.Serializable;

public class UserRoleStateEventId implements Serializable
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

    public UserRoleStateEventId()
    {
    }

    public UserRoleStateEventId(String userId, String roleId, Long userVersion)
    {
        this.userId = userId;
        this.roleId = roleId;
        this.userVersion = userVersion;
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

        UserRoleStateEventId other = (UserRoleStateEventId)obj;
        return true 
            && (userId == other.userId || (userId != null && userId.equals(other.userId)))
            && (roleId == other.roleId || (roleId != null && roleId.equals(other.roleId)))
            && (userVersion == other.userVersion || (userVersion != null && userVersion.equals(other.userVersion)))
            ;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        if (this.userId != null) {
            hash += 13 * this.userId.hashCode();
        }
        if (this.roleId != null) {
            hash += 13 * this.roleId.hashCode();
        }
        if (this.userVersion != null) {
            hash += 13 * this.userVersion.hashCode();
        }
        return hash;
    }

}

