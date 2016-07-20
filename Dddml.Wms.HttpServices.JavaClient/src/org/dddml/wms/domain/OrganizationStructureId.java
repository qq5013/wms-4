package org.dddml.wms.domain;


public class OrganizationStructureId
{
    private String organizationStructureTypeId;

    public String getOrganizationStructureTypeId()
    {
        return this.organizationStructureTypeId;
    }

    public void setOrganizationStructureTypeId(String organizationStructureTypeId)
    {
        this.organizationStructureTypeId = organizationStructureTypeId;
    }

    private String parentId;

    public String getParentId()
    {
        return this.parentId;
    }

    public void setParentId(String parentId)
    {
        this.parentId = parentId;
    }

    private String subsidiaryId;

    public String getSubsidiaryId()
    {
        return this.subsidiaryId;
    }

    public void setSubsidiaryId(String subsidiaryId)
    {
        this.subsidiaryId = subsidiaryId;
    }

    OrganizationStructureId ()
    {
    }

    public OrganizationStructureId (String organizationStructureTypeId, String parentId, String subsidiaryId)
    {
        this.organizationStructureTypeId = organizationStructureTypeId;
        this.parentId = parentId;
        this.subsidiaryId = subsidiaryId;
    }

}

