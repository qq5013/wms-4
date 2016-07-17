package org.dddml.wms.domain;


public class RemoveAttributeSetInstanceExtensionFieldDto extends CreateOrMergePatchAttributeSetInstanceExtensionFieldDto
{

    @Override
    public String getCommandType() {
        return AbstractCommandDto.COMMAND_TYPE_REMOVE;
    }

}

