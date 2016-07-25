package org.dddml.wms.domain;


public class DeleteAttributeSetDto extends AbstractAttributeSetCommandDto
{

    @Override
    public String getCommandType() {
        return COMMAND_TYPE_DELETE;
    }

}

