package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.Command;

public interface OrganizationStructureCommand extends Command
{
    OrganizationStructureId getId();

    void setId(OrganizationStructureId id);

    Long getVersion();

    void setVersion(Long version);


    interface CreateOrMergePatchOrganizationStructure extends OrganizationStructureCommand
    {
        Boolean getActive();

        void setActive(Boolean active);

    }

    interface CreateOrganizationStructure extends CreateOrMergePatchOrganizationStructure
    {
    }

    interface MergePatchOrganizationStructure extends CreateOrMergePatchOrganizationStructure
    {
        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);

    }

	interface DeleteOrganizationStructure extends OrganizationStructureCommand
	{
	}

}

