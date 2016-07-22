package org.dddml.wms.domain;


public class DeleteAttributeDto extends AbstractAttributeCommandDto
{

    @Override
    public String getCommandType() {
        return AbstractCommandDto.COMMAND_TYPE_DELETE;
    }

}

