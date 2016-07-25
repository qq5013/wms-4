package org.dddml.wms.domain;


public class RemoveUserRoleDto extends CreateOrMergePatchUserRoleDto
{

    @Override
    public String getCommandType() {
        return COMMAND_TYPE_REMOVE;
    }

}

