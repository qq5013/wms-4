package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.Command;

public interface RolePermissionCommand extends Command
{
    RolePermissionId getId();

    Long getVersion();


    interface CreateOrMergePatchRolePermission extends RolePermissionCommand
    {
        Boolean getActive();

    }

    interface CreateRolePermission extends CreateOrMergePatchRolePermission
    {
    }

    interface MergePatchRolePermission extends CreateOrMergePatchRolePermission
    {
        Boolean getIsPropertyActiveRemoved();

    }

	interface DeleteRolePermission extends RolePermissionCommand
	{
	}

}

