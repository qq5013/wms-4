package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.domain.Command;

public interface YearPlanCommand extends Command
{
    Integer getYear();

    void setYear(Integer year);

    PersonalName getPersonalName();

    void setPersonalName(PersonalName personalName);


    interface CreateOrMergePatchYearPlan extends YearPlanCommand
    {
        String getDescription();

        void setDescription(String description);

        Boolean getActive();

        void setActive(Boolean active);

    }

    interface CreateYearPlan extends CreateOrMergePatchYearPlan
    {
        CreateMonthPlanCommands getMonthPlans();

        MonthPlanCommand.CreateMonthPlan newCreateMonthPlan();

    }

    interface MergePatchYearPlan extends CreateOrMergePatchYearPlan
    {
        Boolean getIsPropertyDescriptionRemoved();

        void setIsPropertyDescriptionRemoved(Boolean removed);

        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);

        MonthPlanCommands getMonthPlanCommands();

        MonthPlanCommand.CreateMonthPlan newCreateMonthPlan();

        MonthPlanCommand.MergePatchMonthPlan newMergePatchMonthPlan();

        MonthPlanCommand.RemoveMonthPlan newRemoveMonthPlan();

    }

	interface RemoveYearPlan extends YearPlanCommand
	{
	}

    interface CreateMonthPlanCommands extends Iterable<MonthPlanCommand.CreateMonthPlan>
    {
        void add(MonthPlanCommand.CreateMonthPlan c);

        void remove(MonthPlanCommand.CreateMonthPlan c);

        void clear();
    }

    interface MonthPlanCommands extends Iterable<MonthPlanCommand>
    {
        void add(MonthPlanCommand c);

        void remove(MonthPlanCommand c);

        void clear();
    }

}

