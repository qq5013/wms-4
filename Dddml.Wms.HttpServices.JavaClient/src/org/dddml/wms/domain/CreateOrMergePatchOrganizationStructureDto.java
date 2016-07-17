package org.dddml.wms.domain;

import org.dddml.wms.domain.OrganizationStructureIdDto;
import java.util.Date;

public class CreateOrMergePatchOrganizationStructureDto extends AbstractOrganizationStructureCommandDto
{
    private Boolean active;

    public Boolean getActive()
    {
        return this.active;
    }

    public void setActive(Boolean active)
    {
        this.active = active;
    }

    private Boolean isPropertyActiveRemoved;

    public Boolean getIsPropertyActiveRemoved()
    {
        return this.isPropertyActiveRemoved;
    }

    public void setIsPropertyActiveRemoved(Boolean isPropertyActiveRemoved)
    {
        this.isPropertyActiveRemoved = isPropertyActiveRemoved;
    }


}

