package org.dddml.wms.domain;


public class DeletePersonDto extends AbstractPersonCommandDto
{

    @Override
    public String getCommandType() {
        return COMMAND_TYPE_DELETE;
    }

}

