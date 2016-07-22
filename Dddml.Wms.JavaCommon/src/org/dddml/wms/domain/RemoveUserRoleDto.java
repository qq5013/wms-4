package org.dddml.wms.domain;


public class RemoveUserRoleDto extends CreateOrMergePatchUserRoleDto
{

    @Override
    public String getCommandType() {
        return AbstractCommandDto.COMMAND_TYPE_REMOVE;
    }

}

