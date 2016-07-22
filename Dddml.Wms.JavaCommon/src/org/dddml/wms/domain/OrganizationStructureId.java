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

    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        OrganizationStructureId other = (OrganizationStructureId)obj;
        return true 
            && (organizationStructureTypeId == other.organizationStructureTypeId || (organizationStructureTypeId != null && organizationStructureTypeId.equals(other.organizationStructureTypeId)))
            && (parentId == other.parentId || (parentId != null && parentId.equals(other.parentId)))
            && (subsidiaryId == other.subsidiaryId || (subsidiaryId != null && subsidiaryId.equals(other.subsidiaryId)))
            ;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        if (this.organizationStructureTypeId != null) {
            hash += 13 * this.organizationStructureTypeId.hashCode();
        }
        if (this.parentId != null) {
            hash += 13 * this.parentId.hashCode();
        }
        if (this.subsidiaryId != null) {
            hash += 13 * this.subsidiaryId.hashCode();
        }
        return hash;
    }

}

