package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.domain.AbstractCommand;

public abstract class AbstractPersonCommand extends AbstractCommand implements PersonCommand
{
    private PersonalName personalName;

    public PersonalName getPersonalName()
    {
        return this.personalName;
    }

    public void setPersonalName(PersonalName personalName)
    {
        this.personalName = personalName;
    }

    private Long version;

    public Long getVersion()
    {
        return this.version;
    }

    public void setVersion(Long version)
    {
        this.version = version;
    }


    public static abstract class AbstractCreateOrMergePatchPerson extends AbstractPersonCommand implements CreateOrMergePatchPerson
    {
        private Date birthDate;

        public Date getBirthDate()
        {
            return this.birthDate;
        }

        public void setBirthDate(Date birthDate)
        {
            this.birthDate = birthDate;
        }

        private PersonalName loves;

        public PersonalName getLoves()
        {
            return this.loves;
        }

        public void setLoves(PersonalName loves)
        {
            this.loves = loves;
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

        public YearPlanCommand.CreateYearPlan newCreateYearPlan()
        {
            AbstractYearPlanCommand.SimpleCreateYearPlan c = new AbstractYearPlanCommand.SimpleCreateYearPlan();
            c.setPersonalName(this.getPersonalName());

            return c;
        }

        public YearPlanCommand.MergePatchYearPlan newMergePatchYearPlan()
        {
            AbstractYearPlanCommand.SimpleMergePatchYearPlan c = new AbstractYearPlanCommand.SimpleMergePatchYearPlan();
            c.setPersonalName(this.getPersonalName());

            return c;
        }

        public YearPlanCommand.RemoveYearPlan newRemoveYearPlan()
        {
            AbstractYearPlanCommand.SimpleRemoveYearPlan c = new AbstractYearPlanCommand.SimpleRemoveYearPlan();
            c.setPersonalName(this.getPersonalName());

            return c;
        }

    }

    public static abstract class AbstractCreatePerson extends AbstractCreateOrMergePatchPerson implements CreatePerson
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_CREATE;
        }

        private CreateYearPlanCommands yearPlans = new SimpleCreateYearPlanCommands();

        public CreateYearPlanCommands getYearPlans()
        {
            return this.yearPlans;
        }

    }

    public static abstract class AbstractMergePatchPerson extends AbstractCreateOrMergePatchPerson implements MergePatchPerson
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_MERGE_PATCH;
        }

        private Boolean isPropertyBirthDateRemoved;

        public Boolean getIsPropertyBirthDateRemoved()
        {
            return this.isPropertyBirthDateRemoved;
        }

        public void setIsPropertyBirthDateRemoved(Boolean removed)
        {
            this.isPropertyBirthDateRemoved = removed;
        }

        private Boolean isPropertyLovesRemoved;

        public Boolean getIsPropertyLovesRemoved()
        {
            return this.isPropertyLovesRemoved;
        }

        public void setIsPropertyLovesRemoved(Boolean removed)
        {
            this.isPropertyLovesRemoved = removed;
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

        private YearPlanCommands yearPlanCommands = new SimpleYearPlanCommands();

        public YearPlanCommands getYearPlanCommands()
        {
            return this.yearPlanCommands;
        }

    }

    public static class SimpleCreatePerson extends AbstractCreatePerson
    {
    }

    public static class SimpleMergePatchPerson extends AbstractMergePatchPerson
    {
    }

	public static class SimpleDeletePerson extends AbstractPersonCommand implements DeletePerson
	{
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_DELETE;
        }
	}

    public static class SimpleCreateYearPlanCommands implements CreateYearPlanCommands
    {
        private List<YearPlanCommand.CreateYearPlan> innerCommands = new ArrayList<YearPlanCommand.CreateYearPlan>();

        public void add(YearPlanCommand.CreateYearPlan c)
        {
            innerCommands.add(c);
        }

        public void remove(YearPlanCommand.CreateYearPlan c)
        {
            innerCommands.remove(c);
        }

        public void clear()
        {
            innerCommands.clear();
        }

        @Override
        public Iterator<YearPlanCommand.CreateYearPlan> iterator()
        {
            return innerCommands.iterator();
        }
    }

    public static class SimpleYearPlanCommands implements YearPlanCommands
    {
        private List<YearPlanCommand> innerCommands = new ArrayList<YearPlanCommand>();

        public void add(YearPlanCommand c)
        {
            innerCommands.add(c);
        }

        public void remove(YearPlanCommand c)
        {
            innerCommands.remove(c);
        }

        public void clear()
        {
            innerCommands.clear();
        }

        @Override
        public Iterator<YearPlanCommand> iterator()
        {
            return innerCommands.iterator();
        }
    }


}

