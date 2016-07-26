package org.dddml.wms.domain;


public class DeleteUserDto extends AbstractUserCommandDto
{

    @Override
    public String getCommandType() {
        return COMMAND_TYPE_DELETE;
    }

}

