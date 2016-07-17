package org.dddml.wms.domain;


public class RemoveUserClaimDto extends CreateOrMergePatchUserClaimDto
{

    @Override
    public String getCommandType() {
        return AbstractCommandDto.COMMAND_TYPE_REMOVE;
    }

}

