package org.dddml.wms.domain;


public class RemoveInOutLineDto extends CreateOrMergePatchInOutLineDto
{

    @Override
    public String getCommandType() {
        return COMMAND_TYPE_REMOVE;
    }

}

