package org.dddml.wms.domain;


public class DeleteYearPlanMvoDto extends AbstractYearPlanMvoCommandDto
{

    @Override
    public String getCommandType() {
        return COMMAND_TYPE_DELETE;
    }

}

