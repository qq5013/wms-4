package org.dddml.wms.domain;


public class DeleteAttributeSetDto extends AbstractAttributeSetCommandDto
{

    @Override
    public String getCommandType() {
        return AbstractCommandDto.COMMAND_TYPE_DELETE;
    }

}

