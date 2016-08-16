package org.dddml.wms.domain;

import java.util.List;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface YearPlanMvoAggregate
{
    YearPlanMvoState getState();

    List<Event> getChanges();

    void create(YearPlanMvoCommand.CreateYearPlanMvo c);

    void mergePatch(YearPlanMvoCommand.MergePatchYearPlanMvo c);

    void delete(YearPlanMvoCommand.DeleteYearPlanMvo c);

    void throwOnInvalidStateTransition(Command c);
}

