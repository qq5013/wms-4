package org.dddml.wms.domain;


public class RemoveDayPlanDto extends CreateOrMergePatchDayPlanDto
{

    @Override
    public String getCommandType() {
        return COMMAND_TYPE_REMOVE;
    }

}

