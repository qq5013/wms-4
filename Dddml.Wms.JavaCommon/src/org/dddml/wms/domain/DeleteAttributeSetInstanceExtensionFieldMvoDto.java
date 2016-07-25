package org.dddml.wms.domain;


public class DeleteAttributeSetInstanceExtensionFieldMvoDto extends AbstractAttributeSetInstanceExtensionFieldMvoCommandDto
{

    @Override
    public String getCommandType() {
        return COMMAND_TYPE_DELETE;
    }

}

