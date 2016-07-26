package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.Command;

public interface PermissionCommand extends Command
{
    String getPermissionId();

    Long getVersion();


    interface CreateOrMergePatchPermission extends PermissionCommand
    {
        String getName();

        String getParentPermissionId();

        String getDescription();

        Boolean getActive();

    }

    interface CreatePermission extends CreateOrMergePatchPermission
    {
    }

    interface MergePatchPermission extends CreateOrMergePatchPermission
    {
        Boolean getIsPropertyNameRemoved();

        Boolean getIsPropertyParentPermissionIdRemoved();

        Boolean getIsPropertyDescriptionRemoved();

        Boolean getIsPropertyActiveRemoved();

    }

	interface DeletePermission extends PermissionCommand
	{
	}

}

