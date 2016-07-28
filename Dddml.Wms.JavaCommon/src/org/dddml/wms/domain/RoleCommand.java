package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.Command;

public interface RoleCommand extends Command
{
    String getRoleId();

    void setRoleId(String roleId);

    Long getVersion();

    void setVersion(Long version);


    interface CreateOrMergePatchRole extends RoleCommand
    {
        String getName();

        void setName(String name);

        String getDescription();

        void setDescription(String description);

        Boolean getActive();

        void setActive(Boolean active);

    }

    interface CreateRole extends CreateOrMergePatchRole
    {
    }

    interface MergePatchRole extends CreateOrMergePatchRole
    {
        Boolean getIsPropertyNameRemoved();

        void setIsPropertyNameRemoved(Boolean removed);

        Boolean getIsPropertyDescriptionRemoved();

        void setIsPropertyDescriptionRemoved(Boolean removed);

        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);

    }

	interface DeleteRole extends RoleCommand
	{
	}

}

