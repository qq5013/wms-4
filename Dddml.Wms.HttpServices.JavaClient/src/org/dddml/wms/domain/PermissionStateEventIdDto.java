package org.dddml.wms.domain;


public class PermissionStateEventIdDto
{
	
    private PermissionStateEventId value;

    public PermissionStateEventIdDto()
    {
        this(new PermissionStateEventId());
    }

    public PermissionStateEventIdDto(PermissionStateEventId value)
    {
        this.value = value;
    }

    public PermissionStateEventId toPermissionStateEventId()
    {
        return this.value;
    }

    public String getPermissionId()
    {
        return this.value.getPermissionId();
    }

    public void setPermissionId(String permissionId)
    {
        this.value.setPermissionId(permissionId);
    }

    public Long getVersion()
    {
        return this.value.getVersion();
    }

    public void setVersion(Long version)
    {
        this.value.setVersion(version);
    }


}

