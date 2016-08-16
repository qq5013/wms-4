package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.domain.Command;

public interface PersonCommand extends Command
{
    PersonalName getPersonalName();

    void setPersonalName(PersonalName personalName);

    Long getVersion();

    void setVersion(Long version);


    interface CreateOrMergePatchPerson extends PersonCommand
    {
        Date getBirthDate();

        void setBirthDate(Date birthDate);

        PersonalName getLoves();

        void setLoves(PersonalName loves);

        Boolean getActive();

        void setActive(Boolean active);

    }

    interface CreatePerson extends CreateOrMergePatchPerson
    {
        CreateYearPlanCommands getYearPlans();

        YearPlanCommand.CreateYearPlan newCreateYearPlan();

    }

    interface MergePatchPerson extends CreateOrMergePatchPerson
    {
        Boolean getIsPropertyBirthDateRemoved();

        void setIsPropertyBirthDateRemoved(Boolean removed);

        Boolean getIsPropertyLovesRemoved();

        void setIsPropertyLovesRemoved(Boolean removed);

        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);

        YearPlanCommands getYearPlanCommands();

        YearPlanCommand.CreateYearPlan newCreateYearPlan();

        YearPlanCommand.MergePatchYearPlan newMergePatchYearPlan();

        YearPlanCommand.RemoveYearPlan newRemoveYearPlan();

    }

	interface DeletePerson extends PersonCommand
	{
	}

    interface CreateYearPlanCommands extends Iterable<YearPlanCommand.CreateYearPlan>
    {
        void add(YearPlanCommand.CreateYearPlan c);

        void remove(YearPlanCommand.CreateYearPlan c);

        void clear();
    }

    interface YearPlanCommands extends Iterable<YearPlanCommand>
    {
        void add(YearPlanCommand c);

        void remove(YearPlanCommand c);

        void clear();
    }

}

