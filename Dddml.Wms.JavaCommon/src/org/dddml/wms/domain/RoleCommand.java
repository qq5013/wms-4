package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.Command;

public interface RoleCommand extends Command
{
    String getRoleId();

    Long getVersion();


    interface CreateOrMergePatchRole extends RoleCommand
    {
        String getName();

        String getDescription();

        Boolean getActive();

    }

    interface CreateRole extends CreateOrMergePatchRole
    {
    }

    interface MergePatchRole extends CreateOrMergePatchRole
    {
        Boolean getIsPropertyNameRemoved();

        Boolean getIsPropertyDescriptionRemoved();

        Boolean getIsPropertyActiveRemoved();

    }

	interface DeleteRole extends RoleCommand
	{
	}

}

