package org.dddml.wms.domain;


public class UserRoleStateEventIdDto
{
	
    private UserRoleStateEventId value;

    public UserRoleStateEventIdDto()
    {
        this(new UserRoleStateEventId());
    }

    public UserRoleStateEventIdDto(UserRoleStateEventId value)
    {
        this.value = value;
    }

    public UserRoleStateEventId toUserRoleStateEventId()
    {
        return this.value;
    }

    public String getUserId()
    {
        return this.value.getUserId();
    }

    public void setUserId(String userId)
    {
        this.value.setUserId(userId);
    }

    public String getRoleId()
    {
        return this.value.getRoleId();
    }

    public void setRoleId(String roleId)
    {
        this.value.setRoleId(roleId);
    }

    public Long getUserVersion()
    {
        return this.value.getUserVersion();
    }

    public void setUserVersion(Long userVersion)
    {
        this.value.setUserVersion(userVersion);
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

        UserRoleStateEventIdDto other = (UserRoleStateEventIdDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

