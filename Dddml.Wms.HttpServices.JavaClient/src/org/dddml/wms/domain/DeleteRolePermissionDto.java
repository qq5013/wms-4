package org.dddml.wms.domain;


public class DeleteRolePermissionDto extends AbstractRolePermissionCommandDto
{

    @Override
    public String getCommandType() {
        return AbstractCommandDto.COMMAND_TYPE_DELETE;
    }

}

