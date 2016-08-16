package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.domain.AbstractCommand;

public abstract class AbstractDayPlanCommand extends AbstractCommand implements DayPlanCommand
{
    private Integer day;

    public Integer getDay()
    {
        return this.day;
    }

    public void setDay(Integer day)
    {
        this.day = day;
    }

    private PersonalName personalName;

    public PersonalName getPersonalName()
    {
        return this.personalName;
    }

    public void setPersonalName(PersonalName personalName)
    {
        this.personalName = personalName;
    }

    private Integer year;

    public Integer getYear()
    {
        return this.year;
    }

    public void setYear(Integer year)
    {
        this.year = year;
    }

    private Integer month;

    public Integer getMonth()
    {
        return this.month;
    }

    public void setMonth(Integer month)
    {
        this.month = month;
    }


    public static abstract class AbstractCreateOrMergePatchDayPlan extends AbstractDayPlanCommand implements CreateOrMergePatchDayPlan
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

    }

    public static abstract class AbstractCreateDayPlan extends AbstractCreateOrMergePatchDayPlan implements CreateDayPlan
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_CREATE;
        }

    }

    public static abstract class AbstractMergePatchDayPlan extends AbstractCreateOrMergePatchDayPlan implements MergePatchDayPlan
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_MERGE_PATCH;
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

    }

    public static class SimpleCreateDayPlan extends AbstractCreateDayPlan
    {
    }

    public static class SimpleMergePatchDayPlan extends AbstractMergePatchDayPlan
    {
    }

	public static class SimpleRemoveDayPlan extends AbstractDayPlanCommand implements RemoveDayPlan
	{
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_REMOVE;
        }
	}


}

