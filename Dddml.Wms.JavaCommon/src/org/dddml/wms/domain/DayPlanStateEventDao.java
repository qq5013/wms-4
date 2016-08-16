package org.dddml.wms.domain;

import java.util.Date;

public interface DayPlanStateEventDao
{
    void save(DayPlanStateEvent e);

    Iterable<DayPlanStateEvent> findByMonthPlanStateEventId(MonthPlanStateEventId monthPlanStateEventId);

}

