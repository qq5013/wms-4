package org.dddml.wms.domain;


public class DeleteRoleDto extends AbstractRoleCommandDto
{

    @Override
    public String getCommandType() {
        return COMMAND_TYPE_DELETE;
    }

}

