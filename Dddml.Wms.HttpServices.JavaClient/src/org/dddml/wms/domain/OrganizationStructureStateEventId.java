package org.dddml.wms.domain;

import org.dddml.wms.domain.OrganizationStructureId;

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

}

