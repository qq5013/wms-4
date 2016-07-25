package org.dddml.wms.domain;


public class DeleteAttributeValueMvoDto extends AbstractAttributeValueMvoCommandDto
{

    @Override
    public String getCommandType() {
        return COMMAND_TYPE_DELETE;
    }

}

