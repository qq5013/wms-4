package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.Command;

public interface UserPermissionCommand extends Command
{
    String getPermissionId();

    String getUserId();


    interface CreateOrMergePatchUserPermission extends UserPermissionCommand
    {
        Boolean getActive();

    }

    interface CreateUserPermission extends CreateOrMergePatchUserPermission
    {
    }

    interface MergePatchUserPermission extends CreateOrMergePatchUserPermission
    {
        Boolean getIsPropertyActiveRemoved();

    }

	interface RemoveUserPermission extends UserPermissionCommand
	{
	}

}

