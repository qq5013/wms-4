package org.dddml.wms.domain;

import java.util.Date;

public class CreateOrMergePatchUserRoleDto extends AbstractUserRoleCommandDto
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

    private Boolean isPropertyActiveRemoved;

    public Boolean getIsPropertyActiveRemoved()
    {
        return this.isPropertyActiveRemoved;
    }

    public void setIsPropertyActiveRemoved(Boolean removed)
    {
        this.isPropertyActiveRemoved = removed;
    }


    public static class CreateUserRoleDto extends CreateOrMergePatchUserRoleDto
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_CREATE;
        }

    }

    public static class MergePatchUserRoleDto extends CreateOrMergePatchUserRoleDto
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_MERGE_PATCH;
        }

    }

}

