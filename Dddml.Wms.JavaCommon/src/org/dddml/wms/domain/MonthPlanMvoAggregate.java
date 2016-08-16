package org.dddml.wms.domain;

import java.util.List;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface MonthPlanMvoAggregate
{
    MonthPlanMvoState getState();

    List<Event> getChanges();

    void create(MonthPlanMvoCommand.CreateMonthPlanMvo c);

    void mergePatch(MonthPlanMvoCommand.MergePatchMonthPlanMvo c);

    void delete(MonthPlanMvoCommand.DeleteMonthPlanMvo c);

    void throwOnInvalidStateTransition(Command c);
}

