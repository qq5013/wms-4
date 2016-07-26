package org.dddml.wms.domain;


public class DeleteWarehouseDto extends AbstractWarehouseCommandDto
{

    @Override
    public String getCommandType() {
        return COMMAND_TYPE_DELETE;
    }

}

