package org.dddml.wms.domain;


public class DeleteUserRoleMvoDto extends AbstractUserRoleMvoCommandDto
{

    @Override
    public String getCommandType() {
        return COMMAND_TYPE_DELETE;
    }

}

