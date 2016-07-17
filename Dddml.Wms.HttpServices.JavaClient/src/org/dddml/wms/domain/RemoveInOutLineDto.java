package org.dddml.wms.domain;


public class RemoveInOutLineDto extends CreateOrMergePatchInOutLineDto
{

    @Override
    public String getCommandType() {
        return AbstractCommandDto.COMMAND_TYPE_REMOVE;
    }

}

