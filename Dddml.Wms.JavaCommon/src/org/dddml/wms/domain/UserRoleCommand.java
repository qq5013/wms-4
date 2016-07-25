package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.Command;

public interface UserRoleCommand extends Command
{
    String getRoleId();

    String getUserId();


    interface CreateOrMergePatchUserRole extends UserRoleCommand
    {
        Boolean getActive();

    }

    interface CreateUserRole extends CreateOrMergePatchUserRole
    {
    }

    interface MergePatchUserRole extends CreateOrMergePatchUserRole
    {
        Boolean getIsPropertyActiveRemoved();

    }

	interface RemoveUserRole extends UserRoleCommand
	{
	}

}

