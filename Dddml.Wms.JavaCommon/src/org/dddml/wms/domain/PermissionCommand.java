package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.domain.Command;

public interface PermissionCommand extends Command
{
    String getPermissionId();

    void setPermissionId(String permissionId);

    Long getVersion();

    void setVersion(Long version);


    interface CreateOrMergePatchPermission extends PermissionCommand
    {
        String getName();

        void setName(String name);

        String getParentPermissionId();

        void setParentPermissionId(String parentPermissionId);

        String getDescription();

        void setDescription(String description);

        Boolean getActive();

        void setActive(Boolean active);

    }

    interface CreatePermission extends CreateOrMergePatchPermission
    {
    }

    interface MergePatchPermission extends CreateOrMergePatchPermission
    {
        Boolean getIsPropertyNameRemoved();

        void setIsPropertyNameRemoved(Boolean removed);

        Boolean getIsPropertyParentPermissionIdRemoved();

        void setIsPropertyParentPermissionIdRemoved(Boolean removed);

        Boolean getIsPropertyDescriptionRemoved();

        void setIsPropertyDescriptionRemoved(Boolean removed);

        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);

    }

	interface DeletePermission extends PermissionCommand
	{
	}

}

