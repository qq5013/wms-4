package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.Command;

public interface OrganizationCommand extends Command
{
    String getOrganizationId();

    Long getVersion();


    interface CreateOrMergePatchOrganization extends OrganizationCommand
    {
        String getName();

        String getDescription();

        String getType();

        Boolean getIsSummary();

        Boolean getActive();

    }

    interface CreateOrganization extends CreateOrMergePatchOrganization
    {
    }

    interface MergePatchOrganization extends CreateOrMergePatchOrganization
    {
        Boolean getIsPropertyNameRemoved();

        Boolean getIsPropertyDescriptionRemoved();

        Boolean getIsPropertyTypeRemoved();

        Boolean getIsPropertyIsSummaryRemoved();

        Boolean getIsPropertyActiveRemoved();

    }

	interface DeleteOrganization extends OrganizationCommand
	{
	}

}

