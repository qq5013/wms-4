package org.dddml.wms.domain;


public class RemoveMonthPlanDto extends CreateOrMergePatchMonthPlanDto
{

    @Override
    public String getCommandType() {
        return COMMAND_TYPE_REMOVE;
    }

}

