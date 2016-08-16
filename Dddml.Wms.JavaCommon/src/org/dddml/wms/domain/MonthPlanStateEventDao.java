package org.dddml.wms.domain;

import java.util.Date;

public interface MonthPlanStateEventDao
{
    void save(MonthPlanStateEvent e);

    Iterable<MonthPlanStateEvent> findByYearPlanStateEventId(YearPlanStateEventId yearPlanStateEventId);

}

