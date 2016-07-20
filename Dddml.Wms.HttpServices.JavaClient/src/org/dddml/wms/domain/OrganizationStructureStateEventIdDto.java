package org.dddml.wms.domain;


public class OrganizationStructureStateEventIdDto
{
	
    private OrganizationStructureStateEventId value;

    public OrganizationStructureStateEventIdDto()
    {
        this(new OrganizationStructureStateEventId());
    }

    public OrganizationStructureStateEventIdDto(OrganizationStructureStateEventId value)
    {
        this.value = value;
    }

    public OrganizationStructureStateEventId toOrganizationStructureStateEventId()
    {
        return this.value;
    }

    public OrganizationStructureIdDto getId()
    {
        return new OrganizationStructureIdDto(this.value.getId());
    }

    public void setId(OrganizationStructureIdDto id)
    {
        this.value.setId(id.toOrganizationStructureId());
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

        OrganizationStructureStateEventIdDto other = (OrganizationStructureStateEventIdDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

