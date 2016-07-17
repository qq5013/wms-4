package org.dddml.wms.domain;


public class DeletePermissionDto extends AbstractPermissionCommandDto
{

    @Override
    public String getCommandType() {
        return AbstractCommandDto.COMMAND_TYPE_DELETE;
    }

}

