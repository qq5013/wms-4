package org.dddml.wms.domain;


public class RemoveYearPlanDto extends CreateOrMergePatchYearPlanDto
{

    @Override
    public String getCommandType() {
        return COMMAND_TYPE_REMOVE;
    }

}

