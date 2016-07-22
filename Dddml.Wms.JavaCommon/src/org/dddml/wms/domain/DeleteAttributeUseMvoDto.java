package org.dddml.wms.domain;


public class DeleteAttributeUseMvoDto extends AbstractAttributeUseMvoCommandDto
{

    @Override
    public String getCommandType() {
        return AbstractCommandDto.COMMAND_TYPE_DELETE;
    }

}

