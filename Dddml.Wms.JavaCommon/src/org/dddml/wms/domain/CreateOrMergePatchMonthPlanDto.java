package org.dddml.wms.domain;

import java.util.Date;

public class CreateOrMergePatchMonthPlanDto extends AbstractMonthPlanCommandDto
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

    private CreateOrMergePatchDayPlanDto[] dayPlans;

    public CreateOrMergePatchDayPlanDto[] getDayPlans()
    {
        return this.dayPlans;
    }

    public void setDayPlans(CreateOrMergePatchDayPlanDto[] dayPlans)
    {
        this.dayPlans = dayPlans;
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


    public static class CreateMonthPlanDto extends CreateOrMergePatchMonthPlanDto
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_CREATE;
        }

    }

    public static class MergePatchMonthPlanDto extends CreateOrMergePatchMonthPlanDto
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_MERGE_PATCH;
        }

    }

}

