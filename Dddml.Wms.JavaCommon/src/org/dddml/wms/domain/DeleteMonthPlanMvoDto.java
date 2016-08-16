package org.dddml.wms.domain;


public class DeleteMonthPlanMvoDto extends AbstractMonthPlanMvoCommandDto
{

    @Override
    public String getCommandType() {
        return COMMAND_TYPE_DELETE;
    }

}

