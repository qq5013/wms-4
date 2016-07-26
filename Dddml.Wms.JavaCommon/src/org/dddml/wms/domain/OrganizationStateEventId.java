package org.dddml.wms.domain;

import java.io.Serializable;

public class OrganizationStateEventId implements Serializable
{
    private String organizationId;

    public String getOrganizationId()
    {
        return this.organizationId;
    }

    public void setOrganizationId(String organizationId)
    {
        this.organizationId = organizationId;
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

    public OrganizationStateEventId()
    {
    }

    public OrganizationStateEventId(String organizationId, Long version)
    {
        this.organizationId = organizationId;
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

        OrganizationStateEventId other = (OrganizationStateEventId)obj;
        return true 
            && (organizationId == other.organizationId || (organizationId != null && organizationId.equals(other.organizationId)))
            && (version == other.version || (version != null && version.equals(other.version)))
            ;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        if (this.organizationId != null) {
            hash += 13 * this.organizationId.hashCode();
        }
        if (this.version != null) {
            hash += 13 * this.version.hashCode();
        }
        return hash;
    }

}

