package org.dddml.wms.domain;


public class DeleteOrganizationStructureTypeDto extends AbstractOrganizationStructureTypeCommandDto
{

    @Override
    public String getCommandType() {
        return COMMAND_TYPE_DELETE;
    }

}

