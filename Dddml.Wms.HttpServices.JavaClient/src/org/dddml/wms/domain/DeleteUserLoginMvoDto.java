package org.dddml.wms.domain;


public class DeleteUserLoginMvoDto extends AbstractUserLoginMvoCommandDto
{

    @Override
    public String getCommandType() {
        return AbstractCommandDto.COMMAND_TYPE_DELETE;
    }

}

