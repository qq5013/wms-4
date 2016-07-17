package org.dddml.wms.domain;


public class RemoveAttributeValueDto extends CreateOrMergePatchAttributeValueDto
{

    @Override
    public String getCommandType() {
        return AbstractCommandDto.COMMAND_TYPE_REMOVE;
    }

}

