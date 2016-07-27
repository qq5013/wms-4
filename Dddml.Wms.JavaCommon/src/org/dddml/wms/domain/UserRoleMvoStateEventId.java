package org.dddml.wms.domain;

import java.io.Serializable;

public class UserRoleMvoStateEventId implements Serializable
{
    private UserRoleId userRoleId = new UserRoleId();

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

    public UserRoleMvoStateEventId()
    {
    }

    public UserRoleMvoStateEventId(UserRoleId userRoleId, Long userVersion)
    {
        this.userRoleId = userRoleId;
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

        UserRoleMvoStateEventId other = (UserRoleMvoStateEventId)obj;
        return true 
            && (userRoleId == other.userRoleId || (userRoleId != null && userRoleId.equals(other.userRoleId)))
            && (userVersion == other.userVersion || (userVersion != null && userVersion.equals(other.userVersion)))
            ;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        if (this.userRoleId != null) {
            hash += 13 * this.userRoleId.hashCode();
        }
        if (this.userVersion != null) {
            hash += 13 * this.userVersion.hashCode();
        }
        return hash;
    }

}

