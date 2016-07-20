package org.dddml.wms.domain;


public class RolePermissionStateEventIdDto
{
	
    private RolePermissionStateEventId value;

    public RolePermissionStateEventIdDto()
    {
        this(new RolePermissionStateEventId());
    }

    public RolePermissionStateEventIdDto(RolePermissionStateEventId value)
    {
        this.value = value;
    }

    public RolePermissionStateEventId toRolePermissionStateEventId()
    {
        return this.value;
    }

    public RolePermissionIdDto getId()
    {
        return new RolePermissionIdDto(this.value.getId());
    }

    public void setId(RolePermissionIdDto id)
    {
        this.value.setId(id.toRolePermissionId());
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

        RolePermissionStateEventIdDto other = (RolePermissionStateEventIdDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

