package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.domain.AbstractCommand;

public abstract class AbstractUserPermissionCommand extends AbstractCommand implements UserPermissionCommand
{
    private String permissionId;

    public String getPermissionId()
    {
        return this.permissionId;
    }

    public void setPermissionId(String permissionId)
    {
        this.permissionId = permissionId;
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


    public static abstract class AbstractCreateOrMergePatchUserPermission extends AbstractUserPermissionCommand implements CreateOrMergePatchUserPermission
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

    public static abstract class AbstractCreateUserPermission extends AbstractCreateOrMergePatchUserPermission implements CreateUserPermission
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_CREATE;
        }

    }

    public static abstract class AbstractMergePatchUserPermission extends AbstractCreateOrMergePatchUserPermission implements MergePatchUserPermission
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

    public static class SimpleCreateUserPermission extends AbstractCreateUserPermission
    {
    }

    public static class SimpleMergePatchUserPermission extends AbstractMergePatchUserPermission
    {
    }

	public static class SimpleRemoveUserPermission extends AbstractUserPermissionCommand implements RemoveUserPermission
	{
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_REMOVE;
        }
	}


}

