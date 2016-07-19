package org.dddml.wms.domain;


public class OrganizationStructureStateEventId
{
    private OrganizationStructureId id;

    public OrganizationStructureId getId()
    {
        return this.id;
    }

    public void setId(OrganizationStructureId id)
    {
        this.id = id;
    }

    private Long version;

    public Long getVersion()
    {
        return this.version;
    }

    public void setVersion(Long version)
    {
        this.version = version;
    }

    public String getIdOrganizationStructureTypeId()
    {
        return getId().getOrganizationStructureTypeId();
    }

    public void setIdOrganizationStructureTypeId(String idOrganizationStructureTypeId)
    {
        getId().setOrganizationStructureTypeId(idOrganizationStructureTypeId);
    }

    public String getIdParentId()
    {
        return getId().getParentId();
    }

    public void setIdParentId(String idParentId)
    {
        getId().setParentId(idParentId);
    }

    public String getIdSubsidiaryId()
    {
        return getId().getSubsidiaryId();
    }

    public void setIdSubsidiaryId(String idSubsidiaryId)
    {
        getId().setSubsidiaryId(idSubsidiaryId);
    }


}

