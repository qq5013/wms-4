package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.domain.AbstractCommand;

public abstract class AbstractYearPlanCommand extends AbstractCommand implements YearPlanCommand
{
    private Integer year;

    public Integer getYear()
    {
        return this.year;
    }

    public void setYear(Integer year)
    {
        this.year = year;
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


    public static abstract class AbstractCreateOrMergePatchYearPlan extends AbstractYearPlanCommand implements CreateOrMergePatchYearPlan
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

        public MonthPlanCommand.CreateMonthPlan newCreateMonthPlan()
        {
            AbstractMonthPlanCommand.SimpleCreateMonthPlan c = new AbstractMonthPlanCommand.SimpleCreateMonthPlan();
            c.setPersonalName(this.getPersonalName());

            c.setYear(this.getYear());

            return c;
        }

        public MonthPlanCommand.MergePatchMonthPlan newMergePatchMonthPlan()
        {
            AbstractMonthPlanCommand.SimpleMergePatchMonthPlan c = new AbstractMonthPlanCommand.SimpleMergePatchMonthPlan();
            c.setPersonalName(this.getPersonalName());

            c.setYear(this.getYear());

            return c;
        }

        public MonthPlanCommand.RemoveMonthPlan newRemoveMonthPlan()
        {
            AbstractMonthPlanCommand.SimpleRemoveMonthPlan c = new AbstractMonthPlanCommand.SimpleRemoveMonthPlan();
            c.setPersonalName(this.getPersonalName());

            c.setYear(this.getYear());

            return c;
        }

    }

    public static abstract class AbstractCreateYearPlan extends AbstractCreateOrMergePatchYearPlan implements CreateYearPlan
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_CREATE;
        }

        private CreateMonthPlanCommands monthPlans = new SimpleCreateMonthPlanCommands();

        public CreateMonthPlanCommands getMonthPlans()
        {
            return this.monthPlans;
        }

    }

    public static abstract class AbstractMergePatchYearPlan extends AbstractCreateOrMergePatchYearPlan implements MergePatchYearPlan
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

        private MonthPlanCommands monthPlanCommands = new SimpleMonthPlanCommands();

        public MonthPlanCommands getMonthPlanCommands()
        {
            return this.monthPlanCommands;
        }

    }

    public static class SimpleCreateYearPlan extends AbstractCreateYearPlan
    {
    }

    public static class SimpleMergePatchYearPlan extends AbstractMergePatchYearPlan
    {
    }

	public static class SimpleRemoveYearPlan extends AbstractYearPlanCommand implements RemoveYearPlan
	{
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_REMOVE;
        }
	}

    public static class SimpleCreateMonthPlanCommands implements CreateMonthPlanCommands
    {
        private List<MonthPlanCommand.CreateMonthPlan> innerCommands = new ArrayList<MonthPlanCommand.CreateMonthPlan>();

        public void add(MonthPlanCommand.CreateMonthPlan c)
        {
            innerCommands.add(c);
        }

        public void remove(MonthPlanCommand.CreateMonthPlan c)
        {
            innerCommands.remove(c);
        }

        public void clear()
        {
            innerCommands.clear();
        }

        @Override
        public Iterator<MonthPlanCommand.CreateMonthPlan> iterator()
        {
            return innerCommands.iterator();
        }
    }

    public static class SimpleMonthPlanCommands implements MonthPlanCommands
    {
        private List<MonthPlanCommand> innerCommands = new ArrayList<MonthPlanCommand>();

        public void add(MonthPlanCommand c)
        {
            innerCommands.add(c);
        }

        public void remove(MonthPlanCommand c)
        {
            innerCommands.remove(c);
        }

        public void clear()
        {
            innerCommands.clear();
        }

        @Override
        public Iterator<MonthPlanCommand> iterator()
        {
            return innerCommands.iterator();
        }
    }


}

