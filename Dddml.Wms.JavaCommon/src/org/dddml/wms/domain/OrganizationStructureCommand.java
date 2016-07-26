package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.Command;

public interface OrganizationStructureCommand extends Command
{
    OrganizationStructureId getId();

    Long getVersion();


    interface CreateOrMergePatchOrganizationStructure extends OrganizationStructureCommand
    {
        Boolean getActive();

    }

    interface CreateOrganizationStructure extends CreateOrMergePatchOrganizationStructure
    {
    }

    interface MergePatchOrganizationStructure extends CreateOrMergePatchOrganizationStructure
    {
        Boolean getIsPropertyActiveRemoved();

    }

	interface DeleteOrganizationStructure extends OrganizationStructureCommand
	{
	}

}

