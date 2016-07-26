package org.dddml.wms.domain;


public class DeleteOrganizationDto extends AbstractOrganizationCommandDto
{

    @Override
    public String getCommandType() {
        return COMMAND_TYPE_DELETE;
    }

}

