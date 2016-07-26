package org.dddml.wms.domain;


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


    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        UserPermissionMvoStateEventIdDto other = (UserPermissionMvoStateEventIdDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

