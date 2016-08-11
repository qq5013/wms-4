package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.domain.Command;

public interface UserPermissionCommand extends Command
{
    String getPermissionId();

    void setPermissionId(String permissionId);

    String getUserId();

    void setUserId(String userId);


    interface CreateOrMergePatchUserPermission extends UserPermissionCommand
    {
        Boolean getActive();

        void setActive(Boolean active);

    }

    interface CreateUserPermission extends CreateOrMergePatchUserPermission
    {
    }

    interface MergePatchUserPermission extends CreateOrMergePatchUserPermission
    {
        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);

    }

	interface RemoveUserPermission extends UserPermissionCommand
	{
	}

}

