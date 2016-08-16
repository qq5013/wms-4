package org.dddml.wms.domain;


public class DeleteDayPlanMvoDto extends AbstractDayPlanMvoCommandDto
{

    @Override
    public String getCommandType() {
        return COMMAND_TYPE_DELETE;
    }

}

