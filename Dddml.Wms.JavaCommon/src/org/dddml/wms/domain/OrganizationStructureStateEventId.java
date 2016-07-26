package org.dddml.wms.domain;

import java.io.Serializable;

public class OrganizationStructureStateEventId implements Serializable
{
    private OrganizationStructureId id = new OrganizationStructureId();

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

    OrganizationStructureStateEventId ()
    {
    }

    public OrganizationStructureStateEventId (OrganizationStructureId id, Long version)
    {
        this.id = id;
        this.version = version;
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

        OrganizationStructureStateEventId other = (OrganizationStructureStateEventId)obj;
        return true 
            && (id == other.id || (id != null && id.equals(other.id)))
            && (version == other.version || (version != null && version.equals(other.version)))
            ;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        if (this.id != null) {
            hash += 13 * this.id.hashCode();
        }
        if (this.version != null) {
            hash += 13 * this.version.hashCode();
        }
        return hash;
    }

}

