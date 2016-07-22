package org.dddml.wms.domain;


public class DeleteInOutDto extends AbstractInOutCommandDto
{

    @Override
    public String getCommandType() {
        return AbstractCommandDto.COMMAND_TYPE_DELETE;
    }

}

