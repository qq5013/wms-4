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


}

