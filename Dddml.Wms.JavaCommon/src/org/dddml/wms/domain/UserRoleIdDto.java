package org.dddml.wms.domain;


public class UserRoleIdDto
{
	
    private UserRoleId value;

    public UserRoleIdDto()
    {
        this(new UserRoleId());
    }

    public UserRoleIdDto(UserRoleId value)
    {
        this.value = value;
    }

    public UserRoleId toUserRoleId()
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


    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        UserRoleIdDto other = (UserRoleIdDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

