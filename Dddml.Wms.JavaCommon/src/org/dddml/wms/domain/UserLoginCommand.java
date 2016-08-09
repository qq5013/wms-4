package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.domain.Command;

public interface UserLoginCommand extends Command
{
    LoginKey getLoginKey();

    void setLoginKey(LoginKey loginKey);

    String getUserId();

    void setUserId(String userId);


    interface CreateOrMergePatchUserLogin extends UserLoginCommand
    {
        Boolean getActive();

        void setActive(Boolean active);

    }

    interface CreateUserLogin extends CreateOrMergePatchUserLogin
    {
    }

    interface MergePatchUserLogin extends CreateOrMergePatchUserLogin
    {
        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);

    }

	interface RemoveUserLogin extends UserLoginCommand
	{
	}

}

