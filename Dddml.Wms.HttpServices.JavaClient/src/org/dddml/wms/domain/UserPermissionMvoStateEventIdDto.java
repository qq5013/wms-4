package org.dddml.wms.domain;

import org.dddml.wms.domain.UserPermissionIdDto;

public class UserPermissionMvoStateEventIdDto
{
	
    private UserPermissionMvoStateEventId value;

    public UserPermissionMvoStateEventIdDto()
    {
        this(new UserPermissionMvoStateEventId());
    }

    public UserPermissionMvoStateEventIdDto(UserPermissionMvoStateEventId value)
    {
        this.value = value;
    }

    public UserPermissionMvoStateEventId toUserPermissionMvoStateEventId()
    {
        return this.value;
    }

    public UserPermissionIdDto getUserPermissionId()
    {
        return new UserPermissionIdDto(this.value.getUserPermissionId());
    }

    public void setUserPermissionId(UserPermissionIdDto userPermissionId)
    {
        this.value.setUserPermissionId(userPermissionId.toUserPermissionId());
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

