package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.domain.AbstractCommand;

public abstract class AbstractUserRoleCommand extends AbstractCommand implements UserRoleCommand
{
    private String roleId;

    public String getRoleId()
    {
        return this.roleId;
    }

    public void setRoleId(String roleId)
    {
        this.roleId = roleId;
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


    public static abstract class AbstractCreateOrMergePatchUserRole extends AbstractUserRoleCommand implements CreateOrMergePatchUserRole
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

    public static abstract class AbstractCreateUserRole extends AbstractCreateOrMergePatchUserRole implements CreateUserRole
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_CREATE;
        }

    }

    public static abstract class AbstractMergePatchUserRole extends AbstractCreateOrMergePatchUserRole implements MergePatchUserRole
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

    public static class SimpleCreateUserRole extends AbstractCreateUserRole
    {
    }

    public static class SimpleMergePatchUserRole extends AbstractMergePatchUserRole
    {
    }

	public static class SimpleRemoveUserRole extends AbstractUserRoleCommand implements RemoveUserRole
	{
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_REMOVE;
        }
	}


}

