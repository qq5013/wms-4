package org.dddml.wms.domain;


public class DeleteTeamDto extends AbstractTeamCommandDto
{

    @Override
    public String getCommandType() {
        return COMMAND_TYPE_DELETE;
    }

}

