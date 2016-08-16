package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.domain.Command;

public interface DayPlanCommand extends Command
{
    Integer getDay();

    void setDay(Integer day);

    PersonalName getPersonalName();

    void setPersonalName(PersonalName personalName);

    Integer getYear();

    void setYear(Integer year);

    Integer getMonth();

    void setMonth(Integer month);


    interface CreateOrMergePatchDayPlan extends DayPlanCommand
    {
        String getDescription();

        void setDescription(String description);

        Boolean getActive();

        void setActive(Boolean active);

    }

    interface CreateDayPlan extends CreateOrMergePatchDayPlan
    {
    }

    interface MergePatchDayPlan extends CreateOrMergePatchDayPlan
    {
        Boolean getIsPropertyDescriptionRemoved();

        void setIsPropertyDescriptionRemoved(Boolean removed);

        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);

    }

	interface RemoveDayPlan extends DayPlanCommand
	{
	}

}

