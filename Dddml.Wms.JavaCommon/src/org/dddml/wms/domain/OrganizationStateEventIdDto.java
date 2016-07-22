package org.dddml.wms.domain;


public class OrganizationStateEventIdDto
{
	
    private OrganizationStateEventId value;

    public OrganizationStateEventIdDto()
    {
        this(new OrganizationStateEventId());
    }

    public OrganizationStateEventIdDto(OrganizationStateEventId value)
    {
        this.value = value;
    }

    public OrganizationStateEventId toOrganizationStateEventId()
    {
        return this.value;
    }

    public String getOrganizationId()
    {
        return this.value.getOrganizationId();
    }

    public void setOrganizationId(String organizationId)
    {
        this.value.setOrganizationId(organizationId);
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

        OrganizationStateEventIdDto other = (OrganizationStateEventIdDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

