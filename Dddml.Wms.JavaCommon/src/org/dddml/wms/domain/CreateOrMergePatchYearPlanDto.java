package org.dddml.wms.domain;

import java.util.Date;

public class CreateOrMergePatchYearPlanDto extends AbstractYearPlanCommandDto
{
    private String description;

    public String getDescription()
    {
        return this.description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    private Boolean active;

    public Boolean getActive()
    {
        return this.active;
    }

    public void setActive(Boolean active)
    {
        this.active = active;
    }

    private CreateOrMergePatchMonthPlanDto[] monthPlans;

    public CreateOrMergePatchMonthPlanDto[] getMonthPlans()
    {
        return this.monthPlans;
    }

    public void setMonthPlans(CreateOrMergePatchMonthPlanDto[] monthPlans)
    {
        this.monthPlans = monthPlans;
    }

    private Boolean isPropertyDescriptionRemoved;

    public Boolean getIsPropertyDescriptionRemoved()
    {
        return this.isPropertyDescriptionRemoved;
    }

    public void setIsPropertyDescriptionRemoved(Boolean removed)
    {
        this.isPropertyDescriptionRemoved = removed;
    }

    private Boolean isPropertyActiveRemoved;

    public Boolean getIsPropertyActiveRemoved()
    {
        return this.isPropertyActiveRemoved;
    }

    public void setIsPropertyActiveRemoved(Boolean removed)
    {
        this.isPropertyActiveRemoved = removed;
    }


    public static class CreateYearPlanDto extends CreateOrMergePatchYearPlanDto
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_CREATE;
        }

    }

    public static class MergePatchYearPlanDto extends CreateOrMergePatchYearPlanDto
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_MERGE_PATCH;
        }

    }

}

