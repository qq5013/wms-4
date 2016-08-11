package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.domain.Command;

public interface OrganizationStructureTypeCommand extends Command
{
    String getId();

    void setId(String id);

    Long getVersion();

    void setVersion(Long version);


    interface CreateOrMergePatchOrganizationStructureType extends OrganizationStructureTypeCommand
    {
        Boolean getActive();

        void setActive(Boolean active);

    }

    interface CreateOrganizationStructureType extends CreateOrMergePatchOrganizationStructureType
    {
    }

    interface MergePatchOrganizationStructureType extends CreateOrMergePatchOrganizationStructureType
    {
        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);

    }

	interface DeleteOrganizationStructureType extends OrganizationStructureTypeCommand
	{
	}

}

