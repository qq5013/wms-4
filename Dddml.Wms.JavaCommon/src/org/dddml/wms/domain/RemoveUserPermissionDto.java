package org.dddml.wms.domain;


public class RemoveUserPermissionDto extends CreateOrMergePatchUserPermissionDto
{

    @Override
    public String getCommandType() {
        return COMMAND_TYPE_REMOVE;
    }

}

