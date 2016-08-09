package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.domain.Command;

public interface UserRoleCommand extends Command
{
    String getRoleId();

    void setRoleId(String roleId);

    String getUserId();

    void setUserId(String userId);


    interface CreateOrMergePatchUserRole extends UserRoleCommand
    {
        Boolean getActive();

        void setActive(Boolean active);

    }

    interface CreateUserRole extends CreateOrMergePatchUserRole
    {
    }

    interface MergePatchUserRole extends CreateOrMergePatchUserRole
    {
        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);

    }

	interface RemoveUserRole extends UserRoleCommand
	{
	}

}

