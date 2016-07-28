package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.Command;

public interface RolePermissionCommand extends Command
{
    RolePermissionId getId();

    void setId(RolePermissionId id);

    Long getVersion();

    void setVersion(Long version);


    interface CreateOrMergePatchRolePermission extends RolePermissionCommand
    {
        Boolean getActive();

        void setActive(Boolean active);

    }

    interface CreateRolePermission extends CreateOrMergePatchRolePermission
    {
    }

    interface MergePatchRolePermission extends CreateOrMergePatchRolePermission
    {
        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);

    }

	interface DeleteRolePermission extends RolePermissionCommand
	{
	}

}

