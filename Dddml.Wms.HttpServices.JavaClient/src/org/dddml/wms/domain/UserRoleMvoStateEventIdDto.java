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


}

