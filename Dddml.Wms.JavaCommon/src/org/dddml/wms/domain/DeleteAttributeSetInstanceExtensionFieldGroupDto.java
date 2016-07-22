package org.dddml.wms.domain;


public class DeleteAttributeSetInstanceExtensionFieldGroupDto extends AbstractAttributeSetInstanceExtensionFieldGroupCommandDto
{

    @Override
    public String getCommandType() {
        return AbstractCommandDto.COMMAND_TYPE_DELETE;
    }

}

