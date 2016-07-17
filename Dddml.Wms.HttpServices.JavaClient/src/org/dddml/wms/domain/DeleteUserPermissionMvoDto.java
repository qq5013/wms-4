package org.dddml.wms.domain;


public class DeleteUserPermissionMvoDto extends AbstractUserPermissionMvoCommandDto
{

    @Override
    public String getCommandType() {
        return AbstractCommandDto.COMMAND_TYPE_DELETE;
    }

}

