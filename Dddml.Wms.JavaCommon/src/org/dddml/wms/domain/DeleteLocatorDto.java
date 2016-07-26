package org.dddml.wms.domain;


public class DeleteLocatorDto extends AbstractLocatorCommandDto
{

    @Override
    public String getCommandType() {
        return COMMAND_TYPE_DELETE;
    }

}

