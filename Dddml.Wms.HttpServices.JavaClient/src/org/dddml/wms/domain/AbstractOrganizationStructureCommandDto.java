package org.dddml.wms.domain;

import org.dddml.wms.domain.OrganizationStructureIdDto;
import java.util.Date;
import org.dddml.wms.domain.AbstractCommandDto;

public abstract class AbstractOrganizationStructureCommandDto extends AbstractCommandDto
{
    private OrganizationStructureIdDto id;

    public OrganizationStructureIdDto getId()
    {
        return this.id;
    }

    public void setId(OrganizationStructureIdDto id)
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

