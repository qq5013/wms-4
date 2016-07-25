package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.domain.AbstractCommand;

public abstract class AbstractRolePermissionCommand extends AbstractCommand implements RolePermissionCommand
{
    private RolePermissionId id;

    public RolePermissionId getId()
    {
        return this.id;
    }

    public void setId(RolePermissionId id)
    {
        this.id = id;
    }

    private Long version;

    public Long getVersion()
    {
        return this.version;
    }

    public void setVersion(Long version)
    {
        this.version = version;
    }


    public static abstract class AbstractCreateOrMergePatchRolePermission extends AbstractRolePermissionCommand implements CreateOrMergePatchRolePermission
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

    public static abstract class AbstractCreateRolePermission extends AbstractCreateOrMergePatchRolePermission implements CreateRolePermission
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_CREATE;
        }

    }

    public static abstract class AbstractMergePatchRolePermission extends AbstractCreateOrMergePatchRolePermission implements MergePatchRolePermission
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

    public static class SimpleCreateRolePermission extends AbstractCreateRolePermission
    {
    }

    public static class SimpleMergePatchRolePermission extends AbstractMergePatchRolePermission
    {
    }

	public static class SimpleDeleteRolePermission extends AbstractRolePermissionCommand implements DeleteRolePermission
	{
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_DELETE;
        }
	}


}

