package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.domain.Command;

public interface MonthPlanCommand extends Command
{
    Integer getMonth();

    void setMonth(Integer month);

    PersonalName getPersonalName();

    void setPersonalName(PersonalName personalName);

    Integer getYear();

    void setYear(Integer year);


    interface CreateOrMergePatchMonthPlan extends MonthPlanCommand
    {
        String getDescription();

        void setDescription(String description);

        Boolean getActive();

        void setActive(Boolean active);

    }

    interface CreateMonthPlan extends CreateOrMergePatchMonthPlan
    {
        CreateDayPlanCommands getDayPlans();

        DayPlanCommand.CreateDayPlan newCreateDayPlan();

    }

    interface MergePatchMonthPlan extends CreateOrMergePatchMonthPlan
    {
        Boolean getIsPropertyDescriptionRemoved();

        void setIsPropertyDescriptionRemoved(Boolean removed);

        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);

        DayPlanCommands getDayPlanCommands();

        DayPlanCommand.CreateDayPlan newCreateDayPlan();

        DayPlanCommand.MergePatchDayPlan newMergePatchDayPlan();

        DayPlanCommand.RemoveDayPlan newRemoveDayPlan();

    }

	interface RemoveMonthPlan extends MonthPlanCommand
	{
	}

    interface CreateDayPlanCommands extends Iterable<DayPlanCommand.CreateDayPlan>
    {
        void add(DayPlanCommand.CreateDayPlan c);

        void remove(DayPlanCommand.CreateDayPlan c);

        void clear();
    }

    interface DayPlanCommands extends Iterable<DayPlanCommand>
    {
        void add(DayPlanCommand c);

        void remove(DayPlanCommand c);

        void clear();
    }

}

