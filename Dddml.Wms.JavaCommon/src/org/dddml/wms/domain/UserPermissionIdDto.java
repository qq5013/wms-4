package org.dddml.wms.domain;


public class UserPermissionIdDto
{
	
    private UserPermissionId value;

    public UserPermissionIdDto()
    {
        this(new UserPermissionId());
    }

    public UserPermissionIdDto(UserPermissionId value)
    {
        this.value = value;
    }

    public UserPermissionId toUserPermissionId()
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

    public String getPermissionId()
    {
        return this.value.getPermissionId();
    }

    public void setPermissionId(String permissionId)
    {
        this.value.setPermissionId(permissionId);
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

        UserPermissionIdDto other = (UserPermissionIdDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

