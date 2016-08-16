package org.dddml.wms.domain;

import java.util.List;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface DayPlanMvoAggregate
{
    DayPlanMvoState getState();

    List<Event> getChanges();

    void create(DayPlanMvoCommand.CreateDayPlanMvo c);

    void mergePatch(DayPlanMvoCommand.MergePatchDayPlanMvo c);

    void delete(DayPlanMvoCommand.DeleteDayPlanMvo c);

    void throwOnInvalidStateTransition(Command c);
}

