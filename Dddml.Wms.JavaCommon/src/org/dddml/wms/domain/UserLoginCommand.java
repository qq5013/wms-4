package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.Command;

public interface UserLoginCommand extends Command
{
    LoginKey getLoginKey();

    String getUserId();


    interface CreateOrMergePatchUserLogin extends UserLoginCommand
    {
        Boolean getActive();

    }

    interface CreateUserLogin extends CreateOrMergePatchUserLogin
    {
    }

    interface MergePatchUserLogin extends CreateOrMergePatchUserLogin
    {
        Boolean getIsPropertyActiveRemoved();

    }

	interface RemoveUserLogin extends UserLoginCommand
	{
	}

}

