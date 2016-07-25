package org.dddml.wms.domain;


public class DeleteRolePermissionDto extends AbstractRolePermissionCommandDto
{

    @Override
    public String getCommandType() {
        return COMMAND_TYPE_DELETE;
    }

}

