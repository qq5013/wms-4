package org.dddml.wms.domain;


public class RemoveUserClaimDto extends CreateOrMergePatchUserClaimDto
{

    @Override
    public String getCommandType() {
        return COMMAND_TYPE_REMOVE;
    }

}

