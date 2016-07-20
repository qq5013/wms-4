package org.dddml.wms.domain;


public class OrganizationStructureTypeStateEventIdDto
{
	
    private OrganizationStructureTypeStateEventId value;

    public OrganizationStructureTypeStateEventIdDto()
    {
        this(new OrganizationStructureTypeStateEventId());
    }

    public OrganizationStructureTypeStateEventIdDto(OrganizationStructureTypeStateEventId value)
    {
        this.value = value;
    }

    public OrganizationStructureTypeStateEventId toOrganizationStructureTypeStateEventId()
    {
        return this.value;
    }

    public String getId()
    {
        return this.value.getId();
    }

    public void setId(String id)
    {
        this.value.setId(id);
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

        OrganizationStructureTypeStateEventIdDto other = (OrganizationStructureTypeStateEventIdDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

