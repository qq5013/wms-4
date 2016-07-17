package org.dddml.wms.domain;


public class DeleteAudienceDto extends AbstractAudienceCommandDto
{

    @Override
    public String getCommandType() {
        return AbstractCommandDto.COMMAND_TYPE_DELETE;
    }

}

