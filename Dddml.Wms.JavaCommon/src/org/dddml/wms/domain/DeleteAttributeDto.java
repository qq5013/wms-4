package org.dddml.wms.domain;


public class DeleteAttributeDto extends AbstractAttributeCommandDto
{

    @Override
    public String getCommandType() {
        return COMMAND_TYPE_DELETE;
    }

}

