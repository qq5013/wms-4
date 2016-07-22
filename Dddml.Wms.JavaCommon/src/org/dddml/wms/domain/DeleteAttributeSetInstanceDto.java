package org.dddml.wms.domain;


public class DeleteAttributeSetInstanceDto extends AbstractAttributeSetInstanceCommandDto
{

    @Override
    public String getCommandType() {
        return AbstractCommandDto.COMMAND_TYPE_DELETE;
    }

}

