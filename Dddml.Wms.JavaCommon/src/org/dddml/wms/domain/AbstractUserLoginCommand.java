package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.domain.AbstractCommand;

public abstract class AbstractUserLoginCommand extends AbstractCommand implements UserLoginCommand
{
    private LoginKey loginKey;

    public LoginKey getLoginKey()
    {
        return this.loginKey;
    }

    public void setLoginKey(LoginKey loginKey)
    {
        this.loginKey = loginKey;
    }

    private String userId;

    public String getUserId()
    {
        return this.userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }


    public static abstract class AbstractCreateOrMergePatchUserLogin extends AbstractUserLoginCommand implements CreateOrMergePatchUserLogin
    {
        private Boolean active;

        public Boolean getActive()
        {
            return this.active;
        }

        public void setActive(Boolean active)
        {
            this.active = active;
        }

    }

    public static abstract class AbstractCreateUserLogin extends AbstractCreateOrMergePatchUserLogin implements CreateUserLogin
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_CREATE;
        }

    }

    public static abstract class AbstractMergePatchUserLogin extends AbstractCreateOrMergePatchUserLogin implements MergePatchUserLogin
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_MERGE_PATCH;
        }

        private Boolean isPropertyActiveRemoved;

        public Boolean getIsPropertyActiveRemoved()
        {
            return this.isPropertyActiveRemoved;
        }

        public void setIsPropertyActiveRemoved(Boolean removed)
        {
            this.isPropertyActiveRemoved = removed;
        }

    }

    public static class SimpleCreateUserLogin extends AbstractCreateUserLogin
    {
    }

    public static class SimpleMergePatchUserLogin extends AbstractMergePatchUserLogin
    {
    }

	public static class SimpleRemoveUserLogin extends AbstractUserLoginCommand implements RemoveUserLogin
	{
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_REMOVE;
        }
	}


}

