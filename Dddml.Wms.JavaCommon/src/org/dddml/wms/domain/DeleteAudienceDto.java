package org.dddml.wms.domain;


public class DeleteAudienceDto extends AbstractAudienceCommandDto
{

    @Override
    public String getCommandType() {
        return COMMAND_TYPE_DELETE;
    }

}

