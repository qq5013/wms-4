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

    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        UserRoleId other = (UserRoleId)obj;
        return true 
            && (userId == other.userId || (userId != null && userId.equals(other.userId)))
            && (roleId == other.roleId || (roleId != null && roleId.equals(other.roleId)))
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
        return hash;
    }

}

