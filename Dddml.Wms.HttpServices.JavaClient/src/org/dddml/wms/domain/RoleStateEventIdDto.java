package org.dddml.wms.domain;


public class RoleStateEventIdDto
{
	
    private RoleStateEventId value;

    public RoleStateEventIdDto()
    {
        this(new RoleStateEventId());
    }

    public RoleStateEventIdDto(RoleStateEventId value)
    {
        this.value = value;
    }

    public RoleStateEventId toRoleStateEventId()
    {
        return this.value;
    }

    public String getRoleId()
    {
        return this.value.getRoleId();
    }

    public void setRoleId(String roleId)
    {
        this.value.setRoleId(roleId);
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

