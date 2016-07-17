package org.dddml.wms.domain;


public class DeleteLocatorDto extends AbstractLocatorCommandDto
{

    @Override
    public String getCommandType() {
        return AbstractCommandDto.COMMAND_TYPE_DELETE;
    }

}

