package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.domain.AbstractCommand;

public abstract class AbstractMonthPlanCommand extends AbstractCommand implements MonthPlanCommand
{
    private Integer month;

    public Integer getMonth()
    {
        return this.month;
    }

    public void setMonth(Integer month)
    {
        this.month = month;
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


    public static abstract class AbstractCreateOrMergePatchMonthPlan extends AbstractMonthPlanCommand implements CreateOrMergePatchMonthPlan
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

        public DayPlanCommand.CreateDayPlan newCreateDayPlan()
        {
            AbstractDayPlanCommand.SimpleCreateDayPlan c = new AbstractDayPlanCommand.SimpleCreateDayPlan();
            c.setPersonalName(this.getPersonalName());

            c.setYear(this.getYear());

            c.setMonth(this.getMonth());

            return c;
        }

        public DayPlanCommand.MergePatchDayPlan newMergePatchDayPlan()
        {
            AbstractDayPlanCommand.SimpleMergePatchDayPlan c = new AbstractDayPlanCommand.SimpleMergePatchDayPlan();
            c.setPersonalName(this.getPersonalName());

            c.setYear(this.getYear());

            c.setMonth(this.getMonth());

            return c;
        }

        public DayPlanCommand.RemoveDayPlan newRemoveDayPlan()
        {
            AbstractDayPlanCommand.SimpleRemoveDayPlan c = new AbstractDayPlanCommand.SimpleRemoveDayPlan();
            c.setPersonalName(this.getPersonalName());

            c.setYear(this.getYear());

            c.setMonth(this.getMonth());

            return c;
        }

    }

    public static abstract class AbstractCreateMonthPlan extends AbstractCreateOrMergePatchMonthPlan implements CreateMonthPlan
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_CREATE;
        }

        private CreateDayPlanCommands dayPlans = new SimpleCreateDayPlanCommands();

        public CreateDayPlanCommands getDayPlans()
        {
            return this.dayPlans;
        }

    }

    public static abstract class AbstractMergePatchMonthPlan extends AbstractCreateOrMergePatchMonthPlan implements MergePatchMonthPlan
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

        private DayPlanCommands dayPlanCommands = new SimpleDayPlanCommands();

        public DayPlanCommands getDayPlanCommands()
        {
            return this.dayPlanCommands;
        }

    }

    public static class SimpleCreateMonthPlan extends AbstractCreateMonthPlan
    {
    }

    public static class SimpleMergePatchMonthPlan extends AbstractMergePatchMonthPlan
    {
    }

	public static class SimpleRemoveMonthPlan extends AbstractMonthPlanCommand implements RemoveMonthPlan
	{
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_REMOVE;
        }
	}

    public static class SimpleCreateDayPlanCommands implements CreateDayPlanCommands
    {
        private List<DayPlanCommand.CreateDayPlan> innerCommands = new ArrayList<DayPlanCommand.CreateDayPlan>();

        public void add(DayPlanCommand.CreateDayPlan c)
        {
            innerCommands.add(c);
        }

        public void remove(DayPlanCommand.CreateDayPlan c)
        {
            innerCommands.remove(c);
        }

        public void clear()
        {
            innerCommands.clear();
        }

        @Override
        public Iterator<DayPlanCommand.CreateDayPlan> iterator()
        {
            return innerCommands.iterator();
        }
    }

    public static class SimpleDayPlanCommands implements DayPlanCommands
    {
        private List<DayPlanCommand> innerCommands = new ArrayList<DayPlanCommand>();

        public void add(DayPlanCommand c)
        {
            innerCommands.add(c);
        }

        public void remove(DayPlanCommand c)
        {
            innerCommands.remove(c);
        }

        public void clear()
        {
            innerCommands.clear();
        }

        @Override
        public Iterator<DayPlanCommand> iterator()
        {
            return innerCommands.iterator();
        }
    }


}

