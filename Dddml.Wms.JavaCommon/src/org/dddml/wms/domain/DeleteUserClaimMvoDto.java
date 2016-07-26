package org.dddml.wms.domain;


public class DeleteUserClaimMvoDto extends AbstractUserClaimMvoCommandDto
{

    @Override
    public String getCommandType() {
        return COMMAND_TYPE_DELETE;
    }

}

