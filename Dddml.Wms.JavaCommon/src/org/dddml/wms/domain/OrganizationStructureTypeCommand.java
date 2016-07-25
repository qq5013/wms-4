package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.Command;

public interface OrganizationStructureTypeCommand extends Command
{
    String getId();

    Long getVersion();


    interface CreateOrMergePatchOrganizationStructureType extends OrganizationStructureTypeCommand
    {
        Boolean getActive();

    }

    interface CreateOrganizationStructureType extends CreateOrMergePatchOrganizationStructureType
    {
    }

    interface MergePatchOrganizationStructureType extends CreateOrMergePatchOrganizationStructureType
    {
        Boolean getIsPropertyActiveRemoved();

    }

	interface DeleteOrganizationStructureType extends OrganizationStructureTypeCommand
	{
	}

}

