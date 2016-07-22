package org.dddml.wms.domain;


public class RemoveUserLoginDto extends CreateOrMergePatchUserLoginDto
{

    @Override
    public String getCommandType() {
        return AbstractCommandDto.COMMAND_TYPE_REMOVE;
    }

}

