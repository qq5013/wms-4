package org.dddml.wms.domain;


public class DeleteUserRoleMvoDto extends AbstractUserRoleMvoCommandDto
{

    @Override
    public String getCommandType() {
        return AbstractCommandDto.COMMAND_TYPE_DELETE;
    }

}

