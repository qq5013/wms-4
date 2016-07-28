package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.Command;

public interface OrganizationCommand extends Command
{
    String getOrganizationId();

    void setOrganizationId(String organizationId);

    Long getVersion();

    void setVersion(Long version);


    interface CreateOrMergePatchOrganization extends OrganizationCommand
    {
        String getName();

        void setName(String name);

        String getDescription();

        void setDescription(String description);

        String getType();

        void setType(String type);

        Boolean getIsSummary();

        void setIsSummary(Boolean isSummary);

        Boolean getActive();

        void setActive(Boolean active);

    }

    interface CreateOrganization extends CreateOrMergePatchOrganization
    {
    }

    interface MergePatchOrganization extends CreateOrMergePatchOrganization
    {
        Boolean getIsPropertyNameRemoved();

        void setIsPropertyNameRemoved(Boolean removed);

        Boolean getIsPropertyDescriptionRemoved();

        void setIsPropertyDescriptionRemoved(Boolean removed);

        Boolean getIsPropertyTypeRemoved();

        void setIsPropertyTypeRemoved(Boolean removed);

        Boolean getIsPropertyIsSummaryRemoved();

        void setIsPropertyIsSummaryRemoved(Boolean removed);

        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);

    }

	interface DeleteOrganization extends OrganizationCommand
	{
	}

}

