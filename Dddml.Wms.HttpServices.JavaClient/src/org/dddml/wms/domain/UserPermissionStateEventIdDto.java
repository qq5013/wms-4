package org.dddml.wms.domain;


public class UserPermissionStateEventIdDto
{
	
    private UserPermissionStateEventId value;

    public UserPermissionStateEventIdDto()
    {
        this(new UserPermissionStateEventId());
    }

    public UserPermissionStateEventIdDto(UserPermissionStateEventId value)
    {
        this.value = value;
    }

    public UserPermissionStateEventId toUserPermissionStateEventId()
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

    public Long getUserVersion()
    {
        return this.value.getUserVersion();
    }

    public void setUserVersion(Long userVersion)
    {
        this.value.setUserVersion(userVersion);
    }


}

