package org.dddml.wms.domain;


public class UserRoleMvoStateEventIdDto
{
	
    private UserRoleMvoStateEventId value;

    public UserRoleMvoStateEventIdDto()
    {
        this(new UserRoleMvoStateEventId());
    }

    public UserRoleMvoStateEventIdDto(UserRoleMvoStateEventId value)
    {
        this.value = value;
    }

    public UserRoleMvoStateEventId toUserRoleMvoStateEventId()
    {
        return this.value;
    }

    public UserRoleIdDto getUserRoleId()
    {
        return new UserRoleIdDto(this.value.getUserRoleId());
    }

    public void setUserRoleId(UserRoleIdDto userRoleId)
    {
        this.value.setUserRoleId(userRoleId.toUserRoleId());
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

        UserRoleMvoStateEventIdDto other = (UserRoleMvoStateEventIdDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

