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


}

