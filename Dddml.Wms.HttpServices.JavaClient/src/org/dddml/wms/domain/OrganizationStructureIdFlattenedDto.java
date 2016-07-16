package org.dddml.wms.domain;


public class OrganizationStructureIdFlattenedDto
{


    public static String[] getPropertyNames()
    {
        return new String[]{
            "organizationStructureTypeId",
            "parentId",
            "subsidiaryId",
        };
    }

    public static String[] getPropertyTypes()
    {
        return new String[]{
            "String",
            "String",
            "String",
        };
    }
	
    private OrganizationStructureId value;

    public OrganizationStructureIdFlattenedDto()
    {
        this(new OrganizationStructureId());
    }

    public OrganizationStructureIdFlattenedDto(OrganizationStructureId value)
    {
        this.value = value;
    }

    public OrganizationStructureId toOrganizationStructureId()
    {
        return this.value;
    }



    public String getOrganizationStructureTypeId()
    {
        return this.value.getOrganizationStructureTypeId();
    }

    public void setOrganizationStructureTypeId(String organizationStructureTypeId)
    {
        this.value.setOrganizationStructureTypeId(organizationStructureTypeId);
    }


    public String getParentId()
    {
        return this.value.getParentId();
    }

    public void setParentId(String parentId)
    {
        this.value.setParentId(parentId);
    }


    public String getSubsidiaryId()
    {
        return this.value.getSubsidiaryId();
    }

    public void setSubsidiaryId(String subsidiaryId)
    {
        this.value.setSubsidiaryId(subsidiaryId);
    }


}

