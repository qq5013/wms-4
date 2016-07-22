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


    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        PermissionStateEventIdDto other = (PermissionStateEventIdDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

