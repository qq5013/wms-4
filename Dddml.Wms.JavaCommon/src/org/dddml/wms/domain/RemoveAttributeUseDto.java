package org.dddml.wms.domain;


public class RemoveAttributeUseDto extends CreateOrMergePatchAttributeUseDto
{

    @Override
    public String getCommandType() {
        return COMMAND_TYPE_REMOVE;
    }

}

